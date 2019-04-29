// Generated from io/shardingsphere/core/parsing/antlr/autogen/MySQLStatement.g4 by ANTLR 4.7.1
package io.shardingsphere.core.parsing.antlr.autogen;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ACCOUNT=2, ACTION=3, ADMIN=4, AFTER=5, ALGORITHM=6, ANALYZE=7, 
		AUDIT_ADMIN=8, AUTO_INCREMENT=9, AUTOCOMMIT=10, AVG_ROW_LENGTH=11, BEGIN=12, 
		BINLOG_ADMIN=13, BTREE=14, CASE=15, CHAIN=16, CHANGE=17, CHAR=18, CHARACTER=19, 
		CHARSET=20, CHECKSUM=21, CIPHER=22, CLIENT=23, COALESCE=24, COLLATE=25, 
		COLUMNS=26, COLUMN_FORMAT=27, COMMENT=28, COMPACT=29, COMPRESSED=30, COMPRESSION=31, 
		CONNECTION=32, CONNECTION_ADMIN=33, CONSISTENT=34, CONVERT=35, COPY=36, 
		CROSS=37, CURRENT_TIMESTAMP=38, DATA=39, DATABASES=40, DELAYED=41, DELAY_KEY_WRITE=42, 
		DIRECTORY=43, DISCARD=44, DISK=45, DISTINCTROW=46, DOUBLE=47, DUPLICATE=48, 
		DYNAMIC=49, ELSE=50, ENCRYPTION=51, ENCRYPTION_KEY_ADMIN=52, END=53, ENGINE=54, 
		EVENT=55, EXCEPT=56, EXCHANGE=57, EXCLUSIVE=58, EXECUTE=59, EXPIRE=60, 
		FILE=61, FIREWALL_ADMIN=62, FIREWALL_USER=63, FIRST=64, FIXED=65, FOLLOWING=66, 
		FORCE=67, FULL=68, FULLTEXT=69, GLOBAL=70, GROUP_CONCAT=71, GROUP_REPLICATION_ADMIN=72, 
		HASH=73, HIGH_PRIORITY=74, HISTORY=75, IDENTIFIED=76, IF=77, IGNORE=78, 
		IMPORT_=79, INNER=80, INPLACE=81, INSERT=82, INSERT_METHOD=83, INTERVAL=84, 
		INTO=85, ISSUER=86, JOIN=87, KEYS=88, KEY_BLOCK_SIZE=89, LAST=90, LEFT=91, 
		LESS=92, LINEAR=93, LIST=94, LOCALTIME=95, LOCALTIMESTAMP=96, LOCK=97, 
		LOW_PRIORITY=98, MATCH=99, MAXVALUE=100, MAX_CONNECTIONS_PER_HOUR=101, 
		MAX_QUERIES_PER_HOUR=102, MAX_ROWS=103, MAX_UPDATES_PER_HOUR=104, MAX_USER_CONNECTIONS=105, 
		MEMORY=106, MIN_ROWS=107, MODIFY=108, NATURAL=109, NEVER=110, NONE=111, 
		NOW=112, OFFLINE=113, OLD=114, ONLINE=115, ONLY=116, OPTIMIZE=117, OPTIONAL=118, 
		OUTER=119, OVER=120, PACK_KEYS=121, PARSER=122, PARTIAL=123, PARTITIONING=124, 
		PARTITIONS=125, PERSIST=126, PERSIST_ONLY=127, PRECEDING=128, PRECISION=129, 
		PROCEDURE=130, PROCESS=131, PROXY=132, QUICK=133, RANGE=134, REBUILD=135, 
		RECURSIVE=136, REDUNDANT=137, RELEASE=138, RELOAD=139, REMOVE=140, RENAME=141, 
		REORGANIZE=142, REPAIR=143, REPEATABLE=144, REPLACE=145, REPLICATION=146, 
		REPLICATION_SLAVE_ADMIN=147, REQUIRE=148, RESTRICT=149, RETAIN=150, REUSE=151, 
		RIGHT=152, ROLE_ADMIN=153, ROUTINE=154, ROW_FORMAT=155, SAVEPOINT=156, 
		SELECT=157, SEPARATOR=158, SESSION=159, SET_USER_ID=160, SHARED=161, SHOW=162, 
		SHUTDOWN=163, SIMPLE=164, SLAVE=165, SNAPSHOT=166, SPATIAL=167, SQLDML=168, 
		SQLDQL=169, SQL_BIG_RESULT=170, SQL_BUFFER_RESULT=171, SQL_CACHE=172, 
		SQL_CALC_FOUND_ROWS=173, SQL_NO_CACHE=174, SQL_SMALL_RESULT=175, SSL=176, 
		STATS_AUTO_RECALC=177, STATS_PERSISTENT=178, STATS_SAMPLE_PAGES=179, STORAGE=180, 
		STORED=181, STRAIGHT_JOIN=182, SUBJECT=183, SUBPARTITION=184, SUBPARTITIONS=185, 
		SUPER=186, SYSTEM_VARIABLES_ADMIN=187, TABLES=188, TABLESPACE=189, TEMPORARY=190, 
		THAN=191, THEN=192, TRIGGER=193, UNBOUNDED=194, UNCOMMITTED=195, UNLOCK=196, 
		UNSIGNED=197, UPDATE=198, UPGRADE=199, USAGE=200, USE=201, USING=202, 
		VALIDATION=203, VALUE=204, VALUES=205, VERSION_TOKEN_ADMIN=206, VIEW=207, 
		VIRTUAL=208, WHEN=209, WINDOW=210, WITHOUT=211, WRITE=212, ZEROFILL=213, 
		AND_=214, OR_=215, NOT_=216, UNARY_BIT_COMPLEMENT=217, BIT_INCLUSIVE_OR=218, 
		BIT_AND=219, SIGNED_LEFT_SHIFT=220, SIGNED_RIGHT_SHIFT=221, BIT_EXCLUSIVE_OR=222, 
		MOD_=223, COLON=224, PLUS=225, MINUS=226, ASTERISK=227, SLASH=228, BACKSLASH=229, 
		DOT=230, DOT_ASTERISK=231, SAFE_EQ=232, EQ=233, EQ_=234, NEQ=235, NEQ_=236, 
		GT=237, GTE=238, LT=239, LTE=240, POUND_=241, LP_=242, RP_=243, LBE_=244, 
		RBE_=245, LBT_=246, RBT_=247, COMMA=248, DQ_=249, SQ_=250, BQ_=251, UL_=252, 
		QUESTION=253, AT_=254, SEMI_=255, ALL=256, AND=257, ANY=258, ASC=259, 
		BETWEEN=260, BINARY=261, BIT_NUM=262, BY=263, DATE=264, DESC=265, DISTINCT=266, 
		ESCAPE=267, EXISTS=268, FALSE=269, FROM=270, GROUP=271, HAVING=272, HIDDEN_=273, 
		IN=274, IS=275, KEY=276, LIKE=277, LIMIT=278, MOD=279, NOT=280, NULL=281, 
		OFFSET=282, OR=283, ORDER=284, PARTITION=285, PRIMARY=286, REGEXP=287, 
		ROLLUP=288, ROW=289, SET=290, SOUNDS=291, TIME=292, TIMESTAMP=293, TRUE=294, 
		UNION=295, UNKNOWN=296, WHERE=297, WITH=298, XOR=299, ADD=300, ALTER=301, 
		ALWAYS=302, AS=303, CASCADE=304, CHECK=305, COLUMN=306, COMMIT=307, COMMITTED=308, 
		CONSTRAINT=309, CREATE=310, CURRENT=311, DAY=312, DEFAULT=313, DELETE=314, 
		DISABLE=315, DROP=316, ENABLE=317, FOR=318, FOREIGN=319, FUNCTION=320, 
		GENERATED=321, GRANT=322, INDEX=323, ISOLATION=324, LEVEL=325, NO=326, 
		ON=327, OPTION=328, PASSWORD=329, PRIVILEGES=330, READ=331, REFERENCES=332, 
		REVOKE=333, ROLE=334, ROLLBACK=335, ROWS=336, SERIALIZABLE=337, START=338, 
		TABLE=339, TO=340, TRANSACTION=341, TRUNCATE=342, UNIQUE=343, USER=344, 
		WORK=345, YEAR=346, ID=347, BLOCK_COMMENT=348, SL_COMMENT=349, STRING=350, 
		NUMBER=351, INT_=352, EXP=353, HEX_DIGIT=354, WS=355;
	public static final int
		RULE_execute = 0, RULE_select = 1, RULE_withClause = 2, RULE_cteClause = 3, 
		RULE_selectExpression = 4, RULE_selectClause = 5, RULE_selectSpec = 6, 
		RULE_windowClause = 7, RULE_windowItem = 8, RULE_subquery = 9, RULE_caseExpress = 10, 
		RULE_caseComp = 11, RULE_caseWhenComp = 12, RULE_caseCond = 13, RULE_whenResult = 14, 
		RULE_elseResult = 15, RULE_caseResult = 16, RULE_idListWithEmpty = 17, 
		RULE_tableReferences = 18, RULE_tableReference = 19, RULE_tableFactor = 20, 
		RULE_joinTable = 21, RULE_joinCondition = 22, RULE_indexHintList = 23, 
		RULE_indexHint = 24, RULE_selectExpr = 25, RULE_intervalExpr = 26, RULE_alias = 27, 
		RULE_tableName = 28, RULE_characterSet = 29, RULE_charsetName = 30, RULE_collateClause = 31, 
		RULE_keyPartsWithParen = 32, RULE_keyParts = 33, RULE_keyPart = 34, RULE_symbol = 35, 
		RULE_indexType = 36, RULE_indexAndKey = 37, RULE_indexOption = 38, RULE_valueListWithParen = 39, 
		RULE_valueList = 40, RULE_value = 41, RULE_functionCall = 42, RULE_groupConcat = 43, 
		RULE_windowFunction = 44, RULE_overClause = 45, RULE_windowSpec = 46, 
		RULE_windowPartitionClause = 47, RULE_frameClause = 48, RULE_frameUnits = 49, 
		RULE_frameExtent = 50, RULE_frameStart = 51, RULE_frameBetween = 52, RULE_frameEnd = 53, 
		RULE_variable = 54, RULE_schemaName = 55, RULE_databaseName = 56, RULE_domainName = 57, 
		RULE_columnName = 58, RULE_sequenceName = 59, RULE_tablespaceName = 60, 
		RULE_collationName = 61, RULE_indexName = 62, RULE_cteName = 63, RULE_parserName = 64, 
		RULE_extensionName = 65, RULE_rowName = 66, RULE_opclass = 67, RULE_fileGroup = 68, 
		RULE_groupName = 69, RULE_constraintName = 70, RULE_keyName = 71, RULE_typeName = 72, 
		RULE_xmlSchemaCollection = 73, RULE_columnSetName = 74, RULE_directoryName = 75, 
		RULE_triggerName = 76, RULE_routineName = 77, RULE_roleName = 78, RULE_partitionName = 79, 
		RULE_rewriteRuleName = 80, RULE_ownerName = 81, RULE_userName = 82, RULE_serverName = 83, 
		RULE_dataTypeLength = 84, RULE_primaryKey = 85, RULE_matchNone = 86, RULE_ids = 87, 
		RULE_idList = 88, RULE_rangeClause = 89, RULE_rangeItem = 90, RULE_schemaNames = 91, 
		RULE_databaseNames = 92, RULE_domainNames = 93, RULE_tableList = 94, RULE_tableNames = 95, 
		RULE_columnNamesWithParen = 96, RULE_columnNames = 97, RULE_columnList = 98, 
		RULE_sequenceNames = 99, RULE_tablespaceNames = 100, RULE_indexNames = 101, 
		RULE_indexList = 102, RULE_typeNames = 103, RULE_rowNames = 104, RULE_roleNames = 105, 
		RULE_userNames = 106, RULE_serverNames = 107, RULE_bitExprs = 108, RULE_exprs = 109, 
		RULE_exprsWithParen = 110, RULE_expr = 111, RULE_exprRecursive = 112, 
		RULE_booleanPrimary = 113, RULE_comparisonOperator = 114, RULE_predicate = 115, 
		RULE_bitExpr = 116, RULE_simpleExpr = 117, RULE_distinct = 118, RULE_privateExprOfDb = 119, 
		RULE_liter = 120, RULE_question = 121, RULE_number = 122, RULE_string = 123, 
		RULE_orderByClause = 124, RULE_orderByItem = 125, RULE_unionSelect = 126, 
		RULE_fromClause = 127, RULE_whereClause = 128, RULE_groupByClause = 129, 
		RULE_havingClause = 130, RULE_limitClause = 131, RULE_partitionClause = 132, 
		RULE_selectExprs = 133, RULE_asterisk = 134, RULE_deleteClause = 135, 
		RULE_fromSingle = 136, RULE_fromMulti = 137, RULE_deleteSpec = 138, RULE_insert = 139, 
		RULE_insertClause = 140, RULE_insertSpec = 141, RULE_columnClause = 142, 
		RULE_valueClause = 143, RULE_setClause = 144, RULE_onDuplicateClause = 145, 
		RULE_itemListWithEmpty = 146, RULE_assignmentList = 147, RULE_assignment = 148, 
		RULE_updateClause = 149, RULE_updateSpec = 150, RULE_delete = 151, RULE_update = 152, 
		RULE_createIndex = 153, RULE_dropIndex = 154, RULE_createTable = 155, 
		RULE_createTableOptions = 156, RULE_createTableBasic = 157, RULE_createDefinitionsWithParen = 158, 
		RULE_createDefinitions = 159, RULE_createDefinition = 160, RULE_checkExpr = 161, 
		RULE_createTableSelect = 162, RULE_createTableLike = 163, RULE_likeTable = 164, 
		RULE_columnDefinition = 165, RULE_dataType = 166, RULE_dataTypeOption = 167, 
		RULE_dataTypeGeneratedOption = 168, RULE_defaultValue = 169, RULE_currentTimestampType = 170, 
		RULE_referenceDefinition = 171, RULE_referenceType = 172, RULE_referenceOption = 173, 
		RULE_dataTypeGenerated = 174, RULE_constraintDefinition = 175, RULE_primaryKeyOption = 176, 
		RULE_uniqueOption = 177, RULE_foreignKeyOption = 178, RULE_indexDefinition = 179, 
		RULE_tableOptions = 180, RULE_tableOption = 181, RULE_engineName = 182, 
		RULE_partitionOptions = 183, RULE_linearPartition = 184, RULE_yearFunctionExpr = 185, 
		RULE_rangeOrListPartition = 186, RULE_partitionDefinitions = 187, RULE_partitionDefinition = 188, 
		RULE_partitionDefinitionOption = 189, RULE_lessThanPartition = 190, RULE_subpartitionDefinition = 191, 
		RULE_alterTable = 192, RULE_alterSpecifications = 193, RULE_alterSpecification = 194, 
		RULE_singleColumn = 195, RULE_firstOrAfterColumn = 196, RULE_multiColumn = 197, 
		RULE_addConstraint = 198, RULE_addIndex = 199, RULE_addColumn = 200, RULE_changeColumn = 201, 
		RULE_changeColumnOp = 202, RULE_dropColumn = 203, RULE_dropIndexDef = 204, 
		RULE_dropPrimaryKey = 205, RULE_fkSymbol = 206, RULE_modifyColumn = 207, 
		RULE_renameIndex = 208, RULE_renameTable = 209, RULE_partitionNames = 210, 
		RULE_dropTable = 211, RULE_truncateTable = 212, RULE_setTransaction = 213, 
		RULE_setTransactionCharacteristic = 214, RULE_level = 215, RULE_accessMode = 216, 
		RULE_commit = 217, RULE_beginTransaction = 218, RULE_startTransaction = 219, 
		RULE_startTransactionCharacteristic = 220, RULE_rollback = 221, RULE_savepoint = 222, 
		RULE_setAutoCommit = 223, RULE_autoCommitValue = 224, RULE_grant = 225, 
		RULE_privType = 226, RULE_objectType = 227, RULE_privLevel = 228, RULE_host = 229, 
		RULE_user = 230, RULE_users = 231, RULE_role = 232, RULE_roles = 233, 
		RULE_userOrRole = 234, RULE_userOrRoles = 235, RULE_grantProxy = 236, 
		RULE_grantRole = 237, RULE_revoke = 238, RULE_revokeAll = 239, RULE_revokeProxy = 240, 
		RULE_revokeRole = 241, RULE_createUser = 242, RULE_authOption = 243, RULE_userAuthOption = 244, 
		RULE_userAuthOptions = 245, RULE_authPlugin = 246, RULE_tlsOption = 247, 
		RULE_resourceOption = 248, RULE_passwordOption = 249, RULE_lockOption = 250, 
		RULE_alterUser = 251, RULE_alterCurrentUser = 252, RULE_userFuncAuthOption = 253, 
		RULE_alterUserRole = 254, RULE_dropUser = 255, RULE_renameUser = 256, 
		RULE_createRole = 257, RULE_dropRole = 258, RULE_setPassword = 259, RULE_setDefaultRole = 260, 
		RULE_setRole = 261;
	public static final String[] ruleNames = {
		"execute", "select", "withClause", "cteClause", "selectExpression", "selectClause", 
		"selectSpec", "windowClause", "windowItem", "subquery", "caseExpress", 
		"caseComp", "caseWhenComp", "caseCond", "whenResult", "elseResult", "caseResult", 
		"idListWithEmpty", "tableReferences", "tableReference", "tableFactor", 
		"joinTable", "joinCondition", "indexHintList", "indexHint", "selectExpr", 
		"intervalExpr", "alias", "tableName", "characterSet", "charsetName", "collateClause", 
		"keyPartsWithParen", "keyParts", "keyPart", "symbol", "indexType", "indexAndKey", 
		"indexOption", "valueListWithParen", "valueList", "value", "functionCall", 
		"groupConcat", "windowFunction", "overClause", "windowSpec", "windowPartitionClause", 
		"frameClause", "frameUnits", "frameExtent", "frameStart", "frameBetween", 
		"frameEnd", "variable", "schemaName", "databaseName", "domainName", "columnName", 
		"sequenceName", "tablespaceName", "collationName", "indexName", "cteName", 
		"parserName", "extensionName", "rowName", "opclass", "fileGroup", "groupName", 
		"constraintName", "keyName", "typeName", "xmlSchemaCollection", "columnSetName", 
		"directoryName", "triggerName", "routineName", "roleName", "partitionName", 
		"rewriteRuleName", "ownerName", "userName", "serverName", "dataTypeLength", 
		"primaryKey", "matchNone", "ids", "idList", "rangeClause", "rangeItem", 
		"schemaNames", "databaseNames", "domainNames", "tableList", "tableNames", 
		"columnNamesWithParen", "columnNames", "columnList", "sequenceNames", 
		"tablespaceNames", "indexNames", "indexList", "typeNames", "rowNames", 
		"roleNames", "userNames", "serverNames", "bitExprs", "exprs", "exprsWithParen", 
		"expr", "exprRecursive", "booleanPrimary", "comparisonOperator", "predicate", 
		"bitExpr", "simpleExpr", "distinct", "privateExprOfDb", "liter", "question", 
		"number", "string", "orderByClause", "orderByItem", "unionSelect", "fromClause", 
		"whereClause", "groupByClause", "havingClause", "limitClause", "partitionClause", 
		"selectExprs", "asterisk", "deleteClause", "fromSingle", "fromMulti", 
		"deleteSpec", "insert", "insertClause", "insertSpec", "columnClause", 
		"valueClause", "setClause", "onDuplicateClause", "itemListWithEmpty", 
		"assignmentList", "assignment", "updateClause", "updateSpec", "delete", 
		"update", "createIndex", "dropIndex", "createTable", "createTableOptions", 
		"createTableBasic", "createDefinitionsWithParen", "createDefinitions", 
		"createDefinition", "checkExpr", "createTableSelect", "createTableLike", 
		"likeTable", "columnDefinition", "dataType", "dataTypeOption", "dataTypeGeneratedOption", 
		"defaultValue", "currentTimestampType", "referenceDefinition", "referenceType", 
		"referenceOption", "dataTypeGenerated", "constraintDefinition", "primaryKeyOption", 
		"uniqueOption", "foreignKeyOption", "indexDefinition", "tableOptions", 
		"tableOption", "engineName", "partitionOptions", "linearPartition", "yearFunctionExpr", 
		"rangeOrListPartition", "partitionDefinitions", "partitionDefinition", 
		"partitionDefinitionOption", "lessThanPartition", "subpartitionDefinition", 
		"alterTable", "alterSpecifications", "alterSpecification", "singleColumn", 
		"firstOrAfterColumn", "multiColumn", "addConstraint", "addIndex", "addColumn", 
		"changeColumn", "changeColumnOp", "dropColumn", "dropIndexDef", "dropPrimaryKey", 
		"fkSymbol", "modifyColumn", "renameIndex", "renameTable", "partitionNames", 
		"dropTable", "truncateTable", "setTransaction", "setTransactionCharacteristic", 
		"level", "accessMode", "commit", "beginTransaction", "startTransaction", 
		"startTransactionCharacteristic", "rollback", "savepoint", "setAutoCommit", 
		"autoCommitValue", "grant", "privType", "objectType", "privLevel", "host", 
		"user", "users", "role", "roles", "userOrRole", "userOrRoles", "grantProxy", 
		"grantRole", "revoke", "revokeAll", "revokeProxy", "revokeRole", "createUser", 
		"authOption", "userAuthOption", "userAuthOptions", "authPlugin", "tlsOption", 
		"resourceOption", "passwordOption", "lockOption", "alterUser", "alterCurrentUser", 
		"userFuncAuthOption", "alterUserRole", "dropUser", "renameUser", "createRole", 
		"dropRole", "setPassword", "setDefaultRole", "setRole"
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
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", 
		"'>>'", "'^'", "'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", 
		"'.*'", "'<=>'", "'=='", "'='", "'!='", "'<>'", "'>'", "'>='", "'<'", 
		"'<='", "'#'", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", "'\"'", 
		"'''", "'`'", "'_'", "'?'", "'@'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ACCOUNT", "ACTION", "ADMIN", "AFTER", "ALGORITHM", "ANALYZE", 
		"AUDIT_ADMIN", "AUTO_INCREMENT", "AUTOCOMMIT", "AVG_ROW_LENGTH", "BEGIN", 
		"BINLOG_ADMIN", "BTREE", "CASE", "CHAIN", "CHANGE", "CHAR", "CHARACTER", 
		"CHARSET", "CHECKSUM", "CIPHER", "CLIENT", "COALESCE", "COLLATE", "COLUMNS", 
		"COLUMN_FORMAT", "COMMENT", "COMPACT", "COMPRESSED", "COMPRESSION", "CONNECTION", 
		"CONNECTION_ADMIN", "CONSISTENT", "CONVERT", "COPY", "CROSS", "CURRENT_TIMESTAMP", 
		"DATA", "DATABASES", "DELAYED", "DELAY_KEY_WRITE", "DIRECTORY", "DISCARD", 
		"DISK", "DISTINCTROW", "DOUBLE", "DUPLICATE", "DYNAMIC", "ELSE", "ENCRYPTION", 
		"ENCRYPTION_KEY_ADMIN", "END", "ENGINE", "EVENT", "EXCEPT", "EXCHANGE", 
		"EXCLUSIVE", "EXECUTE", "EXPIRE", "FILE", "FIREWALL_ADMIN", "FIREWALL_USER", 
		"FIRST", "FIXED", "FOLLOWING", "FORCE", "FULL", "FULLTEXT", "GLOBAL", 
		"GROUP_CONCAT", "GROUP_REPLICATION_ADMIN", "HASH", "HIGH_PRIORITY", "HISTORY", 
		"IDENTIFIED", "IF", "IGNORE", "IMPORT_", "INNER", "INPLACE", "INSERT", 
		"INSERT_METHOD", "INTERVAL", "INTO", "ISSUER", "JOIN", "KEYS", "KEY_BLOCK_SIZE", 
		"LAST", "LEFT", "LESS", "LINEAR", "LIST", "LOCALTIME", "LOCALTIMESTAMP", 
		"LOCK", "LOW_PRIORITY", "MATCH", "MAXVALUE", "MAX_CONNECTIONS_PER_HOUR", 
		"MAX_QUERIES_PER_HOUR", "MAX_ROWS", "MAX_UPDATES_PER_HOUR", "MAX_USER_CONNECTIONS", 
		"MEMORY", "MIN_ROWS", "MODIFY", "NATURAL", "NEVER", "NONE", "NOW", "OFFLINE", 
		"OLD", "ONLINE", "ONLY", "OPTIMIZE", "OPTIONAL", "OUTER", "OVER", "PACK_KEYS", 
		"PARSER", "PARTIAL", "PARTITIONING", "PARTITIONS", "PERSIST", "PERSIST_ONLY", 
		"PRECEDING", "PRECISION", "PROCEDURE", "PROCESS", "PROXY", "QUICK", "RANGE", 
		"REBUILD", "RECURSIVE", "REDUNDANT", "RELEASE", "RELOAD", "REMOVE", "RENAME", 
		"REORGANIZE", "REPAIR", "REPEATABLE", "REPLACE", "REPLICATION", "REPLICATION_SLAVE_ADMIN", 
		"REQUIRE", "RESTRICT", "RETAIN", "REUSE", "RIGHT", "ROLE_ADMIN", "ROUTINE", 
		"ROW_FORMAT", "SAVEPOINT", "SELECT", "SEPARATOR", "SESSION", "SET_USER_ID", 
		"SHARED", "SHOW", "SHUTDOWN", "SIMPLE", "SLAVE", "SNAPSHOT", "SPATIAL", 
		"SQLDML", "SQLDQL", "SQL_BIG_RESULT", "SQL_BUFFER_RESULT", "SQL_CACHE", 
		"SQL_CALC_FOUND_ROWS", "SQL_NO_CACHE", "SQL_SMALL_RESULT", "SSL", "STATS_AUTO_RECALC", 
		"STATS_PERSISTENT", "STATS_SAMPLE_PAGES", "STORAGE", "STORED", "STRAIGHT_JOIN", 
		"SUBJECT", "SUBPARTITION", "SUBPARTITIONS", "SUPER", "SYSTEM_VARIABLES_ADMIN", 
		"TABLES", "TABLESPACE", "TEMPORARY", "THAN", "THEN", "TRIGGER", "UNBOUNDED", 
		"UNCOMMITTED", "UNLOCK", "UNSIGNED", "UPDATE", "UPGRADE", "USAGE", "USE", 
		"USING", "VALIDATION", "VALUE", "VALUES", "VERSION_TOKEN_ADMIN", "VIEW", 
		"VIRTUAL", "WHEN", "WINDOW", "WITHOUT", "WRITE", "ZEROFILL", "AND_", "OR_", 
		"NOT_", "UNARY_BIT_COMPLEMENT", "BIT_INCLUSIVE_OR", "BIT_AND", "SIGNED_LEFT_SHIFT", 
		"SIGNED_RIGHT_SHIFT", "BIT_EXCLUSIVE_OR", "MOD_", "COLON", "PLUS", "MINUS", 
		"ASTERISK", "SLASH", "BACKSLASH", "DOT", "DOT_ASTERISK", "SAFE_EQ", "EQ", 
		"EQ_", "NEQ", "NEQ_", "GT", "GTE", "LT", "LTE", "POUND_", "LP_", "RP_", 
		"LBE_", "RBE_", "LBT_", "RBT_", "COMMA", "DQ_", "SQ_", "BQ_", "UL_", "QUESTION", 
		"AT_", "SEMI_", "ALL", "AND", "ANY", "ASC", "BETWEEN", "BINARY", "BIT_NUM", 
		"BY", "DATE", "DESC", "DISTINCT", "ESCAPE", "EXISTS", "FALSE", "FROM", 
		"GROUP", "HAVING", "HIDDEN_", "IN", "IS", "KEY", "LIKE", "LIMIT", "MOD", 
		"NOT", "NULL", "OFFSET", "OR", "ORDER", "PARTITION", "PRIMARY", "REGEXP", 
		"ROLLUP", "ROW", "SET", "SOUNDS", "TIME", "TIMESTAMP", "TRUE", "UNION", 
		"UNKNOWN", "WHERE", "WITH", "XOR", "ADD", "ALTER", "ALWAYS", "AS", "CASCADE", 
		"CHECK", "COLUMN", "COMMIT", "COMMITTED", "CONSTRAINT", "CREATE", "CURRENT", 
		"DAY", "DEFAULT", "DELETE", "DISABLE", "DROP", "ENABLE", "FOR", "FOREIGN", 
		"FUNCTION", "GENERATED", "GRANT", "INDEX", "ISOLATION", "LEVEL", "NO", 
		"ON", "OPTION", "PASSWORD", "PRIVILEGES", "READ", "REFERENCES", "REVOKE", 
		"ROLE", "ROLLBACK", "ROWS", "SERIALIZABLE", "START", "TABLE", "TO", "TRANSACTION", 
		"TRUNCATE", "UNIQUE", "USER", "WORK", "YEAR", "ID", "BLOCK_COMMENT", "SL_COMMENT", 
		"STRING", "NUMBER", "INT_", "EXP", "HEX_DIGIT", "WS"
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
	public String getGrammarFileName() { return "MySQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MySQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExecuteContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
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
		public GrantProxyContext grantProxy() {
			return getRuleContext(GrantProxyContext.class,0);
		}
		public GrantRoleContext grantRole() {
			return getRuleContext(GrantRoleContext.class,0);
		}
		public RevokeContext revoke() {
			return getRuleContext(RevokeContext.class,0);
		}
		public RevokeAllContext revokeAll() {
			return getRuleContext(RevokeAllContext.class,0);
		}
		public RevokeProxyContext revokeProxy() {
			return getRuleContext(RevokeProxyContext.class,0);
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
		public AlterCurrentUserContext alterCurrentUser() {
			return getRuleContext(AlterCurrentUserContext.class,0);
		}
		public AlterUserRoleContext alterUserRole() {
			return getRuleContext(AlterUserRoleContext.class,0);
		}
		public DropUserContext dropUser() {
			return getRuleContext(DropUserContext.class,0);
		}
		public RenameUserContext renameUser() {
			return getRuleContext(RenameUserContext.class,0);
		}
		public CreateRoleContext createRole() {
			return getRuleContext(CreateRoleContext.class,0);
		}
		public DropRoleContext dropRole() {
			return getRuleContext(DropRoleContext.class,0);
		}
		public SetPasswordContext setPassword() {
			return getRuleContext(SetPasswordContext.class,0);
		}
		public SetDefaultRoleContext setDefaultRole() {
			return getRuleContext(SetDefaultRoleContext.class,0);
		}
		public SetRoleContext setRole() {
			return getRuleContext(SetRoleContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(MySQLStatementParser.SEMI_, 0); }
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
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(524);
				select();
				}
				break;
			case 2:
				{
				setState(525);
				insert();
				}
				break;
			case 3:
				{
				setState(526);
				update();
				}
				break;
			case 4:
				{
				setState(527);
				delete();
				}
				break;
			case 5:
				{
				setState(528);
				createIndex();
				}
				break;
			case 6:
				{
				setState(529);
				dropIndex();
				}
				break;
			case 7:
				{
				setState(530);
				createTable();
				}
				break;
			case 8:
				{
				setState(531);
				alterTable();
				}
				break;
			case 9:
				{
				setState(532);
				dropTable();
				}
				break;
			case 10:
				{
				setState(533);
				truncateTable();
				}
				break;
			case 11:
				{
				setState(534);
				beginTransaction();
				}
				break;
			case 12:
				{
				setState(535);
				setAutoCommit();
				}
				break;
			case 13:
				{
				setState(536);
				commit();
				}
				break;
			case 14:
				{
				setState(537);
				rollback();
				}
				break;
			case 15:
				{
				setState(538);
				setTransaction();
				}
				break;
			case 16:
				{
				setState(539);
				savepoint();
				}
				break;
			case 17:
				{
				setState(540);
				grant();
				}
				break;
			case 18:
				{
				setState(541);
				grantProxy();
				}
				break;
			case 19:
				{
				setState(542);
				grantRole();
				}
				break;
			case 20:
				{
				setState(543);
				revoke();
				}
				break;
			case 21:
				{
				setState(544);
				revokeAll();
				}
				break;
			case 22:
				{
				setState(545);
				revokeProxy();
				}
				break;
			case 23:
				{
				setState(546);
				revokeRole();
				}
				break;
			case 24:
				{
				setState(547);
				createUser();
				}
				break;
			case 25:
				{
				setState(548);
				alterUser();
				}
				break;
			case 26:
				{
				setState(549);
				alterCurrentUser();
				}
				break;
			case 27:
				{
				setState(550);
				alterUserRole();
				}
				break;
			case 28:
				{
				setState(551);
				dropUser();
				}
				break;
			case 29:
				{
				setState(552);
				renameUser();
				}
				break;
			case 30:
				{
				setState(553);
				createRole();
				}
				break;
			case 31:
				{
				setState(554);
				dropRole();
				}
				break;
			case 32:
				{
				setState(555);
				setPassword();
				}
				break;
			case 33:
				{
				setState(556);
				setDefaultRole();
				}
				break;
			case 34:
				{
				setState(557);
				setRole();
				}
				break;
			}
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(560);
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

	public static class SelectContext extends ParserRuleContext {
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public UnionSelectContext unionSelect() {
			return getRuleContext(UnionSelectContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select);
		try {
			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				withClause();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				unionSelect();
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

	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public List<CteClauseContext> cteClause() {
			return getRuleContexts(CteClauseContext.class);
		}
		public CteClauseContext cteClause(int i) {
			return getRuleContext(CteClauseContext.class,i);
		}
		public UnionSelectContext unionSelect() {
			return getRuleContext(UnionSelectContext.class,0);
		}
		public TerminalNode RECURSIVE() { return getToken(MySQLStatementParser.RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_withClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(WITH);
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(568);
				match(RECURSIVE);
				}
			}

			setState(571);
			cteClause();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(572);
				match(COMMA);
				setState(573);
				cteClause();
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(579);
			unionSelect();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CteClauseContext extends ParserRuleContext {
		public CteNameContext cteName() {
			return getRuleContext(CteNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public CteClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteClause; }
	}

	public final CteClauseContext cteClause() throws RecognitionException {
		CteClauseContext _localctx = new CteClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cteClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			cteName();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(582);
				idList();
				}
			}

			setState(585);
			match(AS);
			setState(586);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExpressionContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SelectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpression; }
	}

	public final SelectExpressionContext selectExpression() throws RecognitionException {
		SelectExpressionContext _localctx = new SelectExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			selectClause();
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(589);
				fromClause();
				}
			}

			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(592);
				whereClause();
				}
			}

			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(595);
				groupByClause();
				}
			}

			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(598);
				havingClause();
				}
			}

			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(601);
				windowClause();
				}
			}

			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(604);
				orderByClause();
				}
			}

			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(607);
				limitClause();
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

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MySQLStatementParser.SELECT, 0); }
		public SelectSpecContext selectSpec() {
			return getRuleContext(SelectSpecContext.class,0);
		}
		public SelectExprsContext selectExprs() {
			return getRuleContext(SelectExprsContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(SELECT);
			setState(611);
			selectSpec();
			setState(612);
			selectExprs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectSpecContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public TerminalNode DISTINCTROW() { return getToken(MySQLStatementParser.DISTINCTROW, 0); }
		public TerminalNode HIGH_PRIORITY() { return getToken(MySQLStatementParser.HIGH_PRIORITY, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(MySQLStatementParser.STRAIGHT_JOIN, 0); }
		public TerminalNode SQL_SMALL_RESULT() { return getToken(MySQLStatementParser.SQL_SMALL_RESULT, 0); }
		public TerminalNode SQL_BIG_RESULT() { return getToken(MySQLStatementParser.SQL_BIG_RESULT, 0); }
		public TerminalNode SQL_BUFFER_RESULT() { return getToken(MySQLStatementParser.SQL_BUFFER_RESULT, 0); }
		public TerminalNode SQL_CALC_FOUND_ROWS() { return getToken(MySQLStatementParser.SQL_CALC_FOUND_ROWS, 0); }
		public TerminalNode SQL_CACHE() { return getToken(MySQLStatementParser.SQL_CACHE, 0); }
		public TerminalNode SQL_NO_CACHE() { return getToken(MySQLStatementParser.SQL_NO_CACHE, 0); }
		public SelectSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectSpec; }
	}

	public final SelectSpecContext selectSpec() throws RecognitionException {
		SelectSpecContext _localctx = new SelectSpecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selectSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(614);
				match(ALL);
				}
				break;
			case DISTINCT:
				{
				setState(615);
				distinct();
				}
				break;
			case DISTINCTROW:
				{
				setState(616);
				match(DISTINCTROW);
				}
				break;
			case T__0:
			case CASE:
			case GLOBAL:
			case GROUP_CONCAT:
			case HIGH_PRIORITY:
			case INTERVAL:
			case PERSIST:
			case PERSIST_ONLY:
			case SESSION:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_CALC_FOUND_ROWS:
			case SQL_NO_CACHE:
			case SQL_SMALL_RESULT:
			case STRAIGHT_JOIN:
			case NOT_:
			case UNARY_BIT_COMPLEMENT:
			case PLUS:
			case MINUS:
			case ASTERISK:
			case DOT:
			case LP_:
			case LBE_:
			case QUESTION:
			case AT_:
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
				break;
			default:
				break;
			}
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HIGH_PRIORITY) {
				{
				setState(619);
				match(HIGH_PRIORITY);
				}
			}

			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRAIGHT_JOIN) {
				{
				setState(622);
				match(STRAIGHT_JOIN);
				}
			}

			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQL_SMALL_RESULT) {
				{
				setState(625);
				match(SQL_SMALL_RESULT);
				}
			}

			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQL_BIG_RESULT) {
				{
				setState(628);
				match(SQL_BIG_RESULT);
				}
			}

			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQL_BUFFER_RESULT) {
				{
				setState(631);
				match(SQL_BUFFER_RESULT);
				}
			}

			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQL_CACHE || _la==SQL_NO_CACHE) {
				{
				setState(634);
				_la = _input.LA(1);
				if ( !(_la==SQL_CACHE || _la==SQL_NO_CACHE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQL_CALC_FOUND_ROWS) {
				{
				setState(637);
				match(SQL_CALC_FOUND_ROWS);
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

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(MySQLStatementParser.WINDOW, 0); }
		public List<WindowItemContext> windowItem() {
			return getRuleContexts(WindowItemContext.class);
		}
		public WindowItemContext windowItem(int i) {
			return getRuleContext(WindowItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_windowClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(WINDOW);
			setState(641);
			windowItem();
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(642);
				match(COMMA);
				setState(643);
				windowItem();
				}
				}
				setState(648);
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

	public static class WindowItemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public WindowItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowItem; }
	}

	public final WindowItemContext windowItem() throws RecognitionException {
		WindowItemContext _localctx = new WindowItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_windowItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(ID);
			setState(650);
			match(AS);
			setState(651);
			match(LP_);
			setState(652);
			windowSpec();
			setState(653);
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

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public UnionSelectContext unionSelect() {
			return getRuleContext(UnionSelectContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(LP_);
			setState(656);
			unionSelect();
			setState(657);
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

	public static class CaseExpressContext extends ParserRuleContext {
		public CaseCondContext caseCond() {
			return getRuleContext(CaseCondContext.class,0);
		}
		public CaseCompContext caseComp() {
			return getRuleContext(CaseCompContext.class,0);
		}
		public CaseExpressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpress; }
	}

	public final CaseExpressContext caseExpress() throws RecognitionException {
		CaseExpressContext _localctx = new CaseExpressContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_caseExpress);
		try {
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				caseCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				caseComp();
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

	public static class CaseCompContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(MySQLStatementParser.CASE, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode END() { return getToken(MySQLStatementParser.END, 0); }
		public List<CaseWhenCompContext> caseWhenComp() {
			return getRuleContexts(CaseWhenCompContext.class);
		}
		public CaseWhenCompContext caseWhenComp(int i) {
			return getRuleContext(CaseWhenCompContext.class,i);
		}
		public ElseResultContext elseResult() {
			return getRuleContext(ElseResultContext.class,0);
		}
		public CaseCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseComp; }
	}

	public final CaseCompContext caseComp() throws RecognitionException {
		CaseCompContext _localctx = new CaseCompContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_caseComp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(CASE);
			setState(664);
			simpleExpr(0);
			setState(666); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(665);
				caseWhenComp();
				}
				}
				setState(668); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(670);
				elseResult();
				}
			}

			setState(673);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseWhenCompContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(MySQLStatementParser.WHEN, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MySQLStatementParser.THEN, 0); }
		public CaseResultContext caseResult() {
			return getRuleContext(CaseResultContext.class,0);
		}
		public CaseWhenCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhenComp; }
	}

	public final CaseWhenCompContext caseWhenComp() throws RecognitionException {
		CaseWhenCompContext _localctx = new CaseWhenCompContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_caseWhenComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(WHEN);
			setState(676);
			simpleExpr(0);
			setState(677);
			match(THEN);
			setState(678);
			caseResult();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseCondContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(MySQLStatementParser.CASE, 0); }
		public TerminalNode END() { return getToken(MySQLStatementParser.END, 0); }
		public List<WhenResultContext> whenResult() {
			return getRuleContexts(WhenResultContext.class);
		}
		public WhenResultContext whenResult(int i) {
			return getRuleContext(WhenResultContext.class,i);
		}
		public ElseResultContext elseResult() {
			return getRuleContext(ElseResultContext.class,0);
		}
		public CaseCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseCond; }
	}

	public final CaseCondContext caseCond() throws RecognitionException {
		CaseCondContext _localctx = new CaseCondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_caseCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(CASE);
			setState(682); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(681);
				whenResult();
				}
				}
				setState(684); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(686);
				elseResult();
				}
			}

			setState(689);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenResultContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(MySQLStatementParser.WHEN, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MySQLStatementParser.THEN, 0); }
		public CaseResultContext caseResult() {
			return getRuleContext(CaseResultContext.class,0);
		}
		public WhenResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenResult; }
	}

	public final WhenResultContext whenResult() throws RecognitionException {
		WhenResultContext _localctx = new WhenResultContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whenResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(WHEN);
			setState(692);
			booleanPrimary(0);
			setState(693);
			match(THEN);
			setState(694);
			caseResult();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseResultContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MySQLStatementParser.ELSE, 0); }
		public CaseResultContext caseResult() {
			return getRuleContext(CaseResultContext.class,0);
		}
		public ElseResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseResult; }
	}

	public final ElseResultContext elseResult() throws RecognitionException {
		ElseResultContext _localctx = new ElseResultContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(ELSE);
			setState(697);
			caseResult();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseResultContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseResult; }
	}

	public final CaseResultContext caseResult() throws RecognitionException {
		CaseResultContext _localctx = new CaseResultContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_caseResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
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

	public static class IdListWithEmptyContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public IdListWithEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idListWithEmpty; }
	}

	public final IdListWithEmptyContext idListWithEmpty() throws RecognitionException {
		IdListWithEmptyContext _localctx = new IdListWithEmptyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_idListWithEmpty);
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				match(LP_);
				setState(702);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				idList();
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

	public static class TableReferencesContext extends ParserRuleContext {
		public List<TableReferenceContext> tableReference() {
			return getRuleContexts(TableReferenceContext.class);
		}
		public TableReferenceContext tableReference(int i) {
			return getRuleContext(TableReferenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			tableReference();
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(707);
				match(COMMA);
				setState(708);
				tableReference();
				}
				}
				setState(713);
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

	public static class TableReferenceContext extends ParserRuleContext {
		public List<TableFactorContext> tableFactor() {
			return getRuleContexts(TableFactorContext.class);
		}
		public TableFactorContext tableFactor(int i) {
			return getRuleContext(TableFactorContext.class,i);
		}
		public List<JoinTableContext> joinTable() {
			return getRuleContexts(JoinTableContext.class);
		}
		public JoinTableContext joinTable(int i) {
			return getRuleContext(JoinTableContext.class,i);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tableReference);
		int _la;
		try {
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(717); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(714);
					tableFactor();
					setState(715);
					joinTable();
					}
					}
					setState(719); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ASTERISK || _la==LP_ || _la==ID );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				tableFactor();
				setState(723); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(722);
					joinTable();
					}
					}
					setState(725); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CROSS || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (INNER - 80)) | (1L << (JOIN - 80)) | (1L << (LEFT - 80)) | (1L << (NATURAL - 80)))) != 0) || _la==RIGHT || _la==STRAIGHT_JOIN );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
				tableFactor();
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

	public static class TableFactorContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public IndexHintListContext indexHintList() {
			return getRuleContext(IndexHintListContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableFactor);
		int _la;
		try {
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				tableName();
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(731);
					match(PARTITION);
					setState(732);
					idList();
					}
				}

				setState(739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(736);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(735);
						match(AS);
						}
					}

					setState(738);
					alias();
					}
					break;
				}
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FORCE || _la==IGNORE || _la==USE) {
					{
					setState(741);
					indexHintList();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				subquery();
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(745);
					match(AS);
					}
				}

				setState(748);
				alias();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(750);
				match(LP_);
				setState(751);
				tableReferences();
				setState(752);
				match(RP_);
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

	public static class JoinTableContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(MySQLStatementParser.JOIN, 0); }
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public JoinConditionContext joinCondition() {
			return getRuleContext(JoinConditionContext.class,0);
		}
		public TerminalNode INNER() { return getToken(MySQLStatementParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(MySQLStatementParser.CROSS, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(MySQLStatementParser.STRAIGHT_JOIN, 0); }
		public TerminalNode LEFT() { return getToken(MySQLStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLStatementParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLStatementParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(MySQLStatementParser.NATURAL, 0); }
		public JoinTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinTable; }
	}

	public final JoinTableContext joinTable() throws RecognitionException {
		JoinTableContext _localctx = new JoinTableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_joinTable);
		int _la;
		try {
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CROSS || _la==INNER) {
					{
					setState(756);
					_la = _input.LA(1);
					if ( !(_la==CROSS || _la==INNER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(759);
				match(JOIN);
				setState(760);
				tableFactor();
				setState(762);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(761);
					joinCondition();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				match(STRAIGHT_JOIN);
				setState(765);
				tableFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(766);
				match(STRAIGHT_JOIN);
				setState(767);
				tableFactor();
				setState(768);
				joinCondition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(770);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(771);
					match(OUTER);
					}
				}

				setState(774);
				match(JOIN);
				setState(775);
				tableFactor();
				setState(776);
				joinCondition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(778);
				match(NATURAL);
				setState(782);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INNER:
					{
					setState(779);
					match(INNER);
					}
					break;
				case LEFT:
				case RIGHT:
					{
					setState(780);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					{
					setState(781);
					match(OUTER);
					}
					}
					break;
				case JOIN:
					break;
				default:
					break;
				}
				setState(784);
				match(JOIN);
				setState(785);
				tableFactor();
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

	public static class JoinConditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public JoinConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCondition; }
	}

	public final JoinConditionContext joinCondition() throws RecognitionException {
		JoinConditionContext _localctx = new JoinConditionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_joinCondition);
		try {
			setState(792);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				match(ON);
				setState(789);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				match(USING);
				setState(791);
				idList();
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

	public static class IndexHintListContext extends ParserRuleContext {
		public List<IndexHintContext> indexHint() {
			return getRuleContexts(IndexHintContext.class);
		}
		public IndexHintContext indexHint(int i) {
			return getRuleContext(IndexHintContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public IndexHintListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHintList; }
	}

	public final IndexHintListContext indexHintList() throws RecognitionException {
		IndexHintListContext _localctx = new IndexHintListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_indexHintList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			indexHint();
			setState(799);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(795);
					match(COMMA);
					setState(796);
					indexHint();
					}
					} 
				}
				setState(801);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class IndexHintContext extends ParserRuleContext {
		public IndexListContext indexList() {
			return getRuleContext(IndexListContext.class,0);
		}
		public TerminalNode USE() { return getToken(MySQLStatementParser.USE, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public TerminalNode FORCE() { return getToken(MySQLStatementParser.FORCE, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public List<TerminalNode> FOR() { return getTokens(MySQLStatementParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(MySQLStatementParser.FOR, i);
		}
		public List<TerminalNode> JOIN() { return getTokens(MySQLStatementParser.JOIN); }
		public TerminalNode JOIN(int i) {
			return getToken(MySQLStatementParser.JOIN, i);
		}
		public List<TerminalNode> ORDER() { return getTokens(MySQLStatementParser.ORDER); }
		public TerminalNode ORDER(int i) {
			return getToken(MySQLStatementParser.ORDER, i);
		}
		public List<TerminalNode> BY() { return getTokens(MySQLStatementParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(MySQLStatementParser.BY, i);
		}
		public List<TerminalNode> GROUP() { return getTokens(MySQLStatementParser.GROUP); }
		public TerminalNode GROUP(int i) {
			return getToken(MySQLStatementParser.GROUP, i);
		}
		public IndexHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHint; }
	}

	public final IndexHintContext indexHint() throws RecognitionException {
		IndexHintContext _localctx = new IndexHintContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_indexHint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			_la = _input.LA(1);
			if ( !(_la==FORCE || _la==IGNORE || _la==USE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(803);
			_la = _input.LA(1);
			if ( !(_la==KEY || _la==INDEX) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FOR) {
				{
				{
				setState(804);
				match(FOR);
				setState(810);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JOIN:
					{
					setState(805);
					match(JOIN);
					}
					break;
				case ORDER:
					{
					setState(806);
					match(ORDER);
					setState(807);
					match(BY);
					}
					break;
				case GROUP:
					{
					setState(808);
					match(GROUP);
					setState(809);
					match(BY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(817);
			indexList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExprContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode DOT_ASTERISK() { return getToken(MySQLStatementParser.DOT_ASTERISK, 0); }
		public SelectExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpr; }
	}

	public final SelectExprContext selectExpr() throws RecognitionException {
		SelectExprContext _localctx = new SelectExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_selectExpr);
		int _la;
		try {
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(819);
					columnName();
					}
					break;
				case 2:
					{
					setState(820);
					expr(0);
					}
					break;
				}
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(823);
					match(AS);
					}
				}

				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 329)) & ~0x3f) == 0 && ((1L << (_la - 329)) & ((1L << (PASSWORD - 329)) | (1L << (ID - 329)) | (1L << (STRING - 329)))) != 0)) {
					{
					setState(826);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				columnName();
				setState(830);
				match(DOT_ASTERISK);
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

	public static class IntervalExprContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(MySQLStatementParser.INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public IntervalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpr; }
	}

	public final IntervalExprContext intervalExpr() throws RecognitionException {
		IntervalExprContext _localctx = new IntervalExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_intervalExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(INTERVAL);
			setState(835);
			expr(0);
			setState(836);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public TerminalNode PASSWORD() { return getToken(MySQLStatementParser.PASSWORD, 0); }
		public TerminalNode STRING() { return getToken(MySQLStatementParser.STRING, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			_la = _input.LA(1);
			if ( !(((((_la - 329)) & ~0x3f) == 0 && ((1L << (_la - 329)) & ((1L << (PASSWORD - 329)) | (1L << (ID - 329)) | (1L << (STRING - 329)))) != 0)) ) {
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

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public TerminalNode DOT_ASTERISK() { return getToken(MySQLStatementParser.DOT_ASTERISK, 0); }
		public TerminalNode ASTERISK() { return getToken(MySQLStatementParser.ASTERISK, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tableName);
		try {
			setState(844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				match(ID);
				setState(842);
				match(DOT_ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(843);
				match(ASTERISK);
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

	public static class CharacterSetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(MySQLStatementParser.CHARACTER, 0); }
		public TerminalNode CHAR() { return getToken(MySQLStatementParser.CHAR, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode CHARSET() { return getToken(MySQLStatementParser.CHARSET, 0); }
		public CharacterSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSet; }
	}

	public final CharacterSetContext characterSet() throws RecognitionException {
		CharacterSetContext _localctx = new CharacterSetContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_characterSet);
		int _la;
		try {
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				_la = _input.LA(1);
				if ( !(_la==CHAR || _la==CHARACTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(847);
				match(SET);
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(848);
					match(EQ_);
					}
				}

				setState(851);
				charsetName();
				}
				break;
			case CHARSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				match(CHARSET);
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(853);
					match(EQ_);
					}
				}

				setState(856);
				charsetName();
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

	public static class CharsetNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public TerminalNode BINARY() { return getToken(MySQLStatementParser.BINARY, 0); }
		public CharsetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charsetName; }
	}

	public final CharsetNameContext charsetName() throws RecognitionException {
		CharsetNameContext _localctx = new CharsetNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_charsetName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			_la = _input.LA(1);
			if ( !(_la==BINARY || _la==ID) ) {
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
		public TerminalNode COLLATE() { return getToken(MySQLStatementParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public CollateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause; }
	}

	public final CollateClauseContext collateClause() throws RecognitionException {
		CollateClauseContext _localctx = new CollateClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_collateClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(COLLATE);
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(862);
				match(EQ_);
				}
			}

			setState(865);
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

	public static class KeyPartsWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public KeyPartsContext keyParts() {
			return getRuleContext(KeyPartsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public KeyPartsWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyPartsWithParen; }
	}

	public final KeyPartsWithParenContext keyPartsWithParen() throws RecognitionException {
		KeyPartsWithParenContext _localctx = new KeyPartsWithParenContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_keyPartsWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			match(LP_);
			setState(868);
			keyParts();
			setState(869);
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

	public static class KeyPartsContext extends ParserRuleContext {
		public List<KeyPartContext> keyPart() {
			return getRuleContexts(KeyPartContext.class);
		}
		public KeyPartContext keyPart(int i) {
			return getRuleContext(KeyPartContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public KeyPartsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyParts; }
	}

	public final KeyPartsContext keyParts() throws RecognitionException {
		KeyPartsContext _localctx = new KeyPartsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_keyParts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			keyPart();
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(872);
				match(COMMA);
				setState(873);
				keyPart();
				}
				}
				setState(878);
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

	public static class KeyPartContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode NUMBER() { return getToken(MySQLStatementParser.NUMBER, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode ASC() { return getToken(MySQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MySQLStatementParser.DESC, 0); }
		public KeyPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyPart; }
	}

	public final KeyPartContext keyPart() throws RecognitionException {
		KeyPartContext _localctx = new KeyPartContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_keyPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			columnName();
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(880);
				match(LP_);
				setState(881);
				match(NUMBER);
				setState(882);
				match(RP_);
				}
			}

			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(885);
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

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
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

	public static class IndexTypeContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public TerminalNode BTREE() { return getToken(MySQLStatementParser.BTREE, 0); }
		public TerminalNode HASH() { return getToken(MySQLStatementParser.HASH, 0); }
		public IndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType; }
	}

	public final IndexTypeContext indexType() throws RecognitionException {
		IndexTypeContext _localctx = new IndexTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_indexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(USING);
			setState(891);
			_la = _input.LA(1);
			if ( !(_la==BTREE || _la==HASH) ) {
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

	public static class IndexAndKeyContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public IndexAndKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexAndKey; }
	}

	public final IndexAndKeyContext indexAndKey() throws RecognitionException {
		IndexAndKeyContext _localctx = new IndexAndKeyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_indexAndKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_la = _input.LA(1);
			if ( !(_la==KEY || _la==INDEX) ) {
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

	public static class IndexOptionContext extends ParserRuleContext {
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(MySQLStatementParser.KEY_BLOCK_SIZE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public IndexTypeContext indexType() {
			return getRuleContext(IndexTypeContext.class,0);
		}
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public TerminalNode PARSER() { return getToken(MySQLStatementParser.PARSER, 0); }
		public ParserNameContext parserName() {
			return getRuleContext(ParserNameContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(MySQLStatementParser.STRING, 0); }
		public IndexOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOption; }
	}

	public final IndexOptionContext indexOption() throws RecognitionException {
		IndexOptionContext _localctx = new IndexOptionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_indexOption);
		int _la;
		try {
			setState(906);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY_BLOCK_SIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(895);
				match(KEY_BLOCK_SIZE);
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(896);
					match(EQ_);
					}
				}

				setState(899);
				value();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
				indexType();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 3);
				{
				setState(901);
				match(WITH);
				setState(902);
				match(PARSER);
				setState(903);
				parserName();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(904);
				match(COMMENT);
				setState(905);
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

	public static class ValueListWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public ValueListWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueListWithParen; }
	}

	public final ValueListWithParenContext valueListWithParen() throws RecognitionException {
		ValueListWithParenContext _localctx = new ValueListWithParenContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_valueListWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(LP_);
			setState(909);
			valueList();
			setState(910);
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

	public static class ValueListContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			value();
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(913);
				match(COMMA);
				setState(914);
				value();
				}
				}
				setState(919);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public TerminalNode MAXVALUE() { return getToken(MySQLStatementParser.MAXVALUE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprsWithParenContext exprsWithParen() {
			return getRuleContext(ExprsWithParenContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_value);
		try {
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
				match(DEFAULT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
				match(MAXVALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(922);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(923);
				exprsWithParen();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public TerminalNode DATE() { return getToken(MySQLStatementParser.DATE, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(MySQLStatementParser.ASTERISK, 0); }
		public GroupConcatContext groupConcat() {
			return getRuleContext(GroupConcatContext.class,0);
		}
		public WindowFunctionContext windowFunction() {
			return getRuleContext(WindowFunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionCall);
		int _la;
		try {
			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				_la = _input.LA(1);
				if ( !(_la==DATE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(927);
				match(LP_);
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(928);
					distinct();
					}
				}

				setState(933);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case CASE:
				case GLOBAL:
				case GROUP_CONCAT:
				case INTERVAL:
				case PERSIST:
				case PERSIST_ONLY:
				case SESSION:
				case NOT_:
				case UNARY_BIT_COMPLEMENT:
				case PLUS:
				case MINUS:
				case DOT:
				case LP_:
				case LBE_:
				case QUESTION:
				case AT_:
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
					setState(931);
					exprs();
					}
					break;
				case ASTERISK:
					{
					setState(932);
					match(ASTERISK);
					}
					break;
				case RP_:
					break;
				default:
					break;
				}
				setState(935);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				groupConcat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(937);
				windowFunction();
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

	public static class GroupConcatContext extends ParserRuleContext {
		public TerminalNode GROUP_CONCAT() { return getToken(MySQLStatementParser.GROUP_CONCAT, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(MySQLStatementParser.SEPARATOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(MySQLStatementParser.ASTERISK, 0); }
		public GroupConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupConcat; }
	}

	public final GroupConcatContext groupConcat() throws RecognitionException {
		GroupConcatContext _localctx = new GroupConcatContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_groupConcat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(GROUP_CONCAT);
			setState(941);
			match(LP_);
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(942);
				distinct();
				}
			}

			setState(947);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case CASE:
			case GLOBAL:
			case GROUP_CONCAT:
			case INTERVAL:
			case PERSIST:
			case PERSIST_ONLY:
			case SESSION:
			case NOT_:
			case UNARY_BIT_COMPLEMENT:
			case PLUS:
			case MINUS:
			case DOT:
			case LP_:
			case LBE_:
			case QUESTION:
			case AT_:
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
				setState(945);
				exprs();
				}
				break;
			case ASTERISK:
				{
				setState(946);
				match(ASTERISK);
				}
				break;
			case ORDER:
				break;
			default:
				break;
			}
			{
			setState(949);
			orderByClause();
			setState(950);
			match(SEPARATOR);
			setState(951);
			expr(0);
			}
			setState(953);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public ExprsWithParenContext exprsWithParen() {
			return getRuleContext(ExprsWithParenContext.class,0);
		}
		public OverClauseContext overClause() {
			return getRuleContext(OverClauseContext.class,0);
		}
		public WindowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunction; }
	}

	public final WindowFunctionContext windowFunction() throws RecognitionException {
		WindowFunctionContext _localctx = new WindowFunctionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_windowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(ID);
			setState(956);
			exprsWithParen();
			setState(957);
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
		public TerminalNode OVER() { return getToken(MySQLStatementParser.OVER, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public OverClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overClause; }
	}

	public final OverClauseContext overClause() throws RecognitionException {
		OverClauseContext _localctx = new OverClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_overClause);
		try {
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				match(OVER);
				setState(960);
				match(LP_);
				setState(961);
				windowSpec();
				setState(962);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				match(OVER);
				setState(965);
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

	public static class WindowSpecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public WindowPartitionClauseContext windowPartitionClause() {
			return getRuleContext(WindowPartitionClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public FrameClauseContext frameClause() {
			return getRuleContext(FrameClauseContext.class,0);
		}
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_windowSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(968);
				match(ID);
				}
			}

			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(971);
				windowPartitionClause();
				}
			}

			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(974);
				orderByClause();
				}
			}

			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(977);
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

	public static class WindowPartitionClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public WindowPartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowPartitionClause; }
	}

	public final WindowPartitionClauseContext windowPartitionClause() throws RecognitionException {
		WindowPartitionClauseContext _localctx = new WindowPartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_windowPartitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			match(PARTITION);
			setState(981);
			match(BY);
			setState(982);
			exprs();
			}
		}
		catch (RecognitionException re) {
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
		public FrameUnitsContext frameUnits() {
			return getRuleContext(FrameUnitsContext.class,0);
		}
		public FrameExtentContext frameExtent() {
			return getRuleContext(FrameExtentContext.class,0);
		}
		public FrameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameClause; }
	}

	public final FrameClauseContext frameClause() throws RecognitionException {
		FrameClauseContext _localctx = new FrameClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_frameClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			frameUnits();
			setState(985);
			frameExtent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameUnitsContext extends ParserRuleContext {
		public TerminalNode ROWS() { return getToken(MySQLStatementParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(MySQLStatementParser.RANGE, 0); }
		public FrameUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameUnits; }
	}

	public final FrameUnitsContext frameUnits() throws RecognitionException {
		FrameUnitsContext _localctx = new FrameUnitsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_frameUnits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			_la = _input.LA(1);
			if ( !(_la==RANGE || _la==ROWS) ) {
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

	public static class FrameExtentContext extends ParserRuleContext {
		public FrameStartContext frameStart() {
			return getRuleContext(FrameStartContext.class,0);
		}
		public FrameBetweenContext frameBetween() {
			return getRuleContext(FrameBetweenContext.class,0);
		}
		public FrameExtentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameExtent; }
	}

	public final FrameExtentContext frameExtent() throws RecognitionException {
		FrameExtentContext _localctx = new FrameExtentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_frameExtent);
		try {
			setState(991);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case CASE:
			case GLOBAL:
			case GROUP_CONCAT:
			case INTERVAL:
			case PERSIST:
			case PERSIST_ONLY:
			case SESSION:
			case UNBOUNDED:
			case NOT_:
			case UNARY_BIT_COMPLEMENT:
			case PLUS:
			case MINUS:
			case DOT:
			case LP_:
			case LBE_:
			case QUESTION:
			case AT_:
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
			case CURRENT:
			case ID:
			case STRING:
			case NUMBER:
			case HEX_DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				frameStart();
				}
				break;
			case BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				frameBetween();
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

	public static class FrameStartContext extends ParserRuleContext {
		public TerminalNode CURRENT() { return getToken(MySQLStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(MySQLStatementParser.ROW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(MySQLStatementParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(MySQLStatementParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(MySQLStatementParser.FOLLOWING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FrameStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameStart; }
	}

	public final FrameStartContext frameStart() throws RecognitionException {
		FrameStartContext _localctx = new FrameStartContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_frameStart);
		try {
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				match(CURRENT);
				setState(994);
				match(ROW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				match(UNBOUNDED);
				setState(996);
				match(PRECEDING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(997);
				match(UNBOUNDED);
				setState(998);
				match(FOLLOWING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(999);
				expr(0);
				setState(1000);
				match(PRECEDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1002);
				expr(0);
				setState(1003);
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

	public static class FrameBetweenContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(MySQLStatementParser.BETWEEN, 0); }
		public FrameStartContext frameStart() {
			return getRuleContext(FrameStartContext.class,0);
		}
		public TerminalNode AND() { return getToken(MySQLStatementParser.AND, 0); }
		public FrameEndContext frameEnd() {
			return getRuleContext(FrameEndContext.class,0);
		}
		public FrameBetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBetween; }
	}

	public final FrameBetweenContext frameBetween() throws RecognitionException {
		FrameBetweenContext _localctx = new FrameBetweenContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_frameBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			match(BETWEEN);
			setState(1008);
			frameStart();
			setState(1009);
			match(AND);
			setState(1010);
			frameEnd();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 106, RULE_frameEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public List<TerminalNode> AT_() { return getTokens(MySQLStatementParser.AT_); }
		public TerminalNode AT_(int i) {
			return getToken(MySQLStatementParser.AT_, i);
		}
		public TerminalNode DOT() { return getToken(MySQLStatementParser.DOT, 0); }
		public TerminalNode GLOBAL() { return getToken(MySQLStatementParser.GLOBAL, 0); }
		public TerminalNode PERSIST() { return getToken(MySQLStatementParser.PERSIST, 0); }
		public TerminalNode PERSIST_ONLY() { return getToken(MySQLStatementParser.PERSIST_ONLY, 0); }
		public TerminalNode SESSION() { return getToken(MySQLStatementParser.SESSION, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_) {
				{
				setState(1014);
				match(AT_);
				setState(1015);
				match(AT_);
				}
			}

			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (GLOBAL - 70)) | (1L << (PERSIST - 70)) | (1L << (PERSIST_ONLY - 70)))) != 0) || _la==SESSION) {
				{
				setState(1018);
				_la = _input.LA(1);
				if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (GLOBAL - 70)) | (1L << (PERSIST - 70)) | (1L << (PERSIST_ONLY - 70)))) != 0) || _la==SESSION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1021);
				match(DOT);
				}
			}

			setState(1024);
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

	public static class SchemaNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public DomainNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainName; }
	}

	public final DomainNameContext domainName() throws RecognitionException {
		DomainNameContext _localctx = new DomainNameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_domainName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public SequenceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceName; }
	}

	public final SequenceNameContext sequenceName() throws RecognitionException {
		SequenceNameContext _localctx = new SequenceNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_sequenceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public TablespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceName; }
	}

	public final TablespaceNameContext tablespaceName() throws RecognitionException {
		TablespaceNameContext _localctx = new TablespaceNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_tablespaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
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
		public TerminalNode STRING() { return getToken(MySQLStatementParser.STRING, 0); }
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_collationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public CteNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteName; }
	}

	public final CteNameContext cteName() throws RecognitionException {
		CteNameContext _localctx = new CteNameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_cteName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public ParserNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserName; }
	}

	public final ParserNameContext parserName() throws RecognitionException {
		ParserNameContext _localctx = new ParserNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_parserName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public ExtensionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionName; }
	}

	public final ExtensionNameContext extensionName() throws RecognitionException {
		ExtensionNameContext _localctx = new ExtensionNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_extensionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public RowNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowName; }
	}

	public final RowNameContext rowName() throws RecognitionException {
		RowNameContext _localctx = new RowNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_rowName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public OpclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opclass; }
	}

	public final OpclassContext opclass() throws RecognitionException {
		OpclassContext _localctx = new OpclassContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_opclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public FileGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileGroup; }
	}

	public final FileGroupContext fileGroup() throws RecognitionException {
		FileGroupContext _localctx = new FileGroupContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_fileGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public GroupNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupName; }
	}

	public final GroupNameContext groupName() throws RecognitionException {
		GroupNameContext _localctx = new GroupNameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_groupName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public ConstraintNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintName; }
	}

	public final ConstraintNameContext constraintName() throws RecognitionException {
		ConstraintNameContext _localctx = new ConstraintNameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_constraintName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public KeyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyName; }
	}

	public final KeyNameContext keyName() throws RecognitionException {
		KeyNameContext _localctx = new KeyNameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_keyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public XmlSchemaCollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlSchemaCollection; }
	}

	public final XmlSchemaCollectionContext xmlSchemaCollection() throws RecognitionException {
		XmlSchemaCollectionContext _localctx = new XmlSchemaCollectionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_xmlSchemaCollection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public ColumnSetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSetName; }
	}

	public final ColumnSetNameContext columnSetName() throws RecognitionException {
		ColumnSetNameContext _localctx = new ColumnSetNameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_columnSetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public DirectoryNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directoryName; }
	}

	public final DirectoryNameContext directoryName() throws RecognitionException {
		DirectoryNameContext _localctx = new DirectoryNameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_directoryName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public TriggerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerName; }
	}

	public final TriggerNameContext triggerName() throws RecognitionException {
		TriggerNameContext _localctx = new TriggerNameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_triggerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public RoutineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineName; }
	}

	public final RoutineNameContext routineName() throws RecognitionException {
		RoutineNameContext _localctx = new RoutineNameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_routineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
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
		public TerminalNode STRING() { return getToken(MySQLStatementParser.STRING, 0); }
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public RoleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleName; }
	}

	public final RoleNameContext roleName() throws RecognitionException {
		RoleNameContext _localctx = new RoleNameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_roleName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public PartitionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionName; }
	}

	public final PartitionNameContext partitionName() throws RecognitionException {
		PartitionNameContext _localctx = new PartitionNameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_partitionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public RewriteRuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewriteRuleName; }
	}

	public final RewriteRuleNameContext rewriteRuleName() throws RecognitionException {
		RewriteRuleNameContext _localctx = new RewriteRuleNameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_rewriteRuleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public OwnerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownerName; }
	}

	public final OwnerNameContext ownerName() throws RecognitionException {
		OwnerNameContext _localctx = new OwnerNameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_ownerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
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
		public TerminalNode STRING() { return getToken(MySQLStatementParser.STRING, 0); }
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public UserNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userName; }
	}

	public final UserNameContext userName() throws RecognitionException {
		UserNameContext _localctx = new UserNameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_userName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
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
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public ServerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverName; }
	}

	public final ServerNameContext serverName() throws RecognitionException {
		ServerNameContext _localctx = new ServerNameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_serverName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
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
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(MySQLStatementParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MySQLStatementParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(MySQLStatementParser.COMMA, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			match(LP_);
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(1085);
				match(NUMBER);
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1086);
					match(COMMA);
					setState(1087);
					match(NUMBER);
					}
				}

				}
			}

			setState(1092);
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
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(MySQLStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(1094);
				match(PRIMARY);
				}
			}

			setState(1097);
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
		enterRule(_localctx, 172, RULE_matchNone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
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
		public List<TerminalNode> ID() { return getTokens(MySQLStatementParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MySQLStatementParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_ids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			match(ID);
			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1102);
				match(COMMA);
				setState(1103);
				match(ID);
				}
				}
				setState(1108);
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
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_idList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			match(LP_);
			setState(1110);
			ids();
			setState(1111);
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
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public TerminalNode OFFSET() { return getToken(MySQLStatementParser.OFFSET, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_rangeClause);
		int _la;
		try {
			setState(1125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				rangeItem();
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1114);
					match(COMMA);
					setState(1115);
					rangeItem();
					}
					}
					setState(1120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1121);
				rangeItem();
				setState(1122);
				match(OFFSET);
				setState(1123);
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
		enterRule(_localctx, 180, RULE_rangeItem);
		try {
			setState(1129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1127);
				number();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1128);
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
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public SchemaNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaNames; }
	}

	public final SchemaNamesContext schemaNames() throws RecognitionException {
		SchemaNamesContext _localctx = new SchemaNamesContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_schemaNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			schemaName();
			setState(1136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1132);
				match(COMMA);
				setState(1133);
				schemaName();
				}
				}
				setState(1138);
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
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public DatabaseNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseNames; }
	}

	public final DatabaseNamesContext databaseNames() throws RecognitionException {
		DatabaseNamesContext _localctx = new DatabaseNamesContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_databaseNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			databaseName();
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1140);
				match(COMMA);
				setState(1141);
				databaseName();
				}
				}
				setState(1146);
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
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public DomainNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainNames; }
	}

	public final DomainNamesContext domainNames() throws RecognitionException {
		DomainNamesContext _localctx = new DomainNamesContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_domainNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			domainName();
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1148);
				match(COMMA);
				setState(1149);
				domainName();
				}
				}
				setState(1154);
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
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableList; }
	}

	public final TableListContext tableList() throws RecognitionException {
		TableListContext _localctx = new TableListContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_tableList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(LP_);
			setState(1156);
			tableNames();
			setState(1157);
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
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			tableName();
			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1160);
				match(COMMA);
				setState(1161);
				tableName();
				}
				}
				setState(1166);
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
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public ColumnNamesWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNamesWithParen; }
	}

	public final ColumnNamesWithParenContext columnNamesWithParen() throws RecognitionException {
		ColumnNamesWithParenContext _localctx = new ColumnNamesWithParenContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_columnNamesWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			match(LP_);
			setState(1168);
			columnNames();
			setState(1169);
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
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			columnName();
			setState(1176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1172);
				match(COMMA);
				setState(1173);
				columnName();
				}
				}
				setState(1178);
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
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_columnList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			match(LP_);
			setState(1180);
			columnNames();
			setState(1181);
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
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public SequenceNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceNames; }
	}

	public final SequenceNamesContext sequenceNames() throws RecognitionException {
		SequenceNamesContext _localctx = new SequenceNamesContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_sequenceNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			sequenceName();
			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1184);
				match(COMMA);
				setState(1185);
				sequenceName();
				}
				}
				setState(1190);
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
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public TablespaceNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceNames; }
	}

	public final TablespaceNamesContext tablespaceNames() throws RecognitionException {
		TablespaceNamesContext _localctx = new TablespaceNamesContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_tablespaceNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			tablespaceName();
			setState(1196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1192);
				match(COMMA);
				setState(1193);
				tablespaceName();
				}
				}
				setState(1198);
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
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public IndexNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexNames; }
	}

	public final IndexNamesContext indexNames() throws RecognitionException {
		IndexNamesContext _localctx = new IndexNamesContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_indexNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			indexName();
			setState(1204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1200);
				match(COMMA);
				setState(1201);
				indexName();
				}
				}
				setState(1206);
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
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public IndexNamesContext indexNames() {
			return getRuleContext(IndexNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public IndexListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexList; }
	}

	public final IndexListContext indexList() throws RecognitionException {
		IndexListContext _localctx = new IndexListContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_indexList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(LP_);
			setState(1208);
			indexNames();
			setState(1209);
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
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public TypeNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNames; }
	}

	public final TypeNamesContext typeNames() throws RecognitionException {
		TypeNamesContext _localctx = new TypeNamesContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_typeNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			typeName();
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1212);
				match(COMMA);
				setState(1213);
				typeName();
				}
				}
				setState(1218);
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
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public RowNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowNames; }
	}

	public final RowNamesContext rowNames() throws RecognitionException {
		RowNamesContext _localctx = new RowNamesContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_rowNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			rowName();
			setState(1224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1220);
				match(COMMA);
				setState(1221);
				rowName();
				}
				}
				setState(1226);
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
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public RoleNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleNames; }
	}

	public final RoleNamesContext roleNames() throws RecognitionException {
		RoleNamesContext _localctx = new RoleNamesContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_roleNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			roleName();
			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1228);
				match(COMMA);
				setState(1229);
				roleName();
				}
				}
				setState(1234);
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
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public UserNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userNames; }
	}

	public final UserNamesContext userNames() throws RecognitionException {
		UserNamesContext _localctx = new UserNamesContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_userNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			userName();
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1236);
				match(COMMA);
				setState(1237);
				userName();
				}
				}
				setState(1242);
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
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public ServerNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverNames; }
	}

	public final ServerNamesContext serverNames() throws RecognitionException {
		ServerNamesContext _localctx = new ServerNamesContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_serverNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			serverName();
			setState(1248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1244);
				match(COMMA);
				setState(1245);
				serverName();
				}
				}
				setState(1250);
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
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public BitExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExprs; }
	}

	public final BitExprsContext bitExprs() throws RecognitionException {
		BitExprsContext _localctx = new BitExprsContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_bitExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			bitExpr(0);
			setState(1256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1252);
				match(COMMA);
				setState(1253);
				bitExpr(0);
				}
				}
				setState(1258);
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
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			expr(0);
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1260);
				match(COMMA);
				setState(1261);
				expr(0);
				}
				}
				setState(1266);
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
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public ExprsWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprsWithParen; }
	}

	public final ExprsWithParenContext exprsWithParen() throws RecognitionException {
		ExprsWithParenContext _localctx = new ExprsWithParenContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_exprsWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			match(LP_);
			setState(1268);
			exprs();
			setState(1269);
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
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(MySQLStatementParser.NOT_, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public ExprRecursiveContext exprRecursive() {
			return getRuleContext(ExprRecursiveContext.class,0);
		}
		public TerminalNode AND() { return getToken(MySQLStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(MySQLStatementParser.AND_, 0); }
		public TerminalNode XOR() { return getToken(MySQLStatementParser.XOR, 0); }
		public TerminalNode OR() { return getToken(MySQLStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(MySQLStatementParser.OR_, 0); }
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
		int _startState = 222;
		enterRecursionRule(_localctx, 222, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(1272);
				match(LP_);
				setState(1273);
				expr(0);
				setState(1274);
				match(RP_);
				}
				break;
			case 2:
				{
				setState(1276);
				match(NOT);
				setState(1277);
				expr(6);
				}
				break;
			case 3:
				{
				setState(1278);
				match(NOT_);
				setState(1279);
				expr(5);
				}
				break;
			case 4:
				{
				setState(1280);
				booleanPrimary(0);
				}
				break;
			case 5:
				{
				setState(1281);
				exprRecursive();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1284);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1285);
						match(AND);
						setState(1286);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1287);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1288);
						match(AND_);
						setState(1289);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1290);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1291);
						match(XOR);
						setState(1292);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1293);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1294);
						match(OR);
						setState(1295);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1296);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1297);
						match(OR_);
						setState(1298);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(1303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
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
		enterRule(_localctx, 224, RULE_exprRecursive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
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
		public TerminalNode IS() { return getToken(MySQLStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(MySQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MySQLStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(MySQLStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ() { return getToken(MySQLStatementParser.SAFE_EQ, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(MySQLStatementParser.ANY, 0); }
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
		int _startState = 226;
		enterRecursionRule(_localctx, 226, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1307);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(1329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1309);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1310);
						match(IS);
						setState(1312);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1311);
							match(NOT);
							}
						}

						setState(1314);
						_la = _input.LA(1);
						if ( !(((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (FALSE - 269)) | (1L << (NULL - 269)) | (1L << (TRUE - 269)) | (1L << (UNKNOWN - 269)))) != 0)) ) {
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
						setState(1315);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1316);
						match(SAFE_EQ);
						setState(1317);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1318);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1319);
						comparisonOperator();
						setState(1320);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1322);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1323);
						comparisonOperator();
						setState(1324);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1325);
						subquery();
						}
						break;
					}
					} 
				}
				setState(1331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
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
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode GTE() { return getToken(MySQLStatementParser.GTE, 0); }
		public TerminalNode GT() { return getToken(MySQLStatementParser.GT, 0); }
		public TerminalNode LTE() { return getToken(MySQLStatementParser.LTE, 0); }
		public TerminalNode LT() { return getToken(MySQLStatementParser.LT, 0); }
		public TerminalNode NEQ_() { return getToken(MySQLStatementParser.NEQ_, 0); }
		public TerminalNode NEQ() { return getToken(MySQLStatementParser.NEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			_la = _input.LA(1);
			if ( !(((((_la - 234)) & ~0x3f) == 0 && ((1L << (_la - 234)) & ((1L << (EQ_ - 234)) | (1L << (NEQ - 234)) | (1L << (NEQ_ - 234)) | (1L << (GT - 234)) | (1L << (GTE - 234)) | (1L << (LT - 234)) | (1L << (LTE - 234)))) != 0)) ) {
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
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public TerminalNode BETWEEN() { return getToken(MySQLStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(MySQLStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SOUNDS() { return getToken(MySQLStatementParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(MySQLStatementParser.LIKE, 0); }
		public List<TerminalNode> ESCAPE() { return getTokens(MySQLStatementParser.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(MySQLStatementParser.ESCAPE, i);
		}
		public TerminalNode REGEXP() { return getToken(MySQLStatementParser.REGEXP, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_predicate);
		int _la;
		try {
			int _alt;
			setState(1392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1334);
				bitExpr(0);
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1335);
					match(NOT);
					}
				}

				setState(1338);
				match(IN);
				setState(1339);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1341);
				bitExpr(0);
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1342);
					match(NOT);
					}
				}

				setState(1345);
				match(IN);
				setState(1346);
				match(LP_);
				setState(1347);
				simpleExpr(0);
				setState(1352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1348);
					match(COMMA);
					setState(1349);
					simpleExpr(0);
					}
					}
					setState(1354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1355);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1357);
				bitExpr(0);
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1358);
					match(NOT);
					}
				}

				setState(1361);
				match(BETWEEN);
				setState(1362);
				simpleExpr(0);
				setState(1363);
				match(AND);
				setState(1364);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1366);
				bitExpr(0);
				setState(1367);
				match(SOUNDS);
				setState(1368);
				match(LIKE);
				setState(1369);
				simpleExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1371);
				bitExpr(0);
				setState(1373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1372);
					match(NOT);
					}
				}

				setState(1375);
				match(LIKE);
				setState(1376);
				simpleExpr(0);
				setState(1381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1377);
						match(ESCAPE);
						setState(1378);
						simpleExpr(0);
						}
						} 
					}
					setState(1383);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1384);
				bitExpr(0);
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1385);
					match(NOT);
					}
				}

				setState(1388);
				match(REGEXP);
				setState(1389);
				simpleExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1391);
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
		public TerminalNode BIT_INCLUSIVE_OR() { return getToken(MySQLStatementParser.BIT_INCLUSIVE_OR, 0); }
		public TerminalNode BIT_AND() { return getToken(MySQLStatementParser.BIT_AND, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT() { return getToken(MySQLStatementParser.SIGNED_LEFT_SHIFT, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT() { return getToken(MySQLStatementParser.SIGNED_RIGHT_SHIFT, 0); }
		public TerminalNode PLUS() { return getToken(MySQLStatementParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MySQLStatementParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(MySQLStatementParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(MySQLStatementParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(MySQLStatementParser.MOD, 0); }
		public TerminalNode MOD_() { return getToken(MySQLStatementParser.MOD_, 0); }
		public TerminalNode BIT_EXCLUSIVE_OR() { return getToken(MySQLStatementParser.BIT_EXCLUSIVE_OR, 0); }
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
		int _startState = 232;
		enterRecursionRule(_localctx, 232, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1395);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1436);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1397);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1398);
						match(BIT_INCLUSIVE_OR);
						setState(1399);
						bitExpr(15);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1400);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1401);
						match(BIT_AND);
						setState(1402);
						bitExpr(14);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1403);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1404);
						match(SIGNED_LEFT_SHIFT);
						setState(1405);
						bitExpr(13);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1406);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1407);
						match(SIGNED_RIGHT_SHIFT);
						setState(1408);
						bitExpr(12);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1409);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1410);
						match(PLUS);
						setState(1411);
						bitExpr(11);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1412);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1413);
						match(MINUS);
						setState(1414);
						bitExpr(10);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1415);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1416);
						match(ASTERISK);
						setState(1417);
						bitExpr(9);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1418);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1419);
						match(SLASH);
						setState(1420);
						bitExpr(8);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1421);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1422);
						match(MOD);
						setState(1423);
						bitExpr(7);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1424);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1425);
						match(MOD_);
						setState(1426);
						bitExpr(6);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1427);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1428);
						match(BIT_EXCLUSIVE_OR);
						setState(1429);
						bitExpr(5);
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1430);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1431);
						match(PLUS);
						setState(1432);
						intervalExpr();
						}
						break;
					case 13:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1433);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1434);
						match(MINUS);
						setState(1435);
						intervalExpr();
						}
						break;
					}
					} 
				}
				setState(1440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
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
		public TerminalNode PLUS() { return getToken(MySQLStatementParser.PLUS, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(MySQLStatementParser.MINUS, 0); }
		public TerminalNode UNARY_BIT_COMPLEMENT() { return getToken(MySQLStatementParser.UNARY_BIT_COMPLEMENT, 0); }
		public TerminalNode NOT_() { return getToken(MySQLStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(MySQLStatementParser.BINARY, 0); }
		public ExprsWithParenContext exprsWithParen() {
			return getRuleContext(ExprsWithParenContext.class,0);
		}
		public TerminalNode ROW() { return getToken(MySQLStatementParser.ROW, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public CaseExpressContext caseExpress() {
			return getRuleContext(CaseExpressContext.class,0);
		}
		public IntervalExprContext intervalExpr() {
			return getRuleContext(IntervalExprContext.class,0);
		}
		public PrivateExprOfDbContext privateExprOfDb() {
			return getRuleContext(PrivateExprOfDbContext.class,0);
		}
		public TerminalNode AND_() { return getToken(MySQLStatementParser.AND_, 0); }
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
		int _startState = 234;
		enterRecursionRule(_localctx, 234, RULE_simpleExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1442);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1443);
				liter();
				}
				break;
			case 3:
				{
				setState(1444);
				columnName();
				}
				break;
			case 4:
				{
				setState(1445);
				variable();
				}
				break;
			case 5:
				{
				setState(1446);
				match(PLUS);
				setState(1447);
				simpleExpr(12);
				}
				break;
			case 6:
				{
				setState(1448);
				match(MINUS);
				setState(1449);
				simpleExpr(11);
				}
				break;
			case 7:
				{
				setState(1450);
				match(UNARY_BIT_COMPLEMENT);
				setState(1451);
				simpleExpr(10);
				}
				break;
			case 8:
				{
				setState(1452);
				match(NOT_);
				setState(1453);
				simpleExpr(9);
				}
				break;
			case 9:
				{
				setState(1454);
				match(BINARY);
				setState(1455);
				simpleExpr(8);
				}
				break;
			case 10:
				{
				setState(1456);
				exprsWithParen();
				}
				break;
			case 11:
				{
				setState(1457);
				match(ROW);
				setState(1458);
				exprsWithParen();
				}
				break;
			case 12:
				{
				setState(1459);
				subquery();
				}
				break;
			case 13:
				{
				setState(1460);
				match(EXISTS);
				setState(1461);
				subquery();
				}
				break;
			case 14:
				{
				setState(1462);
				caseExpress();
				}
				break;
			case 15:
				{
				setState(1463);
				intervalExpr();
				}
				break;
			case 16:
				{
				setState(1464);
				privateExprOfDb();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1472);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1467);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1468);
						match(AND_);
						setState(1469);
						simpleExpr(14);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1470);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1471);
						collateClause();
						}
						break;
					}
					} 
				}
				setState(1476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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

	public static class DistinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(MySQLStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
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

	public static class PrivateExprOfDbContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public PrivateExprOfDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateExprOfDb; }
	}

	public final PrivateExprOfDbContext privateExprOfDb() throws RecognitionException {
		PrivateExprOfDbContext _localctx = new PrivateExprOfDbContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_privateExprOfDb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
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
		public TerminalNode TRUE() { return getToken(MySQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MySQLStatementParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public TerminalNode LBE_() { return getToken(MySQLStatementParser.LBE_, 0); }
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public TerminalNode STRING() { return getToken(MySQLStatementParser.STRING, 0); }
		public TerminalNode RBE_() { return getToken(MySQLStatementParser.RBE_, 0); }
		public TerminalNode HEX_DIGIT() { return getToken(MySQLStatementParser.HEX_DIGIT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode DATE() { return getToken(MySQLStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(MySQLStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(MySQLStatementParser.TIMESTAMP, 0); }
		public TerminalNode BIT_NUM() { return getToken(MySQLStatementParser.BIT_NUM, 0); }
		public LiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liter; }
	}

	public final LiterContext liter() throws RecognitionException {
		LiterContext _localctx = new LiterContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_liter);
		int _la;
		try {
			setState(1506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1481);
				question();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1482);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1483);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1484);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1485);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1486);
				match(LBE_);
				setState(1487);
				match(ID);
				setState(1488);
				match(STRING);
				setState(1489);
				match(RBE_);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1490);
				match(HEX_DIGIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1491);
				string();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1492);
				match(ID);
				setState(1493);
				match(STRING);
				setState(1495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1494);
					collateClause();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1497);
				_la = _input.LA(1);
				if ( !(((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (DATE - 264)) | (1L << (TIME - 264)) | (1L << (TIMESTAMP - 264)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1498);
				match(STRING);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(1499);
					match(ID);
					}
				}

				setState(1502);
				match(BIT_NUM);
				setState(1504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1503);
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
		public TerminalNode QUESTION() { return getToken(MySQLStatementParser.QUESTION, 0); }
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
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
		public TerminalNode NUMBER() { return getToken(MySQLStatementParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
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
		public TerminalNode STRING() { return getToken(MySQLStatementParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(MySQLStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			match(ORDER);
			setState(1515);
			match(BY);
			setState(1516);
			orderByItem();
			setState(1521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1517);
				match(COMMA);
				setState(1518);
				orderByItem();
				}
				}
				setState(1523);
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
		public TerminalNode ASC() { return getToken(MySQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MySQLStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1524);
				columnName();
				}
				break;
			case 2:
				{
				setState(1525);
				number();
				}
				break;
			case 3:
				{
				setState(1526);
				expr(0);
				}
				break;
			}
			setState(1530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1529);
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

	public static class UnionSelectContext extends ParserRuleContext {
		public List<SelectExpressionContext> selectExpression() {
			return getRuleContexts(SelectExpressionContext.class);
		}
		public SelectExpressionContext selectExpression(int i) {
			return getRuleContext(SelectExpressionContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(MySQLStatementParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(MySQLStatementParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(MySQLStatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(MySQLStatementParser.ALL, i);
		}
		public UnionSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionSelect; }
	}

	public final UnionSelectContext unionSelect() throws RecognitionException {
		UnionSelectContext _localctx = new UnionSelectContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_unionSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			selectExpression();
			setState(1540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(1533);
				match(UNION);
				setState(1535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(1534);
					match(ALL);
					}
				}

				setState(1537);
				selectExpression();
				}
				}
				setState(1542);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			match(FROM);
			setState(1544);
			tableReferences();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode WHERE() { return getToken(MySQLStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			match(WHERE);
			setState(1547);
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(MySQLStatementParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public TerminalNode ROLLUP() { return getToken(MySQLStatementParser.ROLLUP, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			match(GROUP);
			setState(1550);
			match(BY);
			setState(1551);
			orderByItem();
			setState(1556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1552);
				match(COMMA);
				setState(1553);
				orderByItem();
				}
				}
				setState(1558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1559);
				match(WITH);
				setState(1560);
				match(ROLLUP);
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

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(MySQLStatementParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			match(HAVING);
			setState(1564);
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

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(MySQLStatementParser.LIMIT, 0); }
		public RangeClauseContext rangeClause() {
			return getRuleContext(RangeClauseContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1566);
			match(LIMIT);
			setState(1567);
			rangeClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public PartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionClause; }
	}

	public final PartitionClauseContext partitionClause() throws RecognitionException {
		PartitionClauseContext _localctx = new PartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_partitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			match(PARTITION);
			setState(1570);
			idList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExprsContext extends ParserRuleContext {
		public AsteriskContext asterisk() {
			return getRuleContext(AsteriskContext.class,0);
		}
		public List<SelectExprContext> selectExpr() {
			return getRuleContexts(SelectExprContext.class);
		}
		public SelectExprContext selectExpr(int i) {
			return getRuleContext(SelectExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public SelectExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExprs; }
	}

	public final SelectExprsContext selectExprs() throws RecognitionException {
		SelectExprsContext _localctx = new SelectExprsContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_selectExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK:
				{
				setState(1572);
				asterisk();
				}
				break;
			case T__0:
			case CASE:
			case GLOBAL:
			case GROUP_CONCAT:
			case INTERVAL:
			case PERSIST:
			case PERSIST_ONLY:
			case SESSION:
			case NOT_:
			case UNARY_BIT_COMPLEMENT:
			case PLUS:
			case MINUS:
			case DOT:
			case LP_:
			case LBE_:
			case QUESTION:
			case AT_:
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
				setState(1573);
				selectExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1576);
				match(COMMA);
				setState(1577);
				selectExpr();
				}
				}
				setState(1582);
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

	public static class AsteriskContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(MySQLStatementParser.ASTERISK, 0); }
		public AsteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asterisk; }
	}

	public final AsteriskContext asterisk() throws RecognitionException {
		AsteriskContext _localctx = new AsteriskContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_asterisk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			match(ASTERISK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteClauseContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(MySQLStatementParser.DELETE, 0); }
		public DeleteSpecContext deleteSpec() {
			return getRuleContext(DeleteSpecContext.class,0);
		}
		public FromMultiContext fromMulti() {
			return getRuleContext(FromMultiContext.class,0);
		}
		public FromSingleContext fromSingle() {
			return getRuleContext(FromSingleContext.class,0);
		}
		public DeleteClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteClause; }
	}

	public final DeleteClauseContext deleteClause() throws RecognitionException {
		DeleteClauseContext _localctx = new DeleteClauseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_deleteClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			match(DELETE);
			setState(1586);
			deleteSpec();
			setState(1589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1587);
				fromMulti();
				}
				break;
			case 2:
				{
				setState(1588);
				fromSingle();
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

	public static class FromSingleContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public FromSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromSingle; }
	}

	public final FromSingleContext fromSingle() throws RecognitionException {
		FromSingleContext _localctx = new FromSingleContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_fromSingle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			match(FROM);
			setState(1592);
			match(ID);
			setState(1594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1593);
				partitionClause();
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

	public static class FromMultiContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MySQLStatementParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MySQLStatementParser.ID, i);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public FromMultiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromMulti; }
	}

	public final FromMultiContext fromMulti() throws RecognitionException {
		FromMultiContext _localctx = new FromMultiContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_fromMulti);
		int _la;
		try {
			setState(1629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1596);
				match(ID);
				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_ASTERISK) {
					{
					setState(1597);
					match(DOT_ASTERISK);
					}
				}

				setState(1607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1600);
					match(COMMA);
					setState(1601);
					match(ID);
					setState(1603);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOT_ASTERISK) {
						{
						setState(1602);
						match(DOT_ASTERISK);
						}
					}

					}
					}
					setState(1609);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1610);
				match(FROM);
				setState(1611);
				tableReferences();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1612);
				match(FROM);
				{
				setState(1613);
				match(ID);
				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_ASTERISK) {
					{
					setState(1614);
					match(DOT_ASTERISK);
					}
				}

				setState(1624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1617);
					match(COMMA);
					setState(1618);
					match(ID);
					setState(1620);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOT_ASTERISK) {
						{
						setState(1619);
						match(DOT_ASTERISK);
						}
					}

					}
					}
					setState(1626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1627);
				match(USING);
				setState(1628);
				tableReferences();
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

	public static class DeleteSpecContext extends ParserRuleContext {
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLStatementParser.LOW_PRIORITY, 0); }
		public TerminalNode QUICK() { return getToken(MySQLStatementParser.QUICK, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public DeleteSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteSpec; }
	}

	public final DeleteSpecContext deleteSpec() throws RecognitionException {
		DeleteSpecContext _localctx = new DeleteSpecContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_deleteSpec);
		int _la;
		try {
			setState(1640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOW_PRIORITY) {
					{
					setState(1631);
					match(LOW_PRIORITY);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUICK) {
					{
					setState(1634);
					match(QUICK);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(1637);
					match(IGNORE);
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

	public static class InsertContext extends ParserRuleContext {
		public InsertClauseContext insertClause() {
			return getRuleContext(InsertClauseContext.class,0);
		}
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public ColumnClauseContext columnClause() {
			return getRuleContext(ColumnClauseContext.class,0);
		}
		public TerminalNode INTO() { return getToken(MySQLStatementParser.INTO, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public OnDuplicateClauseContext onDuplicateClause() {
			return getRuleContext(OnDuplicateClauseContext.class,0);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			insertClause();
			setState(1644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1643);
				match(INTO);
				}
			}

			setState(1646);
			match(ID);
			setState(1648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1647);
				partitionClause();
				}
			}

			setState(1652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(1650);
				setClause();
				}
				break;
			case SELECT:
			case VALUE:
			case VALUES:
			case LP_:
			case WITH:
				{
				setState(1651);
				columnClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1654);
				onDuplicateClause();
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

	public static class InsertClauseContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(MySQLStatementParser.INSERT, 0); }
		public InsertSpecContext insertSpec() {
			return getRuleContext(InsertSpecContext.class,0);
		}
		public InsertClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertClause; }
	}

	public final InsertClauseContext insertClause() throws RecognitionException {
		InsertClauseContext _localctx = new InsertClauseContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_insertClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			match(INSERT);
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (DELAYED - 41)) | (1L << (HIGH_PRIORITY - 41)) | (1L << (LOW_PRIORITY - 41)))) != 0)) {
				{
				setState(1658);
				insertSpec();
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

	public static class InsertSpecContext extends ParserRuleContext {
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLStatementParser.LOW_PRIORITY, 0); }
		public TerminalNode DELAYED() { return getToken(MySQLStatementParser.DELAYED, 0); }
		public TerminalNode HIGH_PRIORITY() { return getToken(MySQLStatementParser.HIGH_PRIORITY, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public InsertSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSpec; }
	}

	public final InsertSpecContext insertSpec() throws RecognitionException {
		InsertSpecContext _localctx = new InsertSpecContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_insertSpec);
		try {
			setState(1665);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOW_PRIORITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1661);
				match(LOW_PRIORITY);
				}
				break;
			case DELAYED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1662);
				match(DELAYED);
				}
				break;
			case HIGH_PRIORITY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1663);
				match(HIGH_PRIORITY);
				setState(1664);
				match(IGNORE);
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

	public static class ColumnClauseContext extends ParserRuleContext {
		public ValueClauseContext valueClause() {
			return getRuleContext(ValueClauseContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public IdListWithEmptyContext idListWithEmpty() {
			return getRuleContext(IdListWithEmptyContext.class,0);
		}
		public ColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnClause; }
	}

	public final ColumnClauseContext columnClause() throws RecognitionException {
		ColumnClauseContext _localctx = new ColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_columnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1667);
				idListWithEmpty();
				}
			}

			setState(1672);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
			case VALUES:
				{
				setState(1670);
				valueClause();
				}
				break;
			case SELECT:
			case WITH:
				{
				setState(1671);
				select();
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

	public static class ValueClauseContext extends ParserRuleContext {
		public List<ValueListWithParenContext> valueListWithParen() {
			return getRuleContexts(ValueListWithParenContext.class);
		}
		public ValueListWithParenContext valueListWithParen(int i) {
			return getRuleContext(ValueListWithParenContext.class,i);
		}
		public TerminalNode VALUES() { return getToken(MySQLStatementParser.VALUES, 0); }
		public TerminalNode VALUE() { return getToken(MySQLStatementParser.VALUE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public ValueClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueClause; }
	}

	public final ValueClauseContext valueClause() throws RecognitionException {
		ValueClauseContext _localctx = new ValueClauseContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_valueClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			_la = _input.LA(1);
			if ( !(_la==VALUE || _la==VALUES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1675);
			valueListWithParen();
			setState(1680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1676);
				match(COMMA);
				setState(1677);
				valueListWithParen();
				}
				}
				setState(1682);
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

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			match(SET);
			setState(1684);
			assignmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnDuplicateClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public TerminalNode DUPLICATE() { return getToken(MySQLStatementParser.DUPLICATE, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode UPDATE() { return getToken(MySQLStatementParser.UPDATE, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public OnDuplicateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onDuplicateClause; }
	}

	public final OnDuplicateClauseContext onDuplicateClause() throws RecognitionException {
		OnDuplicateClauseContext _localctx = new OnDuplicateClauseContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_onDuplicateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
			match(ON);
			setState(1687);
			match(DUPLICATE);
			setState(1688);
			match(KEY);
			setState(1689);
			match(UPDATE);
			setState(1690);
			assignmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemListWithEmptyContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public ItemListWithEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemListWithEmpty; }
	}

	public final ItemListWithEmptyContext itemListWithEmpty() throws RecognitionException {
		ItemListWithEmptyContext _localctx = new ItemListWithEmptyContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_itemListWithEmpty);
		try {
			setState(1695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1692);
				match(LP_);
				setState(1693);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1694);
				idList();
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

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
			assignment();
			setState(1702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1698);
				match(COMMA);
				setState(1699);
				assignment();
				}
				}
				setState(1704);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1705);
			columnName();
			setState(1706);
			match(EQ_);
			setState(1707);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateClauseContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(MySQLStatementParser.UPDATE, 0); }
		public UpdateSpecContext updateSpec() {
			return getRuleContext(UpdateSpecContext.class,0);
		}
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public UpdateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateClause; }
	}

	public final UpdateClauseContext updateClause() throws RecognitionException {
		UpdateClauseContext _localctx = new UpdateClauseContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_updateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			match(UPDATE);
			setState(1710);
			updateSpec();
			setState(1711);
			tableReferences();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateSpecContext extends ParserRuleContext {
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLStatementParser.LOW_PRIORITY, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public UpdateSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSpec; }
	}

	public final UpdateSpecContext updateSpec() throws RecognitionException {
		UpdateSpecContext _localctx = new UpdateSpecContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_updateSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY) {
				{
				setState(1713);
				match(LOW_PRIORITY);
				}
			}

			setState(1717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(1716);
				match(IGNORE);
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

	public static class DeleteContext extends ParserRuleContext {
		public DeleteClauseContext deleteClause() {
			return getRuleContext(DeleteClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			deleteClause();
			setState(1721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1720);
				whereClause();
				}
			}

			setState(1724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1723);
				orderByClause();
				}
			}

			setState(1727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1726);
				limitClause();
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

	public static class UpdateContext extends ParserRuleContext {
		public UpdateClauseContext updateClause() {
			return getRuleContext(UpdateClauseContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
			updateClause();
			setState(1730);
			setClause();
			setState(1732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1731);
				whereClause();
				}
			}

			setState(1735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1734);
				orderByClause();
				}
			}

			setState(1738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1737);
				limitClause();
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
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IndexTypeContext indexType() {
			return getRuleContext(IndexTypeContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(MySQLStatementParser.UNIQUE, 0); }
		public TerminalNode FULLTEXT() { return getToken(MySQLStatementParser.FULLTEXT, 0); }
		public TerminalNode SPATIAL() { return getToken(MySQLStatementParser.SPATIAL, 0); }
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_createIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			match(CREATE);
			setState(1742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FULLTEXT || _la==SPATIAL || _la==UNIQUE) {
				{
				setState(1741);
				_la = _input.LA(1);
				if ( !(_la==FULLTEXT || _la==SPATIAL || _la==UNIQUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1744);
			match(INDEX);
			setState(1745);
			indexName();
			setState(1747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1746);
				indexType();
				}
			}

			setState(1749);
			match(ON);
			setState(1750);
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
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ONLINE() { return getToken(MySQLStatementParser.ONLINE, 0); }
		public TerminalNode OFFLINE() { return getToken(MySQLStatementParser.OFFLINE, 0); }
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_dropIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			match(DROP);
			setState(1753);
			match(INDEX);
			setState(1755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFLINE || _la==ONLINE) {
				{
				setState(1754);
				_la = _input.LA(1);
				if ( !(_la==OFFLINE || _la==ONLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1757);
			indexName();
			setState(1758);
			match(ON);
			setState(1759);
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
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public CreateTableOptionsContext createTableOptions() {
			return getRuleContext(CreateTableOptionsContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(MySQLStatementParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761);
			match(CREATE);
			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1762);
				match(TEMPORARY);
				}
			}

			setState(1765);
			match(TABLE);
			setState(1769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1766);
				match(IF);
				setState(1767);
				match(NOT);
				setState(1768);
				match(EXISTS);
				}
			}

			setState(1771);
			tableName();
			setState(1772);
			createTableOptions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableOptionsContext extends ParserRuleContext {
		public CreateTableBasicContext createTableBasic() {
			return getRuleContext(CreateTableBasicContext.class,0);
		}
		public CreateTableSelectContext createTableSelect() {
			return getRuleContext(CreateTableSelectContext.class,0);
		}
		public CreateTableLikeContext createTableLike() {
			return getRuleContext(CreateTableLikeContext.class,0);
		}
		public CreateTableOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableOptions; }
	}

	public final CreateTableOptionsContext createTableOptions() throws RecognitionException {
		CreateTableOptionsContext _localctx = new CreateTableOptionsContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_createTableOptions);
		try {
			setState(1777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1774);
				createTableBasic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1775);
				createTableSelect();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1776);
				createTableLike();
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

	public static class CreateTableBasicContext extends ParserRuleContext {
		public CreateDefinitionsWithParenContext createDefinitionsWithParen() {
			return getRuleContext(CreateDefinitionsWithParenContext.class,0);
		}
		public TableOptionsContext tableOptions() {
			return getRuleContext(TableOptionsContext.class,0);
		}
		public PartitionOptionsContext partitionOptions() {
			return getRuleContext(PartitionOptionsContext.class,0);
		}
		public CreateTableBasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableBasic; }
	}

	public final CreateTableBasicContext createTableBasic() throws RecognitionException {
		CreateTableBasicContext _localctx = new CreateTableBasicContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_createTableBasic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			createDefinitionsWithParen();
			setState(1781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << CHAR) | (1L << CHARACTER) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COLLATE) | (1L << COMMENT) | (1L << COMPRESSION) | (1L << CONNECTION) | (1L << DATA) | (1L << DELAY_KEY_WRITE) | (1L << ENCRYPTION) | (1L << ENGINE))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (INSERT_METHOD - 83)) | (1L << (KEY_BLOCK_SIZE - 83)) | (1L << (MAX_ROWS - 83)) | (1L << (MIN_ROWS - 83)) | (1L << (PACK_KEYS - 83)))) != 0) || ((((_la - 155)) & ~0x3f) == 0 && ((1L << (_la - 155)) & ((1L << (ROW_FORMAT - 155)) | (1L << (STATS_AUTO_RECALC - 155)) | (1L << (STATS_PERSISTENT - 155)) | (1L << (STATS_SAMPLE_PAGES - 155)) | (1L << (TABLESPACE - 155)))) != 0) || ((((_la - 295)) & ~0x3f) == 0 && ((1L << (_la - 295)) & ((1L << (UNION - 295)) | (1L << (DEFAULT - 295)) | (1L << (INDEX - 295)) | (1L << (PASSWORD - 295)))) != 0)) {
				{
				setState(1780);
				tableOptions();
				}
			}

			setState(1784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1783);
				partitionOptions();
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

	public static class CreateDefinitionsWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public CreateDefinitionsContext createDefinitions() {
			return getRuleContext(CreateDefinitionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public CreateDefinitionsWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitionsWithParen; }
	}

	public final CreateDefinitionsWithParenContext createDefinitionsWithParen() throws RecognitionException {
		CreateDefinitionsWithParenContext _localctx = new CreateDefinitionsWithParenContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_createDefinitionsWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1786);
			match(LP_);
			setState(1787);
			createDefinitions();
			setState(1788);
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

	public static class CreateDefinitionsContext extends ParserRuleContext {
		public List<CreateDefinitionContext> createDefinition() {
			return getRuleContexts(CreateDefinitionContext.class);
		}
		public CreateDefinitionContext createDefinition(int i) {
			return getRuleContext(CreateDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public CreateDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitions; }
	}

	public final CreateDefinitionsContext createDefinitions() throws RecognitionException {
		CreateDefinitionsContext _localctx = new CreateDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_createDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			createDefinition();
			setState(1795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1791);
				match(COMMA);
				setState(1792);
				createDefinition();
				}
				}
				setState(1797);
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

	public static class CreateDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public ConstraintDefinitionContext constraintDefinition() {
			return getRuleContext(ConstraintDefinitionContext.class,0);
		}
		public IndexDefinitionContext indexDefinition() {
			return getRuleContext(IndexDefinitionContext.class,0);
		}
		public CheckExprContext checkExpr() {
			return getRuleContext(CheckExprContext.class,0);
		}
		public CreateDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinition; }
	}

	public final CreateDefinitionContext createDefinition() throws RecognitionException {
		CreateDefinitionContext _localctx = new CreateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_createDefinition);
		try {
			setState(1802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1798);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1799);
				constraintDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1800);
				indexDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1801);
				checkExpr();
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

	public static class CheckExprContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(MySQLStatementParser.CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CheckExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkExpr; }
	}

	public final CheckExprContext checkExpr() throws RecognitionException {
		CheckExprContext _localctx = new CheckExprContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_checkExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804);
			match(CHECK);
			setState(1805);
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

	public static class CreateTableSelectContext extends ParserRuleContext {
		public UnionSelectContext unionSelect() {
			return getRuleContext(UnionSelectContext.class,0);
		}
		public CreateDefinitionsWithParenContext createDefinitionsWithParen() {
			return getRuleContext(CreateDefinitionsWithParenContext.class,0);
		}
		public TableOptionsContext tableOptions() {
			return getRuleContext(TableOptionsContext.class,0);
		}
		public PartitionOptionsContext partitionOptions() {
			return getRuleContext(PartitionOptionsContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public TerminalNode REPLACE() { return getToken(MySQLStatementParser.REPLACE, 0); }
		public CreateTableSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableSelect; }
	}

	public final CreateTableSelectContext createTableSelect() throws RecognitionException {
		CreateTableSelectContext _localctx = new CreateTableSelectContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_createTableSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1807);
				createDefinitionsWithParen();
				}
			}

			setState(1811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << CHAR) | (1L << CHARACTER) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COLLATE) | (1L << COMMENT) | (1L << COMPRESSION) | (1L << CONNECTION) | (1L << DATA) | (1L << DELAY_KEY_WRITE) | (1L << ENCRYPTION) | (1L << ENGINE))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (INSERT_METHOD - 83)) | (1L << (KEY_BLOCK_SIZE - 83)) | (1L << (MAX_ROWS - 83)) | (1L << (MIN_ROWS - 83)) | (1L << (PACK_KEYS - 83)))) != 0) || ((((_la - 155)) & ~0x3f) == 0 && ((1L << (_la - 155)) & ((1L << (ROW_FORMAT - 155)) | (1L << (STATS_AUTO_RECALC - 155)) | (1L << (STATS_PERSISTENT - 155)) | (1L << (STATS_SAMPLE_PAGES - 155)) | (1L << (TABLESPACE - 155)))) != 0) || ((((_la - 295)) & ~0x3f) == 0 && ((1L << (_la - 295)) & ((1L << (UNION - 295)) | (1L << (DEFAULT - 295)) | (1L << (INDEX - 295)) | (1L << (PASSWORD - 295)))) != 0)) {
				{
				setState(1810);
				tableOptions();
				}
			}

			setState(1814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1813);
				partitionOptions();
				}
			}

			setState(1817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE || _la==REPLACE) {
				{
				setState(1816);
				_la = _input.LA(1);
				if ( !(_la==IGNORE || _la==REPLACE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1819);
				match(AS);
				}
			}

			setState(1822);
			unionSelect();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableLikeContext extends ParserRuleContext {
		public LikeTableContext likeTable() {
			return getRuleContext(LikeTableContext.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public CreateTableLikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableLike; }
	}

	public final CreateTableLikeContext createTableLike() throws RecognitionException {
		CreateTableLikeContext _localctx = new CreateTableLikeContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_createTableLike);
		try {
			setState(1829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1824);
				likeTable();
				}
				break;
			case LP_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1825);
				match(LP_);
				setState(1826);
				likeTable();
				setState(1827);
				match(RP_);
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

	public static class LikeTableContext extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(MySQLStatementParser.LIKE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public LikeTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeTable; }
	}

	public final LikeTableContext likeTable() throws RecognitionException {
		LikeTableContext _localctx = new LikeTableContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_likeTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			match(LIKE);
			setState(1832);
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DataTypeGeneratedContext dataTypeGenerated() {
			return getRuleContext(DataTypeGeneratedContext.class,0);
		}
		public List<DataTypeOptionContext> dataTypeOption() {
			return getRuleContexts(DataTypeOptionContext.class);
		}
		public DataTypeOptionContext dataTypeOption(int i) {
			return getRuleContext(DataTypeOptionContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			columnName();
			setState(1835);
			dataType();
			setState(1843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO_INCREMENT) | (1L << COLUMN_FORMAT) | (1L << COMMENT) | (1L << CURRENT_TIMESTAMP))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (LOCALTIME - 95)) | (1L << (LOCALTIMESTAMP - 95)) | (1L << (NOW - 95)))) != 0) || _la==STORAGE || ((((_la - 276)) & ~0x3f) == 0 && ((1L << (_la - 276)) & ((1L << (KEY - 276)) | (1L << (NOT - 276)) | (1L << (NULL - 276)) | (1L << (PRIMARY - 276)) | (1L << (DEFAULT - 276)) | (1L << (ON - 276)) | (1L << (REFERENCES - 276)))) != 0) || ((((_la - 343)) & ~0x3f) == 0 && ((1L << (_la - 343)) & ((1L << (UNIQUE - 343)) | (1L << (STRING - 343)) | (1L << (NUMBER - 343)))) != 0)) {
					{
					{
					setState(1836);
					dataTypeOption();
					}
					}
					setState(1841);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1842);
				dataTypeGenerated();
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

	public static class DataTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public CharacterSetContext characterSet() {
			return getRuleContext(CharacterSetContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode UNSIGNED() { return getToken(MySQLStatementParser.UNSIGNED, 0); }
		public TerminalNode ZEROFILL() { return getToken(MySQLStatementParser.ZEROFILL, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<TerminalNode> STRING() { return getTokens(MySQLStatementParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MySQLStatementParser.STRING, i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_dataType);
		int _la;
		try {
			setState(1878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1845);
				typeName();
				setState(1847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1846);
					dataTypeLength();
					}
				}

				setState(1850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CHARACTER) | (1L << CHARSET))) != 0)) {
					{
					setState(1849);
					characterSet();
					}
				}

				setState(1853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(1852);
					collateClause();
					}
				}

				setState(1856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1855);
					match(UNSIGNED);
					}
				}

				setState(1859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(1858);
					match(ZEROFILL);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1861);
				typeName();
				{
				setState(1862);
				match(LP_);
				setState(1863);
				match(STRING);
				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1864);
					match(COMMA);
					setState(1865);
					match(STRING);
					}
					}
					setState(1870);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1871);
				match(RP_);
				setState(1873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CHARACTER) | (1L << CHARSET))) != 0)) {
					{
					setState(1872);
					characterSet();
					}
				}

				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(1875);
					collateClause();
					}
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

	public static class DataTypeOptionContext extends ParserRuleContext {
		public DataTypeGeneratedOptionContext dataTypeGeneratedOption() {
			return getRuleContext(DataTypeGeneratedOptionContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public TerminalNode AUTO_INCREMENT() { return getToken(MySQLStatementParser.AUTO_INCREMENT, 0); }
		public TerminalNode COLUMN_FORMAT() { return getToken(MySQLStatementParser.COLUMN_FORMAT, 0); }
		public TerminalNode FIXED() { return getToken(MySQLStatementParser.FIXED, 0); }
		public TerminalNode DYNAMIC() { return getToken(MySQLStatementParser.DYNAMIC, 0); }
		public TerminalNode STORAGE() { return getToken(MySQLStatementParser.STORAGE, 0); }
		public TerminalNode DISK() { return getToken(MySQLStatementParser.DISK, 0); }
		public TerminalNode MEMORY() { return getToken(MySQLStatementParser.MEMORY, 0); }
		public ReferenceDefinitionContext referenceDefinition() {
			return getRuleContext(ReferenceDefinitionContext.class,0);
		}
		public DataTypeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeOption; }
	}

	public final DataTypeOptionContext dataTypeOption() throws RecognitionException {
		DataTypeOptionContext _localctx = new DataTypeOptionContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_dataTypeOption);
		int _la;
		try {
			setState(1891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1880);
				dataTypeGeneratedOption();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1881);
					match(DEFAULT);
					}
				}

				setState(1884);
				defaultValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1885);
				match(AUTO_INCREMENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1886);
				match(COLUMN_FORMAT);
				setState(1887);
				_la = _input.LA(1);
				if ( !(_la==DYNAMIC || _la==FIXED || _la==DEFAULT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1888);
				match(STORAGE);
				setState(1889);
				_la = _input.LA(1);
				if ( !(_la==DISK || _la==MEMORY || _la==DEFAULT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1890);
				referenceDefinition();
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

	public static class DataTypeGeneratedOptionContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode UNIQUE() { return getToken(MySQLStatementParser.UNIQUE, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(MySQLStatementParser.STRING, 0); }
		public DataTypeGeneratedOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeGeneratedOption; }
	}

	public final DataTypeGeneratedOptionContext dataTypeGeneratedOption() throws RecognitionException {
		DataTypeGeneratedOptionContext _localctx = new DataTypeGeneratedOptionContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_dataTypeGeneratedOption);
		try {
			setState(1903);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1893);
				match(NULL);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1894);
				match(NOT);
				setState(1895);
				match(NULL);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1896);
				match(UNIQUE);
				setState(1898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1897);
					match(KEY);
					}
					break;
				}
				}
				break;
			case KEY:
			case PRIMARY:
				enterOuterAlt(_localctx, 4);
				{
				setState(1900);
				primaryKey();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1901);
				match(COMMENT);
				setState(1902);
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

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public TerminalNode NUMBER() { return getToken(MySQLStatementParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(MySQLStatementParser.STRING, 0); }
		public List<CurrentTimestampTypeContext> currentTimestampType() {
			return getRuleContexts(CurrentTimestampTypeContext.class);
		}
		public CurrentTimestampTypeContext currentTimestampType(int i) {
			return getRuleContext(CurrentTimestampTypeContext.class,i);
		}
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public TerminalNode UPDATE() { return getToken(MySQLStatementParser.UPDATE, 0); }
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_defaultValue);
		try {
			setState(1917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1905);
				match(NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1906);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1907);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1908);
				currentTimestampType();
				setState(1912);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1909);
					match(ON);
					setState(1910);
					match(UPDATE);
					setState(1911);
					currentTimestampType();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1914);
				match(ON);
				setState(1915);
				match(UPDATE);
				setState(1916);
				currentTimestampType();
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

	public static class CurrentTimestampTypeContext extends ParserRuleContext {
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(MySQLStatementParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(MySQLStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(MySQLStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode NOW() { return getToken(MySQLStatementParser.NOW, 0); }
		public TerminalNode NUMBER() { return getToken(MySQLStatementParser.NUMBER, 0); }
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public CurrentTimestampTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currentTimestampType; }
	}

	public final CurrentTimestampTypeContext currentTimestampType() throws RecognitionException {
		CurrentTimestampTypeContext _localctx = new CurrentTimestampTypeContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_currentTimestampType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			_la = _input.LA(1);
			if ( !(_la==CURRENT_TIMESTAMP || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (LOCALTIME - 95)) | (1L << (LOCALTIMESTAMP - 95)) | (1L << (NOW - 95)))) != 0) || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1920);
				dataTypeLength();
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

	public static class ReferenceDefinitionContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(MySQLStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public KeyPartsWithParenContext keyPartsWithParen() {
			return getRuleContext(KeyPartsWithParenContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(MySQLStatementParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(MySQLStatementParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(MySQLStatementParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(MySQLStatementParser.SIMPLE, 0); }
		public List<ReferenceTypeContext> referenceType() {
			return getRuleContexts(ReferenceTypeContext.class);
		}
		public ReferenceTypeContext referenceType(int i) {
			return getRuleContext(ReferenceTypeContext.class,i);
		}
		public ReferenceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceDefinition; }
	}

	public final ReferenceDefinitionContext referenceDefinition() throws RecognitionException {
		ReferenceDefinitionContext _localctx = new ReferenceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_referenceDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			match(REFERENCES);
			setState(1924);
			tableName();
			setState(1925);
			keyPartsWithParen();
			setState(1932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1926);
				match(MATCH);
				setState(1927);
				match(FULL);
				}
				break;
			case 2:
				{
				setState(1928);
				match(MATCH);
				setState(1929);
				match(PARTIAL);
				}
				break;
			case 3:
				{
				setState(1930);
				match(MATCH);
				setState(1931);
				match(SIMPLE);
				}
				break;
			}
			setState(1937);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1934);
					referenceType();
					}
					} 
				}
				setState(1939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public ReferenceOptionContext referenceOption() {
			return getRuleContext(ReferenceOptionContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(MySQLStatementParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(MySQLStatementParser.DELETE, 0); }
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_referenceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1940);
			match(ON);
			setState(1941);
			_la = _input.LA(1);
			if ( !(_la==UPDATE || _la==DELETE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1942);
			referenceOption();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceOptionContext extends ParserRuleContext {
		public TerminalNode RESTRICT() { return getToken(MySQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(MySQLStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public TerminalNode NO() { return getToken(MySQLStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(MySQLStatementParser.ACTION, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public ReferenceOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceOption; }
	}

	public final ReferenceOptionContext referenceOption() throws RecognitionException {
		ReferenceOptionContext _localctx = new ReferenceOptionContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_referenceOption);
		try {
			setState(1952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1944);
				match(RESTRICT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1945);
				match(CASCADE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1946);
				match(SET);
				setState(1947);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1948);
				match(NO);
				setState(1949);
				match(ACTION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1950);
				match(SET);
				setState(1951);
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

	public static class DataTypeGeneratedContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(MySQLStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(MySQLStatementParser.ALWAYS, 0); }
		public List<DataTypeGeneratedOptionContext> dataTypeGeneratedOption() {
			return getRuleContexts(DataTypeGeneratedOptionContext.class);
		}
		public DataTypeGeneratedOptionContext dataTypeGeneratedOption(int i) {
			return getRuleContext(DataTypeGeneratedOptionContext.class,i);
		}
		public TerminalNode VIRTUAL() { return getToken(MySQLStatementParser.VIRTUAL, 0); }
		public TerminalNode STORED() { return getToken(MySQLStatementParser.STORED, 0); }
		public DataTypeGeneratedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeGenerated; }
	}

	public final DataTypeGeneratedContext dataTypeGenerated() throws RecognitionException {
		DataTypeGeneratedContext _localctx = new DataTypeGeneratedContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_dataTypeGenerated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GENERATED) {
				{
				setState(1954);
				match(GENERATED);
				setState(1955);
				match(ALWAYS);
				}
			}

			setState(1958);
			match(AS);
			setState(1959);
			expr(0);
			setState(1961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORED || _la==VIRTUAL) {
				{
				setState(1960);
				_la = _input.LA(1);
				if ( !(_la==STORED || _la==VIRTUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || ((((_la - 276)) & ~0x3f) == 0 && ((1L << (_la - 276)) & ((1L << (KEY - 276)) | (1L << (NOT - 276)) | (1L << (NULL - 276)) | (1L << (PRIMARY - 276)))) != 0) || _la==UNIQUE) {
				{
				{
				setState(1963);
				dataTypeGeneratedOption();
				}
				}
				setState(1968);
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

	public static class ConstraintDefinitionContext extends ParserRuleContext {
		public PrimaryKeyOptionContext primaryKeyOption() {
			return getRuleContext(PrimaryKeyOptionContext.class,0);
		}
		public UniqueOptionContext uniqueOption() {
			return getRuleContext(UniqueOptionContext.class,0);
		}
		public ForeignKeyOptionContext foreignKeyOption() {
			return getRuleContext(ForeignKeyOptionContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(MySQLStatementParser.CONSTRAINT, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ConstraintDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintDefinition; }
	}

	public final ConstraintDefinitionContext constraintDefinition() throws RecognitionException {
		ConstraintDefinitionContext _localctx = new ConstraintDefinitionContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_constraintDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1969);
				match(CONSTRAINT);
				setState(1971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(1970);
					symbol();
					}
				}

				}
			}

			setState(1978);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
				{
				setState(1975);
				primaryKeyOption();
				}
				break;
			case UNIQUE:
				{
				setState(1976);
				uniqueOption();
				}
				break;
			case FOREIGN:
				{
				setState(1977);
				foreignKeyOption();
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

	public static class PrimaryKeyOptionContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public IndexTypeContext indexType() {
			return getRuleContext(IndexTypeContext.class,0);
		}
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public PrimaryKeyOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyOption; }
	}

	public final PrimaryKeyOptionContext primaryKeyOption() throws RecognitionException {
		PrimaryKeyOptionContext _localctx = new PrimaryKeyOptionContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_primaryKeyOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			primaryKey();
			setState(1982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1981);
				indexType();
				}
			}

			setState(1984);
			columnList();
			setState(1988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==KEY_BLOCK_SIZE || _la==USING || _la==WITH) {
				{
				{
				setState(1985);
				indexOption();
				}
				}
				setState(1990);
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

	public static class UniqueOptionContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(MySQLStatementParser.UNIQUE, 0); }
		public KeyPartsWithParenContext keyPartsWithParen() {
			return getRuleContext(KeyPartsWithParenContext.class,0);
		}
		public IndexAndKeyContext indexAndKey() {
			return getRuleContext(IndexAndKeyContext.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IndexTypeContext indexType() {
			return getRuleContext(IndexTypeContext.class,0);
		}
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public UniqueOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueOption; }
	}

	public final UniqueOptionContext uniqueOption() throws RecognitionException {
		UniqueOptionContext _localctx = new UniqueOptionContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_uniqueOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1991);
			match(UNIQUE);
			setState(1993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY || _la==INDEX) {
				{
				setState(1992);
				indexAndKey();
				}
			}

			setState(1996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1995);
				indexName();
				}
			}

			setState(1999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1998);
				indexType();
				}
			}

			setState(2001);
			keyPartsWithParen();
			setState(2005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==KEY_BLOCK_SIZE || _la==USING || _la==WITH) {
				{
				{
				setState(2002);
				indexOption();
				}
				}
				setState(2007);
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

	public static class ForeignKeyOptionContext extends ParserRuleContext {
		public TerminalNode FOREIGN() { return getToken(MySQLStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public ColumnNamesWithParenContext columnNamesWithParen() {
			return getRuleContext(ColumnNamesWithParenContext.class,0);
		}
		public ReferenceDefinitionContext referenceDefinition() {
			return getRuleContext(ReferenceDefinitionContext.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public ForeignKeyOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOption; }
	}

	public final ForeignKeyOptionContext foreignKeyOption() throws RecognitionException {
		ForeignKeyOptionContext _localctx = new ForeignKeyOptionContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_foreignKeyOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008);
			match(FOREIGN);
			setState(2009);
			match(KEY);
			setState(2011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(2010);
				indexName();
				}
			}

			setState(2013);
			columnNamesWithParen();
			setState(2014);
			referenceDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexDefinitionContext extends ParserRuleContext {
		public KeyPartsWithParenContext keyPartsWithParen() {
			return getRuleContext(KeyPartsWithParenContext.class,0);
		}
		public IndexAndKeyContext indexAndKey() {
			return getRuleContext(IndexAndKeyContext.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IndexTypeContext indexType() {
			return getRuleContext(IndexTypeContext.class,0);
		}
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public TerminalNode FULLTEXT() { return getToken(MySQLStatementParser.FULLTEXT, 0); }
		public TerminalNode SPATIAL() { return getToken(MySQLStatementParser.SPATIAL, 0); }
		public IndexDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexDefinition; }
	}

	public final IndexDefinitionContext indexDefinition() throws RecognitionException {
		IndexDefinitionContext _localctx = new IndexDefinitionContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_indexDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FULLTEXT || _la==SPATIAL) {
				{
				setState(2016);
				_la = _input.LA(1);
				if ( !(_la==FULLTEXT || _la==SPATIAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY || _la==INDEX) {
				{
				setState(2019);
				indexAndKey();
				}
			}

			setState(2023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(2022);
				indexName();
				}
			}

			setState(2026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(2025);
				indexType();
				}
			}

			setState(2028);
			keyPartsWithParen();
			setState(2032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==KEY_BLOCK_SIZE || _la==USING || _la==WITH) {
				{
				{
				setState(2029);
				indexOption();
				}
				}
				setState(2034);
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

	public static class TableOptionsContext extends ParserRuleContext {
		public List<TableOptionContext> tableOption() {
			return getRuleContexts(TableOptionContext.class);
		}
		public TableOptionContext tableOption(int i) {
			return getRuleContext(TableOptionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public TableOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptions; }
	}

	public final TableOptionsContext tableOptions() throws RecognitionException {
		TableOptionsContext _localctx = new TableOptionsContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_tableOptions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2035);
			tableOption();
			setState(2042);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2037);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(2036);
						match(COMMA);
						}
					}

					setState(2039);
					tableOption();
					}
					} 
				}
				setState(2044);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
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
		public TerminalNode AUTO_INCREMENT() { return getToken(MySQLStatementParser.AUTO_INCREMENT, 0); }
		public TerminalNode NUMBER() { return getToken(MySQLStatementParser.NUMBER, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode AVG_ROW_LENGTH() { return getToken(MySQLStatementParser.AVG_ROW_LENGTH, 0); }
		public CharacterSetContext characterSet() {
			return getRuleContext(CharacterSetContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public TerminalNode CHECKSUM() { return getToken(MySQLStatementParser.CHECKSUM, 0); }
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(MySQLStatementParser.STRING, 0); }
		public TerminalNode COMPRESSION() { return getToken(MySQLStatementParser.COMPRESSION, 0); }
		public TerminalNode CONNECTION() { return getToken(MySQLStatementParser.CONNECTION, 0); }
		public TerminalNode DIRECTORY() { return getToken(MySQLStatementParser.DIRECTORY, 0); }
		public TerminalNode DATA() { return getToken(MySQLStatementParser.DATA, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode DELAY_KEY_WRITE() { return getToken(MySQLStatementParser.DELAY_KEY_WRITE, 0); }
		public TerminalNode ENCRYPTION() { return getToken(MySQLStatementParser.ENCRYPTION, 0); }
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public EngineNameContext engineName() {
			return getRuleContext(EngineNameContext.class,0);
		}
		public TerminalNode INSERT_METHOD() { return getToken(MySQLStatementParser.INSERT_METHOD, 0); }
		public TerminalNode NO() { return getToken(MySQLStatementParser.NO, 0); }
		public TerminalNode FIRST() { return getToken(MySQLStatementParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(MySQLStatementParser.LAST, 0); }
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(MySQLStatementParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode MAX_ROWS() { return getToken(MySQLStatementParser.MAX_ROWS, 0); }
		public TerminalNode MIN_ROWS() { return getToken(MySQLStatementParser.MIN_ROWS, 0); }
		public TerminalNode PACK_KEYS() { return getToken(MySQLStatementParser.PACK_KEYS, 0); }
		public TerminalNode PASSWORD() { return getToken(MySQLStatementParser.PASSWORD, 0); }
		public TerminalNode ROW_FORMAT() { return getToken(MySQLStatementParser.ROW_FORMAT, 0); }
		public TerminalNode DYNAMIC() { return getToken(MySQLStatementParser.DYNAMIC, 0); }
		public TerminalNode FIXED() { return getToken(MySQLStatementParser.FIXED, 0); }
		public TerminalNode COMPRESSED() { return getToken(MySQLStatementParser.COMPRESSED, 0); }
		public TerminalNode REDUNDANT() { return getToken(MySQLStatementParser.REDUNDANT, 0); }
		public TerminalNode COMPACT() { return getToken(MySQLStatementParser.COMPACT, 0); }
		public TerminalNode STATS_AUTO_RECALC() { return getToken(MySQLStatementParser.STATS_AUTO_RECALC, 0); }
		public TerminalNode STATS_PERSISTENT() { return getToken(MySQLStatementParser.STATS_PERSISTENT, 0); }
		public TerminalNode STATS_SAMPLE_PAGES() { return getToken(MySQLStatementParser.STATS_SAMPLE_PAGES, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public TablespaceNameContext tablespaceName() {
			return getRuleContext(TablespaceNameContext.class,0);
		}
		public TerminalNode STORAGE() { return getToken(MySQLStatementParser.STORAGE, 0); }
		public TerminalNode DISK() { return getToken(MySQLStatementParser.DISK, 0); }
		public TerminalNode MEMORY() { return getToken(MySQLStatementParser.MEMORY, 0); }
		public TerminalNode UNION() { return getToken(MySQLStatementParser.UNION, 0); }
		public TableListContext tableList() {
			return getRuleContext(TableListContext.class,0);
		}
		public TableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOption; }
	}

	public final TableOptionContext tableOption() throws RecognitionException {
		TableOptionContext _localctx = new TableOptionContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_tableOption);
		int _la;
		try {
			setState(2164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2045);
				match(AUTO_INCREMENT);
				setState(2047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2046);
					match(EQ_);
					}
				}

				setState(2049);
				match(NUMBER);
				}
				break;
			case AVG_ROW_LENGTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2050);
				match(AVG_ROW_LENGTH);
				setState(2052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2051);
					match(EQ_);
					}
				}

				setState(2054);
				match(NUMBER);
				}
				break;
			case CHAR:
			case CHARACTER:
			case CHARSET:
			case COLLATE:
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2055);
					match(DEFAULT);
					}
				}

				setState(2060);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR:
				case CHARACTER:
				case CHARSET:
					{
					setState(2058);
					characterSet();
					}
					break;
				case COLLATE:
					{
					setState(2059);
					collateClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case CHECKSUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(2062);
				match(CHECKSUM);
				setState(2064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2063);
					match(EQ_);
					}
				}

				setState(2066);
				match(NUMBER);
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2067);
				match(COMMENT);
				setState(2069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2068);
					match(EQ_);
					}
				}

				setState(2071);
				match(STRING);
				}
				break;
			case COMPRESSION:
				enterOuterAlt(_localctx, 6);
				{
				setState(2072);
				match(COMPRESSION);
				setState(2074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2073);
					match(EQ_);
					}
				}

				setState(2076);
				match(STRING);
				}
				break;
			case CONNECTION:
				enterOuterAlt(_localctx, 7);
				{
				setState(2077);
				match(CONNECTION);
				setState(2079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2078);
					match(EQ_);
					}
				}

				setState(2081);
				match(STRING);
				}
				break;
			case DATA:
			case INDEX:
				enterOuterAlt(_localctx, 8);
				{
				setState(2082);
				_la = _input.LA(1);
				if ( !(_la==DATA || _la==INDEX) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2083);
				match(DIRECTORY);
				setState(2085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2084);
					match(EQ_);
					}
				}

				setState(2087);
				match(STRING);
				}
				break;
			case DELAY_KEY_WRITE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2088);
				match(DELAY_KEY_WRITE);
				setState(2090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2089);
					match(EQ_);
					}
				}

				setState(2092);
				match(NUMBER);
				}
				break;
			case ENCRYPTION:
				enterOuterAlt(_localctx, 10);
				{
				setState(2093);
				match(ENCRYPTION);
				setState(2095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2094);
					match(EQ_);
					}
				}

				setState(2097);
				match(STRING);
				}
				break;
			case ENGINE:
				enterOuterAlt(_localctx, 11);
				{
				setState(2098);
				match(ENGINE);
				setState(2100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2099);
					match(EQ_);
					}
				}

				setState(2102);
				engineName();
				}
				break;
			case INSERT_METHOD:
				enterOuterAlt(_localctx, 12);
				{
				setState(2103);
				match(INSERT_METHOD);
				setState(2105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2104);
					match(EQ_);
					}
				}

				setState(2107);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST || _la==NO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case KEY_BLOCK_SIZE:
				enterOuterAlt(_localctx, 13);
				{
				setState(2108);
				match(KEY_BLOCK_SIZE);
				setState(2110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2109);
					match(EQ_);
					}
				}

				setState(2112);
				match(NUMBER);
				}
				break;
			case MAX_ROWS:
				enterOuterAlt(_localctx, 14);
				{
				setState(2113);
				match(MAX_ROWS);
				setState(2115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2114);
					match(EQ_);
					}
				}

				setState(2117);
				match(NUMBER);
				}
				break;
			case MIN_ROWS:
				enterOuterAlt(_localctx, 15);
				{
				setState(2118);
				match(MIN_ROWS);
				setState(2120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2119);
					match(EQ_);
					}
				}

				setState(2122);
				match(NUMBER);
				}
				break;
			case PACK_KEYS:
				enterOuterAlt(_localctx, 16);
				{
				setState(2123);
				match(PACK_KEYS);
				setState(2125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2124);
					match(EQ_);
					}
				}

				setState(2127);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case PASSWORD:
				enterOuterAlt(_localctx, 17);
				{
				setState(2128);
				match(PASSWORD);
				setState(2130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2129);
					match(EQ_);
					}
				}

				setState(2132);
				match(STRING);
				}
				break;
			case ROW_FORMAT:
				enterOuterAlt(_localctx, 18);
				{
				setState(2133);
				match(ROW_FORMAT);
				setState(2135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2134);
					match(EQ_);
					}
				}

				setState(2137);
				_la = _input.LA(1);
				if ( !(((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (COMPACT - 29)) | (1L << (COMPRESSED - 29)) | (1L << (DYNAMIC - 29)) | (1L << (FIXED - 29)))) != 0) || _la==REDUNDANT || _la==DEFAULT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STATS_AUTO_RECALC:
				enterOuterAlt(_localctx, 19);
				{
				setState(2138);
				match(STATS_AUTO_RECALC);
				setState(2140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2139);
					match(EQ_);
					}
				}

				setState(2142);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STATS_PERSISTENT:
				enterOuterAlt(_localctx, 20);
				{
				setState(2143);
				match(STATS_PERSISTENT);
				setState(2145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2144);
					match(EQ_);
					}
				}

				setState(2147);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STATS_SAMPLE_PAGES:
				enterOuterAlt(_localctx, 21);
				{
				setState(2148);
				match(STATS_SAMPLE_PAGES);
				setState(2150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2149);
					match(EQ_);
					}
				}

				setState(2152);
				match(NUMBER);
				}
				break;
			case TABLESPACE:
				enterOuterAlt(_localctx, 22);
				{
				setState(2153);
				match(TABLESPACE);
				setState(2154);
				tablespaceName();
				setState(2157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORAGE) {
					{
					setState(2155);
					match(STORAGE);
					setState(2156);
					_la = _input.LA(1);
					if ( !(_la==DISK || _la==MEMORY || _la==DEFAULT) ) {
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
			case UNION:
				enterOuterAlt(_localctx, 23);
				{
				setState(2159);
				match(UNION);
				setState(2161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2160);
					match(EQ_);
					}
				}

				setState(2163);
				tableList();
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

	public static class EngineNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public TerminalNode MEMORY() { return getToken(MySQLStatementParser.MEMORY, 0); }
		public EngineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engineName; }
	}

	public final EngineNameContext engineName() throws RecognitionException {
		EngineNameContext _localctx = new EngineNameContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_engineName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2166);
			_la = _input.LA(1);
			if ( !(_la==MEMORY || _la==ID) ) {
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

	public static class PartitionOptionsContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(MySQLStatementParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(MySQLStatementParser.BY, i);
		}
		public List<LinearPartitionContext> linearPartition() {
			return getRuleContexts(LinearPartitionContext.class);
		}
		public LinearPartitionContext linearPartition(int i) {
			return getRuleContext(LinearPartitionContext.class,i);
		}
		public RangeOrListPartitionContext rangeOrListPartition() {
			return getRuleContext(RangeOrListPartitionContext.class,0);
		}
		public TerminalNode PARTITIONS() { return getToken(MySQLStatementParser.PARTITIONS, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(MySQLStatementParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MySQLStatementParser.NUMBER, i);
		}
		public TerminalNode SUBPARTITION() { return getToken(MySQLStatementParser.SUBPARTITION, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public PartitionDefinitionsContext partitionDefinitions() {
			return getRuleContext(PartitionDefinitionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode SUBPARTITIONS() { return getToken(MySQLStatementParser.SUBPARTITIONS, 0); }
		public PartitionOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionOptions; }
	}

	public final PartitionOptionsContext partitionOptions() throws RecognitionException {
		PartitionOptionsContext _localctx = new PartitionOptionsContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_partitionOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2168);
			match(PARTITION);
			setState(2169);
			match(BY);
			setState(2172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
			case LINEAR:
			case KEY:
				{
				setState(2170);
				linearPartition();
				}
				break;
			case LIST:
			case RANGE:
				{
				setState(2171);
				rangeOrListPartition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITIONS) {
				{
				setState(2174);
				match(PARTITIONS);
				setState(2175);
				match(NUMBER);
				}
			}

			setState(2185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBPARTITION) {
				{
				setState(2178);
				match(SUBPARTITION);
				setState(2179);
				match(BY);
				setState(2180);
				linearPartition();
				setState(2183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBPARTITIONS) {
					{
					setState(2181);
					match(SUBPARTITIONS);
					setState(2182);
					match(NUMBER);
					}
				}

				}
			}

			setState(2191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2187);
				match(LP_);
				setState(2188);
				partitionDefinitions();
				setState(2189);
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

	public static class LinearPartitionContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(MySQLStatementParser.HASH, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public ColumnNamesWithParenContext columnNamesWithParen() {
			return getRuleContext(ColumnNamesWithParenContext.class,0);
		}
		public TerminalNode LINEAR() { return getToken(MySQLStatementParser.LINEAR, 0); }
		public YearFunctionExprContext yearFunctionExpr() {
			return getRuleContext(YearFunctionExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ALGORITHM() { return getToken(MySQLStatementParser.ALGORITHM, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode NUMBER() { return getToken(MySQLStatementParser.NUMBER, 0); }
		public LinearPartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linearPartition; }
	}

	public final LinearPartitionContext linearPartition() throws RecognitionException {
		LinearPartitionContext _localctx = new LinearPartitionContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_linearPartition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINEAR) {
				{
				setState(2193);
				match(LINEAR);
				}
			}

			setState(2208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				{
				setState(2196);
				match(HASH);
				setState(2199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2197);
					yearFunctionExpr();
					}
					break;
				case 2:
					{
					setState(2198);
					expr(0);
					}
					break;
				}
				}
				break;
			case KEY:
				{
				setState(2201);
				match(KEY);
				setState(2205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALGORITHM) {
					{
					setState(2202);
					match(ALGORITHM);
					setState(2203);
					match(EQ_);
					setState(2204);
					match(NUMBER);
					}
				}

				setState(2207);
				columnNamesWithParen();
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

	public static class YearFunctionExprContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode YEAR() { return getToken(MySQLStatementParser.YEAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public YearFunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yearFunctionExpr; }
	}

	public final YearFunctionExprContext yearFunctionExpr() throws RecognitionException {
		YearFunctionExprContext _localctx = new YearFunctionExprContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_yearFunctionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2210);
			match(LP_);
			setState(2211);
			match(YEAR);
			setState(2212);
			expr(0);
			setState(2213);
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

	public static class RangeOrListPartitionContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(MySQLStatementParser.RANGE, 0); }
		public TerminalNode LIST() { return getToken(MySQLStatementParser.LIST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLUMNS() { return getToken(MySQLStatementParser.COLUMNS, 0); }
		public ColumnNamesWithParenContext columnNamesWithParen() {
			return getRuleContext(ColumnNamesWithParenContext.class,0);
		}
		public RangeOrListPartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeOrListPartition; }
	}

	public final RangeOrListPartitionContext rangeOrListPartition() throws RecognitionException {
		RangeOrListPartitionContext _localctx = new RangeOrListPartitionContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_rangeOrListPartition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2215);
			_la = _input.LA(1);
			if ( !(_la==LIST || _la==RANGE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case CASE:
			case GLOBAL:
			case GROUP_CONCAT:
			case INTERVAL:
			case PERSIST:
			case PERSIST_ONLY:
			case SESSION:
			case NOT_:
			case UNARY_BIT_COMPLEMENT:
			case PLUS:
			case MINUS:
			case DOT:
			case LP_:
			case LBE_:
			case QUESTION:
			case AT_:
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
				setState(2216);
				expr(0);
				}
				break;
			case COLUMNS:
				{
				setState(2217);
				match(COLUMNS);
				setState(2218);
				columnNamesWithParen();
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

	public static class PartitionDefinitionsContext extends ParserRuleContext {
		public List<PartitionDefinitionContext> partitionDefinition() {
			return getRuleContexts(PartitionDefinitionContext.class);
		}
		public PartitionDefinitionContext partitionDefinition(int i) {
			return getRuleContext(PartitionDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public PartitionDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionDefinitions; }
	}

	public final PartitionDefinitionsContext partitionDefinitions() throws RecognitionException {
		PartitionDefinitionsContext _localctx = new PartitionDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_partitionDefinitions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2221);
			partitionDefinition();
			setState(2226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2222);
					match(COMMA);
					setState(2223);
					partitionDefinition();
					}
					} 
				}
				setState(2228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
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

	public static class PartitionDefinitionContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public PartitionNameContext partitionName() {
			return getRuleContext(PartitionNameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(MySQLStatementParser.VALUES, 0); }
		public List<PartitionDefinitionOptionContext> partitionDefinitionOption() {
			return getRuleContexts(PartitionDefinitionOptionContext.class);
		}
		public PartitionDefinitionOptionContext partitionDefinitionOption(int i) {
			return getRuleContext(PartitionDefinitionOptionContext.class,i);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<SubpartitionDefinitionContext> subpartitionDefinition() {
			return getRuleContexts(SubpartitionDefinitionContext.class);
		}
		public SubpartitionDefinitionContext subpartitionDefinition(int i) {
			return getRuleContext(SubpartitionDefinitionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public LessThanPartitionContext lessThanPartition() {
			return getRuleContext(LessThanPartitionContext.class,0);
		}
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public ValueListWithParenContext valueListWithParen() {
			return getRuleContext(ValueListWithParenContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public PartitionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionDefinition; }
	}

	public final PartitionDefinitionContext partitionDefinition() throws RecognitionException {
		PartitionDefinitionContext _localctx = new PartitionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_partitionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2229);
			match(PARTITION);
			setState(2230);
			partitionName();
			setState(2237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUES) {
				{
				setState(2231);
				match(VALUES);
				setState(2235);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESS:
					{
					setState(2232);
					lessThanPartition();
					}
					break;
				case IN:
					{
					setState(2233);
					match(IN);
					setState(2234);
					valueListWithParen();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(2242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << DATA) | (1L << ENGINE))) != 0) || _la==MAX_ROWS || _la==MIN_ROWS || _la==STORAGE || _la==TABLESPACE || _la==INDEX) {
				{
				{
				setState(2239);
				partitionDefinitionOption();
				}
				}
				setState(2244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2245);
				match(LP_);
				setState(2246);
				subpartitionDefinition();
				setState(2251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2247);
					match(COMMA);
					setState(2248);
					subpartitionDefinition();
					}
					}
					setState(2253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2254);
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

	public static class PartitionDefinitionOptionContext extends ParserRuleContext {
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public EngineNameContext engineName() {
			return getRuleContext(EngineNameContext.class,0);
		}
		public TerminalNode STORAGE() { return getToken(MySQLStatementParser.STORAGE, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(MySQLStatementParser.STRING, 0); }
		public TerminalNode DATA() { return getToken(MySQLStatementParser.DATA, 0); }
		public TerminalNode DIRECTORY() { return getToken(MySQLStatementParser.DIRECTORY, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode MAX_ROWS() { return getToken(MySQLStatementParser.MAX_ROWS, 0); }
		public TerminalNode NUMBER() { return getToken(MySQLStatementParser.NUMBER, 0); }
		public TerminalNode MIN_ROWS() { return getToken(MySQLStatementParser.MIN_ROWS, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public TablespaceNameContext tablespaceName() {
			return getRuleContext(TablespaceNameContext.class,0);
		}
		public PartitionDefinitionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionDefinitionOption; }
	}

	public final PartitionDefinitionOptionContext partitionDefinitionOption() throws RecognitionException {
		PartitionDefinitionOptionContext _localctx = new PartitionDefinitionOptionContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_partitionDefinitionOption);
		int _la;
		try {
			setState(2298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENGINE:
			case STORAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORAGE) {
					{
					setState(2258);
					match(STORAGE);
					}
				}

				setState(2261);
				match(ENGINE);
				setState(2263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2262);
					match(EQ_);
					}
				}

				setState(2265);
				engineName();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2266);
				match(COMMENT);
				setState(2268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2267);
					match(EQ_);
					}
				}

				setState(2270);
				match(STRING);
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 3);
				{
				setState(2271);
				match(DATA);
				setState(2272);
				match(DIRECTORY);
				setState(2274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2273);
					match(EQ_);
					}
				}

				setState(2276);
				match(STRING);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 4);
				{
				setState(2277);
				match(INDEX);
				setState(2278);
				match(DIRECTORY);
				setState(2280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2279);
					match(EQ_);
					}
				}

				setState(2282);
				match(STRING);
				}
				break;
			case MAX_ROWS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2283);
				match(MAX_ROWS);
				setState(2285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2284);
					match(EQ_);
					}
				}

				setState(2287);
				match(NUMBER);
				}
				break;
			case MIN_ROWS:
				enterOuterAlt(_localctx, 6);
				{
				setState(2288);
				match(MIN_ROWS);
				setState(2290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2289);
					match(EQ_);
					}
				}

				setState(2292);
				match(NUMBER);
				}
				break;
			case TABLESPACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(2293);
				match(TABLESPACE);
				setState(2295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2294);
					match(EQ_);
					}
				}

				setState(2297);
				tablespaceName();
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

	public static class LessThanPartitionContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(MySQLStatementParser.LESS, 0); }
		public TerminalNode THAN() { return getToken(MySQLStatementParser.THAN, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode MAXVALUE() { return getToken(MySQLStatementParser.MAXVALUE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public LessThanPartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanPartition; }
	}

	public final LessThanPartitionContext lessThanPartition() throws RecognitionException {
		LessThanPartitionContext _localctx = new LessThanPartitionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_lessThanPartition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300);
			match(LESS);
			setState(2301);
			match(THAN);
			setState(2310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				{
				setState(2302);
				match(LP_);
				setState(2305);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(2303);
					expr(0);
					}
					break;
				case 2:
					{
					setState(2304);
					valueList();
					}
					break;
				}
				setState(2307);
				match(RP_);
				}
				break;
			case MAXVALUE:
				{
				setState(2309);
				match(MAXVALUE);
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

	public static class SubpartitionDefinitionContext extends ParserRuleContext {
		public TerminalNode SUBPARTITION() { return getToken(MySQLStatementParser.SUBPARTITION, 0); }
		public PartitionNameContext partitionName() {
			return getRuleContext(PartitionNameContext.class,0);
		}
		public List<PartitionDefinitionOptionContext> partitionDefinitionOption() {
			return getRuleContexts(PartitionDefinitionOptionContext.class);
		}
		public PartitionDefinitionOptionContext partitionDefinitionOption(int i) {
			return getRuleContext(PartitionDefinitionOptionContext.class,i);
		}
		public SubpartitionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpartitionDefinition; }
	}

	public final SubpartitionDefinitionContext subpartitionDefinition() throws RecognitionException {
		SubpartitionDefinitionContext _localctx = new SubpartitionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_subpartitionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2312);
			match(SUBPARTITION);
			setState(2313);
			partitionName();
			setState(2317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << DATA) | (1L << ENGINE))) != 0) || _la==MAX_ROWS || _la==MIN_ROWS || _la==STORAGE || _la==TABLESPACE || _la==INDEX) {
				{
				{
				setState(2314);
				partitionDefinitionOption();
				}
				}
				setState(2319);
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

	public static class AlterTableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterSpecificationsContext alterSpecifications() {
			return getRuleContext(AlterSpecificationsContext.class,0);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_alterTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2320);
			match(ALTER);
			setState(2321);
			match(TABLE);
			setState(2322);
			tableName();
			setState(2324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALGORITHM) | (1L << ANALYZE) | (1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << CHANGE) | (1L << CHAR) | (1L << CHARACTER) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COALESCE) | (1L << COLLATE) | (1L << COMMENT) | (1L << COMPRESSION) | (1L << CONNECTION) | (1L << CONVERT) | (1L << DATA) | (1L << DELAY_KEY_WRITE) | (1L << DISCARD) | (1L << ENCRYPTION) | (1L << ENGINE) | (1L << EXCHANGE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (FORCE - 67)) | (1L << (IMPORT_ - 67)) | (1L << (INSERT_METHOD - 67)) | (1L << (KEY_BLOCK_SIZE - 67)) | (1L << (LOCK - 67)) | (1L << (MAX_ROWS - 67)) | (1L << (MIN_ROWS - 67)) | (1L << (MODIFY - 67)) | (1L << (OPTIMIZE - 67)) | (1L << (PACK_KEYS - 67)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (REBUILD - 135)) | (1L << (REMOVE - 135)) | (1L << (RENAME - 135)) | (1L << (REORGANIZE - 135)) | (1L << (REPAIR - 135)) | (1L << (ROW_FORMAT - 135)) | (1L << (STATS_AUTO_RECALC - 135)) | (1L << (STATS_PERSISTENT - 135)) | (1L << (STATS_SAMPLE_PAGES - 135)) | (1L << (TABLESPACE - 135)))) != 0) || _la==UPGRADE || _la==WITHOUT || ((((_la - 284)) & ~0x3f) == 0 && ((1L << (_la - 284)) & ((1L << (ORDER - 284)) | (1L << (UNION - 284)) | (1L << (WITH - 284)) | (1L << (ADD - 284)) | (1L << (ALTER - 284)) | (1L << (CHECK - 284)) | (1L << (DEFAULT - 284)) | (1L << (DISABLE - 284)) | (1L << (DROP - 284)) | (1L << (ENABLE - 284)) | (1L << (INDEX - 284)) | (1L << (PASSWORD - 284)) | (1L << (TRUNCATE - 284)))) != 0)) {
				{
				setState(2323);
				alterSpecifications();
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

	public static class AlterSpecificationsContext extends ParserRuleContext {
		public List<AlterSpecificationContext> alterSpecification() {
			return getRuleContexts(AlterSpecificationContext.class);
		}
		public AlterSpecificationContext alterSpecification(int i) {
			return getRuleContext(AlterSpecificationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public AlterSpecificationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSpecifications; }
	}

	public final AlterSpecificationsContext alterSpecifications() throws RecognitionException {
		AlterSpecificationsContext _localctx = new AlterSpecificationsContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_alterSpecifications);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2326);
			alterSpecification();
			setState(2331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2327);
				match(COMMA);
				setState(2328);
				alterSpecification();
				}
				}
				setState(2333);
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

	public static class AlterSpecificationContext extends ParserRuleContext {
		public TableOptionsContext tableOptions() {
			return getRuleContext(TableOptionsContext.class,0);
		}
		public AddColumnContext addColumn() {
			return getRuleContext(AddColumnContext.class,0);
		}
		public AddIndexContext addIndex() {
			return getRuleContext(AddIndexContext.class,0);
		}
		public AddConstraintContext addConstraint() {
			return getRuleContext(AddConstraintContext.class,0);
		}
		public TerminalNode ALGORITHM() { return getToken(MySQLStatementParser.ALGORITHM, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public TerminalNode INPLACE() { return getToken(MySQLStatementParser.INPLACE, 0); }
		public TerminalNode COPY() { return getToken(MySQLStatementParser.COPY, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public ChangeColumnContext changeColumn() {
			return getRuleContext(ChangeColumnContext.class,0);
		}
		public CharacterSetContext characterSet() {
			return getRuleContext(CharacterSetContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode CONVERT() { return getToken(MySQLStatementParser.CONVERT, 0); }
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public TerminalNode KEYS() { return getToken(MySQLStatementParser.KEYS, 0); }
		public TerminalNode DISABLE() { return getToken(MySQLStatementParser.DISABLE, 0); }
		public TerminalNode ENABLE() { return getToken(MySQLStatementParser.ENABLE, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public TerminalNode DISCARD() { return getToken(MySQLStatementParser.DISCARD, 0); }
		public TerminalNode IMPORT_() { return getToken(MySQLStatementParser.IMPORT_, 0); }
		public DropColumnContext dropColumn() {
			return getRuleContext(DropColumnContext.class,0);
		}
		public DropIndexDefContext dropIndexDef() {
			return getRuleContext(DropIndexDefContext.class,0);
		}
		public DropPrimaryKeyContext dropPrimaryKey() {
			return getRuleContext(DropPrimaryKeyContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(MySQLStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public FkSymbolContext fkSymbol() {
			return getRuleContext(FkSymbolContext.class,0);
		}
		public TerminalNode FORCE() { return getToken(MySQLStatementParser.FORCE, 0); }
		public TerminalNode LOCK() { return getToken(MySQLStatementParser.LOCK, 0); }
		public TerminalNode NONE() { return getToken(MySQLStatementParser.NONE, 0); }
		public TerminalNode SHARED() { return getToken(MySQLStatementParser.SHARED, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(MySQLStatementParser.EXCLUSIVE, 0); }
		public ModifyColumnContext modifyColumn() {
			return getRuleContext(ModifyColumnContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(MySQLStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public RenameIndexContext renameIndex() {
			return getRuleContext(RenameIndexContext.class,0);
		}
		public RenameTableContext renameTable() {
			return getRuleContext(RenameTableContext.class,0);
		}
		public TerminalNode VALIDATION() { return getToken(MySQLStatementParser.VALIDATION, 0); }
		public TerminalNode WITHOUT() { return getToken(MySQLStatementParser.WITHOUT, 0); }
		public List<TerminalNode> WITH() { return getTokens(MySQLStatementParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(MySQLStatementParser.WITH, i);
		}
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public PartitionDefinitionsContext partitionDefinitions() {
			return getRuleContext(PartitionDefinitionsContext.class,0);
		}
		public PartitionNamesContext partitionNames() {
			return getRuleContext(PartitionNamesContext.class,0);
		}
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode TRUNCATE() { return getToken(MySQLStatementParser.TRUNCATE, 0); }
		public TerminalNode COALESCE() { return getToken(MySQLStatementParser.COALESCE, 0); }
		public TerminalNode NUMBER() { return getToken(MySQLStatementParser.NUMBER, 0); }
		public TerminalNode REORGANIZE() { return getToken(MySQLStatementParser.REORGANIZE, 0); }
		public TerminalNode INTO() { return getToken(MySQLStatementParser.INTO, 0); }
		public TerminalNode EXCHANGE() { return getToken(MySQLStatementParser.EXCHANGE, 0); }
		public PartitionNameContext partitionName() {
			return getRuleContext(PartitionNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ANALYZE() { return getToken(MySQLStatementParser.ANALYZE, 0); }
		public TerminalNode CHECK() { return getToken(MySQLStatementParser.CHECK, 0); }
		public TerminalNode OPTIMIZE() { return getToken(MySQLStatementParser.OPTIMIZE, 0); }
		public TerminalNode REBUILD() { return getToken(MySQLStatementParser.REBUILD, 0); }
		public TerminalNode REPAIR() { return getToken(MySQLStatementParser.REPAIR, 0); }
		public TerminalNode REMOVE() { return getToken(MySQLStatementParser.REMOVE, 0); }
		public TerminalNode PARTITIONING() { return getToken(MySQLStatementParser.PARTITIONING, 0); }
		public TerminalNode UPGRADE() { return getToken(MySQLStatementParser.UPGRADE, 0); }
		public AlterSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSpecification; }
	}

	public final AlterSpecificationContext alterSpecification() throws RecognitionException {
		AlterSpecificationContext _localctx = new AlterSpecificationContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_alterSpecification);
		int _la;
		try {
			int _alt;
			setState(2479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2334);
				tableOptions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2335);
				addColumn();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2336);
				addIndex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2337);
				addConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2338);
				match(ALGORITHM);
				setState(2340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2339);
					match(EQ_);
					}
				}

				setState(2342);
				_la = _input.LA(1);
				if ( !(_la==COPY || _la==INPLACE || _la==DEFAULT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2343);
				match(ALTER);
				setState(2345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(2344);
					match(COLUMN);
					}
				}

				setState(2347);
				columnName();
				setState(2352);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SET:
					{
					setState(2348);
					match(SET);
					setState(2349);
					match(DEFAULT);
					}
					break;
				case DROP:
					{
					setState(2350);
					match(DROP);
					setState(2351);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2354);
				changeColumn();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2355);
					match(DEFAULT);
					}
				}

				setState(2358);
				characterSet();
				setState(2360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(2359);
					collateClause();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2362);
				match(CONVERT);
				setState(2363);
				match(TO);
				setState(2364);
				characterSet();
				setState(2366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(2365);
					collateClause();
					}
				}

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2368);
				_la = _input.LA(1);
				if ( !(_la==DISABLE || _la==ENABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2369);
				match(KEYS);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2370);
				_la = _input.LA(1);
				if ( !(_la==DISCARD || _la==IMPORT_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2371);
				match(TABLESPACE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2372);
				dropColumn();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2373);
				dropIndexDef();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2374);
				dropPrimaryKey();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2375);
				match(DROP);
				setState(2376);
				match(FOREIGN);
				setState(2377);
				match(KEY);
				setState(2378);
				fkSymbol();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2379);
				match(FORCE);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2380);
				match(LOCK);
				setState(2382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2381);
					match(EQ_);
					}
				}

				setState(2384);
				_la = _input.LA(1);
				if ( !(_la==EXCLUSIVE || _la==NONE || _la==SHARED || _la==DEFAULT) ) {
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
				setState(2385);
				modifyColumn();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2386);
				match(ORDER);
				setState(2387);
				match(BY);
				setState(2388);
				columnName();
				setState(2393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2389);
						match(COMMA);
						setState(2390);
						columnName();
						}
						} 
					}
					setState(2395);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
				}
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2396);
				renameIndex();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2397);
				renameTable();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2398);
				_la = _input.LA(1);
				if ( !(_la==WITHOUT || _la==WITH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2399);
				match(VALIDATION);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2400);
				match(ADD);
				setState(2401);
				match(PARTITION);
				setState(2402);
				partitionDefinitions();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2403);
				match(DROP);
				setState(2404);
				match(PARTITION);
				setState(2405);
				partitionNames();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2406);
				match(DISCARD);
				setState(2407);
				match(PARTITION);
				setState(2410);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(2408);
					partitionNames();
					}
					break;
				case ALL:
					{
					setState(2409);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2412);
				match(TABLESPACE);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2413);
				match(IMPORT_);
				setState(2414);
				match(PARTITION);
				setState(2417);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(2415);
					partitionNames();
					}
					break;
				case ALL:
					{
					setState(2416);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2419);
				match(TABLESPACE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2420);
				match(TRUNCATE);
				setState(2421);
				match(PARTITION);
				setState(2424);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(2422);
					partitionNames();
					}
					break;
				case ALL:
					{
					setState(2423);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2426);
				match(COALESCE);
				setState(2427);
				match(PARTITION);
				setState(2428);
				match(NUMBER);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2429);
				match(REORGANIZE);
				setState(2430);
				match(PARTITION);
				setState(2431);
				partitionNames();
				setState(2432);
				match(INTO);
				setState(2433);
				partitionDefinitions();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2435);
				match(EXCHANGE);
				setState(2436);
				match(PARTITION);
				setState(2437);
				partitionName();
				setState(2438);
				match(WITH);
				setState(2439);
				match(TABLE);
				setState(2440);
				tableName();
				setState(2443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITHOUT || _la==WITH) {
					{
					setState(2441);
					_la = _input.LA(1);
					if ( !(_la==WITHOUT || _la==WITH) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2442);
					match(VALIDATION);
					}
				}

				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2445);
				match(ANALYZE);
				setState(2446);
				match(PARTITION);
				setState(2449);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(2447);
					partitionNames();
					}
					break;
				case ALL:
					{
					setState(2448);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2451);
				match(CHECK);
				setState(2452);
				match(PARTITION);
				setState(2455);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(2453);
					partitionNames();
					}
					break;
				case ALL:
					{
					setState(2454);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2457);
				match(OPTIMIZE);
				setState(2458);
				match(PARTITION);
				setState(2461);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(2459);
					partitionNames();
					}
					break;
				case ALL:
					{
					setState(2460);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2463);
				match(REBUILD);
				setState(2464);
				match(PARTITION);
				setState(2467);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(2465);
					partitionNames();
					}
					break;
				case ALL:
					{
					setState(2466);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2469);
				match(REPAIR);
				setState(2470);
				match(PARTITION);
				setState(2473);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(2471);
					partitionNames();
					}
					break;
				case ALL:
					{
					setState(2472);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2475);
				match(REMOVE);
				setState(2476);
				match(PARTITIONING);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2477);
				match(UPGRADE);
				setState(2478);
				match(PARTITIONING);
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

	public static class SingleColumnContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public FirstOrAfterColumnContext firstOrAfterColumn() {
			return getRuleContext(FirstOrAfterColumnContext.class,0);
		}
		public SingleColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleColumn; }
	}

	public final SingleColumnContext singleColumn() throws RecognitionException {
		SingleColumnContext _localctx = new SingleColumnContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_singleColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2481);
			columnDefinition();
			setState(2483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2482);
				firstOrAfterColumn();
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

	public static class FirstOrAfterColumnContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(MySQLStatementParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(MySQLStatementParser.AFTER, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public FirstOrAfterColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstOrAfterColumn; }
	}

	public final FirstOrAfterColumnContext firstOrAfterColumn() throws RecognitionException {
		FirstOrAfterColumnContext _localctx = new FirstOrAfterColumnContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_firstOrAfterColumn);
		try {
			setState(2488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2485);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2486);
				match(AFTER);
				setState(2487);
				columnName();
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

	public static class MultiColumnContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ColumnDefinitionContext> columnDefinition() {
			return getRuleContexts(ColumnDefinitionContext.class);
		}
		public ColumnDefinitionContext columnDefinition(int i) {
			return getRuleContext(ColumnDefinitionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public MultiColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiColumn; }
	}

	public final MultiColumnContext multiColumn() throws RecognitionException {
		MultiColumnContext _localctx = new MultiColumnContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_multiColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2490);
			match(LP_);
			setState(2491);
			columnDefinition();
			setState(2496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2492);
				match(COMMA);
				setState(2493);
				columnDefinition();
				}
				}
				setState(2498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2499);
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

	public static class AddConstraintContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public ConstraintDefinitionContext constraintDefinition() {
			return getRuleContext(ConstraintDefinitionContext.class,0);
		}
		public AddConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraint; }
	}

	public final AddConstraintContext addConstraint() throws RecognitionException {
		AddConstraintContext _localctx = new AddConstraintContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_addConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2501);
			match(ADD);
			setState(2502);
			constraintDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddIndexContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public IndexDefinitionContext indexDefinition() {
			return getRuleContext(IndexDefinitionContext.class,0);
		}
		public AddIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addIndex; }
	}

	public final AddIndexContext addIndex() throws RecognitionException {
		AddIndexContext _localctx = new AddIndexContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_addIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2504);
			match(ADD);
			setState(2505);
			indexDefinition();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public SingleColumnContext singleColumn() {
			return getRuleContext(SingleColumnContext.class,0);
		}
		public MultiColumnContext multiColumn() {
			return getRuleContext(MultiColumnContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public AddColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumn; }
	}

	public final AddColumnContext addColumn() throws RecognitionException {
		AddColumnContext _localctx = new AddColumnContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_addColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2507);
			match(ADD);
			setState(2509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(2508);
				match(COLUMN);
				}
			}

			setState(2513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(2511);
				singleColumn();
				}
				break;
			case LP_:
				{
				setState(2512);
				multiColumn();
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

	public static class ChangeColumnContext extends ParserRuleContext {
		public ChangeColumnOpContext changeColumnOp() {
			return getRuleContext(ChangeColumnOpContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public FirstOrAfterColumnContext firstOrAfterColumn() {
			return getRuleContext(FirstOrAfterColumnContext.class,0);
		}
		public ChangeColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeColumn; }
	}

	public final ChangeColumnContext changeColumn() throws RecognitionException {
		ChangeColumnContext _localctx = new ChangeColumnContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_changeColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2515);
			changeColumnOp();
			setState(2516);
			columnName();
			setState(2517);
			columnDefinition();
			setState(2519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2518);
				firstOrAfterColumn();
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

	public static class ChangeColumnOpContext extends ParserRuleContext {
		public TerminalNode CHANGE() { return getToken(MySQLStatementParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public ChangeColumnOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeColumnOp; }
	}

	public final ChangeColumnOpContext changeColumnOp() throws RecognitionException {
		ChangeColumnOpContext _localctx = new ChangeColumnOpContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_changeColumnOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2521);
			match(CHANGE);
			setState(2523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(2522);
				match(COLUMN);
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

	public static class DropColumnContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public DropColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumn; }
	}

	public final DropColumnContext dropColumn() throws RecognitionException {
		DropColumnContext _localctx = new DropColumnContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_dropColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2525);
			match(DROP);
			setState(2527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(2526);
				match(COLUMN);
				}
			}

			setState(2529);
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

	public static class DropIndexDefContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public IndexAndKeyContext indexAndKey() {
			return getRuleContext(IndexAndKeyContext.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public DropIndexDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndexDef; }
	}

	public final DropIndexDefContext dropIndexDef() throws RecognitionException {
		DropIndexDefContext _localctx = new DropIndexDefContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_dropIndexDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2531);
			match(DROP);
			setState(2532);
			indexAndKey();
			setState(2533);
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

	public static class DropPrimaryKeyContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public DropPrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropPrimaryKey; }
	}

	public final DropPrimaryKeyContext dropPrimaryKey() throws RecognitionException {
		DropPrimaryKeyContext _localctx = new DropPrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_dropPrimaryKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2535);
			match(DROP);
			setState(2536);
			primaryKey();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FkSymbolContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public FkSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fkSymbol; }
	}

	public final FkSymbolContext fkSymbol() throws RecognitionException {
		FkSymbolContext _localctx = new FkSymbolContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_fkSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2538);
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

	public static class ModifyColumnContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(MySQLStatementParser.MODIFY, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public FirstOrAfterColumnContext firstOrAfterColumn() {
			return getRuleContext(FirstOrAfterColumnContext.class,0);
		}
		public ModifyColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumn; }
	}

	public final ModifyColumnContext modifyColumn() throws RecognitionException {
		ModifyColumnContext _localctx = new ModifyColumnContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_modifyColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2540);
			match(MODIFY);
			setState(2542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(2541);
				match(COLUMN);
				}
			}

			setState(2544);
			columnDefinition();
			setState(2546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2545);
				firstOrAfterColumn();
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

	public static class RenameIndexContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(MySQLStatementParser.RENAME, 0); }
		public IndexAndKeyContext indexAndKey() {
			return getRuleContext(IndexAndKeyContext.class,0);
		}
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public RenameIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameIndex; }
	}

	public final RenameIndexContext renameIndex() throws RecognitionException {
		RenameIndexContext _localctx = new RenameIndexContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_renameIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2548);
			match(RENAME);
			setState(2549);
			indexAndKey();
			setState(2550);
			indexName();
			setState(2551);
			match(TO);
			setState(2552);
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

	public static class RenameTableContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(MySQLStatementParser.RENAME, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public RenameTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameTable; }
	}

	public final RenameTableContext renameTable() throws RecognitionException {
		RenameTableContext _localctx = new RenameTableContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_renameTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2554);
			match(RENAME);
			setState(2556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==TO) {
				{
				setState(2555);
				_la = _input.LA(1);
				if ( !(_la==AS || _la==TO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2558);
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

	public static class PartitionNamesContext extends ParserRuleContext {
		public List<PartitionNameContext> partitionName() {
			return getRuleContexts(PartitionNameContext.class);
		}
		public PartitionNameContext partitionName(int i) {
			return getRuleContext(PartitionNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public PartitionNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionNames; }
	}

	public final PartitionNamesContext partitionNames() throws RecognitionException {
		PartitionNamesContext _localctx = new PartitionNamesContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_partitionNames);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2560);
			partitionName();
			setState(2565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2561);
					match(COMMA);
					setState(2562);
					partitionName();
					}
					} 
				}
				setState(2567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
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
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(MySQLStatementParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_dropTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2568);
			match(DROP);
			setState(2570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(2569);
				match(TEMPORARY);
				}
			}

			setState(2572);
			match(TABLE);
			setState(2575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2573);
				match(IF);
				setState(2574);
				match(EXISTS);
				}
			}

			setState(2577);
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
		public TerminalNode TRUNCATE() { return getToken(MySQLStatementParser.TRUNCATE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_truncateTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2579);
			match(TRUNCATE);
			setState(2581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(2580);
				match(TABLE);
				}
			}

			setState(2583);
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
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(MySQLStatementParser.TRANSACTION, 0); }
		public List<SetTransactionCharacteristicContext> setTransactionCharacteristic() {
			return getRuleContexts(SetTransactionCharacteristicContext.class);
		}
		public SetTransactionCharacteristicContext setTransactionCharacteristic(int i) {
			return getRuleContext(SetTransactionCharacteristicContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public TerminalNode GLOBAL() { return getToken(MySQLStatementParser.GLOBAL, 0); }
		public TerminalNode SESSION() { return getToken(MySQLStatementParser.SESSION, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_setTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2585);
			match(SET);
			setState(2587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL || _la==SESSION) {
				{
				setState(2586);
				_la = _input.LA(1);
				if ( !(_la==GLOBAL || _la==SESSION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2589);
			match(TRANSACTION);
			setState(2590);
			setTransactionCharacteristic();
			setState(2595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2591);
				match(COMMA);
				setState(2592);
				setTransactionCharacteristic();
				}
				}
				setState(2597);
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

	public static class SetTransactionCharacteristicContext extends ParserRuleContext {
		public TerminalNode ISOLATION() { return getToken(MySQLStatementParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(MySQLStatementParser.LEVEL, 0); }
		public LevelContext level() {
			return getRuleContext(LevelContext.class,0);
		}
		public AccessModeContext accessMode() {
			return getRuleContext(AccessModeContext.class,0);
		}
		public SetTransactionCharacteristicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransactionCharacteristic; }
	}

	public final SetTransactionCharacteristicContext setTransactionCharacteristic() throws RecognitionException {
		SetTransactionCharacteristicContext _localctx = new SetTransactionCharacteristicContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_setTransactionCharacteristic);
		try {
			setState(2602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISOLATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(2598);
				match(ISOLATION);
				setState(2599);
				match(LEVEL);
				setState(2600);
				level();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(2601);
				accessMode();
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

	public static class LevelContext extends ParserRuleContext {
		public TerminalNode REPEATABLE() { return getToken(MySQLStatementParser.REPEATABLE, 0); }
		public TerminalNode READ() { return getToken(MySQLStatementParser.READ, 0); }
		public TerminalNode COMMITTED() { return getToken(MySQLStatementParser.COMMITTED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(MySQLStatementParser.UNCOMMITTED, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(MySQLStatementParser.SERIALIZABLE, 0); }
		public LevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level; }
	}

	public final LevelContext level() throws RecognitionException {
		LevelContext _localctx = new LevelContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_level);
		int _la;
		try {
			setState(2609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEATABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2604);
				match(REPEATABLE);
				setState(2605);
				match(READ);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(2606);
				match(READ);
				setState(2607);
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
			case SERIALIZABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2608);
				match(SERIALIZABLE);
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

	public static class AccessModeContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(MySQLStatementParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(MySQLStatementParser.WRITE, 0); }
		public TerminalNode ONLY() { return getToken(MySQLStatementParser.ONLY, 0); }
		public AccessModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessMode; }
	}

	public final AccessModeContext accessMode() throws RecognitionException {
		AccessModeContext _localctx = new AccessModeContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_accessMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2611);
			match(READ);
			setState(2612);
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
		}
		catch (RecognitionException re) {
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
		public TerminalNode COMMIT() { return getToken(MySQLStatementParser.COMMIT, 0); }
		public TerminalNode WORK() { return getToken(MySQLStatementParser.WORK, 0); }
		public TerminalNode AND() { return getToken(MySQLStatementParser.AND, 0); }
		public TerminalNode CHAIN() { return getToken(MySQLStatementParser.CHAIN, 0); }
		public TerminalNode RELEASE() { return getToken(MySQLStatementParser.RELEASE, 0); }
		public List<TerminalNode> NO() { return getTokens(MySQLStatementParser.NO); }
		public TerminalNode NO(int i) {
			return getToken(MySQLStatementParser.NO, i);
		}
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_commit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2614);
			match(COMMIT);
			setState(2616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORK) {
				{
				setState(2615);
				match(WORK);
				}
			}

			setState(2623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(2618);
				match(AND);
				setState(2620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(2619);
					match(NO);
					}
				}

				setState(2622);
				match(CHAIN);
				}
			}

			setState(2629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RELEASE || _la==NO) {
				{
				setState(2626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(2625);
					match(NO);
					}
				}

				setState(2628);
				match(RELEASE);
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

	public static class BeginTransactionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(MySQLStatementParser.BEGIN, 0); }
		public TerminalNode WORK() { return getToken(MySQLStatementParser.WORK, 0); }
		public StartTransactionContext startTransaction() {
			return getRuleContext(StartTransactionContext.class,0);
		}
		public BeginTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginTransaction; }
	}

	public final BeginTransactionContext beginTransaction() throws RecognitionException {
		BeginTransactionContext _localctx = new BeginTransactionContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_beginTransaction);
		int _la;
		try {
			setState(2636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2631);
				match(BEGIN);
				setState(2633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(2632);
					match(WORK);
					}
				}

				}
				break;
			case START:
				enterOuterAlt(_localctx, 2);
				{
				setState(2635);
				startTransaction();
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

	public static class StartTransactionContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(MySQLStatementParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(MySQLStatementParser.TRANSACTION, 0); }
		public List<StartTransactionCharacteristicContext> startTransactionCharacteristic() {
			return getRuleContexts(StartTransactionCharacteristicContext.class);
		}
		public StartTransactionCharacteristicContext startTransactionCharacteristic(int i) {
			return getRuleContext(StartTransactionCharacteristicContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public StartTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startTransaction; }
	}

	public final StartTransactionContext startTransaction() throws RecognitionException {
		StartTransactionContext _localctx = new StartTransactionContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_startTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2638);
			match(START);
			setState(2639);
			match(TRANSACTION);
			setState(2648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH || _la==READ) {
				{
				setState(2640);
				startTransactionCharacteristic();
				setState(2645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2641);
					match(COMMA);
					setState(2642);
					startTransactionCharacteristic();
					}
					}
					setState(2647);
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

	public static class StartTransactionCharacteristicContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public TerminalNode CONSISTENT() { return getToken(MySQLStatementParser.CONSISTENT, 0); }
		public TerminalNode SNAPSHOT() { return getToken(MySQLStatementParser.SNAPSHOT, 0); }
		public TerminalNode READ() { return getToken(MySQLStatementParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(MySQLStatementParser.WRITE, 0); }
		public TerminalNode ONLY() { return getToken(MySQLStatementParser.ONLY, 0); }
		public StartTransactionCharacteristicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startTransactionCharacteristic; }
	}

	public final StartTransactionCharacteristicContext startTransactionCharacteristic() throws RecognitionException {
		StartTransactionCharacteristicContext _localctx = new StartTransactionCharacteristicContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_startTransactionCharacteristic);
		int _la;
		try {
			setState(2655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(2650);
				match(WITH);
				setState(2651);
				match(CONSISTENT);
				setState(2652);
				match(SNAPSHOT);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(2653);
				match(READ);
				setState(2654);
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

	public static class RollbackContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(MySQLStatementParser.ROLLBACK, 0); }
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public TerminalNode WORK() { return getToken(MySQLStatementParser.WORK, 0); }
		public TerminalNode AND() { return getToken(MySQLStatementParser.AND, 0); }
		public TerminalNode CHAIN() { return getToken(MySQLStatementParser.CHAIN, 0); }
		public TerminalNode RELEASE() { return getToken(MySQLStatementParser.RELEASE, 0); }
		public TerminalNode SAVEPOINT() { return getToken(MySQLStatementParser.SAVEPOINT, 0); }
		public List<TerminalNode> NO() { return getTokens(MySQLStatementParser.NO); }
		public TerminalNode NO(int i) {
			return getToken(MySQLStatementParser.NO, i);
		}
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_rollback);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2657);
			match(ROLLBACK);
			setState(2659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORK) {
				{
				setState(2658);
				match(WORK);
				}
			}

			setState(2679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case RELEASE:
			case SEMI_:
			case AND:
			case NO:
				{
				setState(2666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(2661);
					match(AND);
					setState(2663);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(2662);
						match(NO);
						}
					}

					setState(2665);
					match(CHAIN);
					}
				}

				setState(2672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RELEASE || _la==NO) {
					{
					setState(2669);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(2668);
						match(NO);
						}
					}

					setState(2671);
					match(RELEASE);
					}
				}

				}
				break;
			case TO:
				{
				setState(2674);
				match(TO);
				setState(2676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SAVEPOINT) {
					{
					setState(2675);
					match(SAVEPOINT);
					}
				}

				setState(2678);
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

	public static class SavepointContext extends ParserRuleContext {
		public TerminalNode SAVEPOINT() { return getToken(MySQLStatementParser.SAVEPOINT, 0); }
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_savepoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2681);
			match(SAVEPOINT);
			setState(2682);
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

	public static class SetAutoCommitContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode AUTOCOMMIT() { return getToken(MySQLStatementParser.AUTOCOMMIT, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public AutoCommitValueContext autoCommitValue() {
			return getRuleContext(AutoCommitValueContext.class,0);
		}
		public SetAutoCommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAutoCommit; }
	}

	public final SetAutoCommitContext setAutoCommit() throws RecognitionException {
		SetAutoCommitContext _localctx = new SetAutoCommitContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_setAutoCommit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2684);
			match(SET);
			setState(2685);
			match(AUTOCOMMIT);
			setState(2686);
			match(EQ_);
			setState(2687);
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
		public TerminalNode NUMBER() { return getToken(MySQLStatementParser.NUMBER, 0); }
		public AutoCommitValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoCommitValue; }
	}

	public final AutoCommitValueContext autoCommitValue() throws RecognitionException {
		AutoCommitValueContext _localctx = new AutoCommitValueContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_autoCommitValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2689);
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

	public static class GrantContext extends ParserRuleContext {
		public List<TerminalNode> GRANT() { return getTokens(MySQLStatementParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(MySQLStatementParser.GRANT, i);
		}
		public List<PrivTypeContext> privType() {
			return getRuleContexts(PrivTypeContext.class);
		}
		public PrivTypeContext privType(int i) {
			return getRuleContext(PrivTypeContext.class,i);
		}
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public PrivLevelContext privLevel() {
			return getRuleContext(PrivLevelContext.class,0);
		}
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public UserOrRolesContext userOrRoles() {
			return getRuleContext(UserOrRolesContext.class,0);
		}
		public List<ColumnListContext> columnList() {
			return getRuleContexts(ColumnListContext.class);
		}
		public ColumnListContext columnList(int i) {
			return getRuleContext(ColumnListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(MySQLStatementParser.OPTION, 0); }
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_grant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2691);
			match(GRANT);
			setState(2692);
			privType();
			setState(2694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2693);
				columnList();
				}
			}

			setState(2703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2696);
				match(COMMA);
				setState(2697);
				privType();
				setState(2699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2698);
					columnList();
					}
				}

				}
				}
				setState(2705);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2706);
			match(ON);
			setState(2708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROCEDURE || _la==FUNCTION || _la==TABLE) {
				{
				setState(2707);
				objectType();
				}
			}

			setState(2710);
			privLevel();
			setState(2711);
			match(TO);
			setState(2712);
			userOrRoles();
			setState(2716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2713);
				match(WITH);
				setState(2714);
				match(GRANT);
				setState(2715);
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
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(MySQLStatementParser.PRIVILEGES, 0); }
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode ROUTINE() { return getToken(MySQLStatementParser.ROUTINE, 0); }
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(MySQLStatementParser.TEMPORARY, 0); }
		public TerminalNode TABLES() { return getToken(MySQLStatementParser.TABLES, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public TerminalNode VIEW() { return getToken(MySQLStatementParser.VIEW, 0); }
		public TerminalNode DELETE() { return getToken(MySQLStatementParser.DELETE, 0); }
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode EVENT() { return getToken(MySQLStatementParser.EVENT, 0); }
		public TerminalNode EXECUTE() { return getToken(MySQLStatementParser.EXECUTE, 0); }
		public TerminalNode FILE() { return getToken(MySQLStatementParser.FILE, 0); }
		public TerminalNode GRANT() { return getToken(MySQLStatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(MySQLStatementParser.OPTION, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode INSERT() { return getToken(MySQLStatementParser.INSERT, 0); }
		public TerminalNode LOCK() { return getToken(MySQLStatementParser.LOCK, 0); }
		public TerminalNode PROCESS() { return getToken(MySQLStatementParser.PROCESS, 0); }
		public TerminalNode PROXY() { return getToken(MySQLStatementParser.PROXY, 0); }
		public TerminalNode REFERENCES() { return getToken(MySQLStatementParser.REFERENCES, 0); }
		public TerminalNode RELOAD() { return getToken(MySQLStatementParser.RELOAD, 0); }
		public TerminalNode REPLICATION() { return getToken(MySQLStatementParser.REPLICATION, 0); }
		public TerminalNode CLIENT() { return getToken(MySQLStatementParser.CLIENT, 0); }
		public TerminalNode SLAVE() { return getToken(MySQLStatementParser.SLAVE, 0); }
		public TerminalNode SELECT() { return getToken(MySQLStatementParser.SELECT, 0); }
		public TerminalNode SHOW() { return getToken(MySQLStatementParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(MySQLStatementParser.DATABASES, 0); }
		public TerminalNode SHUTDOWN() { return getToken(MySQLStatementParser.SHUTDOWN, 0); }
		public TerminalNode SUPER() { return getToken(MySQLStatementParser.SUPER, 0); }
		public TerminalNode TRIGGER() { return getToken(MySQLStatementParser.TRIGGER, 0); }
		public TerminalNode UPDATE() { return getToken(MySQLStatementParser.UPDATE, 0); }
		public TerminalNode USAGE() { return getToken(MySQLStatementParser.USAGE, 0); }
		public TerminalNode AUDIT_ADMIN() { return getToken(MySQLStatementParser.AUDIT_ADMIN, 0); }
		public TerminalNode BINLOG_ADMIN() { return getToken(MySQLStatementParser.BINLOG_ADMIN, 0); }
		public TerminalNode CONNECTION_ADMIN() { return getToken(MySQLStatementParser.CONNECTION_ADMIN, 0); }
		public TerminalNode ENCRYPTION_KEY_ADMIN() { return getToken(MySQLStatementParser.ENCRYPTION_KEY_ADMIN, 0); }
		public TerminalNode FIREWALL_ADMIN() { return getToken(MySQLStatementParser.FIREWALL_ADMIN, 0); }
		public TerminalNode FIREWALL_USER() { return getToken(MySQLStatementParser.FIREWALL_USER, 0); }
		public TerminalNode GROUP_REPLICATION_ADMIN() { return getToken(MySQLStatementParser.GROUP_REPLICATION_ADMIN, 0); }
		public TerminalNode REPLICATION_SLAVE_ADMIN() { return getToken(MySQLStatementParser.REPLICATION_SLAVE_ADMIN, 0); }
		public TerminalNode ROLE_ADMIN() { return getToken(MySQLStatementParser.ROLE_ADMIN, 0); }
		public TerminalNode SET_USER_ID() { return getToken(MySQLStatementParser.SET_USER_ID, 0); }
		public TerminalNode SYSTEM_VARIABLES_ADMIN() { return getToken(MySQLStatementParser.SYSTEM_VARIABLES_ADMIN, 0); }
		public TerminalNode VERSION_TOKEN_ADMIN() { return getToken(MySQLStatementParser.VERSION_TOKEN_ADMIN, 0); }
		public PrivTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privType; }
	}

	public final PrivTypeContext privType() throws RecognitionException {
		PrivTypeContext _localctx = new PrivTypeContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_privType);
		int _la;
		try {
			setState(2779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2718);
				match(ALL);
				setState(2720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(2719);
					match(PRIVILEGES);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2722);
				match(ALTER);
				setState(2724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROUTINE) {
					{
					setState(2723);
					match(ROUTINE);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2726);
				match(CREATE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2727);
				match(CREATE);
				setState(2728);
				match(ROUTINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2729);
				match(CREATE);
				setState(2730);
				match(TABLESPACE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2731);
				match(CREATE);
				setState(2732);
				match(TEMPORARY);
				setState(2733);
				match(TABLES);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2734);
				match(CREATE);
				setState(2735);
				match(USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2736);
				match(CREATE);
				setState(2737);
				match(VIEW);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2738);
				match(DELETE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2739);
				match(DROP);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2740);
				match(EVENT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2741);
				match(EXECUTE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2742);
				match(FILE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2743);
				match(GRANT);
				setState(2744);
				match(OPTION);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2745);
				match(INDEX);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2746);
				match(INSERT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2747);
				match(LOCK);
				setState(2748);
				match(TABLES);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2749);
				match(PROCESS);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2750);
				match(PROXY);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2751);
				match(REFERENCES);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2752);
				match(RELOAD);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2753);
				match(REPLICATION);
				setState(2754);
				match(CLIENT);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2755);
				match(REPLICATION);
				setState(2756);
				match(SLAVE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2757);
				match(SELECT);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2758);
				match(SHOW);
				setState(2759);
				match(DATABASES);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2760);
				match(SHOW);
				setState(2761);
				match(VIEW);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2762);
				match(SHUTDOWN);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2763);
				match(SUPER);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2764);
				match(TRIGGER);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2765);
				match(UPDATE);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2766);
				match(USAGE);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2767);
				match(AUDIT_ADMIN);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2768);
				match(BINLOG_ADMIN);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2769);
				match(CONNECTION_ADMIN);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2770);
				match(ENCRYPTION_KEY_ADMIN);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2771);
				match(FIREWALL_ADMIN);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2772);
				match(FIREWALL_USER);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2773);
				match(GROUP_REPLICATION_ADMIN);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2774);
				match(REPLICATION_SLAVE_ADMIN);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2775);
				match(ROLE_ADMIN);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2776);
				match(SET_USER_ID);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2777);
				match(SYSTEM_VARIABLES_ADMIN);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2778);
				match(VERSION_TOKEN_ADMIN);
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

	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TerminalNode FUNCTION() { return getToken(MySQLStatementParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(MySQLStatementParser.PROCEDURE, 0); }
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2781);
			_la = _input.LA(1);
			if ( !(_la==PROCEDURE || _la==FUNCTION || _la==TABLE) ) {
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

	public static class PrivLevelContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(MySQLStatementParser.ASTERISK, 0); }
		public TerminalNode DOT_ASTERISK() { return getToken(MySQLStatementParser.DOT_ASTERISK, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MySQLStatementParser.DOT, 0); }
		public RoutineNameContext routineName() {
			return getRuleContext(RoutineNameContext.class,0);
		}
		public PrivLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privLevel; }
	}

	public final PrivLevelContext privLevel() throws RecognitionException {
		PrivLevelContext _localctx = new PrivLevelContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_privLevel);
		try {
			setState(2790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2783);
				match(ASTERISK);
				setState(2784);
				match(DOT_ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2785);
				tableName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2786);
				schemaName();
				setState(2787);
				match(DOT);
				setState(2788);
				routineName();
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

	public static class HostContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MySQLStatementParser.STRING, 0); }
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public TerminalNode MOD_() { return getToken(MySQLStatementParser.MOD_, 0); }
		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host; }
	}

	public final HostContext host() throws RecognitionException {
		HostContext _localctx = new HostContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_host);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2792);
			_la = _input.LA(1);
			if ( !(_la==MOD_ || _la==ID || _la==STRING) ) {
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

	public static class UserContext extends ParserRuleContext {
		public UserNameContext userName() {
			return getRuleContext(UserNameContext.class,0);
		}
		public TerminalNode AT_() { return getToken(MySQLStatementParser.AT_, 0); }
		public HostContext host() {
			return getRuleContext(HostContext.class,0);
		}
		public UserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user; }
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_user);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2794);
			userName();
			setState(2797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_) {
				{
				setState(2795);
				match(AT_);
				setState(2796);
				host();
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

	public static class UsersContext extends ParserRuleContext {
		public List<UserContext> user() {
			return getRuleContexts(UserContext.class);
		}
		public UserContext user(int i) {
			return getRuleContext(UserContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public UsersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_users; }
	}

	public final UsersContext users() throws RecognitionException {
		UsersContext _localctx = new UsersContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_users);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2799);
			user();
			setState(2804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2800);
				match(COMMA);
				setState(2801);
				user();
				}
				}
				setState(2806);
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

	public static class RoleContext extends ParserRuleContext {
		public RoleNameContext roleName() {
			return getRuleContext(RoleNameContext.class,0);
		}
		public TerminalNode AT_() { return getToken(MySQLStatementParser.AT_, 0); }
		public HostContext host() {
			return getRuleContext(HostContext.class,0);
		}
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_role);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2807);
			roleName();
			setState(2810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_) {
				{
				setState(2808);
				match(AT_);
				setState(2809);
				host();
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

	public static class RolesContext extends ParserRuleContext {
		public List<RoleContext> role() {
			return getRuleContexts(RoleContext.class);
		}
		public RoleContext role(int i) {
			return getRuleContext(RoleContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public RolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roles; }
	}

	public final RolesContext roles() throws RecognitionException {
		RolesContext _localctx = new RolesContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_roles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2812);
			role();
			setState(2817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2813);
				match(COMMA);
				setState(2814);
				role();
				}
				}
				setState(2819);
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

	public static class UserOrRoleContext extends ParserRuleContext {
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public UserOrRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userOrRole; }
	}

	public final UserOrRoleContext userOrRole() throws RecognitionException {
		UserOrRoleContext _localctx = new UserOrRoleContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_userOrRole);
		try {
			setState(2822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2820);
				user();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2821);
				role();
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

	public static class UserOrRolesContext extends ParserRuleContext {
		public List<UserOrRoleContext> userOrRole() {
			return getRuleContexts(UserOrRoleContext.class);
		}
		public UserOrRoleContext userOrRole(int i) {
			return getRuleContext(UserOrRoleContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public UserOrRolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userOrRoles; }
	}

	public final UserOrRolesContext userOrRoles() throws RecognitionException {
		UserOrRolesContext _localctx = new UserOrRolesContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_userOrRoles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2824);
			userOrRole();
			setState(2829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2825);
				match(COMMA);
				setState(2826);
				userOrRole();
				}
				}
				setState(2831);
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

	public static class GrantProxyContext extends ParserRuleContext {
		public List<TerminalNode> GRANT() { return getTokens(MySQLStatementParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(MySQLStatementParser.GRANT, i);
		}
		public TerminalNode PROXY() { return getToken(MySQLStatementParser.PROXY, 0); }
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public UserOrRoleContext userOrRole() {
			return getRuleContext(UserOrRoleContext.class,0);
		}
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public UserOrRolesContext userOrRoles() {
			return getRuleContext(UserOrRolesContext.class,0);
		}
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(MySQLStatementParser.OPTION, 0); }
		public GrantProxyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantProxy; }
	}

	public final GrantProxyContext grantProxy() throws RecognitionException {
		GrantProxyContext _localctx = new GrantProxyContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_grantProxy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2832);
			match(GRANT);
			setState(2833);
			match(PROXY);
			setState(2834);
			match(ON);
			setState(2835);
			userOrRole();
			setState(2836);
			match(TO);
			setState(2837);
			userOrRoles();
			setState(2841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2838);
				match(WITH);
				setState(2839);
				match(GRANT);
				setState(2840);
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

	public static class GrantRoleContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(MySQLStatementParser.GRANT, 0); }
		public RoleNamesContext roleNames() {
			return getRuleContext(RoleNamesContext.class,0);
		}
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public UserOrRolesContext userOrRoles() {
			return getRuleContext(UserOrRolesContext.class,0);
		}
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(MySQLStatementParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(MySQLStatementParser.OPTION, 0); }
		public GrantRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantRole; }
	}

	public final GrantRoleContext grantRole() throws RecognitionException {
		GrantRoleContext _localctx = new GrantRoleContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_grantRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2843);
			match(GRANT);
			setState(2844);
			roleNames();
			setState(2845);
			match(TO);
			setState(2846);
			userOrRoles();
			setState(2850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2847);
				match(WITH);
				setState(2848);
				match(ADMIN);
				setState(2849);
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
		public TerminalNode REVOKE() { return getToken(MySQLStatementParser.REVOKE, 0); }
		public List<PrivTypeContext> privType() {
			return getRuleContexts(PrivTypeContext.class);
		}
		public PrivTypeContext privType(int i) {
			return getRuleContext(PrivTypeContext.class,i);
		}
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public PrivLevelContext privLevel() {
			return getRuleContext(PrivLevelContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public UserOrRolesContext userOrRoles() {
			return getRuleContext(UserOrRolesContext.class,0);
		}
		public List<ColumnListContext> columnList() {
			return getRuleContexts(ColumnListContext.class);
		}
		public ColumnListContext columnList(int i) {
			return getRuleContext(ColumnListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_revoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2852);
			match(REVOKE);
			setState(2853);
			privType();
			setState(2855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2854);
				columnList();
				}
			}

			setState(2864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2857);
				match(COMMA);
				setState(2858);
				privType();
				setState(2860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2859);
					columnList();
					}
				}

				}
				}
				setState(2866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2867);
			match(ON);
			setState(2869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROCEDURE || _la==FUNCTION || _la==TABLE) {
				{
				setState(2868);
				objectType();
				}
			}

			setState(2871);
			privLevel();
			setState(2872);
			match(FROM);
			setState(2873);
			userOrRoles();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevokeAllContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(MySQLStatementParser.REVOKE, 0); }
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode COMMA() { return getToken(MySQLStatementParser.COMMA, 0); }
		public TerminalNode GRANT() { return getToken(MySQLStatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(MySQLStatementParser.OPTION, 0); }
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public UserOrRolesContext userOrRoles() {
			return getRuleContext(UserOrRolesContext.class,0);
		}
		public TerminalNode PRIVILEGES() { return getToken(MySQLStatementParser.PRIVILEGES, 0); }
		public RevokeAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revokeAll; }
	}

	public final RevokeAllContext revokeAll() throws RecognitionException {
		RevokeAllContext _localctx = new RevokeAllContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_revokeAll);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2875);
			match(REVOKE);
			setState(2876);
			match(ALL);
			setState(2878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVILEGES) {
				{
				setState(2877);
				match(PRIVILEGES);
				}
			}

			setState(2880);
			match(COMMA);
			setState(2881);
			match(GRANT);
			setState(2882);
			match(OPTION);
			setState(2883);
			match(FROM);
			setState(2884);
			userOrRoles();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevokeProxyContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(MySQLStatementParser.REVOKE, 0); }
		public TerminalNode PROXY() { return getToken(MySQLStatementParser.PROXY, 0); }
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public UserOrRoleContext userOrRole() {
			return getRuleContext(UserOrRoleContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public UserOrRolesContext userOrRoles() {
			return getRuleContext(UserOrRolesContext.class,0);
		}
		public RevokeProxyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revokeProxy; }
	}

	public final RevokeProxyContext revokeProxy() throws RecognitionException {
		RevokeProxyContext _localctx = new RevokeProxyContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_revokeProxy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2886);
			match(REVOKE);
			setState(2887);
			match(PROXY);
			setState(2888);
			match(ON);
			setState(2889);
			userOrRole();
			setState(2890);
			match(FROM);
			setState(2891);
			userOrRoles();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode REVOKE() { return getToken(MySQLStatementParser.REVOKE, 0); }
		public RoleNamesContext roleNames() {
			return getRuleContext(RoleNamesContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public UserOrRolesContext userOrRoles() {
			return getRuleContext(UserOrRolesContext.class,0);
		}
		public RevokeRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revokeRole; }
	}

	public final RevokeRoleContext revokeRole() throws RecognitionException {
		RevokeRoleContext _localctx = new RevokeRoleContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_revokeRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2893);
			match(REVOKE);
			setState(2894);
			roleNames();
			setState(2895);
			match(FROM);
			setState(2896);
			userOrRoles();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public UserAuthOptionsContext userAuthOptions() {
			return getRuleContext(UserAuthOptionsContext.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public TerminalNode ROLE() { return getToken(MySQLStatementParser.ROLE, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode REQUIRE() { return getToken(MySQLStatementParser.REQUIRE, 0); }
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public List<ResourceOptionContext> resourceOption() {
			return getRuleContexts(ResourceOptionContext.class);
		}
		public ResourceOptionContext resourceOption(int i) {
			return getRuleContext(ResourceOptionContext.class,i);
		}
		public List<PasswordOptionContext> passwordOption() {
			return getRuleContexts(PasswordOptionContext.class);
		}
		public PasswordOptionContext passwordOption(int i) {
			return getRuleContext(PasswordOptionContext.class,i);
		}
		public List<LockOptionContext> lockOption() {
			return getRuleContexts(LockOptionContext.class);
		}
		public LockOptionContext lockOption(int i) {
			return getRuleContext(LockOptionContext.class,i);
		}
		public TerminalNode NONE() { return getToken(MySQLStatementParser.NONE, 0); }
		public List<TlsOptionContext> tlsOption() {
			return getRuleContexts(TlsOptionContext.class);
		}
		public TlsOptionContext tlsOption(int i) {
			return getRuleContext(TlsOptionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public List<TerminalNode> AND() { return getTokens(MySQLStatementParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(MySQLStatementParser.AND, i);
		}
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_createUser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2898);
			match(CREATE);
			setState(2899);
			match(USER);
			setState(2903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2900);
				match(IF);
				setState(2901);
				match(NOT);
				setState(2902);
				match(EXISTS);
				}
			}

			setState(2905);
			userAuthOptions();
			setState(2909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(2906);
				match(DEFAULT);
				setState(2907);
				match(ROLE);
				setState(2908);
				roles();
				}
			}

			setState(2926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REQUIRE) {
				{
				setState(2911);
				match(REQUIRE);
				setState(2924);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NONE:
					{
					setState(2912);
					match(NONE);
					}
					break;
				case CIPHER:
				case ISSUER:
				case SSL:
				case SUBJECT:
				case ID:
					{
					setState(2913);
					tlsOption();
					setState(2921);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2914);
						match(COMMA);
						setState(2916);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AND) {
							{
							setState(2915);
							match(AND);
							}
						}

						setState(2918);
						tlsOption();
						}
						}
						setState(2923);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(2937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2928);
				match(WITH);
				setState(2929);
				resourceOption();
				setState(2934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2930);
					match(COMMA);
					setState(2931);
					resourceOption();
					}
					}
					setState(2936);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACCOUNT || _la==PASSWORD) {
				{
				setState(2941);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PASSWORD:
					{
					setState(2939);
					passwordOption();
					}
					break;
				case ACCOUNT:
					{
					setState(2940);
					lockOption();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2945);
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

	public static class AuthOptionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIED() { return getToken(MySQLStatementParser.IDENTIFIED, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public List<TerminalNode> STRING() { return getTokens(MySQLStatementParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MySQLStatementParser.STRING, i);
		}
		public TerminalNode REPLACE() { return getToken(MySQLStatementParser.REPLACE, 0); }
		public TerminalNode RETAIN() { return getToken(MySQLStatementParser.RETAIN, 0); }
		public TerminalNode CURRENT() { return getToken(MySQLStatementParser.CURRENT, 0); }
		public TerminalNode PASSWORD() { return getToken(MySQLStatementParser.PASSWORD, 0); }
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public AuthPluginContext authPlugin() {
			return getRuleContext(AuthPluginContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public TerminalNode DISCARD() { return getToken(MySQLStatementParser.DISCARD, 0); }
		public TerminalNode OLD() { return getToken(MySQLStatementParser.OLD, 0); }
		public AuthOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authOption; }
	}

	public final AuthOptionContext authOption() throws RecognitionException {
		AuthOptionContext _localctx = new AuthOptionContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_authOption);
		int _la;
		try {
			setState(2984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2946);
				match(IDENTIFIED);
				setState(2947);
				match(BY);
				setState(2948);
				match(STRING);
				setState(2951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REPLACE) {
					{
					setState(2949);
					match(REPLACE);
					setState(2950);
					match(STRING);
					}
				}

				setState(2956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETAIN) {
					{
					setState(2953);
					match(RETAIN);
					setState(2954);
					match(CURRENT);
					setState(2955);
					match(PASSWORD);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2958);
				match(IDENTIFIED);
				setState(2959);
				match(WITH);
				setState(2960);
				authPlugin();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2961);
				match(IDENTIFIED);
				setState(2962);
				match(WITH);
				setState(2963);
				authPlugin();
				setState(2964);
				match(BY);
				setState(2965);
				match(STRING);
				setState(2968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REPLACE) {
					{
					setState(2966);
					match(REPLACE);
					setState(2967);
					match(STRING);
					}
				}

				setState(2973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETAIN) {
					{
					setState(2970);
					match(RETAIN);
					setState(2971);
					match(CURRENT);
					setState(2972);
					match(PASSWORD);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2975);
				match(IDENTIFIED);
				setState(2976);
				match(WITH);
				setState(2977);
				authPlugin();
				setState(2978);
				match(AS);
				setState(2979);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2981);
				match(DISCARD);
				setState(2982);
				match(OLD);
				setState(2983);
				match(PASSWORD);
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

	public static class UserAuthOptionContext extends ParserRuleContext {
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public AuthOptionContext authOption() {
			return getRuleContext(AuthOptionContext.class,0);
		}
		public UserAuthOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userAuthOption; }
	}

	public final UserAuthOptionContext userAuthOption() throws RecognitionException {
		UserAuthOptionContext _localctx = new UserAuthOptionContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_userAuthOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2986);
			user();
			setState(2988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISCARD || _la==IDENTIFIED) {
				{
				setState(2987);
				authOption();
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

	public static class UserAuthOptionsContext extends ParserRuleContext {
		public List<UserAuthOptionContext> userAuthOption() {
			return getRuleContexts(UserAuthOptionContext.class);
		}
		public UserAuthOptionContext userAuthOption(int i) {
			return getRuleContext(UserAuthOptionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public UserAuthOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userAuthOptions; }
	}

	public final UserAuthOptionsContext userAuthOptions() throws RecognitionException {
		UserAuthOptionsContext _localctx = new UserAuthOptionsContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_userAuthOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2990);
			userAuthOption();
			setState(2995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2991);
				match(COMMA);
				setState(2992);
				userAuthOption();
				}
				}
				setState(2997);
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

	public static class AuthPluginContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public AuthPluginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authPlugin; }
	}

	public final AuthPluginContext authPlugin() throws RecognitionException {
		AuthPluginContext _localctx = new AuthPluginContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_authPlugin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2998);
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

	public static class TlsOptionContext extends ParserRuleContext {
		public TerminalNode SSL() { return getToken(MySQLStatementParser.SSL, 0); }
		public TerminalNode CIPHER() { return getToken(MySQLStatementParser.CIPHER, 0); }
		public TerminalNode STRING() { return getToken(MySQLStatementParser.STRING, 0); }
		public TerminalNode ISSUER() { return getToken(MySQLStatementParser.ISSUER, 0); }
		public TerminalNode SUBJECT() { return getToken(MySQLStatementParser.SUBJECT, 0); }
		public TerminalNode ID() { return getToken(MySQLStatementParser.ID, 0); }
		public TlsOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tlsOption; }
	}

	public final TlsOptionContext tlsOption() throws RecognitionException {
		TlsOptionContext _localctx = new TlsOptionContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_tlsOption);
		try {
			setState(3008);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SSL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3000);
				match(SSL);
				}
				break;
			case CIPHER:
				enterOuterAlt(_localctx, 2);
				{
				setState(3001);
				match(CIPHER);
				setState(3002);
				match(STRING);
				}
				break;
			case ISSUER:
				enterOuterAlt(_localctx, 3);
				{
				setState(3003);
				match(ISSUER);
				setState(3004);
				match(STRING);
				}
				break;
			case SUBJECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(3005);
				match(SUBJECT);
				setState(3006);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(3007);
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

	public static class ResourceOptionContext extends ParserRuleContext {
		public TerminalNode MAX_QUERIES_PER_HOUR() { return getToken(MySQLStatementParser.MAX_QUERIES_PER_HOUR, 0); }
		public TerminalNode NUMBER() { return getToken(MySQLStatementParser.NUMBER, 0); }
		public TerminalNode MAX_UPDATES_PER_HOUR() { return getToken(MySQLStatementParser.MAX_UPDATES_PER_HOUR, 0); }
		public TerminalNode MAX_CONNECTIONS_PER_HOUR() { return getToken(MySQLStatementParser.MAX_CONNECTIONS_PER_HOUR, 0); }
		public TerminalNode MAX_USER_CONNECTIONS() { return getToken(MySQLStatementParser.MAX_USER_CONNECTIONS, 0); }
		public ResourceOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceOption; }
	}

	public final ResourceOptionContext resourceOption() throws RecognitionException {
		ResourceOptionContext _localctx = new ResourceOptionContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_resourceOption);
		try {
			setState(3018);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAX_QUERIES_PER_HOUR:
				enterOuterAlt(_localctx, 1);
				{
				setState(3010);
				match(MAX_QUERIES_PER_HOUR);
				setState(3011);
				match(NUMBER);
				}
				break;
			case MAX_UPDATES_PER_HOUR:
				enterOuterAlt(_localctx, 2);
				{
				setState(3012);
				match(MAX_UPDATES_PER_HOUR);
				setState(3013);
				match(NUMBER);
				}
				break;
			case MAX_CONNECTIONS_PER_HOUR:
				enterOuterAlt(_localctx, 3);
				{
				setState(3014);
				match(MAX_CONNECTIONS_PER_HOUR);
				setState(3015);
				match(NUMBER);
				}
				break;
			case MAX_USER_CONNECTIONS:
				enterOuterAlt(_localctx, 4);
				{
				setState(3016);
				match(MAX_USER_CONNECTIONS);
				setState(3017);
				match(NUMBER);
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
		public TerminalNode PASSWORD() { return getToken(MySQLStatementParser.PASSWORD, 0); }
		public TerminalNode EXPIRE() { return getToken(MySQLStatementParser.EXPIRE, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public TerminalNode NEVER() { return getToken(MySQLStatementParser.NEVER, 0); }
		public TerminalNode INTERVAL() { return getToken(MySQLStatementParser.INTERVAL, 0); }
		public TerminalNode NUMBER() { return getToken(MySQLStatementParser.NUMBER, 0); }
		public TerminalNode DAY() { return getToken(MySQLStatementParser.DAY, 0); }
		public TerminalNode HISTORY() { return getToken(MySQLStatementParser.HISTORY, 0); }
		public TerminalNode REUSE() { return getToken(MySQLStatementParser.REUSE, 0); }
		public TerminalNode REQUIRE() { return getToken(MySQLStatementParser.REQUIRE, 0); }
		public TerminalNode CURRENT() { return getToken(MySQLStatementParser.CURRENT, 0); }
		public TerminalNode OPTIONAL() { return getToken(MySQLStatementParser.OPTIONAL, 0); }
		public PasswordOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passwordOption; }
	}

	public final PasswordOptionContext passwordOption() throws RecognitionException {
		PasswordOptionContext _localctx = new PasswordOptionContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_passwordOption);
		int _la;
		try {
			setState(3046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3020);
				match(PASSWORD);
				setState(3021);
				match(EXPIRE);
				setState(3027);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFAULT:
					{
					setState(3022);
					match(DEFAULT);
					}
					break;
				case NEVER:
					{
					setState(3023);
					match(NEVER);
					}
					break;
				case INTERVAL:
					{
					setState(3024);
					match(INTERVAL);
					setState(3025);
					match(NUMBER);
					setState(3026);
					match(DAY);
					}
					break;
				case EOF:
				case ACCOUNT:
				case SEMI_:
				case PASSWORD:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3029);
				match(PASSWORD);
				setState(3030);
				match(HISTORY);
				setState(3031);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3032);
				match(PASSWORD);
				setState(3033);
				match(REUSE);
				setState(3034);
				match(INTERVAL);
				setState(3038);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFAULT:
					{
					setState(3035);
					match(DEFAULT);
					}
					break;
				case NUMBER:
					{
					setState(3036);
					match(NUMBER);
					setState(3037);
					match(DAY);
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
				setState(3040);
				match(PASSWORD);
				setState(3041);
				match(REQUIRE);
				setState(3042);
				match(CURRENT);
				setState(3044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONAL || _la==DEFAULT) {
					{
					setState(3043);
					_la = _input.LA(1);
					if ( !(_la==OPTIONAL || _la==DEFAULT) ) {
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
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LockOptionContext extends ParserRuleContext {
		public TerminalNode ACCOUNT() { return getToken(MySQLStatementParser.ACCOUNT, 0); }
		public TerminalNode LOCK() { return getToken(MySQLStatementParser.LOCK, 0); }
		public TerminalNode UNLOCK() { return getToken(MySQLStatementParser.UNLOCK, 0); }
		public LockOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockOption; }
	}

	public final LockOptionContext lockOption() throws RecognitionException {
		LockOptionContext _localctx = new LockOptionContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_lockOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3048);
			match(ACCOUNT);
			setState(3049);
			_la = _input.LA(1);
			if ( !(_la==LOCK || _la==UNLOCK) ) {
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

	public static class AlterUserContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public UserAuthOptionsContext userAuthOptions() {
			return getRuleContext(UserAuthOptionsContext.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public TerminalNode REQUIRE() { return getToken(MySQLStatementParser.REQUIRE, 0); }
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public List<ResourceOptionContext> resourceOption() {
			return getRuleContexts(ResourceOptionContext.class);
		}
		public ResourceOptionContext resourceOption(int i) {
			return getRuleContext(ResourceOptionContext.class,i);
		}
		public List<PasswordOptionContext> passwordOption() {
			return getRuleContexts(PasswordOptionContext.class);
		}
		public PasswordOptionContext passwordOption(int i) {
			return getRuleContext(PasswordOptionContext.class,i);
		}
		public List<LockOptionContext> lockOption() {
			return getRuleContexts(LockOptionContext.class);
		}
		public LockOptionContext lockOption(int i) {
			return getRuleContext(LockOptionContext.class,i);
		}
		public TerminalNode NONE() { return getToken(MySQLStatementParser.NONE, 0); }
		public List<TlsOptionContext> tlsOption() {
			return getRuleContexts(TlsOptionContext.class);
		}
		public TlsOptionContext tlsOption(int i) {
			return getRuleContext(TlsOptionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLStatementParser.COMMA, i);
		}
		public List<TerminalNode> AND() { return getTokens(MySQLStatementParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(MySQLStatementParser.AND, i);
		}
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_alterUser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3051);
			match(ALTER);
			setState(3052);
			match(USER);
			setState(3055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(3053);
				match(IF);
				setState(3054);
				match(EXISTS);
				}
			}

			setState(3057);
			userAuthOptions();
			setState(3073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REQUIRE) {
				{
				setState(3058);
				match(REQUIRE);
				setState(3071);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NONE:
					{
					setState(3059);
					match(NONE);
					}
					break;
				case CIPHER:
				case ISSUER:
				case SSL:
				case SUBJECT:
				case ID:
					{
					setState(3060);
					tlsOption();
					setState(3068);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3061);
						match(COMMA);
						setState(3063);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AND) {
							{
							setState(3062);
							match(AND);
							}
						}

						setState(3065);
						tlsOption();
						}
						}
						setState(3070);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(3084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(3075);
				match(WITH);
				setState(3076);
				resourceOption();
				setState(3081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3077);
					match(COMMA);
					setState(3078);
					resourceOption();
					}
					}
					setState(3083);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACCOUNT || _la==PASSWORD) {
				{
				setState(3088);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PASSWORD:
					{
					setState(3086);
					passwordOption();
					}
					break;
				case ACCOUNT:
					{
					setState(3087);
					lockOption();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(3092);
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

	public static class AlterCurrentUserContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public List<TerminalNode> USER() { return getTokens(MySQLStatementParser.USER); }
		public TerminalNode USER(int i) {
			return getToken(MySQLStatementParser.USER, i);
		}
		public UserFuncAuthOptionContext userFuncAuthOption() {
			return getRuleContext(UserFuncAuthOptionContext.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public AlterCurrentUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterCurrentUser; }
	}

	public final AlterCurrentUserContext alterCurrentUser() throws RecognitionException {
		AlterCurrentUserContext _localctx = new AlterCurrentUserContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_alterCurrentUser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3093);
			match(ALTER);
			setState(3094);
			match(USER);
			setState(3097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(3095);
				match(IF);
				setState(3096);
				match(EXISTS);
				}
			}

			setState(3099);
			match(USER);
			{
			}
			setState(3101);
			userFuncAuthOption();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserFuncAuthOptionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIED() { return getToken(MySQLStatementParser.IDENTIFIED, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public List<TerminalNode> STRING() { return getTokens(MySQLStatementParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MySQLStatementParser.STRING, i);
		}
		public TerminalNode REPLACE() { return getToken(MySQLStatementParser.REPLACE, 0); }
		public TerminalNode RETAIN() { return getToken(MySQLStatementParser.RETAIN, 0); }
		public TerminalNode CURRENT() { return getToken(MySQLStatementParser.CURRENT, 0); }
		public TerminalNode PASSWORD() { return getToken(MySQLStatementParser.PASSWORD, 0); }
		public TerminalNode DISCARD() { return getToken(MySQLStatementParser.DISCARD, 0); }
		public TerminalNode OLD() { return getToken(MySQLStatementParser.OLD, 0); }
		public UserFuncAuthOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userFuncAuthOption; }
	}

	public final UserFuncAuthOptionContext userFuncAuthOption() throws RecognitionException {
		UserFuncAuthOptionContext _localctx = new UserFuncAuthOptionContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_userFuncAuthOption);
		int _la;
		try {
			setState(3118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIED:
				enterOuterAlt(_localctx, 1);
				{
				setState(3103);
				match(IDENTIFIED);
				setState(3104);
				match(BY);
				setState(3105);
				match(STRING);
				setState(3108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REPLACE) {
					{
					setState(3106);
					match(REPLACE);
					setState(3107);
					match(STRING);
					}
				}

				setState(3113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETAIN) {
					{
					setState(3110);
					match(RETAIN);
					setState(3111);
					match(CURRENT);
					setState(3112);
					match(PASSWORD);
					}
				}

				}
				break;
			case DISCARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(3115);
				match(DISCARD);
				setState(3116);
				match(OLD);
				setState(3117);
				match(PASSWORD);
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

	public static class AlterUserRoleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public TerminalNode ROLE() { return getToken(MySQLStatementParser.ROLE, 0); }
		public TerminalNode NONE() { return getToken(MySQLStatementParser.NONE, 0); }
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public AlterUserRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUserRole; }
	}

	public final AlterUserRoleContext alterUserRole() throws RecognitionException {
		AlterUserRoleContext _localctx = new AlterUserRoleContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_alterUserRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3120);
			match(ALTER);
			setState(3121);
			match(USER);
			setState(3124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(3122);
				match(IF);
				setState(3123);
				match(EXISTS);
				}
			}

			setState(3126);
			user();
			setState(3127);
			match(DEFAULT);
			setState(3128);
			match(ROLE);
			setState(3132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
				{
				setState(3129);
				match(NONE);
				}
				break;
			case ALL:
				{
				setState(3130);
				match(ALL);
				}
				break;
			case ID:
			case STRING:
				{
				setState(3131);
				roles();
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
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public UsersContext users() {
			return getRuleContext(UsersContext.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_dropUser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3134);
			match(DROP);
			setState(3135);
			match(USER);
			setState(3138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(3136);
				match(IF);
				setState(3137);
				match(EXISTS);
				}
			}

			setState(3140);
			users();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode RENAME() { return getToken(MySQLStatementParser.RENAME, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public List<UserContext> user() {
			return getRuleContexts(UserContext.class);
		}
		public UserContext user(int i) {
			return getRuleContext(UserContext.class,i);
		}
		public List<TerminalNode> TO() { return getTokens(MySQLStatementParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(MySQLStatementParser.TO, i);
		}
		public RenameUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameUser; }
	}

	public final RenameUserContext renameUser() throws RecognitionException {
		RenameUserContext _localctx = new RenameUserContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_renameUser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3142);
			match(RENAME);
			setState(3143);
			match(USER);
			setState(3144);
			user();
			setState(3145);
			match(TO);
			setState(3146);
			user();
			setState(3153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==STRING) {
				{
				{
				setState(3147);
				user();
				setState(3148);
				match(TO);
				setState(3149);
				user();
				}
				}
				setState(3155);
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

	public static class CreateRoleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(MySQLStatementParser.ROLE, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_createRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3156);
			match(CREATE);
			setState(3157);
			match(ROLE);
			setState(3161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(3158);
				match(IF);
				setState(3159);
				match(NOT);
				setState(3160);
				match(EXISTS);
				}
			}

			setState(3163);
			roles();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(MySQLStatementParser.ROLE, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_dropRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3165);
			match(DROP);
			setState(3166);
			match(ROLE);
			setState(3169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(3167);
				match(IF);
				setState(3168);
				match(EXISTS);
				}
			}

			setState(3171);
			roles();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetPasswordContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public List<TerminalNode> PASSWORD() { return getTokens(MySQLStatementParser.PASSWORD); }
		public TerminalNode PASSWORD(int i) {
			return getToken(MySQLStatementParser.PASSWORD, i);
		}
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public List<TerminalNode> STRING() { return getTokens(MySQLStatementParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MySQLStatementParser.STRING, i);
		}
		public TerminalNode FOR() { return getToken(MySQLStatementParser.FOR, 0); }
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public TerminalNode REPLACE() { return getToken(MySQLStatementParser.REPLACE, 0); }
		public TerminalNode RETAIN() { return getToken(MySQLStatementParser.RETAIN, 0); }
		public TerminalNode CURRENT() { return getToken(MySQLStatementParser.CURRENT, 0); }
		public SetPasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setPassword; }
	}

	public final SetPasswordContext setPassword() throws RecognitionException {
		SetPasswordContext _localctx = new SetPasswordContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_setPassword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3173);
			match(SET);
			setState(3174);
			match(PASSWORD);
			setState(3177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(3175);
				match(FOR);
				setState(3176);
				user();
				}
			}

			setState(3179);
			match(EQ_);
			setState(3180);
			match(STRING);
			setState(3183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPLACE) {
				{
				setState(3181);
				match(REPLACE);
				setState(3182);
				match(STRING);
				}
			}

			setState(3188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETAIN) {
				{
				setState(3185);
				match(RETAIN);
				setState(3186);
				match(CURRENT);
				setState(3187);
				match(PASSWORD);
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

	public static class SetDefaultRoleContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public TerminalNode ROLE() { return getToken(MySQLStatementParser.ROLE, 0); }
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public UsersContext users() {
			return getRuleContext(UsersContext.class,0);
		}
		public TerminalNode NONE() { return getToken(MySQLStatementParser.NONE, 0); }
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public SetDefaultRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setDefaultRole; }
	}

	public final SetDefaultRoleContext setDefaultRole() throws RecognitionException {
		SetDefaultRoleContext _localctx = new SetDefaultRoleContext(_ctx, getState());
		enterRule(_localctx, 520, RULE_setDefaultRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3190);
			match(SET);
			setState(3191);
			match(DEFAULT);
			setState(3192);
			match(ROLE);
			setState(3196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
				{
				setState(3193);
				match(NONE);
				}
				break;
			case ALL:
				{
				setState(3194);
				match(ALL);
				}
				break;
			case ID:
			case STRING:
				{
				setState(3195);
				roles();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(3198);
			match(TO);
			setState(3199);
			users();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetRoleContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(MySQLStatementParser.ROLE, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public TerminalNode NONE() { return getToken(MySQLStatementParser.NONE, 0); }
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode EXCEPT() { return getToken(MySQLStatementParser.EXCEPT, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public SetRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setRole; }
	}

	public final SetRoleContext setRole() throws RecognitionException {
		SetRoleContext _localctx = new SetRoleContext(_ctx, getState());
		enterRule(_localctx, 522, RULE_setRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3201);
			match(SET);
			setState(3202);
			match(ROLE);
			setState(3210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
			case 1:
				{
				setState(3203);
				match(DEFAULT);
				}
				break;
			case 2:
				{
				setState(3204);
				match(NONE);
				}
				break;
			case 3:
				{
				setState(3205);
				match(ALL);
				}
				break;
			case 4:
				{
				setState(3206);
				match(ALL);
				setState(3207);
				match(EXCEPT);
				setState(3208);
				roles();
				}
				break;
			case 5:
				{
				setState(3209);
				roles();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 111:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 113:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 116:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 117:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0165\u0c8f\4\2\t"+
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
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\4\u0107\t\u0107"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2"+
		"\u0231\n\2\3\2\5\2\u0234\n\2\3\3\3\3\5\3\u0238\n\3\3\4\3\4\5\4\u023c\n"+
		"\4\3\4\3\4\3\4\7\4\u0241\n\4\f\4\16\4\u0244\13\4\3\4\3\4\3\5\3\5\5\5\u024a"+
		"\n\5\3\5\3\5\3\5\3\6\3\6\5\6\u0251\n\6\3\6\5\6\u0254\n\6\3\6\5\6\u0257"+
		"\n\6\3\6\5\6\u025a\n\6\3\6\5\6\u025d\n\6\3\6\5\6\u0260\n\6\3\6\5\6\u0263"+
		"\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u026c\n\b\3\b\5\b\u026f\n\b\3\b\5"+
		"\b\u0272\n\b\3\b\5\b\u0275\n\b\3\b\5\b\u0278\n\b\3\b\5\b\u027b\n\b\3\b"+
		"\5\b\u027e\n\b\3\b\5\b\u0281\n\b\3\t\3\t\3\t\3\t\7\t\u0287\n\t\f\t\16"+
		"\t\u028a\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\5\f"+
		"\u0298\n\f\3\r\3\r\3\r\6\r\u029d\n\r\r\r\16\r\u029e\3\r\5\r\u02a2\n\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\6\17\u02ad\n\17\r\17\16\17"+
		"\u02ae\3\17\5\17\u02b2\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\23\5\23\u02c3\n\23\3\24\3\24\3\24\7\24"+
		"\u02c8\n\24\f\24\16\24\u02cb\13\24\3\25\3\25\3\25\6\25\u02d0\n\25\r\25"+
		"\16\25\u02d1\3\25\3\25\6\25\u02d6\n\25\r\25\16\25\u02d7\3\25\5\25\u02db"+
		"\n\25\3\26\3\26\3\26\5\26\u02e0\n\26\3\26\5\26\u02e3\n\26\3\26\5\26\u02e6"+
		"\n\26\3\26\5\26\u02e9\n\26\3\26\3\26\5\26\u02ed\n\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u02f5\n\26\3\27\5\27\u02f8\n\27\3\27\3\27\3\27\5\27"+
		"\u02fd\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0307\n\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0311\n\27\3\27\3\27\5\27"+
		"\u0315\n\27\3\30\3\30\3\30\3\30\5\30\u031b\n\30\3\31\3\31\3\31\7\31\u0320"+
		"\n\31\f\31\16\31\u0323\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u032d\n\32\7\32\u032f\n\32\f\32\16\32\u0332\13\32\3\32\3\32\3\33\3"+
		"\33\5\33\u0338\n\33\3\33\5\33\u033b\n\33\3\33\5\33\u033e\n\33\3\33\3\33"+
		"\3\33\5\33\u0343\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\5\36\u034f\n\36\3\37\3\37\3\37\5\37\u0354\n\37\3\37\3\37\3\37\5\37\u0359"+
		"\n\37\3\37\5\37\u035c\n\37\3 \3 \3!\3!\5!\u0362\n!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\7#\u036d\n#\f#\16#\u0370\13#\3$\3$\3$\3$\5$\u0376\n$\3$\5"+
		"$\u0379\n$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\5(\u0384\n(\3(\3(\3(\3(\3(\3("+
		"\3(\5(\u038d\n(\3)\3)\3)\3)\3*\3*\3*\7*\u0396\n*\f*\16*\u0399\13*\3+\3"+
		"+\3+\3+\5+\u039f\n+\3,\3,\3,\5,\u03a4\n,\3,\3,\5,\u03a8\n,\3,\3,\3,\5"+
		",\u03ad\n,\3-\3-\3-\5-\u03b2\n-\3-\3-\5-\u03b6\n-\3-\3-\3-\3-\3-\3-\3"+
		".\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\5/\u03c9\n/\3\60\5\60\u03cc\n\60\3\60"+
		"\5\60\u03cf\n\60\3\60\5\60\u03d2\n\60\3\60\5\60\u03d5\n\60\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\5\64\u03e2\n\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u03f0\n\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\38\38\58\u03fb\n8\38\58\u03fe\n8\38\58"+
		"\u0401\n8\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A"+
		"\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M"+
		"\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3V\3V\5V\u0443"+
		"\nV\5V\u0445\nV\3V\3V\3W\5W\u044a\nW\3W\3W\3X\3X\3Y\3Y\3Y\7Y\u0453\nY"+
		"\fY\16Y\u0456\13Y\3Z\3Z\3Z\3Z\3[\3[\3[\7[\u045f\n[\f[\16[\u0462\13[\3"+
		"[\3[\3[\3[\5[\u0468\n[\3\\\3\\\5\\\u046c\n\\\3]\3]\3]\7]\u0471\n]\f]\16"+
		"]\u0474\13]\3^\3^\3^\7^\u0479\n^\f^\16^\u047c\13^\3_\3_\3_\7_\u0481\n"+
		"_\f_\16_\u0484\13_\3`\3`\3`\3`\3a\3a\3a\7a\u048d\na\fa\16a\u0490\13a\3"+
		"b\3b\3b\3b\3c\3c\3c\7c\u0499\nc\fc\16c\u049c\13c\3d\3d\3d\3d\3e\3e\3e"+
		"\7e\u04a5\ne\fe\16e\u04a8\13e\3f\3f\3f\7f\u04ad\nf\ff\16f\u04b0\13f\3"+
		"g\3g\3g\7g\u04b5\ng\fg\16g\u04b8\13g\3h\3h\3h\3h\3i\3i\3i\7i\u04c1\ni"+
		"\fi\16i\u04c4\13i\3j\3j\3j\7j\u04c9\nj\fj\16j\u04cc\13j\3k\3k\3k\7k\u04d1"+
		"\nk\fk\16k\u04d4\13k\3l\3l\3l\7l\u04d9\nl\fl\16l\u04dc\13l\3m\3m\3m\7"+
		"m\u04e1\nm\fm\16m\u04e4\13m\3n\3n\3n\7n\u04e9\nn\fn\16n\u04ec\13n\3o\3"+
		"o\3o\7o\u04f1\no\fo\16o\u04f4\13o\3p\3p\3p\3p\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\5q\u0505\nq\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\7q"+
		"\u0516\nq\fq\16q\u0519\13q\3r\3r\3s\3s\3s\3s\3s\3s\5s\u0523\ns\3s\3s\3"+
		"s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\7s\u0532\ns\fs\16s\u0535\13s\3t\3t\3u"+
		"\3u\5u\u053b\nu\3u\3u\3u\3u\3u\5u\u0542\nu\3u\3u\3u\3u\3u\7u\u0549\nu"+
		"\fu\16u\u054c\13u\3u\3u\3u\3u\5u\u0552\nu\3u\3u\3u\3u\3u\3u\3u\3u\3u\3"+
		"u\3u\3u\5u\u0560\nu\3u\3u\3u\3u\7u\u0566\nu\fu\16u\u0569\13u\3u\3u\5u"+
		"\u056d\nu\3u\3u\3u\3u\5u\u0573\nu\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v"+
		"\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v"+
		"\3v\3v\3v\3v\3v\3v\3v\7v\u059f\nv\fv\16v\u05a2\13v\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\5w\u05bc\nw\3w\3"+
		"w\3w\3w\3w\7w\u05c3\nw\fw\16w\u05c6\13w\3x\3x\3y\3y\3z\3z\3z\3z\3z\3z"+
		"\3z\3z\3z\3z\3z\3z\3z\3z\5z\u05da\nz\3z\3z\3z\5z\u05df\nz\3z\3z\5z\u05e3"+
		"\nz\5z\u05e5\nz\3{\3{\3|\3|\3}\3}\3~\3~\3~\3~\3~\7~\u05f2\n~\f~\16~\u05f5"+
		"\13~\3\177\3\177\3\177\5\177\u05fa\n\177\3\177\5\177\u05fd\n\177\3\u0080"+
		"\3\u0080\3\u0080\5\u0080\u0602\n\u0080\3\u0080\7\u0080\u0605\n\u0080\f"+
		"\u0080\16\u0080\u0608\13\u0080\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u0615\n\u0083"+
		"\f\u0083\16\u0083\u0618\13\u0083\3\u0083\3\u0083\5\u0083\u061c\n\u0083"+
		"\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\5\u0087\u0629\n\u0087\3\u0087\3\u0087\7\u0087\u062d\n"+
		"\u0087\f\u0087\16\u0087\u0630\13\u0087\3\u0088\3\u0088\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\5\u0089\u0638\n\u0089\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u063d\n\u008a\3\u008b\3\u008b\5\u008b\u0641\n\u008b\3\u008b\3\u008b\3"+
		"\u008b\5\u008b\u0646\n\u008b\7\u008b\u0648\n\u008b\f\u008b\16\u008b\u064b"+
		"\13\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0652\n\u008b"+
		"\3\u008b\3\u008b\3\u008b\5\u008b\u0657\n\u008b\7\u008b\u0659\n\u008b\f"+
		"\u008b\16\u008b\u065c\13\u008b\3\u008b\3\u008b\5\u008b\u0660\n\u008b\3"+
		"\u008c\5\u008c\u0663\n\u008c\3\u008c\5\u008c\u0666\n\u008c\3\u008c\5\u008c"+
		"\u0669\n\u008c\5\u008c\u066b\n\u008c\3\u008d\3\u008d\5\u008d\u066f\n\u008d"+
		"\3\u008d\3\u008d\5\u008d\u0673\n\u008d\3\u008d\3\u008d\5\u008d\u0677\n"+
		"\u008d\3\u008d\5\u008d\u067a\n\u008d\3\u008e\3\u008e\5\u008e\u067e\n\u008e"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u0684\n\u008f\3\u0090\5\u0090"+
		"\u0687\n\u0090\3\u0090\3\u0090\5\u0090\u068b\n\u0090\3\u0091\3\u0091\3"+
		"\u0091\3\u0091\7\u0091\u0691\n\u0091\f\u0091\16\u0091\u0694\13\u0091\3"+
		"\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0094\3\u0094\3\u0094\5\u0094\u06a2\n\u0094\3\u0095\3\u0095\3\u0095"+
		"\7\u0095\u06a7\n\u0095\f\u0095\16\u0095\u06aa\13\u0095\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\5\u0098\u06b5"+
		"\n\u0098\3\u0098\5\u0098\u06b8\n\u0098\3\u0099\3\u0099\5\u0099\u06bc\n"+
		"\u0099\3\u0099\5\u0099\u06bf\n\u0099\3\u0099\5\u0099\u06c2\n\u0099\3\u009a"+
		"\3\u009a\3\u009a\5\u009a\u06c7\n\u009a\3\u009a\5\u009a\u06ca\n\u009a\3"+
		"\u009a\5\u009a\u06cd\n\u009a\3\u009b\3\u009b\5\u009b\u06d1\n\u009b\3\u009b"+
		"\3\u009b\3\u009b\5\u009b\u06d6\n\u009b\3\u009b\3\u009b\3\u009b\3\u009c"+
		"\3\u009c\3\u009c\5\u009c\u06de\n\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009d\3\u009d\5\u009d\u06e6\n\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\5\u009d\u06ec\n\u009d\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e"+
		"\5\u009e\u06f4\n\u009e\3\u009f\3\u009f\5\u009f\u06f8\n\u009f\3\u009f\5"+
		"\u009f\u06fb\n\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3"+
		"\u00a1\7\u00a1\u0704\n\u00a1\f\u00a1\16\u00a1\u0707\13\u00a1\3\u00a2\3"+
		"\u00a2\3\u00a2\3\u00a2\5\u00a2\u070d\n\u00a2\3\u00a3\3\u00a3\3\u00a3\3"+
		"\u00a4\5\u00a4\u0713\n\u00a4\3\u00a4\5\u00a4\u0716\n\u00a4\3\u00a4\5\u00a4"+
		"\u0719\n\u00a4\3\u00a4\5\u00a4\u071c\n\u00a4\3\u00a4\5\u00a4\u071f\n\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0728"+
		"\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\7\u00a7\u0730"+
		"\n\u00a7\f\u00a7\16\u00a7\u0733\13\u00a7\3\u00a7\5\u00a7\u0736\n\u00a7"+
		"\3\u00a8\3\u00a8\5\u00a8\u073a\n\u00a8\3\u00a8\5\u00a8\u073d\n\u00a8\3"+
		"\u00a8\5\u00a8\u0740\n\u00a8\3\u00a8\5\u00a8\u0743\n\u00a8\3\u00a8\5\u00a8"+
		"\u0746\n\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u074d\n"+
		"\u00a8\f\u00a8\16\u00a8\u0750\13\u00a8\3\u00a8\3\u00a8\5\u00a8\u0754\n"+
		"\u00a8\3\u00a8\5\u00a8\u0757\n\u00a8\5\u00a8\u0759\n\u00a8\3\u00a9\3\u00a9"+
		"\5\u00a9\u075d\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\5\u00a9\u0766\n\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\5\u00aa\u076d\n\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0772\n\u00aa\3"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u077b\n"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0780\n\u00ab\3\u00ac\3\u00ac\5"+
		"\u00ac\u0784\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3"+
		"\u00ad\3\u00ad\3\u00ad\5\u00ad\u078f\n\u00ad\3\u00ad\7\u00ad\u0792\n\u00ad"+
		"\f\u00ad\16\u00ad\u0795\13\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u07a3"+
		"\n\u00af\3\u00b0\3\u00b0\5\u00b0\u07a7\n\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\5\u00b0\u07ac\n\u00b0\3\u00b0\7\u00b0\u07af\n\u00b0\f\u00b0\16\u00b0"+
		"\u07b2\13\u00b0\3\u00b1\3\u00b1\5\u00b1\u07b6\n\u00b1\5\u00b1\u07b8\n"+
		"\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u07bd\n\u00b1\3\u00b2\3\u00b2\5"+
		"\u00b2\u07c1\n\u00b2\3\u00b2\3\u00b2\7\u00b2\u07c5\n\u00b2\f\u00b2\16"+
		"\u00b2\u07c8\13\u00b2\3\u00b3\3\u00b3\5\u00b3\u07cc\n\u00b3\3\u00b3\5"+
		"\u00b3\u07cf\n\u00b3\3\u00b3\5\u00b3\u07d2\n\u00b3\3\u00b3\3\u00b3\7\u00b3"+
		"\u07d6\n\u00b3\f\u00b3\16\u00b3\u07d9\13\u00b3\3\u00b4\3\u00b4\3\u00b4"+
		"\5\u00b4\u07de\n\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b5\5\u00b5\u07e4\n"+
		"\u00b5\3\u00b5\5\u00b5\u07e7\n\u00b5\3\u00b5\5\u00b5\u07ea\n\u00b5\3\u00b5"+
		"\5\u00b5\u07ed\n\u00b5\3\u00b5\3\u00b5\7\u00b5\u07f1\n\u00b5\f\u00b5\16"+
		"\u00b5\u07f4\13\u00b5\3\u00b6\3\u00b6\5\u00b6\u07f8\n\u00b6\3\u00b6\7"+
		"\u00b6\u07fb\n\u00b6\f\u00b6\16\u00b6\u07fe\13\u00b6\3\u00b7\3\u00b7\5"+
		"\u00b7\u0802\n\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0807\n\u00b7\3\u00b7"+
		"\3\u00b7\5\u00b7\u080b\n\u00b7\3\u00b7\3\u00b7\5\u00b7\u080f\n\u00b7\3"+
		"\u00b7\3\u00b7\5\u00b7\u0813\n\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0818"+
		"\n\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u081d\n\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\5\u00b7\u0822\n\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7"+
		"\u0828\n\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u082d\n\u00b7\3\u00b7\3"+
		"\u00b7\3\u00b7\5\u00b7\u0832\n\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0837"+
		"\n\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u083c\n\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\5\u00b7\u0841\n\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0846\n"+
		"\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u084b\n\u00b7\3\u00b7\3\u00b7\3"+
		"\u00b7\5\u00b7\u0850\n\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0855\n\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u085a\n\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\5\u00b7\u085f\n\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0864\n\u00b7\3"+
		"\u00b7\3\u00b7\3\u00b7\5\u00b7\u0869\n\u00b7\3\u00b7\3\u00b7\3\u00b7\3"+
		"\u00b7\3\u00b7\5\u00b7\u0870\n\u00b7\3\u00b7\3\u00b7\5\u00b7\u0874\n\u00b7"+
		"\3\u00b7\5\u00b7\u0877\n\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\5\u00b9\u087f\n\u00b9\3\u00b9\3\u00b9\5\u00b9\u0883\n\u00b9\3"+
		"\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u088a\n\u00b9\5\u00b9\u088c"+
		"\n\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0892\n\u00b9\3\u00ba"+
		"\5\u00ba\u0895\n\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u089a\n\u00ba\3"+
		"\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u08a0\n\u00ba\3\u00ba\5\u00ba\u08a3"+
		"\n\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\5\u00bc\u08ae\n\u00bc\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u08b3\n"+
		"\u00bd\f\u00bd\16\u00bd\u08b6\13\u00bd\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\5\u00be\u08be\n\u00be\5\u00be\u08c0\n\u00be\3\u00be\7"+
		"\u00be\u08c3\n\u00be\f\u00be\16\u00be\u08c6\13\u00be\3\u00be\3\u00be\3"+
		"\u00be\3\u00be\7\u00be\u08cc\n\u00be\f\u00be\16\u00be\u08cf\13\u00be\3"+
		"\u00be\3\u00be\5\u00be\u08d3\n\u00be\3\u00bf\5\u00bf\u08d6\n\u00bf\3\u00bf"+
		"\3\u00bf\5\u00bf\u08da\n\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u08df\n"+
		"\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u08e5\n\u00bf\3\u00bf\3"+
		"\u00bf\3\u00bf\3\u00bf\5\u00bf\u08eb\n\u00bf\3\u00bf\3\u00bf\3\u00bf\5"+
		"\u00bf\u08f0\n\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u08f5\n\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\5\u00bf\u08fa\n\u00bf\3\u00bf\5\u00bf\u08fd\n\u00bf\3"+
		"\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0904\n\u00c0\3\u00c0\3"+
		"\u00c0\3\u00c0\5\u00c0\u0909\n\u00c0\3\u00c1\3\u00c1\3\u00c1\7\u00c1\u090e"+
		"\n\u00c1\f\u00c1\16\u00c1\u0911\13\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\5\u00c2\u0917\n\u00c2\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u091c\n\u00c3\f"+
		"\u00c3\16\u00c3\u091f\13\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\5\u00c4\u0927\n\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u092c\n"+
		"\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0933\n\u00c4\3"+
		"\u00c4\3\u00c4\5\u00c4\u0937\n\u00c4\3\u00c4\3\u00c4\5\u00c4\u093b\n\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0941\n\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0951\n\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u095a\n\u00c4\f\u00c4\16\u00c4"+
		"\u095d\13\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u096d"+
		"\n\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0974\n\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u097b\n\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u098e"+
		"\n\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0994\n\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u099a\n\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\5\u00c4\u09a0\n\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4"+
		"\u09a6\n\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u09ac\n\u00c4\3"+
		"\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u09b2\n\u00c4\3\u00c5\3\u00c5\5"+
		"\u00c5\u09b6\n\u00c5\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u09bb\n\u00c6\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\7\u00c7\u09c1\n\u00c7\f\u00c7\16\u00c7\u09c4"+
		"\13\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00ca\3\u00ca\5\u00ca\u09d0\n\u00ca\3\u00ca\3\u00ca\5\u00ca\u09d4\n"+
		"\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u09da\n\u00cb\3\u00cc\3"+
		"\u00cc\5\u00cc\u09de\n\u00cc\3\u00cd\3\u00cd\5\u00cd\u09e2\n\u00cd\3\u00cd"+
		"\3\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00d0"+
		"\3\u00d0\3\u00d1\3\u00d1\5\u00d1\u09f1\n\u00d1\3\u00d1\3\u00d1\5\u00d1"+
		"\u09f5\n\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d3"+
		"\3\u00d3\5\u00d3\u09ff\n\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4"+
		"\7\u00d4\u0a06\n\u00d4\f\u00d4\16\u00d4\u0a09\13\u00d4\3\u00d5\3\u00d5"+
		"\5\u00d5\u0a0d\n\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u0a12\n\u00d5\3"+
		"\u00d5\3\u00d5\3\u00d6\3\u00d6\5\u00d6\u0a18\n\u00d6\3\u00d6\3\u00d6\3"+
		"\u00d7\3\u00d7\5\u00d7\u0a1e\n\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\7"+
		"\u00d7\u0a24\n\u00d7\f\u00d7\16\u00d7\u0a27\13\u00d7\3\u00d8\3\u00d8\3"+
		"\u00d8\3\u00d8\5\u00d8\u0a2d\n\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3"+
		"\u00d9\5\u00d9\u0a34\n\u00d9\3\u00da\3\u00da\3\u00da\3\u00db\3\u00db\5"+
		"\u00db\u0a3b\n\u00db\3\u00db\3\u00db\5\u00db\u0a3f\n\u00db\3\u00db\5\u00db"+
		"\u0a42\n\u00db\3\u00db\5\u00db\u0a45\n\u00db\3\u00db\5\u00db\u0a48\n\u00db"+
		"\3\u00dc\3\u00dc\5\u00dc\u0a4c\n\u00dc\3\u00dc\5\u00dc\u0a4f\n\u00dc\3"+
		"\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0a56\n\u00dd\f\u00dd\16"+
		"\u00dd\u0a59\13\u00dd\5\u00dd\u0a5b\n\u00dd\3\u00de\3\u00de\3\u00de\3"+
		"\u00de\3\u00de\5\u00de\u0a62\n\u00de\3\u00df\3\u00df\5\u00df\u0a66\n\u00df"+
		"\3\u00df\3\u00df\5\u00df\u0a6a\n\u00df\3\u00df\5\u00df\u0a6d\n\u00df\3"+
		"\u00df\5\u00df\u0a70\n\u00df\3\u00df\5\u00df\u0a73\n\u00df\3\u00df\3\u00df"+
		"\5\u00df\u0a77\n\u00df\3\u00df\5\u00df\u0a7a\n\u00df\3\u00e0\3\u00e0\3"+
		"\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e3"+
		"\3\u00e3\3\u00e3\5\u00e3\u0a89\n\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3"+
		"\u0a8e\n\u00e3\7\u00e3\u0a90\n\u00e3\f\u00e3\16\u00e3\u0a93\13\u00e3\3"+
		"\u00e3\3\u00e3\5\u00e3\u0a97\n\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3"+
		"\u00e3\3\u00e3\5\u00e3\u0a9f\n\u00e3\3\u00e4\3\u00e4\5\u00e4\u0aa3\n\u00e4"+
		"\3\u00e4\3\u00e4\5\u00e4\u0aa7\n\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u0ade\n\u00e4\3\u00e5\3\u00e5"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0ae9"+
		"\n\u00e6\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0af0\n\u00e8"+
		"\3\u00e9\3\u00e9\3\u00e9\7\u00e9\u0af5\n\u00e9\f\u00e9\16\u00e9\u0af8"+
		"\13\u00e9\3\u00ea\3\u00ea\3\u00ea\5\u00ea\u0afd\n\u00ea\3\u00eb\3\u00eb"+
		"\3\u00eb\7\u00eb\u0b02\n\u00eb\f\u00eb\16\u00eb\u0b05\13\u00eb\3\u00ec"+
		"\3\u00ec\5\u00ec\u0b09\n\u00ec\3\u00ed\3\u00ed\3\u00ed\7\u00ed\u0b0e\n"+
		"\u00ed\f\u00ed\16\u00ed\u0b11\13\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0b1c\n\u00ee\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\5\u00ef\u0b25\n\u00ef"+
		"\3\u00f0\3\u00f0\3\u00f0\5\u00f0\u0b2a\n\u00f0\3\u00f0\3\u00f0\3\u00f0"+
		"\5\u00f0\u0b2f\n\u00f0\7\u00f0\u0b31\n\u00f0\f\u00f0\16\u00f0\u0b34\13"+
		"\u00f0\3\u00f0\3\u00f0\5\u00f0\u0b38\n\u00f0\3\u00f0\3\u00f0\3\u00f0\3"+
		"\u00f0\3\u00f1\3\u00f1\3\u00f1\5\u00f1\u0b41\n\u00f1\3\u00f1\3\u00f1\3"+
		"\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2"+
		"\3\u00f2\3\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f4\3\u00f4"+
		"\3\u00f4\3\u00f4\3\u00f4\5\u00f4\u0b5a\n\u00f4\3\u00f4\3\u00f4\3\u00f4"+
		"\3\u00f4\5\u00f4\u0b60\n\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4"+
		"\5\u00f4\u0b67\n\u00f4\3\u00f4\7\u00f4\u0b6a\n\u00f4\f\u00f4\16\u00f4"+
		"\u0b6d\13\u00f4\5\u00f4\u0b6f\n\u00f4\5\u00f4\u0b71\n\u00f4\3\u00f4\3"+
		"\u00f4\3\u00f4\3\u00f4\7\u00f4\u0b77\n\u00f4\f\u00f4\16\u00f4\u0b7a\13"+
		"\u00f4\5\u00f4\u0b7c\n\u00f4\3\u00f4\3\u00f4\7\u00f4\u0b80\n\u00f4\f\u00f4"+
		"\16\u00f4\u0b83\13\u00f4\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\5\u00f5"+
		"\u0b8a\n\u00f5\3\u00f5\3\u00f5\3\u00f5\5\u00f5\u0b8f\n\u00f5\3\u00f5\3"+
		"\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5"+
		"\5\u00f5\u0b9b\n\u00f5\3\u00f5\3\u00f5\3\u00f5\5\u00f5\u0ba0\n\u00f5\3"+
		"\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5"+
		"\5\u00f5\u0bab\n\u00f5\3\u00f6\3\u00f6\5\u00f6\u0baf\n\u00f6\3\u00f7\3"+
		"\u00f7\3\u00f7\7\u00f7\u0bb4\n\u00f7\f\u00f7\16\u00f7\u0bb7\13\u00f7\3"+
		"\u00f8\3\u00f8\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9"+
		"\3\u00f9\5\u00f9\u0bc3\n\u00f9\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa"+
		"\3\u00fa\3\u00fa\3\u00fa\5\u00fa\u0bcd\n\u00fa\3\u00fb\3\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fb\5\u00fb\u0bd6\n\u00fb\3\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\5\u00fb\u0be1"+
		"\n\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\5\u00fb\u0be7\n\u00fb\5\u00fb"+
		"\u0be9\n\u00fb\3\u00fc\3\u00fc\3\u00fc\3\u00fd\3\u00fd\3\u00fd\3\u00fd"+
		"\5\u00fd\u0bf2\n\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd"+
		"\5\u00fd\u0bfa\n\u00fd\3\u00fd\7\u00fd\u0bfd\n\u00fd\f\u00fd\16\u00fd"+
		"\u0c00\13\u00fd\5\u00fd\u0c02\n\u00fd\5\u00fd\u0c04\n\u00fd\3\u00fd\3"+
		"\u00fd\3\u00fd\3\u00fd\7\u00fd\u0c0a\n\u00fd\f\u00fd\16\u00fd\u0c0d\13"+
		"\u00fd\5\u00fd\u0c0f\n\u00fd\3\u00fd\3\u00fd\7\u00fd\u0c13\n\u00fd\f\u00fd"+
		"\16\u00fd\u0c16\13\u00fd\3\u00fe\3\u00fe\3\u00fe\3\u00fe\5\u00fe\u0c1c"+
		"\n\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00ff\3\u00ff\3\u00ff\3\u00ff"+
		"\3\u00ff\5\u00ff\u0c27\n\u00ff\3\u00ff\3\u00ff\3\u00ff\5\u00ff\u0c2c\n"+
		"\u00ff\3\u00ff\3\u00ff\3\u00ff\5\u00ff\u0c31\n\u00ff\3\u0100\3\u0100\3"+
		"\u0100\3\u0100\5\u0100\u0c37\n\u0100\3\u0100\3\u0100\3\u0100\3\u0100\3"+
		"\u0100\3\u0100\5\u0100\u0c3f\n\u0100\3\u0101\3\u0101\3\u0101\3\u0101\5"+
		"\u0101\u0c45\n\u0101\3\u0101\3\u0101\3\u0102\3\u0102\3\u0102\3\u0102\3"+
		"\u0102\3\u0102\3\u0102\3\u0102\3\u0102\7\u0102\u0c52\n\u0102\f\u0102\16"+
		"\u0102\u0c55\13\u0102\3\u0103\3\u0103\3\u0103\3\u0103\3\u0103\5\u0103"+
		"\u0c5c\n\u0103\3\u0103\3\u0103\3\u0104\3\u0104\3\u0104\3\u0104\5\u0104"+
		"\u0c64\n\u0104\3\u0104\3\u0104\3\u0105\3\u0105\3\u0105\3\u0105\5\u0105"+
		"\u0c6c\n\u0105\3\u0105\3\u0105\3\u0105\3\u0105\5\u0105\u0c72\n\u0105\3"+
		"\u0105\3\u0105\3\u0105\5\u0105\u0c77\n\u0105\3\u0106\3\u0106\3\u0106\3"+
		"\u0106\3\u0106\3\u0106\5\u0106\u0c7f\n\u0106\3\u0106\3\u0106\3\u0106\3"+
		"\u0107\3\u0107\3\u0107\3\u0107\3\u0107\3\u0107\3\u0107\3\u0107\3\u0107"+
		"\5\u0107\u0c8d\n\u0107\3\u0107\2\6\u00e0\u00e4\u00ea\u00ec\u0108\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166"+
		"\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e"+
		"\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196"+
		"\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae"+
		"\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6"+
		"\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de"+
		"\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6"+
		"\u01f8\u01fa\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208\u020a\u020c\2\61"+
		"\4\2\u00ae\u00ae\u00b0\u00b0\4\2\'\'RR\4\2]]\u009a\u009a\5\2EEPP\u00cb"+
		"\u00cb\4\2\u0116\u0116\u0145\u0145\5\2\u014b\u014b\u015d\u015d\u0160\u0160"+
		"\3\2\24\25\4\2\u0107\u0107\u015d\u015d\4\2\u0105\u0105\u010b\u010b\4\2"+
		"\20\20KK\4\2\u010a\u010a\u015d\u015d\4\2\u0088\u0088\u0152\u0152\5\2H"+
		"H\u0080\u0081\u00a1\u00a1\4\2\u015d\u015d\u0160\u0160\6\2\u010f\u010f"+
		"\u011b\u011b\u0128\u0128\u012a\u012a\4\2\u0102\u0102\u0104\u0104\3\2\u00ec"+
		"\u00f2\4\2\u010a\u010a\u0126\u0127\3\2\u00ce\u00cf\5\2GG\u00a9\u00a9\u0159"+
		"\u0159\4\2ssuu\4\2PP\u0093\u0093\5\2\63\63CC\u013b\u013b\5\2//ll\u013b"+
		"\u013b\6\2((abrr\u0161\u0161\4\2\u00c8\u00c8\u013c\u013c\4\2\u00b7\u00b7"+
		"\u00d2\u00d2\4\2GG\u00a9\u00a9\4\2))\u0145\u0145\5\2BB\\\\\u0148\u0148"+
		"\4\2\u013b\u013b\u0161\u0161\7\2\37 \63\63CC\u008b\u008b\u013b\u013b\4"+
		"\2ll\u015d\u015d\4\2``\u0088\u0088\5\2&&SS\u013b\u013b\4\2\u013d\u013d"+
		"\u013f\u013f\4\2..QQ\6\2<<qq\u00a3\u00a3\u013b\u013b\4\2\u00d5\u00d5\u012c"+
		"\u012c\4\2\u0131\u0131\u0156\u0156\4\2HH\u00a1\u00a1\4\2\u00c5\u00c5\u0136"+
		"\u0136\4\2vv\u00d6\u00d6\5\2\u0084\u0084\u0142\u0142\u0155\u0155\5\2\u00e1"+
		"\u00e1\u015d\u015d\u0160\u0160\4\2xx\u013b\u013b\4\2cc\u00c6\u00c6\2\u0e0a"+
		"\2\u0230\3\2\2\2\4\u0237\3\2\2\2\6\u0239\3\2\2\2\b\u0247\3\2\2\2\n\u024e"+
		"\3\2\2\2\f\u0264\3\2\2\2\16\u026b\3\2\2\2\20\u0282\3\2\2\2\22\u028b\3"+
		"\2\2\2\24\u0291\3\2\2\2\26\u0297\3\2\2\2\30\u0299\3\2\2\2\32\u02a5\3\2"+
		"\2\2\34\u02aa\3\2\2\2\36\u02b5\3\2\2\2 \u02ba\3\2\2\2\"\u02bd\3\2\2\2"+
		"$\u02c2\3\2\2\2&\u02c4\3\2\2\2(\u02da\3\2\2\2*\u02f4\3\2\2\2,\u0314\3"+
		"\2\2\2.\u031a\3\2\2\2\60\u031c\3\2\2\2\62\u0324\3\2\2\2\64\u0342\3\2\2"+
		"\2\66\u0344\3\2\2\28\u0348\3\2\2\2:\u034e\3\2\2\2<\u035b\3\2\2\2>\u035d"+
		"\3\2\2\2@\u035f\3\2\2\2B\u0365\3\2\2\2D\u0369\3\2\2\2F\u0371\3\2\2\2H"+
		"\u037a\3\2\2\2J\u037c\3\2\2\2L\u037f\3\2\2\2N\u038c\3\2\2\2P\u038e\3\2"+
		"\2\2R\u0392\3\2\2\2T\u039e\3\2\2\2V\u03ac\3\2\2\2X\u03ae\3\2\2\2Z\u03bd"+
		"\3\2\2\2\\\u03c8\3\2\2\2^\u03cb\3\2\2\2`\u03d6\3\2\2\2b\u03da\3\2\2\2"+
		"d\u03dd\3\2\2\2f\u03e1\3\2\2\2h\u03ef\3\2\2\2j\u03f1\3\2\2\2l\u03f6\3"+
		"\2\2\2n\u03fa\3\2\2\2p\u0404\3\2\2\2r\u0406\3\2\2\2t\u0408\3\2\2\2v\u040a"+
		"\3\2\2\2x\u040c\3\2\2\2z\u040e\3\2\2\2|\u0410\3\2\2\2~\u0412\3\2\2\2\u0080"+
		"\u0414\3\2\2\2\u0082\u0416\3\2\2\2\u0084\u0418\3\2\2\2\u0086\u041a\3\2"+
		"\2\2\u0088\u041c\3\2\2\2\u008a\u041e\3\2\2\2\u008c\u0420\3\2\2\2\u008e"+
		"\u0422\3\2\2\2\u0090\u0424\3\2\2\2\u0092\u0426\3\2\2\2\u0094\u0428\3\2"+
		"\2\2\u0096\u042a\3\2\2\2\u0098\u042c\3\2\2\2\u009a\u042e\3\2\2\2\u009c"+
		"\u0430\3\2\2\2\u009e\u0432\3\2\2\2\u00a0\u0434\3\2\2\2\u00a2\u0436\3\2"+
		"\2\2\u00a4\u0438\3\2\2\2\u00a6\u043a\3\2\2\2\u00a8\u043c\3\2\2\2\u00aa"+
		"\u043e\3\2\2\2\u00ac\u0449\3\2\2\2\u00ae\u044d\3\2\2\2\u00b0\u044f\3\2"+
		"\2\2\u00b2\u0457\3\2\2\2\u00b4\u0467\3\2\2\2\u00b6\u046b\3\2\2\2\u00b8"+
		"\u046d\3\2\2\2\u00ba\u0475\3\2\2\2\u00bc\u047d\3\2\2\2\u00be\u0485\3\2"+
		"\2\2\u00c0\u0489\3\2\2\2\u00c2\u0491\3\2\2\2\u00c4\u0495\3\2\2\2\u00c6"+
		"\u049d\3\2\2\2\u00c8\u04a1\3\2\2\2\u00ca\u04a9\3\2\2\2\u00cc\u04b1\3\2"+
		"\2\2\u00ce\u04b9\3\2\2\2\u00d0\u04bd\3\2\2\2\u00d2\u04c5\3\2\2\2\u00d4"+
		"\u04cd\3\2\2\2\u00d6\u04d5\3\2\2\2\u00d8\u04dd\3\2\2\2\u00da\u04e5\3\2"+
		"\2\2\u00dc\u04ed\3\2\2\2\u00de\u04f5\3\2\2\2\u00e0\u0504\3\2\2\2\u00e2"+
		"\u051a\3\2\2\2\u00e4\u051c\3\2\2\2\u00e6\u0536\3\2\2\2\u00e8\u0572\3\2"+
		"\2\2\u00ea\u0574\3\2\2\2\u00ec\u05bb\3\2\2\2\u00ee\u05c7\3\2\2\2\u00f0"+
		"\u05c9\3\2\2\2\u00f2\u05e4\3\2\2\2\u00f4\u05e6\3\2\2\2\u00f6\u05e8\3\2"+
		"\2\2\u00f8\u05ea\3\2\2\2\u00fa\u05ec\3\2\2\2\u00fc\u05f9\3\2\2\2\u00fe"+
		"\u05fe\3\2\2\2\u0100\u0609\3\2\2\2\u0102\u060c\3\2\2\2\u0104\u060f\3\2"+
		"\2\2\u0106\u061d\3\2\2\2\u0108\u0620\3\2\2\2\u010a\u0623\3\2\2\2\u010c"+
		"\u0628\3\2\2\2\u010e\u0631\3\2\2\2\u0110\u0633\3\2\2\2\u0112\u0639\3\2"+
		"\2\2\u0114\u065f\3\2\2\2\u0116\u066a\3\2\2\2\u0118\u066c\3\2\2\2\u011a"+
		"\u067b\3\2\2\2\u011c\u0683\3\2\2\2\u011e\u0686\3\2\2\2\u0120\u068c\3\2"+
		"\2\2\u0122\u0695\3\2\2\2\u0124\u0698\3\2\2\2\u0126\u06a1\3\2\2\2\u0128"+
		"\u06a3\3\2\2\2\u012a\u06ab\3\2\2\2\u012c\u06af\3\2\2\2\u012e\u06b4\3\2"+
		"\2\2\u0130\u06b9\3\2\2\2\u0132\u06c3\3\2\2\2\u0134\u06ce\3\2\2\2\u0136"+
		"\u06da\3\2\2\2\u0138\u06e3\3\2\2\2\u013a\u06f3\3\2\2\2\u013c\u06f5\3\2"+
		"\2\2\u013e\u06fc\3\2\2\2\u0140\u0700\3\2\2\2\u0142\u070c\3\2\2\2\u0144"+
		"\u070e\3\2\2\2\u0146\u0712\3\2\2\2\u0148\u0727\3\2\2\2\u014a\u0729\3\2"+
		"\2\2\u014c\u072c\3\2\2\2\u014e\u0758\3\2\2\2\u0150\u0765\3\2\2\2\u0152"+
		"\u0771\3\2\2\2\u0154\u077f\3\2\2\2\u0156\u0781\3\2\2\2\u0158\u0785\3\2"+
		"\2\2\u015a\u0796\3\2\2\2\u015c\u07a2\3\2\2\2\u015e\u07a6\3\2\2\2\u0160"+
		"\u07b7\3\2\2\2\u0162\u07be\3\2\2\2\u0164\u07c9\3\2\2\2\u0166\u07da\3\2"+
		"\2\2\u0168\u07e3\3\2\2\2\u016a\u07f5\3\2\2\2\u016c\u0876\3\2\2\2\u016e"+
		"\u0878\3\2\2\2\u0170\u087a\3\2\2\2\u0172\u0894\3\2\2\2\u0174\u08a4\3\2"+
		"\2\2\u0176\u08a9\3\2\2\2\u0178\u08af\3\2\2\2\u017a\u08b7\3\2\2\2\u017c"+
		"\u08fc\3\2\2\2\u017e\u08fe\3\2\2\2\u0180\u090a\3\2\2\2\u0182\u0912\3\2"+
		"\2\2\u0184\u0918\3\2\2\2\u0186\u09b1\3\2\2\2\u0188\u09b3\3\2\2\2\u018a"+
		"\u09ba\3\2\2\2\u018c\u09bc\3\2\2\2\u018e\u09c7\3\2\2\2\u0190\u09ca\3\2"+
		"\2\2\u0192\u09cd\3\2\2\2\u0194\u09d5\3\2\2\2\u0196\u09db\3\2\2\2\u0198"+
		"\u09df\3\2\2\2\u019a\u09e5\3\2\2\2\u019c\u09e9\3\2\2\2\u019e\u09ec\3\2"+
		"\2\2\u01a0\u09ee\3\2\2\2\u01a2\u09f6\3\2\2\2\u01a4\u09fc\3\2\2\2\u01a6"+
		"\u0a02\3\2\2\2\u01a8\u0a0a\3\2\2\2\u01aa\u0a15\3\2\2\2\u01ac\u0a1b\3\2"+
		"\2\2\u01ae\u0a2c\3\2\2\2\u01b0\u0a33\3\2\2\2\u01b2\u0a35\3\2\2\2\u01b4"+
		"\u0a38\3\2\2\2\u01b6\u0a4e\3\2\2\2\u01b8\u0a50\3\2\2\2\u01ba\u0a61\3\2"+
		"\2\2\u01bc\u0a63\3\2\2\2\u01be\u0a7b\3\2\2\2\u01c0\u0a7e\3\2\2\2\u01c2"+
		"\u0a83\3\2\2\2\u01c4\u0a85\3\2\2\2\u01c6\u0add\3\2\2\2\u01c8\u0adf\3\2"+
		"\2\2\u01ca\u0ae8\3\2\2\2\u01cc\u0aea\3\2\2\2\u01ce\u0aec\3\2\2\2\u01d0"+
		"\u0af1\3\2\2\2\u01d2\u0af9\3\2\2\2\u01d4\u0afe\3\2\2\2\u01d6\u0b08\3\2"+
		"\2\2\u01d8\u0b0a\3\2\2\2\u01da\u0b12\3\2\2\2\u01dc\u0b1d\3\2\2\2\u01de"+
		"\u0b26\3\2\2\2\u01e0\u0b3d\3\2\2\2\u01e2\u0b48\3\2\2\2\u01e4\u0b4f\3\2"+
		"\2\2\u01e6\u0b54\3\2\2\2\u01e8\u0baa\3\2\2\2\u01ea\u0bac\3\2\2\2\u01ec"+
		"\u0bb0\3\2\2\2\u01ee\u0bb8\3\2\2\2\u01f0\u0bc2\3\2\2\2\u01f2\u0bcc\3\2"+
		"\2\2\u01f4\u0be8\3\2\2\2\u01f6\u0bea\3\2\2\2\u01f8\u0bed\3\2\2\2\u01fa"+
		"\u0c17\3\2\2\2\u01fc\u0c30\3\2\2\2\u01fe\u0c32\3\2\2\2\u0200\u0c40\3\2"+
		"\2\2\u0202\u0c48\3\2\2\2\u0204\u0c56\3\2\2\2\u0206\u0c5f\3\2\2\2\u0208"+
		"\u0c67\3\2\2\2\u020a\u0c78\3\2\2\2\u020c\u0c83\3\2\2\2\u020e\u0231\5\4"+
		"\3\2\u020f\u0231\5\u0118\u008d\2\u0210\u0231\5\u0132\u009a\2\u0211\u0231"+
		"\5\u0130\u0099\2\u0212\u0231\5\u0134\u009b\2\u0213\u0231\5\u0136\u009c"+
		"\2\u0214\u0231\5\u0138\u009d\2\u0215\u0231\5\u0182\u00c2\2\u0216\u0231"+
		"\5\u01a8\u00d5\2\u0217\u0231\5\u01aa\u00d6\2\u0218\u0231\5\u01b6\u00dc"+
		"\2\u0219\u0231\5\u01c0\u00e1\2\u021a\u0231\5\u01b4\u00db\2\u021b\u0231"+
		"\5\u01bc\u00df\2\u021c\u0231\5\u01ac\u00d7\2\u021d\u0231\5\u01be\u00e0"+
		"\2\u021e\u0231\5\u01c4\u00e3\2\u021f\u0231\5\u01da\u00ee\2\u0220\u0231"+
		"\5\u01dc\u00ef\2\u0221\u0231\5\u01de\u00f0\2\u0222\u0231\5\u01e0\u00f1"+
		"\2\u0223\u0231\5\u01e2\u00f2\2\u0224\u0231\5\u01e4\u00f3\2\u0225\u0231"+
		"\5\u01e6\u00f4\2\u0226\u0231\5\u01f8\u00fd\2\u0227\u0231\5\u01fa\u00fe"+
		"\2\u0228\u0231\5\u01fe\u0100\2\u0229\u0231\5\u0200\u0101\2\u022a\u0231"+
		"\5\u0202\u0102\2\u022b\u0231\5\u0204\u0103\2\u022c\u0231\5\u0206\u0104"+
		"\2\u022d\u0231\5\u0208\u0105\2\u022e\u0231\5\u020a\u0106\2\u022f\u0231"+
		"\5\u020c\u0107\2\u0230\u020e\3\2\2\2\u0230\u020f\3\2\2\2\u0230\u0210\3"+
		"\2\2\2\u0230\u0211\3\2\2\2\u0230\u0212\3\2\2\2\u0230\u0213\3\2\2\2\u0230"+
		"\u0214\3\2\2\2\u0230\u0215\3\2\2\2\u0230\u0216\3\2\2\2\u0230\u0217\3\2"+
		"\2\2\u0230\u0218\3\2\2\2\u0230\u0219\3\2\2\2\u0230\u021a\3\2\2\2\u0230"+
		"\u021b\3\2\2\2\u0230\u021c\3\2\2\2\u0230\u021d\3\2\2\2\u0230\u021e\3\2"+
		"\2\2\u0230\u021f\3\2\2\2\u0230\u0220\3\2\2\2\u0230\u0221\3\2\2\2\u0230"+
		"\u0222\3\2\2\2\u0230\u0223\3\2\2\2\u0230\u0224\3\2\2\2\u0230\u0225\3\2"+
		"\2\2\u0230\u0226\3\2\2\2\u0230\u0227\3\2\2\2\u0230\u0228\3\2\2\2\u0230"+
		"\u0229\3\2\2\2\u0230\u022a\3\2\2\2\u0230\u022b\3\2\2\2\u0230\u022c\3\2"+
		"\2\2\u0230\u022d\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u022f\3\2\2\2\u0231"+
		"\u0233\3\2\2\2\u0232\u0234\7\u0101\2\2\u0233\u0232\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\3\3\2\2\2\u0235\u0238\5\6\4\2\u0236\u0238\5\u00fe\u0080"+
		"\2\u0237\u0235\3\2\2\2\u0237\u0236\3\2\2\2\u0238\5\3\2\2\2\u0239\u023b"+
		"\7\u012c\2\2\u023a\u023c\7\u008a\2\2\u023b\u023a\3\2\2\2\u023b\u023c\3"+
		"\2\2\2\u023c\u023d\3\2\2\2\u023d\u0242\5\b\5\2\u023e\u023f\7\u00fa\2\2"+
		"\u023f\u0241\5\b\5\2\u0240\u023e\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240"+
		"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0242\3\2\2\2\u0245"+
		"\u0246\5\u00fe\u0080\2\u0246\7\3\2\2\2\u0247\u0249\5\u0080A\2\u0248\u024a"+
		"\5\u00b2Z\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2"+
		"\2\u024b\u024c\7\u0131\2\2\u024c\u024d\5\24\13\2\u024d\t\3\2\2\2\u024e"+
		"\u0250\5\f\7\2\u024f\u0251\5\u0100\u0081\2\u0250\u024f\3\2\2\2\u0250\u0251"+
		"\3\2\2\2\u0251\u0253\3\2\2\2\u0252\u0254\5\u0102\u0082\2\u0253\u0252\3"+
		"\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0257\5\u0104\u0083"+
		"\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258\u025a"+
		"\5\u0106\u0084\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3"+
		"\2\2\2\u025b\u025d\5\20\t\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025f\3\2\2\2\u025e\u0260\5\u00fa~\2\u025f\u025e\3\2\2\2\u025f\u0260"+
		"\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u0263\5\u0108\u0085\2\u0262\u0261\3"+
		"\2\2\2\u0262\u0263\3\2\2\2\u0263\13\3\2\2\2\u0264\u0265\7\u009f\2\2\u0265"+
		"\u0266\5\16\b\2\u0266\u0267\5\u010c\u0087\2\u0267\r\3\2\2\2\u0268\u026c"+
		"\7\u0102\2\2\u0269\u026c\5\u00eex\2\u026a\u026c\7\60\2\2\u026b\u0268\3"+
		"\2\2\2\u026b\u0269\3\2\2\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c"+
		"\u026e\3\2\2\2\u026d\u026f\7L\2\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2"+
		"\2\2\u026f\u0271\3\2\2\2\u0270\u0272\7\u00b8\2\2\u0271\u0270\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273\u0275\7\u00b1\2\2\u0274\u0273"+
		"\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\3\2\2\2\u0276\u0278\7\u00ac\2"+
		"\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u027b"+
		"\7\u00ad\2\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2"+
		"\2\u027c\u027e\t\2\2\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280"+
		"\3\2\2\2\u027f\u0281\7\u00af\2\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2"+
		"\2\u0281\17\3\2\2\2\u0282\u0283\7\u00d4\2\2\u0283\u0288\5\22\n\2\u0284"+
		"\u0285\7\u00fa\2\2\u0285\u0287\5\22\n\2\u0286\u0284\3\2\2\2\u0287\u028a"+
		"\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\21\3\2\2\2\u028a"+
		"\u0288\3\2\2\2\u028b\u028c\7\u015d\2\2\u028c\u028d\7\u0131\2\2\u028d\u028e"+
		"\7\u00f4\2\2\u028e\u028f\5^\60\2\u028f\u0290\7\u00f5\2\2\u0290\23\3\2"+
		"\2\2\u0291\u0292\7\u00f4\2\2\u0292\u0293\5\u00fe\u0080\2\u0293\u0294\7"+
		"\u00f5\2\2\u0294\25\3\2\2\2\u0295\u0298\5\34\17\2\u0296\u0298\5\30\r\2"+
		"\u0297\u0295\3\2\2\2\u0297\u0296\3\2\2\2\u0298\27\3\2\2\2\u0299\u029a"+
		"\7\21\2\2\u029a\u029c\5\u00ecw\2\u029b\u029d\5\32\16\2\u029c\u029b\3\2"+
		"\2\2\u029d\u029e\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"\u02a1\3\2\2\2\u02a0\u02a2\5 \21\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2"+
		"\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\7\67\2\2\u02a4\31\3\2\2\2\u02a5\u02a6"+
		"\7\u00d3\2\2\u02a6\u02a7\5\u00ecw\2\u02a7\u02a8\7\u00c2\2\2\u02a8\u02a9"+
		"\5\"\22\2\u02a9\33\3\2\2\2\u02aa\u02ac\7\21\2\2\u02ab\u02ad\5\36\20\2"+
		"\u02ac\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af"+
		"\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02b2\5 \21\2\u02b1\u02b0\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\7\67\2\2\u02b4\35\3\2\2"+
		"\2\u02b5\u02b6\7\u00d3\2\2\u02b6\u02b7\5\u00e4s\2\u02b7\u02b8\7\u00c2"+
		"\2\2\u02b8\u02b9\5\"\22\2\u02b9\37\3\2\2\2\u02ba\u02bb\7\64\2\2\u02bb"+
		"\u02bc\5\"\22\2\u02bc!\3\2\2\2\u02bd\u02be\5\u00e0q\2\u02be#\3\2\2\2\u02bf"+
		"\u02c0\7\u00f4\2\2\u02c0\u02c3\7\u00f5\2\2\u02c1\u02c3\5\u00b2Z\2\u02c2"+
		"\u02bf\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3%\3\2\2\2\u02c4\u02c9\5(\25\2"+
		"\u02c5\u02c6\7\u00fa\2\2\u02c6\u02c8\5(\25\2\u02c7\u02c5\3\2\2\2\u02c8"+
		"\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\'\3\2\2\2"+
		"\u02cb\u02c9\3\2\2\2\u02cc\u02cd\5*\26\2\u02cd\u02ce\5,\27\2\u02ce\u02d0"+
		"\3\2\2\2\u02cf\u02cc\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2\u02db\3\2\2\2\u02d3\u02d5\5*\26\2\u02d4\u02d6\5,"+
		"\27\2\u02d5\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02db\5*\26\2\u02da\u02cf\3\2"+
		"\2\2\u02da\u02d3\3\2\2\2\u02da\u02d9\3\2\2\2\u02db)\3\2\2\2\u02dc\u02df"+
		"\5:\36\2\u02dd\u02de\7\u011f\2\2\u02de\u02e0\5\u00b2Z\2\u02df\u02dd\3"+
		"\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e5\3\2\2\2\u02e1\u02e3\7\u0131\2\2"+
		"\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6"+
		"\58\35\2\u02e5\u02e2\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7"+
		"\u02e9\5\60\31\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02f5\3"+
		"\2\2\2\u02ea\u02ec\5\24\13\2\u02eb\u02ed\7\u0131\2\2\u02ec\u02eb\3\2\2"+
		"\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\58\35\2\u02ef\u02f5"+
		"\3\2\2\2\u02f0\u02f1\7\u00f4\2\2\u02f1\u02f2\5&\24\2\u02f2\u02f3\7\u00f5"+
		"\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02dc\3\2\2\2\u02f4\u02ea\3\2\2\2\u02f4"+
		"\u02f0\3\2\2\2\u02f5+\3\2\2\2\u02f6\u02f8\t\3\2\2\u02f7\u02f6\3\2\2\2"+
		"\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\7Y\2\2\u02fa\u02fc"+
		"\5*\26\2\u02fb\u02fd\5.\30\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd"+
		"\u0315\3\2\2\2\u02fe\u02ff\7\u00b8\2\2\u02ff\u0315\5*\26\2\u0300\u0301"+
		"\7\u00b8\2\2\u0301\u0302\5*\26\2\u0302\u0303\5.\30\2\u0303\u0315\3\2\2"+
		"\2\u0304\u0306\t\4\2\2\u0305\u0307\7y\2\2\u0306\u0305\3\2\2\2\u0306\u0307"+
		"\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309\7Y\2\2\u0309\u030a\5*\26\2\u030a"+
		"\u030b\5.\30\2\u030b\u0315\3\2\2\2\u030c\u0310\7o\2\2\u030d\u0311\7R\2"+
		"\2\u030e\u030f\t\4\2\2\u030f\u0311\7y\2\2\u0310\u030d\3\2\2\2\u0310\u030e"+
		"\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\7Y\2\2\u0313"+
		"\u0315\5*\26\2\u0314\u02f7\3\2\2\2\u0314\u02fe\3\2\2\2\u0314\u0300\3\2"+
		"\2\2\u0314\u0304\3\2\2\2\u0314\u030c\3\2\2\2\u0315-\3\2\2\2\u0316\u0317"+
		"\7\u0149\2\2\u0317\u031b\5\u00e0q\2\u0318\u0319\7\u00cc\2\2\u0319\u031b"+
		"\5\u00b2Z\2\u031a\u0316\3\2\2\2\u031a\u0318\3\2\2\2\u031b/\3\2\2\2\u031c"+
		"\u0321\5\62\32\2\u031d\u031e\7\u00fa\2\2\u031e\u0320\5\62\32\2\u031f\u031d"+
		"\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\61\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u0325\t\5\2\2\u0325\u0330\t\6\2"+
		"\2\u0326\u032c\7\u0140\2\2\u0327\u032d\7Y\2\2\u0328\u0329\7\u011e\2\2"+
		"\u0329\u032d\7\u0109\2\2\u032a\u032b\7\u0111\2\2\u032b\u032d\7\u0109\2"+
		"\2\u032c\u0327\3\2\2\2\u032c\u0328\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u032f"+
		"\3\2\2\2\u032e\u0326\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330"+
		"\u0331\3\2\2\2\u0331\u0333\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0334\5\u00ce"+
		"h\2\u0334\63\3\2\2\2\u0335\u0338\5v<\2\u0336\u0338\5\u00e0q\2\u0337\u0335"+
		"\3\2\2\2\u0337\u0336\3\2\2\2\u0338\u033a\3\2\2\2\u0339\u033b\7\u0131\2"+
		"\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033d\3\2\2\2\u033c\u033e"+
		"\58\35\2\u033d\u033c\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0343\3\2\2\2\u033f"+
		"\u0340\5v<\2\u0340\u0341\7\u00e9\2\2\u0341\u0343\3\2\2\2\u0342\u0337\3"+
		"\2\2\2\u0342\u033f\3\2\2\2\u0343\65\3\2\2\2\u0344\u0345\7V\2\2\u0345\u0346"+
		"\5\u00e0q\2\u0346\u0347\7\u015d\2\2\u0347\67\3\2\2\2\u0348\u0349\t\7\2"+
		"\2\u03499\3\2\2\2\u034a\u034f\7\u015d\2\2\u034b\u034c\7\u015d\2\2\u034c"+
		"\u034f\7\u00e9\2\2\u034d\u034f\7\u00e5\2\2\u034e\u034a\3\2\2\2\u034e\u034b"+
		"\3\2\2\2\u034e\u034d\3\2\2\2\u034f;\3\2\2\2\u0350\u0351\t\b\2\2\u0351"+
		"\u0353\7\u0124\2\2\u0352\u0354\7\u00ec\2\2\u0353\u0352\3\2\2\2\u0353\u0354"+
		"\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u035c\5> \2\u0356\u0358\7\26\2\2\u0357"+
		"\u0359\7\u00ec\2\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a"+
		"\3\2\2\2\u035a\u035c\5> \2\u035b\u0350\3\2\2\2\u035b\u0356\3\2\2\2\u035c"+
		"=\3\2\2\2\u035d\u035e\t\t\2\2\u035e?\3\2\2\2\u035f\u0361\7\33\2\2\u0360"+
		"\u0362\7\u00ec\2\2\u0361\u0360\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363"+
		"\3\2\2\2\u0363\u0364\5|?\2\u0364A\3\2\2\2\u0365\u0366\7\u00f4\2\2\u0366"+
		"\u0367\5D#\2\u0367\u0368\7\u00f5\2\2\u0368C\3\2\2\2\u0369\u036e\5F$\2"+
		"\u036a\u036b\7\u00fa\2\2\u036b\u036d\5F$\2\u036c\u036a\3\2\2\2\u036d\u0370"+
		"\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036fE\3\2\2\2\u0370"+
		"\u036e\3\2\2\2\u0371\u0375\5v<\2\u0372\u0373\7\u00f4\2\2\u0373\u0374\7"+
		"\u0161\2\2\u0374\u0376\7\u00f5\2\2\u0375\u0372\3\2\2\2\u0375\u0376\3\2"+
		"\2\2\u0376\u0378\3\2\2\2\u0377\u0379\t\n\2\2\u0378\u0377\3\2\2\2\u0378"+
		"\u0379\3\2\2\2\u0379G\3\2\2\2\u037a\u037b\7\u015d\2\2\u037bI\3\2\2\2\u037c"+
		"\u037d\7\u00cc\2\2\u037d\u037e\t\13\2\2\u037eK\3\2\2\2\u037f\u0380\t\6"+
		"\2\2\u0380M\3\2\2\2\u0381\u0383\7[\2\2\u0382\u0384\7\u00ec\2\2\u0383\u0382"+
		"\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u038d\5T+\2\u0386"+
		"\u038d\5J&\2\u0387\u0388\7\u012c\2\2\u0388\u0389\7|\2\2\u0389\u038d\5"+
		"\u0082B\2\u038a\u038b\7\36\2\2\u038b\u038d\7\u0160\2\2\u038c\u0381\3\2"+
		"\2\2\u038c\u0386\3\2\2\2\u038c\u0387\3\2\2\2\u038c\u038a\3\2\2\2\u038d"+
		"O\3\2\2\2\u038e\u038f\7\u00f4\2\2\u038f\u0390\5R*\2\u0390\u0391\7\u00f5"+
		"\2\2\u0391Q\3\2\2\2\u0392\u0397\5T+\2\u0393\u0394\7\u00fa\2\2\u0394\u0396"+
		"\5T+\2\u0395\u0393\3\2\2\2\u0396\u0399\3\2\2\2\u0397\u0395\3\2\2\2\u0397"+
		"\u0398\3\2\2\2\u0398S\3\2\2\2\u0399\u0397\3\2\2\2\u039a\u039f\7\u013b"+
		"\2\2\u039b\u039f\7f\2\2\u039c\u039f\5\u00e0q\2\u039d\u039f\5\u00dep\2"+
		"\u039e\u039a\3\2\2\2\u039e\u039b\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039d"+
		"\3\2\2\2\u039fU\3\2\2\2\u03a0\u03a1\t\f\2\2\u03a1\u03a3\7\u00f4\2\2\u03a2"+
		"\u03a4\5\u00eex\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a7"+
		"\3\2\2\2\u03a5\u03a8\5\u00dco\2\u03a6\u03a8\7\u00e5\2\2\u03a7\u03a5\3"+
		"\2\2\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9"+
		"\u03ad\7\u00f5\2\2\u03aa\u03ad\5X-\2\u03ab\u03ad\5Z.\2\u03ac\u03a0\3\2"+
		"\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ab\3\2\2\2\u03adW\3\2\2\2\u03ae\u03af"+
		"\7I\2\2\u03af\u03b1\7\u00f4\2\2\u03b0\u03b2\5\u00eex\2\u03b1\u03b0\3\2"+
		"\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b6\5\u00dco\2\u03b4"+
		"\u03b6\7\u00e5\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6"+
		"\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\5\u00fa~\2\u03b8\u03b9\7\u00a0"+
		"\2\2\u03b9\u03ba\5\u00e0q\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\7\u00f5\2"+
		"\2\u03bcY\3\2\2\2\u03bd\u03be\7\u015d\2\2\u03be\u03bf\5\u00dep\2\u03bf"+
		"\u03c0\5\\/\2\u03c0[\3\2\2\2\u03c1\u03c2\7z\2\2\u03c2\u03c3\7\u00f4\2"+
		"\2\u03c3\u03c4\5^\60\2\u03c4\u03c5\7\u00f5\2\2\u03c5\u03c9\3\2\2\2\u03c6"+
		"\u03c7\7z\2\2\u03c7\u03c9\7\u015d\2\2\u03c8\u03c1\3\2\2\2\u03c8\u03c6"+
		"\3\2\2\2\u03c9]\3\2\2\2\u03ca\u03cc\7\u015d\2\2\u03cb\u03ca\3\2\2\2\u03cb"+
		"\u03cc\3\2\2\2\u03cc\u03ce\3\2\2\2\u03cd\u03cf\5`\61\2\u03ce\u03cd\3\2"+
		"\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03d2\5\u00fa~\2\u03d1"+
		"\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d4\3\2\2\2\u03d3\u03d5\5b"+
		"\62\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5_\3\2\2\2\u03d6\u03d7"+
		"\7\u011f\2\2\u03d7\u03d8\7\u0109\2\2\u03d8\u03d9\5\u00dco\2\u03d9a\3\2"+
		"\2\2\u03da\u03db\5d\63\2\u03db\u03dc\5f\64\2\u03dcc\3\2\2\2\u03dd\u03de"+
		"\t\r\2\2\u03dee\3\2\2\2\u03df\u03e2\5h\65\2\u03e0\u03e2\5j\66\2\u03e1"+
		"\u03df\3\2\2\2\u03e1\u03e0\3\2\2\2\u03e2g\3\2\2\2\u03e3\u03e4\7\u0139"+
		"\2\2\u03e4\u03f0\7\u0123\2\2\u03e5\u03e6\7\u00c4\2\2\u03e6\u03f0\7\u0082"+
		"\2\2\u03e7\u03e8\7\u00c4\2\2\u03e8\u03f0\7D\2\2\u03e9\u03ea\5\u00e0q\2"+
		"\u03ea\u03eb\7\u0082\2\2\u03eb\u03f0\3\2\2\2\u03ec\u03ed\5\u00e0q\2\u03ed"+
		"\u03ee\7D\2\2\u03ee\u03f0\3\2\2\2\u03ef\u03e3\3\2\2\2\u03ef\u03e5\3\2"+
		"\2\2\u03ef\u03e7\3\2\2\2\u03ef\u03e9\3\2\2\2\u03ef\u03ec\3\2\2\2\u03f0"+
		"i\3\2\2\2\u03f1\u03f2\7\u0106\2\2\u03f2\u03f3\5h\65\2\u03f3\u03f4\7\u0103"+
		"\2\2\u03f4\u03f5\5l\67\2\u03f5k\3\2\2\2\u03f6\u03f7\5h\65\2\u03f7m\3\2"+
		"\2\2\u03f8\u03f9\7\u0100\2\2\u03f9\u03fb\7\u0100\2\2\u03fa\u03f8\3\2\2"+
		"\2\u03fa\u03fb\3\2\2\2\u03fb\u03fd\3\2\2\2\u03fc\u03fe\t\16\2\2\u03fd"+
		"\u03fc\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0400\3\2\2\2\u03ff\u0401\7\u00e8"+
		"\2\2\u0400\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402\3\2\2\2\u0402"+
		"\u0403\7\u015d\2\2\u0403o\3\2\2\2\u0404\u0405\7\u015d\2\2\u0405q\3\2\2"+
		"\2\u0406\u0407\7\u015d\2\2\u0407s\3\2\2\2\u0408\u0409\7\u015d\2\2\u0409"+
		"u\3\2\2\2\u040a\u040b\7\u015d\2\2\u040bw\3\2\2\2\u040c\u040d\7\u015d\2"+
		"\2\u040dy\3\2\2\2\u040e\u040f\7\u015d\2\2\u040f{\3\2\2\2\u0410\u0411\t"+
		"\17\2\2\u0411}\3\2\2\2\u0412\u0413\7\u015d\2\2\u0413\177\3\2\2\2\u0414"+
		"\u0415\7\u015d\2\2\u0415\u0081\3\2\2\2\u0416\u0417\7\u015d\2\2\u0417\u0083"+
		"\3\2\2\2\u0418\u0419\7\u015d\2\2\u0419\u0085\3\2\2\2\u041a\u041b\7\u015d"+
		"\2\2\u041b\u0087\3\2\2\2\u041c\u041d\7\u015d\2\2\u041d\u0089\3\2\2\2\u041e"+
		"\u041f\7\u015d\2\2\u041f\u008b\3\2\2\2\u0420\u0421\7\u015d\2\2\u0421\u008d"+
		"\3\2\2\2\u0422\u0423\7\u015d\2\2\u0423\u008f\3\2\2\2\u0424\u0425\7\u015d"+
		"\2\2\u0425\u0091\3\2\2\2\u0426\u0427\7\u015d\2\2\u0427\u0093\3\2\2\2\u0428"+
		"\u0429\7\u015d\2\2\u0429\u0095\3\2\2\2\u042a\u042b\7\u015d\2\2\u042b\u0097"+
		"\3\2\2\2\u042c\u042d\7\u015d\2\2\u042d\u0099\3\2\2\2\u042e\u042f\7\u015d"+
		"\2\2\u042f\u009b\3\2\2\2\u0430\u0431\7\u015d\2\2\u0431\u009d\3\2\2\2\u0432"+
		"\u0433\t\17\2\2\u0433\u009f\3\2\2\2\u0434\u0435\7\u015d\2\2\u0435\u00a1"+
		"\3\2\2\2\u0436\u0437\7\u015d\2\2\u0437\u00a3\3\2\2\2\u0438\u0439\7\u015d"+
		"\2\2\u0439\u00a5\3\2\2\2\u043a\u043b\t\17\2\2\u043b\u00a7\3\2\2\2\u043c"+
		"\u043d\7\u015d\2\2\u043d\u00a9\3\2\2\2\u043e\u0444\7\u00f4\2\2\u043f\u0442"+
		"\7\u0161\2\2\u0440\u0441\7\u00fa\2\2\u0441\u0443\7\u0161\2\2\u0442\u0440"+
		"\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0445\3\2\2\2\u0444\u043f\3\2\2\2\u0444"+
		"\u0445\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0447\7\u00f5\2\2\u0447\u00ab"+
		"\3\2\2\2\u0448\u044a\7\u0120\2\2\u0449\u0448\3\2\2\2\u0449\u044a\3\2\2"+
		"\2\u044a\u044b\3\2\2\2\u044b\u044c\7\u0116\2\2\u044c\u00ad\3\2\2\2\u044d"+
		"\u044e\7\3\2\2\u044e\u00af\3\2\2\2\u044f\u0454\7\u015d\2\2\u0450\u0451"+
		"\7\u00fa\2\2\u0451\u0453\7\u015d\2\2\u0452\u0450\3\2\2\2\u0453\u0456\3"+
		"\2\2\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u00b1\3\2\2\2\u0456"+
		"\u0454\3\2\2\2\u0457\u0458\7\u00f4\2\2\u0458\u0459\5\u00b0Y\2\u0459\u045a"+
		"\7\u00f5\2\2\u045a\u00b3\3\2\2\2\u045b\u0460\5\u00b6\\\2\u045c\u045d\7"+
		"\u00fa\2\2\u045d\u045f\5\u00b6\\\2\u045e\u045c\3\2\2\2\u045f\u0462\3\2"+
		"\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0468\3\2\2\2\u0462"+
		"\u0460\3\2\2\2\u0463\u0464\5\u00b6\\\2\u0464\u0465\7\u011c\2\2\u0465\u0466"+
		"\5\u00b6\\\2\u0466\u0468\3\2\2\2\u0467\u045b\3\2\2\2\u0467\u0463\3\2\2"+
		"\2\u0468\u00b5\3\2\2\2\u0469\u046c\5\u00f6|\2\u046a\u046c\5\u00f4{\2\u046b"+
		"\u0469\3\2\2\2\u046b\u046a\3\2\2\2\u046c\u00b7\3\2\2\2\u046d\u0472\5p"+
		"9\2\u046e\u046f\7\u00fa\2\2\u046f\u0471\5p9\2\u0470\u046e\3\2\2\2\u0471"+
		"\u0474\3\2\2\2\u0472\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u00b9\3\2"+
		"\2\2\u0474\u0472\3\2\2\2\u0475\u047a\5r:\2\u0476\u0477\7\u00fa\2\2\u0477"+
		"\u0479\5r:\2\u0478\u0476\3\2\2\2\u0479\u047c\3\2\2\2\u047a\u0478\3\2\2"+
		"\2\u047a\u047b\3\2\2\2\u047b\u00bb\3\2\2\2\u047c\u047a\3\2\2\2\u047d\u0482"+
		"\5t;\2\u047e\u047f\7\u00fa\2\2\u047f\u0481\5t;\2\u0480\u047e\3\2\2\2\u0481"+
		"\u0484\3\2\2\2\u0482\u0480\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u00bd\3\2"+
		"\2\2\u0484\u0482\3\2\2\2\u0485\u0486\7\u00f4\2\2\u0486\u0487\5\u00c0a"+
		"\2\u0487\u0488\7\u00f5\2\2\u0488\u00bf\3\2\2\2\u0489\u048e\5:\36\2\u048a"+
		"\u048b\7\u00fa\2\2\u048b\u048d\5:\36\2\u048c\u048a\3\2\2\2\u048d\u0490"+
		"\3\2\2\2\u048e\u048c\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u00c1\3\2\2\2\u0490"+
		"\u048e\3\2\2\2\u0491\u0492\7\u00f4\2\2\u0492\u0493\5\u00c4c\2\u0493\u0494"+
		"\7\u00f5\2\2\u0494\u00c3\3\2\2\2\u0495\u049a\5v<\2\u0496\u0497\7\u00fa"+
		"\2\2\u0497\u0499\5v<\2\u0498\u0496\3\2\2\2\u0499\u049c\3\2\2\2\u049a\u0498"+
		"\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u00c5\3\2\2\2\u049c\u049a\3\2\2\2\u049d"+
		"\u049e\7\u00f4\2\2\u049e\u049f\5\u00c4c\2\u049f\u04a0\7\u00f5\2\2\u04a0"+
		"\u00c7\3\2\2\2\u04a1\u04a6\5x=\2\u04a2\u04a3\7\u00fa\2\2\u04a3\u04a5\5"+
		"x=\2\u04a4\u04a2\3\2\2\2\u04a5\u04a8\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a6"+
		"\u04a7\3\2\2\2\u04a7\u00c9\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a9\u04ae\5z"+
		">\2\u04aa\u04ab\7\u00fa\2\2\u04ab\u04ad\5z>\2\u04ac\u04aa\3\2\2\2\u04ad"+
		"\u04b0\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u00cb\3\2"+
		"\2\2\u04b0\u04ae\3\2\2\2\u04b1\u04b6\5~@\2\u04b2\u04b3\7\u00fa\2\2\u04b3"+
		"\u04b5\5~@\2\u04b4\u04b2\3\2\2\2\u04b5\u04b8\3\2\2\2\u04b6\u04b4\3\2\2"+
		"\2\u04b6\u04b7\3\2\2\2\u04b7\u00cd\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b9\u04ba"+
		"\7\u00f4\2\2\u04ba\u04bb\5\u00ccg\2\u04bb\u04bc\7\u00f5\2\2\u04bc\u00cf"+
		"\3\2\2\2\u04bd\u04c2\5\u0092J\2\u04be\u04bf\7\u00fa\2\2\u04bf\u04c1\5"+
		"\u0092J\2\u04c0\u04be\3\2\2\2\u04c1\u04c4\3\2\2\2\u04c2\u04c0\3\2\2\2"+
		"\u04c2\u04c3\3\2\2\2\u04c3\u00d1\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c5\u04ca"+
		"\5\u0086D\2\u04c6\u04c7\7\u00fa\2\2\u04c7\u04c9\5\u0086D\2\u04c8\u04c6"+
		"\3\2\2\2\u04c9\u04cc\3\2\2\2\u04ca\u04c8\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb"+
		"\u00d3\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cd\u04d2\5\u009eP\2\u04ce\u04cf"+
		"\7\u00fa\2\2\u04cf\u04d1\5\u009eP\2\u04d0\u04ce\3\2\2\2\u04d1\u04d4\3"+
		"\2\2\2\u04d2\u04d0\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u00d5\3\2\2\2\u04d4"+
		"\u04d2\3\2\2\2\u04d5\u04da\5\u00a6T\2\u04d6\u04d7\7\u00fa\2\2\u04d7\u04d9"+
		"\5\u00a6T\2\u04d8\u04d6\3\2\2\2\u04d9\u04dc\3\2\2\2\u04da\u04d8\3\2\2"+
		"\2\u04da\u04db\3\2\2\2\u04db\u00d7\3\2\2\2\u04dc\u04da\3\2\2\2\u04dd\u04e2"+
		"\5\u00a8U\2\u04de\u04df\7\u00fa\2\2\u04df\u04e1\5\u00a8U\2\u04e0\u04de"+
		"\3\2\2\2\u04e1\u04e4\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3"+
		"\u00d9\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e5\u04ea\5\u00eav\2\u04e6\u04e7"+
		"\7\u00fa\2\2\u04e7\u04e9\5\u00eav\2\u04e8\u04e6\3\2\2\2\u04e9\u04ec\3"+
		"\2\2\2\u04ea\u04e8\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u00db\3\2\2\2\u04ec"+
		"\u04ea\3\2\2\2\u04ed\u04f2\5\u00e0q\2\u04ee\u04ef\7\u00fa\2\2\u04ef\u04f1"+
		"\5\u00e0q\2\u04f0\u04ee\3\2\2\2\u04f1\u04f4\3\2\2\2\u04f2\u04f0\3\2\2"+
		"\2\u04f2\u04f3\3\2\2\2\u04f3\u00dd\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f5\u04f6"+
		"\7\u00f4\2\2\u04f6\u04f7\5\u00dco\2\u04f7\u04f8\7\u00f5\2\2\u04f8\u00df"+
		"\3\2\2\2\u04f9\u04fa\bq\1\2\u04fa\u04fb\7\u00f4\2\2\u04fb\u04fc\5\u00e0"+
		"q\2\u04fc\u04fd\7\u00f5\2\2\u04fd\u0505\3\2\2\2\u04fe\u04ff\7\u011a\2"+
		"\2\u04ff\u0505\5\u00e0q\b\u0500\u0501\7\u00da\2\2\u0501\u0505\5\u00e0"+
		"q\7\u0502\u0505\5\u00e4s\2\u0503\u0505\5\u00e2r\2\u0504\u04f9\3\2\2\2"+
		"\u0504\u04fe\3\2\2\2\u0504\u0500\3\2\2\2\u0504\u0502\3\2\2\2\u0504\u0503"+
		"\3\2\2\2\u0505\u0517\3\2\2\2\u0506\u0507\f\f\2\2\u0507\u0508\7\u0103\2"+
		"\2\u0508\u0516\5\u00e0q\r\u0509\u050a\f\13\2\2\u050a\u050b\7\u00d8\2\2"+
		"\u050b\u0516\5\u00e0q\f\u050c\u050d\f\n\2\2\u050d\u050e\7\u012d\2\2\u050e"+
		"\u0516\5\u00e0q\13\u050f\u0510\f\6\2\2\u0510\u0511\7\u011d\2\2\u0511\u0516"+
		"\5\u00e0q\7\u0512\u0513\f\5\2\2\u0513\u0514\7\u00d9\2\2\u0514\u0516\5"+
		"\u00e0q\6\u0515\u0506\3\2\2\2\u0515\u0509\3\2\2\2\u0515\u050c\3\2\2\2"+
		"\u0515\u050f\3\2\2\2\u0515\u0512\3\2\2\2\u0516\u0519\3\2\2\2\u0517\u0515"+
		"\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u00e1\3\2\2\2\u0519\u0517\3\2\2\2\u051a"+
		"\u051b\5\u00aeX\2\u051b\u00e3\3\2\2\2\u051c\u051d\bs\1\2\u051d\u051e\5"+
		"\u00e8u\2\u051e\u0533\3\2\2\2\u051f\u0520\f\7\2\2\u0520\u0522\7\u0115"+
		"\2\2\u0521\u0523\7\u011a\2\2\u0522\u0521\3\2\2\2\u0522\u0523\3\2\2\2\u0523"+
		"\u0524\3\2\2\2\u0524\u0532\t\20\2\2\u0525\u0526\f\6\2\2\u0526\u0527\7"+
		"\u00ea\2\2\u0527\u0532\5\u00e8u\2\u0528\u0529\f\5\2\2\u0529\u052a\5\u00e6"+
		"t\2\u052a\u052b\5\u00e8u\2\u052b\u0532\3\2\2\2\u052c\u052d\f\4\2\2\u052d"+
		"\u052e\5\u00e6t\2\u052e\u052f\t\21\2\2\u052f\u0530\5\24\13\2\u0530\u0532"+
		"\3\2\2\2\u0531\u051f\3\2\2\2\u0531\u0525\3\2\2\2\u0531\u0528\3\2\2\2\u0531"+
		"\u052c\3\2\2\2\u0532\u0535\3\2\2\2\u0533\u0531\3\2\2\2\u0533\u0534\3\2"+
		"\2\2\u0534\u00e5\3\2\2\2\u0535\u0533\3\2\2\2\u0536\u0537\t\22\2\2\u0537"+
		"\u00e7\3\2\2\2\u0538\u053a\5\u00eav\2\u0539\u053b\7\u011a\2\2\u053a\u0539"+
		"\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053d\7\u0114\2"+
		"\2\u053d\u053e\5\24\13\2\u053e\u0573\3\2\2\2\u053f\u0541\5\u00eav\2\u0540"+
		"\u0542\7\u011a\2\2\u0541\u0540\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0543"+
		"\3\2\2\2\u0543\u0544\7\u0114\2\2\u0544\u0545\7\u00f4\2\2\u0545\u054a\5"+
		"\u00ecw\2\u0546\u0547\7\u00fa\2\2\u0547\u0549\5\u00ecw\2\u0548\u0546\3"+
		"\2\2\2\u0549\u054c\3\2\2\2\u054a\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b"+
		"\u054d\3\2\2\2\u054c\u054a\3\2\2\2\u054d\u054e\7\u00f5\2\2\u054e\u0573"+
		"\3\2\2\2\u054f\u0551\5\u00eav\2\u0550\u0552\7\u011a\2\2\u0551\u0550\3"+
		"\2\2\2\u0551\u0552\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0554\7\u0106\2\2"+
		"\u0554\u0555\5\u00ecw\2\u0555\u0556\7\u0103\2\2\u0556\u0557\5\u00e8u\2"+
		"\u0557\u0573\3\2\2\2\u0558\u0559\5\u00eav\2\u0559\u055a\7\u0125\2\2\u055a"+
		"\u055b\7\u0117\2\2\u055b\u055c\5\u00ecw\2\u055c\u0573\3\2\2\2\u055d\u055f"+
		"\5\u00eav\2\u055e\u0560\7\u011a\2\2\u055f\u055e\3\2\2\2\u055f\u0560\3"+
		"\2\2\2\u0560\u0561\3\2\2\2\u0561\u0562\7\u0117\2\2\u0562\u0567\5\u00ec"+
		"w\2\u0563\u0564\7\u010d\2\2\u0564\u0566\5\u00ecw\2\u0565\u0563\3\2\2\2"+
		"\u0566\u0569\3\2\2\2\u0567\u0565\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u0573"+
		"\3\2\2\2\u0569\u0567\3\2\2\2\u056a\u056c\5\u00eav\2\u056b\u056d\7\u011a"+
		"\2\2\u056c\u056b\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u056e\3\2\2\2\u056e"+
		"\u056f\7\u0121\2\2\u056f\u0570\5\u00ecw\2\u0570\u0573\3\2\2\2\u0571\u0573"+
		"\5\u00eav\2\u0572\u0538\3\2\2\2\u0572\u053f\3\2\2\2\u0572\u054f\3\2\2"+
		"\2\u0572\u0558\3\2\2\2\u0572\u055d\3\2\2\2\u0572\u056a\3\2\2\2\u0572\u0571"+
		"\3\2\2\2\u0573\u00e9\3\2\2\2\u0574\u0575\bv\1\2\u0575\u0576\5\u00ecw\2"+
		"\u0576\u05a0\3\2\2\2\u0577\u0578\f\20\2\2\u0578\u0579\7\u00dc\2\2\u0579"+
		"\u059f\5\u00eav\21\u057a\u057b\f\17\2\2\u057b\u057c\7\u00dd\2\2\u057c"+
		"\u059f\5\u00eav\20\u057d\u057e\f\16\2\2\u057e\u057f\7\u00de\2\2\u057f"+
		"\u059f\5\u00eav\17\u0580\u0581\f\r\2\2\u0581\u0582\7\u00df\2\2\u0582\u059f"+
		"\5\u00eav\16\u0583\u0584\f\f\2\2\u0584\u0585\7\u00e3\2\2\u0585\u059f\5"+
		"\u00eav\r\u0586\u0587\f\13\2\2\u0587\u0588\7\u00e4\2\2\u0588\u059f\5\u00ea"+
		"v\f\u0589\u058a\f\n\2\2\u058a\u058b\7\u00e5\2\2\u058b\u059f\5\u00eav\13"+
		"\u058c\u058d\f\t\2\2\u058d\u058e\7\u00e6\2\2\u058e\u059f\5\u00eav\n\u058f"+
		"\u0590\f\b\2\2\u0590\u0591\7\u0119\2\2\u0591\u059f\5\u00eav\t\u0592\u0593"+
		"\f\7\2\2\u0593\u0594\7\u00e1\2\2\u0594\u059f\5\u00eav\b\u0595\u0596\f"+
		"\6\2\2\u0596\u0597\7\u00e0\2\2\u0597\u059f\5\u00eav\7\u0598\u0599\f\5"+
		"\2\2\u0599\u059a\7\u00e3\2\2\u059a\u059f\5\66\34\2\u059b\u059c\f\4\2\2"+
		"\u059c\u059d\7\u00e4\2\2\u059d\u059f\5\66\34\2\u059e\u0577\3\2\2\2\u059e"+
		"\u057a\3\2\2\2\u059e\u057d\3\2\2\2\u059e\u0580\3\2\2\2\u059e\u0583\3\2"+
		"\2\2\u059e\u0586\3\2\2\2\u059e\u0589\3\2\2\2\u059e\u058c\3\2\2\2\u059e"+
		"\u058f\3\2\2\2\u059e\u0592\3\2\2\2\u059e\u0595\3\2\2\2\u059e\u0598\3\2"+
		"\2\2\u059e\u059b\3\2\2\2\u059f\u05a2\3\2\2\2\u05a0\u059e\3\2\2\2\u05a0"+
		"\u05a1\3\2\2\2\u05a1\u00eb\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a3\u05a4\bw"+
		"\1\2\u05a4\u05bc\5V,\2\u05a5\u05bc\5\u00f2z\2\u05a6\u05bc\5v<\2\u05a7"+
		"\u05bc\5n8\2\u05a8\u05a9\7\u00e3\2\2\u05a9\u05bc\5\u00ecw\16\u05aa\u05ab"+
		"\7\u00e4\2\2\u05ab\u05bc\5\u00ecw\r\u05ac\u05ad\7\u00db\2\2\u05ad\u05bc"+
		"\5\u00ecw\f\u05ae\u05af\7\u00da\2\2\u05af\u05bc\5\u00ecw\13\u05b0\u05b1"+
		"\7\u0107\2\2\u05b1\u05bc\5\u00ecw\n\u05b2\u05bc\5\u00dep\2\u05b3\u05b4"+
		"\7\u0123\2\2\u05b4\u05bc\5\u00dep\2\u05b5\u05bc\5\24\13\2\u05b6\u05b7"+
		"\7\u010e\2\2\u05b7\u05bc\5\24\13\2\u05b8\u05bc\5\26\f\2\u05b9\u05bc\5"+
		"\66\34\2\u05ba\u05bc\5\u00f0y\2\u05bb\u05a3\3\2\2\2\u05bb\u05a5\3\2\2"+
		"\2\u05bb\u05a6\3\2\2\2\u05bb\u05a7\3\2\2\2\u05bb\u05a8\3\2\2\2\u05bb\u05aa"+
		"\3\2\2\2\u05bb\u05ac\3\2\2\2\u05bb\u05ae\3\2\2\2\u05bb\u05b0\3\2\2\2\u05bb"+
		"\u05b2\3\2\2\2\u05bb\u05b3\3\2\2\2\u05bb\u05b5\3\2\2\2\u05bb\u05b6\3\2"+
		"\2\2\u05bb\u05b8\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bb\u05ba\3\2\2\2\u05bc"+
		"\u05c4\3\2\2\2\u05bd\u05be\f\17\2\2\u05be\u05bf\7\u00d8\2\2\u05bf\u05c3"+
		"\5\u00ecw\20\u05c0\u05c1\f\21\2\2\u05c1\u05c3\5@!\2\u05c2\u05bd\3\2\2"+
		"\2\u05c2\u05c0\3\2\2\2\u05c3\u05c6\3\2\2\2\u05c4\u05c2\3\2\2\2\u05c4\u05c5"+
		"\3\2\2\2\u05c5\u00ed\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c7\u05c8\7\u010c\2"+
		"\2\u05c8\u00ef\3\2\2\2\u05c9\u05ca\5\u00aeX\2\u05ca\u00f1\3\2\2\2\u05cb"+
		"\u05e5\5\u00f4{\2\u05cc\u05e5\5\u00f6|\2\u05cd\u05e5\7\u0128\2\2\u05ce"+
		"\u05e5\7\u010f\2\2\u05cf\u05e5\7\u011b\2\2\u05d0\u05d1\7\u00f6\2\2\u05d1"+
		"\u05d2\7\u015d\2\2\u05d2\u05d3\7\u0160\2\2\u05d3\u05e5\7\u00f7\2\2\u05d4"+
		"\u05e5\7\u0164\2\2\u05d5\u05e5\5\u00f8}\2\u05d6\u05d7\7\u015d\2\2\u05d7"+
		"\u05d9\7\u0160\2\2\u05d8\u05da\5@!\2\u05d9\u05d8\3\2\2\2\u05d9\u05da\3"+
		"\2\2\2\u05da\u05e5\3\2\2\2\u05db\u05dc\t\23\2\2\u05dc\u05e5\7\u0160\2"+
		"\2\u05dd\u05df\7\u015d\2\2\u05de\u05dd\3\2\2\2\u05de\u05df\3\2\2\2\u05df"+
		"\u05e0\3\2\2\2\u05e0\u05e2\7\u0108\2\2\u05e1\u05e3\5@!\2\u05e2\u05e1\3"+
		"\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e5\3\2\2\2\u05e4\u05cb\3\2\2\2\u05e4"+
		"\u05cc\3\2\2\2\u05e4\u05cd\3\2\2\2\u05e4\u05ce\3\2\2\2\u05e4\u05cf\3\2"+
		"\2\2\u05e4\u05d0\3\2\2\2\u05e4\u05d4\3\2\2\2\u05e4\u05d5\3\2\2\2\u05e4"+
		"\u05d6\3\2\2\2\u05e4\u05db\3\2\2\2\u05e4\u05de\3\2\2\2\u05e5\u00f3\3\2"+
		"\2\2\u05e6\u05e7\7\u00ff\2\2\u05e7\u00f5\3\2\2\2\u05e8\u05e9\7\u0161\2"+
		"\2\u05e9\u00f7\3\2\2\2\u05ea\u05eb\7\u0160\2\2\u05eb\u00f9\3\2\2\2\u05ec"+
		"\u05ed\7\u011e\2\2\u05ed\u05ee\7\u0109\2\2\u05ee\u05f3\5\u00fc\177\2\u05ef"+
		"\u05f0\7\u00fa\2\2\u05f0\u05f2\5\u00fc\177\2\u05f1\u05ef\3\2\2\2\u05f2"+
		"\u05f5\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u00fb\3\2"+
		"\2\2\u05f5\u05f3\3\2\2\2\u05f6\u05fa\5v<\2\u05f7\u05fa\5\u00f6|\2\u05f8"+
		"\u05fa\5\u00e0q\2\u05f9\u05f6\3\2\2\2\u05f9\u05f7\3\2\2\2\u05f9\u05f8"+
		"\3\2\2\2\u05fa\u05fc\3\2\2\2\u05fb\u05fd\t\n\2\2\u05fc\u05fb\3\2\2\2\u05fc"+
		"\u05fd\3\2\2\2\u05fd\u00fd\3\2\2\2\u05fe\u0606\5\n\6\2\u05ff\u0601\7\u0129"+
		"\2\2\u0600\u0602\7\u0102\2\2\u0601\u0600\3\2\2\2\u0601\u0602\3\2\2\2\u0602"+
		"\u0603\3\2\2\2\u0603\u0605\5\n\6\2\u0604\u05ff\3\2\2\2\u0605\u0608\3\2"+
		"\2\2\u0606\u0604\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u00ff\3\2\2\2\u0608"+
		"\u0606\3\2\2\2\u0609\u060a\7\u0110\2\2\u060a\u060b\5&\24\2\u060b\u0101"+
		"\3\2\2\2\u060c\u060d\7\u012b\2\2\u060d\u060e\5\u00e0q\2\u060e\u0103\3"+
		"\2\2\2\u060f\u0610\7\u0111\2\2\u0610\u0611\7\u0109\2\2\u0611\u0616\5\u00fc"+
		"\177\2\u0612\u0613\7\u00fa\2\2\u0613\u0615\5\u00fc\177\2\u0614\u0612\3"+
		"\2\2\2\u0615\u0618\3\2\2\2\u0616\u0614\3\2\2\2\u0616\u0617\3\2\2\2\u0617"+
		"\u061b\3\2\2\2\u0618\u0616\3\2\2\2\u0619\u061a\7\u012c\2\2\u061a\u061c"+
		"\7\u0122\2\2\u061b\u0619\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u0105\3\2\2"+
		"\2\u061d\u061e\7\u0112\2\2\u061e\u061f\5\u00e0q\2\u061f\u0107\3\2\2\2"+
		"\u0620\u0621\7\u0118\2\2\u0621\u0622\5\u00b4[\2\u0622\u0109\3\2\2\2\u0623"+
		"\u0624\7\u011f\2\2\u0624\u0625\5\u00b2Z\2\u0625\u010b\3\2\2\2\u0626\u0629"+
		"\5\u010e\u0088\2\u0627\u0629\5\64\33\2\u0628\u0626\3\2\2\2\u0628\u0627"+
		"\3\2\2\2\u0629\u062e\3\2\2\2\u062a\u062b\7\u00fa\2\2\u062b\u062d\5\64"+
		"\33\2\u062c\u062a\3\2\2\2\u062d\u0630\3\2\2\2\u062e\u062c\3\2\2\2\u062e"+
		"\u062f\3\2\2\2\u062f\u010d\3\2\2\2\u0630\u062e\3\2\2\2\u0631\u0632\7\u00e5"+
		"\2\2\u0632\u010f\3\2\2\2\u0633\u0634\7\u013c\2\2\u0634\u0637\5\u0116\u008c"+
		"\2\u0635\u0638\5\u0114\u008b\2\u0636\u0638\5\u0112\u008a\2\u0637\u0635"+
		"\3\2\2\2\u0637\u0636\3\2\2\2\u0638\u0111\3\2\2\2\u0639\u063a\7\u0110\2"+
		"\2\u063a\u063c\7\u015d\2\2\u063b\u063d\5\u010a\u0086\2\u063c\u063b\3\2"+
		"\2\2\u063c\u063d\3\2\2\2\u063d\u0113\3\2\2\2\u063e\u0640\7\u015d\2\2\u063f"+
		"\u0641\7\u00e9\2\2\u0640\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0649"+
		"\3\2\2\2\u0642\u0643\7\u00fa\2\2\u0643\u0645\7\u015d\2\2\u0644\u0646\7"+
		"\u00e9\2\2\u0645\u0644\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0648\3\2\2\2"+
		"\u0647\u0642\3\2\2\2\u0648\u064b\3\2\2\2\u0649\u0647\3\2\2\2\u0649\u064a"+
		"\3\2\2\2\u064a\u064c\3\2\2\2\u064b\u0649\3\2\2\2\u064c\u064d\7\u0110\2"+
		"\2\u064d\u0660\5&\24\2\u064e\u064f\7\u0110\2\2\u064f\u0651\7\u015d\2\2"+
		"\u0650\u0652\7\u00e9\2\2\u0651\u0650\3\2\2\2\u0651\u0652\3\2\2\2\u0652"+
		"\u065a\3\2\2\2\u0653\u0654\7\u00fa\2\2\u0654\u0656\7\u015d\2\2\u0655\u0657"+
		"\7\u00e9\2\2\u0656\u0655\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0659\3\2\2"+
		"\2\u0658\u0653\3\2\2\2\u0659\u065c\3\2\2\2\u065a\u0658\3\2\2\2\u065a\u065b"+
		"\3\2\2\2\u065b\u065d\3\2\2\2\u065c\u065a\3\2\2\2\u065d\u065e\7\u00cc\2"+
		"\2\u065e\u0660\5&\24\2\u065f\u063e\3\2\2\2\u065f\u064e\3\2\2\2\u0660\u0115"+
		"\3\2\2\2\u0661\u0663\7d\2\2\u0662\u0661\3\2\2\2\u0662\u0663\3\2\2\2\u0663"+
		"\u066b\3\2\2\2\u0664\u0666\7\u0087\2\2\u0665\u0664\3\2\2\2\u0665\u0666"+
		"\3\2\2\2\u0666\u066b\3\2\2\2\u0667\u0669\7P\2\2\u0668\u0667\3\2\2\2\u0668"+
		"\u0669\3\2\2\2\u0669\u066b\3\2\2\2\u066a\u0662\3\2\2\2\u066a\u0665\3\2"+
		"\2\2\u066a\u0668\3\2\2\2\u066b\u0117\3\2\2\2\u066c\u066e\5\u011a\u008e"+
		"\2\u066d\u066f\7W\2\2\u066e\u066d\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0670"+
		"\3\2\2\2\u0670\u0672\7\u015d\2\2\u0671\u0673\5\u010a\u0086\2\u0672\u0671"+
		"\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0676\3\2\2\2\u0674\u0677\5\u0122\u0092"+
		"\2\u0675\u0677\5\u011e\u0090\2\u0676\u0674\3\2\2\2\u0676\u0675\3\2\2\2"+
		"\u0677\u0679\3\2\2\2\u0678\u067a\5\u0124\u0093\2\u0679\u0678\3\2\2\2\u0679"+
		"\u067a\3\2\2\2\u067a\u0119\3\2\2\2\u067b\u067d\7T\2\2\u067c\u067e\5\u011c"+
		"\u008f\2\u067d\u067c\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u011b\3\2\2\2\u067f"+
		"\u0684\7d\2\2\u0680\u0684\7+\2\2\u0681\u0682\7L\2\2\u0682\u0684\7P\2\2"+
		"\u0683\u067f\3\2\2\2\u0683\u0680\3\2\2\2\u0683\u0681\3\2\2\2\u0684\u011d"+
		"\3\2\2\2\u0685\u0687\5$\23\2\u0686\u0685\3\2\2\2\u0686\u0687\3\2\2\2\u0687"+
		"\u068a\3\2\2\2\u0688\u068b\5\u0120\u0091\2\u0689\u068b\5\4\3\2\u068a\u0688"+
		"\3\2\2\2\u068a\u0689\3\2\2\2\u068b\u011f\3\2\2\2\u068c\u068d\t\24\2\2"+
		"\u068d\u0692\5P)\2\u068e\u068f\7\u00fa\2\2\u068f\u0691\5P)\2\u0690\u068e"+
		"\3\2\2\2\u0691\u0694\3\2\2\2\u0692\u0690\3\2\2\2\u0692\u0693\3\2\2\2\u0693"+
		"\u0121\3\2\2\2\u0694\u0692\3\2\2\2\u0695\u0696\7\u0124\2\2\u0696\u0697"+
		"\5\u0128\u0095\2\u0697\u0123\3\2\2\2\u0698\u0699\7\u0149\2\2\u0699\u069a"+
		"\7\62\2\2\u069a\u069b\7\u0116\2\2\u069b\u069c\7\u00c8\2\2\u069c\u069d"+
		"\5\u0128\u0095\2\u069d\u0125\3\2\2\2\u069e\u069f\7\u00f4\2\2\u069f\u06a2"+
		"\7\u00f5\2\2\u06a0\u06a2\5\u00b2Z\2\u06a1\u069e\3\2\2\2\u06a1\u06a0\3"+
		"\2\2\2\u06a2\u0127\3\2\2\2\u06a3\u06a8\5\u012a\u0096\2\u06a4\u06a5\7\u00fa"+
		"\2\2\u06a5\u06a7\5\u012a\u0096\2\u06a6\u06a4\3\2\2\2\u06a7\u06aa\3\2\2"+
		"\2\u06a8\u06a6\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u0129\3\2\2\2\u06aa\u06a8"+
		"\3\2\2\2\u06ab\u06ac\5v<\2\u06ac\u06ad\7\u00ec\2\2\u06ad\u06ae\5T+\2\u06ae"+
		"\u012b\3\2\2\2\u06af\u06b0\7\u00c8\2\2\u06b0\u06b1\5\u012e\u0098\2\u06b1"+
		"\u06b2\5&\24\2\u06b2\u012d\3\2\2\2\u06b3\u06b5\7d\2\2\u06b4\u06b3\3\2"+
		"\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b7\3\2\2\2\u06b6\u06b8\7P\2\2\u06b7"+
		"\u06b6\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u012f\3\2\2\2\u06b9\u06bb\5\u0110"+
		"\u0089\2\u06ba\u06bc\5\u0102\u0082\2\u06bb\u06ba\3\2\2\2\u06bb\u06bc\3"+
		"\2\2\2\u06bc\u06be\3\2\2\2\u06bd\u06bf\5\u00fa~\2\u06be\u06bd\3\2\2\2"+
		"\u06be\u06bf\3\2\2\2\u06bf\u06c1\3\2\2\2\u06c0\u06c2\5\u0108\u0085\2\u06c1"+
		"\u06c0\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u0131\3\2\2\2\u06c3\u06c4\5\u012c"+
		"\u0097\2\u06c4\u06c6\5\u0122\u0092\2\u06c5\u06c7\5\u0102\u0082\2\u06c6"+
		"\u06c5\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06c9\3\2\2\2\u06c8\u06ca\5\u00fa"+
		"~\2\u06c9\u06c8\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cc\3\2\2\2\u06cb"+
		"\u06cd\5\u0108\u0085\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u0133"+
		"\3\2\2\2\u06ce\u06d0\7\u0138\2\2\u06cf\u06d1\t\25\2\2\u06d0\u06cf\3\2"+
		"\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d3\7\u0145\2\2\u06d3"+
		"\u06d5\5~@\2\u06d4\u06d6\5J&\2\u06d5\u06d4\3\2\2\2\u06d5\u06d6\3\2\2\2"+
		"\u06d6\u06d7\3\2\2\2\u06d7\u06d8\7\u0149\2\2\u06d8\u06d9\5:\36\2\u06d9"+
		"\u0135\3\2\2\2\u06da\u06db\7\u013e\2\2\u06db\u06dd\7\u0145\2\2\u06dc\u06de"+
		"\t\26\2\2\u06dd\u06dc\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06df\3\2\2\2"+
		"\u06df\u06e0\5~@\2\u06e0\u06e1\7\u0149\2\2\u06e1\u06e2\5:\36\2\u06e2\u0137"+
		"\3\2\2\2\u06e3\u06e5\7\u0138\2\2\u06e4\u06e6\7\u00c0\2\2\u06e5\u06e4\3"+
		"\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06eb\7\u0155\2\2"+
		"\u06e8\u06e9\7O\2\2\u06e9\u06ea\7\u011a\2\2\u06ea\u06ec\7\u010e\2\2\u06eb"+
		"\u06e8\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee\5:"+
		"\36\2\u06ee\u06ef\5\u013a\u009e\2\u06ef\u0139\3\2\2\2\u06f0\u06f4\5\u013c"+
		"\u009f\2\u06f1\u06f4\5\u0146\u00a4\2\u06f2\u06f4\5\u0148\u00a5\2\u06f3"+
		"\u06f0\3\2\2\2\u06f3\u06f1\3\2\2\2\u06f3\u06f2\3\2\2\2\u06f4\u013b\3\2"+
		"\2\2\u06f5\u06f7\5\u013e\u00a0\2\u06f6\u06f8\5\u016a\u00b6\2\u06f7\u06f6"+
		"\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06fa\3\2\2\2\u06f9\u06fb\5\u0170\u00b9"+
		"\2\u06fa\u06f9\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u013d\3\2\2\2\u06fc\u06fd"+
		"\7\u00f4\2\2\u06fd\u06fe\5\u0140\u00a1\2\u06fe\u06ff\7\u00f5\2\2\u06ff"+
		"\u013f\3\2\2\2\u0700\u0705\5\u0142\u00a2\2\u0701\u0702\7\u00fa\2\2\u0702"+
		"\u0704\5\u0142\u00a2\2\u0703\u0701\3\2\2\2\u0704\u0707\3\2\2\2\u0705\u0703"+
		"\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0141\3\2\2\2\u0707\u0705\3\2\2\2\u0708"+
		"\u070d\5\u014c\u00a7\2\u0709\u070d\5\u0160\u00b1\2\u070a\u070d\5\u0168"+
		"\u00b5\2\u070b\u070d\5\u0144\u00a3\2\u070c\u0708\3\2\2\2\u070c\u0709\3"+
		"\2\2\2\u070c\u070a\3\2\2\2\u070c\u070b\3\2\2\2\u070d\u0143\3\2\2\2\u070e"+
		"\u070f\7\u0133\2\2\u070f\u0710\5\u00e0q\2\u0710\u0145\3\2\2\2\u0711\u0713"+
		"\5\u013e\u00a0\2\u0712\u0711\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0715\3"+
		"\2\2\2\u0714\u0716\5\u016a\u00b6\2\u0715\u0714\3\2\2\2\u0715\u0716\3\2"+
		"\2\2\u0716\u0718\3\2\2\2\u0717\u0719\5\u0170\u00b9\2\u0718\u0717\3\2\2"+
		"\2\u0718\u0719\3\2\2\2\u0719\u071b\3\2\2\2\u071a\u071c\t\27\2\2\u071b"+
		"\u071a\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071e\3\2\2\2\u071d\u071f\7\u0131"+
		"\2\2\u071e\u071d\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0720\3\2\2\2\u0720"+
		"\u0721\5\u00fe\u0080\2\u0721\u0147\3\2\2\2\u0722\u0728\5\u014a\u00a6\2"+
		"\u0723\u0724\7\u00f4\2\2\u0724\u0725\5\u014a\u00a6\2\u0725\u0726\7\u00f5"+
		"\2\2\u0726\u0728\3\2\2\2\u0727\u0722\3\2\2\2\u0727\u0723\3\2\2\2\u0728"+
		"\u0149\3\2\2\2\u0729\u072a\7\u0117\2\2\u072a\u072b\5:\36\2\u072b\u014b"+
		"\3\2\2\2\u072c\u072d\5v<\2\u072d\u0735\5\u014e\u00a8\2\u072e\u0730\5\u0150"+
		"\u00a9\2\u072f\u072e\3\2\2\2\u0730\u0733\3\2\2\2\u0731\u072f\3\2\2\2\u0731"+
		"\u0732\3\2\2\2\u0732\u0736\3\2\2\2\u0733\u0731\3\2\2\2\u0734\u0736\5\u015e"+
		"\u00b0\2\u0735\u0731\3\2\2\2\u0735\u0734\3\2\2\2\u0735\u0736\3\2\2\2\u0736"+
		"\u014d\3\2\2\2\u0737\u0739\5\u0092J\2\u0738\u073a\5\u00aaV\2\u0739\u0738"+
		"\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073c\3\2\2\2\u073b\u073d\5<\37\2\u073c"+
		"\u073b\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073f\3\2\2\2\u073e\u0740\5@"+
		"!\2\u073f\u073e\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0742\3\2\2\2\u0741"+
		"\u0743\7\u00c7\2\2\u0742\u0741\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0745"+
		"\3\2\2\2\u0744\u0746\7\u00d7\2\2\u0745\u0744\3\2\2\2\u0745\u0746\3\2\2"+
		"\2\u0746\u0759\3\2\2\2\u0747\u0748\5\u0092J\2\u0748\u0749\7\u00f4\2\2"+
		"\u0749\u074e\7\u0160\2\2\u074a\u074b\7\u00fa\2\2\u074b\u074d\7\u0160\2"+
		"\2\u074c\u074a\3\2\2\2\u074d\u0750\3\2\2\2\u074e\u074c\3\2\2\2\u074e\u074f"+
		"\3\2\2\2\u074f\u0751\3\2\2\2\u0750\u074e\3\2\2\2\u0751\u0753\7\u00f5\2"+
		"\2\u0752\u0754\5<\37\2\u0753\u0752\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0756"+
		"\3\2\2\2\u0755\u0757\5@!\2\u0756\u0755\3\2\2\2\u0756\u0757\3\2\2\2\u0757"+
		"\u0759\3\2\2\2\u0758\u0737\3\2\2\2\u0758\u0747\3\2\2\2\u0759\u014f\3\2"+
		"\2\2\u075a\u0766\5\u0152\u00aa\2\u075b\u075d\7\u013b\2\2\u075c\u075b\3"+
		"\2\2\2\u075c\u075d\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u0766\5\u0154\u00ab"+
		"\2\u075f\u0766\7\13\2\2\u0760\u0761\7\35\2\2\u0761\u0766\t\30\2\2\u0762"+
		"\u0763\7\u00b6\2\2\u0763\u0766\t\31\2\2\u0764\u0766\5\u0158\u00ad\2\u0765"+
		"\u075a\3\2\2\2\u0765\u075c\3\2\2\2\u0765\u075f\3\2\2\2\u0765\u0760\3\2"+
		"\2\2\u0765\u0762\3\2\2\2\u0765\u0764\3\2\2\2\u0766\u0151\3\2\2\2\u0767"+
		"\u0772\7\u011b\2\2\u0768\u0769\7\u011a\2\2\u0769\u0772\7\u011b\2\2\u076a"+
		"\u076c\7\u0159\2\2\u076b\u076d\7\u0116\2\2\u076c\u076b\3\2\2\2\u076c\u076d"+
		"\3\2\2\2\u076d\u0772\3\2\2\2\u076e\u0772\5\u00acW\2\u076f\u0770\7\36\2"+
		"\2\u0770\u0772\7\u0160\2\2\u0771\u0767\3\2\2\2\u0771\u0768\3\2\2\2\u0771"+
		"\u076a\3\2\2\2\u0771\u076e\3\2\2\2\u0771\u076f\3\2\2\2\u0772\u0153\3\2"+
		"\2\2\u0773\u0780\7\u011b\2\2\u0774\u0780\7\u0161\2\2\u0775\u0780\7\u0160"+
		"\2\2\u0776\u077a\5\u0156\u00ac\2\u0777\u0778\7\u0149\2\2\u0778\u0779\7"+
		"\u00c8\2\2\u0779\u077b\5\u0156\u00ac\2\u077a\u0777\3\2\2\2\u077a\u077b"+
		"\3\2\2\2\u077b\u0780\3\2\2\2\u077c\u077d\7\u0149\2\2\u077d\u077e\7\u00c8"+
		"\2\2\u077e\u0780\5\u0156\u00ac\2\u077f\u0773\3\2\2\2\u077f\u0774\3\2\2"+
		"\2\u077f\u0775\3\2\2\2\u077f\u0776\3\2\2\2\u077f\u077c\3\2\2\2\u0780\u0155"+
		"\3\2\2\2\u0781\u0783\t\32\2\2\u0782\u0784\5\u00aaV\2\u0783\u0782\3\2\2"+
		"\2\u0783\u0784\3\2\2\2\u0784\u0157\3\2\2\2\u0785\u0786\7\u014e\2\2\u0786"+
		"\u0787\5:\36\2\u0787\u078e\5B\"\2\u0788\u0789\7e\2\2\u0789\u078f\7F\2"+
		"\2\u078a\u078b\7e\2\2\u078b\u078f\7}\2\2\u078c\u078d\7e\2\2\u078d\u078f"+
		"\7\u00a6\2\2\u078e\u0788\3\2\2\2\u078e\u078a\3\2\2\2\u078e\u078c\3\2\2"+
		"\2\u078e\u078f\3\2\2\2\u078f\u0793\3\2\2\2\u0790\u0792\5\u015a\u00ae\2"+
		"\u0791\u0790\3\2\2\2\u0792\u0795\3\2\2\2\u0793\u0791\3\2\2\2\u0793\u0794"+
		"\3\2\2\2\u0794\u0159\3\2\2\2\u0795\u0793\3\2\2\2\u0796\u0797\7\u0149\2"+
		"\2\u0797\u0798\t\33\2\2\u0798\u0799\5\u015c\u00af\2\u0799\u015b\3\2\2"+
		"\2\u079a\u07a3\7\u0097\2\2\u079b\u07a3\7\u0132\2\2\u079c\u079d\7\u0124"+
		"\2\2\u079d\u07a3\7\u011b\2\2\u079e\u079f\7\u0148\2\2\u079f\u07a3\7\5\2"+
		"\2\u07a0\u07a1\7\u0124\2\2\u07a1\u07a3\7\u013b\2\2\u07a2\u079a\3\2\2\2"+
		"\u07a2\u079b\3\2\2\2\u07a2\u079c\3\2\2\2\u07a2\u079e\3\2\2\2\u07a2\u07a0"+
		"\3\2\2\2\u07a3\u015d\3\2\2\2\u07a4\u07a5\7\u0143\2\2\u07a5\u07a7\7\u0130"+
		"\2\2\u07a6\u07a4\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8"+
		"\u07a9\7\u0131\2\2\u07a9\u07ab\5\u00e0q\2\u07aa\u07ac\t\34\2\2\u07ab\u07aa"+
		"\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07b0\3\2\2\2\u07ad\u07af\5\u0152\u00aa"+
		"\2\u07ae\u07ad\3\2\2\2\u07af\u07b2\3\2\2\2\u07b0\u07ae\3\2\2\2\u07b0\u07b1"+
		"\3\2\2\2\u07b1\u015f\3\2\2\2\u07b2\u07b0\3\2\2\2\u07b3\u07b5\7\u0137\2"+
		"\2\u07b4\u07b6\5H%\2\u07b5\u07b4\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u07b8"+
		"\3\2\2\2\u07b7\u07b3\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07bc\3\2\2\2\u07b9"+
		"\u07bd\5\u0162\u00b2\2\u07ba\u07bd\5\u0164\u00b3\2\u07bb\u07bd\5\u0166"+
		"\u00b4\2\u07bc\u07b9\3\2\2\2\u07bc\u07ba\3\2\2\2\u07bc\u07bb\3\2\2\2\u07bd"+
		"\u0161\3\2\2\2\u07be\u07c0\5\u00acW\2\u07bf\u07c1\5J&\2\u07c0\u07bf\3"+
		"\2\2\2\u07c0\u07c1\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c6\5\u00c6d\2"+
		"\u07c3\u07c5\5N(\2\u07c4\u07c3\3\2\2\2\u07c5\u07c8\3\2\2\2\u07c6\u07c4"+
		"\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7\u0163\3\2\2\2\u07c8\u07c6\3\2\2\2\u07c9"+
		"\u07cb\7\u0159\2\2\u07ca\u07cc\5L\'\2\u07cb\u07ca\3\2\2\2\u07cb\u07cc"+
		"\3\2\2\2\u07cc\u07ce\3\2\2\2\u07cd\u07cf\5~@\2\u07ce\u07cd\3\2\2\2\u07ce"+
		"\u07cf\3\2\2\2\u07cf\u07d1\3\2\2\2\u07d0\u07d2\5J&\2\u07d1\u07d0\3\2\2"+
		"\2\u07d1\u07d2\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d7\5B\"\2\u07d4\u07d6"+
		"\5N(\2\u07d5\u07d4\3\2\2\2\u07d6\u07d9\3\2\2\2\u07d7\u07d5\3\2\2\2\u07d7"+
		"\u07d8\3\2\2\2\u07d8\u0165\3\2\2\2\u07d9\u07d7\3\2\2\2\u07da\u07db\7\u0141"+
		"\2\2\u07db\u07dd\7\u0116\2\2\u07dc\u07de\5~@\2\u07dd\u07dc\3\2\2\2\u07dd"+
		"\u07de\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07e0\5\u00c2b\2\u07e0\u07e1"+
		"\5\u0158\u00ad\2\u07e1\u0167\3\2\2\2\u07e2\u07e4\t\35\2\2\u07e3\u07e2"+
		"\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e6\3\2\2\2\u07e5\u07e7\5L\'\2\u07e6"+
		"\u07e5\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e9\3\2\2\2\u07e8\u07ea\5~"+
		"@\2\u07e9\u07e8\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u07ec\3\2\2\2\u07eb"+
		"\u07ed\5J&\2\u07ec\u07eb\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07ee\3\2\2"+
		"\2\u07ee\u07f2\5B\"\2\u07ef\u07f1\5N(\2\u07f0\u07ef\3\2\2\2\u07f1\u07f4"+
		"\3\2\2\2\u07f2\u07f0\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3\u0169\3\2\2\2\u07f4"+
		"\u07f2\3\2\2\2\u07f5\u07fc\5\u016c\u00b7\2\u07f6\u07f8\7\u00fa\2\2\u07f7"+
		"\u07f6\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9\u07fb\5\u016c"+
		"\u00b7\2\u07fa\u07f7\3\2\2\2\u07fb\u07fe\3\2\2\2\u07fc\u07fa\3\2\2\2\u07fc"+
		"\u07fd\3\2\2\2\u07fd\u016b\3\2\2\2\u07fe\u07fc\3\2\2\2\u07ff\u0801\7\13"+
		"\2\2\u0800\u0802\7\u00ec\2\2\u0801\u0800\3\2\2\2\u0801\u0802\3\2\2\2\u0802"+
		"\u0803\3\2\2\2\u0803\u0877\7\u0161\2\2\u0804\u0806\7\r\2\2\u0805\u0807"+
		"\7\u00ec\2\2\u0806\u0805\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0808\3\2\2"+
		"\2\u0808\u0877\7\u0161\2\2\u0809\u080b\7\u013b\2\2\u080a\u0809\3\2\2\2"+
		"\u080a\u080b\3\2\2\2\u080b\u080e\3\2\2\2\u080c\u080f\5<\37\2\u080d\u080f"+
		"\5@!\2\u080e\u080c\3\2\2\2\u080e\u080d\3\2\2\2\u080f\u0877\3\2\2\2\u0810"+
		"\u0812\7\27\2\2\u0811\u0813\7\u00ec\2\2\u0812\u0811\3\2\2\2\u0812\u0813"+
		"\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0877\7\u0161\2\2\u0815\u0817\7\36"+
		"\2\2\u0816\u0818\7\u00ec\2\2\u0817\u0816\3\2\2\2\u0817\u0818\3\2\2\2\u0818"+
		"\u0819\3\2\2\2\u0819\u0877\7\u0160\2\2\u081a\u081c\7!\2\2\u081b\u081d"+
		"\7\u00ec\2\2\u081c\u081b\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u081e\3\2\2"+
		"\2\u081e\u0877\7\u0160\2\2\u081f\u0821\7\"\2\2\u0820\u0822\7\u00ec\2\2"+
		"\u0821\u0820\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0877"+
		"\7\u0160\2\2\u0824\u0825\t\36\2\2\u0825\u0827\7-\2\2\u0826\u0828\7\u00ec"+
		"\2\2\u0827\u0826\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u0829\3\2\2\2\u0829"+
		"\u0877\7\u0160\2\2\u082a\u082c\7,\2\2\u082b\u082d\7\u00ec\2\2\u082c\u082b"+
		"\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u082e\3\2\2\2\u082e\u0877\7\u0161\2"+
		"\2\u082f\u0831\7\65\2\2\u0830\u0832\7\u00ec\2\2\u0831\u0830\3\2\2\2\u0831"+
		"\u0832\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u0877\7\u0160\2\2\u0834\u0836"+
		"\78\2\2\u0835\u0837\7\u00ec\2\2\u0836\u0835\3\2\2\2\u0836\u0837\3\2\2"+
		"\2\u0837\u0838\3\2\2\2\u0838\u0877\5\u016e\u00b8\2\u0839\u083b\7U\2\2"+
		"\u083a\u083c\7\u00ec\2\2\u083b\u083a\3\2\2\2\u083b\u083c\3\2\2\2\u083c"+
		"\u083d\3\2\2\2\u083d\u0877\t\37\2\2\u083e\u0840\7[\2\2\u083f\u0841\7\u00ec"+
		"\2\2\u0840\u083f\3\2\2\2\u0840\u0841\3\2\2\2\u0841\u0842\3\2\2\2\u0842"+
		"\u0877\7\u0161\2\2\u0843\u0845\7i\2\2\u0844\u0846\7\u00ec\2\2\u0845\u0844"+
		"\3\2\2\2\u0845\u0846\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0877\7\u0161\2"+
		"\2\u0848\u084a\7m\2\2\u0849\u084b\7\u00ec\2\2\u084a\u0849\3\2\2\2\u084a"+
		"\u084b\3\2\2\2\u084b\u084c\3\2\2\2\u084c\u0877\7\u0161\2\2\u084d\u084f"+
		"\7{\2\2\u084e\u0850\7\u00ec\2\2\u084f\u084e\3\2\2\2\u084f\u0850\3\2\2"+
		"\2\u0850\u0851\3\2\2\2\u0851\u0877\t \2\2\u0852\u0854\7\u014b\2\2\u0853"+
		"\u0855\7\u00ec\2\2\u0854\u0853\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0856"+
		"\3\2\2\2\u0856\u0877\7\u0160\2\2\u0857\u0859\7\u009d\2\2\u0858\u085a\7"+
		"\u00ec\2\2\u0859\u0858\3\2\2\2\u0859\u085a\3\2\2\2\u085a\u085b\3\2\2\2"+
		"\u085b\u0877\t!\2\2\u085c\u085e\7\u00b3\2\2\u085d\u085f\7\u00ec\2\2\u085e"+
		"\u085d\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u0860\3\2\2\2\u0860\u0877\t "+
		"\2\2\u0861\u0863\7\u00b4\2\2\u0862\u0864\7\u00ec\2\2\u0863\u0862\3\2\2"+
		"\2\u0863\u0864\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u0877\t \2\2\u0866\u0868"+
		"\7\u00b5\2\2\u0867\u0869\7\u00ec\2\2\u0868\u0867\3\2\2\2\u0868\u0869\3"+
		"\2\2\2\u0869\u086a\3\2\2\2\u086a\u0877\7\u0161\2\2\u086b\u086c\7\u00bf"+
		"\2\2\u086c\u086f\5z>\2\u086d\u086e\7\u00b6\2\2\u086e\u0870\t\31\2\2\u086f"+
		"\u086d\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u0877\3\2\2\2\u0871\u0873\7\u0129"+
		"\2\2\u0872\u0874\7\u00ec\2\2\u0873\u0872\3\2\2\2\u0873\u0874\3\2\2\2\u0874"+
		"\u0875\3\2\2\2\u0875\u0877\5\u00be`\2\u0876\u07ff\3\2\2\2\u0876\u0804"+
		"\3\2\2\2\u0876\u080a\3\2\2\2\u0876\u0810\3\2\2\2\u0876\u0815\3\2\2\2\u0876"+
		"\u081a\3\2\2\2\u0876\u081f\3\2\2\2\u0876\u0824\3\2\2\2\u0876\u082a\3\2"+
		"\2\2\u0876\u082f\3\2\2\2\u0876\u0834\3\2\2\2\u0876\u0839\3\2\2\2\u0876"+
		"\u083e\3\2\2\2\u0876\u0843\3\2\2\2\u0876\u0848\3\2\2\2\u0876\u084d\3\2"+
		"\2\2\u0876\u0852\3\2\2\2\u0876\u0857\3\2\2\2\u0876\u085c\3\2\2\2\u0876"+
		"\u0861\3\2\2\2\u0876\u0866\3\2\2\2\u0876\u086b\3\2\2\2\u0876\u0871\3\2"+
		"\2\2\u0877\u016d\3\2\2\2\u0878\u0879\t\"\2\2\u0879\u016f\3\2\2\2\u087a"+
		"\u087b\7\u011f\2\2\u087b\u087e\7\u0109\2\2\u087c\u087f\5\u0172\u00ba\2"+
		"\u087d\u087f\5\u0176\u00bc\2\u087e\u087c\3\2\2\2\u087e\u087d\3\2\2\2\u087f"+
		"\u0882\3\2\2\2\u0880\u0881\7\177\2\2\u0881\u0883\7\u0161\2\2\u0882\u0880"+
		"\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u088b\3\2\2\2\u0884\u0885\7\u00ba\2"+
		"\2\u0885\u0886\7\u0109\2\2\u0886\u0889\5\u0172\u00ba\2\u0887\u0888\7\u00bb"+
		"\2\2\u0888\u088a\7\u0161\2\2\u0889\u0887\3\2\2\2\u0889\u088a\3\2\2\2\u088a"+
		"\u088c\3\2\2\2\u088b\u0884\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u0891\3\2"+
		"\2\2\u088d\u088e\7\u00f4\2\2\u088e\u088f\5\u0178\u00bd\2\u088f\u0890\7"+
		"\u00f5\2\2\u0890\u0892\3\2\2\2\u0891\u088d\3\2\2\2\u0891\u0892\3\2\2\2"+
		"\u0892\u0171\3\2\2\2\u0893\u0895\7_\2\2\u0894\u0893\3\2\2\2\u0894\u0895"+
		"\3\2\2\2\u0895\u08a2\3\2\2\2\u0896\u0899\7K\2\2\u0897\u089a\5\u0174\u00bb"+
		"\2\u0898\u089a\5\u00e0q\2\u0899\u0897\3\2\2\2\u0899\u0898\3\2\2\2\u089a"+
		"\u08a3\3\2\2\2\u089b\u089f\7\u0116\2\2\u089c\u089d\7\b\2\2\u089d\u089e"+
		"\7\u00ec\2\2\u089e\u08a0\7\u0161\2\2\u089f\u089c\3\2\2\2\u089f\u08a0\3"+
		"\2\2\2\u08a0\u08a1\3\2\2\2\u08a1\u08a3\5\u00c2b\2\u08a2\u0896\3\2\2\2"+
		"\u08a2\u089b\3\2\2\2\u08a3\u0173\3\2\2\2\u08a4\u08a5\7\u00f4\2\2\u08a5"+
		"\u08a6\7\u015c\2\2\u08a6\u08a7\5\u00e0q\2\u08a7\u08a8\7\u00f5\2\2\u08a8"+
		"\u0175\3\2\2\2\u08a9\u08ad\t#\2\2\u08aa\u08ae\5\u00e0q\2\u08ab\u08ac\7"+
		"\34\2\2\u08ac\u08ae\5\u00c2b\2\u08ad\u08aa\3\2\2\2\u08ad\u08ab\3\2\2\2"+
		"\u08ae\u0177\3\2\2\2\u08af\u08b4\5\u017a\u00be\2\u08b0\u08b1\7\u00fa\2"+
		"\2\u08b1\u08b3\5\u017a\u00be\2\u08b2\u08b0\3\2\2\2\u08b3\u08b6\3\2\2\2"+
		"\u08b4\u08b2\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5\u0179\3\2\2\2\u08b6\u08b4"+
		"\3\2\2\2\u08b7\u08b8\7\u011f\2\2\u08b8\u08bf\5\u00a0Q\2\u08b9\u08bd\7"+
		"\u00cf\2\2\u08ba\u08be\5\u017e\u00c0\2\u08bb\u08bc\7\u0114\2\2\u08bc\u08be"+
		"\5P)\2\u08bd\u08ba\3\2\2\2\u08bd\u08bb\3\2\2\2\u08be\u08c0\3\2\2\2\u08bf"+
		"\u08b9\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u08c4\3\2\2\2\u08c1\u08c3\5\u017c"+
		"\u00bf\2\u08c2\u08c1\3\2\2\2\u08c3\u08c6\3\2\2\2\u08c4\u08c2\3\2\2\2\u08c4"+
		"\u08c5\3\2\2\2\u08c5\u08d2\3\2\2\2\u08c6\u08c4\3\2\2\2\u08c7\u08c8\7\u00f4"+
		"\2\2\u08c8\u08cd\5\u0180\u00c1\2\u08c9\u08ca\7\u00fa\2\2\u08ca\u08cc\5"+
		"\u0180\u00c1\2\u08cb\u08c9\3\2\2\2\u08cc\u08cf\3\2\2\2\u08cd";
	private static final String _serializedATNSegment1 =
		"\u08cb\3\2\2\2\u08cd\u08ce\3\2\2\2\u08ce\u08d0\3\2\2\2\u08cf\u08cd\3\2"+
		"\2\2\u08d0\u08d1\7\u00f5\2\2\u08d1\u08d3\3\2\2\2\u08d2\u08c7\3\2\2\2\u08d2"+
		"\u08d3\3\2\2\2\u08d3\u017b\3\2\2\2\u08d4\u08d6\7\u00b6\2\2\u08d5\u08d4"+
		"\3\2\2\2\u08d5\u08d6\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d9\78\2\2\u08d8"+
		"\u08da\7\u00ec\2\2\u08d9\u08d8\3\2\2\2\u08d9\u08da\3\2\2\2\u08da\u08db"+
		"\3\2\2\2\u08db\u08fd\5\u016e\u00b8\2\u08dc\u08de\7\36\2\2\u08dd\u08df"+
		"\7\u00ec\2\2\u08de\u08dd\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e0\3\2\2"+
		"\2\u08e0\u08fd\7\u0160\2\2\u08e1\u08e2\7)\2\2\u08e2\u08e4\7-\2\2\u08e3"+
		"\u08e5\7\u00ec\2\2\u08e4\u08e3\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08e6"+
		"\3\2\2\2\u08e6\u08fd\7\u0160\2\2\u08e7\u08e8\7\u0145\2\2\u08e8\u08ea\7"+
		"-\2\2\u08e9\u08eb\7\u00ec\2\2\u08ea\u08e9\3\2\2\2\u08ea\u08eb\3\2\2\2"+
		"\u08eb\u08ec\3\2\2\2\u08ec\u08fd\7\u0160\2\2\u08ed\u08ef\7i\2\2\u08ee"+
		"\u08f0\7\u00ec\2\2\u08ef\u08ee\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u08f1"+
		"\3\2\2\2\u08f1\u08fd\7\u0161\2\2\u08f2\u08f4\7m\2\2\u08f3\u08f5\7\u00ec"+
		"\2\2\u08f4\u08f3\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6"+
		"\u08fd\7\u0161\2\2\u08f7\u08f9\7\u00bf\2\2\u08f8\u08fa\7\u00ec\2\2\u08f9"+
		"\u08f8\3\2\2\2\u08f9\u08fa\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u08fd\5z"+
		">\2\u08fc\u08d5\3\2\2\2\u08fc\u08dc\3\2\2\2\u08fc\u08e1\3\2\2\2\u08fc"+
		"\u08e7\3\2\2\2\u08fc\u08ed\3\2\2\2\u08fc\u08f2\3\2\2\2\u08fc\u08f7\3\2"+
		"\2\2\u08fd\u017d\3\2\2\2\u08fe\u08ff\7^\2\2\u08ff\u0908\7\u00c1\2\2\u0900"+
		"\u0903\7\u00f4\2\2\u0901\u0904\5\u00e0q\2\u0902\u0904\5R*\2\u0903\u0901"+
		"\3\2\2\2\u0903\u0902\3\2\2\2\u0904\u0905\3\2\2\2\u0905\u0906\7\u00f5\2"+
		"\2\u0906\u0909\3\2\2\2\u0907\u0909\7f\2\2\u0908\u0900\3\2\2\2\u0908\u0907"+
		"\3\2\2\2\u0909\u017f\3\2\2\2\u090a\u090b\7\u00ba\2\2\u090b\u090f\5\u00a0"+
		"Q\2\u090c\u090e\5\u017c\u00bf\2\u090d\u090c\3\2\2\2\u090e\u0911\3\2\2"+
		"\2\u090f\u090d\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u0181\3\2\2\2\u0911\u090f"+
		"\3\2\2\2\u0912\u0913\7\u012f\2\2\u0913\u0914\7\u0155\2\2\u0914\u0916\5"+
		":\36\2\u0915\u0917\5\u0184\u00c3\2\u0916\u0915\3\2\2\2\u0916\u0917\3\2"+
		"\2\2\u0917\u0183\3\2\2\2\u0918\u091d\5\u0186\u00c4\2\u0919\u091a\7\u00fa"+
		"\2\2\u091a\u091c\5\u0186\u00c4\2\u091b\u0919\3\2\2\2\u091c\u091f\3\2\2"+
		"\2\u091d\u091b\3\2\2\2\u091d\u091e\3\2\2\2\u091e\u0185\3\2\2\2\u091f\u091d"+
		"\3\2\2\2\u0920\u09b2\5\u016a\u00b6\2\u0921\u09b2\5\u0192\u00ca\2\u0922"+
		"\u09b2\5\u0190\u00c9\2\u0923\u09b2\5\u018e\u00c8\2\u0924\u0926\7\b\2\2"+
		"\u0925\u0927\7\u00ec\2\2\u0926\u0925\3\2\2\2\u0926\u0927\3\2\2\2\u0927"+
		"\u0928\3\2\2\2\u0928\u09b2\t$\2\2\u0929\u092b\7\u012f\2\2\u092a\u092c"+
		"\7\u0134\2\2\u092b\u092a\3\2\2\2\u092b\u092c\3\2\2\2\u092c\u092d\3\2\2"+
		"\2\u092d\u0932\5v<\2\u092e\u092f\7\u0124\2\2\u092f\u0933\7\u013b\2\2\u0930"+
		"\u0931\7\u013e\2\2\u0931\u0933\7\u013b\2\2\u0932\u092e\3\2\2\2\u0932\u0930"+
		"\3\2\2\2\u0933\u09b2\3\2\2\2\u0934\u09b2\5\u0194\u00cb\2\u0935\u0937\7"+
		"\u013b\2\2\u0936\u0935\3\2\2\2\u0936\u0937\3\2\2\2\u0937\u0938\3\2\2\2"+
		"\u0938\u093a\5<\37\2\u0939\u093b\5@!\2\u093a\u0939\3\2\2\2\u093a\u093b"+
		"\3\2\2\2\u093b\u09b2\3\2\2\2\u093c\u093d\7%\2\2\u093d\u093e\7\u0156\2"+
		"\2\u093e\u0940\5<\37\2\u093f\u0941\5@!\2\u0940\u093f\3\2\2\2\u0940\u0941"+
		"\3\2\2\2\u0941\u09b2\3\2\2\2\u0942\u0943\t%\2\2\u0943\u09b2\7Z\2\2\u0944"+
		"\u0945\t&\2\2\u0945\u09b2\7\u00bf\2\2\u0946\u09b2\5\u0198\u00cd\2\u0947"+
		"\u09b2\5\u019a\u00ce\2\u0948\u09b2\5\u019c\u00cf\2\u0949\u094a\7\u013e"+
		"\2\2\u094a\u094b\7\u0141\2\2\u094b\u094c\7\u0116\2\2\u094c\u09b2\5\u019e"+
		"\u00d0\2\u094d\u09b2\7E\2\2\u094e\u0950\7c\2\2\u094f\u0951\7\u00ec\2\2"+
		"\u0950\u094f\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u09b2"+
		"\t\'\2\2\u0953\u09b2\5\u01a0\u00d1\2\u0954\u0955\7\u011e\2\2\u0955\u0956"+
		"\7\u0109\2\2\u0956\u095b\5v<\2\u0957\u0958\7\u00fa\2\2\u0958\u095a\5v"+
		"<\2\u0959\u0957\3\2\2\2\u095a\u095d\3\2\2\2\u095b\u0959\3\2\2\2\u095b"+
		"\u095c\3\2\2\2\u095c\u09b2\3\2\2\2\u095d\u095b\3\2\2\2\u095e\u09b2\5\u01a2"+
		"\u00d2\2\u095f\u09b2\5\u01a4\u00d3\2\u0960\u0961\t(\2\2\u0961\u09b2\7"+
		"\u00cd\2\2\u0962\u0963\7\u012e\2\2\u0963\u0964\7\u011f\2\2\u0964\u09b2"+
		"\5\u0178\u00bd\2\u0965\u0966\7\u013e\2\2\u0966\u0967\7\u011f\2\2\u0967"+
		"\u09b2\5\u01a6\u00d4\2\u0968\u0969\7.\2\2\u0969\u096c\7\u011f\2\2\u096a"+
		"\u096d\5\u01a6\u00d4\2\u096b\u096d\7\u0102\2\2\u096c\u096a\3\2\2\2\u096c"+
		"\u096b\3\2\2\2\u096d\u096e\3\2\2\2\u096e\u09b2\7\u00bf\2\2\u096f\u0970"+
		"\7Q\2\2\u0970\u0973\7\u011f\2\2\u0971\u0974\5\u01a6\u00d4\2\u0972\u0974"+
		"\7\u0102\2\2\u0973\u0971\3\2\2\2\u0973\u0972\3\2\2\2\u0974\u0975\3\2\2"+
		"\2\u0975\u09b2\7\u00bf\2\2\u0976\u0977\7\u0158\2\2\u0977\u097a\7\u011f"+
		"\2\2\u0978\u097b\5\u01a6\u00d4\2\u0979\u097b\7\u0102\2\2\u097a\u0978\3"+
		"\2\2\2\u097a\u0979\3\2\2\2\u097b\u09b2\3\2\2\2\u097c\u097d\7\32\2\2\u097d"+
		"\u097e\7\u011f\2\2\u097e\u09b2\7\u0161\2\2\u097f\u0980\7\u0090\2\2\u0980"+
		"\u0981\7\u011f\2\2\u0981\u0982\5\u01a6\u00d4\2\u0982\u0983\7W\2\2\u0983"+
		"\u0984\5\u0178\u00bd\2\u0984\u09b2\3\2\2\2\u0985\u0986\7;\2\2\u0986\u0987"+
		"\7\u011f\2\2\u0987\u0988\5\u00a0Q\2\u0988\u0989\7\u012c\2\2\u0989\u098a"+
		"\7\u0155\2\2\u098a\u098d\5:\36\2\u098b\u098c\t(\2\2\u098c\u098e\7\u00cd"+
		"\2\2\u098d\u098b\3\2\2\2\u098d\u098e\3\2\2\2\u098e\u09b2\3\2\2\2\u098f"+
		"\u0990\7\t\2\2\u0990\u0993\7\u011f\2\2\u0991\u0994\5\u01a6\u00d4\2\u0992"+
		"\u0994\7\u0102\2\2\u0993\u0991\3\2\2\2\u0993\u0992\3\2\2\2\u0994\u09b2"+
		"\3\2\2\2\u0995\u0996\7\u0133\2\2\u0996\u0999\7\u011f\2\2\u0997\u099a\5"+
		"\u01a6\u00d4\2\u0998\u099a\7\u0102\2\2\u0999\u0997\3\2\2\2\u0999\u0998"+
		"\3\2\2\2\u099a\u09b2\3\2\2\2\u099b\u099c\7w\2\2\u099c\u099f\7\u011f\2"+
		"\2\u099d\u09a0\5\u01a6\u00d4\2\u099e\u09a0\7\u0102\2\2\u099f\u099d\3\2"+
		"\2\2\u099f\u099e\3\2\2\2\u09a0\u09b2\3\2\2\2\u09a1\u09a2\7\u0089\2\2\u09a2"+
		"\u09a5\7\u011f\2\2\u09a3\u09a6\5\u01a6\u00d4\2\u09a4\u09a6\7\u0102\2\2"+
		"\u09a5\u09a3\3\2\2\2\u09a5\u09a4\3\2\2\2\u09a6\u09b2\3\2\2\2\u09a7\u09a8"+
		"\7\u0091\2\2\u09a8\u09ab\7\u011f\2\2\u09a9\u09ac\5\u01a6\u00d4\2\u09aa"+
		"\u09ac\7\u0102\2\2\u09ab\u09a9\3\2\2\2\u09ab\u09aa\3\2\2\2\u09ac\u09b2"+
		"\3\2\2\2\u09ad\u09ae\7\u008e\2\2\u09ae\u09b2\7~\2\2\u09af\u09b0\7\u00c9"+
		"\2\2\u09b0\u09b2\7~\2\2\u09b1\u0920\3\2\2\2\u09b1\u0921\3\2\2\2\u09b1"+
		"\u0922\3\2\2\2\u09b1\u0923\3\2\2\2\u09b1\u0924\3\2\2\2\u09b1\u0929\3\2"+
		"\2\2\u09b1\u0934\3\2\2\2\u09b1\u0936\3\2\2\2\u09b1\u093c\3\2\2\2\u09b1"+
		"\u0942\3\2\2\2\u09b1\u0944\3\2\2\2\u09b1\u0946\3\2\2\2\u09b1\u0947\3\2"+
		"\2\2\u09b1\u0948\3\2\2\2\u09b1\u0949\3\2\2\2\u09b1\u094d\3\2\2\2\u09b1"+
		"\u094e\3\2\2\2\u09b1\u0953\3\2\2\2\u09b1\u0954\3\2\2\2\u09b1\u095e\3\2"+
		"\2\2\u09b1\u095f\3\2\2\2\u09b1\u0960\3\2\2\2\u09b1\u0962\3\2\2\2\u09b1"+
		"\u0965\3\2\2\2\u09b1\u0968\3\2\2\2\u09b1\u096f\3\2\2\2\u09b1\u0976\3\2"+
		"\2\2\u09b1\u097c\3\2\2\2\u09b1\u097f\3\2\2\2\u09b1\u0985\3\2\2\2\u09b1"+
		"\u098f\3\2\2\2\u09b1\u0995\3\2\2\2\u09b1\u099b\3\2\2\2\u09b1\u09a1\3\2"+
		"\2\2\u09b1\u09a7\3\2\2\2\u09b1\u09ad\3\2\2\2\u09b1\u09af\3\2\2\2\u09b2"+
		"\u0187\3\2\2\2\u09b3\u09b5\5\u014c\u00a7\2\u09b4\u09b6\5\u018a\u00c6\2"+
		"\u09b5\u09b4\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u0189\3\2\2\2\u09b7\u09bb"+
		"\7B\2\2\u09b8\u09b9\7\7\2\2\u09b9\u09bb\5v<\2\u09ba\u09b7\3\2\2\2\u09ba"+
		"\u09b8\3\2\2\2\u09bb\u018b\3\2\2\2\u09bc\u09bd\7\u00f4\2\2\u09bd\u09c2"+
		"\5\u014c\u00a7\2\u09be\u09bf\7\u00fa\2\2\u09bf\u09c1\5\u014c\u00a7\2\u09c0"+
		"\u09be\3\2\2\2\u09c1\u09c4\3\2\2\2\u09c2\u09c0\3\2\2\2\u09c2\u09c3\3\2"+
		"\2\2\u09c3\u09c5\3\2\2\2\u09c4\u09c2\3\2\2\2\u09c5\u09c6\7\u00f5\2\2\u09c6"+
		"\u018d\3\2\2\2\u09c7\u09c8\7\u012e\2\2\u09c8\u09c9\5\u0160\u00b1\2\u09c9"+
		"\u018f\3\2\2\2\u09ca\u09cb\7\u012e\2\2\u09cb\u09cc\5\u0168\u00b5\2\u09cc"+
		"\u0191\3\2\2\2\u09cd\u09cf\7\u012e\2\2\u09ce\u09d0\7\u0134\2\2\u09cf\u09ce"+
		"\3\2\2\2\u09cf\u09d0\3\2\2\2\u09d0\u09d3\3\2\2\2\u09d1\u09d4\5\u0188\u00c5"+
		"\2\u09d2\u09d4\5\u018c\u00c7\2\u09d3\u09d1\3\2\2\2\u09d3\u09d2\3\2\2\2"+
		"\u09d4\u0193\3\2\2\2\u09d5\u09d6\5\u0196\u00cc\2\u09d6\u09d7\5v<\2\u09d7"+
		"\u09d9\5\u014c\u00a7\2\u09d8\u09da\5\u018a\u00c6\2\u09d9\u09d8\3\2\2\2"+
		"\u09d9\u09da\3\2\2\2\u09da\u0195\3\2\2\2\u09db\u09dd\7\23\2\2\u09dc\u09de"+
		"\7\u0134\2\2\u09dd\u09dc\3\2\2\2\u09dd\u09de\3\2\2\2\u09de\u0197\3\2\2"+
		"\2\u09df\u09e1\7\u013e\2\2\u09e0\u09e2\7\u0134\2\2\u09e1\u09e0\3\2\2\2"+
		"\u09e1\u09e2\3\2\2\2\u09e2\u09e3\3\2\2\2\u09e3\u09e4\5v<\2\u09e4\u0199"+
		"\3\2\2\2\u09e5\u09e6\7\u013e\2\2\u09e6\u09e7\5L\'\2\u09e7\u09e8\5~@\2"+
		"\u09e8\u019b\3\2\2\2\u09e9\u09ea\7\u013e\2\2\u09ea\u09eb\5\u00acW\2\u09eb"+
		"\u019d\3\2\2\2\u09ec\u09ed\7\u015d\2\2\u09ed\u019f\3\2\2\2\u09ee\u09f0"+
		"\7n\2\2\u09ef\u09f1\7\u0134\2\2\u09f0\u09ef\3\2\2\2\u09f0\u09f1\3\2\2"+
		"\2\u09f1\u09f2\3\2\2\2\u09f2\u09f4\5\u014c\u00a7\2\u09f3\u09f5\5\u018a"+
		"\u00c6\2\u09f4\u09f3\3\2\2\2\u09f4\u09f5\3\2\2\2\u09f5\u01a1\3\2\2\2\u09f6"+
		"\u09f7\7\u008f\2\2\u09f7\u09f8\5L\'\2\u09f8\u09f9\5~@\2\u09f9\u09fa\7"+
		"\u0156\2\2\u09fa\u09fb\5~@\2\u09fb\u01a3\3\2\2\2\u09fc\u09fe\7\u008f\2"+
		"\2\u09fd\u09ff\t)\2\2\u09fe\u09fd\3\2\2\2\u09fe\u09ff\3\2\2\2\u09ff\u0a00"+
		"\3\2\2\2\u0a00\u0a01\5:\36\2\u0a01\u01a5\3\2\2\2\u0a02\u0a07\5\u00a0Q"+
		"\2\u0a03\u0a04\7\u00fa\2\2\u0a04\u0a06\5\u00a0Q\2\u0a05\u0a03\3\2\2\2"+
		"\u0a06\u0a09\3\2\2\2\u0a07\u0a05\3\2\2\2\u0a07\u0a08\3\2\2\2\u0a08\u01a7"+
		"\3\2\2\2\u0a09\u0a07\3\2\2\2\u0a0a\u0a0c\7\u013e\2\2\u0a0b\u0a0d\7\u00c0"+
		"\2\2\u0a0c\u0a0b\3\2\2\2\u0a0c\u0a0d\3\2\2\2\u0a0d\u0a0e\3\2\2\2\u0a0e"+
		"\u0a11\7\u0155\2\2\u0a0f\u0a10\7O\2\2\u0a10\u0a12\7\u010e\2\2\u0a11\u0a0f"+
		"\3\2\2\2\u0a11\u0a12\3\2\2\2\u0a12\u0a13\3\2\2\2\u0a13\u0a14\5\u00c0a"+
		"\2\u0a14\u01a9\3\2\2\2\u0a15\u0a17\7\u0158\2\2\u0a16\u0a18\7\u0155\2\2"+
		"\u0a17\u0a16\3\2\2\2\u0a17\u0a18\3\2\2\2\u0a18\u0a19\3\2\2\2\u0a19\u0a1a"+
		"\5:\36\2\u0a1a\u01ab\3\2\2\2\u0a1b\u0a1d\7\u0124\2\2\u0a1c\u0a1e\t*\2"+
		"\2\u0a1d\u0a1c\3\2\2\2\u0a1d\u0a1e\3\2\2\2\u0a1e\u0a1f\3\2\2\2\u0a1f\u0a20"+
		"\7\u0157\2\2\u0a20\u0a25\5\u01ae\u00d8\2\u0a21\u0a22\7\u00fa\2\2\u0a22"+
		"\u0a24\5\u01ae\u00d8\2\u0a23\u0a21\3\2\2\2\u0a24\u0a27\3\2\2\2\u0a25\u0a23"+
		"\3\2\2\2\u0a25\u0a26\3\2\2\2\u0a26\u01ad\3\2\2\2\u0a27\u0a25\3\2\2\2\u0a28"+
		"\u0a29\7\u0146\2\2\u0a29\u0a2a\7\u0147\2\2\u0a2a\u0a2d\5\u01b0\u00d9\2"+
		"\u0a2b\u0a2d\5\u01b2\u00da\2\u0a2c\u0a28\3\2\2\2\u0a2c\u0a2b\3\2\2\2\u0a2d"+
		"\u01af\3\2\2\2\u0a2e\u0a2f\7\u0092\2\2\u0a2f\u0a34\7\u014d\2\2\u0a30\u0a31"+
		"\7\u014d\2\2\u0a31\u0a34\t+\2\2\u0a32\u0a34\7\u0153\2\2\u0a33\u0a2e\3"+
		"\2\2\2\u0a33\u0a30\3\2\2\2\u0a33\u0a32\3\2\2\2\u0a34\u01b1\3\2\2\2\u0a35"+
		"\u0a36\7\u014d\2\2\u0a36\u0a37\t,\2\2\u0a37\u01b3\3\2\2\2\u0a38\u0a3a"+
		"\7\u0135\2\2\u0a39\u0a3b\7\u015b\2\2\u0a3a\u0a39\3\2\2\2\u0a3a\u0a3b\3"+
		"\2\2\2\u0a3b\u0a41\3\2\2\2\u0a3c\u0a3e\7\u0103\2\2\u0a3d\u0a3f\7\u0148"+
		"\2\2\u0a3e\u0a3d\3\2\2\2\u0a3e\u0a3f\3\2\2\2\u0a3f\u0a40\3\2\2\2\u0a40"+
		"\u0a42\7\22\2\2\u0a41\u0a3c\3\2\2\2\u0a41\u0a42\3\2\2\2\u0a42\u0a47\3"+
		"\2\2\2\u0a43\u0a45\7\u0148\2\2\u0a44\u0a43\3\2\2\2\u0a44\u0a45\3\2\2\2"+
		"\u0a45\u0a46\3\2\2\2\u0a46\u0a48\7\u008c\2\2\u0a47\u0a44\3\2\2\2\u0a47"+
		"\u0a48\3\2\2\2\u0a48\u01b5\3\2\2\2\u0a49\u0a4b\7\16\2\2\u0a4a\u0a4c\7"+
		"\u015b\2\2\u0a4b\u0a4a\3\2\2\2\u0a4b\u0a4c\3\2\2\2\u0a4c\u0a4f\3\2\2\2"+
		"\u0a4d\u0a4f\5\u01b8\u00dd\2\u0a4e\u0a49\3\2\2\2\u0a4e\u0a4d\3\2\2\2\u0a4f"+
		"\u01b7\3\2\2\2\u0a50\u0a51\7\u0154\2\2\u0a51\u0a5a\7\u0157\2\2\u0a52\u0a57"+
		"\5\u01ba\u00de\2\u0a53\u0a54\7\u00fa\2\2\u0a54\u0a56\5\u01ba\u00de\2\u0a55"+
		"\u0a53\3\2\2\2\u0a56\u0a59\3\2\2\2\u0a57\u0a55\3\2\2\2\u0a57\u0a58\3\2"+
		"\2\2\u0a58\u0a5b\3\2\2\2\u0a59\u0a57\3\2\2\2\u0a5a\u0a52\3\2\2\2\u0a5a"+
		"\u0a5b\3\2\2\2\u0a5b\u01b9\3\2\2\2\u0a5c\u0a5d\7\u012c\2\2\u0a5d\u0a5e"+
		"\7$\2\2\u0a5e\u0a62\7\u00a8\2\2\u0a5f\u0a60\7\u014d\2\2\u0a60\u0a62\t"+
		",\2\2\u0a61\u0a5c\3\2\2\2\u0a61\u0a5f\3\2\2\2\u0a62\u01bb\3\2\2\2\u0a63"+
		"\u0a65\7\u0151\2\2\u0a64\u0a66\7\u015b\2\2\u0a65\u0a64\3\2\2\2\u0a65\u0a66"+
		"\3\2\2\2\u0a66\u0a79\3\2\2\2\u0a67\u0a69\7\u0103\2\2\u0a68\u0a6a\7\u0148"+
		"\2\2\u0a69\u0a68\3\2\2\2\u0a69\u0a6a\3\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b"+
		"\u0a6d\7\22\2\2\u0a6c\u0a67\3\2\2\2\u0a6c\u0a6d\3\2\2\2\u0a6d\u0a72\3"+
		"\2\2\2\u0a6e\u0a70\7\u0148\2\2\u0a6f\u0a6e\3\2\2\2\u0a6f\u0a70\3\2\2\2"+
		"\u0a70\u0a71\3\2\2\2\u0a71\u0a73\7\u008c\2\2\u0a72\u0a6f\3\2\2\2\u0a72"+
		"\u0a73\3\2\2\2\u0a73\u0a7a\3\2\2\2\u0a74\u0a76\7\u0156\2\2\u0a75\u0a77"+
		"\7\u009e\2\2\u0a76\u0a75\3\2\2\2\u0a76\u0a77\3\2\2\2\u0a77\u0a78\3\2\2"+
		"\2\u0a78\u0a7a\7\u015d\2\2\u0a79\u0a6c\3\2\2\2\u0a79\u0a74\3\2\2\2\u0a7a"+
		"\u01bd\3\2\2\2\u0a7b\u0a7c\7\u009e\2\2\u0a7c\u0a7d\7\u015d\2\2\u0a7d\u01bf"+
		"\3\2\2\2\u0a7e\u0a7f\7\u0124\2\2\u0a7f\u0a80\7\f\2\2\u0a80\u0a81\7\u00ec"+
		"\2\2\u0a81\u0a82\5\u01c2\u00e2\2\u0a82\u01c1\3\2\2\2\u0a83\u0a84\7\u0161"+
		"\2\2\u0a84\u01c3\3\2\2\2\u0a85\u0a86\7\u0144\2\2\u0a86\u0a88\5\u01c6\u00e4"+
		"\2\u0a87\u0a89\5\u00c6d\2\u0a88\u0a87\3\2\2\2\u0a88\u0a89\3\2\2\2\u0a89"+
		"\u0a91\3\2\2\2\u0a8a\u0a8b\7\u00fa\2\2\u0a8b\u0a8d\5\u01c6\u00e4\2\u0a8c"+
		"\u0a8e\5\u00c6d\2\u0a8d\u0a8c\3\2\2\2\u0a8d\u0a8e\3\2\2\2\u0a8e\u0a90"+
		"\3\2\2\2\u0a8f\u0a8a\3\2\2\2\u0a90\u0a93\3\2\2\2\u0a91\u0a8f\3\2\2\2\u0a91"+
		"\u0a92\3\2\2\2\u0a92\u0a94\3\2\2\2\u0a93\u0a91\3\2\2\2\u0a94\u0a96\7\u0149"+
		"\2\2\u0a95\u0a97\5\u01c8\u00e5\2\u0a96\u0a95\3\2\2\2\u0a96\u0a97\3\2\2"+
		"\2\u0a97\u0a98\3\2\2\2\u0a98\u0a99\5\u01ca\u00e6\2\u0a99\u0a9a\7\u0156"+
		"\2\2\u0a9a\u0a9e\5\u01d8\u00ed\2\u0a9b\u0a9c\7\u012c\2\2\u0a9c\u0a9d\7"+
		"\u0144\2\2\u0a9d\u0a9f\7\u014a\2\2\u0a9e\u0a9b\3\2\2\2\u0a9e\u0a9f\3\2"+
		"\2\2\u0a9f\u01c5\3\2\2\2\u0aa0\u0aa2\7\u0102\2\2\u0aa1\u0aa3\7\u014c\2"+
		"\2\u0aa2\u0aa1\3\2\2\2\u0aa2\u0aa3\3\2\2\2\u0aa3\u0ade\3\2\2\2\u0aa4\u0aa6"+
		"\7\u012f\2\2\u0aa5\u0aa7\7\u009c\2\2\u0aa6\u0aa5\3\2\2\2\u0aa6\u0aa7\3"+
		"\2\2\2\u0aa7\u0ade\3\2\2\2\u0aa8\u0ade\7\u0138\2\2\u0aa9\u0aaa\7\u0138"+
		"\2\2\u0aaa\u0ade\7\u009c\2\2\u0aab\u0aac\7\u0138\2\2\u0aac\u0ade\7\u00bf"+
		"\2\2\u0aad\u0aae\7\u0138\2\2\u0aae\u0aaf\7\u00c0\2\2\u0aaf\u0ade\7\u00be"+
		"\2\2\u0ab0\u0ab1\7\u0138\2\2\u0ab1\u0ade\7\u015a\2\2\u0ab2\u0ab3\7\u0138"+
		"\2\2\u0ab3\u0ade\7\u00d1\2\2\u0ab4\u0ade\7\u013c\2\2\u0ab5\u0ade\7\u013e"+
		"\2\2\u0ab6\u0ade\79\2\2\u0ab7\u0ade\7=\2\2\u0ab8\u0ade\7?\2\2\u0ab9\u0aba"+
		"\7\u0144\2\2\u0aba\u0ade\7\u014a\2\2\u0abb\u0ade\7\u0145\2\2\u0abc\u0ade"+
		"\7T\2\2\u0abd\u0abe\7c\2\2\u0abe\u0ade\7\u00be\2\2\u0abf\u0ade\7\u0085"+
		"\2\2\u0ac0\u0ade\7\u0086\2\2\u0ac1\u0ade\7\u014e\2\2\u0ac2\u0ade\7\u008d"+
		"\2\2\u0ac3\u0ac4\7\u0094\2\2\u0ac4\u0ade\7\31\2\2\u0ac5\u0ac6\7\u0094"+
		"\2\2\u0ac6\u0ade\7\u00a7\2\2\u0ac7\u0ade\7\u009f\2\2\u0ac8\u0ac9\7\u00a4"+
		"\2\2\u0ac9\u0ade\7*\2\2\u0aca\u0acb\7\u00a4\2\2\u0acb\u0ade\7\u00d1\2"+
		"\2\u0acc\u0ade\7\u00a5\2\2\u0acd\u0ade\7\u00bc\2\2\u0ace\u0ade\7\u00c3"+
		"\2\2\u0acf\u0ade\7\u00c8\2\2\u0ad0\u0ade\7\u00ca\2\2\u0ad1\u0ade\7\n\2"+
		"\2\u0ad2\u0ade\7\17\2\2\u0ad3\u0ade\7#\2\2\u0ad4\u0ade\7\66\2\2\u0ad5"+
		"\u0ade\7@\2\2\u0ad6\u0ade\7A\2\2\u0ad7\u0ade\7J\2\2\u0ad8\u0ade\7\u0095"+
		"\2\2\u0ad9\u0ade\7\u009b\2\2\u0ada\u0ade\7\u00a2\2\2\u0adb\u0ade\7\u00bd"+
		"\2\2\u0adc\u0ade\7\u00d0\2\2\u0add\u0aa0\3\2\2\2\u0add\u0aa4\3\2\2\2\u0add"+
		"\u0aa8\3\2\2\2\u0add\u0aa9\3\2\2\2\u0add\u0aab\3\2\2\2\u0add\u0aad\3\2"+
		"\2\2\u0add\u0ab0\3\2\2\2\u0add\u0ab2\3\2\2\2\u0add\u0ab4\3\2\2\2\u0add"+
		"\u0ab5\3\2\2\2\u0add\u0ab6\3\2\2\2\u0add\u0ab7\3\2\2\2\u0add\u0ab8\3\2"+
		"\2\2\u0add\u0ab9\3\2\2\2\u0add\u0abb\3\2\2\2\u0add\u0abc\3\2\2\2\u0add"+
		"\u0abd\3\2\2\2\u0add\u0abf\3\2\2\2\u0add\u0ac0\3\2\2\2\u0add\u0ac1\3\2"+
		"\2\2\u0add\u0ac2\3\2\2\2\u0add\u0ac3\3\2\2\2\u0add\u0ac5\3\2\2\2\u0add"+
		"\u0ac7\3\2\2\2\u0add\u0ac8\3\2\2\2\u0add\u0aca\3\2\2\2\u0add\u0acc\3\2"+
		"\2\2\u0add\u0acd\3\2\2\2\u0add\u0ace\3\2\2\2\u0add\u0acf\3\2\2\2\u0add"+
		"\u0ad0\3\2\2\2\u0add\u0ad1\3\2\2\2\u0add\u0ad2\3\2\2\2\u0add\u0ad3\3\2"+
		"\2\2\u0add\u0ad4\3\2\2\2\u0add\u0ad5\3\2\2\2\u0add\u0ad6\3\2\2\2\u0add"+
		"\u0ad7\3\2\2\2\u0add\u0ad8\3\2\2\2\u0add\u0ad9\3\2\2\2\u0add\u0ada\3\2"+
		"\2\2\u0add\u0adb\3\2\2\2\u0add\u0adc\3\2\2\2\u0ade\u01c7\3\2\2\2\u0adf"+
		"\u0ae0\t-\2\2\u0ae0\u01c9\3\2\2\2\u0ae1\u0ae2\7\u00e5\2\2\u0ae2\u0ae9"+
		"\7\u00e9\2\2\u0ae3\u0ae9\5:\36\2\u0ae4\u0ae5\5p9\2\u0ae5\u0ae6\7\u00e8"+
		"\2\2\u0ae6\u0ae7\5\u009cO\2\u0ae7\u0ae9\3\2\2\2\u0ae8\u0ae1\3\2\2\2\u0ae8"+
		"\u0ae3\3\2\2\2\u0ae8\u0ae4\3\2\2\2\u0ae9\u01cb\3\2\2\2\u0aea\u0aeb\t."+
		"\2\2\u0aeb\u01cd\3\2\2\2\u0aec\u0aef\5\u00a6T\2\u0aed\u0aee\7\u0100\2"+
		"\2\u0aee\u0af0\5\u01cc\u00e7\2\u0aef\u0aed\3\2\2\2\u0aef\u0af0\3\2\2\2"+
		"\u0af0\u01cf\3\2\2\2\u0af1\u0af6\5\u01ce\u00e8\2\u0af2\u0af3\7\u00fa\2"+
		"\2\u0af3\u0af5\5\u01ce\u00e8\2\u0af4\u0af2\3\2\2\2\u0af5\u0af8\3\2\2\2"+
		"\u0af6\u0af4\3\2\2\2\u0af6\u0af7\3\2\2\2\u0af7\u01d1\3\2\2\2\u0af8\u0af6"+
		"\3\2\2\2\u0af9\u0afc\5\u009eP\2\u0afa\u0afb\7\u0100\2\2\u0afb\u0afd\5"+
		"\u01cc\u00e7\2\u0afc\u0afa\3\2\2\2\u0afc\u0afd\3\2\2\2\u0afd\u01d3\3\2"+
		"\2\2\u0afe\u0b03\5\u01d2\u00ea\2\u0aff\u0b00\7\u00fa\2\2\u0b00\u0b02\5"+
		"\u01d2\u00ea\2\u0b01\u0aff\3\2\2\2\u0b02\u0b05\3\2\2\2\u0b03\u0b01\3\2"+
		"\2\2\u0b03\u0b04\3\2\2\2\u0b04\u01d5\3\2\2\2\u0b05\u0b03\3\2\2\2\u0b06"+
		"\u0b09\5\u01ce\u00e8\2\u0b07\u0b09\5\u01d2\u00ea\2\u0b08\u0b06\3\2\2\2"+
		"\u0b08\u0b07\3\2\2\2\u0b09\u01d7\3\2\2\2\u0b0a\u0b0f\5\u01d6\u00ec\2\u0b0b"+
		"\u0b0c\7\u00fa\2\2\u0b0c\u0b0e\5\u01d6\u00ec\2\u0b0d\u0b0b\3\2\2\2\u0b0e"+
		"\u0b11\3\2\2\2\u0b0f\u0b0d\3\2\2\2\u0b0f\u0b10\3\2\2\2\u0b10\u01d9\3\2"+
		"\2\2\u0b11\u0b0f\3\2\2\2\u0b12\u0b13\7\u0144\2\2\u0b13\u0b14\7\u0086\2"+
		"\2\u0b14\u0b15\7\u0149\2\2\u0b15\u0b16\5\u01d6\u00ec\2\u0b16\u0b17\7\u0156"+
		"\2\2\u0b17\u0b1b\5\u01d8\u00ed\2\u0b18\u0b19\7\u012c\2\2\u0b19\u0b1a\7"+
		"\u0144\2\2\u0b1a\u0b1c\7\u014a\2\2\u0b1b\u0b18\3\2\2\2\u0b1b\u0b1c\3\2"+
		"\2\2\u0b1c\u01db\3\2\2\2\u0b1d\u0b1e\7\u0144\2\2\u0b1e\u0b1f\5\u00d4k"+
		"\2\u0b1f\u0b20\7\u0156\2\2\u0b20\u0b24\5\u01d8\u00ed\2\u0b21\u0b22\7\u012c"+
		"\2\2\u0b22\u0b23\7\6\2\2\u0b23\u0b25\7\u014a\2\2\u0b24\u0b21\3\2\2\2\u0b24"+
		"\u0b25\3\2\2\2\u0b25\u01dd\3\2\2\2\u0b26\u0b27\7\u014f\2\2\u0b27\u0b29"+
		"\5\u01c6\u00e4\2\u0b28\u0b2a\5\u00c6d\2\u0b29\u0b28\3\2\2\2\u0b29\u0b2a"+
		"\3\2\2\2\u0b2a\u0b32\3\2\2\2\u0b2b\u0b2c\7\u00fa\2\2\u0b2c\u0b2e\5\u01c6"+
		"\u00e4\2\u0b2d\u0b2f\5\u00c6d\2\u0b2e\u0b2d\3\2\2\2\u0b2e\u0b2f\3\2\2"+
		"\2\u0b2f\u0b31\3\2\2\2\u0b30\u0b2b\3\2\2\2\u0b31\u0b34\3\2\2\2\u0b32\u0b30"+
		"\3\2\2\2\u0b32\u0b33\3\2\2\2\u0b33\u0b35\3\2\2\2\u0b34\u0b32\3\2\2\2\u0b35"+
		"\u0b37\7\u0149\2\2\u0b36\u0b38\5\u01c8\u00e5\2\u0b37\u0b36\3\2\2\2\u0b37"+
		"\u0b38\3\2\2\2\u0b38\u0b39\3\2\2\2\u0b39\u0b3a\5\u01ca\u00e6\2\u0b3a\u0b3b"+
		"\7\u0110\2\2\u0b3b\u0b3c\5\u01d8\u00ed\2\u0b3c\u01df\3\2\2\2\u0b3d\u0b3e"+
		"\7\u014f\2\2\u0b3e\u0b40\7\u0102\2\2\u0b3f\u0b41\7\u014c\2\2\u0b40\u0b3f"+
		"\3\2\2\2\u0b40\u0b41\3\2\2\2\u0b41\u0b42\3\2\2\2\u0b42\u0b43\7\u00fa\2"+
		"\2\u0b43\u0b44\7\u0144\2\2\u0b44\u0b45\7\u014a\2\2\u0b45\u0b46\7\u0110"+
		"\2\2\u0b46\u0b47\5\u01d8\u00ed\2\u0b47\u01e1\3\2\2\2\u0b48\u0b49\7\u014f"+
		"\2\2\u0b49\u0b4a\7\u0086\2\2\u0b4a\u0b4b\7\u0149\2\2\u0b4b\u0b4c\5\u01d6"+
		"\u00ec\2\u0b4c\u0b4d\7\u0110\2\2\u0b4d\u0b4e\5\u01d8\u00ed\2\u0b4e\u01e3"+
		"\3\2\2\2\u0b4f\u0b50\7\u014f\2\2\u0b50\u0b51\5\u00d4k\2\u0b51\u0b52\7"+
		"\u0110\2\2\u0b52\u0b53\5\u01d8\u00ed\2\u0b53\u01e5\3\2\2\2\u0b54\u0b55"+
		"\7\u0138\2\2\u0b55\u0b59\7\u015a\2\2\u0b56\u0b57\7O\2\2\u0b57\u0b58\7"+
		"\u011a\2\2\u0b58\u0b5a\7\u010e\2\2\u0b59\u0b56\3\2\2\2\u0b59\u0b5a\3\2"+
		"\2\2\u0b5a\u0b5b\3\2\2\2\u0b5b\u0b5f\5\u01ec\u00f7\2\u0b5c\u0b5d\7\u013b"+
		"\2\2\u0b5d\u0b5e\7\u0150\2\2\u0b5e\u0b60\5\u01d4\u00eb\2\u0b5f\u0b5c\3"+
		"\2\2\2\u0b5f\u0b60\3\2\2\2\u0b60\u0b70\3\2\2\2\u0b61\u0b6e\7\u0096\2\2"+
		"\u0b62\u0b6f\7q\2\2\u0b63\u0b6b\5\u01f0\u00f9\2\u0b64\u0b66\7\u00fa\2"+
		"\2\u0b65\u0b67\7\u0103\2\2\u0b66\u0b65\3\2\2\2\u0b66\u0b67\3\2\2\2\u0b67"+
		"\u0b68\3\2\2\2\u0b68\u0b6a\5\u01f0\u00f9\2\u0b69\u0b64\3\2\2\2\u0b6a\u0b6d"+
		"\3\2\2\2\u0b6b\u0b69\3\2\2\2\u0b6b\u0b6c\3\2\2\2\u0b6c\u0b6f\3\2\2\2\u0b6d"+
		"\u0b6b\3\2\2\2\u0b6e\u0b62\3\2\2\2\u0b6e\u0b63\3\2\2\2\u0b6f\u0b71\3\2"+
		"\2\2\u0b70\u0b61\3\2\2\2\u0b70\u0b71\3\2\2\2\u0b71\u0b7b\3\2\2\2\u0b72"+
		"\u0b73\7\u012c\2\2\u0b73\u0b78\5\u01f2\u00fa\2\u0b74\u0b75\7\u00fa\2\2"+
		"\u0b75\u0b77\5\u01f2\u00fa\2\u0b76\u0b74\3\2\2\2\u0b77\u0b7a\3\2\2\2\u0b78"+
		"\u0b76\3\2\2\2\u0b78\u0b79\3\2\2\2\u0b79\u0b7c\3\2\2\2\u0b7a\u0b78\3\2"+
		"\2\2\u0b7b\u0b72\3\2\2\2\u0b7b\u0b7c\3\2\2\2\u0b7c\u0b81\3\2\2\2\u0b7d"+
		"\u0b80\5\u01f4\u00fb\2\u0b7e\u0b80\5\u01f6\u00fc\2\u0b7f\u0b7d\3\2\2\2"+
		"\u0b7f\u0b7e\3\2\2\2\u0b80\u0b83\3\2\2\2\u0b81\u0b7f\3\2\2\2\u0b81\u0b82"+
		"\3\2\2\2\u0b82\u01e7\3\2\2\2\u0b83\u0b81\3\2\2\2\u0b84\u0b85\7N\2\2\u0b85"+
		"\u0b86\7\u0109\2\2\u0b86\u0b89\7\u0160\2\2\u0b87\u0b88\7\u0093\2\2\u0b88"+
		"\u0b8a\7\u0160\2\2\u0b89\u0b87\3\2\2\2\u0b89\u0b8a\3\2\2\2\u0b8a\u0b8e"+
		"\3\2\2\2\u0b8b\u0b8c\7\u0098\2\2\u0b8c\u0b8d\7\u0139\2\2\u0b8d\u0b8f\7"+
		"\u014b\2\2\u0b8e\u0b8b\3\2\2\2\u0b8e\u0b8f\3\2\2\2\u0b8f\u0bab\3\2\2\2"+
		"\u0b90\u0b91\7N\2\2\u0b91\u0b92\7\u012c\2\2\u0b92\u0bab\5\u01ee\u00f8"+
		"\2\u0b93\u0b94\7N\2\2\u0b94\u0b95\7\u012c\2\2\u0b95\u0b96\5\u01ee\u00f8"+
		"\2\u0b96\u0b97\7\u0109\2\2\u0b97\u0b9a\7\u0160\2\2\u0b98\u0b99\7\u0093"+
		"\2\2\u0b99\u0b9b\7\u0160\2\2\u0b9a\u0b98\3\2\2\2\u0b9a\u0b9b\3\2\2\2\u0b9b"+
		"\u0b9f\3\2\2\2\u0b9c\u0b9d\7\u0098\2\2\u0b9d\u0b9e\7\u0139\2\2\u0b9e\u0ba0"+
		"\7\u014b\2\2\u0b9f\u0b9c\3\2\2\2\u0b9f\u0ba0\3\2\2\2\u0ba0\u0bab\3\2\2"+
		"\2\u0ba1\u0ba2\7N\2\2\u0ba2\u0ba3\7\u012c\2\2\u0ba3\u0ba4\5\u01ee\u00f8"+
		"\2\u0ba4\u0ba5\7\u0131\2\2\u0ba5\u0ba6\7\u0160\2\2\u0ba6\u0bab\3\2\2\2"+
		"\u0ba7\u0ba8\7.\2\2\u0ba8\u0ba9\7t\2\2\u0ba9\u0bab\7\u014b\2\2\u0baa\u0b84"+
		"\3\2\2\2\u0baa\u0b90\3\2\2\2\u0baa\u0b93\3\2\2\2\u0baa\u0ba1\3\2\2\2\u0baa"+
		"\u0ba7\3\2\2\2\u0bab\u01e9\3\2\2\2\u0bac\u0bae\5\u01ce\u00e8\2\u0bad\u0baf"+
		"\5\u01e8\u00f5\2\u0bae\u0bad\3\2\2\2\u0bae\u0baf\3\2\2\2\u0baf\u01eb\3"+
		"\2\2\2\u0bb0\u0bb5\5\u01ea\u00f6\2\u0bb1\u0bb2\7\u00fa\2\2\u0bb2\u0bb4"+
		"\5\u01ea\u00f6\2\u0bb3\u0bb1\3\2\2\2\u0bb4\u0bb7\3\2\2\2\u0bb5\u0bb3\3"+
		"\2\2\2\u0bb5\u0bb6\3\2\2\2\u0bb6\u01ed\3\2\2\2\u0bb7\u0bb5\3\2\2\2\u0bb8"+
		"\u0bb9\7\u015d\2\2\u0bb9\u01ef\3\2\2\2\u0bba\u0bc3\7\u00b2\2\2\u0bbb\u0bbc"+
		"\7\30\2\2\u0bbc\u0bc3\7\u0160\2\2\u0bbd\u0bbe\7X\2\2\u0bbe\u0bc3\7\u0160"+
		"\2\2\u0bbf\u0bc0\7\u00b9\2\2\u0bc0\u0bc3\7\u0160\2\2\u0bc1\u0bc3\7\u015d"+
		"\2\2\u0bc2\u0bba\3\2\2\2\u0bc2\u0bbb\3\2\2\2\u0bc2\u0bbd\3\2\2\2\u0bc2"+
		"\u0bbf\3\2\2\2\u0bc2\u0bc1\3\2\2\2\u0bc3\u01f1\3\2\2\2\u0bc4\u0bc5\7h"+
		"\2\2\u0bc5\u0bcd\7\u0161\2\2\u0bc6\u0bc7\7j\2\2\u0bc7\u0bcd\7\u0161\2"+
		"\2\u0bc8\u0bc9\7g\2\2\u0bc9\u0bcd\7\u0161\2\2\u0bca\u0bcb\7k\2\2\u0bcb"+
		"\u0bcd\7\u0161\2\2\u0bcc\u0bc4\3\2\2\2\u0bcc\u0bc6\3\2\2\2\u0bcc\u0bc8"+
		"\3\2\2\2\u0bcc\u0bca\3\2\2\2\u0bcd\u01f3\3\2\2\2\u0bce\u0bcf\7\u014b\2"+
		"\2\u0bcf\u0bd5\7>\2\2\u0bd0\u0bd6\7\u013b\2\2\u0bd1\u0bd6\7p\2\2\u0bd2"+
		"\u0bd3\7V\2\2\u0bd3\u0bd4\7\u0161\2\2\u0bd4\u0bd6\7\u013a\2\2\u0bd5\u0bd0"+
		"\3\2\2\2\u0bd5\u0bd1\3\2\2\2\u0bd5\u0bd2\3\2\2\2\u0bd5\u0bd6\3\2\2\2\u0bd6"+
		"\u0be9\3\2\2\2\u0bd7\u0bd8\7\u014b\2\2\u0bd8\u0bd9\7M\2\2\u0bd9\u0be9"+
		"\t \2\2\u0bda\u0bdb\7\u014b\2\2\u0bdb\u0bdc\7\u0099\2\2\u0bdc\u0be0\7"+
		"V\2\2\u0bdd\u0be1\7\u013b\2\2\u0bde\u0bdf\7\u0161\2\2\u0bdf\u0be1\7\u013a"+
		"\2\2\u0be0\u0bdd\3\2\2\2\u0be0\u0bde\3\2\2\2\u0be1\u0be9\3\2\2\2\u0be2"+
		"\u0be3\7\u014b\2\2\u0be3\u0be4\7\u0096\2\2\u0be4\u0be6\7\u0139\2\2\u0be5"+
		"\u0be7\t/\2\2\u0be6\u0be5\3\2\2\2\u0be6\u0be7\3\2\2\2\u0be7\u0be9\3\2"+
		"\2\2\u0be8\u0bce\3\2\2\2\u0be8\u0bd7\3\2\2\2\u0be8\u0bda\3\2\2\2\u0be8"+
		"\u0be2\3\2\2\2\u0be9\u01f5\3\2\2\2\u0bea\u0beb\7\4\2\2\u0beb\u0bec\t\60"+
		"\2\2\u0bec\u01f7\3\2\2\2\u0bed\u0bee\7\u012f\2\2\u0bee\u0bf1\7\u015a\2"+
		"\2\u0bef\u0bf0\7O\2\2\u0bf0\u0bf2\7\u010e\2\2\u0bf1\u0bef\3\2\2\2\u0bf1"+
		"\u0bf2\3\2\2\2\u0bf2\u0bf3\3\2\2\2\u0bf3\u0c03\5\u01ec\u00f7\2\u0bf4\u0c01"+
		"\7\u0096\2\2\u0bf5\u0c02\7q\2\2\u0bf6\u0bfe\5\u01f0\u00f9\2\u0bf7\u0bf9"+
		"\7\u00fa\2\2\u0bf8\u0bfa\7\u0103\2\2\u0bf9\u0bf8\3\2\2\2\u0bf9\u0bfa\3"+
		"\2\2\2\u0bfa\u0bfb\3\2\2\2\u0bfb\u0bfd\5\u01f0\u00f9\2\u0bfc\u0bf7\3\2"+
		"\2\2\u0bfd\u0c00\3\2\2\2\u0bfe\u0bfc\3\2\2\2\u0bfe\u0bff\3\2\2\2\u0bff"+
		"\u0c02\3\2\2\2\u0c00\u0bfe\3\2\2\2\u0c01\u0bf5\3\2\2\2\u0c01\u0bf6\3\2"+
		"\2\2\u0c02\u0c04\3\2\2\2\u0c03\u0bf4\3\2\2\2\u0c03\u0c04\3\2\2\2\u0c04"+
		"\u0c0e\3\2\2\2\u0c05\u0c06\7\u012c\2\2\u0c06\u0c0b\5\u01f2\u00fa\2\u0c07"+
		"\u0c08\7\u00fa\2\2\u0c08\u0c0a\5\u01f2\u00fa\2\u0c09\u0c07\3\2\2\2\u0c0a"+
		"\u0c0d\3\2\2\2\u0c0b\u0c09\3\2\2\2\u0c0b\u0c0c\3\2\2\2\u0c0c\u0c0f\3\2"+
		"\2\2\u0c0d\u0c0b\3\2\2\2\u0c0e\u0c05\3\2\2\2\u0c0e\u0c0f\3\2\2\2\u0c0f"+
		"\u0c14\3\2\2\2\u0c10\u0c13\5\u01f4\u00fb\2\u0c11\u0c13\5\u01f6\u00fc\2"+
		"\u0c12\u0c10\3\2\2\2\u0c12\u0c11\3\2\2\2\u0c13\u0c16\3\2\2\2\u0c14\u0c12"+
		"\3\2\2\2\u0c14\u0c15\3\2\2\2\u0c15\u01f9\3\2\2\2\u0c16\u0c14\3\2\2\2\u0c17"+
		"\u0c18\7\u012f\2\2\u0c18\u0c1b\7\u015a\2\2\u0c19\u0c1a\7O\2\2\u0c1a\u0c1c"+
		"\7\u010e\2\2\u0c1b\u0c19\3\2\2\2\u0c1b\u0c1c\3\2\2\2\u0c1c\u0c1d\3\2\2"+
		"\2\u0c1d\u0c1e\7\u015a\2\2\u0c1e\u0c1f\3\2\2\2\u0c1f\u0c20\5\u01fc\u00ff"+
		"\2\u0c20\u01fb\3\2\2\2\u0c21\u0c22\7N\2\2\u0c22\u0c23\7\u0109\2\2\u0c23"+
		"\u0c26\7\u0160\2\2\u0c24\u0c25\7\u0093\2\2\u0c25\u0c27\7\u0160\2\2\u0c26"+
		"\u0c24\3\2\2\2\u0c26\u0c27\3\2\2\2\u0c27\u0c2b\3\2\2\2\u0c28\u0c29\7\u0098"+
		"\2\2\u0c29\u0c2a\7\u0139\2\2\u0c2a\u0c2c\7\u014b\2\2\u0c2b\u0c28\3\2\2"+
		"\2\u0c2b\u0c2c\3\2\2\2\u0c2c\u0c31\3\2\2\2\u0c2d\u0c2e\7.\2\2\u0c2e\u0c2f"+
		"\7t\2\2\u0c2f\u0c31\7\u014b\2\2\u0c30\u0c21\3\2\2\2\u0c30\u0c2d\3\2\2"+
		"\2\u0c31\u01fd\3\2\2\2\u0c32\u0c33\7\u012f\2\2\u0c33\u0c36\7\u015a\2\2"+
		"\u0c34\u0c35\7O\2\2\u0c35\u0c37\7\u010e\2\2\u0c36\u0c34\3\2\2\2\u0c36"+
		"\u0c37\3\2\2\2\u0c37\u0c38\3\2\2\2\u0c38\u0c39\5\u01ce\u00e8\2\u0c39\u0c3a"+
		"\7\u013b\2\2\u0c3a\u0c3e\7\u0150\2\2\u0c3b\u0c3f\7q\2\2\u0c3c\u0c3f\7"+
		"\u0102\2\2\u0c3d\u0c3f\5\u01d4\u00eb\2\u0c3e\u0c3b\3\2\2\2\u0c3e\u0c3c"+
		"\3\2\2\2\u0c3e\u0c3d\3\2\2\2\u0c3f\u01ff\3\2\2\2\u0c40\u0c41\7\u013e\2"+
		"\2\u0c41\u0c44\7\u015a\2\2\u0c42\u0c43\7O\2\2\u0c43\u0c45\7\u010e\2\2"+
		"\u0c44\u0c42\3\2\2\2\u0c44\u0c45\3\2\2\2\u0c45\u0c46\3\2\2\2\u0c46\u0c47"+
		"\5\u01d0\u00e9\2\u0c47\u0201\3\2\2\2\u0c48\u0c49\7\u008f\2\2\u0c49\u0c4a"+
		"\7\u015a\2\2\u0c4a\u0c4b\5\u01ce\u00e8\2\u0c4b\u0c4c\7\u0156\2\2\u0c4c"+
		"\u0c53\5\u01ce\u00e8\2\u0c4d\u0c4e\5\u01ce\u00e8\2\u0c4e\u0c4f\7\u0156"+
		"\2\2\u0c4f\u0c50\5\u01ce\u00e8\2\u0c50\u0c52\3\2\2\2\u0c51\u0c4d\3\2\2"+
		"\2\u0c52\u0c55\3\2\2\2\u0c53\u0c51\3\2\2\2\u0c53\u0c54\3\2\2\2\u0c54\u0203"+
		"\3\2\2\2\u0c55\u0c53\3\2\2\2\u0c56\u0c57\7\u0138\2\2\u0c57\u0c5b\7\u0150"+
		"\2\2\u0c58\u0c59\7O\2\2\u0c59\u0c5a\7\u011a\2\2\u0c5a\u0c5c\7\u010e\2"+
		"\2\u0c5b\u0c58\3\2\2\2\u0c5b\u0c5c\3\2\2\2\u0c5c\u0c5d\3\2\2\2\u0c5d\u0c5e"+
		"\5\u01d4\u00eb\2\u0c5e\u0205\3\2\2\2\u0c5f\u0c60\7\u013e\2\2\u0c60\u0c63"+
		"\7\u0150\2\2\u0c61\u0c62\7O\2\2\u0c62\u0c64\7\u010e\2\2\u0c63\u0c61\3"+
		"\2\2\2\u0c63\u0c64\3\2\2\2\u0c64\u0c65\3\2\2\2\u0c65\u0c66\5\u01d4\u00eb"+
		"\2\u0c66\u0207\3\2\2\2\u0c67\u0c68\7\u0124\2\2\u0c68\u0c6b\7\u014b\2\2"+
		"\u0c69\u0c6a\7\u0140\2\2\u0c6a\u0c6c\5\u01ce\u00e8\2\u0c6b\u0c69\3\2\2"+
		"\2\u0c6b\u0c6c\3\2\2\2\u0c6c\u0c6d\3\2\2\2\u0c6d\u0c6e\7\u00ec\2\2\u0c6e"+
		"\u0c71\7\u0160\2\2\u0c6f\u0c70\7\u0093\2\2\u0c70\u0c72\7\u0160\2\2\u0c71"+
		"\u0c6f\3\2\2\2\u0c71\u0c72\3\2\2\2\u0c72\u0c76\3\2\2\2\u0c73\u0c74\7\u0098"+
		"\2\2\u0c74\u0c75\7\u0139\2\2\u0c75\u0c77\7\u014b\2\2\u0c76\u0c73\3\2\2"+
		"\2\u0c76\u0c77\3\2\2\2\u0c77\u0209\3\2\2\2\u0c78\u0c79\7\u0124\2\2\u0c79"+
		"\u0c7a\7\u013b\2\2\u0c7a\u0c7e\7\u0150\2\2\u0c7b\u0c7f\7q\2\2\u0c7c\u0c7f"+
		"\7\u0102\2\2\u0c7d\u0c7f\5\u01d4\u00eb\2\u0c7e\u0c7b\3\2\2\2\u0c7e\u0c7c"+
		"\3\2\2\2\u0c7e\u0c7d\3\2\2\2\u0c7f\u0c80\3\2\2\2\u0c80\u0c81\7\u0156\2"+
		"\2\u0c81\u0c82\5\u01d0\u00e9\2\u0c82\u020b\3\2\2\2\u0c83\u0c84\7\u0124"+
		"\2\2\u0c84\u0c8c\7\u0150\2\2\u0c85\u0c8d\7\u013b\2\2\u0c86\u0c8d\7q\2"+
		"\2\u0c87\u0c8d\7\u0102\2\2\u0c88\u0c89\7\u0102\2\2\u0c89\u0c8a\7:\2\2"+
		"\u0c8a\u0c8d\5\u01d4\u00eb\2\u0c8b\u0c8d\5\u01d4\u00eb\2\u0c8c\u0c85\3"+
		"\2\2\2\u0c8c\u0c86\3\2\2\2\u0c8c\u0c87\3\2\2\2\u0c8c\u0c88\3\2\2\2\u0c8c"+
		"\u0c8b\3\2\2\2\u0c8d\u020d\3\2\2\2\u0191\u0230\u0233\u0237\u023b\u0242"+
		"\u0249\u0250\u0253\u0256\u0259\u025c\u025f\u0262\u026b\u026e\u0271\u0274"+
		"\u0277\u027a\u027d\u0280\u0288\u0297\u029e\u02a1\u02ae\u02b1\u02c2\u02c9"+
		"\u02d1\u02d7\u02da\u02df\u02e2\u02e5\u02e8\u02ec\u02f4\u02f7\u02fc\u0306"+
		"\u0310\u0314\u031a\u0321\u032c\u0330\u0337\u033a\u033d\u0342\u034e\u0353"+
		"\u0358\u035b\u0361\u036e\u0375\u0378\u0383\u038c\u0397\u039e\u03a3\u03a7"+
		"\u03ac\u03b1\u03b5\u03c8\u03cb\u03ce\u03d1\u03d4\u03e1\u03ef\u03fa\u03fd"+
		"\u0400\u0442\u0444\u0449\u0454\u0460\u0467\u046b\u0472\u047a\u0482\u048e"+
		"\u049a\u04a6\u04ae\u04b6\u04c2\u04ca\u04d2\u04da\u04e2\u04ea\u04f2\u0504"+
		"\u0515\u0517\u0522\u0531\u0533\u053a\u0541\u054a\u0551\u055f\u0567\u056c"+
		"\u0572\u059e\u05a0\u05bb\u05c2\u05c4\u05d9\u05de\u05e2\u05e4\u05f3\u05f9"+
		"\u05fc\u0601\u0606\u0616\u061b\u0628\u062e\u0637\u063c\u0640\u0645\u0649"+
		"\u0651\u0656\u065a\u065f\u0662\u0665\u0668\u066a\u066e\u0672\u0676\u0679"+
		"\u067d\u0683\u0686\u068a\u0692\u06a1\u06a8\u06b4\u06b7\u06bb\u06be\u06c1"+
		"\u06c6\u06c9\u06cc\u06d0\u06d5\u06dd\u06e5\u06eb\u06f3\u06f7\u06fa\u0705"+
		"\u070c\u0712\u0715\u0718\u071b\u071e\u0727\u0731\u0735\u0739\u073c\u073f"+
		"\u0742\u0745\u074e\u0753\u0756\u0758\u075c\u0765\u076c\u0771\u077a\u077f"+
		"\u0783\u078e\u0793\u07a2\u07a6\u07ab\u07b0\u07b5\u07b7\u07bc\u07c0\u07c6"+
		"\u07cb\u07ce\u07d1\u07d7\u07dd\u07e3\u07e6\u07e9\u07ec\u07f2\u07f7\u07fc"+
		"\u0801\u0806\u080a\u080e\u0812\u0817\u081c\u0821\u0827\u082c\u0831\u0836"+
		"\u083b\u0840\u0845\u084a\u084f\u0854\u0859\u085e\u0863\u0868\u086f\u0873"+
		"\u0876\u087e\u0882\u0889\u088b\u0891\u0894\u0899\u089f\u08a2\u08ad\u08b4"+
		"\u08bd\u08bf\u08c4\u08cd\u08d2\u08d5\u08d9\u08de\u08e4\u08ea\u08ef\u08f4"+
		"\u08f9\u08fc\u0903\u0908\u090f\u0916\u091d\u0926\u092b\u0932\u0936\u093a"+
		"\u0940\u0950\u095b\u096c\u0973\u097a\u098d\u0993\u0999\u099f\u09a5\u09ab"+
		"\u09b1\u09b5\u09ba\u09c2\u09cf\u09d3\u09d9\u09dd\u09e1\u09f0\u09f4\u09fe"+
		"\u0a07\u0a0c\u0a11\u0a17\u0a1d\u0a25\u0a2c\u0a33\u0a3a\u0a3e\u0a41\u0a44"+
		"\u0a47\u0a4b\u0a4e\u0a57\u0a5a\u0a61\u0a65\u0a69\u0a6c\u0a6f\u0a72\u0a76"+
		"\u0a79\u0a88\u0a8d\u0a91\u0a96\u0a9e\u0aa2\u0aa6\u0add\u0ae8\u0aef\u0af6"+
		"\u0afc\u0b03\u0b08\u0b0f\u0b1b\u0b24\u0b29\u0b2e\u0b32\u0b37\u0b40\u0b59"+
		"\u0b5f\u0b66\u0b6b\u0b6e\u0b70\u0b78\u0b7b\u0b7f\u0b81\u0b89\u0b8e\u0b9a"+
		"\u0b9f\u0baa\u0bae\u0bb5\u0bc2\u0bcc\u0bd5\u0be0\u0be6\u0be8\u0bf1\u0bf9"+
		"\u0bfe\u0c01\u0c03\u0c0b\u0c0e\u0c12\u0c14\u0c1b\u0c26\u0c2b\u0c30\u0c36"+
		"\u0c3e\u0c44\u0c53\u0c5b\u0c63\u0c6b\u0c71\u0c76\u0c7e\u0c8c";
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