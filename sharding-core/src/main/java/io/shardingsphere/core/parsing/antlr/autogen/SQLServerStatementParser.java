// Generated from io/shardingsphere/core/parsing/antlr/autogen/SQLServerStatement.g4 by ANTLR 4.7.1
package io.shardingsphere.core.parsing.antlr.autogen;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLServerStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ABORT_AFTER_WAIT=2, ACTION=3, ALGORITHM=4, ALLOW_PAGE_LOCKS=5, 
		ALLOW_ROW_LOCKS=6, ALL_SPARSE_COLUMNS=7, ASYMMETRIC=8, AUTHORIZATION=9, 
		AUTO=10, BEGIN=11, BLOCKERS=12, BUCKET_COUNT=13, CAST=14, CERTIFICATE=15, 
		CLUSTERED=16, COLLATE=17, COLUMNSTORE=18, COLUMNSTORE_ARCHIVE=19, COLUMN_ENCRYPTION_KEY=20, 
		COLUMN_SET=21, COMPRESSION_DELAY=22, CONTENT=23, CONVERT=24, CREDENTIAL=25, 
		DATABASE=26, DATABASE_DEAULT=27, DATA_COMPRESSION=28, DATA_CONSISTENCY_CHECK=29, 
		DAYS=30, DEFAULT_DATABASE=31, DELAYED_DURABILITY=32, DENY=33, DETERMINISTIC=34, 
		DISTRIBUTION=35, DOCUMENT=36, DROP_EXISTING=37, DURABILITY=38, DW=39, 
		ENCRYPTED=40, ENCRYPTION_TYPE=41, END=42, EXTERNAL=43, FILESTREAM=44, 
		FILESTREAM_ON=45, FILETABLE=46, FILETABLE_COLLATE_FILENAME=47, FILETABLE_DIRECTORY=48, 
		FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME=49, FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME=50, 
		FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME=51, FILLFACTOR=52, FILTER_PREDICATE=53, 
		FOLLOWING=54, HASH=55, HASHED=56, HEAP=57, HIDDEN_=58, HISTORY_RETENTION_PERIOD=59, 
		HISTORY_TABLE=60, IDENTITY=61, IF=62, IGNORE_DUP_KEY=63, IMPLICIT_TRANSACTIONS=64, 
		INBOUND=65, INFINITE=66, LEFT=67, LEFT_BRACKET=68, LOCK_ESCALATION=69, 
		LOGIN=70, MARK=71, MASKED=72, MAX=73, MAXDOP=74, MAX_DURATION=75, MEMBER=76, 
		MEMORY_OPTIMIZED=77, MIGRATION_STATE=78, MINUTES=79, MONTH=80, MONTHS=81, 
		MOVE=82, MUST_CHANGE=83, NAME=84, NOCHECK=85, NONCLUSTERED=86, NONE=87, 
		OBJECT=88, OFF=89, OLD_PASSWORD=90, ONLINE=91, OUTBOUND=92, OVER=93, PAD_INDEX=94, 
		PAGE=95, PARTITIONS=96, PAUSED=97, PERIOD=98, PERSISTED=99, PRECEDING=100, 
		PROVIDER=101, RANDOMIZED=102, RANGE=103, REBUILD=104, REMOTE_DATA_ARCHIVE=105, 
		REPEATABLE=106, REPLICATE=107, REPLICATION=108, RESUMABLE=109, RIGHT=110, 
		RIGHT_BRACKET=111, ROUND_ROBIN=112, ROWGUIDCOL=113, SAVE=114, SCHEMA=115, 
		SCHEMA_AND_DATA=116, SCHEMA_ONLY=117, SELF=118, SNAPSHOT=119, SORT_IN_TEMPDB=120, 
		SPARSE=121, STATISTICS_INCREMENTAL=122, STATISTICS_NORECOMPUTE=123, SWITCH=124, 
		SYSTEM_TIME=125, SYSTEM_VERSIONING=126, TEXTIMAGE_ON=127, TRAN=128, TRANCOUNT=129, 
		TRIGGER=130, UNBOUNDED=131, UNCOMMITTED=132, UNLOCK=133, UPDATE=134, VALUES=135, 
		WAIT_AT_LOW_PRIORITY=136, WEEK=137, WEEKS=138, WINDOWS=139, WITHOUT=140, 
		YEARS=141, ZONE=142, AND_=143, OR_=144, NOT_=145, UNARY_BIT_COMPLEMENT=146, 
		BIT_INCLUSIVE_OR=147, BIT_AND=148, SIGNED_LEFT_SHIFT=149, SIGNED_RIGHT_SHIFT=150, 
		BIT_EXCLUSIVE_OR=151, MOD_=152, COLON=153, PLUS=154, MINUS=155, ASTERISK=156, 
		SLASH=157, BACKSLASH=158, DOT=159, DOT_ASTERISK=160, SAFE_EQ=161, EQ=162, 
		EQ_=163, NEQ=164, NEQ_=165, GT=166, GTE=167, LT=168, LTE=169, POUND_=170, 
		LP_=171, RP_=172, LBE_=173, RBE_=174, LBT_=175, RBT_=176, COMMA=177, DQ_=178, 
		SQ_=179, BQ_=180, UL_=181, QUESTION=182, AT_=183, SEMI_=184, ALL=185, 
		AND=186, ANY=187, ASC=188, BETWEEN=189, BINARY=190, BIT_NUM=191, BY=192, 
		DATE=193, DESC=194, DISTINCT=195, ESCAPE=196, EXISTS=197, FALSE=198, FROM=199, 
		GROUP=200, HAVING=201, IN=202, IS=203, KEY=204, LIKE=205, LIMIT=206, MOD=207, 
		NOT=208, NULL=209, OFFSET=210, OR=211, ORDER=212, PARTITION=213, PRIMARY=214, 
		REGEXP=215, ROLLUP=216, ROW=217, SET=218, SOUNDS=219, TIME=220, TIMESTAMP=221, 
		TRUE=222, UNION=223, UNKNOWN=224, WHERE=225, WITH=226, XOR=227, ADD=228, 
		ALTER=229, ALWAYS=230, AS=231, CASCADE=232, CHECK=233, COLUMN=234, COMMIT=235, 
		COMMITTED=236, CONSTRAINT=237, CREATE=238, CURRENT=239, DAY=240, DEFAULT=241, 
		DELETE=242, DISABLE=243, DROP=244, ENABLE=245, FOR=246, FOREIGN=247, FUNCTION=248, 
		GENERATED=249, GRANT=250, INDEX=251, ISOLATION=252, LEVEL=253, NO=254, 
		ON=255, OPTION=256, PASSWORD=257, PRIVILEGES=258, READ=259, REFERENCES=260, 
		REVOKE=261, ROLE=262, ROLLBACK=263, ROWS=264, SERIALIZABLE=265, START=266, 
		TABLE=267, TO=268, TRANSACTION=269, TRUNCATE=270, UNIQUE=271, USER=272, 
		WORK=273, YEAR=274, ID=275, BLOCK_COMMENT=276, SL_COMMENT=277, STRING=278, 
		NUMBER=279, INT_=280, EXP=281, HEX_DIGIT=282, WS=283;
	public static final int
		RULE_execute = 0, RULE_dataType = 1, RULE_privateExprOfDb = 2, RULE_atTimeZoneExpr = 3, 
		RULE_castExpr = 4, RULE_convertExpr = 5, RULE_windowedFunction = 6, RULE_overClause = 7, 
		RULE_partitionByClause = 8, RULE_orderByClause = 9, RULE_orderByExpr = 10, 
		RULE_rowRangeClause = 11, RULE_windowFrameExtent = 12, RULE_windowFrameBetween = 13, 
		RULE_windowFrameBound = 14, RULE_windowFramePreceding = 15, RULE_windowFrameFollowing = 16, 
		RULE_columnList = 17, RULE_columnNameWithSort = 18, RULE_indexOption = 19, 
		RULE_compressionOption = 20, RULE_eqTime = 21, RULE_eqOnOffOption = 22, 
		RULE_eqKey = 23, RULE_eqOnOff = 24, RULE_onPartitionClause = 25, RULE_partitionExpressions = 26, 
		RULE_partitionExpression = 27, RULE_numberRange = 28, RULE_lowPriorityLockWait = 29, 
		RULE_onLowPriorLockWait = 30, RULE_schemaName = 31, RULE_databaseName = 32, 
		RULE_domainName = 33, RULE_tableName = 34, RULE_columnName = 35, RULE_sequenceName = 36, 
		RULE_tablespaceName = 37, RULE_collationName = 38, RULE_indexName = 39, 
		RULE_alias = 40, RULE_cteName = 41, RULE_parserName = 42, RULE_extensionName = 43, 
		RULE_rowName = 44, RULE_opclass = 45, RULE_fileGroup = 46, RULE_groupName = 47, 
		RULE_constraintName = 48, RULE_keyName = 49, RULE_typeName = 50, RULE_xmlSchemaCollection = 51, 
		RULE_columnSetName = 52, RULE_directoryName = 53, RULE_triggerName = 54, 
		RULE_routineName = 55, RULE_roleName = 56, RULE_partitionName = 57, RULE_rewriteRuleName = 58, 
		RULE_ownerName = 59, RULE_userName = 60, RULE_serverName = 61, RULE_dataTypeLength = 62, 
		RULE_primaryKey = 63, RULE_matchNone = 64, RULE_ids = 65, RULE_idList = 66, 
		RULE_rangeClause = 67, RULE_rangeItem = 68, RULE_schemaNames = 69, RULE_databaseNames = 70, 
		RULE_domainNames = 71, RULE_tableList = 72, RULE_tableNames = 73, RULE_columnNamesWithParen = 74, 
		RULE_columnNames = 75, RULE_sequenceNames = 76, RULE_tablespaceNames = 77, 
		RULE_indexNames = 78, RULE_indexList = 79, RULE_typeNames = 80, RULE_rowNames = 81, 
		RULE_roleNames = 82, RULE_userNames = 83, RULE_serverNames = 84, RULE_bitExprs = 85, 
		RULE_exprs = 86, RULE_exprsWithParen = 87, RULE_expr = 88, RULE_exprRecursive = 89, 
		RULE_booleanPrimary = 90, RULE_comparisonOperator = 91, RULE_predicate = 92, 
		RULE_bitExpr = 93, RULE_simpleExpr = 94, RULE_functionCall = 95, RULE_distinct = 96, 
		RULE_intervalExpr = 97, RULE_caseExpress = 98, RULE_variable = 99, RULE_liter = 100, 
		RULE_question = 101, RULE_number = 102, RULE_string = 103, RULE_subquery = 104, 
		RULE_collateClause = 105, RULE_orderByItem = 106, RULE_createIndex = 107, 
		RULE_alterIndex = 108, RULE_dropIndex = 109, RULE_createTable = 110, RULE_createTableHeader = 111, 
		RULE_createTableBody = 112, RULE_createTableDefinition = 113, RULE_periodClause = 114, 
		RULE_tableIndex = 115, RULE_tableOption = 116, RULE_tableOptOption = 117, 
		RULE_distributionOption = 118, RULE_dataWareHouseTableOption = 119, RULE_dataWareHousePartitionOption = 120, 
		RULE_tableStretchOptions = 121, RULE_columnDefinition = 122, RULE_columnDefinitionOption = 123, 
		RULE_columnConstraint = 124, RULE_primaryKeyConstraint = 125, RULE_diskTablePrimaryKeyConstraintOption = 126, 
		RULE_columnForeignKeyConstraint = 127, RULE_foreignKeyOnAction = 128, 
		RULE_foreignKeyOn = 129, RULE_memoryTablePrimaryKeyConstraintOption = 130, 
		RULE_hashWithBucket = 131, RULE_withBucket = 132, RULE_primaryKeyWithClause = 133, 
		RULE_primaryKeyOnClause = 134, RULE_onSchemaColumn = 135, RULE_onFileGroup = 136, 
		RULE_onString = 137, RULE_checkConstraint = 138, RULE_columnIndex = 139, 
		RULE_indexOnClause = 140, RULE_onDefault = 141, RULE_tableConstraint = 142, 
		RULE_tablePrimaryConstraint = 143, RULE_primaryKeyUnique = 144, RULE_diskTablePrimaryConstraintOption = 145, 
		RULE_memoryTablePrimaryConstraintOption = 146, RULE_tableForeignKeyConstraint = 147, 
		RULE_computedColumnDefinition = 148, RULE_columnSetDefinition = 149, RULE_alterTable = 150, 
		RULE_alterTableOp = 151, RULE_alterColumn = 152, RULE_modifyColumn = 153, 
		RULE_alterColumnOp = 154, RULE_addColumn = 155, RULE_alterColumnAddOption = 156, 
		RULE_constraintForColumn = 157, RULE_columnNameWithSortsWithParen = 158, 
		RULE_columnNameGeneratedClause = 159, RULE_columnNameGenerated = 160, 
		RULE_alterDrop = 161, RULE_alterTableDropConstraint = 162, RULE_dropConstraintName = 163, 
		RULE_dropConstraintWithClause = 164, RULE_dropConstraintOption = 165, 
		RULE_dropColumn = 166, RULE_dropIndexDef = 167, RULE_alterCheckConstraint = 168, 
		RULE_alterTrigger = 169, RULE_alterSwitch = 170, RULE_alterSet = 171, 
		RULE_setFileStreamClause = 172, RULE_setSystemVersionClause = 173, RULE_alterSetOnClause = 174, 
		RULE_indexWithName = 175, RULE_indexNonClusterClause = 176, RULE_indexClusterClause = 177, 
		RULE_dropTable = 178, RULE_truncateTable = 179, RULE_setTransaction = 180, 
		RULE_commit = 181, RULE_rollback = 182, RULE_savepoint = 183, RULE_beginTransaction = 184, 
		RULE_setAutoCommit = 185, RULE_autoCommitValue = 186, RULE_grant = 187, 
		RULE_grantGeneral = 188, RULE_generalPrisOn = 189, RULE_permissionOnColumns = 190, 
		RULE_permission = 191, RULE_grantDW = 192, RULE_classType = 193, RULE_revoke = 194, 
		RULE_revokeGeneral = 195, RULE_revokeDW = 196, RULE_permissionWithClass = 197, 
		RULE_deny = 198, RULE_createUser = 199, RULE_createUserBody1 = 200, RULE_createUserBody2 = 201, 
		RULE_windowsPrincipal = 202, RULE_createUserBody3 = 203, RULE_createUserBody4 = 204, 
		RULE_optionsLists = 205, RULE_optionsList = 206, RULE_alterUser = 207, 
		RULE_dropUser = 208, RULE_createLogin = 209, RULE_loginOptionList = 210, 
		RULE_sources = 211, RULE_alterLogin = 212, RULE_loginOption = 213, RULE_passwordOption = 214, 
		RULE_credentialOption = 215, RULE_dropLogin = 216, RULE_createRole = 217, 
		RULE_alterRole = 218, RULE_dropRole = 219;
	public static final String[] ruleNames = {
		"execute", "dataType", "privateExprOfDb", "atTimeZoneExpr", "castExpr", 
		"convertExpr", "windowedFunction", "overClause", "partitionByClause", 
		"orderByClause", "orderByExpr", "rowRangeClause", "windowFrameExtent", 
		"windowFrameBetween", "windowFrameBound", "windowFramePreceding", "windowFrameFollowing", 
		"columnList", "columnNameWithSort", "indexOption", "compressionOption", 
		"eqTime", "eqOnOffOption", "eqKey", "eqOnOff", "onPartitionClause", "partitionExpressions", 
		"partitionExpression", "numberRange", "lowPriorityLockWait", "onLowPriorLockWait", 
		"schemaName", "databaseName", "domainName", "tableName", "columnName", 
		"sequenceName", "tablespaceName", "collationName", "indexName", "alias", 
		"cteName", "parserName", "extensionName", "rowName", "opclass", "fileGroup", 
		"groupName", "constraintName", "keyName", "typeName", "xmlSchemaCollection", 
		"columnSetName", "directoryName", "triggerName", "routineName", "roleName", 
		"partitionName", "rewriteRuleName", "ownerName", "userName", "serverName", 
		"dataTypeLength", "primaryKey", "matchNone", "ids", "idList", "rangeClause", 
		"rangeItem", "schemaNames", "databaseNames", "domainNames", "tableList", 
		"tableNames", "columnNamesWithParen", "columnNames", "sequenceNames", 
		"tablespaceNames", "indexNames", "indexList", "typeNames", "rowNames", 
		"roleNames", "userNames", "serverNames", "bitExprs", "exprs", "exprsWithParen", 
		"expr", "exprRecursive", "booleanPrimary", "comparisonOperator", "predicate", 
		"bitExpr", "simpleExpr", "functionCall", "distinct", "intervalExpr", "caseExpress", 
		"variable", "liter", "question", "number", "string", "subquery", "collateClause", 
		"orderByItem", "createIndex", "alterIndex", "dropIndex", "createTable", 
		"createTableHeader", "createTableBody", "createTableDefinition", "periodClause", 
		"tableIndex", "tableOption", "tableOptOption", "distributionOption", "dataWareHouseTableOption", 
		"dataWareHousePartitionOption", "tableStretchOptions", "columnDefinition", 
		"columnDefinitionOption", "columnConstraint", "primaryKeyConstraint", 
		"diskTablePrimaryKeyConstraintOption", "columnForeignKeyConstraint", "foreignKeyOnAction", 
		"foreignKeyOn", "memoryTablePrimaryKeyConstraintOption", "hashWithBucket", 
		"withBucket", "primaryKeyWithClause", "primaryKeyOnClause", "onSchemaColumn", 
		"onFileGroup", "onString", "checkConstraint", "columnIndex", "indexOnClause", 
		"onDefault", "tableConstraint", "tablePrimaryConstraint", "primaryKeyUnique", 
		"diskTablePrimaryConstraintOption", "memoryTablePrimaryConstraintOption", 
		"tableForeignKeyConstraint", "computedColumnDefinition", "columnSetDefinition", 
		"alterTable", "alterTableOp", "alterColumn", "modifyColumn", "alterColumnOp", 
		"addColumn", "alterColumnAddOption", "constraintForColumn", "columnNameWithSortsWithParen", 
		"columnNameGeneratedClause", "columnNameGenerated", "alterDrop", "alterTableDropConstraint", 
		"dropConstraintName", "dropConstraintWithClause", "dropConstraintOption", 
		"dropColumn", "dropIndexDef", "alterCheckConstraint", "alterTrigger", 
		"alterSwitch", "alterSet", "setFileStreamClause", "setSystemVersionClause", 
		"alterSetOnClause", "indexWithName", "indexNonClusterClause", "indexClusterClause", 
		"dropTable", "truncateTable", "setTransaction", "commit", "rollback", 
		"savepoint", "beginTransaction", "setAutoCommit", "autoCommitValue", "grant", 
		"grantGeneral", "generalPrisOn", "permissionOnColumns", "permission", 
		"grantDW", "classType", "revoke", "revokeGeneral", "revokeDW", "permissionWithClass", 
		"deny", "createUser", "createUserBody1", "createUserBody2", "windowsPrincipal", 
		"createUserBody3", "createUserBody4", "optionsLists", "optionsList", "alterUser", 
		"dropUser", "createLogin", "loginOptionList", "sources", "alterLogin", 
		"loginOption", "passwordOption", "credentialOption", "dropLogin", "createRole", 
		"alterRole", "dropRole"
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
		null, null, null, null, "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", 
		"'>>'", "'^'", "'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", 
		"'.*'", "'<=>'", "'=='", "'='", "'!='", "'<>'", "'>'", "'>='", "'<'", 
		"'<='", "'#'", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", "'\"'", 
		"'''", "'`'", "'_'", "'?'", "'@'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ABORT_AFTER_WAIT", "ACTION", "ALGORITHM", "ALLOW_PAGE_LOCKS", 
		"ALLOW_ROW_LOCKS", "ALL_SPARSE_COLUMNS", "ASYMMETRIC", "AUTHORIZATION", 
		"AUTO", "BEGIN", "BLOCKERS", "BUCKET_COUNT", "CAST", "CERTIFICATE", "CLUSTERED", 
		"COLLATE", "COLUMNSTORE", "COLUMNSTORE_ARCHIVE", "COLUMN_ENCRYPTION_KEY", 
		"COLUMN_SET", "COMPRESSION_DELAY", "CONTENT", "CONVERT", "CREDENTIAL", 
		"DATABASE", "DATABASE_DEAULT", "DATA_COMPRESSION", "DATA_CONSISTENCY_CHECK", 
		"DAYS", "DEFAULT_DATABASE", "DELAYED_DURABILITY", "DENY", "DETERMINISTIC", 
		"DISTRIBUTION", "DOCUMENT", "DROP_EXISTING", "DURABILITY", "DW", "ENCRYPTED", 
		"ENCRYPTION_TYPE", "END", "EXTERNAL", "FILESTREAM", "FILESTREAM_ON", "FILETABLE", 
		"FILETABLE_COLLATE_FILENAME", "FILETABLE_DIRECTORY", "FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME", 
		"FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME", "FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME", 
		"FILLFACTOR", "FILTER_PREDICATE", "FOLLOWING", "HASH", "HASHED", "HEAP", 
		"HIDDEN_", "HISTORY_RETENTION_PERIOD", "HISTORY_TABLE", "IDENTITY", "IF", 
		"IGNORE_DUP_KEY", "IMPLICIT_TRANSACTIONS", "INBOUND", "INFINITE", "LEFT", 
		"LEFT_BRACKET", "LOCK_ESCALATION", "LOGIN", "MARK", "MASKED", "MAX", "MAXDOP", 
		"MAX_DURATION", "MEMBER", "MEMORY_OPTIMIZED", "MIGRATION_STATE", "MINUTES", 
		"MONTH", "MONTHS", "MOVE", "MUST_CHANGE", "NAME", "NOCHECK", "NONCLUSTERED", 
		"NONE", "OBJECT", "OFF", "OLD_PASSWORD", "ONLINE", "OUTBOUND", "OVER", 
		"PAD_INDEX", "PAGE", "PARTITIONS", "PAUSED", "PERIOD", "PERSISTED", "PRECEDING", 
		"PROVIDER", "RANDOMIZED", "RANGE", "REBUILD", "REMOTE_DATA_ARCHIVE", "REPEATABLE", 
		"REPLICATE", "REPLICATION", "RESUMABLE", "RIGHT", "RIGHT_BRACKET", "ROUND_ROBIN", 
		"ROWGUIDCOL", "SAVE", "SCHEMA", "SCHEMA_AND_DATA", "SCHEMA_ONLY", "SELF", 
		"SNAPSHOT", "SORT_IN_TEMPDB", "SPARSE", "STATISTICS_INCREMENTAL", "STATISTICS_NORECOMPUTE", 
		"SWITCH", "SYSTEM_TIME", "SYSTEM_VERSIONING", "TEXTIMAGE_ON", "TRAN", 
		"TRANCOUNT", "TRIGGER", "UNBOUNDED", "UNCOMMITTED", "UNLOCK", "UPDATE", 
		"VALUES", "WAIT_AT_LOW_PRIORITY", "WEEK", "WEEKS", "WINDOWS", "WITHOUT", 
		"YEARS", "ZONE", "AND_", "OR_", "NOT_", "UNARY_BIT_COMPLEMENT", "BIT_INCLUSIVE_OR", 
		"BIT_AND", "SIGNED_LEFT_SHIFT", "SIGNED_RIGHT_SHIFT", "BIT_EXCLUSIVE_OR", 
		"MOD_", "COLON", "PLUS", "MINUS", "ASTERISK", "SLASH", "BACKSLASH", "DOT", 
		"DOT_ASTERISK", "SAFE_EQ", "EQ", "EQ_", "NEQ", "NEQ_", "GT", "GTE", "LT", 
		"LTE", "POUND_", "LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA", 
		"DQ_", "SQ_", "BQ_", "UL_", "QUESTION", "AT_", "SEMI_", "ALL", "AND", 
		"ANY", "ASC", "BETWEEN", "BINARY", "BIT_NUM", "BY", "DATE", "DESC", "DISTINCT", 
		"ESCAPE", "EXISTS", "FALSE", "FROM", "GROUP", "HAVING", "IN", "IS", "KEY", 
		"LIKE", "LIMIT", "MOD", "NOT", "NULL", "OFFSET", "OR", "ORDER", "PARTITION", 
		"PRIMARY", "REGEXP", "ROLLUP", "ROW", "SET", "SOUNDS", "TIME", "TIMESTAMP", 
		"TRUE", "UNION", "UNKNOWN", "WHERE", "WITH", "XOR", "ADD", "ALTER", "ALWAYS", 
		"AS", "CASCADE", "CHECK", "COLUMN", "COMMIT", "COMMITTED", "CONSTRAINT", 
		"CREATE", "CURRENT", "DAY", "DEFAULT", "DELETE", "DISABLE", "DROP", "ENABLE", 
		"FOR", "FOREIGN", "FUNCTION", "GENERATED", "GRANT", "INDEX", "ISOLATION", 
		"LEVEL", "NO", "ON", "OPTION", "PASSWORD", "PRIVILEGES", "READ", "REFERENCES", 
		"REVOKE", "ROLE", "ROLLBACK", "ROWS", "SERIALIZABLE", "START", "TABLE", 
		"TO", "TRANSACTION", "TRUNCATE", "UNIQUE", "USER", "WORK", "YEAR", "ID", 
		"BLOCK_COMMENT", "SL_COMMENT", "STRING", "NUMBER", "INT_", "EXP", "HEX_DIGIT", 
		"WS"
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
	public String getGrammarFileName() { return "SQLServerStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLServerStatementParser(TokenStream input) {
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
		public SetAutoCommitContext setAutoCommit() {
			return getRuleContext(SetAutoCommitContext.class,0);
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
		public RevokeContext revoke() {
			return getRuleContext(RevokeContext.class,0);
		}
		public DenyContext deny() {
			return getRuleContext(DenyContext.class,0);
		}
		public CreateUserContext createUser() {
			return getRuleContext(CreateUserContext.class,0);
		}
		public AlterUserContext alterUser() {
			return getRuleContext(AlterUserContext.class,0);
		}
		public DropUserContext dropUser() {
			return getRuleContext(DropUserContext.class,0);
		}
		public CreateLoginContext createLogin() {
			return getRuleContext(CreateLoginContext.class,0);
		}
		public AlterLoginContext alterLogin() {
			return getRuleContext(AlterLoginContext.class,0);
		}
		public DropLoginContext dropLogin() {
			return getRuleContext(DropLoginContext.class,0);
		}
		public CreateRoleContext createRole() {
			return getRuleContext(CreateRoleContext.class,0);
		}
		public AlterRoleContext alterRole() {
			return getRuleContext(AlterRoleContext.class,0);
		}
		public DropRoleContext dropRole() {
			return getRuleContext(DropRoleContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(SQLServerStatementParser.SEMI_, 0); }
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
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(440);
				createIndex();
				}
				break;
			case 2:
				{
				setState(441);
				alterIndex();
				}
				break;
			case 3:
				{
				setState(442);
				dropIndex();
				}
				break;
			case 4:
				{
				setState(443);
				createTable();
				}
				break;
			case 5:
				{
				setState(444);
				alterTable();
				}
				break;
			case 6:
				{
				setState(445);
				dropTable();
				}
				break;
			case 7:
				{
				setState(446);
				truncateTable();
				}
				break;
			case 8:
				{
				setState(447);
				beginTransaction();
				}
				break;
			case 9:
				{
				setState(448);
				setAutoCommit();
				}
				break;
			case 10:
				{
				setState(449);
				commit();
				}
				break;
			case 11:
				{
				setState(450);
				rollback();
				}
				break;
			case 12:
				{
				setState(451);
				setTransaction();
				}
				break;
			case 13:
				{
				setState(452);
				savepoint();
				}
				break;
			case 14:
				{
				setState(453);
				grant();
				}
				break;
			case 15:
				{
				setState(454);
				revoke();
				}
				break;
			case 16:
				{
				setState(455);
				deny();
				}
				break;
			case 17:
				{
				setState(456);
				createUser();
				}
				break;
			case 18:
				{
				setState(457);
				alterUser();
				}
				break;
			case 19:
				{
				setState(458);
				dropUser();
				}
				break;
			case 20:
				{
				setState(459);
				createLogin();
				}
				break;
			case 21:
				{
				setState(460);
				alterLogin();
				}
				break;
			case 22:
				{
				setState(461);
				dropLogin();
				}
				break;
			case 23:
				{
				setState(462);
				createRole();
				}
				break;
			case 24:
				{
				setState(463);
				alterRole();
				}
				break;
			case 25:
				{
				setState(464);
				dropRole();
				}
				break;
			}
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(467);
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

	public static class DataTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode MAX() { return getToken(SQLServerStatementParser.MAX, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public XmlSchemaCollectionContext xmlSchemaCollection() {
			return getRuleContext(XmlSchemaCollectionContext.class,0);
		}
		public TerminalNode CONTENT() { return getToken(SQLServerStatementParser.CONTENT, 0); }
		public TerminalNode DOCUMENT() { return getToken(SQLServerStatementParser.DOCUMENT, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			typeName();
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(471);
				dataTypeLength();
				}
				break;
			case 2:
				{
				setState(472);
				match(LP_);
				setState(473);
				match(MAX);
				setState(474);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(475);
				match(LP_);
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTENT || _la==DOCUMENT) {
					{
					setState(476);
					_la = _input.LA(1);
					if ( !(_la==CONTENT || _la==DOCUMENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(479);
				xmlSchemaCollection();
				setState(480);
				match(RP_);
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

	public static class PrivateExprOfDbContext extends ParserRuleContext {
		public WindowedFunctionContext windowedFunction() {
			return getRuleContext(WindowedFunctionContext.class,0);
		}
		public AtTimeZoneExprContext atTimeZoneExpr() {
			return getRuleContext(AtTimeZoneExprContext.class,0);
		}
		public CastExprContext castExpr() {
			return getRuleContext(CastExprContext.class,0);
		}
		public ConvertExprContext convertExpr() {
			return getRuleContext(ConvertExprContext.class,0);
		}
		public PrivateExprOfDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateExprOfDb; }
	}

	public final PrivateExprOfDbContext privateExprOfDb() throws RecognitionException {
		PrivateExprOfDbContext _localctx = new PrivateExprOfDbContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_privateExprOfDb);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				windowedFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				atTimeZoneExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				castExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				convertExpr();
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

	public static class AtTimeZoneExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode STRING() { return getToken(SQLServerStatementParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(SQLServerStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SQLServerStatementParser.ZONE, 0); }
		public AtTimeZoneExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atTimeZoneExpr; }
	}

	public final AtTimeZoneExprContext atTimeZoneExpr() throws RecognitionException {
		AtTimeZoneExprContext _localctx = new AtTimeZoneExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atTimeZoneExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(ID);
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(491);
				match(WITH);
				setState(492);
				match(TIME);
				setState(493);
				match(ZONE);
				}
			}

			setState(496);
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

	public static class CastExprContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(SQLServerStatementParser.CAST, 0); }
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public TerminalNode NUMBER() { return getToken(SQLServerStatementParser.NUMBER, 0); }
		public CastExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpr; }
	}

	public final CastExprContext castExpr() throws RecognitionException {
		CastExprContext _localctx = new CastExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_castExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(CAST);
			setState(499);
			match(LP_);
			setState(500);
			expr(0);
			setState(501);
			match(AS);
			setState(502);
			dataType();
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(503);
				match(LP_);
				setState(504);
				match(NUMBER);
				setState(505);
				match(RP_);
				}
			}

			setState(508);
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

	public static class ConvertExprContext extends ParserRuleContext {
		public TerminalNode CONVERT() { return getToken(SQLServerStatementParser.CONVERT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(SQLServerStatementParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SQLServerStatementParser.NUMBER, i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public ConvertExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertExpr; }
	}

	public final ConvertExprContext convertExpr() throws RecognitionException {
		ConvertExprContext _localctx = new ConvertExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_convertExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(CONVERT);
			{
			setState(511);
			dataType();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(512);
				match(LP_);
				setState(513);
				match(NUMBER);
				setState(514);
				match(RP_);
				}
			}

			setState(517);
			match(COMMA);
			setState(518);
			expr(0);
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(519);
				match(COMMA);
				setState(520);
				match(NUMBER);
				}
				break;
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

	public static class WindowedFunctionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public OverClauseContext overClause() {
			return getRuleContext(OverClauseContext.class,0);
		}
		public WindowedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowedFunction; }
	}

	public final WindowedFunctionContext windowedFunction() throws RecognitionException {
		WindowedFunctionContext _localctx = new WindowedFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_windowedFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			functionCall();
			setState(524);
			overClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverClauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(SQLServerStatementParser.OVER, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public PartitionByClauseContext partitionByClause() {
			return getRuleContext(PartitionByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public RowRangeClauseContext rowRangeClause() {
			return getRuleContext(RowRangeClauseContext.class,0);
		}
		public OverClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overClause; }
	}

	public final OverClauseContext overClause() throws RecognitionException {
		OverClauseContext _localctx = new OverClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_overClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(OVER);
			setState(527);
			match(LP_);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(528);
				partitionByClause();
				}
			}

			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(531);
				orderByClause();
				}
			}

			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(534);
				rowRangeClause();
				}
			}

			setState(537);
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

	public static class PartitionByClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SQLServerStatementParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(SQLServerStatementParser.BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public PartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionByClause; }
	}

	public final PartitionByClauseContext partitionByClause() throws RecognitionException {
		PartitionByClauseContext _localctx = new PartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_partitionByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(PARTITION);
			setState(540);
			match(BY);
			setState(541);
			expr(0);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(542);
				match(COMMA);
				setState(543);
				expr(0);
				}
				}
				setState(548);
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SQLServerStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLServerStatementParser.BY, 0); }
		public List<OrderByExprContext> orderByExpr() {
			return getRuleContexts(OrderByExprContext.class);
		}
		public OrderByExprContext orderByExpr(int i) {
			return getRuleContext(OrderByExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(ORDER);
			setState(550);
			match(BY);
			setState(551);
			orderByExpr();
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(552);
				match(COMMA);
				setState(553);
				orderByExpr();
				}
				}
				setState(558);
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

	public static class OrderByExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(SQLServerStatementParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLServerStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLServerStatementParser.DESC, 0); }
		public OrderByExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByExpr; }
	}

	public final OrderByExprContext orderByExpr() throws RecognitionException {
		OrderByExprContext _localctx = new OrderByExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_orderByExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			expr(0);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(560);
				match(COLLATE);
				setState(561);
				collationName();
				}
			}

			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(564);
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

	public static class RowRangeClauseContext extends ParserRuleContext {
		public WindowFrameExtentContext windowFrameExtent() {
			return getRuleContext(WindowFrameExtentContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SQLServerStatementParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(SQLServerStatementParser.RANGE, 0); }
		public RowRangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowRangeClause; }
	}

	public final RowRangeClauseContext rowRangeClause() throws RecognitionException {
		RowRangeClauseContext _localctx = new RowRangeClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rowRangeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_la = _input.LA(1);
			if ( !(_la==RANGE || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(568);
			windowFrameExtent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameExtentContext extends ParserRuleContext {
		public WindowFramePrecedingContext windowFramePreceding() {
			return getRuleContext(WindowFramePrecedingContext.class,0);
		}
		public WindowFrameBetweenContext windowFrameBetween() {
			return getRuleContext(WindowFrameBetweenContext.class,0);
		}
		public WindowFrameExtentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameExtent; }
	}

	public final WindowFrameExtentContext windowFrameExtent() throws RecognitionException {
		WindowFrameExtentContext _localctx = new WindowFrameExtentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_windowFrameExtent);
		try {
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
			case CURRENT:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				windowFramePreceding();
				}
				break;
			case BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				windowFrameBetween();
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

	public static class WindowFrameBetweenContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(SQLServerStatementParser.BETWEEN, 0); }
		public List<WindowFrameBoundContext> windowFrameBound() {
			return getRuleContexts(WindowFrameBoundContext.class);
		}
		public WindowFrameBoundContext windowFrameBound(int i) {
			return getRuleContext(WindowFrameBoundContext.class,i);
		}
		public TerminalNode AND() { return getToken(SQLServerStatementParser.AND, 0); }
		public WindowFrameBetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameBetween; }
	}

	public final WindowFrameBetweenContext windowFrameBetween() throws RecognitionException {
		WindowFrameBetweenContext _localctx = new WindowFrameBetweenContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_windowFrameBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(BETWEEN);
			setState(575);
			windowFrameBound();
			setState(576);
			match(AND);
			setState(577);
			windowFrameBound();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameBoundContext extends ParserRuleContext {
		public WindowFramePrecedingContext windowFramePreceding() {
			return getRuleContext(WindowFramePrecedingContext.class,0);
		}
		public WindowFrameFollowingContext windowFrameFollowing() {
			return getRuleContext(WindowFrameFollowingContext.class,0);
		}
		public WindowFrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameBound; }
	}

	public final WindowFrameBoundContext windowFrameBound() throws RecognitionException {
		WindowFrameBoundContext _localctx = new WindowFrameBoundContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_windowFrameBound);
		try {
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				windowFramePreceding();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				windowFrameFollowing();
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

	public static class WindowFramePrecedingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(SQLServerStatementParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SQLServerStatementParser.PRECEDING, 0); }
		public TerminalNode NUMBER() { return getToken(SQLServerStatementParser.NUMBER, 0); }
		public TerminalNode CURRENT() { return getToken(SQLServerStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public WindowFramePrecedingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFramePreceding; }
	}

	public final WindowFramePrecedingContext windowFramePreceding() throws RecognitionException {
		WindowFramePrecedingContext _localctx = new WindowFramePrecedingContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_windowFramePreceding);
		try {
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				match(UNBOUNDED);
				setState(584);
				match(PRECEDING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(NUMBER);
				setState(586);
				match(PRECEDING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(587);
				match(CURRENT);
				setState(588);
				match(ROW);
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

	public static class WindowFrameFollowingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(SQLServerStatementParser.UNBOUNDED, 0); }
		public TerminalNode FOLLOWING() { return getToken(SQLServerStatementParser.FOLLOWING, 0); }
		public TerminalNode NUMBER() { return getToken(SQLServerStatementParser.NUMBER, 0); }
		public TerminalNode CURRENT() { return getToken(SQLServerStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public WindowFrameFollowingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameFollowing; }
	}

	public final WindowFrameFollowingContext windowFrameFollowing() throws RecognitionException {
		WindowFrameFollowingContext _localctx = new WindowFrameFollowingContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_windowFrameFollowing);
		try {
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(UNBOUNDED);
				setState(592);
				match(FOLLOWING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				match(NUMBER);
				setState(594);
				match(FOLLOWING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
				match(CURRENT);
				setState(596);
				match(ROW);
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

	public static class ColumnListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ColumnNameWithSortContext> columnNameWithSort() {
			return getRuleContexts(ColumnNameWithSortContext.class);
		}
		public ColumnNameWithSortContext columnNameWithSort(int i) {
			return getRuleContext(ColumnNameWithSortContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(LP_);
			setState(600);
			columnNameWithSort();
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(601);
				match(COMMA);
				setState(602);
				columnNameWithSort();
				}
				}
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(608);
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

	public static class ColumnNameWithSortContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLServerStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLServerStatementParser.DESC, 0); }
		public ColumnNameWithSortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameWithSort; }
	}

	public final ColumnNameWithSortContext columnNameWithSort() throws RecognitionException {
		ColumnNameWithSortContext _localctx = new ColumnNameWithSortContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_columnNameWithSort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			columnName();
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(611);
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

	public static class IndexOptionContext extends ParserRuleContext {
		public TerminalNode FILLFACTOR() { return getToken(SQLServerStatementParser.FILLFACTOR, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER() { return getToken(SQLServerStatementParser.NUMBER, 0); }
		public EqOnOffOptionContext eqOnOffOption() {
			return getRuleContext(EqOnOffOptionContext.class,0);
		}
		public EqTimeContext eqTime() {
			return getRuleContext(EqTimeContext.class,0);
		}
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public TerminalNode MAX_DURATION() { return getToken(SQLServerStatementParser.MAX_DURATION, 0); }
		public TerminalNode MAXDOP() { return getToken(SQLServerStatementParser.MAXDOP, 0); }
		public CompressionOptionContext compressionOption() {
			return getRuleContext(CompressionOptionContext.class,0);
		}
		public OnPartitionClauseContext onPartitionClause() {
			return getRuleContext(OnPartitionClauseContext.class,0);
		}
		public IndexOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOption; }
	}

	public final IndexOptionContext indexOption() throws RecognitionException {
		IndexOptionContext _localctx = new IndexOptionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_indexOption);
		int _la;
		try {
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				match(FILLFACTOR);
				setState(615);
				match(EQ_);
				setState(616);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				eqOnOffOption();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(618);
				_la = _input.LA(1);
				if ( !(_la==COMPRESSION_DELAY || _la==MAX_DURATION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(619);
				eqTime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(620);
				match(MAXDOP);
				setState(621);
				match(EQ_);
				setState(622);
				match(NUMBER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(623);
				compressionOption();
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(624);
					onPartitionClause();
					}
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

	public static class CompressionOptionContext extends ParserRuleContext {
		public TerminalNode DATA_COMPRESSION() { return getToken(SQLServerStatementParser.DATA_COMPRESSION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NONE() { return getToken(SQLServerStatementParser.NONE, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode PAGE() { return getToken(SQLServerStatementParser.PAGE, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode COLUMNSTORE_ARCHIVE() { return getToken(SQLServerStatementParser.COLUMNSTORE_ARCHIVE, 0); }
		public CompressionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compressionOption; }
	}

	public final CompressionOptionContext compressionOption() throws RecognitionException {
		CompressionOptionContext _localctx = new CompressionOptionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compressionOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(DATA_COMPRESSION);
			setState(630);
			match(EQ_);
			setState(631);
			_la = _input.LA(1);
			if ( !(_la==COLUMNSTORE || _la==COLUMNSTORE_ARCHIVE || _la==NONE || _la==PAGE || _la==ROW) ) {
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

	public static class EqTimeContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER() { return getToken(SQLServerStatementParser.NUMBER, 0); }
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public EqTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqTime; }
	}

	public final EqTimeContext eqTime() throws RecognitionException {
		EqTimeContext _localctx = new EqTimeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_eqTime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(EQ_);
			setState(634);
			match(NUMBER);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUTES) {
				{
				setState(635);
				match(MINUTES);
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

	public static class EqOnOffOptionContext extends ParserRuleContext {
		public EqKeyContext eqKey() {
			return getRuleContext(EqKeyContext.class,0);
		}
		public EqOnOffContext eqOnOff() {
			return getRuleContext(EqOnOffContext.class,0);
		}
		public EqOnOffOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOnOffOption; }
	}

	public final EqOnOffOptionContext eqOnOffOption() throws RecognitionException {
		EqOnOffOptionContext _localctx = new EqOnOffOptionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_eqOnOffOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			eqKey();
			setState(639);
			eqOnOff();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqKeyContext extends ParserRuleContext {
		public TerminalNode PAD_INDEX() { return getToken(SQLServerStatementParser.PAD_INDEX, 0); }
		public TerminalNode SORT_IN_TEMPDB() { return getToken(SQLServerStatementParser.SORT_IN_TEMPDB, 0); }
		public TerminalNode IGNORE_DUP_KEY() { return getToken(SQLServerStatementParser.IGNORE_DUP_KEY, 0); }
		public TerminalNode STATISTICS_NORECOMPUTE() { return getToken(SQLServerStatementParser.STATISTICS_NORECOMPUTE, 0); }
		public TerminalNode STATISTICS_INCREMENTAL() { return getToken(SQLServerStatementParser.STATISTICS_INCREMENTAL, 0); }
		public TerminalNode DROP_EXISTING() { return getToken(SQLServerStatementParser.DROP_EXISTING, 0); }
		public TerminalNode ONLINE() { return getToken(SQLServerStatementParser.ONLINE, 0); }
		public TerminalNode RESUMABLE() { return getToken(SQLServerStatementParser.RESUMABLE, 0); }
		public TerminalNode ALLOW_ROW_LOCKS() { return getToken(SQLServerStatementParser.ALLOW_ROW_LOCKS, 0); }
		public TerminalNode ALLOW_PAGE_LOCKS() { return getToken(SQLServerStatementParser.ALLOW_PAGE_LOCKS, 0); }
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public EqKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqKey; }
	}

	public final EqKeyContext eqKey() throws RecognitionException {
		EqKeyContext _localctx = new EqKeyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eqKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOW_PAGE_LOCKS) | (1L << ALLOW_ROW_LOCKS) | (1L << COMPRESSION_DELAY) | (1L << DROP_EXISTING) | (1L << IGNORE_DUP_KEY))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (ONLINE - 91)) | (1L << (PAD_INDEX - 91)) | (1L << (RESUMABLE - 91)) | (1L << (SORT_IN_TEMPDB - 91)) | (1L << (STATISTICS_INCREMENTAL - 91)) | (1L << (STATISTICS_NORECOMPUTE - 91)))) != 0)) ) {
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

	public static class EqOnOffContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public EqOnOffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOnOff; }
	}

	public final EqOnOffContext eqOnOff() throws RecognitionException {
		EqOnOffContext _localctx = new EqOnOffContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_eqOnOff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(EQ_);
			setState(644);
			_la = _input.LA(1);
			if ( !(_la==OFF || _la==ON) ) {
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

	public static class OnPartitionClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode PARTITIONS() { return getToken(SQLServerStatementParser.PARTITIONS, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public PartitionExpressionsContext partitionExpressions() {
			return getRuleContext(PartitionExpressionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public OnPartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onPartitionClause; }
	}

	public final OnPartitionClauseContext onPartitionClause() throws RecognitionException {
		OnPartitionClauseContext _localctx = new OnPartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_onPartitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(ON);
			setState(647);
			match(PARTITIONS);
			setState(648);
			match(LP_);
			setState(649);
			partitionExpressions();
			setState(650);
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

	public static class PartitionExpressionsContext extends ParserRuleContext {
		public List<PartitionExpressionContext> partitionExpression() {
			return getRuleContexts(PartitionExpressionContext.class);
		}
		public PartitionExpressionContext partitionExpression(int i) {
			return getRuleContext(PartitionExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public PartitionExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionExpressions; }
	}

	public final PartitionExpressionsContext partitionExpressions() throws RecognitionException {
		PartitionExpressionsContext _localctx = new PartitionExpressionsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_partitionExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			partitionExpression();
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(653);
				match(COMMA);
				setState(654);
				partitionExpression();
				}
				}
				setState(659);
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

	public static class PartitionExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SQLServerStatementParser.NUMBER, 0); }
		public NumberRangeContext numberRange() {
			return getRuleContext(NumberRangeContext.class,0);
		}
		public PartitionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionExpression; }
	}

	public final PartitionExpressionContext partitionExpression() throws RecognitionException {
		PartitionExpressionContext _localctx = new PartitionExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_partitionExpression);
		try {
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				numberRange();
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

	public static class NumberRangeContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SQLServerStatementParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SQLServerStatementParser.NUMBER, i);
		}
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public NumberRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberRange; }
	}

	public final NumberRangeContext numberRange() throws RecognitionException {
		NumberRangeContext _localctx = new NumberRangeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_numberRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(NUMBER);
			setState(665);
			match(TO);
			setState(666);
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

	public static class LowPriorityLockWaitContext extends ParserRuleContext {
		public TerminalNode WAIT_AT_LOW_PRIORITY() { return getToken(SQLServerStatementParser.WAIT_AT_LOW_PRIORITY, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode MAX_DURATION() { return getToken(SQLServerStatementParser.MAX_DURATION, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TerminalNode NUMBER() { return getToken(SQLServerStatementParser.NUMBER, 0); }
		public TerminalNode COMMA() { return getToken(SQLServerStatementParser.COMMA, 0); }
		public TerminalNode ABORT_AFTER_WAIT() { return getToken(SQLServerStatementParser.ABORT_AFTER_WAIT, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode NONE() { return getToken(SQLServerStatementParser.NONE, 0); }
		public TerminalNode SELF() { return getToken(SQLServerStatementParser.SELF, 0); }
		public TerminalNode BLOCKERS() { return getToken(SQLServerStatementParser.BLOCKERS, 0); }
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public LowPriorityLockWaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowPriorityLockWait; }
	}

	public final LowPriorityLockWaitContext lowPriorityLockWait() throws RecognitionException {
		LowPriorityLockWaitContext _localctx = new LowPriorityLockWaitContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_lowPriorityLockWait);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(WAIT_AT_LOW_PRIORITY);
			setState(669);
			match(LP_);
			setState(670);
			match(MAX_DURATION);
			setState(671);
			match(EQ_);
			setState(672);
			match(NUMBER);
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUTES) {
				{
				setState(673);
				match(MINUTES);
				}
			}

			setState(676);
			match(COMMA);
			setState(677);
			match(ABORT_AFTER_WAIT);
			setState(678);
			match(EQ_);
			setState(679);
			_la = _input.LA(1);
			if ( !(_la==BLOCKERS || _la==NONE || _la==SELF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(680);
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

	public static class OnLowPriorLockWaitContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public LowPriorityLockWaitContext lowPriorityLockWait() {
			return getRuleContext(LowPriorityLockWaitContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public OnLowPriorLockWaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onLowPriorLockWait; }
	}

	public final OnLowPriorLockWaitContext onLowPriorLockWait() throws RecognitionException {
		OnLowPriorLockWaitContext _localctx = new OnLowPriorLockWaitContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_onLowPriorLockWait);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(ON);
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(683);
				match(LP_);
				setState(684);
				lowPriorityLockWait();
				setState(685);
				match(RP_);
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

	public static class SchemaNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public DomainNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainName; }
	}

	public final DomainNameContext domainName() throws RecognitionException {
		DomainNameContext _localctx = new DomainNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_domainName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public SequenceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceName; }
	}

	public final SequenceNameContext sequenceName() throws RecognitionException {
		SequenceNameContext _localctx = new SequenceNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sequenceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TablespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceName; }
	}

	public final TablespaceNameContext tablespaceName() throws RecognitionException {
		TablespaceNameContext _localctx = new TablespaceNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tablespaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
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
		public TerminalNode STRING() { return getToken(SQLServerStatementParser.STRING, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_collationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public CteNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteName; }
	}

	public final CteNameContext cteName() throws RecognitionException {
		CteNameContext _localctx = new CteNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_cteName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public ParserNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserName; }
	}

	public final ParserNameContext parserName() throws RecognitionException {
		ParserNameContext _localctx = new ParserNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_parserName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public ExtensionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionName; }
	}

	public final ExtensionNameContext extensionName() throws RecognitionException {
		ExtensionNameContext _localctx = new ExtensionNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_extensionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public RowNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowName; }
	}

	public final RowNameContext rowName() throws RecognitionException {
		RowNameContext _localctx = new RowNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_rowName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public OpclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opclass; }
	}

	public final OpclassContext opclass() throws RecognitionException {
		OpclassContext _localctx = new OpclassContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_opclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public FileGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileGroup; }
	}

	public final FileGroupContext fileGroup() throws RecognitionException {
		FileGroupContext _localctx = new FileGroupContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fileGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public GroupNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupName; }
	}

	public final GroupNameContext groupName() throws RecognitionException {
		GroupNameContext _localctx = new GroupNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_groupName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public ConstraintNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintName; }
	}

	public final ConstraintNameContext constraintName() throws RecognitionException {
		ConstraintNameContext _localctx = new ConstraintNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_constraintName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public KeyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyName; }
	}

	public final KeyNameContext keyName() throws RecognitionException {
		KeyNameContext _localctx = new KeyNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_keyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public XmlSchemaCollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlSchemaCollection; }
	}

	public final XmlSchemaCollectionContext xmlSchemaCollection() throws RecognitionException {
		XmlSchemaCollectionContext _localctx = new XmlSchemaCollectionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_xmlSchemaCollection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public ColumnSetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSetName; }
	}

	public final ColumnSetNameContext columnSetName() throws RecognitionException {
		ColumnSetNameContext _localctx = new ColumnSetNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_columnSetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public DirectoryNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directoryName; }
	}

	public final DirectoryNameContext directoryName() throws RecognitionException {
		DirectoryNameContext _localctx = new DirectoryNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_directoryName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TriggerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerName; }
	}

	public final TriggerNameContext triggerName() throws RecognitionException {
		TriggerNameContext _localctx = new TriggerNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_triggerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public RoutineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineName; }
	}

	public final RoutineNameContext routineName() throws RecognitionException {
		RoutineNameContext _localctx = new RoutineNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_routineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
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
		public TerminalNode STRING() { return getToken(SQLServerStatementParser.STRING, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public RoleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleName; }
	}

	public final RoleNameContext roleName() throws RecognitionException {
		RoleNameContext _localctx = new RoleNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_roleName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public PartitionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionName; }
	}

	public final PartitionNameContext partitionName() throws RecognitionException {
		PartitionNameContext _localctx = new PartitionNameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_partitionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public RewriteRuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewriteRuleName; }
	}

	public final RewriteRuleNameContext rewriteRuleName() throws RecognitionException {
		RewriteRuleNameContext _localctx = new RewriteRuleNameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_rewriteRuleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public OwnerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownerName; }
	}

	public final OwnerNameContext ownerName() throws RecognitionException {
		OwnerNameContext _localctx = new OwnerNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ownerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
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
		public TerminalNode STRING() { return getToken(SQLServerStatementParser.STRING, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public UserNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userName; }
	}

	public final UserNameContext userName() throws RecognitionException {
		UserNameContext _localctx = new UserNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_userName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public ServerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverName; }
	}

	public final ServerNameContext serverName() throws RecognitionException {
		ServerNameContext _localctx = new ServerNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_serverName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(SQLServerStatementParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SQLServerStatementParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(SQLServerStatementParser.COMMA, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(LP_);
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(752);
				match(NUMBER);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(753);
					match(COMMA);
					setState(754);
					match(NUMBER);
					}
				}

				}
			}

			setState(759);
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
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(SQLServerStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(761);
				match(PRIMARY);
				}
			}

			setState(764);
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
		enterRule(_localctx, 128, RULE_matchNone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
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
		public List<TerminalNode> ID() { return getTokens(SQLServerStatementParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLServerStatementParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_ids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(ID);
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(769);
				match(COMMA);
				setState(770);
				match(ID);
				}
				}
				setState(775);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_idList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(LP_);
			setState(777);
			ids();
			setState(778);
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
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public TerminalNode OFFSET() { return getToken(SQLServerStatementParser.OFFSET, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_rangeClause);
		int _la;
		try {
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				rangeItem();
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(781);
					match(COMMA);
					setState(782);
					rangeItem();
					}
					}
					setState(787);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(788);
				rangeItem();
				setState(789);
				match(OFFSET);
				setState(790);
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
		enterRule(_localctx, 136, RULE_rangeItem);
		try {
			setState(796);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				number();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
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
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public SchemaNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaNames; }
	}

	public final SchemaNamesContext schemaNames() throws RecognitionException {
		SchemaNamesContext _localctx = new SchemaNamesContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_schemaNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			schemaName();
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(799);
				match(COMMA);
				setState(800);
				schemaName();
				}
				}
				setState(805);
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
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public DatabaseNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseNames; }
	}

	public final DatabaseNamesContext databaseNames() throws RecognitionException {
		DatabaseNamesContext _localctx = new DatabaseNamesContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_databaseNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			databaseName();
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(807);
				match(COMMA);
				setState(808);
				databaseName();
				}
				}
				setState(813);
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
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public DomainNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainNames; }
	}

	public final DomainNamesContext domainNames() throws RecognitionException {
		DomainNamesContext _localctx = new DomainNamesContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_domainNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			domainName();
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(815);
				match(COMMA);
				setState(816);
				domainName();
				}
				}
				setState(821);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableList; }
	}

	public final TableListContext tableList() throws RecognitionException {
		TableListContext _localctx = new TableListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_tableList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(LP_);
			setState(823);
			tableNames();
			setState(824);
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
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			tableName();
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(827);
				match(COMMA);
				setState(828);
				tableName();
				}
				}
				setState(833);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public ColumnNamesWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNamesWithParen; }
	}

	public final ColumnNamesWithParenContext columnNamesWithParen() throws RecognitionException {
		ColumnNamesWithParenContext _localctx = new ColumnNamesWithParenContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_columnNamesWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(LP_);
			setState(835);
			columnNames();
			setState(836);
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
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			columnName();
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(839);
				match(COMMA);
				setState(840);
				columnName();
				}
				}
				setState(845);
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

	public static class SequenceNamesContext extends ParserRuleContext {
		public List<SequenceNameContext> sequenceName() {
			return getRuleContexts(SequenceNameContext.class);
		}
		public SequenceNameContext sequenceName(int i) {
			return getRuleContext(SequenceNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public SequenceNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceNames; }
	}

	public final SequenceNamesContext sequenceNames() throws RecognitionException {
		SequenceNamesContext _localctx = new SequenceNamesContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_sequenceNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			sequenceName();
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(847);
				match(COMMA);
				setState(848);
				sequenceName();
				}
				}
				setState(853);
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
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public TablespaceNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceNames; }
	}

	public final TablespaceNamesContext tablespaceNames() throws RecognitionException {
		TablespaceNamesContext _localctx = new TablespaceNamesContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_tablespaceNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			tablespaceName();
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(855);
				match(COMMA);
				setState(856);
				tablespaceName();
				}
				}
				setState(861);
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
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public IndexNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexNames; }
	}

	public final IndexNamesContext indexNames() throws RecognitionException {
		IndexNamesContext _localctx = new IndexNamesContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_indexNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			indexName();
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(863);
				match(COMMA);
				setState(864);
				indexName();
				}
				}
				setState(869);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public IndexNamesContext indexNames() {
			return getRuleContext(IndexNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public IndexListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexList; }
	}

	public final IndexListContext indexList() throws RecognitionException {
		IndexListContext _localctx = new IndexListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_indexList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(LP_);
			setState(871);
			indexNames();
			setState(872);
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

	public static class TypeNamesContext extends ParserRuleContext {
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public TypeNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNames; }
	}

	public final TypeNamesContext typeNames() throws RecognitionException {
		TypeNamesContext _localctx = new TypeNamesContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_typeNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			typeName();
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(875);
				match(COMMA);
				setState(876);
				typeName();
				}
				}
				setState(881);
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

	public static class RowNamesContext extends ParserRuleContext {
		public List<RowNameContext> rowName() {
			return getRuleContexts(RowNameContext.class);
		}
		public RowNameContext rowName(int i) {
			return getRuleContext(RowNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public RowNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowNames; }
	}

	public final RowNamesContext rowNames() throws RecognitionException {
		RowNamesContext _localctx = new RowNamesContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_rowNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			rowName();
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(883);
				match(COMMA);
				setState(884);
				rowName();
				}
				}
				setState(889);
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
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public RoleNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleNames; }
	}

	public final RoleNamesContext roleNames() throws RecognitionException {
		RoleNamesContext _localctx = new RoleNamesContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_roleNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			roleName();
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(891);
				match(COMMA);
				setState(892);
				roleName();
				}
				}
				setState(897);
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

	public static class UserNamesContext extends ParserRuleContext {
		public List<UserNameContext> userName() {
			return getRuleContexts(UserNameContext.class);
		}
		public UserNameContext userName(int i) {
			return getRuleContext(UserNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public UserNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userNames; }
	}

	public final UserNamesContext userNames() throws RecognitionException {
		UserNamesContext _localctx = new UserNamesContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_userNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			userName();
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(899);
				match(COMMA);
				setState(900);
				userName();
				}
				}
				setState(905);
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
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public ServerNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverNames; }
	}

	public final ServerNamesContext serverNames() throws RecognitionException {
		ServerNamesContext _localctx = new ServerNamesContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_serverNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			serverName();
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(907);
				match(COMMA);
				setState(908);
				serverName();
				}
				}
				setState(913);
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
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public BitExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExprs; }
	}

	public final BitExprsContext bitExprs() throws RecognitionException {
		BitExprsContext _localctx = new BitExprsContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_bitExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			bitExpr(0);
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(915);
				match(COMMA);
				setState(916);
				bitExpr(0);
				}
				}
				setState(921);
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
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			expr(0);
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(923);
				match(COMMA);
				setState(924);
				expr(0);
				}
				}
				setState(929);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public ExprsWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprsWithParen; }
	}

	public final ExprsWithParenContext exprsWithParen() throws RecognitionException {
		ExprsWithParenContext _localctx = new ExprsWithParenContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_exprsWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(LP_);
			setState(931);
			exprs();
			setState(932);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(SQLServerStatementParser.NOT_, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public ExprRecursiveContext exprRecursive() {
			return getRuleContext(ExprRecursiveContext.class,0);
		}
		public TerminalNode AND() { return getToken(SQLServerStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(SQLServerStatementParser.AND_, 0); }
		public TerminalNode XOR() { return getToken(SQLServerStatementParser.XOR, 0); }
		public TerminalNode OR() { return getToken(SQLServerStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(SQLServerStatementParser.OR_, 0); }
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
		int _startState = 176;
		enterRecursionRule(_localctx, 176, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(935);
				match(LP_);
				setState(936);
				expr(0);
				setState(937);
				match(RP_);
				}
				break;
			case 2:
				{
				setState(939);
				match(NOT);
				setState(940);
				expr(6);
				}
				break;
			case 3:
				{
				setState(941);
				match(NOT_);
				setState(942);
				expr(5);
				}
				break;
			case 4:
				{
				setState(943);
				booleanPrimary(0);
				}
				break;
			case 5:
				{
				setState(944);
				exprRecursive();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(964);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(962);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(947);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(948);
						match(AND);
						setState(949);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(950);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(951);
						match(AND_);
						setState(952);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(953);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(954);
						match(XOR);
						setState(955);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(956);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(957);
						match(OR);
						setState(958);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(959);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(960);
						match(OR_);
						setState(961);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(966);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		enterRule(_localctx, 178, RULE_exprRecursive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
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
		public TerminalNode IS() { return getToken(SQLServerStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(SQLServerStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLServerStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SQLServerStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ() { return getToken(SQLServerStatementParser.SAFE_EQ, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
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
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(970);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(990);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(972);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(973);
						match(IS);
						setState(975);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(974);
							match(NOT);
							}
						}

						setState(977);
						_la = _input.LA(1);
						if ( !(((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (FALSE - 198)) | (1L << (NULL - 198)) | (1L << (TRUE - 198)) | (1L << (UNKNOWN - 198)))) != 0)) ) {
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
						setState(978);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(979);
						match(SAFE_EQ);
						setState(980);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(981);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(982);
						comparisonOperator();
						setState(983);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(985);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(986);
						comparisonOperator();
						setState(987);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(988);
						subquery();
						}
						break;
					}
					} 
				}
				setState(994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode GTE() { return getToken(SQLServerStatementParser.GTE, 0); }
		public TerminalNode GT() { return getToken(SQLServerStatementParser.GT, 0); }
		public TerminalNode LTE() { return getToken(SQLServerStatementParser.LTE, 0); }
		public TerminalNode LT() { return getToken(SQLServerStatementParser.LT, 0); }
		public TerminalNode NEQ_() { return getToken(SQLServerStatementParser.NEQ_, 0); }
		public TerminalNode NEQ() { return getToken(SQLServerStatementParser.NEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			_la = _input.LA(1);
			if ( !(((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (EQ_ - 163)) | (1L << (NEQ - 163)) | (1L << (NEQ_ - 163)) | (1L << (GT - 163)) | (1L << (GTE - 163)) | (1L << (LT - 163)) | (1L << (LTE - 163)))) != 0)) ) {
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
		public TerminalNode IN() { return getToken(SQLServerStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public TerminalNode BETWEEN() { return getToken(SQLServerStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SQLServerStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SOUNDS() { return getToken(SQLServerStatementParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(SQLServerStatementParser.LIKE, 0); }
		public List<TerminalNode> ESCAPE() { return getTokens(SQLServerStatementParser.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(SQLServerStatementParser.ESCAPE, i);
		}
		public TerminalNode REGEXP() { return getToken(SQLServerStatementParser.REGEXP, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_predicate);
		int _la;
		try {
			int _alt;
			setState(1055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				bitExpr(0);
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(998);
					match(NOT);
					}
				}

				setState(1001);
				match(IN);
				setState(1002);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				bitExpr(0);
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1005);
					match(NOT);
					}
				}

				setState(1008);
				match(IN);
				setState(1009);
				match(LP_);
				setState(1010);
				simpleExpr(0);
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1011);
					match(COMMA);
					setState(1012);
					simpleExpr(0);
					}
					}
					setState(1017);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1018);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1020);
				bitExpr(0);
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1021);
					match(NOT);
					}
				}

				setState(1024);
				match(BETWEEN);
				setState(1025);
				simpleExpr(0);
				setState(1026);
				match(AND);
				setState(1027);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1029);
				bitExpr(0);
				setState(1030);
				match(SOUNDS);
				setState(1031);
				match(LIKE);
				setState(1032);
				simpleExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1034);
				bitExpr(0);
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1035);
					match(NOT);
					}
				}

				setState(1038);
				match(LIKE);
				setState(1039);
				simpleExpr(0);
				setState(1044);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1040);
						match(ESCAPE);
						setState(1041);
						simpleExpr(0);
						}
						} 
					}
					setState(1046);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1047);
				bitExpr(0);
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1048);
					match(NOT);
					}
				}

				setState(1051);
				match(REGEXP);
				setState(1052);
				simpleExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1054);
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
		public TerminalNode BIT_INCLUSIVE_OR() { return getToken(SQLServerStatementParser.BIT_INCLUSIVE_OR, 0); }
		public TerminalNode BIT_AND() { return getToken(SQLServerStatementParser.BIT_AND, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT() { return getToken(SQLServerStatementParser.SIGNED_LEFT_SHIFT, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT() { return getToken(SQLServerStatementParser.SIGNED_RIGHT_SHIFT, 0); }
		public TerminalNode PLUS() { return getToken(SQLServerStatementParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLServerStatementParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SQLServerStatementParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SQLServerStatementParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(SQLServerStatementParser.MOD, 0); }
		public TerminalNode MOD_() { return getToken(SQLServerStatementParser.MOD_, 0); }
		public TerminalNode BIT_EXCLUSIVE_OR() { return getToken(SQLServerStatementParser.BIT_EXCLUSIVE_OR, 0); }
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
		int _startState = 186;
		enterRecursionRule(_localctx, 186, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1058);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1099);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1060);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1061);
						match(BIT_INCLUSIVE_OR);
						setState(1062);
						bitExpr(15);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1063);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1064);
						match(BIT_AND);
						setState(1065);
						bitExpr(14);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1066);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1067);
						match(SIGNED_LEFT_SHIFT);
						setState(1068);
						bitExpr(13);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1069);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1070);
						match(SIGNED_RIGHT_SHIFT);
						setState(1071);
						bitExpr(12);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1072);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1073);
						match(PLUS);
						setState(1074);
						bitExpr(11);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1075);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1076);
						match(MINUS);
						setState(1077);
						bitExpr(10);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1078);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1079);
						match(ASTERISK);
						setState(1080);
						bitExpr(9);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1081);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1082);
						match(SLASH);
						setState(1083);
						bitExpr(8);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1084);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1085);
						match(MOD);
						setState(1086);
						bitExpr(7);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1087);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1088);
						match(MOD_);
						setState(1089);
						bitExpr(6);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1090);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1091);
						match(BIT_EXCLUSIVE_OR);
						setState(1092);
						bitExpr(5);
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1093);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1094);
						match(PLUS);
						setState(1095);
						intervalExpr();
						}
						break;
					case 13:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1096);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1097);
						match(MINUS);
						setState(1098);
						intervalExpr();
						}
						break;
					}
					} 
				}
				setState(1103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		public TerminalNode PLUS() { return getToken(SQLServerStatementParser.PLUS, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(SQLServerStatementParser.MINUS, 0); }
		public TerminalNode UNARY_BIT_COMPLEMENT() { return getToken(SQLServerStatementParser.UNARY_BIT_COMPLEMENT, 0); }
		public TerminalNode NOT_() { return getToken(SQLServerStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(SQLServerStatementParser.BINARY, 0); }
		public ExprsWithParenContext exprsWithParen() {
			return getRuleContext(ExprsWithParenContext.class,0);
		}
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public CaseExpressContext caseExpress() {
			return getRuleContext(CaseExpressContext.class,0);
		}
		public IntervalExprContext intervalExpr() {
			return getRuleContext(IntervalExprContext.class,0);
		}
		public PrivateExprOfDbContext privateExprOfDb() {
			return getRuleContext(PrivateExprOfDbContext.class,0);
		}
		public TerminalNode AND_() { return getToken(SQLServerStatementParser.AND_, 0); }
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
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_simpleExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(1105);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1106);
				liter();
				}
				break;
			case 3:
				{
				setState(1107);
				columnName();
				}
				break;
			case 4:
				{
				setState(1108);
				variable();
				}
				break;
			case 5:
				{
				setState(1109);
				match(PLUS);
				setState(1110);
				simpleExpr(12);
				}
				break;
			case 6:
				{
				setState(1111);
				match(MINUS);
				setState(1112);
				simpleExpr(11);
				}
				break;
			case 7:
				{
				setState(1113);
				match(UNARY_BIT_COMPLEMENT);
				setState(1114);
				simpleExpr(10);
				}
				break;
			case 8:
				{
				setState(1115);
				match(NOT_);
				setState(1116);
				simpleExpr(9);
				}
				break;
			case 9:
				{
				setState(1117);
				match(BINARY);
				setState(1118);
				simpleExpr(8);
				}
				break;
			case 10:
				{
				setState(1119);
				exprsWithParen();
				}
				break;
			case 11:
				{
				setState(1120);
				match(ROW);
				setState(1121);
				exprsWithParen();
				}
				break;
			case 12:
				{
				setState(1122);
				subquery();
				}
				break;
			case 13:
				{
				setState(1123);
				match(EXISTS);
				setState(1124);
				subquery();
				}
				break;
			case 14:
				{
				setState(1125);
				caseExpress();
				}
				break;
			case 15:
				{
				setState(1126);
				intervalExpr();
				}
				break;
			case 16:
				{
				setState(1127);
				privateExprOfDb();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1130);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1131);
						match(AND_);
						setState(1132);
						simpleExpr(14);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1133);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1134);
						collateClause();
						}
						break;
					}
					} 
				}
				setState(1139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SQLServerStatementParser.ASTERISK, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			match(ID);
			setState(1141);
			match(LP_);
			setState(1143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1142);
				distinct();
				}
			}

			setState(1147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case CAST:
			case CONVERT:
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
			case ID:
			case STRING:
			case NUMBER:
			case HEX_DIGIT:
				{
				setState(1145);
				exprs();
				}
				break;
			case ASTERISK:
				{
				setState(1146);
				match(ASTERISK);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1149);
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
		public TerminalNode DISTINCT() { return getToken(SQLServerStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
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
		enterRule(_localctx, 194, RULE_intervalExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
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
		enterRule(_localctx, 196, RULE_caseExpress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
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
		enterRule(_localctx, 198, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
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
		public TerminalNode TRUE() { return getToken(SQLServerStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLServerStatementParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode LBE_() { return getToken(SQLServerStatementParser.LBE_, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode STRING() { return getToken(SQLServerStatementParser.STRING, 0); }
		public TerminalNode RBE_() { return getToken(SQLServerStatementParser.RBE_, 0); }
		public TerminalNode HEX_DIGIT() { return getToken(SQLServerStatementParser.HEX_DIGIT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode DATE() { return getToken(SQLServerStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SQLServerStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SQLServerStatementParser.TIMESTAMP, 0); }
		public TerminalNode BIT_NUM() { return getToken(SQLServerStatementParser.BIT_NUM, 0); }
		public LiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liter; }
	}

	public final LiterContext liter() throws RecognitionException {
		LiterContext _localctx = new LiterContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_liter);
		int _la;
		try {
			setState(1184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1159);
				question();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1160);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1161);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1162);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1163);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1164);
				match(LBE_);
				setState(1165);
				match(ID);
				setState(1166);
				match(STRING);
				setState(1167);
				match(RBE_);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1168);
				match(HEX_DIGIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1169);
				string();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1170);
				match(ID);
				setState(1171);
				match(STRING);
				setState(1173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(1172);
					collateClause();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1175);
				_la = _input.LA(1);
				if ( !(((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (DATE - 193)) | (1L << (TIME - 193)) | (1L << (TIMESTAMP - 193)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1176);
				match(STRING);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(1177);
					match(ID);
					}
				}

				setState(1180);
				match(BIT_NUM);
				setState(1182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(1181);
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
		public TerminalNode QUESTION() { return getToken(SQLServerStatementParser.QUESTION, 0); }
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
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
		public TerminalNode NUMBER() { return getToken(SQLServerStatementParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
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
		public TerminalNode STRING() { return getToken(SQLServerStatementParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
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
		enterRule(_localctx, 208, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
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

	public static class CollateClauseContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public CollateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause; }
	}

	public final CollateClauseContext collateClause() throws RecognitionException {
		CollateClauseContext _localctx = new CollateClauseContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_collateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
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
		public TerminalNode ASC() { return getToken(SQLServerStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLServerStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(1196);
				columnName();
				}
				break;
			case 2:
				{
				setState(1197);
				number();
				}
				break;
			case 3:
				{
				setState(1198);
				expr(0);
				}
				break;
			}
			setState(1202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1201);
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
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLServerStatementParser.UNIQUE, 0); }
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_createIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			match(CREATE);
			setState(1206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(1205);
				match(UNIQUE);
				}
			}

			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(1208);
				_la = _input.LA(1);
				if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1211);
			match(INDEX);
			setState(1212);
			indexName();
			setState(1213);
			match(ON);
			setState(1214);
			tableName();
			setState(1215);
			columnList();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_alterIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(ALTER);
			setState(1218);
			match(INDEX);
			setState(1221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1219);
				indexName();
				}
				break;
			case ALL:
				{
				setState(1220);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1223);
			match(ON);
			setState(1224);
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

	public static class DropIndexContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_dropIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			match(DROP);
			setState(1227);
			match(INDEX);
			setState(1230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1228);
				match(IF);
				setState(1229);
				match(EXISTS);
				}
			}

			setState(1232);
			indexName();
			setState(1233);
			match(ON);
			setState(1234);
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

	public static class CreateTableContext extends ParserRuleContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateTableBodyContext createTableBody() {
			return getRuleContext(CreateTableBodyContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_createTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			createTableHeader();
			setState(1237);
			createTableBody();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_createTableHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			match(CREATE);
			setState(1240);
			match(TABLE);
			setState(1241);
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

	public static class CreateTableBodyContext extends ParserRuleContext {
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public List<CreateTableDefinitionContext> createTableDefinition() {
			return getRuleContexts(CreateTableDefinitionContext.class);
		}
		public CreateTableDefinitionContext createTableDefinition(int i) {
			return getRuleContext(CreateTableDefinitionContext.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode FILETABLE() { return getToken(SQLServerStatementParser.FILETABLE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public PeriodClauseContext periodClause() {
			return getRuleContext(PeriodClauseContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode TEXTIMAGE_ON() { return getToken(SQLServerStatementParser.TEXTIMAGE_ON, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public List<TableOptionContext> tableOption() {
			return getRuleContexts(TableOptionContext.class);
		}
		public TableOptionContext tableOption(int i) {
			return getRuleContext(TableOptionContext.class,i);
		}
		public List<SchemaNameContext> schemaName() {
			return getRuleContexts(SchemaNameContext.class);
		}
		public SchemaNameContext schemaName(int i) {
			return getRuleContext(SchemaNameContext.class,i);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public List<FileGroupContext> fileGroup() {
			return getRuleContexts(FileGroupContext.class);
		}
		public FileGroupContext fileGroup(int i) {
			return getRuleContext(FileGroupContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SQLServerStatementParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SQLServerStatementParser.STRING, i);
		}
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public CreateTableBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableBody; }
	}

	public final CreateTableBodyContext createTableBody() throws RecognitionException {
		CreateTableBodyContext _localctx = new CreateTableBodyContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_createTableBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1243);
				match(AS);
				setState(1244);
				match(FILETABLE);
				}
			}

			setState(1247);
			match(LP_);
			setState(1248);
			createTableDefinition();
			setState(1253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1249);
					match(COMMA);
					setState(1250);
					createTableDefinition();
					}
					} 
				}
				setState(1255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1256);
				match(COMMA);
				setState(1257);
				periodClause();
				}
			}

			setState(1260);
			match(RP_);
			setState(1271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1261);
				match(ON);
				setState(1269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(1262);
					schemaName();
					setState(1263);
					match(LP_);
					setState(1264);
					columnName();
					setState(1265);
					match(RP_);
					}
					break;
				case 2:
					{
					setState(1267);
					fileGroup();
					}
					break;
				case 3:
					{
					setState(1268);
					match(STRING);
					}
					break;
				}
				}
			}

			setState(1278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXTIMAGE_ON) {
				{
				setState(1273);
				match(TEXTIMAGE_ON);
				setState(1276);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(1274);
					fileGroup();
					}
					break;
				case STRING:
					{
					setState(1275);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(1287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILESTREAM_ON || _la==ID) {
				{
				setState(1285);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FILESTREAM_ON:
					{
					setState(1280);
					match(FILESTREAM_ON);
					{
					setState(1281);
					schemaName();
					}
					}
					break;
				case ID:
					{
					setState(1282);
					fileGroup();
					setState(1283);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1289);
				match(WITH);
				setState(1290);
				match(LP_);
				setState(1291);
				tableOption();
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1292);
					match(COMMA);
					setState(1293);
					tableOption();
					}
					}
					setState(1298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1299);
				match(RP_);
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

	public static class CreateTableDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public ComputedColumnDefinitionContext computedColumnDefinition() {
			return getRuleContext(ComputedColumnDefinitionContext.class,0);
		}
		public ColumnSetDefinitionContext columnSetDefinition() {
			return getRuleContext(ColumnSetDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableIndexContext tableIndex() {
			return getRuleContext(TableIndexContext.class,0);
		}
		public CreateTableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableDefinition; }
	}

	public final CreateTableDefinitionContext createTableDefinition() throws RecognitionException {
		CreateTableDefinitionContext _localctx = new CreateTableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_createTableDefinition);
		try {
			setState(1308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1303);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1304);
				computedColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1305);
				columnSetDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1306);
				tableConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1307);
				tableIndex();
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

	public static class PeriodClauseContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(SQLServerStatementParser.PERIOD, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SQLServerStatementParser.SYSTEM_TIME, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SQLServerStatementParser.COMMA, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public PeriodClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_periodClause; }
	}

	public final PeriodClauseContext periodClause() throws RecognitionException {
		PeriodClauseContext _localctx = new PeriodClauseContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_periodClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			match(PERIOD);
			setState(1311);
			match(FOR);
			setState(1312);
			match(SYSTEM_TIME);
			setState(1313);
			match(LP_);
			setState(1314);
			columnName();
			setState(1315);
			match(COMMA);
			setState(1316);
			columnName();
			setState(1317);
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

	public static class TableIndexContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode WHERE() { return getToken(SQLServerStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(SQLServerStatementParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SQLServerStatementParser.WITH, i);
		}
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public IndexOnClauseContext indexOnClause() {
			return getRuleContext(IndexOnClauseContext.class,0);
		}
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public HashWithBucketContext hashWithBucket() {
			return getRuleContext(HashWithBucketContext.class,0);
		}
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public GroupNameContext groupName() {
			return getRuleContext(GroupNameContext.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SQLServerStatementParser.STRING, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public TerminalNode NUMBER() { return getToken(SQLServerStatementParser.NUMBER, 0); }
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public TableIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndex; }
	}

	public final TableIndexContext tableIndex() throws RecognitionException {
		TableIndexContext _localctx = new TableIndexContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_tableIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			match(INDEX);
			setState(1320);
			indexName();
			setState(1348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(1321);
					_la = _input.LA(1);
					if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1324);
				columnList();
				}
				break;
			case 2:
				{
				setState(1325);
				match(CLUSTERED);
				setState(1326);
				match(COLUMNSTORE);
				}
				break;
			case 3:
				{
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NONCLUSTERED) {
					{
					setState(1327);
					match(NONCLUSTERED);
					}
				}

				setState(1333);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLUMNSTORE:
					{
					setState(1330);
					match(COLUMNSTORE);
					setState(1331);
					columnList();
					}
					break;
				case HASH:
					{
					setState(1332);
					hashWithBucket();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				{
				setState(1335);
				match(CLUSTERED);
				setState(1336);
				match(COLUMNSTORE);
				setState(1346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(1337);
					match(WITH);
					setState(1338);
					match(LP_);
					setState(1339);
					match(COMPRESSION_DELAY);
					setState(1340);
					match(EQ_);
					{
					setState(1341);
					match(NUMBER);
					setState(1343);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MINUTES) {
						{
						setState(1342);
						match(MINUTES);
						}
					}

					}
					setState(1345);
					match(RP_);
					}
					break;
				}
				}
				break;
			}
			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1350);
				match(WHERE);
				setState(1351);
				expr(0);
				}
			}

			setState(1366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1354);
				match(WITH);
				setState(1355);
				match(LP_);
				setState(1356);
				indexOption();
				setState(1361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1357);
					match(COMMA);
					setState(1358);
					indexOption();
					}
					}
					setState(1363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1364);
				match(RP_);
				}
			}

			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1368);
				indexOnClause();
				}
			}

			setState(1377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILESTREAM_ON) {
				{
				setState(1371);
				match(FILESTREAM_ON);
				setState(1375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1372);
					groupName();
					}
					break;
				case 2:
					{
					setState(1373);
					schemaName();
					}
					break;
				case 3:
					{
					setState(1374);
					match(STRING);
					}
					break;
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

	public static class TableOptionContext extends ParserRuleContext {
		public TerminalNode DATA_COMPRESSION() { return getToken(SQLServerStatementParser.DATA_COMPRESSION, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TerminalNode NONE() { return getToken(SQLServerStatementParser.NONE, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode PAGE() { return getToken(SQLServerStatementParser.PAGE, 0); }
		public List<TerminalNode> ON() { return getTokens(SQLServerStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SQLServerStatementParser.ON, i);
		}
		public TerminalNode PARTITIONS() { return getToken(SQLServerStatementParser.PARTITIONS, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public PartitionExpressionsContext partitionExpressions() {
			return getRuleContext(PartitionExpressionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode FILETABLE_DIRECTORY() { return getToken(SQLServerStatementParser.FILETABLE_DIRECTORY, 0); }
		public DirectoryNameContext directoryName() {
			return getRuleContext(DirectoryNameContext.class,0);
		}
		public TerminalNode FILETABLE_COLLATE_FILENAME() { return getToken(SQLServerStatementParser.FILETABLE_COLLATE_FILENAME, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode DATABASE_DEAULT() { return getToken(SQLServerStatementParser.DATABASE_DEAULT, 0); }
		public TerminalNode FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public TerminalNode FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME, 0); }
		public TerminalNode FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public TerminalNode HISTORY_TABLE() { return getToken(SQLServerStatementParser.HISTORY_TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public TerminalNode DATA_CONSISTENCY_CHECK() { return getToken(SQLServerStatementParser.DATA_CONSISTENCY_CHECK, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public TerminalNode REMOTE_DATA_ARCHIVE() { return getToken(SQLServerStatementParser.REMOTE_DATA_ARCHIVE, 0); }
		public TerminalNode MIGRATION_STATE() { return getToken(SQLServerStatementParser.MIGRATION_STATE, 0); }
		public TerminalNode PAUSED() { return getToken(SQLServerStatementParser.PAUSED, 0); }
		public List<TableStretchOptionsContext> tableStretchOptions() {
			return getRuleContexts(TableStretchOptionsContext.class);
		}
		public TableStretchOptionsContext tableStretchOptions(int i) {
			return getRuleContext(TableStretchOptionsContext.class,i);
		}
		public TableOptOptionContext tableOptOption() {
			return getRuleContext(TableOptOptionContext.class,0);
		}
		public DistributionOptionContext distributionOption() {
			return getRuleContext(DistributionOptionContext.class,0);
		}
		public DataWareHouseTableOptionContext dataWareHouseTableOption() {
			return getRuleContext(DataWareHouseTableOptionContext.class,0);
		}
		public TableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOption; }
	}

	public final TableOptionContext tableOption() throws RecognitionException {
		TableOptionContext _localctx = new TableOptionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_tableOption);
		int _la;
		try {
			setState(1452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1379);
				match(DATA_COMPRESSION);
				setState(1380);
				match(EQ_);
				setState(1381);
				_la = _input.LA(1);
				if ( !(_la==NONE || _la==PAGE || _la==ROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1382);
					match(ON);
					setState(1383);
					match(PARTITIONS);
					setState(1384);
					match(LP_);
					setState(1385);
					partitionExpressions();
					setState(1386);
					match(RP_);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1390);
				match(FILETABLE_DIRECTORY);
				setState(1391);
				match(EQ_);
				setState(1392);
				directoryName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1393);
				match(FILETABLE_COLLATE_FILENAME);
				setState(1394);
				match(EQ_);
				setState(1397);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case STRING:
					{
					setState(1395);
					collationName();
					}
					break;
				case DATABASE_DEAULT:
					{
					setState(1396);
					match(DATABASE_DEAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1399);
				match(FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME);
				setState(1400);
				match(EQ_);
				setState(1401);
				constraintName();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1402);
				match(FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME);
				setState(1403);
				match(EQ_);
				setState(1404);
				constraintName();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1405);
				match(FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME);
				setState(1406);
				match(EQ_);
				setState(1407);
				constraintName();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1408);
				match(SYSTEM_VERSIONING);
				setState(1409);
				match(EQ_);
				setState(1410);
				match(ON);
				setState(1423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1411);
					match(LP_);
					setState(1412);
					match(HISTORY_TABLE);
					setState(1413);
					match(EQ_);
					setState(1414);
					tableName();
					setState(1419);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1415);
						match(COMMA);
						setState(1416);
						match(DATA_CONSISTENCY_CHECK);
						setState(1417);
						match(EQ_);
						setState(1418);
						_la = _input.LA(1);
						if ( !(_la==OFF || _la==ON) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1421);
					match(RP_);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1425);
				match(REMOTE_DATA_ARCHIVE);
				setState(1426);
				match(EQ_);
				setState(1447);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON:
					{
					setState(1427);
					match(ON);
					setState(1439);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LP_) {
						{
						setState(1428);
						match(LP_);
						setState(1429);
						tableStretchOptions();
						setState(1434);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1430);
							match(COMMA);
							setState(1431);
							tableStretchOptions();
							}
							}
							setState(1436);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1437);
						match(RP_);
						}
					}

					}
					break;
				case OFF:
					{
					setState(1441);
					match(OFF);
					setState(1442);
					match(LP_);
					setState(1443);
					match(MIGRATION_STATE);
					setState(1444);
					match(EQ_);
					setState(1445);
					match(PAUSED);
					setState(1446);
					match(RP_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1449);
				tableOptOption();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1450);
				distributionOption();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1451);
				dataWareHouseTableOption();
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

	public static class TableOptOptionContext extends ParserRuleContext {
		public TerminalNode MEMORY_OPTIMIZED() { return getToken(SQLServerStatementParser.MEMORY_OPTIMIZED, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public List<TerminalNode> ON() { return getTokens(SQLServerStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SQLServerStatementParser.ON, i);
		}
		public TerminalNode DURABILITY() { return getToken(SQLServerStatementParser.DURABILITY, 0); }
		public TerminalNode SCHEMA_ONLY() { return getToken(SQLServerStatementParser.SCHEMA_ONLY, 0); }
		public TerminalNode SCHEMA_AND_DATA() { return getToken(SQLServerStatementParser.SCHEMA_AND_DATA, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode HISTORY_TABLE() { return getToken(SQLServerStatementParser.HISTORY_TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode COMMA() { return getToken(SQLServerStatementParser.COMMA, 0); }
		public TerminalNode DATA_CONSISTENCY_CHECK() { return getToken(SQLServerStatementParser.DATA_CONSISTENCY_CHECK, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public TableOptOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptOption; }
	}

	public final TableOptOptionContext tableOptOption() throws RecognitionException {
		TableOptOptionContext _localctx = new TableOptOptionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_tableOptOption);
		int _la;
		try {
			setState(1477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MEMORY_OPTIMIZED:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1454);
				match(MEMORY_OPTIMIZED);
				setState(1455);
				match(EQ_);
				setState(1456);
				match(ON);
				}
				}
				break;
			case DURABILITY:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1457);
				match(DURABILITY);
				setState(1458);
				match(EQ_);
				setState(1459);
				_la = _input.LA(1);
				if ( !(_la==SCHEMA_AND_DATA || _la==SCHEMA_ONLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case SYSTEM_VERSIONING:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1460);
				match(SYSTEM_VERSIONING);
				setState(1461);
				match(EQ_);
				setState(1462);
				match(ON);
				setState(1475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1463);
					match(LP_);
					setState(1464);
					match(HISTORY_TABLE);
					setState(1465);
					match(EQ_);
					setState(1466);
					tableName();
					setState(1471);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1467);
						match(COMMA);
						setState(1468);
						match(DATA_CONSISTENCY_CHECK);
						setState(1469);
						match(EQ_);
						setState(1470);
						_la = _input.LA(1);
						if ( !(_la==OFF || _la==ON) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1473);
					match(RP_);
					}
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

	public static class DistributionOptionContext extends ParserRuleContext {
		public TerminalNode DISTRIBUTION() { return getToken(SQLServerStatementParser.DISTRIBUTION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode HASH() { return getToken(SQLServerStatementParser.HASH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode ROUND_ROBIN() { return getToken(SQLServerStatementParser.ROUND_ROBIN, 0); }
		public TerminalNode REPLICATE() { return getToken(SQLServerStatementParser.REPLICATE, 0); }
		public DistributionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distributionOption; }
	}

	public final DistributionOptionContext distributionOption() throws RecognitionException {
		DistributionOptionContext _localctx = new DistributionOptionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_distributionOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			match(DISTRIBUTION);
			setState(1480);
			match(EQ_);
			setState(1488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				{
				setState(1481);
				match(HASH);
				setState(1482);
				match(LP_);
				setState(1483);
				columnName();
				setState(1484);
				match(RP_);
				}
				break;
			case ROUND_ROBIN:
				{
				setState(1486);
				match(ROUND_ROBIN);
				}
				break;
			case REPLICATE:
				{
				setState(1487);
				match(REPLICATE);
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

	public static class DataWareHouseTableOptionContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public TerminalNode HEAP() { return getToken(SQLServerStatementParser.HEAP, 0); }
		public DataWareHousePartitionOptionContext dataWareHousePartitionOption() {
			return getRuleContext(DataWareHousePartitionOptionContext.class,0);
		}
		public DataWareHouseTableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataWareHouseTableOption; }
	}

	public final DataWareHouseTableOptionContext dataWareHouseTableOption() throws RecognitionException {
		DataWareHouseTableOptionContext _localctx = new DataWareHouseTableOptionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_dataWareHouseTableOption);
		try {
			setState(1495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLUSTERED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1490);
				match(CLUSTERED);
				setState(1491);
				match(COLUMNSTORE);
				setState(1492);
				match(INDEX);
				}
				break;
			case HEAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1493);
				match(HEAP);
				}
				break;
			case PARTITION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1494);
				dataWareHousePartitionOption();
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

	public static class DataWareHousePartitionOptionContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SQLServerStatementParser.PARTITION, 0); }
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(SQLServerStatementParser.RANGE, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode VALUES() { return getToken(SQLServerStatementParser.VALUES, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public TerminalNode LEFT() { return getToken(SQLServerStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLServerStatementParser.RIGHT, 0); }
		public DataWareHousePartitionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataWareHousePartitionOption; }
	}

	public final DataWareHousePartitionOptionContext dataWareHousePartitionOption() throws RecognitionException {
		DataWareHousePartitionOptionContext _localctx = new DataWareHousePartitionOptionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_dataWareHousePartitionOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1497);
			match(PARTITION);
			setState(1498);
			match(LP_);
			setState(1499);
			columnName();
			setState(1500);
			match(RANGE);
			setState(1502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT || _la==RIGHT) {
				{
				setState(1501);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1504);
			match(FOR);
			setState(1505);
			match(VALUES);
			setState(1506);
			match(LP_);
			setState(1507);
			simpleExpr(0);
			setState(1512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1508);
				match(COMMA);
				setState(1509);
				simpleExpr(0);
				}
				}
				setState(1514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1515);
			match(RP_);
			setState(1516);
			match(RP_);
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

	public static class TableStretchOptionsContext extends ParserRuleContext {
		public TerminalNode MIGRATION_STATE() { return getToken(SQLServerStatementParser.MIGRATION_STATE, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TerminalNode OUTBOUND() { return getToken(SQLServerStatementParser.OUTBOUND, 0); }
		public TerminalNode INBOUND() { return getToken(SQLServerStatementParser.INBOUND, 0); }
		public TerminalNode PAUSED() { return getToken(SQLServerStatementParser.PAUSED, 0); }
		public TerminalNode FILTER_PREDICATE() { return getToken(SQLServerStatementParser.FILTER_PREDICATE, 0); }
		public TerminalNode COMMA() { return getToken(SQLServerStatementParser.COMMA, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TableStretchOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableStretchOptions; }
	}

	public final TableStretchOptionsContext tableStretchOptions() throws RecognitionException {
		TableStretchOptionsContext _localctx = new TableStretchOptionsContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_tableStretchOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER_PREDICATE) {
				{
				setState(1518);
				match(FILTER_PREDICATE);
				setState(1519);
				match(EQ_);
				setState(1522);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NULL:
					{
					setState(1520);
					match(NULL);
					}
					break;
				case ID:
					{
					setState(1521);
					functionCall();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1524);
				match(COMMA);
				}
			}

			setState(1527);
			match(MIGRATION_STATE);
			setState(1528);
			match(EQ_);
			setState(1529);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INBOUND - 65)) | (1L << (OUTBOUND - 65)) | (1L << (PAUSED - 65)))) != 0)) ) {
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<ColumnDefinitionOptionContext> columnDefinitionOption() {
			return getRuleContexts(ColumnDefinitionOptionContext.class);
		}
		public ColumnDefinitionOptionContext columnDefinitionOption(int i) {
			return getRuleContext(ColumnDefinitionOptionContext.class,i);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnIndexContext columnIndex() {
			return getRuleContext(ColumnIndexContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_columnDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			columnName();
			setState(1532);
			dataType();
			setState(1536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1533);
					columnDefinitionOption();
					}
					} 
				}
				setState(1538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			setState(1547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (KEY - 204)) | (1L << (PRIMARY - 204)) | (1L << (CHECK - 204)) | (1L << (CONSTRAINT - 204)) | (1L << (FOREIGN - 204)) | (1L << (REFERENCES - 204)))) != 0) || _la==UNIQUE) {
				{
				setState(1539);
				columnConstraint();
				setState(1544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1540);
						match(COMMA);
						setState(1541);
						columnConstraint();
						}
						} 
					}
					setState(1546);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				}
				}
			}

			setState(1550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX) {
				{
				setState(1549);
				columnIndex();
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

	public static class ColumnDefinitionOptionContext extends ParserRuleContext {
		public TerminalNode FILESTREAM() { return getToken(SQLServerStatementParser.FILESTREAM, 0); }
		public TerminalNode COLLATE() { return getToken(SQLServerStatementParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode SPARSE() { return getToken(SQLServerStatementParser.SPARSE, 0); }
		public TerminalNode MASKED() { return getToken(SQLServerStatementParser.MASKED, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode FUNCTION() { return getToken(SQLServerStatementParser.FUNCTION, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TerminalNode STRING() { return getToken(SQLServerStatementParser.STRING, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public TerminalNode IDENTITY() { return getToken(SQLServerStatementParser.IDENTITY, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(SQLServerStatementParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SQLServerStatementParser.NUMBER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public TerminalNode GENERATED() { return getToken(SQLServerStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(SQLServerStatementParser.ALWAYS, 0); }
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode START() { return getToken(SQLServerStatementParser.START, 0); }
		public TerminalNode END() { return getToken(SQLServerStatementParser.END, 0); }
		public TerminalNode HIDDEN_() { return getToken(SQLServerStatementParser.HIDDEN_, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode ROWGUIDCOL() { return getToken(SQLServerStatementParser.ROWGUIDCOL, 0); }
		public TerminalNode ENCRYPTED() { return getToken(SQLServerStatementParser.ENCRYPTED, 0); }
		public TerminalNode COLUMN_ENCRYPTION_KEY() { return getToken(SQLServerStatementParser.COLUMN_ENCRYPTION_KEY, 0); }
		public KeyNameContext keyName() {
			return getRuleContext(KeyNameContext.class,0);
		}
		public TerminalNode ENCRYPTION_TYPE() { return getToken(SQLServerStatementParser.ENCRYPTION_TYPE, 0); }
		public TerminalNode ALGORITHM() { return getToken(SQLServerStatementParser.ALGORITHM, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(SQLServerStatementParser.DETERMINISTIC, 0); }
		public TerminalNode RANDOMIZED() { return getToken(SQLServerStatementParser.RANDOMIZED, 0); }
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnIndexContext columnIndex() {
			return getRuleContext(ColumnIndexContext.class,0);
		}
		public ColumnDefinitionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinitionOption; }
	}

	public final ColumnDefinitionOptionContext columnDefinitionOption() throws RecognitionException {
		ColumnDefinitionOptionContext _localctx = new ColumnDefinitionOptionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_columnDefinitionOption);
		int _la;
		try {
			int _alt;
			setState(1618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1552);
				match(FILESTREAM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1553);
				match(COLLATE);
				setState(1554);
				collationName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1555);
				match(SPARSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1556);
				match(MASKED);
				setState(1557);
				match(WITH);
				setState(1558);
				match(LP_);
				setState(1559);
				match(FUNCTION);
				setState(1560);
				match(EQ_);
				setState(1561);
				match(STRING);
				setState(1562);
				match(RP_);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1563);
					match(CONSTRAINT);
					setState(1564);
					constraintName();
					}
				}

				setState(1567);
				match(DEFAULT);
				setState(1568);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1569);
				match(IDENTITY);
				setState(1575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1570);
					match(LP_);
					setState(1571);
					match(NUMBER);
					setState(1572);
					match(COMMA);
					setState(1573);
					match(NUMBER);
					setState(1574);
					match(RP_);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1577);
				match(NOT);
				setState(1578);
				match(FOR);
				setState(1579);
				match(REPLICATION);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1580);
				match(GENERATED);
				setState(1581);
				match(ALWAYS);
				setState(1582);
				match(AS);
				setState(1583);
				match(ROW);
				setState(1584);
				_la = _input.LA(1);
				if ( !(_la==END || _la==START) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HIDDEN_) {
					{
					setState(1585);
					match(HIDDEN_);
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1588);
					match(NOT);
					}
				}

				setState(1591);
				match(NULL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1592);
				match(ROWGUIDCOL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1593);
				match(ENCRYPTED);
				setState(1594);
				match(WITH);
				setState(1595);
				match(LP_);
				setState(1596);
				match(COLUMN_ENCRYPTION_KEY);
				setState(1597);
				match(EQ_);
				setState(1598);
				keyName();
				setState(1599);
				match(COMMA);
				setState(1600);
				match(ENCRYPTION_TYPE);
				setState(1601);
				match(EQ_);
				setState(1602);
				_la = _input.LA(1);
				if ( !(_la==DETERMINISTIC || _la==RANDOMIZED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1603);
				match(COMMA);
				setState(1604);
				match(ALGORITHM);
				setState(1605);
				match(EQ_);
				setState(1606);
				match(STRING);
				setState(1607);
				match(RP_);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1609);
				columnConstraint();
				setState(1614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1610);
						match(COMMA);
						setState(1611);
						columnConstraint();
						}
						} 
					}
					setState(1616);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1617);
				columnIndex();
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

	public static class ColumnConstraintContext extends ParserRuleContext {
		public PrimaryKeyConstraintContext primaryKeyConstraint() {
			return getRuleContext(PrimaryKeyConstraintContext.class,0);
		}
		public ColumnForeignKeyConstraintContext columnForeignKeyConstraint() {
			return getRuleContext(ColumnForeignKeyConstraintContext.class,0);
		}
		public CheckConstraintContext checkConstraint() {
			return getRuleContext(CheckConstraintContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_columnConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1620);
				match(CONSTRAINT);
				setState(1621);
				constraintName();
				}
			}

			setState(1627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
			case UNIQUE:
				{
				setState(1624);
				primaryKeyConstraint();
				}
				break;
			case FOREIGN:
			case REFERENCES:
				{
				setState(1625);
				columnForeignKeyConstraint();
				}
				break;
			case CHECK:
				{
				setState(1626);
				checkConstraint();
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

	public static class PrimaryKeyConstraintContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLServerStatementParser.UNIQUE, 0); }
		public DiskTablePrimaryKeyConstraintOptionContext diskTablePrimaryKeyConstraintOption() {
			return getRuleContext(DiskTablePrimaryKeyConstraintOptionContext.class,0);
		}
		public MemoryTablePrimaryKeyConstraintOptionContext memoryTablePrimaryKeyConstraintOption() {
			return getRuleContext(MemoryTablePrimaryKeyConstraintOptionContext.class,0);
		}
		public PrimaryKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyConstraint; }
	}

	public final PrimaryKeyConstraintContext primaryKeyConstraint() throws RecognitionException {
		PrimaryKeyConstraintContext _localctx = new PrimaryKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_primaryKeyConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
				{
				setState(1629);
				primaryKey();
				}
				break;
			case UNIQUE:
				{
				setState(1630);
				match(UNIQUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1633);
				diskTablePrimaryKeyConstraintOption();
				}
				break;
			case 2:
				{
				setState(1634);
				memoryTablePrimaryKeyConstraintOption();
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

	public static class DiskTablePrimaryKeyConstraintOptionContext extends ParserRuleContext {
		public PrimaryKeyWithClauseContext primaryKeyWithClause() {
			return getRuleContext(PrimaryKeyWithClauseContext.class,0);
		}
		public PrimaryKeyOnClauseContext primaryKeyOnClause() {
			return getRuleContext(PrimaryKeyOnClauseContext.class,0);
		}
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public DiskTablePrimaryKeyConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diskTablePrimaryKeyConstraintOption; }
	}

	public final DiskTablePrimaryKeyConstraintOptionContext diskTablePrimaryKeyConstraintOption() throws RecognitionException {
		DiskTablePrimaryKeyConstraintOptionContext _localctx = new DiskTablePrimaryKeyConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_diskTablePrimaryKeyConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(1637);
				_la = _input.LA(1);
				if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1640);
				primaryKeyWithClause();
				}
			}

			setState(1644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1643);
				primaryKeyOnClause();
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

	public static class ColumnForeignKeyConstraintContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(SQLServerStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode FOREIGN() { return getToken(SQLServerStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public List<ForeignKeyOnActionContext> foreignKeyOnAction() {
			return getRuleContexts(ForeignKeyOnActionContext.class);
		}
		public ForeignKeyOnActionContext foreignKeyOnAction(int i) {
			return getRuleContext(ForeignKeyOnActionContext.class,i);
		}
		public ColumnForeignKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnForeignKeyConstraint; }
	}

	public final ColumnForeignKeyConstraintContext columnForeignKeyConstraint() throws RecognitionException {
		ColumnForeignKeyConstraintContext _localctx = new ColumnForeignKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_columnForeignKeyConstraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOREIGN) {
				{
				setState(1646);
				match(FOREIGN);
				setState(1647);
				match(KEY);
				}
			}

			setState(1650);
			match(REFERENCES);
			setState(1651);
			tableName();
			setState(1652);
			match(LP_);
			setState(1653);
			columnName();
			setState(1654);
			match(RP_);
			setState(1658);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1655);
					foreignKeyOnAction();
					}
					} 
				}
				setState(1660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
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

	public static class ForeignKeyOnActionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public ForeignKeyOnContext foreignKeyOn() {
			return getRuleContext(ForeignKeyOnContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(SQLServerStatementParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SQLServerStatementParser.UPDATE, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public ForeignKeyOnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOnAction; }
	}

	public final ForeignKeyOnActionContext foreignKeyOnAction() throws RecognitionException {
		ForeignKeyOnActionContext _localctx = new ForeignKeyOnActionContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_foreignKeyOnAction);
		int _la;
		try {
			setState(1667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1661);
				match(ON);
				setState(1662);
				_la = _input.LA(1);
				if ( !(_la==UPDATE || _la==DELETE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1663);
				foreignKeyOn();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1664);
				match(NOT);
				setState(1665);
				match(FOR);
				setState(1666);
				match(REPLICATION);
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

	public static class ForeignKeyOnContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(SQLServerStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(SQLServerStatementParser.ACTION, 0); }
		public TerminalNode CASCADE() { return getToken(SQLServerStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public ForeignKeyOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOn; }
	}

	public final ForeignKeyOnContext foreignKeyOn() throws RecognitionException {
		ForeignKeyOnContext _localctx = new ForeignKeyOnContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_foreignKeyOn);
		int _la;
		try {
			setState(1674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1669);
				match(NO);
				setState(1670);
				match(ACTION);
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1671);
				match(CASCADE);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(1672);
				match(SET);
				setState(1673);
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

	public static class MemoryTablePrimaryKeyConstraintOptionContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public WithBucketContext withBucket() {
			return getRuleContext(WithBucketContext.class,0);
		}
		public MemoryTablePrimaryKeyConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryTablePrimaryKeyConstraintOption; }
	}

	public final MemoryTablePrimaryKeyConstraintOptionContext memoryTablePrimaryKeyConstraintOption() throws RecognitionException {
		MemoryTablePrimaryKeyConstraintOptionContext _localctx = new MemoryTablePrimaryKeyConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_memoryTablePrimaryKeyConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			match(CLUSTERED);
			setState(1678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1677);
				withBucket();
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

	public static class HashWithBucketContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(SQLServerStatementParser.HASH, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public WithBucketContext withBucket() {
			return getRuleContext(WithBucketContext.class,0);
		}
		public HashWithBucketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashWithBucket; }
	}

	public final HashWithBucketContext hashWithBucket() throws RecognitionException {
		HashWithBucketContext _localctx = new HashWithBucketContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_hashWithBucket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			match(HASH);
			setState(1681);
			columnList();
			setState(1682);
			withBucket();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithBucketContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode BUCKET_COUNT() { return getToken(SQLServerStatementParser.BUCKET_COUNT, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER() { return getToken(SQLServerStatementParser.NUMBER, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public WithBucketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withBucket; }
	}

	public final WithBucketContext withBucket() throws RecognitionException {
		WithBucketContext _localctx = new WithBucketContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_withBucket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			match(WITH);
			setState(1685);
			match(LP_);
			setState(1686);
			match(BUCKET_COUNT);
			setState(1687);
			match(EQ_);
			setState(1688);
			match(NUMBER);
			setState(1689);
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

	public static class PrimaryKeyWithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode FILLFACTOR() { return getToken(SQLServerStatementParser.FILLFACTOR, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER() { return getToken(SQLServerStatementParser.NUMBER, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public PrimaryKeyWithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyWithClause; }
	}

	public final PrimaryKeyWithClauseContext primaryKeyWithClause() throws RecognitionException {
		PrimaryKeyWithClauseContext _localctx = new PrimaryKeyWithClauseContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_primaryKeyWithClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			match(WITH);
			setState(1706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILLFACTOR:
				{
				setState(1692);
				match(FILLFACTOR);
				setState(1693);
				match(EQ_);
				setState(1694);
				match(NUMBER);
				}
				break;
			case LP_:
				{
				setState(1695);
				match(LP_);
				setState(1696);
				indexOption();
				setState(1701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1697);
					match(COMMA);
					setState(1698);
					indexOption();
					}
					}
					setState(1703);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1704);
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

	public static class PrimaryKeyOnClauseContext extends ParserRuleContext {
		public OnSchemaColumnContext onSchemaColumn() {
			return getRuleContext(OnSchemaColumnContext.class,0);
		}
		public OnFileGroupContext onFileGroup() {
			return getRuleContext(OnFileGroupContext.class,0);
		}
		public OnStringContext onString() {
			return getRuleContext(OnStringContext.class,0);
		}
		public PrimaryKeyOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyOnClause; }
	}

	public final PrimaryKeyOnClauseContext primaryKeyOnClause() throws RecognitionException {
		PrimaryKeyOnClauseContext _localctx = new PrimaryKeyOnClauseContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_primaryKeyOnClause);
		try {
			setState(1711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1708);
				onSchemaColumn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1709);
				onFileGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1710);
				onString();
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

	public static class OnSchemaColumnContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public OnSchemaColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onSchemaColumn; }
	}

	public final OnSchemaColumnContext onSchemaColumn() throws RecognitionException {
		OnSchemaColumnContext _localctx = new OnSchemaColumnContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_onSchemaColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1713);
			match(ON);
			setState(1714);
			schemaName();
			setState(1715);
			match(LP_);
			setState(1716);
			columnName();
			setState(1717);
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

	public static class OnFileGroupContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public FileGroupContext fileGroup() {
			return getRuleContext(FileGroupContext.class,0);
		}
		public OnFileGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onFileGroup; }
	}

	public final OnFileGroupContext onFileGroup() throws RecognitionException {
		OnFileGroupContext _localctx = new OnFileGroupContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_onFileGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			match(ON);
			setState(1720);
			fileGroup();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnStringContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode STRING() { return getToken(SQLServerStatementParser.STRING, 0); }
		public OnStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onString; }
	}

	public final OnStringContext onString() throws RecognitionException {
		OnStringContext _localctx = new OnStringContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_onString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			match(ON);
			setState(1723);
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

	public static class CheckConstraintContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(SQLServerStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public CheckConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkConstraint; }
	}

	public final CheckConstraintContext checkConstraint() throws RecognitionException {
		CheckConstraintContext _localctx = new CheckConstraintContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_checkConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			match(CHECK);
			setState(1729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1726);
				match(NOT);
				setState(1727);
				match(FOR);
				setState(1728);
				match(REPLICATION);
				}
			}

			setState(1731);
			match(LP_);
			setState(1732);
			expr(0);
			setState(1733);
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

	public static class ColumnIndexContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public IndexOnClauseContext indexOnClause() {
			return getRuleContext(IndexOnClauseContext.class,0);
		}
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public FileGroupContext fileGroup() {
			return getRuleContext(FileGroupContext.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SQLServerStatementParser.STRING, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public ColumnIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnIndex; }
	}

	public final ColumnIndexContext columnIndex() throws RecognitionException {
		ColumnIndexContext _localctx = new ColumnIndexContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_columnIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735);
			match(INDEX);
			setState(1736);
			indexName();
			setState(1738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(1737);
				_la = _input.LA(1);
				if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1740);
				match(WITH);
				setState(1741);
				match(LP_);
				setState(1742);
				indexOption();
				setState(1747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1743);
					match(COMMA);
					setState(1744);
					indexOption();
					}
					}
					setState(1749);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1750);
				match(RP_);
				}
			}

			setState(1755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1754);
				indexOnClause();
				}
			}

			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILESTREAM_ON) {
				{
				setState(1757);
				match(FILESTREAM_ON);
				setState(1761);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1758);
					fileGroup();
					}
					break;
				case 2:
					{
					setState(1759);
					schemaName();
					}
					break;
				case 3:
					{
					setState(1760);
					match(STRING);
					}
					break;
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

	public static class IndexOnClauseContext extends ParserRuleContext {
		public OnSchemaColumnContext onSchemaColumn() {
			return getRuleContext(OnSchemaColumnContext.class,0);
		}
		public OnFileGroupContext onFileGroup() {
			return getRuleContext(OnFileGroupContext.class,0);
		}
		public OnDefaultContext onDefault() {
			return getRuleContext(OnDefaultContext.class,0);
		}
		public IndexOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOnClause; }
	}

	public final IndexOnClauseContext indexOnClause() throws RecognitionException {
		IndexOnClauseContext _localctx = new IndexOnClauseContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_indexOnClause);
		try {
			setState(1768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1765);
				onSchemaColumn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1766);
				onFileGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1767);
				onDefault();
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

	public static class OnDefaultContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public OnDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onDefault; }
	}

	public final OnDefaultContext onDefault() throws RecognitionException {
		OnDefaultContext _localctx = new OnDefaultContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_onDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			match(ON);
			setState(1771);
			match(DEFAULT);
			}
		}
		catch (RecognitionException re) {
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
		public TablePrimaryConstraintContext tablePrimaryConstraint() {
			return getRuleContext(TablePrimaryConstraintContext.class,0);
		}
		public TableForeignKeyConstraintContext tableForeignKeyConstraint() {
			return getRuleContext(TableForeignKeyConstraintContext.class,0);
		}
		public CheckConstraintContext checkConstraint() {
			return getRuleContext(CheckConstraintContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_tableConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1773);
				match(CONSTRAINT);
				setState(1774);
				constraintName();
				}
			}

			setState(1780);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
			case UNIQUE:
				{
				setState(1777);
				tablePrimaryConstraint();
				}
				break;
			case LP_:
			case FOREIGN:
				{
				setState(1778);
				tableForeignKeyConstraint();
				}
				break;
			case CHECK:
				{
				setState(1779);
				checkConstraint();
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

	public static class TablePrimaryConstraintContext extends ParserRuleContext {
		public PrimaryKeyUniqueContext primaryKeyUnique() {
			return getRuleContext(PrimaryKeyUniqueContext.class,0);
		}
		public DiskTablePrimaryConstraintOptionContext diskTablePrimaryConstraintOption() {
			return getRuleContext(DiskTablePrimaryConstraintOptionContext.class,0);
		}
		public MemoryTablePrimaryConstraintOptionContext memoryTablePrimaryConstraintOption() {
			return getRuleContext(MemoryTablePrimaryConstraintOptionContext.class,0);
		}
		public TablePrimaryConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePrimaryConstraint; }
	}

	public final TablePrimaryConstraintContext tablePrimaryConstraint() throws RecognitionException {
		TablePrimaryConstraintContext _localctx = new TablePrimaryConstraintContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_tablePrimaryConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			primaryKeyUnique();
			setState(1785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1783);
				diskTablePrimaryConstraintOption();
				}
				break;
			case 2:
				{
				setState(1784);
				memoryTablePrimaryConstraintOption();
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

	public static class PrimaryKeyUniqueContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLServerStatementParser.UNIQUE, 0); }
		public PrimaryKeyUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyUnique; }
	}

	public final PrimaryKeyUniqueContext primaryKeyUnique() throws RecognitionException {
		PrimaryKeyUniqueContext _localctx = new PrimaryKeyUniqueContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_primaryKeyUnique);
		try {
			setState(1789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1787);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1788);
				match(UNIQUE);
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

	public static class DiskTablePrimaryConstraintOptionContext extends ParserRuleContext {
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public PrimaryKeyWithClauseContext primaryKeyWithClause() {
			return getRuleContext(PrimaryKeyWithClauseContext.class,0);
		}
		public PrimaryKeyOnClauseContext primaryKeyOnClause() {
			return getRuleContext(PrimaryKeyOnClauseContext.class,0);
		}
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public DiskTablePrimaryConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diskTablePrimaryConstraintOption; }
	}

	public final DiskTablePrimaryConstraintOptionContext diskTablePrimaryConstraintOption() throws RecognitionException {
		DiskTablePrimaryConstraintOptionContext _localctx = new DiskTablePrimaryConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_diskTablePrimaryConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(1791);
				_la = _input.LA(1);
				if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1794);
			columnList();
			setState(1796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1795);
				primaryKeyWithClause();
				}
			}

			setState(1799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1798);
				primaryKeyOnClause();
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

	public static class MemoryTablePrimaryConstraintOptionContext extends ParserRuleContext {
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public HashWithBucketContext hashWithBucket() {
			return getRuleContext(HashWithBucketContext.class,0);
		}
		public MemoryTablePrimaryConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryTablePrimaryConstraintOption; }
	}

	public final MemoryTablePrimaryConstraintOptionContext memoryTablePrimaryConstraintOption() throws RecognitionException {
		MemoryTablePrimaryConstraintOptionContext _localctx = new MemoryTablePrimaryConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_memoryTablePrimaryConstraintOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801);
			match(NONCLUSTERED);
			setState(1804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				{
				setState(1802);
				columnList();
				}
				break;
			case HASH:
				{
				setState(1803);
				hashWithBucket();
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

	public static class TableForeignKeyConstraintContext extends ParserRuleContext {
		public List<ColumnListContext> columnList() {
			return getRuleContexts(ColumnListContext.class);
		}
		public ColumnListContext columnList(int i) {
			return getRuleContext(ColumnListContext.class,i);
		}
		public TerminalNode REFERENCES() { return getToken(SQLServerStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(SQLServerStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public List<ForeignKeyOnActionContext> foreignKeyOnAction() {
			return getRuleContexts(ForeignKeyOnActionContext.class);
		}
		public ForeignKeyOnActionContext foreignKeyOnAction(int i) {
			return getRuleContext(ForeignKeyOnActionContext.class,i);
		}
		public TableForeignKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableForeignKeyConstraint; }
	}

	public final TableForeignKeyConstraintContext tableForeignKeyConstraint() throws RecognitionException {
		TableForeignKeyConstraintContext _localctx = new TableForeignKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_tableForeignKeyConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOREIGN) {
				{
				setState(1806);
				match(FOREIGN);
				setState(1807);
				match(KEY);
				}
			}

			setState(1810);
			columnList();
			setState(1811);
			match(REFERENCES);
			setState(1812);
			tableName();
			setState(1813);
			columnList();
			setState(1817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT || _la==ON) {
				{
				{
				setState(1814);
				foreignKeyOnAction();
				}
				}
				setState(1819);
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

	public static class ComputedColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PERSISTED() { return getToken(SQLServerStatementParser.PERSISTED, 0); }
		public ColumnConstraintContext columnConstraint() {
			return getRuleContext(ColumnConstraintContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public ComputedColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computedColumnDefinition; }
	}

	public final ComputedColumnDefinitionContext computedColumnDefinition() throws RecognitionException {
		ComputedColumnDefinitionContext _localctx = new ComputedColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_computedColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			columnName();
			setState(1821);
			match(AS);
			setState(1822);
			expr(0);
			setState(1828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERSISTED) {
				{
				setState(1823);
				match(PERSISTED);
				setState(1826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1824);
					match(NOT);
					setState(1825);
					match(NULL);
					}
				}

				}
			}

			setState(1831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (KEY - 204)) | (1L << (PRIMARY - 204)) | (1L << (CHECK - 204)) | (1L << (CONSTRAINT - 204)) | (1L << (FOREIGN - 204)) | (1L << (REFERENCES - 204)))) != 0) || _la==UNIQUE) {
				{
				setState(1830);
				columnConstraint();
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

	public static class ColumnSetDefinitionContext extends ParserRuleContext {
		public ColumnSetNameContext columnSetName() {
			return getRuleContext(ColumnSetNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode COLUMN_SET() { return getToken(SQLServerStatementParser.COLUMN_SET, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode ALL_SPARSE_COLUMNS() { return getToken(SQLServerStatementParser.ALL_SPARSE_COLUMNS, 0); }
		public ColumnSetDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSetDefinition; }
	}

	public final ColumnSetDefinitionContext columnSetDefinition() throws RecognitionException {
		ColumnSetDefinitionContext _localctx = new ColumnSetDefinitionContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_columnSetDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
			columnSetName();
			setState(1834);
			match(ID);
			setState(1835);
			match(COLUMN_SET);
			setState(1836);
			match(FOR);
			setState(1837);
			match(ALL_SPARSE_COLUMNS);
			}
		}
		catch (RecognitionException re) {
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
		public AlterTableOpContext alterTableOp() {
			return getRuleContext(AlterTableOpContext.class,0);
		}
		public AlterColumnContext alterColumn() {
			return getRuleContext(AlterColumnContext.class,0);
		}
		public AddColumnContext addColumn() {
			return getRuleContext(AddColumnContext.class,0);
		}
		public AlterDropContext alterDrop() {
			return getRuleContext(AlterDropContext.class,0);
		}
		public AlterCheckConstraintContext alterCheckConstraint() {
			return getRuleContext(AlterCheckConstraintContext.class,0);
		}
		public AlterTriggerContext alterTrigger() {
			return getRuleContext(AlterTriggerContext.class,0);
		}
		public AlterSwitchContext alterSwitch() {
			return getRuleContext(AlterSwitchContext.class,0);
		}
		public AlterSetContext alterSet() {
			return getRuleContext(AlterSetContext.class,0);
		}
		public TableOptionContext tableOption() {
			return getRuleContext(TableOptionContext.class,0);
		}
		public TerminalNode REBUILD() { return getToken(SQLServerStatementParser.REBUILD, 0); }
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_alterTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1839);
			alterTableOp();
			setState(1849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1840);
				alterColumn();
				}
				break;
			case 2:
				{
				setState(1841);
				addColumn();
				}
				break;
			case 3:
				{
				setState(1842);
				alterDrop();
				}
				break;
			case 4:
				{
				setState(1843);
				alterCheckConstraint();
				}
				break;
			case 5:
				{
				setState(1844);
				alterTrigger();
				}
				break;
			case 6:
				{
				setState(1845);
				alterSwitch();
				}
				break;
			case 7:
				{
				setState(1846);
				alterSet();
				}
				break;
			case 8:
				{
				setState(1847);
				tableOption();
				}
				break;
			case 9:
				{
				setState(1848);
				match(REBUILD);
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

	public static class AlterTableOpContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterTableOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableOp; }
	}

	public final AlterTableOpContext alterTableOp() throws RecognitionException {
		AlterTableOpContext _localctx = new AlterTableOpContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_alterTableOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			match(ALTER);
			setState(1852);
			match(TABLE);
			setState(1853);
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

	public static class AlterColumnContext extends ParserRuleContext {
		public ModifyColumnContext modifyColumn() {
			return getRuleContext(ModifyColumnContext.class,0);
		}
		public AlterColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumn; }
	}

	public final AlterColumnContext alterColumn() throws RecognitionException {
		AlterColumnContext _localctx = new AlterColumnContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_alterColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1855);
			modifyColumn();
			}
		}
		catch (RecognitionException re) {
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
		public AlterColumnOpContext alterColumnOp() {
			return getRuleContext(AlterColumnOpContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(SQLServerStatementParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode SPARSE() { return getToken(SQLServerStatementParser.SPARSE, 0); }
		public ModifyColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumn; }
	}

	public final ModifyColumnContext modifyColumn() throws RecognitionException {
		ModifyColumnContext _localctx = new ModifyColumnContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_modifyColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
			alterColumnOp();
			setState(1858);
			dataType();
			setState(1861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(1859);
				match(COLLATE);
				setState(1860);
				collationName();
				}
			}

			setState(1866);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				{
				setState(1863);
				match(NULL);
				}
				break;
			case NOT:
				{
				setState(1864);
				match(NOT);
				setState(1865);
				match(NULL);
				}
				break;
			case EOF:
			case SPARSE:
			case SEMI_:
				break;
			default:
				break;
			}
			setState(1869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPARSE) {
				{
				setState(1868);
				match(SPARSE);
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

	public static class AlterColumnOpContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode COLUMN() { return getToken(SQLServerStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AlterColumnOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnOp; }
	}

	public final AlterColumnOpContext alterColumnOp() throws RecognitionException {
		AlterColumnOpContext _localctx = new AlterColumnOpContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_alterColumnOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1871);
			match(ALTER);
			setState(1872);
			match(COLUMN);
			setState(1873);
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

	public static class AddColumnContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SQLServerStatementParser.ADD, 0); }
		public List<AlterColumnAddOptionContext> alterColumnAddOption() {
			return getRuleContexts(AlterColumnAddOptionContext.class);
		}
		public AlterColumnAddOptionContext alterColumnAddOption(int i) {
			return getRuleContext(AlterColumnAddOptionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode CHECK() { return getToken(SQLServerStatementParser.CHECK, 0); }
		public TerminalNode NOCHECK() { return getToken(SQLServerStatementParser.NOCHECK, 0); }
		public ColumnNameGeneratedClauseContext columnNameGeneratedClause() {
			return getRuleContext(ColumnNameGeneratedClauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public PeriodClauseContext periodClause() {
			return getRuleContext(PeriodClauseContext.class,0);
		}
		public AddColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumn; }
	}

	public final AddColumnContext addColumn() throws RecognitionException {
		AddColumnContext _localctx = new AddColumnContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_addColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1875);
				match(WITH);
				setState(1876);
				_la = _input.LA(1);
				if ( !(_la==NOCHECK || _la==CHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1879);
			match(ADD);
			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1880);
				alterColumnAddOption();
				setState(1885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1881);
					match(COMMA);
					setState(1882);
					alterColumnAddOption();
					}
					}
					setState(1887);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1896);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(1888);
					columnNameGeneratedClause();
					setState(1889);
					match(COMMA);
					setState(1890);
					periodClause();
					}
					break;
				case PERIOD:
					{
					setState(1892);
					periodClause();
					setState(1893);
					match(COMMA);
					setState(1894);
					columnNameGeneratedClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class AlterColumnAddOptionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public ComputedColumnDefinitionContext computedColumnDefinition() {
			return getRuleContext(ComputedColumnDefinitionContext.class,0);
		}
		public ColumnSetDefinitionContext columnSetDefinition() {
			return getRuleContext(ColumnSetDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableIndexContext tableIndex() {
			return getRuleContext(TableIndexContext.class,0);
		}
		public ConstraintForColumnContext constraintForColumn() {
			return getRuleContext(ConstraintForColumnContext.class,0);
		}
		public AlterColumnAddOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAddOption; }
	}

	public final AlterColumnAddOptionContext alterColumnAddOption() throws RecognitionException {
		AlterColumnAddOptionContext _localctx = new AlterColumnAddOptionContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_alterColumnAddOption);
		try {
			setState(1906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1900);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1901);
				computedColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1902);
				columnSetDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1903);
				tableConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1904);
				tableIndex();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1905);
				constraintForColumn();
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

	public static class ConstraintForColumnContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public ConstraintForColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintForColumn; }
	}

	public final ConstraintForColumnContext constraintForColumn() throws RecognitionException {
		ConstraintForColumnContext _localctx = new ConstraintForColumnContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_constraintForColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1908);
				match(CONSTRAINT);
				setState(1909);
				constraintName();
				}
			}

			setState(1912);
			match(DEFAULT);
			setState(1913);
			simpleExpr(0);
			setState(1914);
			match(FOR);
			setState(1915);
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

	public static class ColumnNameWithSortsWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ColumnNameWithSortContext> columnNameWithSort() {
			return getRuleContexts(ColumnNameWithSortContext.class);
		}
		public ColumnNameWithSortContext columnNameWithSort(int i) {
			return getRuleContext(ColumnNameWithSortContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public ColumnNameWithSortsWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameWithSortsWithParen; }
	}

	public final ColumnNameWithSortsWithParenContext columnNameWithSortsWithParen() throws RecognitionException {
		ColumnNameWithSortsWithParenContext _localctx = new ColumnNameWithSortsWithParenContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_columnNameWithSortsWithParen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
			match(LP_);
			setState(1918);
			columnNameWithSort();
			setState(1923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1919);
				match(COMMA);
				setState(1920);
				columnNameWithSort();
				}
				}
				setState(1925);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1926);
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

	public static class ColumnNameGeneratedClauseContext extends ParserRuleContext {
		public List<ColumnNameGeneratedContext> columnNameGenerated() {
			return getRuleContexts(ColumnNameGeneratedContext.class);
		}
		public ColumnNameGeneratedContext columnNameGenerated(int i) {
			return getRuleContext(ColumnNameGeneratedContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SQLServerStatementParser.COMMA, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode VALUES() { return getToken(SQLServerStatementParser.VALUES, 0); }
		public ColumnNameGeneratedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameGeneratedClause; }
	}

	public final ColumnNameGeneratedClauseContext columnNameGeneratedClause() throws RecognitionException {
		ColumnNameGeneratedClauseContext _localctx = new ColumnNameGeneratedClauseContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_columnNameGeneratedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			columnNameGenerated();
			setState(1929);
			match(DEFAULT);
			setState(1930);
			simpleExpr(0);
			setState(1933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1931);
				match(WITH);
				setState(1932);
				match(VALUES);
				}
			}

			setState(1935);
			match(COMMA);
			setState(1936);
			columnNameGenerated();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameGeneratedContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(SQLServerStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(SQLServerStatementParser.ALWAYS, 0); }
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode HIDDEN_() { return getToken(SQLServerStatementParser.HIDDEN_, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public TerminalNode START() { return getToken(SQLServerStatementParser.START, 0); }
		public TerminalNode END() { return getToken(SQLServerStatementParser.END, 0); }
		public ColumnNameGeneratedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameGenerated; }
	}

	public final ColumnNameGeneratedContext columnNameGenerated() throws RecognitionException {
		ColumnNameGeneratedContext _localctx = new ColumnNameGeneratedContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_columnNameGenerated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1938);
			columnName();
			setState(1939);
			typeName();
			setState(1940);
			match(GENERATED);
			setState(1941);
			match(ALWAYS);
			setState(1942);
			match(AS);
			setState(1943);
			match(ROW);
			setState(1945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END || _la==START) {
				{
				setState(1944);
				_la = _input.LA(1);
				if ( !(_la==END || _la==START) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HIDDEN_) {
				{
				setState(1947);
				match(HIDDEN_);
				}
			}

			setState(1952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1950);
				match(NOT);
				setState(1951);
				match(NULL);
				}
			}

			setState(1956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1954);
				match(CONSTRAINT);
				setState(1955);
				constraintName();
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

	public static class AlterDropContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public AlterTableDropConstraintContext alterTableDropConstraint() {
			return getRuleContext(AlterTableDropConstraintContext.class,0);
		}
		public DropColumnContext dropColumn() {
			return getRuleContext(DropColumnContext.class,0);
		}
		public DropIndexDefContext dropIndexDef() {
			return getRuleContext(DropIndexDefContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(SQLServerStatementParser.PERIOD, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SQLServerStatementParser.SYSTEM_TIME, 0); }
		public AlterDropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDrop; }
	}

	public final AlterDropContext alterDrop() throws RecognitionException {
		AlterDropContext _localctx = new AlterDropContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_alterDrop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			match(DROP);
			setState(1965);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case CONSTRAINT:
			case ID:
				{
				setState(1959);
				alterTableDropConstraint();
				}
				break;
			case COLUMN:
				{
				setState(1960);
				dropColumn();
				}
				break;
			case INDEX:
				{
				setState(1961);
				dropIndexDef();
				}
				break;
			case PERIOD:
				{
				setState(1962);
				match(PERIOD);
				setState(1963);
				match(FOR);
				setState(1964);
				match(SYSTEM_TIME);
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

	public static class AlterTableDropConstraintContext extends ParserRuleContext {
		public List<DropConstraintNameContext> dropConstraintName() {
			return getRuleContexts(DropConstraintNameContext.class);
		}
		public DropConstraintNameContext dropConstraintName(int i) {
			return getRuleContext(DropConstraintNameContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public AlterTableDropConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableDropConstraint; }
	}

	public final AlterTableDropConstraintContext alterTableDropConstraint() throws RecognitionException {
		AlterTableDropConstraintContext _localctx = new AlterTableDropConstraintContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_alterTableDropConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1967);
				match(CONSTRAINT);
				}
			}

			setState(1972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1970);
				match(IF);
				setState(1971);
				match(EXISTS);
				}
			}

			setState(1974);
			dropConstraintName();
			setState(1979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1975);
				match(COMMA);
				setState(1976);
				dropConstraintName();
				}
				}
				setState(1981);
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

	public static class DropConstraintNameContext extends ParserRuleContext {
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public DropConstraintWithClauseContext dropConstraintWithClause() {
			return getRuleContext(DropConstraintWithClauseContext.class,0);
		}
		public DropConstraintNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintName; }
	}

	public final DropConstraintNameContext dropConstraintName() throws RecognitionException {
		DropConstraintNameContext _localctx = new DropConstraintNameContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_dropConstraintName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1982);
			constraintName();
			setState(1984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1983);
				dropConstraintWithClause();
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

	public static class DropConstraintWithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<DropConstraintOptionContext> dropConstraintOption() {
			return getRuleContexts(DropConstraintOptionContext.class);
		}
		public DropConstraintOptionContext dropConstraintOption(int i) {
			return getRuleContext(DropConstraintOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public DropConstraintWithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintWithClause; }
	}

	public final DropConstraintWithClauseContext dropConstraintWithClause() throws RecognitionException {
		DropConstraintWithClauseContext _localctx = new DropConstraintWithClauseContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_dropConstraintWithClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
			match(WITH);
			setState(1987);
			match(LP_);
			setState(1988);
			dropConstraintOption();
			setState(1993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1989);
				match(COMMA);
				setState(1990);
				dropConstraintOption();
				}
				}
				setState(1995);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1996);
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

	public static class DropConstraintOptionContext extends ParserRuleContext {
		public TerminalNode MAXDOP() { return getToken(SQLServerStatementParser.MAXDOP, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER() { return getToken(SQLServerStatementParser.NUMBER, 0); }
		public TerminalNode ONLINE() { return getToken(SQLServerStatementParser.ONLINE, 0); }
		public TerminalNode MOVE() { return getToken(SQLServerStatementParser.MOVE, 0); }
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public FileGroupContext fileGroup() {
			return getRuleContext(FileGroupContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SQLServerStatementParser.STRING, 0); }
		public DropConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintOption; }
	}

	public final DropConstraintOptionContext dropConstraintOption() throws RecognitionException {
		DropConstraintOptionContext _localctx = new DropConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_dropConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2015);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAXDOP:
				{
				setState(1998);
				match(MAXDOP);
				setState(1999);
				match(EQ_);
				setState(2000);
				match(NUMBER);
				}
				break;
			case ONLINE:
				{
				setState(2001);
				match(ONLINE);
				setState(2002);
				match(EQ_);
				setState(2003);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case MOVE:
				{
				setState(2004);
				match(MOVE);
				setState(2005);
				match(TO);
				setState(2013);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(2006);
					schemaName();
					setState(2007);
					match(LP_);
					setState(2008);
					columnName();
					setState(2009);
					match(RP_);
					}
					break;
				case 2:
					{
					setState(2011);
					fileGroup();
					}
					break;
				case 3:
					{
					setState(2012);
					match(STRING);
					}
					break;
				}
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

	public static class DropColumnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(SQLServerStatementParser.COLUMN, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public DropColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumn; }
	}

	public final DropColumnContext dropColumn() throws RecognitionException {
		DropColumnContext _localctx = new DropColumnContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_dropColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2017);
			match(COLUMN);
			setState(2020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2018);
				match(IF);
				setState(2019);
				match(EXISTS);
				}
			}

			setState(2022);
			columnNames();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropIndexDefContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public DropIndexDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndexDef; }
	}

	public final DropIndexDefContext dropIndexDef() throws RecognitionException {
		DropIndexDefContext _localctx = new DropIndexDefContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_dropIndexDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024);
			match(INDEX);
			setState(2027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2025);
				match(IF);
				setState(2026);
				match(EXISTS);
				}
			}

			setState(2029);
			indexName();
			setState(2034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2030);
				match(COMMA);
				setState(2031);
				indexName();
				}
				}
				setState(2036);
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

	public static class AlterCheckConstraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public TerminalNode CHECK() { return getToken(SQLServerStatementParser.CHECK, 0); }
		public TerminalNode NOCHECK() { return getToken(SQLServerStatementParser.NOCHECK, 0); }
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public List<ConstraintNameContext> constraintName() {
			return getRuleContexts(ConstraintNameContext.class);
		}
		public ConstraintNameContext constraintName(int i) {
			return getRuleContext(ConstraintNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public AlterCheckConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterCheckConstraint; }
	}

	public final AlterCheckConstraintContext alterCheckConstraint() throws RecognitionException {
		AlterCheckConstraintContext _localctx = new AlterCheckConstraintContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_alterCheckConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2037);
				match(WITH);
				}
			}

			setState(2040);
			_la = _input.LA(1);
			if ( !(_la==NOCHECK || _la==CHECK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2041);
			match(CONSTRAINT);
			setState(2051);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(2042);
				match(ALL);
				}
				break;
			case ID:
				{
				{
				setState(2043);
				constraintName();
				setState(2048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2044);
					match(COMMA);
					setState(2045);
					constraintName();
					}
					}
					setState(2050);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class AlterTriggerContext extends ParserRuleContext {
		public TerminalNode TRIGGER() { return getToken(SQLServerStatementParser.TRIGGER, 0); }
		public TerminalNode ENABLE() { return getToken(SQLServerStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(SQLServerStatementParser.DISABLE, 0); }
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public List<TriggerNameContext> triggerName() {
			return getRuleContexts(TriggerNameContext.class);
		}
		public TriggerNameContext triggerName(int i) {
			return getRuleContext(TriggerNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public AlterTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTrigger; }
	}

	public final AlterTriggerContext alterTrigger() throws RecognitionException {
		AlterTriggerContext _localctx = new AlterTriggerContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_alterTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			_la = _input.LA(1);
			if ( !(_la==DISABLE || _la==ENABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2054);
			match(TRIGGER);
			setState(2064);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(2055);
				match(ALL);
				}
				break;
			case ID:
				{
				{
				setState(2056);
				triggerName();
				setState(2061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2057);
					match(COMMA);
					setState(2058);
					triggerName();
					}
					}
					setState(2063);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class AlterSwitchContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(SQLServerStatementParser.SWITCH, 0); }
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<TerminalNode> PARTITION() { return getTokens(SQLServerStatementParser.PARTITION); }
		public TerminalNode PARTITION(int i) {
			return getToken(SQLServerStatementParser.PARTITION, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public LowPriorityLockWaitContext lowPriorityLockWait() {
			return getRuleContext(LowPriorityLockWaitContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public AlterSwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSwitch; }
	}

	public final AlterSwitchContext alterSwitch() throws RecognitionException {
		AlterSwitchContext _localctx = new AlterSwitchContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_alterSwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			match(SWITCH);
			setState(2069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(2067);
				match(PARTITION);
				setState(2068);
				expr(0);
				}
			}

			setState(2071);
			match(TO);
			setState(2072);
			tableName();
			setState(2075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(2073);
				match(PARTITION);
				setState(2074);
				expr(0);
				}
			}

			setState(2082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2077);
				match(WITH);
				setState(2078);
				match(LP_);
				setState(2079);
				lowPriorityLockWait();
				setState(2080);
				match(RP_);
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

	public static class AlterSetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public SetFileStreamClauseContext setFileStreamClause() {
			return getRuleContext(SetFileStreamClauseContext.class,0);
		}
		public SetSystemVersionClauseContext setSystemVersionClause() {
			return getRuleContext(SetSystemVersionClauseContext.class,0);
		}
		public AlterSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSet; }
	}

	public final AlterSetContext alterSet() throws RecognitionException {
		AlterSetContext _localctx = new AlterSetContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_alterSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2084);
			match(SET);
			setState(2085);
			match(LP_);
			setState(2088);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILESTREAM_ON:
				{
				setState(2086);
				setFileStreamClause();
				}
				break;
			case SYSTEM_VERSIONING:
				{
				setState(2087);
				setSystemVersionClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2090);
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

	public static class SetFileStreamClauseContext extends ParserRuleContext {
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public FileGroupContext fileGroup() {
			return getRuleContext(FileGroupContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SQLServerStatementParser.STRING, 0); }
		public SetFileStreamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setFileStreamClause; }
	}

	public final SetFileStreamClauseContext setFileStreamClause() throws RecognitionException {
		SetFileStreamClauseContext _localctx = new SetFileStreamClauseContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_setFileStreamClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2092);
			match(FILESTREAM_ON);
			setState(2093);
			match(EQ_);
			setState(2097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(2094);
				schemaName();
				}
				break;
			case 2:
				{
				setState(2095);
				fileGroup();
				}
				break;
			case 3:
				{
				setState(2096);
				match(STRING);
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

	public static class SetSystemVersionClauseContext extends ParserRuleContext {
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public AlterSetOnClauseContext alterSetOnClause() {
			return getRuleContext(AlterSetOnClauseContext.class,0);
		}
		public SetSystemVersionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setSystemVersionClause; }
	}

	public final SetSystemVersionClauseContext setSystemVersionClause() throws RecognitionException {
		SetSystemVersionClauseContext _localctx = new SetSystemVersionClauseContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_setSystemVersionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2099);
			match(SYSTEM_VERSIONING);
			setState(2100);
			match(EQ_);
			setState(2103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OFF:
				{
				setState(2101);
				match(OFF);
				}
				break;
			case ON:
				{
				setState(2102);
				alterSetOnClause();
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

	public static class AlterSetOnClauseContext extends ParserRuleContext {
		public List<TerminalNode> ON() { return getTokens(SQLServerStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SQLServerStatementParser.ON, i);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode HISTORY_TABLE() { return getToken(SQLServerStatementParser.HISTORY_TABLE, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode DATA_CONSISTENCY_CHECK() { return getToken(SQLServerStatementParser.DATA_CONSISTENCY_CHECK, 0); }
		public TerminalNode HISTORY_RETENTION_PERIOD() { return getToken(SQLServerStatementParser.HISTORY_RETENTION_PERIOD, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public TerminalNode INFINITE() { return getToken(SQLServerStatementParser.INFINITE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public TerminalNode NUMBER() { return getToken(SQLServerStatementParser.NUMBER, 0); }
		public TerminalNode DAY() { return getToken(SQLServerStatementParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SQLServerStatementParser.DAYS, 0); }
		public TerminalNode WEEK() { return getToken(SQLServerStatementParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SQLServerStatementParser.WEEKS, 0); }
		public TerminalNode MONTH() { return getToken(SQLServerStatementParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SQLServerStatementParser.MONTHS, 0); }
		public TerminalNode YEAR() { return getToken(SQLServerStatementParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SQLServerStatementParser.YEARS, 0); }
		public AlterSetOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSetOnClause; }
	}

	public final AlterSetOnClauseContext alterSetOnClause() throws RecognitionException {
		AlterSetOnClauseContext _localctx = new AlterSetOnClauseContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_alterSetOnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2105);
			match(ON);
			setState(2133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2106);
				match(LP_);
				setState(2110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HISTORY_TABLE) {
					{
					setState(2107);
					match(HISTORY_TABLE);
					setState(2108);
					match(EQ_);
					setState(2109);
					tableName();
					}
				}

				setState(2118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(2113);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(2112);
						match(COMMA);
						}
					}

					setState(2115);
					match(DATA_CONSISTENCY_CHECK);
					setState(2116);
					match(EQ_);
					setState(2117);
					_la = _input.LA(1);
					if ( !(_la==OFF || _la==ON) ) {
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
				setState(2130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HISTORY_RETENTION_PERIOD || _la==COMMA) {
					{
					setState(2121);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(2120);
						match(COMMA);
						}
					}

					setState(2123);
					match(HISTORY_RETENTION_PERIOD);
					setState(2124);
					match(EQ_);
					setState(2128);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INFINITE:
						{
						setState(2125);
						match(INFINITE);
						}
						break;
					case NUMBER:
						{
						{
						setState(2126);
						match(NUMBER);
						setState(2127);
						_la = _input.LA(1);
						if ( !(_la==DAYS || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (MONTH - 80)) | (1L << (MONTHS - 80)) | (1L << (WEEK - 80)) | (1L << (WEEKS - 80)) | (1L << (YEARS - 80)))) != 0) || _la==DAY || _la==YEAR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(2132);
				match(RP_);
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

	public static class IndexWithNameContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IndexWithNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexWithName; }
	}

	public final IndexWithNameContext indexWithName() throws RecognitionException {
		IndexWithNameContext _localctx = new IndexWithNameContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_indexWithName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2135);
			match(INDEX);
			setState(2136);
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

	public static class IndexNonClusterClauseContext extends ParserRuleContext {
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public HashWithBucketContext hashWithBucket() {
			return getRuleContext(HashWithBucketContext.class,0);
		}
		public ColumnNameWithSortsWithParenContext columnNameWithSortsWithParen() {
			return getRuleContext(ColumnNameWithSortsWithParenContext.class,0);
		}
		public IndexOnClauseContext indexOnClause() {
			return getRuleContext(IndexOnClauseContext.class,0);
		}
		public IndexNonClusterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexNonClusterClause; }
	}

	public final IndexNonClusterClauseContext indexNonClusterClause() throws RecognitionException {
		IndexNonClusterClauseContext _localctx = new IndexNonClusterClauseContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_indexNonClusterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2138);
			match(NONCLUSTERED);
			setState(2144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				{
				setState(2139);
				hashWithBucket();
				}
				break;
			case LP_:
				{
				{
				setState(2140);
				columnNameWithSortsWithParen();
				setState(2142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2141);
					indexOnClause();
					}
				}

				}
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

	public static class IndexClusterClauseContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER() { return getToken(SQLServerStatementParser.NUMBER, 0); }
		public IndexOnClauseContext indexOnClause() {
			return getRuleContext(IndexOnClauseContext.class,0);
		}
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public IndexClusterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexClusterClause; }
	}

	public final IndexClusterClauseContext indexClusterClause() throws RecognitionException {
		IndexClusterClauseContext _localctx = new IndexClusterClauseContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_indexClusterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2146);
			match(CLUSTERED);
			setState(2147);
			match(COLUMNSTORE);
			setState(2155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2148);
				match(WITH);
				setState(2149);
				match(COMPRESSION_DELAY);
				setState(2150);
				match(EQ_);
				setState(2151);
				match(NUMBER);
				setState(2153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUTES) {
					{
					setState(2152);
					match(MINUTES);
					}
				}

				}
			}

			setState(2158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2157);
				indexOnClause();
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_dropTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2160);
			match(DROP);
			setState(2161);
			match(TABLE);
			setState(2164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2162);
				match(IF);
				setState(2163);
				match(EXISTS);
				}
			}

			setState(2166);
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
		public TerminalNode TRUNCATE() { return getToken(SQLServerStatementParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_truncateTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2168);
			match(TRUNCATE);
			setState(2169);
			match(TABLE);
			setState(2170);
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

	public static class SetTransactionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public TerminalNode ISOLATION() { return getToken(SQLServerStatementParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(SQLServerStatementParser.LEVEL, 0); }
		public TerminalNode READ() { return getToken(SQLServerStatementParser.READ, 0); }
		public TerminalNode REPEATABLE() { return getToken(SQLServerStatementParser.REPEATABLE, 0); }
		public TerminalNode SNAPSHOT() { return getToken(SQLServerStatementParser.SNAPSHOT, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(SQLServerStatementParser.SERIALIZABLE, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SQLServerStatementParser.UNCOMMITTED, 0); }
		public TerminalNode COMMITTED() { return getToken(SQLServerStatementParser.COMMITTED, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_setTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2172);
			match(SET);
			setState(2173);
			match(TRANSACTION);
			setState(2174);
			match(ISOLATION);
			setState(2175);
			match(LEVEL);
			setState(2182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				{
				setState(2176);
				match(READ);
				setState(2177);
				_la = _input.LA(1);
				if ( !(_la==UNCOMMITTED || _la==COMMITTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case REPEATABLE:
				{
				setState(2178);
				match(REPEATABLE);
				setState(2179);
				match(READ);
				}
				break;
			case SNAPSHOT:
				{
				setState(2180);
				match(SNAPSHOT);
				}
				break;
			case SERIALIZABLE:
				{
				setState(2181);
				match(SERIALIZABLE);
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

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(SQLServerStatementParser.COMMIT, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode DELAYED_DURABILITY() { return getToken(SQLServerStatementParser.DELAYED_DURABILITY, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode WORK() { return getToken(SQLServerStatementParser.WORK, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_commit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2184);
			match(COMMIT);
			setState(2202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(2189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRAN || _la==TRANSACTION) {
					{
					setState(2185);
					_la = _input.LA(1);
					if ( !(_la==TRAN || _la==TRANSACTION) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2187);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(2186);
						match(ID);
						}
					}

					}
				}

				setState(2197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(2191);
					match(WITH);
					setState(2192);
					match(LP_);
					setState(2193);
					match(DELAYED_DURABILITY);
					setState(2194);
					match(EQ_);
					setState(2195);
					_la = _input.LA(1);
					if ( !(_la==OFF || _la==ON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2196);
					match(RP_);
					}
				}

				}
				break;
			case 2:
				{
				setState(2200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(2199);
					match(WORK);
					}
				}

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

	public static class RollbackContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(SQLServerStatementParser.ROLLBACK, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode WORK() { return getToken(SQLServerStatementParser.WORK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_rollback);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
			match(ROLLBACK);
			setState(2212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRAN:
			case TRANSACTION:
				{
				setState(2205);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(2206);
					match(ID);
					}
				}

				}
				break;
			case EOF:
			case SEMI_:
			case WORK:
				{
				setState(2210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(2209);
					match(WORK);
					}
				}

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

	public static class SavepointContext extends ParserRuleContext {
		public TerminalNode SAVE() { return getToken(SQLServerStatementParser.SAVE, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_savepoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2214);
			match(SAVE);
			setState(2215);
			_la = _input.LA(1);
			if ( !(_la==TRAN || _la==TRANSACTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2216);
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
		public TerminalNode BEGIN() { return getToken(SQLServerStatementParser.BEGIN, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode MARK() { return getToken(SQLServerStatementParser.MARK, 0); }
		public TerminalNode STRING() { return getToken(SQLServerStatementParser.STRING, 0); }
		public BeginTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginTransaction; }
	}

	public final BeginTransactionContext beginTransaction() throws RecognitionException {
		BeginTransactionContext _localctx = new BeginTransactionContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_beginTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			match(BEGIN);
			setState(2219);
			_la = _input.LA(1);
			if ( !(_la==TRAN || _la==TRANSACTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(2220);
				match(ID);
				setState(2224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(2221);
					match(WITH);
					setState(2222);
					match(MARK);
					setState(2223);
					match(STRING);
					}
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

	public static class SetAutoCommitContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode IMPLICIT_TRANSACTIONS() { return getToken(SQLServerStatementParser.IMPLICIT_TRANSACTIONS, 0); }
		public AutoCommitValueContext autoCommitValue() {
			return getRuleContext(AutoCommitValueContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public List<TerminalNode> AT_() { return getTokens(SQLServerStatementParser.AT_); }
		public TerminalNode AT_(int i) {
			return getToken(SQLServerStatementParser.AT_, i);
		}
		public TerminalNode TRANCOUNT() { return getToken(SQLServerStatementParser.TRANCOUNT, 0); }
		public TerminalNode GT() { return getToken(SQLServerStatementParser.GT, 0); }
		public TerminalNode NUMBER() { return getToken(SQLServerStatementParser.NUMBER, 0); }
		public TerminalNode COMMIT() { return getToken(SQLServerStatementParser.COMMIT, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public SetAutoCommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAutoCommit; }
	}

	public final SetAutoCommitContext setAutoCommit() throws RecognitionException {
		SetAutoCommitContext _localctx = new SetAutoCommitContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_setAutoCommit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2228);
				match(IF);
				setState(2229);
				match(AT_);
				setState(2230);
				match(AT_);
				setState(2231);
				match(TRANCOUNT);
				setState(2232);
				match(GT);
				setState(2233);
				match(NUMBER);
				setState(2234);
				match(COMMIT);
				setState(2235);
				match(TRAN);
				}
			}

			setState(2238);
			match(SET);
			setState(2239);
			match(IMPLICIT_TRANSACTIONS);
			setState(2240);
			autoCommitValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AutoCommitValueContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public AutoCommitValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoCommitValue; }
	}

	public final AutoCommitValueContext autoCommitValue() throws RecognitionException {
		AutoCommitValueContext _localctx = new AutoCommitValueContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_autoCommitValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2242);
			_la = _input.LA(1);
			if ( !(_la==OFF || _la==ON) ) {
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
		public GrantGeneralContext grantGeneral() {
			return getRuleContext(GrantGeneralContext.class,0);
		}
		public GrantDWContext grantDW() {
			return getRuleContext(GrantDWContext.class,0);
		}
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_grant);
		try {
			setState(2246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2244);
				grantGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2245);
				grantDW();
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

	public static class GrantGeneralContext extends ParserRuleContext {
		public List<TerminalNode> GRANT() { return getTokens(SQLServerStatementParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(SQLServerStatementParser.GRANT, i);
		}
		public GeneralPrisOnContext generalPrisOn() {
			return getRuleContext(GeneralPrisOnContext.class,0);
		}
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(SQLServerStatementParser.OPTION, 0); }
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public GrantGeneralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantGeneral; }
	}

	public final GrantGeneralContext grantGeneral() throws RecognitionException {
		GrantGeneralContext _localctx = new GrantGeneralContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_grantGeneral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2248);
			match(GRANT);
			setState(2249);
			generalPrisOn();
			setState(2250);
			match(TO);
			setState(2251);
			ids();
			setState(2255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2252);
				match(WITH);
				setState(2253);
				match(GRANT);
				setState(2254);
				match(OPTION);
				}
			}

			setState(2259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(2257);
				match(AS);
				setState(2258);
				match(ID);
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

	public static class GeneralPrisOnContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public List<PermissionOnColumnsContext> permissionOnColumns() {
			return getRuleContexts(PermissionOnColumnsContext.class);
		}
		public PermissionOnColumnsContext permissionOnColumns(int i) {
			return getRuleContext(PermissionOnColumnsContext.class,i);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode PRIVILEGES() { return getToken(SQLServerStatementParser.PRIVILEGES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public List<TerminalNode> COLON() { return getTokens(SQLServerStatementParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SQLServerStatementParser.COLON, i);
		}
		public GeneralPrisOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalPrisOn; }
	}

	public final GeneralPrisOnContext generalPrisOn() throws RecognitionException {
		GeneralPrisOnContext _localctx = new GeneralPrisOnContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_generalPrisOn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(2261);
				match(ALL);
				setState(2263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(2262);
					match(PRIVILEGES);
					}
				}

				}
				break;
			case ID:
				{
				setState(2265);
				permissionOnColumns();
				setState(2270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2266);
					match(COMMA);
					setState(2267);
					permissionOnColumns();
					}
					}
					setState(2272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2275);
				match(ON);
				setState(2279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(2276);
					match(ID);
					setState(2277);
					match(COLON);
					setState(2278);
					match(COLON);
					}
					break;
				}
				setState(2281);
				tableName();
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

	public static class PermissionOnColumnsContext extends ParserRuleContext {
		public PermissionContext permission() {
			return getRuleContext(PermissionContext.class,0);
		}
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public PermissionOnColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_permissionOnColumns; }
	}

	public final PermissionOnColumnsContext permissionOnColumns() throws RecognitionException {
		PermissionOnColumnsContext _localctx = new PermissionOnColumnsContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_permissionOnColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2284);
			permission();
			setState(2286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2285);
				columnList();
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

	public static class PermissionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SQLServerStatementParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLServerStatementParser.ID, i);
		}
		public PermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_permission; }
	}

	public final PermissionContext permission() throws RecognitionException {
		PermissionContext _localctx = new PermissionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_permission);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2289); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(2288);
					match(ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2291); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantDWContext extends ParserRuleContext {
		public List<TerminalNode> GRANT() { return getTokens(SQLServerStatementParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(SQLServerStatementParser.GRANT, i);
		}
		public List<PermissionContext> permission() {
			return getRuleContexts(PermissionContext.class);
		}
		public PermissionContext permission(int i) {
			return getRuleContext(PermissionContext.class,i);
		}
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(SQLServerStatementParser.OPTION, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(SQLServerStatementParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SQLServerStatementParser.COLON, i);
		}
		public GrantDWContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantDW; }
	}

	public final GrantDWContext grantDW() throws RecognitionException {
		GrantDWContext _localctx = new GrantDWContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_grantDW);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2293);
			match(GRANT);
			setState(2294);
			permission();
			setState(2299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2295);
				match(COMMA);
				setState(2296);
				permission();
				}
				}
				setState(2301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2302);
				match(ON);
				setState(2307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DATABASE || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LOGIN - 70)) | (1L << (OBJECT - 70)) | (1L << (SCHEMA - 70)))) != 0) || _la==ROLE || _la==USER) {
					{
					setState(2303);
					classType();
					setState(2304);
					match(COLON);
					setState(2305);
					match(COLON);
					}
				}

				setState(2309);
				match(ID);
				}
			}

			setState(2312);
			match(TO);
			setState(2313);
			ids();
			setState(2317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2314);
				match(WITH);
				setState(2315);
				match(GRANT);
				setState(2316);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode DATABASE() { return getToken(SQLServerStatementParser.DATABASE, 0); }
		public TerminalNode OBJECT() { return getToken(SQLServerStatementParser.OBJECT, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLServerStatementParser.SCHEMA, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2319);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LOGIN - 70)) | (1L << (OBJECT - 70)) | (1L << (SCHEMA - 70)))) != 0) || _la==ROLE || _la==USER) ) {
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

	public static class RevokeContext extends ParserRuleContext {
		public RevokeGeneralContext revokeGeneral() {
			return getRuleContext(RevokeGeneralContext.class,0);
		}
		public RevokeDWContext revokeDW() {
			return getRuleContext(RevokeDWContext.class,0);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_revoke);
		try {
			setState(2323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2321);
				revokeGeneral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2322);
				revokeDW();
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

	public static class RevokeGeneralContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(SQLServerStatementParser.REVOKE, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public TerminalNode FROM() { return getToken(SQLServerStatementParser.FROM, 0); }
		public PermissionOnColumnsContext permissionOnColumns() {
			return getRuleContext(PermissionOnColumnsContext.class,0);
		}
		public TerminalNode GRANT() { return getToken(SQLServerStatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(SQLServerStatementParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public List<TerminalNode> ID() { return getTokens(SQLServerStatementParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLServerStatementParser.ID, i);
		}
		public TerminalNode CASCADE() { return getToken(SQLServerStatementParser.CASCADE, 0); }
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public List<TerminalNode> COLON() { return getTokens(SQLServerStatementParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SQLServerStatementParser.COLON, i);
		}
		public TerminalNode PRIVILEGES() { return getToken(SQLServerStatementParser.PRIVILEGES, 0); }
		public RevokeGeneralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revokeGeneral; }
	}

	public final RevokeGeneralContext revokeGeneral() throws RecognitionException {
		RevokeGeneralContext _localctx = new RevokeGeneralContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_revokeGeneral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2325);
			match(REVOKE);
			setState(2329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GRANT) {
				{
				setState(2326);
				match(GRANT);
				setState(2327);
				match(OPTION);
				setState(2328);
				match(FOR);
				}
			}

			setState(2338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
			case FROM:
			case ON:
			case TO:
				{
				setState(2335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(2331);
					match(ALL);
					setState(2333);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PRIVILEGES) {
						{
						setState(2332);
						match(PRIVILEGES);
						}
					}

					}
				}

				}
				break;
			case ID:
				{
				setState(2337);
				permissionOnColumns();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2340);
				match(ON);
				setState(2344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(2341);
					match(ID);
					setState(2342);
					match(COLON);
					setState(2343);
					match(COLON);
					}
					break;
				}
				setState(2346);
				match(ID);
				}
			}

			setState(2349);
			_la = _input.LA(1);
			if ( !(_la==FROM || _la==TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2350);
			ids();
			setState(2352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE) {
				{
				setState(2351);
				match(CASCADE);
				}
			}

			setState(2356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(2354);
				match(AS);
				setState(2355);
				match(ID);
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

	public static class RevokeDWContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(SQLServerStatementParser.REVOKE, 0); }
		public PermissionWithClassContext permissionWithClass() {
			return getRuleContext(PermissionWithClassContext.class,0);
		}
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode CASCADE() { return getToken(SQLServerStatementParser.CASCADE, 0); }
		public TerminalNode FROM() { return getToken(SQLServerStatementParser.FROM, 0); }
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public RevokeDWContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revokeDW; }
	}

	public final RevokeDWContext revokeDW() throws RecognitionException {
		RevokeDWContext _localctx = new RevokeDWContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_revokeDW);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2358);
			match(REVOKE);
			setState(2359);
			permissionWithClass();
			setState(2361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM || _la==TO) {
				{
				setState(2360);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==TO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2363);
			ids();
			setState(2365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE) {
				{
				setState(2364);
				match(CASCADE);
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

	public static class PermissionWithClassContext extends ParserRuleContext {
		public List<PermissionContext> permission() {
			return getRuleContexts(PermissionContext.class);
		}
		public PermissionContext permission(int i) {
			return getRuleContext(PermissionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(SQLServerStatementParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SQLServerStatementParser.COLON, i);
		}
		public PermissionWithClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_permissionWithClass; }
	}

	public final PermissionWithClassContext permissionWithClass() throws RecognitionException {
		PermissionWithClassContext _localctx = new PermissionWithClassContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_permissionWithClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2367);
			permission();
			setState(2372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2368);
				match(COMMA);
				setState(2369);
				permission();
				}
				}
				setState(2374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2375);
				match(ON);
				setState(2380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DATABASE || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LOGIN - 70)) | (1L << (OBJECT - 70)) | (1L << (SCHEMA - 70)))) != 0) || _la==ROLE || _la==USER) {
					{
					setState(2376);
					classType();
					setState(2377);
					match(COLON);
					setState(2378);
					match(COLON);
					}
				}

				setState(2382);
				tableName();
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

	public static class DenyContext extends ParserRuleContext {
		public TerminalNode DENY() { return getToken(SQLServerStatementParser.DENY, 0); }
		public GeneralPrisOnContext generalPrisOn() {
			return getRuleContext(GeneralPrisOnContext.class,0);
		}
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode CASCADE() { return getToken(SQLServerStatementParser.CASCADE, 0); }
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public DenyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deny; }
	}

	public final DenyContext deny() throws RecognitionException {
		DenyContext _localctx = new DenyContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_deny);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2385);
			match(DENY);
			setState(2386);
			generalPrisOn();
			setState(2387);
			match(TO);
			setState(2388);
			ids();
			setState(2390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE) {
				{
				setState(2389);
				match(CASCADE);
				}
			}

			setState(2394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(2392);
				match(AS);
				setState(2393);
				match(ID);
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
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public UserNameContext userName() {
			return getRuleContext(UserNameContext.class,0);
		}
		public CreateUserBody2Context createUserBody2() {
			return getRuleContext(CreateUserBody2Context.class,0);
		}
		public CreateUserBody3Context createUserBody3() {
			return getRuleContext(CreateUserBody3Context.class,0);
		}
		public CreateUserBody1Context createUserBody1() {
			return getRuleContext(CreateUserBody1Context.class,0);
		}
		public CreateUserBody4Context createUserBody4() {
			return getRuleContext(CreateUserBody4Context.class,0);
		}
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2396);
			match(CREATE);
			setState(2397);
			match(USER);
			setState(2405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(2398);
				userName();
				setState(2401);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(2399);
					createUserBody1();
					}
					break;
				case 2:
					{
					setState(2400);
					createUserBody4();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(2403);
				createUserBody2();
				}
				break;
			case 3:
				{
				setState(2404);
				createUserBody3();
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

	public static class CreateUserBody1Context extends ParserRuleContext {
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public OptionsListsContext optionsLists() {
			return getRuleContext(OptionsListsContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode FROM() { return getToken(SQLServerStatementParser.FROM, 0); }
		public CreateUserBody1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUserBody1; }
	}

	public final CreateUserBody1Context createUserBody1() throws RecognitionException {
		CreateUserBody1Context _localctx = new CreateUserBody1Context(_ctx, getState());
		enterRule(_localctx, 400, RULE_createUserBody1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM || _la==FOR) {
				{
				setState(2407);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==FOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2408);
				match(LOGIN);
				setState(2409);
				match(ID);
				}
			}

			setState(2414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2412);
				match(WITH);
				setState(2413);
				optionsLists();
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

	public static class CreateUserBody2Context extends ParserRuleContext {
		public WindowsPrincipalContext windowsPrincipal() {
			return getRuleContext(WindowsPrincipalContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public OptionsListsContext optionsLists() {
			return getRuleContext(OptionsListsContext.class,0);
		}
		public UserNameContext userName() {
			return getRuleContext(UserNameContext.class,0);
		}
		public TerminalNode PASSWORD() { return getToken(SQLServerStatementParser.PASSWORD, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode STRING() { return getToken(SQLServerStatementParser.STRING, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public List<OptionsListContext> optionsList() {
			return getRuleContexts(OptionsListContext.class);
		}
		public OptionsListContext optionsList(int i) {
			return getRuleContext(OptionsListContext.class,i);
		}
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode FROM() { return getToken(SQLServerStatementParser.FROM, 0); }
		public TerminalNode EXTERNAL() { return getToken(SQLServerStatementParser.EXTERNAL, 0); }
		public TerminalNode PROVIDER() { return getToken(SQLServerStatementParser.PROVIDER, 0); }
		public CreateUserBody2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUserBody2; }
	}

	public final CreateUserBody2Context createUserBody2() throws RecognitionException {
		CreateUserBody2Context _localctx = new CreateUserBody2Context(_ctx, getState());
		enterRule(_localctx, 402, RULE_createUserBody2);
		int _la;
		try {
			setState(2437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2416);
				windowsPrincipal();
				setState(2419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(2417);
					match(WITH);
					setState(2418);
					optionsLists();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2421);
				userName();
				setState(2422);
				match(WITH);
				setState(2423);
				match(PASSWORD);
				setState(2424);
				match(EQ_);
				setState(2425);
				match(STRING);
				setState(2430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2426);
					match(COMMA);
					setState(2427);
					optionsList();
					}
					}
					setState(2432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2433);
				match(ID);
				setState(2434);
				match(FROM);
				setState(2435);
				match(EXTERNAL);
				setState(2436);
				match(PROVIDER);
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

	public static class WindowsPrincipalContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SQLServerStatementParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLServerStatementParser.ID, i);
		}
		public TerminalNode BACKSLASH() { return getToken(SQLServerStatementParser.BACKSLASH, 0); }
		public WindowsPrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowsPrincipal; }
	}

	public final WindowsPrincipalContext windowsPrincipal() throws RecognitionException {
		WindowsPrincipalContext _localctx = new WindowsPrincipalContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_windowsPrincipal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2439);
			match(ID);
			setState(2440);
			match(BACKSLASH);
			setState(2441);
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

	public static class CreateUserBody3Context extends ParserRuleContext {
		public WindowsPrincipalContext windowsPrincipal() {
			return getRuleContext(WindowsPrincipalContext.class,0);
		}
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode FROM() { return getToken(SQLServerStatementParser.FROM, 0); }
		public UserNameContext userName() {
			return getRuleContext(UserNameContext.class,0);
		}
		public CreateUserBody3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUserBody3; }
	}

	public final CreateUserBody3Context createUserBody3() throws RecognitionException {
		CreateUserBody3Context _localctx = new CreateUserBody3Context(_ctx, getState());
		enterRule(_localctx, 406, RULE_createUserBody3);
		int _la;
		try {
			setState(2454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2443);
				windowsPrincipal();
				setState(2447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==FOR) {
					{
					setState(2444);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2445);
					match(LOGIN);
					setState(2446);
					match(ID);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2449);
				userName();
				setState(2450);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==FOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2451);
				match(LOGIN);
				setState(2452);
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

	public static class CreateUserBody4Context extends ParserRuleContext {
		public TerminalNode WITHOUT() { return getToken(SQLServerStatementParser.WITHOUT, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public OptionsListsContext optionsLists() {
			return getRuleContext(OptionsListsContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode FROM() { return getToken(SQLServerStatementParser.FROM, 0); }
		public TerminalNode CERTIFICATE() { return getToken(SQLServerStatementParser.CERTIFICATE, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode ASYMMETRIC() { return getToken(SQLServerStatementParser.ASYMMETRIC, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public CreateUserBody4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUserBody4; }
	}

	public final CreateUserBody4Context createUserBody4() throws RecognitionException {
		CreateUserBody4Context _localctx = new CreateUserBody4Context(_ctx, getState());
		enterRule(_localctx, 408, RULE_createUserBody4);
		int _la;
		try {
			setState(2470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITHOUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2456);
				match(WITHOUT);
				setState(2457);
				match(LOGIN);
				setState(2460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(2458);
					match(WITH);
					setState(2459);
					optionsLists();
					}
				}

				}
				break;
			case FROM:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2462);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==FOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2468);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CERTIFICATE:
					{
					setState(2463);
					match(CERTIFICATE);
					setState(2464);
					match(ID);
					}
					break;
				case ASYMMETRIC:
					{
					setState(2465);
					match(ASYMMETRIC);
					setState(2466);
					match(KEY);
					setState(2467);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class OptionsListsContext extends ParserRuleContext {
		public List<OptionsListContext> optionsList() {
			return getRuleContexts(OptionsListContext.class);
		}
		public OptionsListContext optionsList(int i) {
			return getRuleContext(OptionsListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public OptionsListsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsLists; }
	}

	public final OptionsListsContext optionsLists() throws RecognitionException {
		OptionsListsContext _localctx = new OptionsListsContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_optionsLists);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2472);
			optionsList();
			setState(2477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2473);
				match(COMMA);
				setState(2474);
				optionsList();
				}
				}
				setState(2479);
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

	public static class OptionsListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SQLServerStatementParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLServerStatementParser.ID, i);
		}
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public OptionsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsList; }
	}

	public final OptionsListContext optionsList() throws RecognitionException {
		OptionsListContext _localctx = new OptionsListContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_optionsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2480);
			match(ID);
			setState(2481);
			match(EQ_);
			setState(2483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(2482);
				match(ID);
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

	public static class AlterUserContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public UserNameContext userName() {
			return getRuleContext(UserNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public OptionsListsContext optionsLists() {
			return getRuleContext(OptionsListsContext.class,0);
		}
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2485);
			match(ALTER);
			setState(2486);
			match(USER);
			setState(2487);
			userName();
			setState(2488);
			match(WITH);
			setState(2489);
			optionsLists();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public UserNameContext userName() {
			return getRuleContext(UserNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_dropUser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2491);
			match(DROP);
			setState(2492);
			match(USER);
			setState(2495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2493);
				match(IF);
				setState(2494);
				match(EXISTS);
				}
			}

			setState(2497);
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

	public static class CreateLoginContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public WindowsPrincipalContext windowsPrincipal() {
			return getRuleContext(WindowsPrincipalContext.class,0);
		}
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public LoginOptionListContext loginOptionList() {
			return getRuleContext(LoginOptionListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLServerStatementParser.FROM, 0); }
		public SourcesContext sources() {
			return getRuleContext(SourcesContext.class,0);
		}
		public CreateLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createLogin; }
	}

	public final CreateLoginContext createLogin() throws RecognitionException {
		CreateLoginContext _localctx = new CreateLoginContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_createLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2499);
			match(CREATE);
			setState(2500);
			match(LOGIN);
			setState(2503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				{
				setState(2501);
				windowsPrincipal();
				}
				break;
			case 2:
				{
				setState(2502);
				match(ID);
				}
				break;
			}
			setState(2509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
				{
				setState(2505);
				match(WITH);
				setState(2506);
				loginOptionList();
				}
				break;
			case FROM:
				{
				setState(2507);
				match(FROM);
				setState(2508);
				sources();
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

	public static class LoginOptionListContext extends ParserRuleContext {
		public TerminalNode PASSWORD() { return getToken(SQLServerStatementParser.PASSWORD, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode STRING() { return getToken(SQLServerStatementParser.STRING, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode HASHED() { return getToken(SQLServerStatementParser.HASHED, 0); }
		public TerminalNode MUST_CHANGE() { return getToken(SQLServerStatementParser.MUST_CHANGE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public List<OptionsListContext> optionsList() {
			return getRuleContexts(OptionsListContext.class);
		}
		public OptionsListContext optionsList(int i) {
			return getRuleContext(OptionsListContext.class,i);
		}
		public LoginOptionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loginOptionList; }
	}

	public final LoginOptionListContext loginOptionList() throws RecognitionException {
		LoginOptionListContext _localctx = new LoginOptionListContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_loginOptionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2511);
			match(PASSWORD);
			setState(2512);
			match(EQ_);
			setState(2516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(2513);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(2514);
				match(ID);
				setState(2515);
				match(HASHED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUST_CHANGE) {
				{
				setState(2518);
				match(MUST_CHANGE);
				}
			}

			setState(2525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2521);
				match(COMMA);
				setState(2522);
				optionsList();
				}
				}
				setState(2527);
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

	public static class SourcesContext extends ParserRuleContext {
		public TerminalNode WINDOWS() { return getToken(SQLServerStatementParser.WINDOWS, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public OptionsListsContext optionsLists() {
			return getRuleContext(OptionsListsContext.class,0);
		}
		public TerminalNode CERTIFICATE() { return getToken(SQLServerStatementParser.CERTIFICATE, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode ASYMMETRIC() { return getToken(SQLServerStatementParser.ASYMMETRIC, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public SourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sources; }
	}

	public final SourcesContext sources() throws RecognitionException {
		SourcesContext _localctx = new SourcesContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_sources);
		int _la;
		try {
			setState(2538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WINDOWS:
				enterOuterAlt(_localctx, 1);
				{
				setState(2528);
				match(WINDOWS);
				setState(2531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(2529);
					match(WITH);
					setState(2530);
					optionsLists();
					}
				}

				}
				break;
			case CERTIFICATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2533);
				match(CERTIFICATE);
				setState(2534);
				match(ID);
				}
				break;
			case ASYMMETRIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(2535);
				match(ASYMMETRIC);
				setState(2536);
				match(KEY);
				setState(2537);
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

	public static class AlterLoginContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode ENABLE() { return getToken(SQLServerStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(SQLServerStatementParser.DISABLE, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public List<LoginOptionContext> loginOption() {
			return getRuleContexts(LoginOptionContext.class);
		}
		public LoginOptionContext loginOption(int i) {
			return getRuleContext(LoginOptionContext.class,i);
		}
		public CredentialOptionContext credentialOption() {
			return getRuleContext(CredentialOptionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLServerStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLServerStatementParser.COMMA, i);
		}
		public AlterLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterLogin; }
	}

	public final AlterLoginContext alterLogin() throws RecognitionException {
		AlterLoginContext _localctx = new AlterLoginContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_alterLogin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2540);
			match(ALTER);
			setState(2541);
			match(LOGIN);
			setState(2542);
			match(ID);
			setState(2555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENABLE:
				{
				setState(2543);
				match(ENABLE);
				}
				break;
			case DISABLE:
				{
				setState(2544);
				match(DISABLE);
				}
				break;
			case WITH:
				{
				setState(2545);
				match(WITH);
				setState(2546);
				loginOption();
				setState(2551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2547);
					match(COMMA);
					setState(2548);
					loginOption();
					}
					}
					setState(2553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ADD:
			case DROP:
				{
				setState(2554);
				credentialOption();
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

	public static class LoginOptionContext extends ParserRuleContext {
		public TerminalNode PASSWORD() { return getToken(SQLServerStatementParser.PASSWORD, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SQLServerStatementParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SQLServerStatementParser.STRING, i);
		}
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode HASHED() { return getToken(SQLServerStatementParser.HASHED, 0); }
		public TerminalNode OLD_PASSWORD() { return getToken(SQLServerStatementParser.OLD_PASSWORD, 0); }
		public List<PasswordOptionContext> passwordOption() {
			return getRuleContexts(PasswordOptionContext.class);
		}
		public PasswordOptionContext passwordOption(int i) {
			return getRuleContext(PasswordOptionContext.class,i);
		}
		public TerminalNode DEFAULT_DATABASE() { return getToken(SQLServerStatementParser.DEFAULT_DATABASE, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public OptionsListContext optionsList() {
			return getRuleContext(OptionsListContext.class,0);
		}
		public TerminalNode NO() { return getToken(SQLServerStatementParser.NO, 0); }
		public TerminalNode CREDENTIAL() { return getToken(SQLServerStatementParser.CREDENTIAL, 0); }
		public LoginOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loginOption; }
	}

	public final LoginOptionContext loginOption() throws RecognitionException {
		LoginOptionContext _localctx = new LoginOptionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_loginOption);
		int _la;
		try {
			setState(2579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASSWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(2557);
				match(PASSWORD);
				setState(2558);
				match(EQ_);
				setState(2562);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(2559);
					match(STRING);
					}
					break;
				case ID:
					{
					setState(2560);
					match(ID);
					setState(2561);
					match(HASHED);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2571);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OLD_PASSWORD:
					{
					setState(2564);
					match(OLD_PASSWORD);
					setState(2565);
					match(EQ_);
					setState(2566);
					match(STRING);
					}
					break;
				case MUST_CHANGE:
				case UNLOCK:
					{
					setState(2567);
					passwordOption();
					setState(2569);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MUST_CHANGE || _la==UNLOCK) {
						{
						setState(2568);
						passwordOption();
						}
					}

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
			case DEFAULT_DATABASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2573);
				match(DEFAULT_DATABASE);
				setState(2574);
				match(EQ_);
				setState(2575);
				databaseName();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(2576);
				optionsList();
				}
				break;
			case NO:
				enterOuterAlt(_localctx, 4);
				{
				setState(2577);
				match(NO);
				setState(2578);
				match(CREDENTIAL);
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

	public static class PasswordOptionContext extends ParserRuleContext {
		public TerminalNode MUST_CHANGE() { return getToken(SQLServerStatementParser.MUST_CHANGE, 0); }
		public TerminalNode UNLOCK() { return getToken(SQLServerStatementParser.UNLOCK, 0); }
		public PasswordOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passwordOption; }
	}

	public final PasswordOptionContext passwordOption() throws RecognitionException {
		PasswordOptionContext _localctx = new PasswordOptionContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_passwordOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2581);
			_la = _input.LA(1);
			if ( !(_la==MUST_CHANGE || _la==UNLOCK) ) {
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

	public static class CredentialOptionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SQLServerStatementParser.ADD, 0); }
		public TerminalNode CREDENTIAL() { return getToken(SQLServerStatementParser.CREDENTIAL, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public CredentialOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_credentialOption; }
	}

	public final CredentialOptionContext credentialOption() throws RecognitionException {
		CredentialOptionContext _localctx = new CredentialOptionContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_credentialOption);
		try {
			setState(2588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(2583);
				match(ADD);
				setState(2584);
				match(CREDENTIAL);
				setState(2585);
				match(ID);
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(2586);
				match(DROP);
				setState(2587);
				match(CREDENTIAL);
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

	public static class DropLoginContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public DropLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropLogin; }
	}

	public final DropLoginContext dropLogin() throws RecognitionException {
		DropLoginContext _localctx = new DropLoginContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_dropLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2590);
			match(DROP);
			setState(2591);
			match(LOGIN);
			setState(2592);
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

	public static class CreateRoleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public RoleNameContext roleName() {
			return getRuleContext(RoleNameContext.class,0);
		}
		public TerminalNode AUTHORIZATION() { return getToken(SQLServerStatementParser.AUTHORIZATION, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2594);
			match(CREATE);
			setState(2595);
			match(ROLE);
			setState(2596);
			roleName();
			{
			setState(2597);
			match(AUTHORIZATION);
			setState(2598);
			match(ID);
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
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public RoleNameContext roleName() {
			return getRuleContext(RoleNameContext.class,0);
		}
		public TerminalNode MEMBER() { return getToken(SQLServerStatementParser.MEMBER, 0); }
		public TerminalNode ID() { return getToken(SQLServerStatementParser.ID, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode NAME() { return getToken(SQLServerStatementParser.NAME, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode ADD() { return getToken(SQLServerStatementParser.ADD, 0); }
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_alterRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2600);
			match(ALTER);
			setState(2601);
			match(ROLE);
			setState(2602);
			roleName();
			setState(2610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case DROP:
				{
				setState(2603);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2604);
				match(MEMBER);
				setState(2605);
				match(ID);
				}
				break;
			case WITH:
				{
				setState(2606);
				match(WITH);
				setState(2607);
				match(NAME);
				setState(2608);
				match(EQ_);
				setState(2609);
				match(ID);
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
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public RoleNameContext roleName() {
			return getRuleContext(RoleNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_dropRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2612);
			match(DROP);
			setState(2613);
			match(ROLE);
			setState(2616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2614);
				match(IF);
				setState(2615);
				match(EXISTS);
				}
			}

			setState(2618);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 88:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 90:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 93:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 94:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u011d\u0a3f\4\2\t"+
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
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\u01d4\n\2\3\2\5\2\u01d7\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\u01e0\n\3\3\3\3\3\3\3\5\3\u01e5\n\3\3\4\3\4\3\4\3\4\5\4\u01eb\n\4\3"+
		"\5\3\5\3\5\3\5\5\5\u01f1\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u01fd\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0206\n\7\3\7\3\7\3\7\3\7"+
		"\5\7\u020c\n\7\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u0214\n\t\3\t\5\t\u0217\n\t"+
		"\3\t\5\t\u021a\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u0223\n\n\f\n\16\n"+
		"\u0226\13\n\3\13\3\13\3\13\3\13\3\13\7\13\u022d\n\13\f\13\16\13\u0230"+
		"\13\13\3\f\3\f\3\f\5\f\u0235\n\f\3\f\5\f\u0238\n\f\3\r\3\r\3\r\3\16\3"+
		"\16\5\16\u023f\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u0248\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0250\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0258\n\22\3\23\3\23\3\23\3\23\7\23\u025e\n\23\f\23\16\23\u0261"+
		"\13\23\3\23\3\23\3\24\3\24\5\24\u0267\n\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u0274\n\25\5\25\u0276\n\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\5\27\u027f\n\27\3\30\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u0292\n\34"+
		"\f\34\16\34\u0295\13\34\3\35\3\35\5\35\u0299\n\35\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u02a5\n\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \5 \u02b2\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3@\5@\u02f6\n"+
		"@\5@\u02f8\n@\3@\3@\3A\5A\u02fd\nA\3A\3A\3B\3B\3C\3C\3C\7C\u0306\nC\f"+
		"C\16C\u0309\13C\3D\3D\3D\3D\3E\3E\3E\7E\u0312\nE\fE\16E\u0315\13E\3E\3"+
		"E\3E\3E\5E\u031b\nE\3F\3F\5F\u031f\nF\3G\3G\3G\7G\u0324\nG\fG\16G\u0327"+
		"\13G\3H\3H\3H\7H\u032c\nH\fH\16H\u032f\13H\3I\3I\3I\7I\u0334\nI\fI\16"+
		"I\u0337\13I\3J\3J\3J\3J\3K\3K\3K\7K\u0340\nK\fK\16K\u0343\13K\3L\3L\3"+
		"L\3L\3M\3M\3M\7M\u034c\nM\fM\16M\u034f\13M\3N\3N\3N\7N\u0354\nN\fN\16"+
		"N\u0357\13N\3O\3O\3O\7O\u035c\nO\fO\16O\u035f\13O\3P\3P\3P\7P\u0364\n"+
		"P\fP\16P\u0367\13P\3Q\3Q\3Q\3Q\3R\3R\3R\7R\u0370\nR\fR\16R\u0373\13R\3"+
		"S\3S\3S\7S\u0378\nS\fS\16S\u037b\13S\3T\3T\3T\7T\u0380\nT\fT\16T\u0383"+
		"\13T\3U\3U\3U\7U\u0388\nU\fU\16U\u038b\13U\3V\3V\3V\7V\u0390\nV\fV\16"+
		"V\u0393\13V\3W\3W\3W\7W\u0398\nW\fW\16W\u039b\13W\3X\3X\3X\7X\u03a0\n"+
		"X\fX\16X\u03a3\13X\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u03b4"+
		"\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u03c5\nZ\fZ\16Z\u03c8"+
		"\13Z\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u03d2\n\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u03e1\n\\\f\\\16\\\u03e4\13\\\3]\3"+
		"]\3^\3^\5^\u03ea\n^\3^\3^\3^\3^\3^\5^\u03f1\n^\3^\3^\3^\3^\3^\7^\u03f8"+
		"\n^\f^\16^\u03fb\13^\3^\3^\3^\3^\5^\u0401\n^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\5^\u040f\n^\3^\3^\3^\3^\7^\u0415\n^\f^\16^\u0418\13^\3^\3^"+
		"\5^\u041c\n^\3^\3^\3^\3^\5^\u0422\n^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\3_\3_\3_\3_\3_\3_\7_\u044e\n_\f_\16_\u0451\13_\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u046b\n`\3"+
		"`\3`\3`\3`\3`\7`\u0472\n`\f`\16`\u0475\13`\3a\3a\3a\5a\u047a\na\3a\3a"+
		"\5a\u047e\na\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\5f\u0498\nf\3f\3f\3f\5f\u049d\nf\3f\3f\5f\u04a1\nf\5f"+
		"\u04a3\nf\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3l\5l\u04b2\nl\3l\5l\u04b5"+
		"\nl\3m\3m\5m\u04b9\nm\3m\5m\u04bc\nm\3m\3m\3m\3m\3m\3m\3n\3n\3n\3n\5n"+
		"\u04c8\nn\3n\3n\3n\3o\3o\3o\3o\5o\u04d1\no\3o\3o\3o\3o\3p\3p\3p\3q\3q"+
		"\3q\3q\3r\3r\5r\u04e0\nr\3r\3r\3r\3r\7r\u04e6\nr\fr\16r\u04e9\13r\3r\3"+
		"r\5r\u04ed\nr\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r\u04f8\nr\5r\u04fa\nr\3r\3"+
		"r\3r\5r\u04ff\nr\5r\u0501\nr\3r\3r\3r\3r\3r\5r\u0508\nr\5r\u050a\nr\3"+
		"r\3r\3r\3r\3r\7r\u0511\nr\fr\16r\u0514\13r\3r\3r\5r\u0518\nr\3s\3s\3s"+
		"\3s\3s\5s\u051f\ns\3t\3t\3t\3t\3t\3t\3t\3t\3t\3u\3u\3u\5u\u052d\nu\3u"+
		"\3u\3u\3u\5u\u0533\nu\3u\3u\3u\5u\u0538\nu\3u\3u\3u\3u\3u\3u\3u\3u\5u"+
		"\u0542\nu\3u\5u\u0545\nu\5u\u0547\nu\3u\3u\5u\u054b\nu\3u\3u\3u\3u\3u"+
		"\7u\u0552\nu\fu\16u\u0555\13u\3u\3u\5u\u0559\nu\3u\5u\u055c\nu\3u\3u\3"+
		"u\3u\5u\u0562\nu\5u\u0564\nu\3v\3v\3v\3v\3v\3v\3v\3v\3v\5v\u056f\nv\3"+
		"v\3v\3v\3v\3v\3v\3v\5v\u0578\nv\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3"+
		"v\3v\3v\3v\3v\3v\3v\3v\5v\u058e\nv\3v\3v\5v\u0592\nv\3v\3v\3v\3v\3v\3"+
		"v\3v\7v\u059b\nv\fv\16v\u059e\13v\3v\3v\5v\u05a2\nv\3v\3v\3v\3v\3v\3v"+
		"\5v\u05aa\nv\3v\3v\3v\5v\u05af\nv\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w"+
		"\3w\3w\3w\3w\3w\5w\u05c2\nw\3w\3w\5w\u05c6\nw\5w\u05c8\nw\3x\3x\3x\3x"+
		"\3x\3x\3x\3x\3x\5x\u05d3\nx\3y\3y\3y\3y\3y\5y\u05da\ny\3z\3z\3z\3z\3z"+
		"\5z\u05e1\nz\3z\3z\3z\3z\3z\3z\7z\u05e9\nz\fz\16z\u05ec\13z\3z\3z\3z\3"+
		"{\3{\3{\3{\5{\u05f5\n{\3{\5{\u05f8\n{\3{\3{\3{\3{\3|\3|\3|\7|\u0601\n"+
		"|\f|\16|\u0604\13|\3|\3|\3|\7|\u0609\n|\f|\16|\u060c\13|\5|\u060e\n|\3"+
		"|\5|\u0611\n|\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u0620\n}\3}\3"+
		"}\3}\3}\3}\3}\3}\3}\5}\u062a\n}\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u0635\n"+
		"}\3}\5}\u0638\n}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3"+
		"}\3}\3}\3}\7}\u064f\n}\f}\16}\u0652\13}\3}\5}\u0655\n}\3~\3~\5~\u0659"+
		"\n~\3~\3~\3~\5~\u065e\n~\3\177\3\177\5\177\u0662\n\177\3\177\3\177\5\177"+
		"\u0666\n\177\3\u0080\5\u0080\u0669\n\u0080\3\u0080\5\u0080\u066c\n\u0080"+
		"\3\u0080\5\u0080\u066f\n\u0080\3\u0081\3\u0081\5\u0081\u0673\n\u0081\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u067b\n\u0081\f"+
		"\u0081\16\u0081\u067e\13\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\5\u0082\u0686\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\5\u0083\u068d\n\u0083\3\u0084\3\u0084\5\u0084\u0691\n\u0084\3\u0085\3"+
		"\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\7\u0087\u06a6\n\u0087\f\u0087\16\u0087\u06a9\13\u0087\3\u0087\3\u0087"+
		"\5\u0087\u06ad\n\u0087\3\u0088\3\u0088\3\u0088\5\u0088\u06b2\n\u0088\3"+
		"\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u06c4"+
		"\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\5\u008d"+
		"\u06cd\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u06d4\n"+
		"\u008d\f\u008d\16\u008d\u06d7\13\u008d\3\u008d\3\u008d\5\u008d\u06db\n"+
		"\u008d\3\u008d\5\u008d\u06de\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5"+
		"\u008d\u06e4\n\u008d\5\u008d\u06e6\n\u008d\3\u008e\3\u008e\3\u008e\5\u008e"+
		"\u06eb\n\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\5\u0090\u06f2\n"+
		"\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u06f7\n\u0090\3\u0091\3\u0091\3"+
		"\u0091\5\u0091\u06fc\n\u0091\3\u0092\3\u0092\5\u0092\u0700\n\u0092\3\u0093"+
		"\5\u0093\u0703\n\u0093\3\u0093\3\u0093\5\u0093\u0707\n\u0093\3\u0093\5"+
		"\u0093\u070a\n\u0093\3\u0094\3\u0094\3\u0094\5\u0094\u070f\n\u0094\3\u0095"+
		"\3\u0095\5\u0095\u0713\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\7\u0095\u071a\n\u0095\f\u0095\16\u0095\u071d\13\u0095\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u0725\n\u0096\5\u0096\u0727\n"+
		"\u0096\3\u0096\5\u0096\u072a\n\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3"+
		"\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\5\u0098\u073c\n\u0098\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u0748"+
		"\n\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u074d\n\u009b\3\u009b\5\u009b"+
		"\u0750\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\5\u009d"+
		"\u0758\n\u009d\3\u009d\3\u009d\3\u009d\3\u009d\7\u009d\u075e\n\u009d\f"+
		"\u009d\16\u009d\u0761\13\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\5\u009d\u076b\n\u009d\5\u009d\u076d\n\u009d\3"+
		"\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u0775\n\u009e\3"+
		"\u009f\3\u009f\5\u009f\u0779\n\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3"+
		"\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u0784\n\u00a0\f\u00a0\16"+
		"\u00a0\u0787\13\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u0790\n\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u079c\n\u00a2\3\u00a2"+
		"\5\u00a2\u079f\n\u00a2\3\u00a2\3\u00a2\5\u00a2\u07a3\n\u00a2\3\u00a2\3"+
		"\u00a2\5\u00a2\u07a7\n\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3"+
		"\u00a3\3\u00a3\5\u00a3\u07b0\n\u00a3\3\u00a4\5\u00a4\u07b3\n\u00a4\3\u00a4"+
		"\3\u00a4\5\u00a4\u07b7\n\u00a4\3\u00a4\3\u00a4\3\u00a4\7\u00a4\u07bc\n"+
		"\u00a4\f\u00a4\16\u00a4\u07bf\13\u00a4\3\u00a5\3\u00a5\5\u00a5\u07c3\n"+
		"\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\7\u00a6\u07ca\n\u00a6\f"+
		"\u00a6\16\u00a6\u07cd\13\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u07e0\n\u00a7\5\u00a7\u07e2\n\u00a7\3"+
		"\u00a8\3\u00a8\3\u00a8\5\u00a8\u07e7\n\u00a8\3\u00a8\3\u00a8\3\u00a9\3"+
		"\u00a9\3\u00a9\5\u00a9\u07ee\n\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u07f3"+
		"\n\u00a9\f\u00a9\16\u00a9\u07f6\13\u00a9\3\u00aa\5\u00aa\u07f9\n\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u0801\n\u00aa"+
		"\f\u00aa\16\u00aa\u0804\13\u00aa\5\u00aa\u0806\n\u00aa\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u080e\n\u00ab\f\u00ab\16\u00ab"+
		"\u0811\13\u00ab\5\u00ab\u0813\n\u00ab\3\u00ac\3\u00ac\3\u00ac\5\u00ac"+
		"\u0818\n\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u081e\n\u00ac\3"+
		"\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0825\n\u00ac\3\u00ad\3"+
		"\u00ad\3\u00ad\3\u00ad\5\u00ad\u082b\n\u00ad\3\u00ad\3\u00ad\3\u00ae\3"+
		"\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0834\n\u00ae\3\u00af\3\u00af\3"+
		"\u00af\3\u00af\5\u00af\u083a\n\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3"+
		"\u00b0\5\u00b0\u0841\n\u00b0\3\u00b0\5\u00b0\u0844\n\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\5\u00b0\u0849\n\u00b0\3\u00b0\5\u00b0\u084c\n\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0853\n\u00b0\5\u00b0\u0855\n\u00b0"+
		"\3\u00b0\5\u00b0\u0858\n\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\5\u00b2\u0861\n\u00b2\5\u00b2\u0863\n\u00b2\3\u00b3\3"+
		"\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u086c\n\u00b3\5"+
		"\u00b3\u086e\n\u00b3\3\u00b3\5\u00b3\u0871\n\u00b3\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\5\u00b4\u0877\n\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\5\u00b6\u0889\n\u00b6\3\u00b7\3\u00b7\3\u00b7\5\u00b7"+
		"\u088e\n\u00b7\5\u00b7\u0890\n\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3"+
		"\u00b7\3\u00b7\5\u00b7\u0898\n\u00b7\3\u00b7\5\u00b7\u089b\n\u00b7\5\u00b7"+
		"\u089d\n\u00b7\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u08a2\n\u00b8\3\u00b8\5"+
		"\u00b8\u08a5\n\u00b8\5\u00b8\u08a7\n\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u08b3\n\u00ba"+
		"\5\u00ba\u08b5\n\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\5\u00bb\u08bf\n\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bc\3\u00bc\3\u00bd\3\u00bd\5\u00bd\u08c9\n\u00bd\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u08d2\n\u00be\3\u00be"+
		"\3\u00be\5\u00be\u08d6\n\u00be\3\u00bf\3\u00bf\5\u00bf\u08da\n\u00bf\3"+
		"\u00bf\3\u00bf\3\u00bf\7\u00bf\u08df\n\u00bf\f\u00bf\16\u00bf\u08e2\13"+
		"\u00bf\5\u00bf\u08e4\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u08ea"+
		"\n\u00bf\3\u00bf\5\u00bf\u08ed\n\u00bf\3\u00c0\3\u00c0\5\u00c0\u08f1\n"+
		"\u00c0\3\u00c1\6\u00c1\u08f4\n\u00c1\r\u00c1\16\u00c1\u08f5\3\u00c2\3"+
		"\u00c2\3\u00c2\3\u00c2\7\u00c2\u08fc\n\u00c2\f\u00c2\16\u00c2\u08ff\13"+
		"\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0906\n\u00c2\3"+
		"\u00c2\5\u00c2\u0909\n\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5"+
		"\u00c2\u0910\n\u00c2\3\u00c3\3\u00c3\3\u00c4\3\u00c4\5\u00c4\u0916\n\u00c4"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u091c\n\u00c5\3\u00c5\3\u00c5"+
		"\5\u00c5\u0920\n\u00c5\5\u00c5\u0922\n\u00c5\3\u00c5\5\u00c5\u0925\n\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u092b\n\u00c5\3\u00c5\5\u00c5"+
		"\u092e\n\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0933\n\u00c5\3\u00c5\3"+
		"\u00c5\5\u00c5\u0937\n\u00c5\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u093c\n\u00c6"+
		"\3\u00c6\3\u00c6\5\u00c6\u0940\n\u00c6\3\u00c7\3\u00c7\3\u00c7\7\u00c7"+
		"\u0945\n\u00c7\f\u00c7\16\u00c7\u0948\13\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\5\u00c7\u094f\n\u00c7\3\u00c7\5\u00c7\u0952\n\u00c7\3"+
		"\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0959\n\u00c8\3\u00c8\3"+
		"\u00c8\5\u00c8\u095d\n\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5"+
		"\u00c9\u0964\n\u00c9\3\u00c9\3\u00c9\5\u00c9\u0968\n\u00c9\3\u00ca\3\u00ca"+
		"\3\u00ca\5\u00ca\u096d\n\u00ca\3\u00ca\3\u00ca\5\u00ca\u0971\n\u00ca\3"+
		"\u00cb\3\u00cb\3\u00cb\5\u00cb\u0976\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\7\u00cb\u097f\n\u00cb\f\u00cb\16\u00cb"+
		"\u0982\13\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0988\n\u00cb"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd"+
		"\u0992\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0999\n"+
		"\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u099f\n\u00ce\3\u00ce\3"+
		"\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u09a7\n\u00ce\5\u00ce\u09a9"+
		"\n\u00ce\3\u00cf\3\u00cf\3\u00cf\7\u00cf\u09ae\n\u00cf\f\u00cf\16\u00cf"+
		"\u09b1\13\u00cf\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u09b6\n\u00d0\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\5\u00d2\u09c2\n\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\5\u00d3\u09ca\n\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u09d0\n"+
		"\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u09d7\n\u00d4\3"+
		"\u00d4\5\u00d4\u09da\n\u00d4\3\u00d4\3\u00d4\7\u00d4\u09de\n\u00d4\f\u00d4"+
		"\16\u00d4\u09e1\13\u00d4\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u09e6\n\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u09ed\n\u00d5\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\7\u00d6"+
		"\u09f8\n\u00d6\f\u00d6\16\u00d6\u09fb\13\u00d6\3\u00d6\5\u00d6\u09fe\n"+
		"\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u0a05\n\u00d7\3"+
		"\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u0a0c\n\u00d7\5\u00d7\u0a0e"+
		"\n\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u0a16"+
		"\n\u00d7\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9"+
		"\u0a1f\n\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u0a35\n\u00dc\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\5\u00dd\u0a3b\n\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u08f5"+
		"\6\u00b2\u00b6\u00bc\u00be\u00de\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a"+
		"\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172"+
		"\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a"+
		"\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2"+
		"\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\2\""+
		"\4\2\31\31&&\4\2\u00be\u00be\u00c4\u00c4\4\2ii\u010a\u010a\4\2\30\30M"+
		"M\6\2\24\25YYaa\u00db\u00db\13\2\7\b\30\30\'\'AA]]``oozz|}\4\2[[\u0101"+
		"\u0101\5\2\16\16YYxx\4\2\u0115\u0115\u0118\u0118\6\2\u00c8\u00c8\u00d3"+
		"\u00d3\u00e0\u00e0\u00e2\u00e2\4\2\u00bb\u00bb\u00bd\u00bd\3\2\u00a5\u00ab"+
		"\4\2\u00c3\u00c3\u00de\u00df\4\2\22\22XX\5\2YYaa\u00db\u00db\3\2vw\4\2"+
		"EEpp\5\2CC^^cc\4\2,,\u010c\u010c\4\2$$hh\4\2\u0088\u0088\u00f4\u00f4\4"+
		"\2\u00d3\u00d3\u00f3\u00f3\4\2WW\u00eb\u00eb\4\2\u00f5\u00f5\u00f7\u00f7"+
		"\b\2  RS\u008b\u008c\u008f\u008f\u00f2\u00f2\u0114\u0114\4\2\u0086\u0086"+
		"\u00ee\u00ee\4\2\u0082\u0082\u010f\u010f\b\2\34\34HHZZuu\u0108\u0108\u0112"+
		"\u0112\4\2\u00c9\u00c9\u010e\u010e\4\2\u00c9\u00c9\u00f8\u00f8\4\2UU\u0087"+
		"\u0087\4\2\u00e6\u00e6\u00f6\u00f6\2\u0b18\2\u01d3\3\2\2\2\4\u01d8\3\2"+
		"\2\2\6\u01ea\3\2\2\2\b\u01ec\3\2\2\2\n\u01f4\3\2\2\2\f\u0200\3\2\2\2\16"+
		"\u020d\3\2\2\2\20\u0210\3\2\2\2\22\u021d\3\2\2\2\24\u0227\3\2\2\2\26\u0231"+
		"\3\2\2\2\30\u0239\3\2\2\2\32\u023e\3\2\2\2\34\u0240\3\2\2\2\36\u0247\3"+
		"\2\2\2 \u024f\3\2\2\2\"\u0257\3\2\2\2$\u0259\3\2\2\2&\u0264\3\2\2\2(\u0275"+
		"\3\2\2\2*\u0277\3\2\2\2,\u027b\3\2\2\2.\u0280\3\2\2\2\60\u0283\3\2\2\2"+
		"\62\u0285\3\2\2\2\64\u0288\3\2\2\2\66\u028e\3\2\2\28\u0298\3\2\2\2:\u029a"+
		"\3\2\2\2<\u029e\3\2\2\2>\u02ac\3\2\2\2@\u02b3\3\2\2\2B\u02b5\3\2\2\2D"+
		"\u02b7\3\2\2\2F\u02b9\3\2\2\2H\u02bb\3\2\2\2J\u02bd\3\2\2\2L\u02bf\3\2"+
		"\2\2N\u02c1\3\2\2\2P\u02c3\3\2\2\2R\u02c5\3\2\2\2T\u02c7\3\2\2\2V\u02c9"+
		"\3\2\2\2X\u02cb\3\2\2\2Z\u02cd\3\2\2\2\\\u02cf\3\2\2\2^\u02d1\3\2\2\2"+
		"`\u02d3\3\2\2\2b\u02d5\3\2\2\2d\u02d7\3\2\2\2f\u02d9\3\2\2\2h\u02db\3"+
		"\2\2\2j\u02dd\3\2\2\2l\u02df\3\2\2\2n\u02e1\3\2\2\2p\u02e3\3\2\2\2r\u02e5"+
		"\3\2\2\2t\u02e7\3\2\2\2v\u02e9\3\2\2\2x\u02eb\3\2\2\2z\u02ed\3\2\2\2|"+
		"\u02ef\3\2\2\2~\u02f1\3\2\2\2\u0080\u02fc\3\2\2\2\u0082\u0300\3\2\2\2"+
		"\u0084\u0302\3\2\2\2\u0086\u030a\3\2\2\2\u0088\u031a\3\2\2\2\u008a\u031e"+
		"\3\2\2\2\u008c\u0320\3\2\2\2\u008e\u0328\3\2\2\2\u0090\u0330\3\2\2\2\u0092"+
		"\u0338\3\2\2\2\u0094\u033c\3\2\2\2\u0096\u0344\3\2\2\2\u0098\u0348\3\2"+
		"\2\2\u009a\u0350\3\2\2\2\u009c\u0358\3\2\2\2\u009e\u0360\3\2\2\2\u00a0"+
		"\u0368\3\2\2\2\u00a2\u036c\3\2\2\2\u00a4\u0374\3\2\2\2\u00a6\u037c\3\2"+
		"\2\2\u00a8\u0384\3\2\2\2\u00aa\u038c\3\2\2\2\u00ac\u0394\3\2\2\2\u00ae"+
		"\u039c\3\2\2\2\u00b0\u03a4\3\2\2\2\u00b2\u03b3\3\2\2\2\u00b4\u03c9\3\2"+
		"\2\2\u00b6\u03cb\3\2\2\2\u00b8\u03e5\3\2\2\2\u00ba\u0421\3\2\2\2\u00bc"+
		"\u0423\3\2\2\2\u00be\u046a\3\2\2\2\u00c0\u0476\3\2\2\2\u00c2\u0481\3\2"+
		"\2\2\u00c4\u0483\3\2\2\2\u00c6\u0485\3\2\2\2\u00c8\u0487\3\2\2\2\u00ca"+
		"\u04a2\3\2\2\2\u00cc\u04a4\3\2\2\2\u00ce\u04a6\3\2\2\2\u00d0\u04a8\3\2"+
		"\2\2\u00d2\u04aa\3\2\2\2\u00d4\u04ac\3\2\2\2\u00d6\u04b1\3\2\2\2\u00d8"+
		"\u04b6\3\2\2\2\u00da\u04c3\3\2\2\2\u00dc\u04cc\3\2\2\2\u00de\u04d6\3\2"+
		"\2\2\u00e0\u04d9\3\2\2\2\u00e2\u04df\3\2\2\2\u00e4\u051e\3\2\2\2\u00e6"+
		"\u0520\3\2\2\2\u00e8\u0529\3\2\2\2\u00ea\u05ae\3\2\2\2\u00ec\u05c7\3\2"+
		"\2\2\u00ee\u05c9\3\2\2\2\u00f0\u05d9\3\2\2\2\u00f2\u05db\3\2\2\2\u00f4"+
		"\u05f7\3\2\2\2\u00f6\u05fd\3\2\2\2\u00f8\u0654\3\2\2\2\u00fa\u0658\3\2"+
		"\2\2\u00fc\u0661\3\2\2\2\u00fe\u0668\3\2\2\2\u0100\u0672\3\2\2\2\u0102"+
		"\u0685\3\2\2\2\u0104\u068c\3\2\2\2\u0106\u068e\3\2\2\2\u0108\u0692\3\2"+
		"\2\2\u010a\u0696\3\2\2\2\u010c\u069d\3\2\2\2\u010e\u06b1\3\2\2\2\u0110"+
		"\u06b3\3\2\2\2\u0112\u06b9\3\2\2\2\u0114\u06bc\3\2\2\2\u0116\u06bf\3\2"+
		"\2\2\u0118\u06c9\3\2\2\2\u011a\u06ea\3\2\2\2\u011c\u06ec\3\2\2\2\u011e"+
		"\u06f1\3\2\2\2\u0120\u06f8\3\2\2\2\u0122\u06ff\3\2\2\2\u0124\u0702\3\2"+
		"\2\2\u0126\u070b\3\2\2\2\u0128\u0712\3\2\2\2\u012a\u071e\3\2\2\2\u012c"+
		"\u072b\3\2\2\2\u012e\u0731\3\2\2\2\u0130\u073d\3\2\2\2\u0132\u0741\3\2"+
		"\2\2\u0134\u0743\3\2\2\2\u0136\u0751\3\2\2\2\u0138\u0757\3\2\2\2\u013a"+
		"\u0774\3\2\2\2\u013c\u0778\3\2\2\2\u013e\u077f\3\2\2\2\u0140\u078a\3\2"+
		"\2\2\u0142\u0794\3\2\2\2\u0144\u07a8\3\2\2\2\u0146\u07b2\3\2\2\2\u0148"+
		"\u07c0\3\2\2\2\u014a\u07c4\3\2\2\2\u014c\u07e1\3\2\2\2\u014e\u07e3\3\2"+
		"\2\2\u0150\u07ea\3\2\2\2\u0152\u07f8\3\2\2\2\u0154\u0807\3\2\2\2\u0156"+
		"\u0814\3\2\2\2\u0158\u0826\3\2\2\2\u015a\u082e\3\2\2\2\u015c\u0835\3\2"+
		"\2\2\u015e\u083b\3\2\2\2\u0160\u0859\3\2\2\2\u0162\u085c\3\2\2\2\u0164"+
		"\u0864\3\2\2\2\u0166\u0872\3\2\2\2\u0168\u087a\3\2\2\2\u016a\u087e\3\2"+
		"\2\2\u016c\u088a\3\2\2\2\u016e\u089e\3\2\2\2\u0170\u08a8\3\2\2\2\u0172"+
		"\u08ac\3\2\2\2\u0174\u08be\3\2\2\2\u0176\u08c4\3\2\2\2\u0178\u08c8\3\2"+
		"\2\2\u017a\u08ca\3\2\2\2\u017c\u08e3\3\2\2\2\u017e\u08ee\3\2\2\2\u0180"+
		"\u08f3\3\2\2\2\u0182\u08f7\3\2\2\2\u0184\u0911\3\2\2\2\u0186\u0915\3\2"+
		"\2\2\u0188\u0917\3\2\2\2\u018a\u0938\3\2\2\2\u018c\u0941\3\2\2\2\u018e"+
		"\u0953\3\2\2\2\u0190\u095e\3\2\2\2\u0192\u096c\3\2\2\2\u0194\u0987\3\2"+
		"\2\2\u0196\u0989\3\2\2\2\u0198\u0998\3\2\2\2\u019a\u09a8\3\2\2\2\u019c"+
		"\u09aa\3\2\2\2\u019e\u09b2\3\2\2\2\u01a0\u09b7\3\2\2\2\u01a2\u09bd\3\2"+
		"\2\2\u01a4\u09c5\3\2\2\2\u01a6\u09d1\3\2\2\2\u01a8\u09ec\3\2\2\2\u01aa"+
		"\u09ee\3\2\2\2\u01ac\u0a15\3\2\2\2\u01ae\u0a17\3\2\2\2\u01b0\u0a1e\3\2"+
		"\2\2\u01b2\u0a20\3\2\2\2\u01b4\u0a24\3\2\2\2\u01b6\u0a2a\3\2\2\2\u01b8"+
		"\u0a36\3\2\2\2\u01ba\u01d4\5\u00d8m\2\u01bb\u01d4\5\u00dan\2\u01bc\u01d4"+
		"\5\u00dco\2\u01bd\u01d4\5\u00dep\2\u01be\u01d4\5\u012e\u0098\2\u01bf\u01d4"+
		"\5\u0166\u00b4\2\u01c0\u01d4\5\u0168\u00b5\2\u01c1\u01d4\5\u0172\u00ba"+
		"\2\u01c2\u01d4\5\u0174\u00bb\2\u01c3\u01d4\5\u016c\u00b7\2\u01c4\u01d4"+
		"\5\u016e\u00b8\2\u01c5\u01d4\5\u016a\u00b6\2\u01c6\u01d4\5\u0170\u00b9"+
		"\2\u01c7\u01d4\5\u0178\u00bd\2\u01c8\u01d4\5\u0186\u00c4\2\u01c9\u01d4"+
		"\5\u018e\u00c8\2\u01ca\u01d4\5\u0190\u00c9\2\u01cb\u01d4\5\u01a0\u00d1"+
		"\2\u01cc\u01d4\5\u01a2\u00d2\2\u01cd\u01d4\5\u01a4\u00d3\2\u01ce\u01d4"+
		"\5\u01aa\u00d6\2\u01cf\u01d4\5\u01b2\u00da\2\u01d0\u01d4\5\u01b4\u00db"+
		"\2\u01d1\u01d4\5\u01b6\u00dc\2\u01d2\u01d4\5\u01b8\u00dd\2\u01d3\u01ba"+
		"\3\2\2\2\u01d3\u01bb\3\2\2\2\u01d3\u01bc\3\2\2\2\u01d3\u01bd\3\2\2\2\u01d3"+
		"\u01be\3\2\2\2\u01d3\u01bf\3\2\2\2\u01d3\u01c0\3\2\2\2\u01d3\u01c1\3\2"+
		"\2\2\u01d3\u01c2\3\2\2\2\u01d3\u01c3\3\2\2\2\u01d3\u01c4\3\2\2\2\u01d3"+
		"\u01c5\3\2\2\2\u01d3\u01c6\3\2\2\2\u01d3\u01c7\3\2\2\2\u01d3\u01c8\3\2"+
		"\2\2\u01d3\u01c9\3\2\2\2\u01d3\u01ca\3\2\2\2\u01d3\u01cb\3\2\2\2\u01d3"+
		"\u01cc\3\2\2\2\u01d3\u01cd\3\2\2\2\u01d3\u01ce\3\2\2\2\u01d3\u01cf\3\2"+
		"\2\2\u01d3\u01d0\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u01d6\3\2\2\2\u01d5\u01d7\7\u00ba\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\3\3\2\2\2\u01d8\u01e4\5f\64\2\u01d9\u01e5\5~@\2\u01da\u01db"+
		"\7\u00ad\2\2\u01db\u01dc\7K\2\2\u01dc\u01e5\7\u00ae\2\2\u01dd\u01df\7"+
		"\u00ad\2\2\u01de\u01e0\t\2\2\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2"+
		"\u01e0\u01e1\3\2\2\2\u01e1\u01e2\5h\65\2\u01e2\u01e3\7\u00ae\2\2\u01e3"+
		"\u01e5\3\2\2\2\u01e4\u01d9\3\2\2\2\u01e4\u01da\3\2\2\2\u01e4\u01dd\3\2"+
		"\2\2\u01e4\u01e5\3\2\2\2\u01e5\5\3\2\2\2\u01e6\u01eb\5\16\b\2\u01e7\u01eb"+
		"\5\b\5\2\u01e8\u01eb\5\n\6\2\u01e9\u01eb\5\f\7\2\u01ea\u01e6\3\2\2\2\u01ea"+
		"\u01e7\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb\7\3\2\2\2"+
		"\u01ec\u01f0\7\u0115\2\2\u01ed\u01ee\7\u00e4\2\2\u01ee\u01ef\7\u00de\2"+
		"\2\u01ef\u01f1\7\u0090\2\2\u01f0\u01ed\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f3\7\u0118\2\2\u01f3\t\3\2\2\2\u01f4\u01f5\7\20"+
		"\2\2\u01f5\u01f6\7\u00ad\2\2\u01f6\u01f7\5\u00b2Z\2\u01f7\u01f8\7\u00e9"+
		"\2\2\u01f8\u01fc\5\4\3\2\u01f9\u01fa\7\u00ad\2\2\u01fa\u01fb\7\u0119\2"+
		"\2\u01fb\u01fd\7\u00ae\2\2\u01fc\u01f9\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u01ff\7\u00ae\2\2\u01ff\13\3\2\2\2\u0200\u0201\7"+
		"\32\2\2\u0201\u0205\5\4\3\2\u0202\u0203\7\u00ad\2\2\u0203\u0204\7\u0119"+
		"\2\2\u0204\u0206\7\u00ae\2\2\u0205\u0202\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0208\7\u00b3\2\2\u0208\u020b\5\u00b2Z\2\u0209\u020a"+
		"\7\u00b3\2\2\u020a\u020c\7\u0119\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3"+
		"\2\2\2\u020c\r\3\2\2\2\u020d\u020e\5\u00c0a\2\u020e\u020f\5\20\t\2\u020f"+
		"\17\3\2\2\2\u0210\u0211\7_\2\2\u0211\u0213\7\u00ad\2\2\u0212\u0214\5\22"+
		"\n\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215"+
		"\u0217\5\24\13\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\3"+
		"\2\2\2\u0218\u021a\5\30\r\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u021c\7\u00ae\2\2\u021c\21\3\2\2\2\u021d\u021e\7"+
		"\u00d7\2\2\u021e\u021f\7\u00c2\2\2\u021f\u0224\5\u00b2Z\2\u0220\u0221"+
		"\7\u00b3\2\2\u0221\u0223\5\u00b2Z\2\u0222\u0220\3\2\2\2\u0223\u0226\3"+
		"\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\23\3\2\2\2\u0226"+
		"\u0224\3\2\2\2\u0227\u0228\7\u00d6\2\2\u0228\u0229\7\u00c2\2\2\u0229\u022e"+
		"\5\26\f\2\u022a\u022b\7\u00b3\2\2\u022b\u022d\5\26\f\2\u022c\u022a\3\2"+
		"\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\25\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0234\5\u00b2Z\2\u0232\u0233\7\23"+
		"\2\2\u0233\u0235\5N(\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237"+
		"\3\2\2\2\u0236\u0238\t\3\2\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\27\3\2\2\2\u0239\u023a\t\4\2\2\u023a\u023b\5\32\16\2\u023b\31\3\2\2\2"+
		"\u023c\u023f\5 \21\2\u023d\u023f\5\34\17\2\u023e\u023c\3\2\2\2\u023e\u023d"+
		"\3\2\2\2\u023f\33\3\2\2\2\u0240\u0241\7\u00bf\2\2\u0241\u0242\5\36\20"+
		"\2\u0242\u0243\7\u00bc\2\2\u0243\u0244\5\36\20\2\u0244\35\3\2\2\2\u0245"+
		"\u0248\5 \21\2\u0246\u0248\5\"\22\2\u0247\u0245\3\2\2\2\u0247\u0246\3"+
		"\2\2\2\u0248\37\3\2\2\2\u0249\u024a\7\u0085\2\2\u024a\u0250\7f\2\2\u024b"+
		"\u024c\7\u0119\2\2\u024c\u0250\7f\2\2\u024d\u024e\7\u00f1\2\2\u024e\u0250"+
		"\7\u00db\2\2\u024f\u0249\3\2\2\2\u024f\u024b\3\2\2\2\u024f\u024d\3\2\2"+
		"\2\u0250!\3\2\2\2\u0251\u0252\7\u0085\2\2\u0252\u0258\78\2\2\u0253\u0254"+
		"\7\u0119\2\2\u0254\u0258\78\2\2\u0255\u0256\7\u00f1\2\2\u0256\u0258\7"+
		"\u00db\2\2\u0257\u0251\3\2\2\2\u0257\u0253\3\2\2\2\u0257\u0255\3\2\2\2"+
		"\u0258#\3\2\2\2\u0259\u025a\7\u00ad\2\2\u025a\u025f\5&\24\2\u025b\u025c"+
		"\7\u00b3\2\2\u025c\u025e\5&\24\2\u025d\u025b\3\2\2\2\u025e\u0261\3\2\2"+
		"\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u025f"+
		"\3\2\2\2\u0262\u0263\7\u00ae\2\2\u0263%\3\2\2\2\u0264\u0266\5H%\2\u0265"+
		"\u0267\t\3\2\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\'\3\2\2\2"+
		"\u0268\u0269\7\66\2\2\u0269\u026a\7\u00a5\2\2\u026a\u0276\7\u0119\2\2"+
		"\u026b\u0276\5.\30\2\u026c\u026d\t\5\2\2\u026d\u0276\5,\27\2\u026e\u026f"+
		"\7L\2\2\u026f\u0270\7\u00a5\2\2\u0270\u0276\7\u0119\2\2\u0271\u0273\5"+
		"*\26\2\u0272\u0274\5\64\33\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"\u0276\3\2\2\2\u0275\u0268\3\2\2\2\u0275\u026b\3\2\2\2\u0275\u026c\3\2"+
		"\2\2\u0275\u026e\3\2\2\2\u0275\u0271\3\2\2\2\u0276)\3\2\2\2\u0277\u0278"+
		"\7\36\2\2\u0278\u0279\7\u00a5\2\2\u0279\u027a\t\6\2\2\u027a+\3\2\2\2\u027b"+
		"\u027c\7\u00a5\2\2\u027c\u027e\7\u0119\2\2\u027d\u027f\7Q\2\2\u027e\u027d"+
		"\3\2\2\2\u027e\u027f\3\2\2\2\u027f-\3\2\2\2\u0280\u0281\5\60\31\2\u0281"+
		"\u0282\5\62\32\2\u0282/\3\2\2\2\u0283\u0284\t\7\2\2\u0284\61\3\2\2\2\u0285"+
		"\u0286\7\u00a5\2\2\u0286\u0287\t\b\2\2\u0287\63\3\2\2\2\u0288\u0289\7"+
		"\u0101\2\2\u0289\u028a\7b\2\2\u028a\u028b\7\u00ad\2\2\u028b\u028c\5\66"+
		"\34\2\u028c\u028d\7\u00ae\2\2\u028d\65\3\2\2\2\u028e\u0293\58\35\2\u028f"+
		"\u0290\7\u00b3\2\2\u0290\u0292\58\35\2\u0291\u028f\3\2\2\2\u0292\u0295"+
		"\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\67\3\2\2\2\u0295"+
		"\u0293\3\2\2\2\u0296\u0299\7\u0119\2\2\u0297\u0299\5:\36\2\u0298\u0296"+
		"\3\2\2\2\u0298\u0297\3\2\2\2\u02999\3\2\2\2\u029a\u029b\7\u0119\2\2\u029b"+
		"\u029c\7\u010e\2\2\u029c\u029d\7\u0119\2\2\u029d;\3\2\2\2\u029e\u029f"+
		"\7\u008a\2\2\u029f\u02a0\7\u00ad\2\2\u02a0\u02a1\7M\2\2\u02a1\u02a2\7"+
		"\u00a5\2\2\u02a2\u02a4\7\u0119\2\2\u02a3\u02a5\7Q\2\2\u02a4\u02a3\3\2"+
		"\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\7\u00b3\2\2\u02a7"+
		"\u02a8\7\4\2\2\u02a8\u02a9\7\u00a5\2\2\u02a9\u02aa\t\t\2\2\u02aa\u02ab"+
		"\7\u00ae\2\2\u02ab=\3\2\2\2\u02ac\u02b1\7\u0101\2\2\u02ad\u02ae\7\u00ad"+
		"\2\2\u02ae\u02af\5<\37\2\u02af\u02b0\7\u00ae\2\2\u02b0\u02b2\3\2\2\2\u02b1"+
		"\u02ad\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2?\3\2\2\2\u02b3\u02b4\7\u0115"+
		"\2\2\u02b4A\3\2\2\2\u02b5\u02b6\7\u0115\2\2\u02b6C\3\2\2\2\u02b7\u02b8"+
		"\7\u0115\2\2\u02b8E\3\2\2\2\u02b9\u02ba\7\u0115\2\2\u02baG\3\2\2\2\u02bb"+
		"\u02bc\7\u0115\2\2\u02bcI\3\2\2\2\u02bd\u02be\7\u0115\2\2\u02beK\3\2\2"+
		"\2\u02bf\u02c0\7\u0115\2\2\u02c0M\3\2\2\2\u02c1\u02c2\t\n\2\2\u02c2O\3"+
		"\2\2\2\u02c3\u02c4\7\u0115\2\2\u02c4Q\3\2\2\2\u02c5\u02c6\7\u0115\2\2"+
		"\u02c6S\3\2\2\2\u02c7\u02c8\7\u0115\2\2\u02c8U\3\2\2\2\u02c9\u02ca\7\u0115"+
		"\2\2\u02caW\3\2\2\2\u02cb\u02cc\7\u0115\2\2\u02ccY\3\2\2\2\u02cd\u02ce"+
		"\7\u0115\2\2\u02ce[\3\2\2\2\u02cf\u02d0\7\u0115\2\2\u02d0]\3\2\2\2\u02d1"+
		"\u02d2\7\u0115\2\2\u02d2_\3\2\2\2\u02d3\u02d4\7\u0115\2\2\u02d4a\3\2\2"+
		"\2\u02d5\u02d6\7\u0115\2\2\u02d6c\3\2\2\2\u02d7\u02d8\7\u0115\2\2\u02d8"+
		"e\3\2\2\2\u02d9\u02da\7\u0115\2\2\u02dag\3\2\2\2\u02db\u02dc\7\u0115\2"+
		"\2\u02dci\3\2\2\2\u02dd\u02de\7\u0115\2\2\u02dek\3\2\2\2\u02df\u02e0\7"+
		"\u0115\2\2\u02e0m\3\2\2\2\u02e1\u02e2\7\u0115\2\2\u02e2o\3\2\2\2\u02e3"+
		"\u02e4\7\u0115\2\2\u02e4q\3\2\2\2\u02e5\u02e6\t\n\2\2\u02e6s\3\2\2\2\u02e7"+
		"\u02e8\7\u0115\2\2\u02e8u\3\2\2\2\u02e9\u02ea\7\u0115\2\2\u02eaw\3\2\2"+
		"\2\u02eb\u02ec\7\u0115\2\2\u02ecy\3\2\2\2\u02ed\u02ee\t\n\2\2\u02ee{\3"+
		"\2\2\2\u02ef\u02f0\7\u0115\2\2\u02f0}\3\2\2\2\u02f1\u02f7\7\u00ad\2\2"+
		"\u02f2\u02f5\7\u0119\2\2\u02f3\u02f4\7\u00b3\2\2\u02f4\u02f6\7\u0119\2"+
		"\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8\3\2\2\2\u02f7\u02f2"+
		"\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\7\u00ae\2"+
		"\2\u02fa\177\3\2\2\2\u02fb\u02fd\7\u00d8\2\2\u02fc\u02fb\3\2\2\2\u02fc"+
		"\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\7\u00ce\2\2\u02ff\u0081"+
		"\3\2\2\2\u0300\u0301\7\3\2\2\u0301\u0083\3\2\2\2\u0302\u0307\7\u0115\2"+
		"\2\u0303\u0304\7\u00b3\2\2\u0304\u0306\7\u0115\2\2\u0305\u0303\3\2\2\2"+
		"\u0306\u0309\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0085"+
		"\3\2\2\2\u0309\u0307\3\2\2\2\u030a\u030b\7\u00ad\2\2\u030b\u030c\5\u0084"+
		"C\2\u030c\u030d\7\u00ae\2\2\u030d\u0087\3\2\2\2\u030e\u0313\5\u008aF\2"+
		"\u030f\u0310\7\u00b3\2\2\u0310\u0312\5\u008aF\2\u0311\u030f\3\2\2\2\u0312"+
		"\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u031b\3\2"+
		"\2\2\u0315\u0313\3\2\2\2\u0316\u0317\5\u008aF\2\u0317\u0318\7\u00d4\2"+
		"\2\u0318\u0319\5\u008aF\2\u0319\u031b\3\2\2\2\u031a\u030e\3\2\2\2\u031a"+
		"\u0316\3\2\2\2\u031b\u0089\3\2\2\2\u031c\u031f\5\u00ceh\2\u031d\u031f"+
		"\5\u00ccg\2\u031e\u031c\3\2\2\2\u031e\u031d\3\2\2\2\u031f\u008b\3\2\2"+
		"\2\u0320\u0325\5@!\2\u0321\u0322\7\u00b3\2\2\u0322\u0324\5@!\2\u0323\u0321"+
		"\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u008d\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u032d\5B\"\2\u0329\u032a\7\u00b3"+
		"\2\2\u032a\u032c\5B\"\2\u032b\u0329\3\2\2\2\u032c\u032f\3\2\2\2\u032d"+
		"\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u008f\3\2\2\2\u032f\u032d\3\2"+
		"\2\2\u0330\u0335\5D#\2\u0331\u0332\7\u00b3\2\2\u0332\u0334\5D#\2\u0333"+
		"\u0331\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2"+
		"\2\2\u0336\u0091\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u0339\7\u00ad\2\2\u0339"+
		"\u033a\5\u0094K\2\u033a\u033b\7\u00ae\2\2\u033b\u0093\3\2\2\2\u033c\u0341"+
		"\5F$\2\u033d\u033e\7\u00b3\2\2\u033e\u0340\5F$\2\u033f\u033d\3\2\2\2\u0340"+
		"\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0095\3\2"+
		"\2\2\u0343\u0341\3\2\2\2\u0344\u0345\7\u00ad\2\2\u0345\u0346\5\u0098M"+
		"\2\u0346\u0347\7\u00ae\2\2\u0347\u0097\3\2\2\2\u0348\u034d\5H%\2\u0349"+
		"\u034a\7\u00b3\2\2\u034a\u034c\5H%\2\u034b\u0349\3\2\2\2\u034c\u034f\3"+
		"\2\2\2\u034d\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0099\3\2\2\2\u034f"+
		"\u034d\3\2\2\2\u0350\u0355\5J&\2\u0351\u0352\7\u00b3\2\2\u0352\u0354\5"+
		"J&\2\u0353\u0351\3\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u009b\3\2\2\2\u0357\u0355\3\2\2\2\u0358\u035d\5L"+
		"\'\2\u0359\u035a\7\u00b3\2\2\u035a\u035c\5L\'\2\u035b\u0359\3\2\2\2\u035c"+
		"\u035f\3\2\2\2\u035d\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u009d\3\2"+
		"\2\2\u035f\u035d\3\2\2\2\u0360\u0365\5P)\2\u0361\u0362\7\u00b3\2\2\u0362"+
		"\u0364\5P)\2\u0363\u0361\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2"+
		"\2\u0365\u0366\3\2\2\2\u0366\u009f\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u0369"+
		"\7\u00ad\2\2\u0369\u036a\5\u009eP\2\u036a\u036b\7\u00ae\2\2\u036b\u00a1"+
		"\3\2\2\2\u036c\u0371\5f\64\2\u036d\u036e\7\u00b3\2\2\u036e\u0370\5f\64"+
		"\2\u036f\u036d\3\2\2\2\u0370\u0373\3\2\2\2\u0371\u036f\3\2\2\2\u0371\u0372"+
		"\3\2\2\2\u0372\u00a3\3\2\2\2\u0373\u0371\3\2\2\2\u0374\u0379\5Z.\2\u0375"+
		"\u0376\7\u00b3\2\2\u0376\u0378\5Z.\2\u0377\u0375\3\2\2\2\u0378\u037b\3"+
		"\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u00a5\3\2\2\2\u037b"+
		"\u0379\3\2\2\2\u037c\u0381\5r:\2\u037d\u037e\7\u00b3\2\2\u037e\u0380\5"+
		"r:\2\u037f\u037d\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f\3\2\2\2\u0381"+
		"\u0382\3\2\2\2\u0382\u00a7\3\2\2\2\u0383\u0381\3\2\2\2\u0384\u0389\5z"+
		">\2\u0385\u0386\7\u00b3\2\2\u0386\u0388\5z>\2\u0387\u0385\3\2\2\2\u0388"+
		"\u038b\3\2\2\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u00a9\3\2"+
		"\2\2\u038b\u0389\3\2\2\2\u038c\u0391\5|?\2\u038d\u038e\7\u00b3\2\2\u038e"+
		"\u0390\5|?\2\u038f\u038d\3\2\2\2\u0390\u0393\3\2\2\2\u0391\u038f\3\2\2"+
		"\2\u0391\u0392\3\2\2\2\u0392\u00ab\3\2\2\2\u0393\u0391\3\2\2\2\u0394\u0399"+
		"\5\u00bc_\2\u0395\u0396\7\u00b3\2\2\u0396\u0398\5\u00bc_\2\u0397\u0395"+
		"\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a"+
		"\u00ad\3\2\2\2\u039b\u0399\3\2\2\2\u039c\u03a1\5\u00b2Z\2\u039d\u039e"+
		"\7\u00b3\2\2\u039e\u03a0\5\u00b2Z\2\u039f\u039d\3\2\2\2\u03a0\u03a3\3"+
		"\2\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u00af\3\2\2\2\u03a3"+
		"\u03a1\3\2\2\2\u03a4\u03a5\7\u00ad\2\2\u03a5\u03a6\5\u00aeX\2\u03a6\u03a7"+
		"\7\u00ae\2\2\u03a7\u00b1\3\2\2\2\u03a8\u03a9\bZ\1\2\u03a9\u03aa\7\u00ad"+
		"\2\2\u03aa\u03ab\5\u00b2Z\2\u03ab\u03ac\7\u00ae\2\2\u03ac\u03b4\3\2\2"+
		"\2\u03ad\u03ae\7\u00d2\2\2\u03ae\u03b4\5\u00b2Z\b\u03af\u03b0\7\u0093"+
		"\2\2\u03b0\u03b4\5\u00b2Z\7\u03b1\u03b4\5\u00b6\\\2\u03b2\u03b4\5\u00b4"+
		"[\2\u03b3\u03a8\3\2\2\2\u03b3\u03ad\3\2\2\2\u03b3\u03af\3\2\2\2\u03b3"+
		"\u03b1\3\2\2\2\u03b3\u03b2\3\2\2\2\u03b4\u03c6\3\2\2\2\u03b5\u03b6\f\f"+
		"\2\2\u03b6\u03b7\7\u00bc\2\2\u03b7\u03c5\5\u00b2Z\r\u03b8\u03b9\f\13\2"+
		"\2\u03b9\u03ba\7\u0091\2\2\u03ba\u03c5\5\u00b2Z\f\u03bb\u03bc\f\n\2\2"+
		"\u03bc\u03bd\7\u00e5\2\2\u03bd\u03c5\5\u00b2Z\13\u03be\u03bf\f\6\2\2\u03bf"+
		"\u03c0\7\u00d5\2\2\u03c0\u03c5\5\u00b2Z\7\u03c1\u03c2\f\5\2\2\u03c2\u03c3"+
		"\7\u0092\2\2\u03c3\u03c5\5\u00b2Z\6\u03c4\u03b5\3\2\2\2\u03c4\u03b8\3"+
		"\2\2\2\u03c4\u03bb\3\2\2\2\u03c4\u03be\3\2\2\2\u03c4\u03c1\3\2\2\2\u03c5"+
		"\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u00b3\3\2"+
		"\2\2\u03c8\u03c6\3\2\2\2\u03c9\u03ca\5\u0082B\2\u03ca\u00b5\3\2\2\2\u03cb"+
		"\u03cc\b\\\1\2\u03cc\u03cd\5\u00ba^\2\u03cd\u03e2\3\2\2\2\u03ce\u03cf"+
		"\f\7\2\2\u03cf\u03d1\7\u00cd\2\2\u03d0\u03d2\7\u00d2\2\2\u03d1\u03d0\3"+
		"\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03e1\t\13\2\2\u03d4"+
		"\u03d5\f\6\2\2\u03d5\u03d6\7\u00a3\2\2\u03d6\u03e1\5\u00ba^\2\u03d7\u03d8"+
		"\f\5\2\2\u03d8\u03d9\5\u00b8]\2\u03d9\u03da\5\u00ba^\2\u03da\u03e1\3\2"+
		"\2\2\u03db\u03dc\f\4\2\2\u03dc\u03dd\5\u00b8]\2\u03dd\u03de\t\f\2\2\u03de"+
		"\u03df\5\u00d2j\2\u03df\u03e1\3\2\2\2\u03e0\u03ce\3\2\2\2\u03e0\u03d4"+
		"\3\2\2\2\u03e0\u03d7\3\2\2\2\u03e0\u03db\3\2\2\2\u03e1\u03e4\3\2\2\2\u03e2"+
		"\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u00b7\3\2\2\2\u03e4\u03e2\3\2"+
		"\2\2\u03e5\u03e6\t\r\2\2\u03e6\u00b9\3\2\2\2\u03e7\u03e9\5\u00bc_\2\u03e8"+
		"\u03ea\7\u00d2\2\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb"+
		"\3\2\2\2\u03eb\u03ec\7\u00cc\2\2\u03ec\u03ed\5\u00d2j\2\u03ed\u0422\3"+
		"\2\2\2\u03ee\u03f0\5\u00bc_\2\u03ef\u03f1\7\u00d2\2\2\u03f0\u03ef\3\2"+
		"\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\7\u00cc\2\2\u03f3"+
		"\u03f4\7\u00ad\2\2\u03f4\u03f9\5\u00be`\2\u03f5\u03f6\7\u00b3\2\2\u03f6"+
		"\u03f8\5\u00be`\2\u03f7\u03f5\3\2\2\2\u03f8\u03fb\3\2\2\2\u03f9\u03f7"+
		"\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fc"+
		"\u03fd\7\u00ae\2\2\u03fd\u0422\3\2\2\2\u03fe\u0400\5\u00bc_\2\u03ff\u0401"+
		"\7\u00d2\2\2\u0400\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402\3\2\2"+
		"\2\u0402\u0403\7\u00bf\2\2\u0403\u0404\5\u00be`\2\u0404\u0405\7\u00bc"+
		"\2\2\u0405\u0406\5\u00ba^\2\u0406\u0422\3\2\2\2\u0407\u0408\5\u00bc_\2"+
		"\u0408\u0409\7\u00dd\2\2\u0409\u040a\7\u00cf\2\2\u040a\u040b\5\u00be`"+
		"\2\u040b\u0422\3\2\2\2\u040c\u040e\5\u00bc_\2\u040d\u040f\7\u00d2\2\2"+
		"\u040e\u040d\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411"+
		"\7\u00cf\2\2\u0411\u0416\5\u00be`\2\u0412\u0413\7\u00c6\2\2\u0413\u0415"+
		"\5\u00be`\2\u0414\u0412\3\2\2\2\u0415\u0418\3\2\2\2\u0416\u0414\3\2\2"+
		"\2\u0416\u0417\3\2\2\2\u0417\u0422\3\2\2\2\u0418\u0416\3\2\2\2\u0419\u041b"+
		"\5\u00bc_\2\u041a\u041c\7\u00d2\2\2\u041b\u041a\3\2\2\2\u041b\u041c\3"+
		"\2\2\2\u041c\u041d\3\2\2\2\u041d\u041e\7\u00d9\2\2\u041e\u041f\5\u00be"+
		"`\2\u041f\u0422\3\2\2\2\u0420\u0422\5\u00bc_\2\u0421\u03e7\3\2\2\2\u0421"+
		"\u03ee\3\2\2\2\u0421\u03fe\3\2\2\2\u0421\u0407\3\2\2\2\u0421\u040c\3\2"+
		"\2\2\u0421\u0419\3\2\2\2\u0421\u0420\3\2\2\2\u0422\u00bb\3\2\2\2\u0423"+
		"\u0424\b_\1\2\u0424\u0425\5\u00be`\2\u0425\u044f\3\2\2\2\u0426\u0427\f"+
		"\20\2\2\u0427\u0428\7\u0095\2\2\u0428\u044e\5\u00bc_\21\u0429\u042a\f"+
		"\17\2\2\u042a\u042b\7\u0096\2\2\u042b\u044e\5\u00bc_\20\u042c\u042d\f"+
		"\16\2\2\u042d\u042e\7\u0097\2\2\u042e\u044e\5\u00bc_\17\u042f\u0430\f"+
		"\r\2\2\u0430\u0431\7\u0098\2\2\u0431\u044e\5\u00bc_\16\u0432\u0433\f\f"+
		"\2\2\u0433\u0434\7\u009c\2\2\u0434\u044e\5\u00bc_\r\u0435\u0436\f\13\2"+
		"\2\u0436\u0437\7\u009d\2\2\u0437\u044e\5\u00bc_\f\u0438\u0439\f\n\2\2"+
		"\u0439\u043a\7\u009e\2\2\u043a\u044e\5\u00bc_\13\u043b\u043c\f\t\2\2\u043c"+
		"\u043d\7\u009f\2\2\u043d\u044e\5\u00bc_\n\u043e\u043f\f\b\2\2\u043f\u0440"+
		"\7\u00d1\2\2\u0440\u044e\5\u00bc_\t\u0441\u0442\f\7\2\2\u0442\u0443\7"+
		"\u009a\2\2\u0443\u044e\5\u00bc_\b\u0444\u0445\f\6\2\2\u0445\u0446\7\u0099"+
		"\2\2\u0446\u044e\5\u00bc_\7\u0447\u0448\f\5\2\2\u0448\u0449\7\u009c\2"+
		"\2\u0449\u044e\5\u00c4c\2\u044a\u044b\f\4\2\2\u044b\u044c\7\u009d\2\2"+
		"\u044c\u044e\5\u00c4c\2\u044d\u0426\3\2\2\2\u044d\u0429\3\2\2\2\u044d"+
		"\u042c\3\2\2\2\u044d\u042f\3\2\2\2\u044d\u0432\3\2\2\2\u044d\u0435\3\2"+
		"\2\2\u044d\u0438\3\2\2\2\u044d\u043b\3\2\2\2\u044d\u043e\3\2\2\2\u044d"+
		"\u0441\3\2\2\2\u044d\u0444\3\2\2\2\u044d\u0447\3\2\2\2\u044d\u044a\3\2"+
		"\2\2\u044e\u0451\3\2\2\2\u044f\u044d\3\2\2\2\u044f\u0450\3\2\2\2\u0450"+
		"\u00bd\3\2\2\2\u0451\u044f\3\2\2\2\u0452\u0453\b`\1\2\u0453\u046b\5\u00c0"+
		"a\2\u0454\u046b\5\u00caf\2\u0455\u046b\5H%\2\u0456\u046b\5\u00c8e\2\u0457"+
		"\u0458\7\u009c\2\2\u0458\u046b\5\u00be`\16\u0459\u045a\7\u009d\2\2\u045a"+
		"\u046b\5\u00be`\r\u045b\u045c\7\u0094\2\2\u045c\u046b\5\u00be`\f\u045d"+
		"\u045e\7\u0093\2\2\u045e\u046b\5\u00be`\13\u045f\u0460\7\u00c0\2\2\u0460"+
		"\u046b\5\u00be`\n\u0461\u046b\5\u00b0Y\2\u0462\u0463\7\u00db\2\2\u0463"+
		"\u046b\5\u00b0Y\2\u0464\u046b\5\u00d2j\2\u0465\u0466\7\u00c7\2\2\u0466"+
		"\u046b\5\u00d2j\2\u0467\u046b\5\u00c6d\2\u0468\u046b\5\u00c4c\2\u0469"+
		"\u046b\5\6\4\2\u046a\u0452\3\2\2\2\u046a\u0454\3\2\2\2\u046a\u0455\3\2"+
		"\2\2\u046a\u0456\3\2\2\2\u046a\u0457\3\2\2\2\u046a\u0459\3\2\2\2\u046a"+
		"\u045b\3\2\2\2\u046a\u045d\3\2\2\2\u046a\u045f\3\2\2\2\u046a\u0461\3\2"+
		"\2\2\u046a\u0462\3\2\2\2\u046a\u0464\3\2\2\2\u046a\u0465\3\2\2\2\u046a"+
		"\u0467\3\2\2\2\u046a\u0468\3\2\2\2\u046a\u0469\3\2\2\2\u046b\u0473\3\2"+
		"\2\2\u046c\u046d\f\17\2\2\u046d\u046e\7\u0091\2\2\u046e\u0472\5\u00be"+
		"`\20\u046f\u0470\f\21\2\2\u0470\u0472\5\u00d4k\2\u0471\u046c\3\2\2\2\u0471"+
		"\u046f\3\2\2\2\u0472\u0475\3\2\2\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2"+
		"\2\2\u0474\u00bf\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u0477\7\u0115\2\2\u0477"+
		"\u0479\7\u00ad\2\2\u0478\u047a\5\u00c2b\2\u0479\u0478\3\2\2\2\u0479\u047a"+
		"\3\2\2\2\u047a\u047d\3\2\2\2\u047b\u047e\5\u00aeX\2\u047c\u047e\7\u009e"+
		"\2\2\u047d\u047b\3\2\2\2\u047d\u047c\3\2\2\2\u047d\u047e\3\2\2\2\u047e"+
		"\u047f\3\2\2\2\u047f\u0480\7\u00ae\2\2\u0480\u00c1\3\2\2\2\u0481\u0482"+
		"\7\u00c5\2\2\u0482\u00c3\3\2\2\2\u0483\u0484\5\u0082B\2\u0484\u00c5\3"+
		"\2\2\2\u0485\u0486\5\u0082B\2\u0486\u00c7\3\2\2\2\u0487\u0488\5\u0082"+
		"B\2\u0488\u00c9\3\2\2\2\u0489\u04a3\5\u00ccg\2\u048a\u04a3\5\u00ceh\2"+
		"\u048b\u04a3\7\u00e0\2\2\u048c\u04a3\7\u00c8\2\2\u048d\u04a3\7\u00d3\2"+
		"\2\u048e\u048f\7\u00af\2\2\u048f\u0490\7\u0115\2\2\u0490\u0491\7\u0118"+
		"\2\2\u0491\u04a3\7\u00b0\2\2\u0492\u04a3\7\u011c\2\2\u0493\u04a3\5\u00d0"+
		"i\2\u0494\u0495\7\u0115\2\2\u0495\u0497\7\u0118\2\2\u0496\u0498\5\u00d4"+
		"k\2\u0497\u0496\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u04a3\3\2\2\2\u0499"+
		"\u049a\t\16\2\2\u049a\u04a3\7\u0118\2\2\u049b\u049d\7\u0115\2\2\u049c"+
		"\u049b\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a0\7\u00c1"+
		"\2\2\u049f\u04a1\5\u00d4k\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1"+
		"\u04a3\3\2\2\2\u04a2\u0489\3\2\2\2\u04a2\u048a\3\2\2\2\u04a2\u048b\3\2"+
		"\2\2\u04a2\u048c\3\2\2\2\u04a2\u048d\3\2\2\2\u04a2\u048e\3\2\2\2\u04a2"+
		"\u0492\3\2\2\2\u04a2\u0493\3\2\2\2\u04a2\u0494\3\2\2\2\u04a2\u0499\3\2"+
		"\2\2\u04a2\u049c\3\2\2\2\u04a3\u00cb\3\2\2\2\u04a4\u04a5\7\u00b8\2\2\u04a5"+
		"\u00cd\3\2\2\2\u04a6\u04a7\7\u0119\2\2\u04a7\u00cf\3\2\2\2\u04a8\u04a9"+
		"\7\u0118\2\2\u04a9\u00d1\3\2\2\2\u04aa\u04ab\5\u0082B\2\u04ab\u00d3\3"+
		"\2\2\2\u04ac\u04ad\5\u0082B\2\u04ad\u00d5\3\2\2\2\u04ae\u04b2\5H%\2\u04af"+
		"\u04b2\5\u00ceh\2\u04b0\u04b2\5\u00b2Z\2\u04b1\u04ae\3\2\2\2\u04b1\u04af"+
		"\3\2\2\2\u04b1\u04b0\3\2\2\2\u04b2\u04b4\3\2\2\2\u04b3\u04b5\t\3\2\2\u04b4"+
		"\u04b3\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u00d7\3\2\2\2\u04b6\u04b8\7\u00f0"+
		"\2\2\u04b7\u04b9\7\u0111\2\2\u04b8\u04b7\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9"+
		"\u04bb\3\2\2\2\u04ba\u04bc\t\17\2\2\u04bb\u04ba\3\2\2\2\u04bb\u04bc\3"+
		"\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\7\u00fd\2\2\u04be\u04bf\5P)\2\u04bf"+
		"\u04c0\7\u0101\2\2\u04c0\u04c1\5F$\2\u04c1\u04c2\5$\23\2\u04c2\u00d9\3"+
		"\2\2\2\u04c3\u04c4\7\u00e7\2\2\u04c4\u04c7\7\u00fd\2\2\u04c5\u04c8\5P"+
		")\2\u04c6\u04c8\7\u00bb\2\2\u04c7\u04c5\3\2\2\2\u04c7\u04c6\3\2\2\2\u04c8"+
		"\u04c9\3\2\2\2\u04c9\u04ca\7\u0101\2\2\u04ca\u04cb\5F$\2\u04cb\u00db\3"+
		"\2\2\2\u04cc\u04cd\7\u00f6\2\2\u04cd\u04d0\7\u00fd\2\2\u04ce\u04cf\7@"+
		"\2\2\u04cf\u04d1\7\u00c7\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1"+
		"\u04d2\3\2\2\2\u04d2\u04d3\5P)\2\u04d3\u04d4\7\u0101\2\2\u04d4\u04d5\5"+
		"F$\2\u04d5\u00dd\3\2\2\2\u04d6\u04d7\5\u00e0q\2\u04d7\u04d8\5\u00e2r\2"+
		"\u04d8\u00df\3\2\2\2\u04d9\u04da\7\u00f0\2\2\u04da\u04db\7\u010d\2\2\u04db"+
		"\u04dc\5F$\2\u04dc\u00e1\3\2\2\2\u04dd\u04de\7\u00e9\2\2\u04de\u04e0\7"+
		"\60\2\2\u04df\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1"+
		"\u04e2\7\u00ad\2\2\u04e2\u04e7\5\u00e4s\2\u04e3\u04e4\7\u00b3\2\2\u04e4"+
		"\u04e6\5\u00e4s\2\u04e5\u04e3\3\2\2\2\u04e6\u04e9\3\2\2\2\u04e7\u04e5"+
		"\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04ec\3\2\2\2\u04e9\u04e7\3\2\2\2\u04ea"+
		"\u04eb\7\u00b3\2\2\u04eb\u04ed\5\u00e6t\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed"+
		"\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04f9\7\u00ae\2\2\u04ef\u04f7\7\u0101"+
		"\2\2\u04f0\u04f1\5@!\2\u04f1\u04f2\7\u00ad\2\2\u04f2\u04f3\5H%\2\u04f3"+
		"\u04f4\7\u00ae\2\2\u04f4\u04f8\3\2\2\2\u04f5\u04f8\5^\60\2\u04f6\u04f8"+
		"\7\u0118\2\2\u04f7\u04f0\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f7\u04f6\3\2\2"+
		"\2\u04f8\u04fa\3\2\2\2\u04f9\u04ef\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u0500"+
		"\3\2\2\2\u04fb\u04fe\7\u0081\2\2\u04fc\u04ff\5^\60\2\u04fd\u04ff\7\u0118"+
		"\2\2\u04fe\u04fc\3\2\2\2\u04fe\u04fd\3\2\2\2\u04ff\u0501\3\2\2\2\u0500"+
		"\u04fb\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0509\3\2\2\2\u0502\u0503\7/"+
		"\2\2\u0503\u0508\5@!\2\u0504\u0505\5^\60\2\u0505\u0506\7\u0118\2\2\u0506"+
		"\u0508\3\2\2\2\u0507\u0502\3\2\2\2\u0507\u0504\3\2\2\2\u0508\u050a\3\2"+
		"\2\2\u0509\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u0517\3\2\2\2\u050b"+
		"\u050c\7\u00e4\2\2\u050c\u050d\7\u00ad\2\2\u050d\u0512\5\u00eav\2\u050e"+
		"\u050f\7\u00b3\2\2\u050f\u0511\5\u00eav\2\u0510\u050e\3\2\2\2\u0511\u0514"+
		"\3\2\2\2\u0512\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0515\3\2\2\2\u0514"+
		"\u0512\3\2\2\2\u0515\u0516\7\u00ae\2\2\u0516\u0518\3\2\2\2\u0517\u050b"+
		"\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u00e3\3\2\2\2\u0519\u051f\5\u00f6|"+
		"\2\u051a\u051f\5\u012a\u0096\2\u051b\u051f\5\u012c\u0097\2\u051c\u051f"+
		"\5\u011e\u0090\2\u051d\u051f\5\u00e8u\2\u051e\u0519\3\2\2\2\u051e\u051a"+
		"\3\2\2\2\u051e\u051b\3\2\2\2\u051e\u051c\3\2\2\2\u051e\u051d\3\2\2\2\u051f"+
		"\u00e5\3\2\2\2\u0520\u0521\7d\2\2\u0521\u0522\7\u00f8\2\2\u0522\u0523"+
		"\7\177\2\2\u0523\u0524\7\u00ad\2\2\u0524\u0525\5H%\2\u0525\u0526\7\u00b3"+
		"\2\2\u0526\u0527\5H%\2\u0527\u0528\7\u00ae\2\2\u0528\u00e7\3\2\2\2\u0529"+
		"\u052a\7\u00fd\2\2\u052a\u0546\5P)\2\u052b\u052d\t\17\2\2\u052c\u052b"+
		"\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u0547\5$\23\2\u052f"+
		"\u0530\7\22\2\2\u0530\u0547\7\24\2\2\u0531\u0533\7X\2\2\u0532\u0531\3"+
		"\2\2\2\u0532\u0533\3\2\2\2\u0533\u0537\3\2\2\2\u0534\u0535\7\24\2\2\u0535"+
		"\u0538\5$\23\2\u0536\u0538\5\u0108\u0085\2\u0537\u0534\3\2\2\2\u0537\u0536"+
		"\3\2\2\2\u0538\u0547\3\2\2\2\u0539\u053a\7\22\2\2\u053a\u0544\7\24\2\2"+
		"\u053b\u053c\7\u00e4\2\2\u053c\u053d\7\u00ad\2\2\u053d\u053e\7\30\2\2"+
		"\u053e\u053f\7\u00a5\2\2\u053f\u0541\7\u0119\2\2\u0540\u0542\7Q\2\2\u0541"+
		"\u0540\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0545\7\u00ae"+
		"\2\2\u0544\u053b\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0547\3\2\2\2\u0546"+
		"\u052c\3\2\2\2\u0546\u052f\3\2\2\2\u0546\u0532\3\2\2\2\u0546\u0539\3\2"+
		"\2\2\u0547\u054a\3\2\2\2\u0548\u0549\7\u00e3\2\2\u0549\u054b\5\u00b2Z"+
		"\2\u054a\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u0558\3\2\2\2\u054c\u054d"+
		"\7\u00e4\2\2\u054d\u054e\7\u00ad\2\2\u054e\u0553\5(\25\2\u054f\u0550\7"+
		"\u00b3\2\2\u0550\u0552\5(\25\2\u0551\u054f\3\2\2\2\u0552\u0555\3\2\2\2"+
		"\u0553\u0551\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0556\3\2\2\2\u0555\u0553"+
		"\3\2\2\2\u0556\u0557\7\u00ae\2\2\u0557\u0559\3\2\2\2\u0558\u054c\3\2\2"+
		"\2\u0558\u0559\3\2\2\2\u0559\u055b\3\2\2\2\u055a\u055c\5\u011a\u008e\2"+
		"\u055b\u055a\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u0563\3\2\2\2\u055d\u0561"+
		"\7/\2\2\u055e\u0562\5`\61\2\u055f\u0562\5@!\2\u0560\u0562\7\u0118\2\2"+
		"\u0561\u055e\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0560\3\2\2\2\u0562\u0564"+
		"\3\2\2\2\u0563\u055d\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u00e9\3\2\2\2\u0565"+
		"\u0566\7\36\2\2\u0566\u0567\7\u00a5\2\2\u0567\u056e\t\20\2\2\u0568\u0569"+
		"\7\u0101\2\2\u0569\u056a\7b\2\2\u056a\u056b\7\u00ad\2\2\u056b\u056c\5"+
		"\66\34\2\u056c\u056d\7\u00ae\2\2\u056d\u056f\3\2\2\2\u056e\u0568\3\2\2"+
		"\2\u056e\u056f\3\2\2\2\u056f\u05af\3\2\2\2\u0570\u0571\7\62\2\2\u0571"+
		"\u0572\7\u00a5\2\2\u0572\u05af\5l\67\2\u0573\u0574\7\61\2\2\u0574\u0577"+
		"\7\u00a5\2\2\u0575\u0578\5N(\2\u0576\u0578\7\35\2\2\u0577\u0575\3\2\2"+
		"\2\u0577\u0576\3\2\2\2\u0578\u05af\3\2\2\2\u0579\u057a\7\64\2\2\u057a"+
		"\u057b\7\u00a5\2\2\u057b\u05af\5b\62\2\u057c\u057d\7\65\2\2\u057d\u057e"+
		"\7\u00a5\2\2\u057e\u05af\5b\62\2\u057f\u0580\7\63\2\2\u0580\u0581\7\u00a5"+
		"\2\2\u0581\u05af\5b\62\2\u0582\u0583\7\u0080\2\2\u0583\u0584\7\u00a5\2"+
		"\2\u0584\u0591\7\u0101\2\2\u0585\u0586\7\u00ad\2\2\u0586\u0587\7>\2\2"+
		"\u0587\u0588\7\u00a5\2\2\u0588\u058d\5F$\2\u0589\u058a\7\u00b3\2\2\u058a"+
		"\u058b\7\37\2\2\u058b\u058c\7\u00a5\2\2\u058c\u058e\t\b\2\2\u058d\u0589"+
		"\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0590\7\u00ae\2"+
		"\2\u0590\u0592\3\2\2\2\u0591\u0585\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u05af"+
		"\3\2\2\2\u0593\u0594\7k\2\2\u0594\u05a9\7\u00a5\2\2\u0595\u05a1\7\u0101"+
		"\2\2\u0596\u0597\7\u00ad\2\2\u0597\u059c\5\u00f4{\2\u0598\u0599\7\u00b3"+
		"\2\2\u0599\u059b\5\u00f4{\2\u059a\u0598\3\2\2\2\u059b\u059e\3\2\2\2\u059c"+
		"\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059f\3\2\2\2\u059e\u059c\3\2"+
		"\2\2\u059f\u05a0\7\u00ae\2\2\u05a0\u05a2\3\2\2\2\u05a1\u0596\3\2\2\2\u05a1"+
		"\u05a2\3\2\2\2\u05a2\u05aa\3\2\2\2\u05a3\u05a4\7[\2\2\u05a4\u05a5\7\u00ad"+
		"\2\2\u05a5\u05a6\7P\2\2\u05a6\u05a7\7\u00a5\2\2\u05a7\u05a8\7c\2\2\u05a8"+
		"\u05aa\7\u00ae\2\2\u05a9\u0595\3\2\2\2\u05a9\u05a3\3\2\2\2\u05aa\u05af"+
		"\3\2\2\2\u05ab\u05af\5\u00ecw\2\u05ac\u05af\5\u00eex\2\u05ad\u05af\5\u00f0"+
		"y\2\u05ae\u0565\3\2\2\2\u05ae\u0570\3\2\2\2\u05ae\u0573\3\2\2\2\u05ae"+
		"\u0579\3\2\2\2\u05ae\u057c\3\2\2\2\u05ae\u057f\3\2\2\2\u05ae\u0582\3\2"+
		"\2\2\u05ae\u0593\3\2\2\2\u05ae\u05ab\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae"+
		"\u05ad\3\2\2\2\u05af\u00eb\3\2\2\2\u05b0\u05b1\7O\2\2\u05b1\u05b2\7\u00a5"+
		"\2\2\u05b2\u05c8\7\u0101\2\2\u05b3\u05b4\7(\2\2\u05b4\u05b5\7\u00a5\2"+
		"\2\u05b5\u05c8\t\21\2\2\u05b6\u05b7\7\u0080\2\2\u05b7\u05b8\7\u00a5\2"+
		"\2\u05b8\u05c5\7\u0101\2\2\u05b9\u05ba\7\u00ad\2\2\u05ba\u05bb\7>\2\2"+
		"\u05bb\u05bc\7\u00a5\2\2\u05bc\u05c1\5F$\2\u05bd\u05be\7\u00b3\2\2\u05be"+
		"\u05bf\7\37\2\2\u05bf\u05c0\7\u00a5\2\2\u05c0\u05c2\t\b\2\2\u05c1\u05bd"+
		"\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\7\u00ae\2"+
		"\2\u05c4\u05c6\3\2\2\2\u05c5\u05b9\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c8"+
		"\3\2\2\2\u05c7\u05b0\3\2\2\2\u05c7\u05b3\3\2\2\2\u05c7\u05b6\3\2\2\2\u05c8"+
		"\u00ed\3\2\2\2\u05c9\u05ca\7%\2\2\u05ca\u05d2\7\u00a5\2\2\u05cb\u05cc"+
		"\79\2\2\u05cc\u05cd\7\u00ad\2\2\u05cd\u05ce\5H%\2\u05ce\u05cf\7\u00ae"+
		"\2\2\u05cf\u05d3\3\2\2\2\u05d0\u05d3\7r\2\2\u05d1\u05d3\7m\2\2\u05d2\u05cb"+
		"\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d2\u05d1\3\2\2\2\u05d3\u00ef\3\2\2\2\u05d4"+
		"\u05d5\7\22\2\2\u05d5\u05d6\7\24\2\2\u05d6\u05da\7\u00fd\2\2\u05d7\u05da"+
		"\7;\2\2\u05d8\u05da\5\u00f2z\2\u05d9\u05d4\3\2\2\2\u05d9\u05d7\3\2\2\2"+
		"\u05d9\u05d8\3\2\2\2\u05da\u00f1\3\2\2\2\u05db\u05dc\7\u00d7\2\2\u05dc"+
		"\u05dd\7\u00ad\2\2\u05dd\u05de\5H%\2\u05de\u05e0\7i\2\2\u05df\u05e1\t"+
		"\22\2\2\u05e0\u05df\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2"+
		"\u05e3\7\u00f8\2\2\u05e3\u05e4\7\u0089\2\2\u05e4\u05e5\7\u00ad\2\2\u05e5"+
		"\u05ea\5\u00be`\2\u05e6\u05e7\7\u00b3\2\2\u05e7\u05e9\5\u00be`\2\u05e8"+
		"\u05e6\3\2\2\2\u05e9\u05ec\3\2\2\2\u05ea\u05e8\3\2\2\2\u05ea\u05eb\3\2"+
		"\2\2\u05eb\u05ed\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ed\u05ee\7\u00ae\2\2\u05ee"+
		"\u05ef\7\u00ae\2\2\u05ef\u00f3\3\2\2\2\u05f0\u05f1\7\67\2\2\u05f1\u05f4"+
		"\7\u00a5\2\2\u05f2\u05f5\7\u00d3\2\2\u05f3\u05f5\5\u00c0a\2\u05f4\u05f2"+
		"\3\2\2\2\u05f4\u05f3\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f8\7\u00b3\2"+
		"\2\u05f7\u05f0\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fa"+
		"\7P\2\2\u05fa\u05fb\7\u00a5\2\2\u05fb\u05fc\t\23\2\2\u05fc\u00f5\3\2\2"+
		"\2\u05fd\u05fe\5H%\2\u05fe\u0602\5\4\3\2\u05ff\u0601\5\u00f8}\2\u0600"+
		"\u05ff\3\2\2\2\u0601\u0604\3\2\2\2\u0602\u0600\3\2\2\2\u0602\u0603\3\2"+
		"\2\2\u0603\u060d\3\2\2\2\u0604\u0602\3\2\2\2\u0605\u060a\5\u00fa~\2\u0606"+
		"\u0607\7\u00b3\2\2\u0607\u0609\5\u00fa~\2\u0608\u0606\3\2\2\2\u0609\u060c"+
		"\3\2\2\2\u060a\u0608\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060e\3\2\2\2\u060c"+
		"\u060a\3\2\2\2\u060d\u0605\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u0610\3\2"+
		"\2\2\u060f\u0611\5\u0118\u008d\2\u0610\u060f\3\2\2\2\u0610\u0611\3\2\2"+
		"\2\u0611\u00f7\3\2\2\2\u0612\u0655\7.\2\2\u0613\u0614\7\23\2\2\u0614\u0655"+
		"\5N(\2\u0615\u0655\7{\2\2\u0616\u0617\7J\2\2\u0617\u0618\7\u00e4\2\2\u0618"+
		"\u0619\7\u00ad\2\2\u0619\u061a\7\u00fa\2\2\u061a\u061b\7\u00a5\2\2\u061b"+
		"\u061c\7\u0118\2\2\u061c\u0655\7\u00ae\2\2\u061d\u061e\7\u00ef\2\2\u061e"+
		"\u0620\5b\62\2\u061f\u061d\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621\3\2"+
		"\2\2\u0621\u0622\7\u00f3\2\2\u0622\u0655\5\u00b2Z\2\u0623\u0629\7?\2\2"+
		"\u0624\u0625\7\u00ad\2\2\u0625\u0626\7\u0119\2\2\u0626\u0627\7\u00b3\2"+
		"\2\u0627\u0628\7\u0119\2\2\u0628\u062a\7\u00ae\2\2\u0629\u0624\3\2\2\2"+
		"\u0629\u062a\3\2\2\2\u062a\u0655\3\2\2\2\u062b\u062c\7\u00d2\2\2\u062c"+
		"\u062d\7\u00f8\2\2\u062d\u0655\7n\2\2\u062e\u062f\7\u00fb\2\2\u062f\u0630"+
		"\7\u00e8\2\2\u0630\u0631\7\u00e9\2\2\u0631\u0632\7\u00db\2\2\u0632\u0634"+
		"\t\24\2\2\u0633\u0635\7<\2\2\u0634\u0633\3\2\2\2\u0634\u0635\3\2\2\2\u0635"+
		"\u0655\3\2\2\2\u0636\u0638\7\u00d2\2\2\u0637\u0636\3\2\2\2\u0637\u0638"+
		"\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u0655\7\u00d3\2\2\u063a\u0655\7s\2"+
		"\2\u063b\u063c\7*\2\2\u063c\u063d\7\u00e4\2\2\u063d\u063e\7\u00ad\2\2"+
		"\u063e\u063f\7\26\2\2\u063f\u0640\7\u00a5\2\2\u0640\u0641\5d\63\2\u0641"+
		"\u0642\7\u00b3\2\2\u0642\u0643\7+\2\2\u0643\u0644\7\u00a5\2\2\u0644\u0645"+
		"\t\25\2\2\u0645\u0646\7\u00b3\2\2\u0646\u0647\7\6\2\2\u0647\u0648\7\u00a5"+
		"\2\2\u0648\u0649\7\u0118\2\2\u0649\u064a\7\u00ae\2\2\u064a\u0655\3\2\2"+
		"\2\u064b\u0650\5\u00fa~\2\u064c\u064d\7\u00b3\2\2\u064d\u064f\5\u00fa"+
		"~\2\u064e\u064c\3\2\2\2\u064f\u0652\3\2\2\2\u0650\u064e\3\2\2\2\u0650"+
		"\u0651\3\2\2\2\u0651\u0655\3\2\2\2\u0652\u0650\3\2\2\2\u0653\u0655\5\u0118"+
		"\u008d\2\u0654\u0612\3\2\2\2\u0654\u0613\3\2\2\2\u0654\u0615\3\2\2\2\u0654"+
		"\u0616\3\2\2\2\u0654\u061f\3\2\2\2\u0654\u0623\3\2\2\2\u0654\u062b\3\2"+
		"\2\2\u0654\u062e\3\2\2\2\u0654\u0637\3\2\2\2\u0654\u063a\3\2\2\2\u0654"+
		"\u063b\3\2\2\2\u0654\u064b\3\2\2\2\u0654\u0653\3\2\2\2\u0655\u00f9\3\2"+
		"\2\2\u0656\u0657\7\u00ef\2\2\u0657\u0659\5b\62\2\u0658\u0656\3\2\2\2\u0658"+
		"\u0659\3\2\2\2\u0659\u065d\3\2\2\2\u065a\u065e\5\u00fc\177\2\u065b\u065e"+
		"\5\u0100\u0081\2\u065c\u065e\5\u0116\u008c\2\u065d\u065a\3\2\2\2\u065d"+
		"\u065b\3\2\2\2\u065d\u065c\3\2\2\2\u065e\u00fb\3\2\2\2\u065f\u0662\5\u0080"+
		"A\2\u0660\u0662\7\u0111\2\2\u0661\u065f\3\2\2\2\u0661\u0660\3\2\2\2\u0662"+
		"\u0665\3\2\2\2\u0663\u0666\5\u00fe\u0080\2\u0664\u0666\5\u0106\u0084\2"+
		"\u0665\u0663\3\2\2\2\u0665\u0664\3\2\2\2\u0666\u00fd\3\2\2\2\u0667\u0669"+
		"\t\17\2\2\u0668\u0667\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066b\3\2\2\2"+
		"\u066a\u066c\5\u010c\u0087\2\u066b\u066a\3\2\2\2\u066b\u066c\3\2\2\2\u066c"+
		"\u066e\3\2\2\2\u066d\u066f\5\u010e\u0088\2\u066e\u066d\3\2\2\2\u066e\u066f"+
		"\3\2\2\2\u066f\u00ff\3\2\2\2\u0670\u0671\7\u00f9\2\2\u0671\u0673\7\u00ce"+
		"\2\2\u0672\u0670\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0674\3\2\2\2\u0674"+
		"\u0675\7\u0106\2\2\u0675\u0676\5F$\2\u0676\u0677\7\u00ad\2\2\u0677\u0678"+
		"\5H%\2\u0678\u067c\7\u00ae\2\2\u0679\u067b\5\u0102\u0082\2\u067a\u0679"+
		"\3\2\2\2\u067b\u067e\3\2\2\2\u067c\u067a\3\2\2\2\u067c\u067d\3\2\2\2\u067d"+
		"\u0101\3\2\2\2\u067e\u067c\3\2\2\2\u067f\u0680\7\u0101\2\2\u0680\u0681"+
		"\t\26\2\2\u0681\u0686\5\u0104\u0083\2\u0682\u0683\7\u00d2\2\2\u0683\u0684"+
		"\7\u00f8\2\2\u0684\u0686\7n\2\2\u0685\u067f\3\2\2\2\u0685\u0682\3\2\2"+
		"\2\u0686\u0103\3\2\2\2\u0687\u0688\7\u0100\2\2\u0688\u068d\7\5\2\2\u0689"+
		"\u068d\7\u00ea\2\2\u068a\u068b\7\u00dc\2\2\u068b\u068d\t\27\2\2\u068c"+
		"\u0687\3\2\2\2\u068c\u0689\3\2\2\2\u068c\u068a\3\2\2\2\u068d\u0105\3\2"+
		"\2\2\u068e\u0690\7\22\2\2\u068f\u0691\5\u010a\u0086\2\u0690\u068f\3\2"+
		"\2\2\u0690\u0691\3\2\2\2\u0691\u0107\3\2\2\2\u0692\u0693\79\2\2\u0693"+
		"\u0694\5$\23\2\u0694\u0695\5\u010a\u0086\2\u0695\u0109\3\2\2\2\u0696\u0697"+
		"\7\u00e4\2\2\u0697\u0698\7\u00ad\2\2\u0698\u0699\7\17\2\2\u0699\u069a"+
		"\7\u00a5\2\2\u069a\u069b\7\u0119\2\2\u069b\u069c\7\u00ae\2\2\u069c\u010b"+
		"\3\2\2\2\u069d\u06ac\7\u00e4\2\2\u069e\u069f\7\66\2\2\u069f\u06a0\7\u00a5"+
		"\2\2\u06a0\u06ad\7\u0119\2\2\u06a1\u06a2\7\u00ad\2\2\u06a2\u06a7\5(\25"+
		"\2\u06a3\u06a4\7\u00b3\2\2\u06a4\u06a6\5(\25\2\u06a5\u06a3\3\2\2\2\u06a6"+
		"\u06a9\3\2\2\2\u06a7\u06a5\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06aa\3\2"+
		"\2\2\u06a9\u06a7\3\2\2\2\u06aa\u06ab\7\u00ae\2\2\u06ab\u06ad\3\2\2\2\u06ac"+
		"\u069e\3\2\2\2\u06ac\u06a1\3\2\2\2\u06ad\u010d\3\2\2\2\u06ae\u06b2\5\u0110"+
		"\u0089\2\u06af\u06b2\5\u0112\u008a\2\u06b0\u06b2\5\u0114\u008b\2\u06b1"+
		"\u06ae\3\2\2\2\u06b1\u06af\3\2\2\2\u06b1\u06b0\3\2\2\2\u06b2\u010f\3\2"+
		"\2\2\u06b3\u06b4\7\u0101\2\2\u06b4\u06b5\5@!\2\u06b5\u06b6\7\u00ad\2\2"+
		"\u06b6\u06b7\5H%\2\u06b7\u06b8\7\u00ae\2\2\u06b8\u0111\3\2\2\2\u06b9\u06ba"+
		"\7\u0101\2\2\u06ba\u06bb\5^\60\2\u06bb\u0113\3\2\2\2\u06bc\u06bd\7\u0101"+
		"\2\2\u06bd\u06be\7\u0118\2\2\u06be\u0115\3\2\2\2\u06bf\u06c3\7\u00eb\2"+
		"\2\u06c0\u06c1\7\u00d2\2\2\u06c1\u06c2\7\u00f8\2\2\u06c2\u06c4\7n\2\2"+
		"\u06c3\u06c0\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c6"+
		"\7\u00ad\2\2\u06c6\u06c7\5\u00b2Z\2\u06c7\u06c8\7\u00ae\2\2\u06c8\u0117"+
		"\3\2\2\2\u06c9\u06ca\7\u00fd\2\2\u06ca\u06cc\5P)\2\u06cb\u06cd\t\17\2"+
		"\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06da\3\2\2\2\u06ce\u06cf"+
		"\7\u00e4\2\2\u06cf\u06d0\7\u00ad\2\2\u06d0\u06d5\5(\25\2\u06d1\u06d2\7"+
		"\u00b3\2\2\u06d2\u06d4\5(\25\2\u06d3\u06d1\3\2\2\2\u06d4\u06d7\3\2\2\2"+
		"\u06d5\u06d3\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d8\3\2\2\2\u06d7\u06d5"+
		"\3\2\2\2\u06d8\u06d9\7\u00ae\2\2\u06d9\u06db\3\2\2\2\u06da\u06ce\3\2\2"+
		"\2\u06da\u06db\3\2\2\2\u06db\u06dd\3\2\2\2\u06dc\u06de\5\u011a\u008e\2"+
		"\u06dd\u06dc\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06e5\3\2\2\2\u06df\u06e3"+
		"\7/\2\2\u06e0\u06e4\5^\60\2\u06e1\u06e4\5@!\2\u06e2\u06e4\7\u0118\2\2"+
		"\u06e3\u06e0\3\2\2\2\u06e3\u06e1\3\2\2\2\u06e3\u06e2\3\2\2\2\u06e4\u06e6"+
		"\3\2\2\2\u06e5\u06df\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u0119\3\2\2\2\u06e7"+
		"\u06eb\5\u0110\u0089\2\u06e8\u06eb\5\u0112\u008a\2\u06e9\u06eb\5\u011c"+
		"\u008f\2\u06ea\u06e7\3\2\2\2\u06ea\u06e8\3\2\2\2\u06ea\u06e9\3\2\2\2\u06eb"+
		"\u011b\3\2\2\2\u06ec\u06ed\7\u0101\2\2\u06ed\u06ee\7\u00f3\2\2\u06ee\u011d"+
		"\3\2\2\2\u06ef\u06f0\7\u00ef\2\2\u06f0\u06f2\5b\62\2\u06f1\u06ef\3\2\2"+
		"\2\u06f1\u06f2\3\2\2\2\u06f2\u06f6\3\2\2\2\u06f3\u06f7\5\u0120\u0091\2"+
		"\u06f4\u06f7\5\u0128\u0095\2\u06f5\u06f7\5\u0116\u008c\2\u06f6\u06f3\3"+
		"\2\2\2\u06f6\u06f4\3\2\2\2\u06f6\u06f5\3\2\2\2\u06f7\u011f\3\2\2\2\u06f8"+
		"\u06fb\5\u0122\u0092\2\u06f9\u06fc\5\u0124\u0093\2\u06fa\u06fc\5\u0126"+
		"\u0094\2\u06fb\u06f9\3\2\2\2\u06fb\u06fa\3\2\2\2\u06fc\u0121\3\2\2\2\u06fd"+
		"\u0700\5\u0080A\2\u06fe\u0700\7\u0111\2\2\u06ff\u06fd\3\2\2\2\u06ff\u06fe"+
		"\3\2\2\2\u0700\u0123\3\2\2\2\u0701\u0703\t\17\2\2\u0702\u0701\3\2\2\2"+
		"\u0702\u0703\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u0706\5$\23\2\u0705\u0707"+
		"\5\u010c\u0087\2\u0706\u0705\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0709\3"+
		"\2\2\2\u0708\u070a\5\u010e\u0088\2\u0709\u0708\3\2\2\2\u0709\u070a\3\2"+
		"\2\2\u070a\u0125\3\2\2\2\u070b\u070e\7X\2\2\u070c\u070f\5$\23\2\u070d"+
		"\u070f\5\u0108\u0085\2\u070e\u070c\3\2\2\2\u070e\u070d\3\2\2\2\u070f\u0127"+
		"\3\2\2\2\u0710\u0711\7\u00f9\2\2\u0711\u0713\7\u00ce\2\2\u0712\u0710\3"+
		"\2\2\2\u0712\u0713\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0715\5$\23\2\u0715"+
		"\u0716\7\u0106\2\2\u0716\u0717\5F$\2\u0717\u071b\5$\23\2\u0718\u071a\5"+
		"\u0102\u0082\2\u0719\u0718\3\2\2\2\u071a\u071d\3\2\2\2\u071b\u0719\3\2"+
		"\2\2\u071b\u071c\3\2\2\2\u071c\u0129\3\2\2\2\u071d\u071b\3\2\2\2\u071e"+
		"\u071f\5H%\2\u071f\u0720\7\u00e9\2\2\u0720\u0726\5\u00b2Z\2\u0721\u0724"+
		"\7e\2\2\u0722\u0723\7\u00d2\2\2\u0723\u0725\7\u00d3\2\2\u0724\u0722\3"+
		"\2\2\2\u0724\u0725\3\2\2\2\u0725\u0727\3\2\2\2\u0726\u0721\3\2\2\2\u0726"+
		"\u0727\3\2\2\2\u0727\u0729\3\2\2\2\u0728\u072a\5\u00fa~\2\u0729\u0728"+
		"\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u012b\3\2\2\2\u072b\u072c\5j\66\2\u072c"+
		"\u072d\7\u0115\2\2\u072d\u072e\7\27\2\2\u072e\u072f\7\u00f8\2\2\u072f"+
		"\u0730\7\t\2\2\u0730\u012d\3\2\2\2\u0731\u073b\5\u0130\u0099\2\u0732\u073c"+
		"\5\u0132\u009a\2\u0733\u073c\5\u0138\u009d\2\u0734\u073c\5\u0144\u00a3"+
		"\2\u0735\u073c\5\u0152\u00aa\2\u0736\u073c\5\u0154\u00ab\2\u0737\u073c"+
		"\5\u0156\u00ac\2\u0738\u073c\5\u0158\u00ad\2\u0739\u073c\5\u00eav\2\u073a"+
		"\u073c\7j\2\2\u073b\u0732\3\2\2\2\u073b\u0733\3\2\2\2\u073b\u0734\3\2"+
		"\2\2\u073b\u0735\3\2\2\2\u073b\u0736\3\2\2\2\u073b\u0737\3\2\2\2\u073b"+
		"\u0738\3\2\2\2\u073b\u0739\3\2\2\2\u073b\u073a\3\2\2\2\u073c\u012f\3\2"+
		"\2\2\u073d\u073e\7\u00e7\2\2\u073e\u073f\7\u010d\2\2\u073f\u0740\5F$\2"+
		"\u0740\u0131\3\2\2\2\u0741\u0742\5\u0134\u009b\2\u0742\u0133\3\2\2\2\u0743"+
		"\u0744\5\u0136\u009c\2\u0744\u0747\5\4\3\2\u0745\u0746\7\23\2\2\u0746"+
		"\u0748\5N(\2\u0747\u0745\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u074c\3\2\2"+
		"\2\u0749\u074d\7\u00d3\2\2\u074a\u074b\7\u00d2\2\2\u074b\u074d\7\u00d3"+
		"\2\2\u074c\u0749\3\2\2\2\u074c\u074a\3\2\2\2\u074c\u074d\3\2\2\2\u074d"+
		"\u074f\3\2\2\2\u074e\u0750\7{\2\2\u074f\u074e\3\2\2\2\u074f\u0750\3\2"+
		"\2\2\u0750\u0135\3\2\2\2\u0751\u0752\7\u00e7\2\2\u0752\u0753\7\u00ec\2"+
		"\2\u0753\u0754\5H%\2\u0754\u0137\3\2\2\2\u0755\u0756\7\u00e4\2\2\u0756"+
		"\u0758\t\30\2\2\u0757\u0755\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u0759\3"+
		"\2\2\2\u0759\u076c\7\u00e6\2\2\u075a\u075f\5\u013a\u009e\2\u075b\u075c"+
		"\7\u00b3\2\2\u075c\u075e\5\u013a\u009e\2\u075d\u075b\3\2\2\2\u075e\u0761"+
		"\3\2\2\2\u075f\u075d\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u076d\3\2\2\2\u0761"+
		"\u075f\3\2\2\2\u0762\u0763\5\u0140\u00a1\2\u0763\u0764\7\u00b3\2\2\u0764"+
		"\u0765\5\u00e6t\2\u0765\u076b\3\2\2\2\u0766\u0767\5\u00e6t\2\u0767\u0768"+
		"\7\u00b3\2\2\u0768\u0769\5\u0140\u00a1\2\u0769\u076b\3\2\2\2\u076a\u0762"+
		"\3\2\2\2\u076a\u0766\3\2\2\2\u076b\u076d\3\2\2\2\u076c\u075a\3\2\2\2\u076c"+
		"\u076a\3\2\2\2\u076d\u0139\3\2\2\2\u076e\u0775\5\u00f6|\2\u076f\u0775"+
		"\5\u012a\u0096\2\u0770\u0775\5\u012c\u0097\2\u0771\u0775\5\u011e\u0090"+
		"\2\u0772\u0775\5\u00e8u\2\u0773\u0775\5\u013c\u009f\2\u0774\u076e\3\2"+
		"\2\2\u0774\u076f\3\2\2\2\u0774\u0770\3\2\2\2\u0774\u0771\3\2\2\2\u0774"+
		"\u0772\3\2\2\2\u0774\u0773\3\2\2\2\u0775\u013b\3\2\2\2\u0776\u0777\7\u00ef"+
		"\2\2\u0777\u0779\5b\62\2\u0778\u0776\3\2\2\2\u0778\u0779\3\2\2\2\u0779"+
		"\u077a\3\2\2\2\u077a\u077b\7\u00f3\2\2\u077b\u077c\5\u00be`\2\u077c\u077d"+
		"\7\u00f8\2\2\u077d\u077e\5H%\2\u077e\u013d\3\2\2\2\u077f\u0780\7\u00ad"+
		"\2\2\u0780\u0785\5&\24\2\u0781\u0782\7\u00b3\2\2\u0782\u0784\5&\24\2\u0783"+
		"\u0781\3\2\2\2\u0784\u0787\3\2\2\2\u0785\u0783\3\2\2\2\u0785\u0786\3\2"+
		"\2\2\u0786\u0788\3\2\2\2\u0787\u0785\3\2\2\2\u0788\u0789\7\u00ae\2\2\u0789"+
		"\u013f\3\2\2\2\u078a\u078b\5\u0142\u00a2\2\u078b\u078c\7\u00f3\2\2\u078c"+
		"\u078f\5\u00be`\2\u078d\u078e\7\u00e4\2\2\u078e\u0790\7\u0089\2\2\u078f"+
		"\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u0792\7\u00b3"+
		"\2\2\u0792\u0793\5\u0142\u00a2\2\u0793\u0141\3\2\2\2\u0794\u0795\5H%\2"+
		"\u0795\u0796\5f\64\2\u0796\u0797\7\u00fb\2\2\u0797\u0798\7\u00e8\2\2\u0798"+
		"\u0799\7\u00e9\2\2\u0799\u079b\7\u00db\2\2\u079a\u079c\t\24\2\2\u079b"+
		"\u079a\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u079e\3\2\2\2\u079d\u079f\7<"+
		"\2\2\u079e\u079d\3\2\2\2\u079e\u079f\3\2\2\2\u079f\u07a2\3\2\2\2\u07a0"+
		"\u07a1\7\u00d2\2\2\u07a1\u07a3\7\u00d3\2\2\u07a2\u07a0\3\2\2\2\u07a2\u07a3"+
		"\3\2\2\2\u07a3\u07a6\3\2\2\2\u07a4\u07a5\7\u00ef\2\2\u07a5\u07a7\5b\62"+
		"\2\u07a6\u07a4\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u0143\3\2\2\2\u07a8\u07af"+
		"\7\u00f6\2\2\u07a9\u07b0\5\u0146\u00a4\2\u07aa\u07b0\5\u014e\u00a8\2\u07ab"+
		"\u07b0\5\u0150\u00a9\2\u07ac\u07ad\7d\2\2\u07ad\u07ae\7\u00f8\2\2\u07ae"+
		"\u07b0\7\177\2\2\u07af\u07a9\3\2\2\2\u07af\u07aa\3\2\2\2\u07af\u07ab\3"+
		"\2\2\2\u07af\u07ac\3\2\2\2\u07b0\u0145\3\2\2\2\u07b1\u07b3\7\u00ef\2\2"+
		"\u07b2\u07b1\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b6\3\2\2\2\u07b4\u07b5"+
		"\7@\2\2\u07b5\u07b7\7\u00c7\2\2\u07b6\u07b4\3\2\2\2\u07b6\u07b7\3\2\2"+
		"\2\u07b7\u07b8\3\2\2\2\u07b8\u07bd\5\u0148\u00a5\2\u07b9\u07ba\7\u00b3"+
		"\2\2\u07ba\u07bc\5\u0148\u00a5\2\u07bb\u07b9\3\2\2\2\u07bc\u07bf\3\2\2"+
		"\2\u07bd\u07bb\3\2\2\2\u07bd\u07be\3\2\2\2\u07be\u0147\3\2\2\2\u07bf\u07bd"+
		"\3\2\2\2\u07c0\u07c2\5b\62\2\u07c1\u07c3\5\u014a\u00a6\2\u07c2\u07c1\3"+
		"\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u0149\3\2\2\2\u07c4\u07c5\7\u00e4\2\2"+
		"\u07c5\u07c6\7\u00ad\2\2\u07c6\u07cb\5\u014c\u00a7\2\u07c7\u07c8\7\u00b3"+
		"\2\2\u07c8\u07ca\5\u014c\u00a7\2\u07c9\u07c7\3\2\2\2\u07ca\u07cd\3\2\2"+
		"\2\u07cb\u07c9\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07ce\3\2\2\2\u07cd\u07cb"+
		"\3\2\2\2\u07ce\u07cf\7\u00ae\2\2\u07cf\u014b\3\2\2\2\u07d0\u07d1\7L\2"+
		"\2\u07d1\u07d2\7\u00a5\2\2\u07d2\u07e2\7\u0119\2\2\u07d3\u07d4\7]\2\2"+
		"\u07d4\u07d5\7\u00a5\2\2\u07d5\u07e2\t\b\2\2\u07d6\u07d7\7T\2\2\u07d7"+
		"\u07df\7\u010e\2\2\u07d8\u07d9\5@!\2\u07d9\u07da\7\u00ad\2\2\u07da\u07db"+
		"\5H%\2\u07db\u07dc\7\u00ae\2\2\u07dc\u07e0\3\2\2\2\u07dd\u07e0\5^\60\2"+
		"\u07de\u07e0\7\u0118\2\2\u07df\u07d8\3\2\2\2\u07df\u07dd\3\2\2\2\u07df"+
		"\u07de\3\2\2\2\u07e0\u07e2\3\2\2\2\u07e1\u07d0\3\2\2\2\u07e1\u07d3\3\2"+
		"\2\2\u07e1\u07d6\3\2\2\2\u07e2\u014d\3\2\2\2\u07e3\u07e6\7\u00ec\2\2\u07e4"+
		"\u07e5\7@\2\2\u07e5\u07e7\7\u00c7\2\2\u07e6\u07e4\3\2\2\2\u07e6\u07e7"+
		"\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u07e9\5\u0098M\2\u07e9\u014f\3\2\2"+
		"\2\u07ea\u07ed\7\u00fd\2\2\u07eb\u07ec\7@\2\2\u07ec\u07ee\7\u00c7\2\2"+
		"\u07ed\u07eb\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u07ef\3\2\2\2\u07ef\u07f4"+
		"\5P)\2\u07f0\u07f1\7\u00b3\2\2\u07f1\u07f3\5P)\2\u07f2\u07f0\3\2\2\2\u07f3"+
		"\u07f6\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u0151\3\2"+
		"\2\2\u07f6\u07f4\3\2\2\2\u07f7\u07f9\7\u00e4\2\2\u07f8\u07f7\3\2\2\2\u07f8"+
		"\u07f9\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fb\t\30\2\2\u07fb\u0805\7"+
		"\u00ef\2\2\u07fc\u0806\7\u00bb\2\2\u07fd\u0802\5b\62\2\u07fe\u07ff\7\u00b3"+
		"\2\2\u07ff\u0801\5b\62\2\u0800\u07fe\3\2\2\2\u0801\u0804\3\2\2\2\u0802"+
		"\u0800\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0806\3\2\2\2\u0804\u0802\3\2"+
		"\2\2\u0805\u07fc\3\2\2\2\u0805\u07fd\3\2\2\2\u0806\u0153\3\2\2\2\u0807"+
		"\u0808\t\31\2\2\u0808\u0812\7\u0084\2\2\u0809\u0813\7\u00bb\2\2\u080a"+
		"\u080f\5n8\2\u080b\u080c\7\u00b3\2\2\u080c\u080e\5n8\2\u080d\u080b\3\2"+
		"\2\2\u080e\u0811\3\2\2\2\u080f\u080d\3\2\2\2\u080f\u0810\3\2\2\2\u0810"+
		"\u0813\3\2\2\2\u0811\u080f\3\2\2\2\u0812\u0809\3\2\2\2\u0812\u080a\3\2"+
		"\2\2\u0813\u0155\3\2\2\2\u0814\u0817\7~\2\2\u0815\u0816\7\u00d7\2\2\u0816"+
		"\u0818\5\u00b2Z\2\u0817\u0815\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u0819"+
		"\3\2\2\2\u0819\u081a\7\u010e\2\2\u081a\u081d\5F$\2\u081b\u081c\7\u00d7"+
		"\2\2\u081c\u081e\5\u00b2Z\2\u081d\u081b\3\2\2\2\u081d\u081e\3\2\2\2\u081e"+
		"\u0824\3\2\2\2\u081f\u0820\7\u00e4\2\2\u0820\u0821\7\u00ad\2\2\u0821\u0822"+
		"\5<\37\2\u0822\u0823\7\u00ae\2\2\u0823\u0825\3\2\2\2\u0824\u081f\3\2\2"+
		"\2\u0824\u0825\3\2\2\2\u0825\u0157\3\2\2\2\u0826\u0827\7\u00dc\2\2\u0827"+
		"\u082a\7\u00ad\2\2\u0828\u082b\5\u015a\u00ae\2\u0829\u082b\5\u015c\u00af"+
		"\2\u082a\u0828\3\2\2\2\u082a\u0829\3\2\2\2\u082b\u082c\3\2\2\2\u082c\u082d"+
		"\7\u00ae\2\2\u082d\u0159\3\2\2\2\u082e\u082f\7/\2\2\u082f\u0833\7\u00a5"+
		"\2\2\u0830\u0834\5@!\2\u0831\u0834\5^\60\2\u0832\u0834\7\u0118\2\2\u0833"+
		"\u0830\3\2\2\2\u0833\u0831\3\2\2\2\u0833\u0832\3\2\2\2\u0834\u015b\3\2"+
		"\2\2\u0835\u0836\7\u0080\2\2\u0836\u0839\7\u00a5\2\2\u0837\u083a\7[\2"+
		"\2\u0838\u083a\5\u015e\u00b0\2\u0839\u0837\3\2\2\2\u0839\u0838\3\2\2\2"+
		"\u083a\u015d\3\2\2\2\u083b\u0857\7\u0101\2\2\u083c\u0840\7\u00ad\2\2\u083d"+
		"\u083e\7>\2\2\u083e\u083f\7\u00a5\2\2\u083f\u0841\5F$\2\u0840\u083d\3"+
		"\2\2\2\u0840\u0841\3\2\2\2\u0841\u0848\3\2\2\2\u0842\u0844\7\u00b3\2\2"+
		"\u0843\u0842\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u0846"+
		"\7\37\2\2\u0846\u0847\7\u00a5\2\2\u0847\u0849\t\b\2\2\u0848\u0843\3\2"+
		"\2\2\u0848\u0849\3\2\2\2\u0849\u0854\3\2\2\2\u084a\u084c\7\u00b3\2\2\u084b"+
		"\u084a\3\2\2\2\u084b\u084c\3\2\2\2\u084c\u084d\3\2\2\2\u084d\u084e\7="+
		"\2\2\u084e\u0852\7\u00a5\2\2\u084f\u0853\7D\2\2\u0850\u0851\7\u0119\2"+
		"\2\u0851\u0853\t\32\2\2\u0852\u084f\3\2\2\2\u0852\u0850\3\2\2\2\u0853"+
		"\u0855\3\2\2\2\u0854\u084b\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0856\3\2"+
		"\2\2\u0856\u0858\7\u00ae\2\2\u0857\u083c\3\2\2\2\u0857\u0858\3\2\2\2\u0858"+
		"\u015f\3\2\2\2\u0859\u085a\7\u00fd\2\2\u085a\u085b\5P)\2\u085b\u0161\3"+
		"\2\2\2\u085c\u0862\7X\2\2\u085d\u0863\5\u0108\u0085\2\u085e\u0860\5\u013e"+
		"\u00a0\2\u085f\u0861\5\u011a\u008e\2\u0860\u085f\3\2\2\2\u0860\u0861\3"+
		"\2\2\2\u0861\u0863\3\2\2\2\u0862\u085d\3\2\2\2\u0862\u085e\3\2\2\2\u0863"+
		"\u0163\3\2\2\2\u0864\u0865\7\22\2\2\u0865\u086d\7\24\2\2\u0866\u0867\7"+
		"\u00e4\2\2\u0867\u0868\7\30\2\2\u0868\u0869\7\u00a5\2\2\u0869\u086b\7"+
		"\u0119\2\2\u086a\u086c\7Q\2\2\u086b\u086a\3\2\2\2\u086b\u086c\3\2\2\2"+
		"\u086c\u086e\3\2\2\2\u086d\u0866\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u0870"+
		"\3\2\2\2\u086f\u0871\5\u011a\u008e\2\u0870\u086f\3\2\2\2\u0870\u0871\3"+
		"\2\2\2\u0871\u0165\3\2\2\2\u0872\u0873\7\u00f6\2\2\u0873\u0876\7\u010d"+
		"\2\2\u0874\u0875\7@\2\2\u0875\u0877\7\u00c7\2\2\u0876\u0874\3\2\2\2\u0876"+
		"\u0877\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u0879\5\u0094K\2\u0879\u0167"+
		"\3\2\2\2\u087a\u087b\7\u0110\2\2\u087b\u087c\7\u010d\2\2\u087c\u087d\5"+
		"F$\2\u087d\u0169\3\2\2\2\u087e\u087f\7\u00dc\2\2\u087f\u0880\7\u010f\2"+
		"\2\u0880\u0881\7\u00fe\2\2\u0881\u0888\7\u00ff\2\2\u0882\u0883\7\u0105"+
		"\2\2\u0883\u0889\t\33\2\2\u0884\u0885\7l\2\2\u0885\u0889\7\u0105\2\2\u0886"+
		"\u0889\7y\2\2\u0887\u0889\7\u010b\2\2\u0888\u0882\3\2\2\2\u0888\u0884"+
		"\3\2\2\2\u0888\u0886\3\2\2\2\u0888\u0887\3\2\2\2\u0889\u016b\3\2\2\2\u088a"+
		"\u089c\7\u00ed\2\2\u088b\u088d\t\34\2\2\u088c\u088e\7\u0115\2\2\u088d"+
		"\u088c\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u0890\3\2\2\2\u088f\u088b\3\2"+
		"\2\2\u088f\u0890\3\2\2\2\u0890\u0897\3\2\2\2\u0891\u0892\7\u00e4\2\2\u0892"+
		"\u0893\7\u00ad\2\2\u0893\u0894\7\"\2\2\u0894\u0895\7\u00a5\2\2\u0895\u0896"+
		"\t\b\2\2\u0896\u0898\7\u00ae\2\2\u0897\u0891\3\2\2\2\u0897\u0898\3\2\2"+
		"\2\u0898\u089d\3\2\2\2\u0899\u089b\7\u0113\2\2\u089a\u0899\3\2\2\2\u089a"+
		"\u089b\3\2\2\2\u089b\u089d\3\2\2\2\u089c\u088f\3\2\2\2\u089c\u089a\3\2"+
		"\2\2\u089d\u016d\3\2\2\2\u089e\u08a6\7\u0109\2\2\u089f\u08a1\t\34\2\2"+
		"\u08a0\u08a2\7\u0115\2\2\u08a1\u08a0\3\2\2\2\u08a1\u08a2\3\2\2\2\u08a2"+
		"\u08a7\3\2\2\2\u08a3\u08a5\7\u0113\2\2\u08a4\u08a3\3\2\2\2\u08a4\u08a5"+
		"\3\2\2\2\u08a5\u08a7\3\2\2\2\u08a6\u089f\3\2\2\2\u08a6\u08a4\3\2\2\2\u08a7"+
		"\u016f\3\2\2\2\u08a8\u08a9\7t\2\2\u08a9\u08aa\t\34\2\2\u08aa\u08ab\7\u0115"+
		"\2\2\u08ab\u0171\3\2\2\2\u08ac\u08ad\7\r\2\2\u08ad\u08b4\t\34\2\2\u08ae"+
		"\u08b2\7\u0115\2\2\u08af\u08b0\7\u00e4\2\2\u08b0\u08b1\7I\2\2\u08b1\u08b3"+
		"\7\u0118\2\2\u08b2\u08af\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08b5\3\2\2"+
		"\2\u08b4\u08ae\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5\u0173\3\2\2\2\u08b6\u08b7"+
		"\7@\2\2\u08b7\u08b8\7\u00b9\2\2\u08b8\u08b9\7\u00b9\2\2\u08b9\u08ba\7"+
		"\u0083\2\2\u08ba\u08bb\7\u00a8\2\2\u08bb\u08bc\7\u0119\2\2\u08bc\u08bd"+
		"\7\u00ed\2\2\u08bd\u08bf\7\u0082\2\2\u08be\u08b6\3\2\2\2\u08be\u08bf\3"+
		"\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u08c1\7\u00dc\2\2\u08c1\u08c2\7B\2\2"+
		"\u08c2\u08c3\5\u0176\u00bc\2\u08c3\u0175\3\2\2\2\u08c4\u08c5\t\b\2\2\u08c5"+
		"\u0177\3\2\2\2\u08c6\u08c9\5\u017a\u00be\2\u08c7\u08c9\5\u0182\u00c2\2"+
		"\u08c8\u08c6\3\2\2\2\u08c8\u08c7\3\2\2\2\u08c9\u0179\3\2\2\2\u08ca\u08cb"+
		"\7\u00fc\2\2\u08cb\u08cc\5\u017c\u00bf\2\u08cc\u08cd\7\u010e\2\2\u08cd"+
		"\u08d1\5\u0084C\2\u08ce\u08cf\7\u00e4\2\2\u08cf\u08d0\7\u00fc\2\2\u08d0"+
		"\u08d2\7\u0102\2\2\u08d1\u08ce\3\2\2\2\u08d1\u08d2\3\2\2\2\u08d2\u08d5"+
		"\3\2\2\2\u08d3\u08d4\7\u00e9\2\2\u08d4\u08d6\7\u0115\2\2\u08d5\u08d3\3"+
		"\2\2\2\u08d5\u08d6\3\2\2\2\u08d6\u017b\3\2\2\2\u08d7\u08d9\7\u00bb\2\2"+
		"\u08d8\u08da\7\u0104\2\2\u08d9\u08d8\3\2\2\2\u08d9\u08da\3\2\2\2\u08da"+
		"\u08e4\3\2\2\2\u08db\u08e0\5\u017e\u00c0\2\u08dc\u08dd\7\u00b3\2\2\u08dd"+
		"\u08df\5\u017e\u00c0\2\u08de\u08dc\3\2\2\2\u08df\u08e2\3\2\2\2\u08e0\u08de"+
		"\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08e4\3\2\2\2\u08e2\u08e0\3\2\2\2\u08e3"+
		"\u08d7\3\2\2\2\u08e3\u08db\3\2\2\2\u08e4\u08ec\3\2\2\2\u08e5\u08e9\7\u0101"+
		"\2\2\u08e6\u08e7\7\u0115\2\2\u08e7\u08e8\7\u009b\2\2\u08e8\u08ea\7\u009b"+
		"\2\2\u08e9\u08e6\3\2\2\2\u08e9\u08ea\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb"+
		"\u08ed\5F$\2\u08ec\u08e5\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u017d\3\2\2"+
		"\2\u08ee\u08f0\5\u0180\u00c1\2\u08ef\u08f1\5$\23\2\u08f0\u08ef\3\2\2\2"+
		"\u08f0\u08f1\3\2\2\2\u08f1\u017f\3\2\2\2\u08f2\u08f4\7\u0115\2\2\u08f3"+
		"\u08f2\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f5\u08f3\3\2"+
		"\2\2\u08f6\u0181\3\2\2\2\u08f7\u08f8\7\u00fc\2\2\u08f8\u08fd\5\u0180\u00c1"+
		"\2\u08f9\u08fa\7\u00b3\2\2\u08fa\u08fc\5\u0180\u00c1\2\u08fb\u08f9\3\2"+
		"\2\2\u08fc\u08ff\3\2\2\2\u08fd\u08fb\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe"+
		"\u0908\3\2\2\2\u08ff\u08fd\3\2\2\2\u0900\u0905\7\u0101\2\2\u0901\u0902"+
		"\5\u0184\u00c3\2\u0902\u0903\7\u009b\2\2\u0903\u0904\7\u009b\2\2\u0904"+
		"\u0906\3\2\2\2\u0905\u0901\3\2\2\2\u0905\u0906\3\2\2\2\u0906\u0907\3\2"+
		"\2\2\u0907\u0909\7\u0115\2\2\u0908\u0900\3\2\2\2\u0908\u0909\3\2\2\2\u0909"+
		"\u090a\3\2\2\2\u090a\u090b\7\u010e\2\2\u090b\u090f\5\u0084C\2\u090c\u090d"+
		"\7\u00e4\2\2\u090d\u090e\7\u00fc\2\2\u090e\u0910\7\u0102\2\2\u090f\u090c"+
		"\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u0183\3\2\2\2\u0911\u0912\t\35\2\2"+
		"\u0912\u0185\3\2\2\2\u0913\u0916\5\u0188\u00c5\2\u0914\u0916\5\u018a\u00c6"+
		"\2\u0915\u0913\3\2\2\2\u0915\u0914\3\2\2\2\u0916\u0187\3\2\2\2\u0917\u091b"+
		"\7\u0107\2\2\u0918\u0919\7\u00fc\2\2\u0919\u091a\7\u0102\2\2\u091a\u091c"+
		"\7\u00f8\2\2\u091b\u0918\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u0924\3\2\2"+
		"\2\u091d\u091f\7\u00bb\2\2\u091e\u0920\7\u0104\2\2\u091f\u091e\3\2\2\2"+
		"\u091f\u0920\3\2\2\2\u0920\u0922\3\2\2\2\u0921\u091d\3\2\2\2\u0921\u0922"+
		"\3\2\2\2\u0922\u0925\3\2\2\2\u0923\u0925\5\u017e\u00c0\2\u0924\u0921\3"+
		"\2\2\2\u0924\u0923\3\2\2\2\u0925\u092d\3\2\2\2\u0926\u092a\7\u0101\2\2"+
		"\u0927\u0928\7\u0115\2\2\u0928\u0929\7\u009b\2\2\u0929\u092b\7\u009b\2"+
		"\2\u092a\u0927\3\2\2\2\u092a\u092b\3\2\2\2\u092b\u092c\3\2\2\2\u092c\u092e"+
		"\7\u0115\2\2\u092d\u0926\3\2\2\2\u092d\u092e\3\2\2\2\u092e\u092f\3\2\2"+
		"\2\u092f\u0930\t\36\2\2\u0930\u0932\5\u0084C\2\u0931\u0933\7\u00ea\2\2"+
		"\u0932\u0931\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u0936\3\2\2\2\u0934\u0935"+
		"\7\u00e9\2\2\u0935\u0937\7\u0115\2\2\u0936\u0934\3\2\2\2\u0936\u0937\3"+
		"\2\2\2\u0937\u0189\3\2\2\2\u0938\u0939\7\u0107\2\2\u0939\u093b\5\u018c"+
		"\u00c7\2\u093a\u093c\t\36\2\2\u093b\u093a\3\2\2\2\u093b\u093c\3\2\2\2"+
		"\u093c\u093d\3\2\2\2\u093d\u093f\5\u0084C\2\u093e\u0940\7\u00ea\2\2\u093f"+
		"\u093e\3\2\2\2\u093f\u0940\3\2\2\2\u0940\u018b\3\2\2\2\u0941\u0946\5\u0180"+
		"\u00c1\2\u0942\u0943\7\u00b3\2\2\u0943\u0945\5\u0180\u00c1\2\u0944\u0942"+
		"\3\2\2\2\u0945\u0948\3\2\2\2\u0946\u0944\3\2\2\2\u0946\u0947\3\2\2\2\u0947"+
		"\u0951\3\2\2\2\u0948\u0946\3\2\2\2\u0949\u094e\7\u0101\2\2\u094a\u094b"+
		"\5\u0184\u00c3\2\u094b\u094c\7\u009b\2\2\u094c\u094d\7\u009b\2\2\u094d"+
		"\u094f\3\2\2\2\u094e\u094a\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0950\3\2"+
		"\2\2\u0950\u0952\5F$\2\u0951\u0949\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u018d"+
		"\3\2\2\2\u0953\u0954\7#\2\2\u0954\u0955\5\u017c\u00bf\2\u0955\u0956\7"+
		"\u010e\2\2\u0956\u0958\5\u0084C\2\u0957\u0959\7\u00ea\2\2\u0958\u0957"+
		"\3\2\2\2\u0958\u0959\3\2\2\2\u0959\u095c\3\2\2\2\u095a\u095b\7\u00e9\2"+
		"\2\u095b\u095d\7\u0115\2\2\u095c\u095a\3\2\2\2\u095c\u095d\3\2\2\2\u095d"+
		"\u018f\3\2\2\2\u095e\u095f\7\u00f0\2\2\u095f\u0967\7\u0112\2\2\u0960\u0963"+
		"\5z>\2\u0961\u0964\5\u0192\u00ca\2\u0962\u0964\5\u019a\u00ce\2\u0963\u0961"+
		"\3\2\2\2\u0963\u0962\3\2\2\2\u0964\u0968\3\2\2\2\u0965\u0968\5\u0194\u00cb"+
		"\2\u0966\u0968\5\u0198\u00cd\2\u0967\u0960\3\2\2\2\u0967\u0965\3\2\2\2"+
		"\u0967\u0966\3\2\2\2\u0967\u0968\3\2\2\2\u0968\u0191\3\2\2\2\u0969\u096a"+
		"\t\37\2\2\u096a\u096b\7H\2\2\u096b\u096d\7\u0115\2\2\u096c\u0969\3\2\2"+
		"\2\u096c\u096d\3\2\2\2\u096d\u0970\3\2\2\2\u096e\u096f\7\u00e4\2\2\u096f"+
		"\u0971\5\u019c\u00cf\2\u0970\u096e\3\2\2\2\u0970\u0971\3\2\2\2\u0971\u0193"+
		"\3\2\2\2\u0972\u0975\5\u0196\u00cc\2\u0973\u0974\7\u00e4\2\2\u0974\u0976"+
		"\5\u019c\u00cf\2\u0975\u0973\3\2\2\2\u0975\u0976\3\2\2\2\u0976\u0988\3"+
		"\2\2\2\u0977\u0978\5z>\2\u0978\u0979\7\u00e4\2\2\u0979\u097a\7\u0103\2"+
		"\2\u097a\u097b\7\u00a5\2\2\u097b\u0980\7\u0118\2\2\u097c\u097d\7\u00b3"+
		"\2\2\u097d\u097f\5\u019e\u00d0\2\u097e\u097c\3\2\2\2\u097f\u0982\3\2\2"+
		"\2\u0980\u097e\3\2\2\2\u0980\u0981\3\2\2\2\u0981\u0988\3\2\2\2\u0982\u0980"+
		"\3\2\2\2\u0983\u0984\7\u0115\2\2\u0984\u0985\7\u00c9\2\2\u0985\u0986\7"+
		"-\2\2\u0986\u0988\7g\2\2\u0987\u0972\3\2\2\2\u0987\u0977\3\2\2\2\u0987"+
		"\u0983\3\2\2\2\u0988\u0195\3\2\2\2\u0989\u098a\7\u0115\2\2\u098a\u098b"+
		"\7\u00a0\2\2\u098b\u098c\7\u0115\2\2\u098c\u0197\3\2";
	private static final String _serializedATNSegment1 =
		"\2\2\u098d\u0991\5\u0196\u00cc\2\u098e\u098f\t\37\2\2\u098f\u0990\7H\2"+
		"\2\u0990\u0992\7\u0115\2\2\u0991\u098e\3\2\2\2\u0991\u0992\3\2\2\2\u0992"+
		"\u0999\3\2\2\2\u0993\u0994\5z>\2\u0994\u0995\t\37\2\2\u0995\u0996\7H\2"+
		"\2\u0996\u0997\7\u0115\2\2\u0997\u0999\3\2\2\2\u0998\u098d\3\2\2\2\u0998"+
		"\u0993\3\2\2\2\u0999\u0199\3\2\2\2\u099a\u099b\7\u008e\2\2\u099b\u099e"+
		"\7H\2\2\u099c\u099d\7\u00e4\2\2\u099d\u099f\5\u019c\u00cf\2\u099e\u099c"+
		"\3\2\2\2\u099e\u099f\3\2\2\2\u099f\u09a9\3\2\2\2\u09a0\u09a6\t\37\2\2"+
		"\u09a1\u09a2\7\21\2\2\u09a2\u09a7\7\u0115\2\2\u09a3\u09a4\7\n\2\2\u09a4"+
		"\u09a5\7\u00ce\2\2\u09a5\u09a7\7\u0115\2\2\u09a6\u09a1\3\2\2\2\u09a6\u09a3"+
		"\3\2\2\2\u09a7\u09a9\3\2\2\2\u09a8\u099a\3\2\2\2\u09a8\u09a0\3\2\2\2\u09a9"+
		"\u019b\3\2\2\2\u09aa\u09af\5\u019e\u00d0\2\u09ab\u09ac\7\u00b3\2\2\u09ac"+
		"\u09ae\5\u019e\u00d0\2\u09ad\u09ab\3\2\2\2\u09ae\u09b1\3\2\2\2\u09af\u09ad"+
		"\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0\u019d\3\2\2\2\u09b1\u09af\3\2\2\2\u09b2"+
		"\u09b3\7\u0115\2\2\u09b3\u09b5\7\u00a5\2\2\u09b4\u09b6\7\u0115\2\2\u09b5"+
		"\u09b4\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u019f\3\2\2\2\u09b7\u09b8\7\u00e7"+
		"\2\2\u09b8\u09b9\7\u0112\2\2\u09b9\u09ba\5z>\2\u09ba\u09bb\7\u00e4\2\2"+
		"\u09bb\u09bc\5\u019c\u00cf\2\u09bc\u01a1\3\2\2\2\u09bd\u09be\7\u00f6\2"+
		"\2\u09be\u09c1\7\u0112\2\2\u09bf\u09c0\7@\2\2\u09c0\u09c2\7\u00c7\2\2"+
		"\u09c1\u09bf\3\2\2\2\u09c1\u09c2\3\2\2\2\u09c2\u09c3\3\2\2\2\u09c3\u09c4"+
		"\5z>\2\u09c4\u01a3\3\2\2\2\u09c5\u09c6\7\u00f0\2\2\u09c6\u09c9\7H\2\2"+
		"\u09c7\u09ca\5\u0196\u00cc\2\u09c8\u09ca\7\u0115\2\2\u09c9\u09c7\3\2\2"+
		"\2\u09c9\u09c8\3\2\2\2\u09ca\u09cf\3\2\2\2\u09cb\u09cc\7\u00e4\2\2\u09cc"+
		"\u09d0\5\u01a6\u00d4\2\u09cd\u09ce\7\u00c9\2\2\u09ce\u09d0\5\u01a8\u00d5"+
		"\2\u09cf\u09cb\3\2\2\2\u09cf\u09cd\3\2\2\2\u09d0\u01a5\3\2\2\2\u09d1\u09d2"+
		"\7\u0103\2\2\u09d2\u09d6\7\u00a5\2\2\u09d3\u09d7\7\u0118\2\2\u09d4\u09d5"+
		"\7\u0115\2\2\u09d5\u09d7\7:\2\2\u09d6\u09d3\3\2\2\2\u09d6\u09d4\3\2\2"+
		"\2\u09d7\u09d9\3\2\2\2\u09d8\u09da\7U\2\2\u09d9\u09d8\3\2\2\2\u09d9\u09da"+
		"\3\2\2\2\u09da\u09df\3\2\2\2\u09db\u09dc\7\u00b3\2\2\u09dc\u09de\5\u019e"+
		"\u00d0\2\u09dd\u09db\3\2\2\2\u09de\u09e1\3\2\2\2\u09df\u09dd\3\2\2\2\u09df"+
		"\u09e0\3\2\2\2\u09e0\u01a7\3\2\2\2\u09e1\u09df\3\2\2\2\u09e2\u09e5\7\u008d"+
		"\2\2\u09e3\u09e4\7\u00e4\2\2\u09e4\u09e6\5\u019c\u00cf\2\u09e5\u09e3\3"+
		"\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09ed\3\2\2\2\u09e7\u09e8\7\21\2\2\u09e8"+
		"\u09ed\7\u0115\2\2\u09e9\u09ea\7\n\2\2\u09ea\u09eb\7\u00ce\2\2\u09eb\u09ed"+
		"\7\u0115\2\2\u09ec\u09e2\3\2\2\2\u09ec\u09e7\3\2\2\2\u09ec\u09e9\3\2\2"+
		"\2\u09ed\u01a9\3\2\2\2\u09ee\u09ef\7\u00e7\2\2\u09ef\u09f0\7H\2\2\u09f0"+
		"\u09fd\7\u0115\2\2\u09f1\u09fe\7\u00f7\2\2\u09f2\u09fe\7\u00f5\2\2\u09f3"+
		"\u09f4\7\u00e4\2\2\u09f4\u09f9\5\u01ac\u00d7\2\u09f5\u09f6\7\u00b3\2\2"+
		"\u09f6\u09f8\5\u01ac\u00d7\2\u09f7\u09f5\3\2\2\2\u09f8\u09fb\3\2\2\2\u09f9"+
		"\u09f7\3\2\2\2\u09f9\u09fa\3\2\2\2\u09fa\u09fe\3\2\2\2\u09fb\u09f9\3\2"+
		"\2\2\u09fc\u09fe\5\u01b0\u00d9\2\u09fd\u09f1\3\2\2\2\u09fd\u09f2\3\2\2"+
		"\2\u09fd\u09f3\3\2\2\2\u09fd\u09fc\3\2\2\2\u09fe\u01ab\3\2\2\2\u09ff\u0a00"+
		"\7\u0103\2\2\u0a00\u0a04\7\u00a5\2\2\u0a01\u0a05\7\u0118\2\2\u0a02\u0a03"+
		"\7\u0115\2\2\u0a03\u0a05\7:\2\2\u0a04\u0a01\3\2\2\2\u0a04\u0a02\3\2\2"+
		"\2\u0a05\u0a0d\3\2\2\2\u0a06\u0a07\7\\\2\2\u0a07\u0a08\7\u00a5\2\2\u0a08"+
		"\u0a0e\7\u0118\2\2\u0a09\u0a0b\5\u01ae\u00d8\2\u0a0a\u0a0c\5\u01ae\u00d8"+
		"\2\u0a0b\u0a0a\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0e\3\2\2\2\u0a0d\u0a06"+
		"\3\2\2\2\u0a0d\u0a09\3\2\2\2\u0a0d\u0a0e\3\2\2\2\u0a0e\u0a16\3\2\2\2\u0a0f"+
		"\u0a10\7!\2\2\u0a10\u0a11\7\u00a5\2\2\u0a11\u0a16\5B\"\2\u0a12\u0a16\5"+
		"\u019e\u00d0\2\u0a13\u0a14\7\u0100\2\2\u0a14\u0a16\7\33\2\2\u0a15\u09ff"+
		"\3\2\2\2\u0a15\u0a0f\3\2\2\2\u0a15\u0a12\3\2\2\2\u0a15\u0a13\3\2\2\2\u0a16"+
		"\u01ad\3\2\2\2\u0a17\u0a18\t \2\2\u0a18\u01af\3\2\2\2\u0a19\u0a1a\7\u00e6"+
		"\2\2\u0a1a\u0a1b\7\33\2\2\u0a1b\u0a1f\7\u0115\2\2\u0a1c\u0a1d\7\u00f6"+
		"\2\2\u0a1d\u0a1f\7\33\2\2\u0a1e\u0a19\3\2\2\2\u0a1e\u0a1c\3\2\2\2\u0a1f"+
		"\u01b1\3\2\2\2\u0a20\u0a21\7\u00f6\2\2\u0a21\u0a22\7H\2\2\u0a22\u0a23"+
		"\7\u0115\2\2\u0a23\u01b3\3\2\2\2\u0a24\u0a25\7\u00f0\2\2\u0a25\u0a26\7"+
		"\u0108\2\2\u0a26\u0a27\5r:\2\u0a27\u0a28\7\13\2\2\u0a28\u0a29\7\u0115"+
		"\2\2\u0a29\u01b5\3\2\2\2\u0a2a\u0a2b\7\u00e7\2\2\u0a2b\u0a2c\7\u0108\2"+
		"\2\u0a2c\u0a34\5r:\2\u0a2d\u0a2e\t!\2\2\u0a2e\u0a2f\7N\2\2\u0a2f\u0a35"+
		"\7\u0115\2\2\u0a30\u0a31\7\u00e4\2\2\u0a31\u0a32\7V\2\2\u0a32\u0a33\7"+
		"\u00a5\2\2\u0a33\u0a35\7\u0115\2\2\u0a34\u0a2d\3\2\2\2\u0a34\u0a30\3\2"+
		"\2\2\u0a35\u01b7\3\2\2\2\u0a36\u0a37\7\u00f6\2\2\u0a37\u0a3a\7\u0108\2"+
		"\2\u0a38\u0a39\7@\2\2\u0a39\u0a3b\7\u00c7\2\2\u0a3a\u0a38\3\2\2\2\u0a3a"+
		"\u0a3b\3\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u0a3d\5r:\2\u0a3d\u01b9\3\2\2"+
		"\2\u0127\u01d3\u01d6\u01df\u01e4\u01ea\u01f0\u01fc\u0205\u020b\u0213\u0216"+
		"\u0219\u0224\u022e\u0234\u0237\u023e\u0247\u024f\u0257\u025f\u0266\u0273"+
		"\u0275\u027e\u0293\u0298\u02a4\u02b1\u02f5\u02f7\u02fc\u0307\u0313\u031a"+
		"\u031e\u0325\u032d\u0335\u0341\u034d\u0355\u035d\u0365\u0371\u0379\u0381"+
		"\u0389\u0391\u0399\u03a1\u03b3\u03c4\u03c6\u03d1\u03e0\u03e2\u03e9\u03f0"+
		"\u03f9\u0400\u040e\u0416\u041b\u0421\u044d\u044f\u046a\u0471\u0473\u0479"+
		"\u047d\u0497\u049c\u04a0\u04a2\u04b1\u04b4\u04b8\u04bb\u04c7\u04d0\u04df"+
		"\u04e7\u04ec\u04f7\u04f9\u04fe\u0500\u0507\u0509\u0512\u0517\u051e\u052c"+
		"\u0532\u0537\u0541\u0544\u0546\u054a\u0553\u0558\u055b\u0561\u0563\u056e"+
		"\u0577\u058d\u0591\u059c\u05a1\u05a9\u05ae\u05c1\u05c5\u05c7\u05d2\u05d9"+
		"\u05e0\u05ea\u05f4\u05f7\u0602\u060a\u060d\u0610\u061f\u0629\u0634\u0637"+
		"\u0650\u0654\u0658\u065d\u0661\u0665\u0668\u066b\u066e\u0672\u067c\u0685"+
		"\u068c\u0690\u06a7\u06ac\u06b1\u06c3\u06cc\u06d5\u06da\u06dd\u06e3\u06e5"+
		"\u06ea\u06f1\u06f6\u06fb\u06ff\u0702\u0706\u0709\u070e\u0712\u071b\u0724"+
		"\u0726\u0729\u073b\u0747\u074c\u074f\u0757\u075f\u076a\u076c\u0774\u0778"+
		"\u0785\u078f\u079b\u079e\u07a2\u07a6\u07af\u07b2\u07b6\u07bd\u07c2\u07cb"+
		"\u07df\u07e1\u07e6\u07ed\u07f4\u07f8\u0802\u0805\u080f\u0812\u0817\u081d"+
		"\u0824\u082a\u0833\u0839\u0840\u0843\u0848\u084b\u0852\u0854\u0857\u0860"+
		"\u0862\u086b\u086d\u0870\u0876\u0888\u088d\u088f\u0897\u089a\u089c\u08a1"+
		"\u08a4\u08a6\u08b2\u08b4\u08be\u08c8\u08d1\u08d5\u08d9\u08e0\u08e3\u08e9"+
		"\u08ec\u08f0\u08f5\u08fd\u0905\u0908\u090f\u0915\u091b\u091f\u0921\u0924"+
		"\u092a\u092d\u0932\u0936\u093b\u093f\u0946\u094e\u0951\u0958\u095c\u0963"+
		"\u0967\u096c\u0970\u0975\u0980\u0987\u0991\u0998\u099e\u09a6\u09a8\u09af"+
		"\u09b5\u09c1\u09c9\u09cf\u09d6\u09d9\u09df\u09e5\u09ec\u09f9\u09fd\u0a04"+
		"\u0a0b\u0a0d\u0a15\u0a1e\u0a34\u0a3a";
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