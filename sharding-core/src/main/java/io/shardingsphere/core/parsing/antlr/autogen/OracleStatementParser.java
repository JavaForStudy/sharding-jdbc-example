// Generated from io/shardingsphere/core/parsing/antlr/autogen/OracleStatement.g4 by ANTLR 4.7.1
package io.shardingsphere.core.parsing.antlr.autogen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OracleStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ACCOUNT=2, ADMIN=3, AT=4, AUTHENTICATION=5, BATCH=6, BITMAP=7, 
		CACHE=8, CASE=9, CHECKPOINT=10, COMMENT=11, CONNECT=12, CONSTRAINTS=13, 
		CONTAINER=14, CONTAINER_DATA=15, CYCLE=16, DBTIMEZONE=17, DECRYPT=18, 
		DEFERRABLE=19, DEFERRED=20, DELEGATE=21, DIRECTORY=22, DOUBLE=23, EDITION=24, 
		EDITIONS=25, ELEMENT=26, ELSE=27, ENCRYPT=28, END=29, ENTERPRISE=30, EXCEPT=31, 
		EXCEPTIONS=32, EXPIRE=33, EXTERNALLY=34, FORCE=35, GLOBAL=36, GLOBALLY=37, 
		HIERARCHY=38, IDENTIFIED=39, IDENTITY=40, IMMEDIATE=41, INCREMENT=42, 
		INITIALLY=43, INTERVAL=44, INTO=45, INVALIDATE=46, JAVA=47, KEEP=48, LEVELS=49, 
		LOCAL=50, LOCK=51, MAXVALUE=52, MINING=53, MINVALUE=54, MODEL=55, MODIFY=56, 
		MONTH=57, NAME=58, NATIONAL=59, NEW=60, NOCACHE=61, NOCYCLE=62, NOMAXVALUE=63, 
		NOMINVALUE=64, NONE=65, NOORDER=66, NORELY=67, NOVALIDATE=68, NOWAIT=69, 
		OF=70, ONLY=71, PACKAGE=72, PRECISION=73, PRESERVE=74, PRIOR=75, PROCEDURE=76, 
		PROFILE=77, PUBLIC=78, QUOTA=79, REF=80, REKEY=81, RELY=82, REMOVE=83, 
		RENAME=84, REPLACE=85, REQUIRED=86, RESOURCE=87, ROLES=88, ROWID=89, SALT=90, 
		SAVEPOINT=91, SCOPE=92, SECOND=93, SEGMENT=94, SORT=95, SOURCE=96, SQL=97, 
		SQLRF=98, SUBSTITUTABLE=99, TABLESPACE=100, TEMPORARY=101, THEN=102, THROUGH=103, 
		TRANSLATION=104, TREAT=105, TYPE=106, UNLIMITED=107, UNLOCK=108, UNUSED=109, 
		USE=110, USERS=111, USING=112, VALIDATE=113, VALUE=114, VARYING=115, VIRTUAL=116, 
		WAIT=117, WHEN=118, WRITE=119, ZONE=120, AND_=121, OR_=122, NOT_=123, 
		UNARY_BIT_COMPLEMENT=124, BIT_INCLUSIVE_OR=125, BIT_AND=126, SIGNED_LEFT_SHIFT=127, 
		SIGNED_RIGHT_SHIFT=128, BIT_EXCLUSIVE_OR=129, MOD_=130, COLON=131, PLUS=132, 
		MINUS=133, ASTERISK=134, SLASH=135, BACKSLASH=136, DOT=137, DOT_ASTERISK=138, 
		SAFE_EQ=139, EQ=140, EQ_=141, NEQ=142, NEQ_=143, GT=144, GTE=145, LT=146, 
		LTE=147, POUND_=148, LP_=149, RP_=150, LBE_=151, RBE_=152, LBT_=153, RBT_=154, 
		COMMA=155, DQ_=156, SQ_=157, BQ_=158, UL_=159, QUESTION=160, AT_=161, 
		SEMI_=162, ALL=163, AND=164, ANY=165, ASC=166, BETWEEN=167, BINARY=168, 
		BIT_NUM=169, BY=170, DATE=171, DESC=172, DISTINCT=173, ESCAPE=174, EXISTS=175, 
		FALSE=176, FROM=177, GROUP=178, HAVING=179, HIDDEN_=180, IN=181, IS=182, 
		KEY=183, LIKE=184, LIMIT=185, MOD=186, NOT=187, NULL=188, OFFSET=189, 
		OR=190, ORDER=191, PARTITION=192, PRIMARY=193, REGEXP=194, ROLLUP=195, 
		ROW=196, SET=197, SOUNDS=198, TIME=199, TIMESTAMP=200, TRUE=201, UNION=202, 
		UNKNOWN=203, WHERE=204, WITH=205, XOR=206, ADD=207, ALTER=208, ALWAYS=209, 
		AS=210, CASCADE=211, CHECK=212, COLUMN=213, COMMIT=214, COMMITTED=215, 
		CONSTRAINT=216, CREATE=217, CURRENT=218, DAY=219, DEFAULT=220, DELETE=221, 
		DISABLE=222, DROP=223, ENABLE=224, FOR=225, FOREIGN=226, FUNCTION=227, 
		GENERATED=228, GRANT=229, INDEX=230, ISOLATION=231, LEVEL=232, NO=233, 
		ON=234, OPTION=235, PASSWORD=236, PRIVILEGES=237, READ=238, REFERENCES=239, 
		REVOKE=240, ROLE=241, ROLLBACK=242, ROWS=243, SERIALIZABLE=244, START=245, 
		TABLE=246, TO=247, TRANSACTION=248, TRUNCATE=249, UNIQUE=250, USER=251, 
		WORK=252, YEAR=253, ID=254, BLOCK_COMMENT=255, SL_COMMENT=256, STRING=257, 
		NUMBER=258, INT_=259, EXP=260, HEX_DIGIT=261, WS=262, ACTION=263, AFTER=264, 
		ALGORITHM=265, ANALYZE=266, AUDIT_ADMIN=267, AUTO_INCREMENT=268, AUTOCOMMIT=269, 
		AVG_ROW_LENGTH=270, BEGIN=271, BINLOG_ADMIN=272, BTREE=273, CHAIN=274, 
		CHANGE=275, CHAR=276, CHARACTER=277, CHARSET=278, CHECKSUM=279, CIPHER=280, 
		CLIENT=281, COALESCE=282, COLLATE=283, COLUMNS=284, COLUMN_FORMAT=285, 
		COMPACT=286, COMPRESSED=287, COMPRESSION=288, CONNECTION=289, CONNECTION_ADMIN=290, 
		CONSISTENT=291, CONVERT=292, COPY=293, CROSS=294, CURRENT_TIMESTAMP=295, 
		DATA=296, DATABASES=297, DELAYED=298, DELAY_KEY_WRITE=299, DISCARD=300, 
		DISK=301, DISTINCTROW=302, DUPLICATE=303, DYNAMIC=304, ENCRYPTION=305, 
		ENCRYPTION_KEY_ADMIN=306, ENGINE=307, EVENT=308, EXCHANGE=309, EXCLUSIVE=310, 
		EXECUTE=311, FILE=312, FIREWALL_ADMIN=313, FIREWALL_USER=314, FIRST=315, 
		FIXED=316, FOLLOWING=317, FULL=318, FULLTEXT=319, GROUP_CONCAT=320, GROUP_REPLICATION_ADMIN=321, 
		HASH=322, HIGH_PRIORITY=323, HISTORY=324, IF=325, IGNORE=326, IMPORT_=327, 
		INNER=328, INPLACE=329, INSERT=330, INSERT_METHOD=331, ISSUER=332, JOIN=333, 
		KEYS=334, KEY_BLOCK_SIZE=335, LAST=336, LEFT=337, LESS=338, LINEAR=339, 
		LIST=340, LOCALTIME=341, LOCALTIMESTAMP=342, LOW_PRIORITY=343, MATCH=344, 
		MAX_CONNECTIONS_PER_HOUR=345, MAX_QUERIES_PER_HOUR=346, MAX_ROWS=347, 
		MAX_UPDATES_PER_HOUR=348, MAX_USER_CONNECTIONS=349, MEMORY=350, MIN_ROWS=351, 
		NATURAL=352, NEVER=353, NOW=354, OFFLINE=355, OLD=356, ONLINE=357, OPTIMIZE=358, 
		OPTIONAL=359, OUTER=360, OVER=361, PACK_KEYS=362, PARSER=363, PARTIAL=364, 
		PARTITIONING=365, PARTITIONS=366, PERSIST=367, PERSIST_ONLY=368, PRECEDING=369, 
		PROCESS=370, PROXY=371, QUICK=372, RANGE=373, REBUILD=374, RECURSIVE=375, 
		REDUNDANT=376, RELEASE=377, RELOAD=378, REORGANIZE=379, REPAIR=380, REPEATABLE=381, 
		REPLICATION=382, REPLICATION_SLAVE_ADMIN=383, REQUIRE=384, RESTRICT=385, 
		RETAIN=386, REUSE=387, RIGHT=388, ROLE_ADMIN=389, ROUTINE=390, ROW_FORMAT=391, 
		SELECT=392, SEPARATOR=393, SESSION=394, SET_USER_ID=395, SHARED=396, SHOW=397, 
		SHUTDOWN=398, SIMPLE=399, SLAVE=400, SNAPSHOT=401, SPATIAL=402, SQLDML=403, 
		SQLDQL=404, SQL_BIG_RESULT=405, SQL_BUFFER_RESULT=406, SQL_CACHE=407, 
		SQL_CALC_FOUND_ROWS=408, SQL_NO_CACHE=409, SQL_SMALL_RESULT=410, SSL=411, 
		STATS_AUTO_RECALC=412, STATS_PERSISTENT=413, STATS_SAMPLE_PAGES=414, STORAGE=415, 
		STORED=416, STRAIGHT_JOIN=417, SUBJECT=418, SUBPARTITION=419, SUBPARTITIONS=420, 
		SUPER=421, SYSTEM_VARIABLES_ADMIN=422, TABLES=423, THAN=424, TRIGGER=425, 
		UNBOUNDED=426, UNCOMMITTED=427, UNSIGNED=428, UPDATE=429, UPGRADE=430, 
		USAGE=431, VALIDATION=432, VALUES=433, VERSION_TOKEN_ADMIN=434, VIEW=435, 
		WINDOW=436, WITHOUT=437, ZEROFILL=438;
	public static final int
		RULE_execute = 0, RULE_oracleId = 1, RULE_tableName = 2, RULE_columnName = 3, 
		RULE_indexName = 4, RULE_attributeName = 5, RULE_indexTypeName = 6, RULE_simpleExprsWithParen = 7, 
		RULE_simpleExprs = 8, RULE_lobItem = 9, RULE_lobItems = 10, RULE_lobItemList = 11, 
		RULE_dataType = 12, RULE_typeName = 13, RULE_specialDatatype = 14, RULE_datetimeTypeSuffix = 15, 
		RULE_columnSortClause = 16, RULE_tableAndAlias = 17, RULE_privateExprOfDb = 18, 
		RULE_treatFunction = 19, RULE_caseExpr = 20, RULE_simpleCaseExpr = 21, 
		RULE_searchedCaseExpr = 22, RULE_elseClause = 23, RULE_dateTimeExpr = 24, 
		RULE_exprRecursive = 25, RULE_intervalExpression = 26, RULE_objectAccessExpression = 27, 
		RULE_constructorExpr = 28, RULE_schemaName = 29, RULE_databaseName = 30, 
		RULE_domainName = 31, RULE_sequenceName = 32, RULE_tablespaceName = 33, 
		RULE_collationName = 34, RULE_alias = 35, RULE_cteName = 36, RULE_parserName = 37, 
		RULE_extensionName = 38, RULE_rowName = 39, RULE_opclass = 40, RULE_fileGroup = 41, 
		RULE_groupName = 42, RULE_constraintName = 43, RULE_keyName = 44, RULE_xmlSchemaCollection = 45, 
		RULE_columnSetName = 46, RULE_directoryName = 47, RULE_triggerName = 48, 
		RULE_routineName = 49, RULE_roleName = 50, RULE_partitionName = 51, RULE_rewriteRuleName = 52, 
		RULE_ownerName = 53, RULE_userName = 54, RULE_serverName = 55, RULE_dataTypeLength = 56, 
		RULE_primaryKey = 57, RULE_matchNone = 58, RULE_ids = 59, RULE_idList = 60, 
		RULE_rangeClause = 61, RULE_rangeItem = 62, RULE_schemaNames = 63, RULE_databaseNames = 64, 
		RULE_domainNames = 65, RULE_tableList = 66, RULE_tableNames = 67, RULE_columnNamesWithParen = 68, 
		RULE_columnNames = 69, RULE_columnList = 70, RULE_sequenceNames = 71, 
		RULE_tablespaceNames = 72, RULE_indexNames = 73, RULE_indexList = 74, 
		RULE_typeNames = 75, RULE_rowNames = 76, RULE_roleNames = 77, RULE_userNames = 78, 
		RULE_serverNames = 79, RULE_bitExprs = 80, RULE_exprs = 81, RULE_exprsWithParen = 82, 
		RULE_expr = 83, RULE_booleanPrimary = 84, RULE_comparisonOperator = 85, 
		RULE_predicate = 86, RULE_bitExpr = 87, RULE_simpleExpr = 88, RULE_functionCall = 89, 
		RULE_distinct = 90, RULE_intervalExpr = 91, RULE_caseExpress = 92, RULE_variable = 93, 
		RULE_liter = 94, RULE_question = 95, RULE_number = 96, RULE_string = 97, 
		RULE_subquery = 98, RULE_collateClause = 99, RULE_orderByClause = 100, 
		RULE_orderByItem = 101, RULE_createIndex = 102, RULE_tableIndexClause = 103, 
		RULE_indexExprSort = 104, RULE_indexExpr = 105, RULE_tablespaceClauseWithParen = 106, 
		RULE_tablespaceClause = 107, RULE_domainIndexClause = 108, RULE_bitmapJoinIndexClause = 109, 
		RULE_alterIndex = 110, RULE_dropIndex = 111, RULE_createTable = 112, RULE_relationalTable = 113, 
		RULE_relationalProperties = 114, RULE_relationalProperty = 115, RULE_tableProperties = 116, 
		RULE_columnDefinition = 117, RULE_identityClause = 118, RULE_identityOptions = 119, 
		RULE_virtualColumnDefinition = 120, RULE_inlineConstraint = 121, RULE_referencesClause = 122, 
		RULE_constraintState = 123, RULE_notDeferrable = 124, RULE_initiallyClause = 125, 
		RULE_exceptionsClause = 126, RULE_usingIndexClause = 127, RULE_inlineRefConstraint = 128, 
		RULE_outOfLineConstraint = 129, RULE_outOfLineRefConstraint = 130, RULE_encryptionSpec = 131, 
		RULE_objectProperties = 132, RULE_objectProperty = 133, RULE_columnProperties = 134, 
		RULE_columnProperty = 135, RULE_objectTypeColProperties = 136, RULE_substitutableColumnClause = 137, 
		RULE_unionSelect = 138, RULE_selectExpression = 139, RULE_fromClause = 140, 
		RULE_whereClause = 141, RULE_groupByClause = 142, RULE_havingClause = 143, 
		RULE_limitClause = 144, RULE_partitionClause = 145, RULE_selectExprs = 146, 
		RULE_asterisk = 147, RULE_selectExpr = 148, RULE_tableReferences = 149, 
		RULE_alterTable = 150, RULE_alterTableProperties = 151, RULE_renameTable = 152, 
		RULE_columnClauses = 153, RULE_opColumnClause = 154, RULE_addColumn = 155, 
		RULE_columnOrVirtualDefinitions = 156, RULE_columnOrVirtualDefinition = 157, 
		RULE_modifyColumn = 158, RULE_modifyColProperties = 159, RULE_modifyColSubstitutable = 160, 
		RULE_dropColumnClause = 161, RULE_dropColumn = 162, RULE_columnOrColumnList = 163, 
		RULE_cascadeOrInvalidate = 164, RULE_checkpointNumber = 165, RULE_renameColumn = 166, 
		RULE_constraintClauses = 167, RULE_addConstraint = 168, RULE_modifyConstraintClause = 169, 
		RULE_constraintWithName = 170, RULE_constraintOption = 171, RULE_constraintPrimaryOrUnique = 172, 
		RULE_renameConstraintClause = 173, RULE_dropConstraintClause = 174, RULE_alterExternalTable = 175, 
		RULE_dropTable = 176, RULE_truncateTable = 177, RULE_setTransaction = 178, 
		RULE_commit = 179, RULE_rollback = 180, RULE_savepoint = 181, RULE_grant = 182, 
		RULE_grantSystemPrivileges = 183, RULE_systemObjects = 184, RULE_systemObject = 185, 
		RULE_grantees = 186, RULE_grantee = 187, RULE_granteeIdentifiedBy = 188, 
		RULE_grantObjectPrivilegeClause = 189, RULE_grantObjectPrivilege = 190, 
		RULE_objectPrivilege = 191, RULE_onObjectClause = 192, RULE_grantRolesToPrograms = 193, 
		RULE_programUnits = 194, RULE_programUnit = 195, RULE_revoke = 196, RULE_revokeSystemPrivileges = 197, 
		RULE_revokeObjectPrivileges = 198, RULE_revokeRolesFromPrograms = 199, 
		RULE_createUser = 200, RULE_sizeClause = 201, RULE_alterUser = 202, RULE_containerDataClause = 203, 
		RULE_proxyClause = 204, RULE_dbUserProxyClauses = 205, RULE_dropUser = 206, 
		RULE_createRole = 207, RULE_alterRole = 208, RULE_dropRole = 209;
	public static final String[] ruleNames = {
		"execute", "oracleId", "tableName", "columnName", "indexName", "attributeName", 
		"indexTypeName", "simpleExprsWithParen", "simpleExprs", "lobItem", "lobItems", 
		"lobItemList", "dataType", "typeName", "specialDatatype", "datetimeTypeSuffix", 
		"columnSortClause", "tableAndAlias", "privateExprOfDb", "treatFunction", 
		"caseExpr", "simpleCaseExpr", "searchedCaseExpr", "elseClause", "dateTimeExpr", 
		"exprRecursive", "intervalExpression", "objectAccessExpression", "constructorExpr", 
		"schemaName", "databaseName", "domainName", "sequenceName", "tablespaceName", 
		"collationName", "alias", "cteName", "parserName", "extensionName", "rowName", 
		"opclass", "fileGroup", "groupName", "constraintName", "keyName", "xmlSchemaCollection", 
		"columnSetName", "directoryName", "triggerName", "routineName", "roleName", 
		"partitionName", "rewriteRuleName", "ownerName", "userName", "serverName", 
		"dataTypeLength", "primaryKey", "matchNone", "ids", "idList", "rangeClause", 
		"rangeItem", "schemaNames", "databaseNames", "domainNames", "tableList", 
		"tableNames", "columnNamesWithParen", "columnNames", "columnList", "sequenceNames", 
		"tablespaceNames", "indexNames", "indexList", "typeNames", "rowNames", 
		"roleNames", "userNames", "serverNames", "bitExprs", "exprs", "exprsWithParen", 
		"expr", "booleanPrimary", "comparisonOperator", "predicate", "bitExpr", 
		"simpleExpr", "functionCall", "distinct", "intervalExpr", "caseExpress", 
		"variable", "liter", "question", "number", "string", "subquery", "collateClause", 
		"orderByClause", "orderByItem", "createIndex", "tableIndexClause", "indexExprSort", 
		"indexExpr", "tablespaceClauseWithParen", "tablespaceClause", "domainIndexClause", 
		"bitmapJoinIndexClause", "alterIndex", "dropIndex", "createTable", "relationalTable", 
		"relationalProperties", "relationalProperty", "tableProperties", "columnDefinition", 
		"identityClause", "identityOptions", "virtualColumnDefinition", "inlineConstraint", 
		"referencesClause", "constraintState", "notDeferrable", "initiallyClause", 
		"exceptionsClause", "usingIndexClause", "inlineRefConstraint", "outOfLineConstraint", 
		"outOfLineRefConstraint", "encryptionSpec", "objectProperties", "objectProperty", 
		"columnProperties", "columnProperty", "objectTypeColProperties", "substitutableColumnClause", 
		"unionSelect", "selectExpression", "fromClause", "whereClause", "groupByClause", 
		"havingClause", "limitClause", "partitionClause", "selectExprs", "asterisk", 
		"selectExpr", "tableReferences", "alterTable", "alterTableProperties", 
		"renameTable", "columnClauses", "opColumnClause", "addColumn", "columnOrVirtualDefinitions", 
		"columnOrVirtualDefinition", "modifyColumn", "modifyColProperties", "modifyColSubstitutable", 
		"dropColumnClause", "dropColumn", "columnOrColumnList", "cascadeOrInvalidate", 
		"checkpointNumber", "renameColumn", "constraintClauses", "addConstraint", 
		"modifyConstraintClause", "constraintWithName", "constraintOption", "constraintPrimaryOrUnique", 
		"renameConstraintClause", "dropConstraintClause", "alterExternalTable", 
		"dropTable", "truncateTable", "setTransaction", "commit", "rollback", 
		"savepoint", "grant", "grantSystemPrivileges", "systemObjects", "systemObject", 
		"grantees", "grantee", "granteeIdentifiedBy", "grantObjectPrivilegeClause", 
		"grantObjectPrivilege", "objectPrivilege", "onObjectClause", "grantRolesToPrograms", 
		"programUnits", "programUnit", "revoke", "revokeSystemPrivileges", "revokeObjectPrivileges", 
		"revokeRolesFromPrograms", "createUser", "sizeClause", "alterUser", "containerDataClause", 
		"proxyClause", "dbUserProxyClauses", "dropUser", "createRole", "alterRole", 
		"dropRole"
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
		null, null, null, null, null, null, "'&&'", "'||'", "'!'", "'~'", "'|'", 
		"'&'", "'<<'", "'>>'", "'^'", "'%'", "':'", "'+'", "'-'", "'*'", "'/'", 
		"'\\'", "'.'", "'.*'", "'<=>'", "'=='", "'='", "'!='", "'<>'", "'>'", 
		"'>='", "'<'", "'<='", "'#'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"','", "'\"'", "'''", "'`'", "'_'", "'?'", "'@'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ACCOUNT", "ADMIN", "AT", "AUTHENTICATION", "BATCH", "BITMAP", 
		"CACHE", "CASE", "CHECKPOINT", "COMMENT", "CONNECT", "CONSTRAINTS", "CONTAINER", 
		"CONTAINER_DATA", "CYCLE", "DBTIMEZONE", "DECRYPT", "DEFERRABLE", "DEFERRED", 
		"DELEGATE", "DIRECTORY", "DOUBLE", "EDITION", "EDITIONS", "ELEMENT", "ELSE", 
		"ENCRYPT", "END", "ENTERPRISE", "EXCEPT", "EXCEPTIONS", "EXPIRE", "EXTERNALLY", 
		"FORCE", "GLOBAL", "GLOBALLY", "HIERARCHY", "IDENTIFIED", "IDENTITY", 
		"IMMEDIATE", "INCREMENT", "INITIALLY", "INTERVAL", "INTO", "INVALIDATE", 
		"JAVA", "KEEP", "LEVELS", "LOCAL", "LOCK", "MAXVALUE", "MINING", "MINVALUE", 
		"MODEL", "MODIFY", "MONTH", "NAME", "NATIONAL", "NEW", "NOCACHE", "NOCYCLE", 
		"NOMAXVALUE", "NOMINVALUE", "NONE", "NOORDER", "NORELY", "NOVALIDATE", 
		"NOWAIT", "OF", "ONLY", "PACKAGE", "PRECISION", "PRESERVE", "PRIOR", "PROCEDURE", 
		"PROFILE", "PUBLIC", "QUOTA", "REF", "REKEY", "RELY", "REMOVE", "RENAME", 
		"REPLACE", "REQUIRED", "RESOURCE", "ROLES", "ROWID", "SALT", "SAVEPOINT", 
		"SCOPE", "SECOND", "SEGMENT", "SORT", "SOURCE", "SQL", "SQLRF", "SUBSTITUTABLE", 
		"TABLESPACE", "TEMPORARY", "THEN", "THROUGH", "TRANSLATION", "TREAT", 
		"TYPE", "UNLIMITED", "UNLOCK", "UNUSED", "USE", "USERS", "USING", "VALIDATE", 
		"VALUE", "VARYING", "VIRTUAL", "WAIT", "WHEN", "WRITE", "ZONE", "AND_", 
		"OR_", "NOT_", "UNARY_BIT_COMPLEMENT", "BIT_INCLUSIVE_OR", "BIT_AND", 
		"SIGNED_LEFT_SHIFT", "SIGNED_RIGHT_SHIFT", "BIT_EXCLUSIVE_OR", "MOD_", 
		"COLON", "PLUS", "MINUS", "ASTERISK", "SLASH", "BACKSLASH", "DOT", "DOT_ASTERISK", 
		"SAFE_EQ", "EQ", "EQ_", "NEQ", "NEQ_", "GT", "GTE", "LT", "LTE", "POUND_", 
		"LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA", "DQ_", "SQ_", "BQ_", 
		"UL_", "QUESTION", "AT_", "SEMI_", "ALL", "AND", "ANY", "ASC", "BETWEEN", 
		"BINARY", "BIT_NUM", "BY", "DATE", "DESC", "DISTINCT", "ESCAPE", "EXISTS", 
		"FALSE", "FROM", "GROUP", "HAVING", "HIDDEN_", "IN", "IS", "KEY", "LIKE", 
		"LIMIT", "MOD", "NOT", "NULL", "OFFSET", "OR", "ORDER", "PARTITION", "PRIMARY", 
		"REGEXP", "ROLLUP", "ROW", "SET", "SOUNDS", "TIME", "TIMESTAMP", "TRUE", 
		"UNION", "UNKNOWN", "WHERE", "WITH", "XOR", "ADD", "ALTER", "ALWAYS", 
		"AS", "CASCADE", "CHECK", "COLUMN", "COMMIT", "COMMITTED", "CONSTRAINT", 
		"CREATE", "CURRENT", "DAY", "DEFAULT", "DELETE", "DISABLE", "DROP", "ENABLE", 
		"FOR", "FOREIGN", "FUNCTION", "GENERATED", "GRANT", "INDEX", "ISOLATION", 
		"LEVEL", "NO", "ON", "OPTION", "PASSWORD", "PRIVILEGES", "READ", "REFERENCES", 
		"REVOKE", "ROLE", "ROLLBACK", "ROWS", "SERIALIZABLE", "START", "TABLE", 
		"TO", "TRANSACTION", "TRUNCATE", "UNIQUE", "USER", "WORK", "YEAR", "ID", 
		"BLOCK_COMMENT", "SL_COMMENT", "STRING", "NUMBER", "INT_", "EXP", "HEX_DIGIT", 
		"WS", "ACTION", "AFTER", "ALGORITHM", "ANALYZE", "AUDIT_ADMIN", "AUTO_INCREMENT", 
		"AUTOCOMMIT", "AVG_ROW_LENGTH", "BEGIN", "BINLOG_ADMIN", "BTREE", "CHAIN", 
		"CHANGE", "CHAR", "CHARACTER", "CHARSET", "CHECKSUM", "CIPHER", "CLIENT", 
		"COALESCE", "COLLATE", "COLUMNS", "COLUMN_FORMAT", "COMPACT", "COMPRESSED", 
		"COMPRESSION", "CONNECTION", "CONNECTION_ADMIN", "CONSISTENT", "CONVERT", 
		"COPY", "CROSS", "CURRENT_TIMESTAMP", "DATA", "DATABASES", "DELAYED", 
		"DELAY_KEY_WRITE", "DISCARD", "DISK", "DISTINCTROW", "DUPLICATE", "DYNAMIC", 
		"ENCRYPTION", "ENCRYPTION_KEY_ADMIN", "ENGINE", "EVENT", "EXCHANGE", "EXCLUSIVE", 
		"EXECUTE", "FILE", "FIREWALL_ADMIN", "FIREWALL_USER", "FIRST", "FIXED", 
		"FOLLOWING", "FULL", "FULLTEXT", "GROUP_CONCAT", "GROUP_REPLICATION_ADMIN", 
		"HASH", "HIGH_PRIORITY", "HISTORY", "IF", "IGNORE", "IMPORT_", "INNER", 
		"INPLACE", "INSERT", "INSERT_METHOD", "ISSUER", "JOIN", "KEYS", "KEY_BLOCK_SIZE", 
		"LAST", "LEFT", "LESS", "LINEAR", "LIST", "LOCALTIME", "LOCALTIMESTAMP", 
		"LOW_PRIORITY", "MATCH", "MAX_CONNECTIONS_PER_HOUR", "MAX_QUERIES_PER_HOUR", 
		"MAX_ROWS", "MAX_UPDATES_PER_HOUR", "MAX_USER_CONNECTIONS", "MEMORY", 
		"MIN_ROWS", "NATURAL", "NEVER", "NOW", "OFFLINE", "OLD", "ONLINE", "OPTIMIZE", 
		"OPTIONAL", "OUTER", "OVER", "PACK_KEYS", "PARSER", "PARTIAL", "PARTITIONING", 
		"PARTITIONS", "PERSIST", "PERSIST_ONLY", "PRECEDING", "PROCESS", "PROXY", 
		"QUICK", "RANGE", "REBUILD", "RECURSIVE", "REDUNDANT", "RELEASE", "RELOAD", 
		"REORGANIZE", "REPAIR", "REPEATABLE", "REPLICATION", "REPLICATION_SLAVE_ADMIN", 
		"REQUIRE", "RESTRICT", "RETAIN", "REUSE", "RIGHT", "ROLE_ADMIN", "ROUTINE", 
		"ROW_FORMAT", "SELECT", "SEPARATOR", "SESSION", "SET_USER_ID", "SHARED", 
		"SHOW", "SHUTDOWN", "SIMPLE", "SLAVE", "SNAPSHOT", "SPATIAL", "SQLDML", 
		"SQLDQL", "SQL_BIG_RESULT", "SQL_BUFFER_RESULT", "SQL_CACHE", "SQL_CALC_FOUND_ROWS", 
		"SQL_NO_CACHE", "SQL_SMALL_RESULT", "SSL", "STATS_AUTO_RECALC", "STATS_PERSISTENT", 
		"STATS_SAMPLE_PAGES", "STORAGE", "STORED", "STRAIGHT_JOIN", "SUBJECT", 
		"SUBPARTITION", "SUBPARTITIONS", "SUPER", "SYSTEM_VARIABLES_ADMIN", "TABLES", 
		"THAN", "TRIGGER", "UNBOUNDED", "UNCOMMITTED", "UNSIGNED", "UPDATE", "UPGRADE", 
		"USAGE", "VALIDATION", "VALUES", "VERSION_TOKEN_ADMIN", "VIEW", "WINDOW", 
		"WITHOUT", "ZEROFILL"
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
	public String getGrammarFileName() { return "OracleStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OracleStatementParser(TokenStream input) {
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
		public CreateUserContext createUser() {
			return getRuleContext(CreateUserContext.class,0);
		}
		public AlterUserContext alterUser() {
			return getRuleContext(AlterUserContext.class,0);
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
		public DropRoleContext dropRole() {
			return getRuleContext(DropRoleContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(OracleStatementParser.SEMI_, 0); }
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
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(420);
				createIndex();
				}
				break;
			case 2:
				{
				setState(421);
				alterIndex();
				}
				break;
			case 3:
				{
				setState(422);
				dropIndex();
				}
				break;
			case 4:
				{
				setState(423);
				createTable();
				}
				break;
			case 5:
				{
				setState(424);
				alterTable();
				}
				break;
			case 6:
				{
				setState(425);
				dropTable();
				}
				break;
			case 7:
				{
				setState(426);
				truncateTable();
				}
				break;
			case 8:
				{
				setState(427);
				commit();
				}
				break;
			case 9:
				{
				setState(428);
				rollback();
				}
				break;
			case 10:
				{
				setState(429);
				setTransaction();
				}
				break;
			case 11:
				{
				setState(430);
				savepoint();
				}
				break;
			case 12:
				{
				setState(431);
				grant();
				}
				break;
			case 13:
				{
				setState(432);
				revoke();
				}
				break;
			case 14:
				{
				setState(433);
				createUser();
				}
				break;
			case 15:
				{
				setState(434);
				alterUser();
				}
				break;
			case 16:
				{
				setState(435);
				dropUser();
				}
				break;
			case 17:
				{
				setState(436);
				createRole();
				}
				break;
			case 18:
				{
				setState(437);
				alterRole();
				}
				break;
			case 19:
				{
				setState(438);
				dropRole();
				}
				break;
			}
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(441);
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

	public static class OracleIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public List<TerminalNode> STRING() { return getTokens(OracleStatementParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(OracleStatementParser.STRING, i);
		}
		public List<TerminalNode> DOT() { return getTokens(OracleStatementParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OracleStatementParser.DOT, i);
		}
		public OracleIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oracleId; }
	}

	public final OracleIdContext oracleId() throws RecognitionException {
		OracleIdContext _localctx = new OracleIdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_oracleId);
		try {
			int _alt;
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(445);
						match(STRING);
						setState(446);
						match(DOT);
						}
						} 
					}
					setState(451);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(452);
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

	public static class TableNameContext extends ParserRuleContext {
		public OracleIdContext oracleId() {
			return getRuleContext(OracleIdContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			oracleId();
			}
		}
		catch (RecognitionException re) {
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
		public OracleIdContext oracleId() {
			return getRuleContext(OracleIdContext.class,0);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			oracleId();
			}
		}
		catch (RecognitionException re) {
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
		public OracleIdContext oracleId() {
			return getRuleContext(OracleIdContext.class,0);
		}
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			oracleId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNameContext extends ParserRuleContext {
		public OracleIdContext oracleId() {
			return getRuleContext(OracleIdContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			oracleId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexTypeNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public IndexTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexTypeName; }
	}

	public final IndexTypeNameContext indexTypeName() throws RecognitionException {
		IndexTypeNameContext _localctx = new IndexTypeNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_indexTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
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

	public static class SimpleExprsWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public SimpleExprsContext simpleExprs() {
			return getRuleContext(SimpleExprsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public SimpleExprsWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExprsWithParen; }
	}

	public final SimpleExprsWithParenContext simpleExprsWithParen() throws RecognitionException {
		SimpleExprsWithParenContext _localctx = new SimpleExprsWithParenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpleExprsWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(LP_);
			setState(466);
			simpleExprs();
			setState(467);
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

	public static class SimpleExprsContext extends ParserRuleContext {
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public SimpleExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExprs; }
	}

	public final SimpleExprsContext simpleExprs() throws RecognitionException {
		SimpleExprsContext _localctx = new SimpleExprsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpleExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			simpleExpr(0);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(470);
				match(COMMA);
				setState(471);
				simpleExpr(0);
				}
				}
				setState(476);
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

	public static class LobItemContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public LobItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItem; }
	}

	public final LobItemContext lobItem() throws RecognitionException {
		LobItemContext _localctx = new LobItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lobItem);
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				attributeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				columnName();
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

	public static class LobItemsContext extends ParserRuleContext {
		public List<LobItemContext> lobItem() {
			return getRuleContexts(LobItemContext.class);
		}
		public LobItemContext lobItem(int i) {
			return getRuleContext(LobItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public LobItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItems; }
	}

	public final LobItemsContext lobItems() throws RecognitionException {
		LobItemsContext _localctx = new LobItemsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lobItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			lobItem();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(482);
				match(COMMA);
				setState(483);
				lobItem();
				}
				}
				setState(488);
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

	public static class LobItemListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public LobItemsContext lobItems() {
			return getRuleContext(LobItemsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public LobItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItemList; }
	}

	public final LobItemListContext lobItemList() throws RecognitionException {
		LobItemListContext _localctx = new LobItemListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lobItemList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(LP_);
			setState(490);
			lobItems();
			setState(491);
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

	public static class DataTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public SpecialDatatypeContext specialDatatype() {
			return getRuleContext(SpecialDatatypeContext.class,0);
		}
		public DatetimeTypeSuffixContext datetimeTypeSuffix() {
			return getRuleContext(DatetimeTypeSuffixContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dataType);
		int _la;
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				typeName();
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(494);
					dataTypeLength();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				specialDatatype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				typeName();
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(499);
					dataTypeLength();
					}
				}

				setState(502);
				datetimeTypeSuffix();
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
		public TerminalNode DOUBLE() { return getToken(OracleStatementParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(OracleStatementParser.PRECISION, 0); }
		public TerminalNode INTERVAL() { return getToken(OracleStatementParser.INTERVAL, 0); }
		public TerminalNode YEAR() { return getToken(OracleStatementParser.YEAR, 0); }
		public TerminalNode DAY() { return getToken(OracleStatementParser.DAY, 0); }
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeName);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(DOUBLE);
				setState(507);
				match(PRECISION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(INTERVAL);
				setState(509);
				match(YEAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				match(INTERVAL);
				setState(511);
				match(DAY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(512);
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

	public static class SpecialDatatypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode NUMBER() { return getToken(OracleStatementParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode NATIONAL() { return getToken(OracleStatementParser.NATIONAL, 0); }
		public TerminalNode VARYING() { return getToken(OracleStatementParser.VARYING, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SpecialDatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialDatatype; }
	}

	public final SpecialDatatypeContext specialDatatype() throws RecognitionException {
		SpecialDatatypeContext _localctx = new SpecialDatatypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_specialDatatype);
		int _la;
		try {
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				typeName();
				{
				setState(516);
				match(LP_);
				setState(517);
				match(NUMBER);
				setState(518);
				match(ID);
				setState(519);
				match(RP_);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				match(NATIONAL);
				setState(522);
				typeName();
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARYING) {
					{
					setState(523);
					match(VARYING);
					}
				}

				setState(526);
				match(LP_);
				setState(527);
				match(NUMBER);
				setState(528);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				typeName();
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(531);
					match(LP_);
					}
				}

				setState(534);
				columnName();
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(535);
					match(RP_);
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

	public static class DatetimeTypeSuffixContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(OracleStatementParser.ZONE, 0); }
		public TerminalNode LOCAL() { return getToken(OracleStatementParser.LOCAL, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode NUMBER() { return getToken(OracleStatementParser.NUMBER, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DatetimeTypeSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeTypeSuffix; }
	}

	public final DatetimeTypeSuffixContext datetimeTypeSuffix() throws RecognitionException {
		DatetimeTypeSuffixContext _localctx = new DatetimeTypeSuffixContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_datetimeTypeSuffix);
		int _la;
		try {
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(540);
					match(WITH);
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LOCAL) {
						{
						setState(541);
						match(LOCAL);
						}
					}

					setState(544);
					match(TIME);
					setState(545);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				match(TO);
				setState(549);
				match(MONTH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(550);
				match(TO);
				setState(551);
				match(SECOND);
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(552);
					match(LP_);
					setState(553);
					match(NUMBER);
					setState(554);
					match(RP_);
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

	public static class ColumnSortClauseContext extends ParserRuleContext {
		public TableAndAliasContext tableAndAlias() {
			return getRuleContext(TableAndAliasContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public ColumnSortClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSortClause; }
	}

	public final ColumnSortClauseContext columnSortClause() throws RecognitionException {
		ColumnSortClauseContext _localctx = new ColumnSortClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_columnSortClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			tableAndAlias();
			setState(560);
			columnName();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(561);
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

	public static class TableAndAliasContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TableAndAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAndAlias; }
	}

	public final TableAndAliasContext tableAndAlias() throws RecognitionException {
		TableAndAliasContext _localctx = new TableAndAliasContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tableAndAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			tableName();
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(565);
				alias();
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
		public TreatFunctionContext treatFunction() {
			return getRuleContext(TreatFunctionContext.class,0);
		}
		public CaseExprContext caseExpr() {
			return getRuleContext(CaseExprContext.class,0);
		}
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public ObjectAccessExpressionContext objectAccessExpression() {
			return getRuleContext(ObjectAccessExpressionContext.class,0);
		}
		public ConstructorExprContext constructorExpr() {
			return getRuleContext(ConstructorExprContext.class,0);
		}
		public PrivateExprOfDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateExprOfDb; }
	}

	public final PrivateExprOfDbContext privateExprOfDb() throws RecognitionException {
		PrivateExprOfDbContext _localctx = new PrivateExprOfDbContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_privateExprOfDb);
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				treatFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				caseExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				intervalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(571);
				objectAccessExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(572);
				constructorExpr();
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

	public static class TreatFunctionContext extends ParserRuleContext {
		public TerminalNode TREAT() { return getToken(OracleStatementParser.TREAT, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode REF() { return getToken(OracleStatementParser.REF, 0); }
		public TreatFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treatFunction; }
	}

	public final TreatFunctionContext treatFunction() throws RecognitionException {
		TreatFunctionContext _localctx = new TreatFunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_treatFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(TREAT);
			setState(576);
			match(LP_);
			setState(577);
			expr(0);
			setState(578);
			match(AS);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(579);
				match(REF);
				}
			}

			setState(582);
			typeName();
			setState(583);
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

	public static class CaseExprContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(OracleStatementParser.CASE, 0); }
		public TerminalNode END() { return getToken(OracleStatementParser.END, 0); }
		public SimpleCaseExprContext simpleCaseExpr() {
			return getRuleContext(SimpleCaseExprContext.class,0);
		}
		public SearchedCaseExprContext searchedCaseExpr() {
			return getRuleContext(SearchedCaseExprContext.class,0);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public CaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpr; }
	}

	public final CaseExprContext caseExpr() throws RecognitionException {
		CaseExprContext _localctx = new CaseExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_caseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(CASE);
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case CASE:
			case NEW:
			case PRIOR:
			case TREAT:
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
				setState(586);
				simpleCaseExpr();
				}
				break;
			case WHEN:
				{
				setState(587);
				searchedCaseExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(590);
				elseClause();
				}
			}

			setState(593);
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

	public static class SimpleCaseExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SearchedCaseExprContext> searchedCaseExpr() {
			return getRuleContexts(SearchedCaseExprContext.class);
		}
		public SearchedCaseExprContext searchedCaseExpr(int i) {
			return getRuleContext(SearchedCaseExprContext.class,i);
		}
		public SimpleCaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCaseExpr; }
	}

	public final SimpleCaseExprContext simpleCaseExpr() throws RecognitionException {
		SimpleCaseExprContext _localctx = new SimpleCaseExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_simpleCaseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			expr(0);
			setState(597); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(596);
				searchedCaseExpr();
				}
				}
				setState(599); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchedCaseExprContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(OracleStatementParser.WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(OracleStatementParser.THEN, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public SearchedCaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchedCaseExpr; }
	}

	public final SearchedCaseExprContext searchedCaseExpr() throws RecognitionException {
		SearchedCaseExprContext _localctx = new SearchedCaseExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_searchedCaseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(WHEN);
			setState(602);
			expr(0);
			setState(603);
			match(THEN);
			setState(604);
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

	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(OracleStatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(ELSE);
			setState(607);
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

	public static class DateTimeExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode LOCAL() { return getToken(OracleStatementParser.LOCAL, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(OracleStatementParser.ZONE, 0); }
		public TerminalNode STRING() { return getToken(OracleStatementParser.STRING, 0); }
		public TerminalNode DBTIMEZONE() { return getToken(OracleStatementParser.DBTIMEZONE, 0); }
		public DateTimeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeExpr; }
	}

	public final DateTimeExprContext dateTimeExpr() throws RecognitionException {
		DateTimeExprContext _localctx = new DateTimeExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dateTimeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			expr(0);
			setState(610);
			match(AT);
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOCAL:
				{
				setState(611);
				match(LOCAL);
				}
				break;
			case TIME:
				{
				setState(612);
				match(TIME);
				setState(613);
				match(ZONE);
				setState(617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(614);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(615);
					match(DBTIMEZONE);
					}
					break;
				case 3:
					{
					setState(616);
					expr(0);
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

	public static class ExprRecursiveContext extends ParserRuleContext {
		public TerminalNode PRIOR() { return getToken(OracleStatementParser.PRIOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprRecursiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRecursive; }
	}

	public final ExprRecursiveContext exprRecursive() throws RecognitionException {
		ExprRecursiveContext _localctx = new ExprRecursiveContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exprRecursive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(PRIOR);
			setState(622);
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

	public static class IntervalExpressionContext extends ParserRuleContext {
		public List<TerminalNode> LP_() { return getTokens(OracleStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(OracleStatementParser.LP_, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(OracleStatementParser.MINUS, 0); }
		public List<TerminalNode> RP_() { return getTokens(OracleStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(OracleStatementParser.RP_, i);
		}
		public TerminalNode DAY() { return getToken(OracleStatementParser.DAY, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode YEAR() { return getToken(OracleStatementParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(OracleStatementParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(OracleStatementParser.NUMBER, i);
		}
		public IntervalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpression; }
	}

	public final IntervalExpressionContext intervalExpression() throws RecognitionException {
		IntervalExpressionContext _localctx = new IntervalExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_intervalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(LP_);
			setState(625);
			expr(0);
			setState(626);
			match(MINUS);
			setState(627);
			expr(0);
			setState(628);
			match(RP_);
			setState(650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DAY:
				{
				setState(629);
				match(DAY);
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(630);
					match(LP_);
					setState(631);
					match(NUMBER);
					setState(632);
					match(RP_);
					}
				}

				setState(635);
				match(TO);
				setState(636);
				match(SECOND);
				setState(640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(637);
					match(LP_);
					setState(638);
					match(NUMBER);
					setState(639);
					match(RP_);
					}
					break;
				}
				}
				break;
			case YEAR:
				{
				setState(642);
				match(YEAR);
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(643);
					match(LP_);
					setState(644);
					match(NUMBER);
					setState(645);
					match(RP_);
					}
				}

				setState(648);
				match(TO);
				setState(649);
				match(MONTH);
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

	public static class ObjectAccessExpressionContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(OracleStatementParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OracleStatementParser.DOT, i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TreatFunctionContext treatFunction() {
			return getRuleContext(TreatFunctionContext.class,0);
		}
		public List<AttributeNameContext> attributeName() {
			return getRuleContexts(AttributeNameContext.class);
		}
		public AttributeNameContext attributeName(int i) {
			return getRuleContext(AttributeNameContext.class,i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ObjectAccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectAccessExpression; }
	}

	public final ObjectAccessExpressionContext objectAccessExpression() throws RecognitionException {
		ObjectAccessExpressionContext _localctx = new ObjectAccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_objectAccessExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				{
				setState(652);
				match(LP_);
				setState(653);
				simpleExpr(0);
				setState(654);
				match(RP_);
				}
				break;
			case TREAT:
				{
				setState(656);
				treatFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(659);
			match(DOT);
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(660);
				attributeName();
				setState(665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(661);
						match(DOT);
						setState(662);
						attributeName();
						}
						} 
					}
					setState(667);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(670);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(668);
					match(DOT);
					setState(669);
					functionCall();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(672);
				functionCall();
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

	public static class ConstructorExprContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(OracleStatementParser.NEW, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExprsWithParenContext exprsWithParen() {
			return getRuleContext(ExprsWithParenContext.class,0);
		}
		public ConstructorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorExpr; }
	}

	public final ConstructorExprContext constructorExpr() throws RecognitionException {
		ConstructorExprContext _localctx = new ConstructorExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constructorExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(NEW);
			setState(676);
			typeName();
			setState(677);
			exprsWithParen();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
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
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
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
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public DomainNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainName; }
	}

	public final DomainNameContext domainName() throws RecognitionException {
		DomainNameContext _localctx = new DomainNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_domainName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
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
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public SequenceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceName; }
	}

	public final SequenceNameContext sequenceName() throws RecognitionException {
		SequenceNameContext _localctx = new SequenceNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sequenceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
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
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public TablespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceName; }
	}

	public final TablespaceNameContext tablespaceName() throws RecognitionException {
		TablespaceNameContext _localctx = new TablespaceNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tablespaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
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
		public TerminalNode STRING() { return getToken(OracleStatementParser.STRING, 0); }
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_collationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
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

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_alias);
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

	public static class CteNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public CteNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteName; }
	}

	public final CteNameContext cteName() throws RecognitionException {
		CteNameContext _localctx = new CteNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cteName);
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

	public static class ParserNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public ParserNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserName; }
	}

	public final ParserNameContext parserName() throws RecognitionException {
		ParserNameContext _localctx = new ParserNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parserName);
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

	public static class ExtensionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public ExtensionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionName; }
	}

	public final ExtensionNameContext extensionName() throws RecognitionException {
		ExtensionNameContext _localctx = new ExtensionNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_extensionName);
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

	public static class RowNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public RowNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowName; }
	}

	public final RowNameContext rowName() throws RecognitionException {
		RowNameContext _localctx = new RowNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_rowName);
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

	public static class OpclassContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public OpclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opclass; }
	}

	public final OpclassContext opclass() throws RecognitionException {
		OpclassContext _localctx = new OpclassContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_opclass);
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

	public static class FileGroupContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public FileGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileGroup; }
	}

	public final FileGroupContext fileGroup() throws RecognitionException {
		FileGroupContext _localctx = new FileGroupContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_fileGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
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
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public GroupNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupName; }
	}

	public final GroupNameContext groupName() throws RecognitionException {
		GroupNameContext _localctx = new GroupNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_groupName);
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

	public static class ConstraintNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public ConstraintNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintName; }
	}

	public final ConstraintNameContext constraintName() throws RecognitionException {
		ConstraintNameContext _localctx = new ConstraintNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constraintName);
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

	public static class KeyNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public KeyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyName; }
	}

	public final KeyNameContext keyName() throws RecognitionException {
		KeyNameContext _localctx = new KeyNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_keyName);
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

	public static class XmlSchemaCollectionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public XmlSchemaCollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlSchemaCollection; }
	}

	public final XmlSchemaCollectionContext xmlSchemaCollection() throws RecognitionException {
		XmlSchemaCollectionContext _localctx = new XmlSchemaCollectionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_xmlSchemaCollection);
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

	public static class ColumnSetNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public ColumnSetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSetName; }
	}

	public final ColumnSetNameContext columnSetName() throws RecognitionException {
		ColumnSetNameContext _localctx = new ColumnSetNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_columnSetName);
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

	public static class DirectoryNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public DirectoryNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directoryName; }
	}

	public final DirectoryNameContext directoryName() throws RecognitionException {
		DirectoryNameContext _localctx = new DirectoryNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_directoryName);
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

	public static class TriggerNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public TriggerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerName; }
	}

	public final TriggerNameContext triggerName() throws RecognitionException {
		TriggerNameContext _localctx = new TriggerNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_triggerName);
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

	public static class RoutineNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public RoutineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineName; }
	}

	public final RoutineNameContext routineName() throws RecognitionException {
		RoutineNameContext _localctx = new RoutineNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_routineName);
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

	public static class RoleNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OracleStatementParser.STRING, 0); }
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public RoleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleName; }
	}

	public final RoleNameContext roleName() throws RecognitionException {
		RoleNameContext _localctx = new RoleNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_roleName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
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
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public PartitionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionName; }
	}

	public final PartitionNameContext partitionName() throws RecognitionException {
		PartitionNameContext _localctx = new PartitionNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_partitionName);
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

	public static class RewriteRuleNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public RewriteRuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewriteRuleName; }
	}

	public final RewriteRuleNameContext rewriteRuleName() throws RecognitionException {
		RewriteRuleNameContext _localctx = new RewriteRuleNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_rewriteRuleName);
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

	public static class OwnerNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public OwnerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownerName; }
	}

	public final OwnerNameContext ownerName() throws RecognitionException {
		OwnerNameContext _localctx = new OwnerNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_ownerName);
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

	public static class UserNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OracleStatementParser.STRING, 0); }
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public UserNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userName; }
	}

	public final UserNameContext userName() throws RecognitionException {
		UserNameContext _localctx = new UserNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_userName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
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
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public ServerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverName; }
	}

	public final ServerNameContext serverName() throws RecognitionException {
		ServerNameContext _localctx = new ServerNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_serverName);
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

	public static class DataTypeLengthContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(OracleStatementParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(OracleStatementParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(OracleStatementParser.COMMA, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(LP_);
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(734);
				match(NUMBER);
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(735);
					match(COMMA);
					setState(736);
					match(NUMBER);
					}
				}

				}
			}

			setState(741);
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
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(OracleStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(743);
				match(PRIMARY);
				}
			}

			setState(746);
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
		enterRule(_localctx, 116, RULE_matchNone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
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
		public List<TerminalNode> ID() { return getTokens(OracleStatementParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(OracleStatementParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(ID);
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(751);
				match(COMMA);
				setState(752);
				match(ID);
				}
				}
				setState(757);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_idList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(LP_);
			setState(759);
			ids();
			setState(760);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public TerminalNode OFFSET() { return getToken(OracleStatementParser.OFFSET, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_rangeClause);
		int _la;
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				rangeItem();
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(763);
					match(COMMA);
					setState(764);
					rangeItem();
					}
					}
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				rangeItem();
				setState(771);
				match(OFFSET);
				setState(772);
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
		enterRule(_localctx, 124, RULE_rangeItem);
		try {
			setState(778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				number();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public SchemaNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaNames; }
	}

	public final SchemaNamesContext schemaNames() throws RecognitionException {
		SchemaNamesContext _localctx = new SchemaNamesContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_schemaNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			schemaName();
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(781);
				match(COMMA);
				setState(782);
				schemaName();
				}
				}
				setState(787);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public DatabaseNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseNames; }
	}

	public final DatabaseNamesContext databaseNames() throws RecognitionException {
		DatabaseNamesContext _localctx = new DatabaseNamesContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_databaseNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			databaseName();
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(789);
				match(COMMA);
				setState(790);
				databaseName();
				}
				}
				setState(795);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public DomainNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainNames; }
	}

	public final DomainNamesContext domainNames() throws RecognitionException {
		DomainNamesContext _localctx = new DomainNamesContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_domainNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			domainName();
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(797);
				match(COMMA);
				setState(798);
				domainName();
				}
				}
				setState(803);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableList; }
	}

	public final TableListContext tableList() throws RecognitionException {
		TableListContext _localctx = new TableListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_tableList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(LP_);
			setState(805);
			tableNames();
			setState(806);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			tableName();
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(809);
				match(COMMA);
				setState(810);
				tableName();
				}
				}
				setState(815);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ColumnNamesWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNamesWithParen; }
	}

	public final ColumnNamesWithParenContext columnNamesWithParen() throws RecognitionException {
		ColumnNamesWithParenContext _localctx = new ColumnNamesWithParenContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_columnNamesWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(LP_);
			setState(817);
			columnNames();
			setState(818);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			columnName();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(821);
				match(COMMA);
				setState(822);
				columnName();
				}
				}
				setState(827);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_columnList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(LP_);
			setState(829);
			columnNames();
			setState(830);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public SequenceNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceNames; }
	}

	public final SequenceNamesContext sequenceNames() throws RecognitionException {
		SequenceNamesContext _localctx = new SequenceNamesContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_sequenceNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			sequenceName();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(833);
				match(COMMA);
				setState(834);
				sequenceName();
				}
				}
				setState(839);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public TablespaceNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceNames; }
	}

	public final TablespaceNamesContext tablespaceNames() throws RecognitionException {
		TablespaceNamesContext _localctx = new TablespaceNamesContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_tablespaceNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			tablespaceName();
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(841);
				match(COMMA);
				setState(842);
				tablespaceName();
				}
				}
				setState(847);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public IndexNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexNames; }
	}

	public final IndexNamesContext indexNames() throws RecognitionException {
		IndexNamesContext _localctx = new IndexNamesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_indexNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			indexName();
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(849);
				match(COMMA);
				setState(850);
				indexName();
				}
				}
				setState(855);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public IndexNamesContext indexNames() {
			return getRuleContext(IndexNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public IndexListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexList; }
	}

	public final IndexListContext indexList() throws RecognitionException {
		IndexListContext _localctx = new IndexListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_indexList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(LP_);
			setState(857);
			indexNames();
			setState(858);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public TypeNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNames; }
	}

	public final TypeNamesContext typeNames() throws RecognitionException {
		TypeNamesContext _localctx = new TypeNamesContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_typeNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			typeName();
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(861);
				match(COMMA);
				setState(862);
				typeName();
				}
				}
				setState(867);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public RowNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowNames; }
	}

	public final RowNamesContext rowNames() throws RecognitionException {
		RowNamesContext _localctx = new RowNamesContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_rowNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			rowName();
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(869);
				match(COMMA);
				setState(870);
				rowName();
				}
				}
				setState(875);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public RoleNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleNames; }
	}

	public final RoleNamesContext roleNames() throws RecognitionException {
		RoleNamesContext _localctx = new RoleNamesContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_roleNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			roleName();
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(877);
				match(COMMA);
				setState(878);
				roleName();
				}
				}
				setState(883);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public UserNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userNames; }
	}

	public final UserNamesContext userNames() throws RecognitionException {
		UserNamesContext _localctx = new UserNamesContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_userNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			userName();
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(885);
				match(COMMA);
				setState(886);
				userName();
				}
				}
				setState(891);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public ServerNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverNames; }
	}

	public final ServerNamesContext serverNames() throws RecognitionException {
		ServerNamesContext _localctx = new ServerNamesContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_serverNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			serverName();
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(893);
				match(COMMA);
				setState(894);
				serverName();
				}
				}
				setState(899);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public BitExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExprs; }
	}

	public final BitExprsContext bitExprs() throws RecognitionException {
		BitExprsContext _localctx = new BitExprsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_bitExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			bitExpr(0);
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(901);
				match(COMMA);
				setState(902);
				bitExpr(0);
				}
				}
				setState(907);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			expr(0);
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(909);
				match(COMMA);
				setState(910);
				expr(0);
				}
				}
				setState(915);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ExprsWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprsWithParen; }
	}

	public final ExprsWithParenContext exprsWithParen() throws RecognitionException {
		ExprsWithParenContext _localctx = new ExprsWithParenContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_exprsWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(LP_);
			setState(917);
			exprs();
			setState(918);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(OracleStatementParser.NOT_, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public ExprRecursiveContext exprRecursive() {
			return getRuleContext(ExprRecursiveContext.class,0);
		}
		public TerminalNode AND() { return getToken(OracleStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(OracleStatementParser.AND_, 0); }
		public TerminalNode XOR() { return getToken(OracleStatementParser.XOR, 0); }
		public TerminalNode OR() { return getToken(OracleStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(OracleStatementParser.OR_, 0); }
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
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(921);
				match(LP_);
				setState(922);
				expr(0);
				setState(923);
				match(RP_);
				}
				break;
			case 2:
				{
				setState(925);
				match(NOT);
				setState(926);
				expr(6);
				}
				break;
			case 3:
				{
				setState(927);
				match(NOT_);
				setState(928);
				expr(5);
				}
				break;
			case 4:
				{
				setState(929);
				booleanPrimary(0);
				}
				break;
			case 5:
				{
				setState(930);
				exprRecursive();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(950);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(948);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(933);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(934);
						match(AND);
						setState(935);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(936);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(937);
						match(AND_);
						setState(938);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(939);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(940);
						match(XOR);
						setState(941);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(942);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(943);
						match(OR);
						setState(944);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(945);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(946);
						match(OR_);
						setState(947);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(952);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class BooleanPrimaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(OracleStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OracleStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(OracleStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ() { return getToken(OracleStatementParser.SAFE_EQ, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
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
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(954);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(976);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(974);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(956);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(957);
						match(IS);
						setState(959);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(958);
							match(NOT);
							}
						}

						setState(961);
						_la = _input.LA(1);
						if ( !(((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & ((1L << (FALSE - 176)) | (1L << (NULL - 176)) | (1L << (TRUE - 176)) | (1L << (UNKNOWN - 176)))) != 0)) ) {
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
						setState(962);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(963);
						match(SAFE_EQ);
						setState(964);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(965);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(966);
						comparisonOperator();
						setState(967);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(969);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(970);
						comparisonOperator();
						setState(971);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(972);
						subquery();
						}
						break;
					}
					} 
				}
				setState(978);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(OracleStatementParser.EQ_, 0); }
		public TerminalNode GTE() { return getToken(OracleStatementParser.GTE, 0); }
		public TerminalNode GT() { return getToken(OracleStatementParser.GT, 0); }
		public TerminalNode LTE() { return getToken(OracleStatementParser.LTE, 0); }
		public TerminalNode LT() { return getToken(OracleStatementParser.LT, 0); }
		public TerminalNode NEQ_() { return getToken(OracleStatementParser.NEQ_, 0); }
		public TerminalNode NEQ() { return getToken(OracleStatementParser.NEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			_la = _input.LA(1);
			if ( !(((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (EQ_ - 141)) | (1L << (NEQ - 141)) | (1L << (NEQ_ - 141)) | (1L << (GT - 141)) | (1L << (GTE - 141)) | (1L << (LT - 141)) | (1L << (LTE - 141)))) != 0)) ) {
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
		public TerminalNode IN() { return getToken(OracleStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public TerminalNode BETWEEN() { return getToken(OracleStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(OracleStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SOUNDS() { return getToken(OracleStatementParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(OracleStatementParser.LIKE, 0); }
		public List<TerminalNode> ESCAPE() { return getTokens(OracleStatementParser.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(OracleStatementParser.ESCAPE, i);
		}
		public TerminalNode REGEXP() { return getToken(OracleStatementParser.REGEXP, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_predicate);
		int _la;
		try {
			int _alt;
			setState(1039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(981);
				bitExpr(0);
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(982);
					match(NOT);
					}
				}

				setState(985);
				match(IN);
				setState(986);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(988);
				bitExpr(0);
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(989);
					match(NOT);
					}
				}

				setState(992);
				match(IN);
				setState(993);
				match(LP_);
				setState(994);
				simpleExpr(0);
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(995);
					match(COMMA);
					setState(996);
					simpleExpr(0);
					}
					}
					setState(1001);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1002);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
				match(BETWEEN);
				setState(1009);
				simpleExpr(0);
				setState(1010);
				match(AND);
				setState(1011);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1013);
				bitExpr(0);
				setState(1014);
				match(SOUNDS);
				setState(1015);
				match(LIKE);
				setState(1016);
				simpleExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1018);
				bitExpr(0);
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1019);
					match(NOT);
					}
				}

				setState(1022);
				match(LIKE);
				setState(1023);
				simpleExpr(0);
				setState(1028);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1024);
						match(ESCAPE);
						setState(1025);
						simpleExpr(0);
						}
						} 
					}
					setState(1030);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1031);
				bitExpr(0);
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1032);
					match(NOT);
					}
				}

				setState(1035);
				match(REGEXP);
				setState(1036);
				simpleExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1038);
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
		public TerminalNode BIT_INCLUSIVE_OR() { return getToken(OracleStatementParser.BIT_INCLUSIVE_OR, 0); }
		public TerminalNode BIT_AND() { return getToken(OracleStatementParser.BIT_AND, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT() { return getToken(OracleStatementParser.SIGNED_LEFT_SHIFT, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT() { return getToken(OracleStatementParser.SIGNED_RIGHT_SHIFT, 0); }
		public TerminalNode PLUS() { return getToken(OracleStatementParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(OracleStatementParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(OracleStatementParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(OracleStatementParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(OracleStatementParser.MOD, 0); }
		public TerminalNode MOD_() { return getToken(OracleStatementParser.MOD_, 0); }
		public TerminalNode BIT_EXCLUSIVE_OR() { return getToken(OracleStatementParser.BIT_EXCLUSIVE_OR, 0); }
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
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1042);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1085);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1083);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1044);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1045);
						match(BIT_INCLUSIVE_OR);
						setState(1046);
						bitExpr(15);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1047);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1048);
						match(BIT_AND);
						setState(1049);
						bitExpr(14);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1050);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1051);
						match(SIGNED_LEFT_SHIFT);
						setState(1052);
						bitExpr(13);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1053);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1054);
						match(SIGNED_RIGHT_SHIFT);
						setState(1055);
						bitExpr(12);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1056);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1057);
						match(PLUS);
						setState(1058);
						bitExpr(11);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1059);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1060);
						match(MINUS);
						setState(1061);
						bitExpr(10);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1062);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1063);
						match(ASTERISK);
						setState(1064);
						bitExpr(9);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1065);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1066);
						match(SLASH);
						setState(1067);
						bitExpr(8);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1068);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1069);
						match(MOD);
						setState(1070);
						bitExpr(7);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1071);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1072);
						match(MOD_);
						setState(1073);
						bitExpr(6);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1074);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1075);
						match(BIT_EXCLUSIVE_OR);
						setState(1076);
						bitExpr(5);
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1077);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1078);
						match(PLUS);
						setState(1079);
						intervalExpr();
						}
						break;
					case 13:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1080);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1081);
						match(MINUS);
						setState(1082);
						intervalExpr();
						}
						break;
					}
					} 
				}
				setState(1087);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
		public TerminalNode PLUS() { return getToken(OracleStatementParser.PLUS, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(OracleStatementParser.MINUS, 0); }
		public TerminalNode UNARY_BIT_COMPLEMENT() { return getToken(OracleStatementParser.UNARY_BIT_COMPLEMENT, 0); }
		public TerminalNode NOT_() { return getToken(OracleStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(OracleStatementParser.BINARY, 0); }
		public ExprsWithParenContext exprsWithParen() {
			return getRuleContext(ExprsWithParenContext.class,0);
		}
		public TerminalNode ROW() { return getToken(OracleStatementParser.ROW, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(OracleStatementParser.EXISTS, 0); }
		public CaseExpressContext caseExpress() {
			return getRuleContext(CaseExpressContext.class,0);
		}
		public IntervalExprContext intervalExpr() {
			return getRuleContext(IntervalExprContext.class,0);
		}
		public PrivateExprOfDbContext privateExprOfDb() {
			return getRuleContext(PrivateExprOfDbContext.class,0);
		}
		public TerminalNode AND_() { return getToken(OracleStatementParser.AND_, 0); }
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
		int _startState = 176;
		enterRecursionRule(_localctx, 176, RULE_simpleExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(1089);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1090);
				liter();
				}
				break;
			case 3:
				{
				setState(1091);
				columnName();
				}
				break;
			case 4:
				{
				setState(1092);
				variable();
				}
				break;
			case 5:
				{
				setState(1093);
				match(PLUS);
				setState(1094);
				simpleExpr(12);
				}
				break;
			case 6:
				{
				setState(1095);
				match(MINUS);
				setState(1096);
				simpleExpr(11);
				}
				break;
			case 7:
				{
				setState(1097);
				match(UNARY_BIT_COMPLEMENT);
				setState(1098);
				simpleExpr(10);
				}
				break;
			case 8:
				{
				setState(1099);
				match(NOT_);
				setState(1100);
				simpleExpr(9);
				}
				break;
			case 9:
				{
				setState(1101);
				match(BINARY);
				setState(1102);
				simpleExpr(8);
				}
				break;
			case 10:
				{
				setState(1103);
				exprsWithParen();
				}
				break;
			case 11:
				{
				setState(1104);
				match(ROW);
				setState(1105);
				exprsWithParen();
				}
				break;
			case 12:
				{
				setState(1106);
				subquery();
				}
				break;
			case 13:
				{
				setState(1107);
				match(EXISTS);
				setState(1108);
				subquery();
				}
				break;
			case 14:
				{
				setState(1109);
				caseExpress();
				}
				break;
			case 15:
				{
				setState(1110);
				intervalExpr();
				}
				break;
			case 16:
				{
				setState(1111);
				privateExprOfDb();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1119);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1114);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1115);
						match(AND_);
						setState(1116);
						simpleExpr(14);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1117);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1118);
						collateClause();
						}
						break;
					}
					} 
				}
				setState(1123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(OracleStatementParser.ASTERISK, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			match(ID);
			setState(1125);
			match(LP_);
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1126);
				distinct();
				}
			}

			setState(1131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case CASE:
			case NEW:
			case PRIOR:
			case TREAT:
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
				setState(1129);
				exprs();
				}
				break;
			case ASTERISK:
				{
				setState(1130);
				match(ASTERISK);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1133);
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
		public TerminalNode DISTINCT() { return getToken(OracleStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
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
		enterRule(_localctx, 182, RULE_intervalExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
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
		enterRule(_localctx, 184, RULE_caseExpress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
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
		enterRule(_localctx, 186, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
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
		public TerminalNode TRUE() { return getToken(OracleStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OracleStatementParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public TerminalNode LBE_() { return getToken(OracleStatementParser.LBE_, 0); }
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public TerminalNode STRING() { return getToken(OracleStatementParser.STRING, 0); }
		public TerminalNode RBE_() { return getToken(OracleStatementParser.RBE_, 0); }
		public TerminalNode HEX_DIGIT() { return getToken(OracleStatementParser.HEX_DIGIT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode DATE() { return getToken(OracleStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(OracleStatementParser.TIMESTAMP, 0); }
		public TerminalNode BIT_NUM() { return getToken(OracleStatementParser.BIT_NUM, 0); }
		public LiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liter; }
	}

	public final LiterContext liter() throws RecognitionException {
		LiterContext _localctx = new LiterContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_liter);
		int _la;
		try {
			setState(1168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1143);
				question();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1144);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1145);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1146);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1147);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1148);
				match(LBE_);
				setState(1149);
				match(ID);
				setState(1150);
				match(STRING);
				setState(1151);
				match(RBE_);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1152);
				match(HEX_DIGIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1153);
				string();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1154);
				match(ID);
				setState(1155);
				match(STRING);
				setState(1157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(1156);
					collateClause();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1159);
				_la = _input.LA(1);
				if ( !(((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (DATE - 171)) | (1L << (TIME - 171)) | (1L << (TIMESTAMP - 171)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1160);
				match(STRING);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(1161);
					match(ID);
					}
				}

				setState(1164);
				match(BIT_NUM);
				setState(1166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(1165);
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
		public TerminalNode QUESTION() { return getToken(OracleStatementParser.QUESTION, 0); }
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
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
		public TerminalNode NUMBER() { return getToken(OracleStatementParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
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
		public TerminalNode STRING() { return getToken(OracleStatementParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
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
		enterRule(_localctx, 196, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
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
		enterRule(_localctx, 198, RULE_collateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
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
		public TerminalNode ORDER() { return getToken(OracleStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			match(ORDER);
			setState(1181);
			match(BY);
			setState(1182);
			orderByItem();
			setState(1187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1183);
				match(COMMA);
				setState(1184);
				orderByItem();
				}
				}
				setState(1189);
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
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(1190);
				columnName();
				}
				break;
			case 2:
				{
				setState(1191);
				number();
				}
				break;
			case 3:
				{
				setState(1192);
				expr(0);
				}
				break;
			}
			setState(1196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1195);
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
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TableIndexClauseContext tableIndexClause() {
			return getRuleContext(TableIndexClauseContext.class,0);
		}
		public BitmapJoinIndexClauseContext bitmapJoinIndexClause() {
			return getRuleContext(BitmapJoinIndexClauseContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public TerminalNode BITMAP() { return getToken(OracleStatementParser.BITMAP, 0); }
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_createIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			match(CREATE);
			setState(1200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BITMAP || _la==UNIQUE) {
				{
				setState(1199);
				_la = _input.LA(1);
				if ( !(_la==BITMAP || _la==UNIQUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1202);
			match(INDEX);
			setState(1203);
			indexName();
			setState(1204);
			match(ON);
			setState(1207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(1205);
				tableIndexClause();
				}
				break;
			case 2:
				{
				setState(1206);
				bitmapJoinIndexClause();
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

	public static class TableIndexClauseContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<IndexExprSortContext> indexExprSort() {
			return getRuleContexts(IndexExprSortContext.class);
		}
		public IndexExprSortContext indexExprSort(int i) {
			return getRuleContext(IndexExprSortContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public TableIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndexClause; }
	}

	public final TableIndexClauseContext tableIndexClause() throws RecognitionException {
		TableIndexClauseContext _localctx = new TableIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_tableIndexClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			tableName();
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1210);
				alias();
				}
			}

			setState(1213);
			match(LP_);
			setState(1214);
			indexExprSort();
			setState(1219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1215);
				match(COMMA);
				setState(1216);
				indexExprSort();
				}
				}
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1222);
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

	public static class IndexExprSortContext extends ParserRuleContext {
		public IndexExprContext indexExpr() {
			return getRuleContext(IndexExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public IndexExprSortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexExprSort; }
	}

	public final IndexExprSortContext indexExprSort() throws RecognitionException {
		IndexExprSortContext _localctx = new IndexExprSortContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_indexExprSort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			indexExpr();
			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1225);
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

	public static class IndexExprContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IndexExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexExpr; }
	}

	public final IndexExprContext indexExpr() throws RecognitionException {
		IndexExprContext _localctx = new IndexExprContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_indexExpr);
		try {
			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1228);
				columnName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1229);
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

	public static class TablespaceClauseWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TablespaceClauseContext tablespaceClause() {
			return getRuleContext(TablespaceClauseContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TablespaceClauseWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceClauseWithParen; }
	}

	public final TablespaceClauseWithParenContext tablespaceClauseWithParen() throws RecognitionException {
		TablespaceClauseWithParenContext _localctx = new TablespaceClauseWithParenContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_tablespaceClauseWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			match(LP_);
			setState(1233);
			tablespaceClause();
			setState(1234);
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

	public static class TablespaceClauseContext extends ParserRuleContext {
		public TerminalNode TABLESPACE() { return getToken(OracleStatementParser.TABLESPACE, 0); }
		public TablespaceNameContext tablespaceName() {
			return getRuleContext(TablespaceNameContext.class,0);
		}
		public TablespaceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceClause; }
	}

	public final TablespaceClauseContext tablespaceClause() throws RecognitionException {
		TablespaceClauseContext _localctx = new TablespaceClauseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_tablespaceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			match(TABLESPACE);
			setState(1237);
			tablespaceName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainIndexClauseContext extends ParserRuleContext {
		public IndexTypeNameContext indexTypeName() {
			return getRuleContext(IndexTypeNameContext.class,0);
		}
		public DomainIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainIndexClause; }
	}

	public final DomainIndexClauseContext domainIndexClause() throws RecognitionException {
		DomainIndexClauseContext _localctx = new DomainIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_domainIndexClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			indexTypeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitmapJoinIndexClauseContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ColumnSortClauseContext> columnSortClause() {
			return getRuleContexts(ColumnSortClauseContext.class);
		}
		public ColumnSortClauseContext columnSortClause(int i) {
			return getRuleContext(ColumnSortClauseContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public List<TableAndAliasContext> tableAndAlias() {
			return getRuleContexts(TableAndAliasContext.class);
		}
		public TableAndAliasContext tableAndAlias(int i) {
			return getRuleContext(TableAndAliasContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(OracleStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public BitmapJoinIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitmapJoinIndexClause; }
	}

	public final BitmapJoinIndexClauseContext bitmapJoinIndexClause() throws RecognitionException {
		BitmapJoinIndexClauseContext _localctx = new BitmapJoinIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_bitmapJoinIndexClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			tableName();
			setState(1242);
			match(LP_);
			setState(1243);
			columnSortClause();
			setState(1248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1244);
				match(COMMA);
				setState(1245);
				columnSortClause();
				}
				}
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1251);
			match(RP_);
			setState(1252);
			match(FROM);
			setState(1253);
			tableAndAlias();
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1254);
				match(COMMA);
				setState(1255);
				tableAndAlias();
				}
				}
				setState(1260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1261);
			match(WHERE);
			setState(1262);
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

	public static class AlterIndexContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_alterIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			match(ALTER);
			setState(1265);
			match(INDEX);
			setState(1266);
			indexName();
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RENAME) {
				{
				setState(1267);
				match(RENAME);
				setState(1268);
				match(TO);
				setState(1269);
				indexName();
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
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_dropIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			match(DROP);
			setState(1273);
			match(INDEX);
			setState(1274);
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

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public RelationalTableContext relationalTable() {
			return getRuleContext(RelationalTableContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(OracleStatementParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(OracleStatementParser.TEMPORARY, 0); }
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			match(CREATE);
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(1277);
				match(GLOBAL);
				setState(1278);
				match(TEMPORARY);
				}
			}

			setState(1281);
			match(TABLE);
			setState(1282);
			tableName();
			setState(1283);
			relationalTable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalTableContext extends ParserRuleContext {
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public RelationalPropertiesContext relationalProperties() {
			return getRuleContext(RelationalPropertiesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode ROWS() { return getToken(OracleStatementParser.ROWS, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode PRESERVE() { return getToken(OracleStatementParser.PRESERVE, 0); }
		public RelationalTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalTable; }
	}

	public final RelationalTableContext relationalTable() throws RecognitionException {
		RelationalTableContext _localctx = new RelationalTableContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_relationalTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1285);
				match(LP_);
				setState(1286);
				relationalProperties();
				setState(1287);
				match(RP_);
				}
			}

			setState(1295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1291);
				match(ON);
				setState(1292);
				match(COMMIT);
				setState(1293);
				_la = _input.LA(1);
				if ( !(_la==PRESERVE || _la==DELETE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1294);
				match(ROWS);
				}
			}

			setState(1297);
			tableProperties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalPropertiesContext extends ParserRuleContext {
		public List<RelationalPropertyContext> relationalProperty() {
			return getRuleContexts(RelationalPropertyContext.class);
		}
		public RelationalPropertyContext relationalProperty(int i) {
			return getRuleContext(RelationalPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public RelationalPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalProperties; }
	}

	public final RelationalPropertiesContext relationalProperties() throws RecognitionException {
		RelationalPropertiesContext _localctx = new RelationalPropertiesContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_relationalProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			relationalProperty();
			setState(1304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1300);
				match(COMMA);
				setState(1301);
				relationalProperty();
				}
				}
				setState(1306);
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

	public static class RelationalPropertyContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public VirtualColumnDefinitionContext virtualColumnDefinition() {
			return getRuleContext(VirtualColumnDefinitionContext.class,0);
		}
		public OutOfLineConstraintContext outOfLineConstraint() {
			return getRuleContext(OutOfLineConstraintContext.class,0);
		}
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public RelationalPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalProperty; }
	}

	public final RelationalPropertyContext relationalProperty() throws RecognitionException {
		RelationalPropertyContext _localctx = new RelationalPropertyContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_relationalProperty);
		try {
			setState(1311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1307);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1308);
				virtualColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1309);
				outOfLineConstraint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1310);
				outOfLineRefConstraint();
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

	public static class TablePropertiesContext extends ParserRuleContext {
		public ColumnPropertiesContext columnProperties() {
			return getRuleContext(ColumnPropertiesContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public UnionSelectContext unionSelect() {
			return getRuleContext(UnionSelectContext.class,0);
		}
		public TablePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperties; }
	}

	public final TablePropertiesContext tableProperties() throws RecognitionException {
		TablePropertiesContext _localctx = new TablePropertiesContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_tableProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1313);
				columnProperties();
				}
			}

			setState(1318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1316);
				match(AS);
				setState(1317);
				unionSelect();
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
		public TerminalNode SORT() { return getToken(OracleStatementParser.SORT, 0); }
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentityClauseContext identityClause() {
			return getRuleContext(IdentityClauseContext.class,0);
		}
		public TerminalNode ENCRYPT() { return getToken(OracleStatementParser.ENCRYPT, 0); }
		public EncryptionSpecContext encryptionSpec() {
			return getRuleContext(EncryptionSpecContext.class,0);
		}
		public InlineRefConstraintContext inlineRefConstraint() {
			return getRuleContext(InlineRefConstraintContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			columnName();
			setState(1321);
			dataType();
			setState(1323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1322);
				match(SORT);
				}
			}

			setState(1332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(1325);
				match(DEFAULT);
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1326);
					match(ON);
					setState(1327);
					match(NULL);
					}
				}

				setState(1330);
				expr(0);
				}
				break;
			case GENERATED:
				{
				setState(1331);
				identityClause();
				}
				break;
			case EOF:
			case ENCRYPT:
			case MODIFY:
			case SCOPE:
			case RP_:
			case COMMA:
			case SEMI_:
			case KEY:
			case NOT:
			case NULL:
			case PRIMARY:
			case SET:
			case WITH:
			case ADD:
			case CHECK:
			case COLUMN:
			case CONSTRAINT:
			case DROP:
			case REFERENCES:
			case UNIQUE:
				break;
			default:
				break;
			}
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENCRYPT) {
				{
				setState(1334);
				match(ENCRYPT);
				setState(1335);
				encryptionSpec();
				}
			}

			setState(1344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1339); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1338);
					inlineConstraint();
					}
					}
					setState(1341); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (KEY - 183)) | (1L << (NOT - 183)) | (1L << (NULL - 183)) | (1L << (PRIMARY - 183)) | (1L << (CHECK - 183)) | (1L << (CONSTRAINT - 183)) | (1L << (REFERENCES - 183)))) != 0) || _la==UNIQUE );
				}
				break;
			case 2:
				{
				setState(1343);
				inlineRefConstraint();
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

	public static class IdentityClauseContext extends ParserRuleContext {
		public TerminalNode GENERATED() { return getToken(OracleStatementParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(OracleStatementParser.IDENTITY, 0); }
		public TerminalNode ALWAYS() { return getToken(OracleStatementParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public List<IdentityOptionsContext> identityOptions() {
			return getRuleContexts(IdentityOptionsContext.class);
		}
		public IdentityOptionsContext identityOptions(int i) {
			return getRuleContext(IdentityOptionsContext.class,i);
		}
		public IdentityClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityClause; }
	}

	public final IdentityClauseContext identityClause() throws RecognitionException {
		IdentityClauseContext _localctx = new IdentityClauseContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_identityClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			match(GENERATED);
			setState(1354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALWAYS:
				{
				setState(1347);
				match(ALWAYS);
				}
				break;
			case BY:
				{
				setState(1348);
				match(BY);
				setState(1349);
				match(DEFAULT);
				setState(1352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1350);
					match(ON);
					setState(1351);
					match(NULL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1356);
			match(AS);
			setState(1357);
			match(IDENTITY);
			setState(1359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1358);
				match(LP_);
				}
			}

			setState(1366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (CACHE - 8)) | (1L << (CYCLE - 8)) | (1L << (INCREMENT - 8)) | (1L << (MAXVALUE - 8)) | (1L << (MINVALUE - 8)) | (1L << (NOCACHE - 8)) | (1L << (NOCYCLE - 8)) | (1L << (NOMAXVALUE - 8)) | (1L << (NOMINVALUE - 8)) | (1L << (NOORDER - 8)))) != 0) || _la==ORDER || _la==START) {
				{
				setState(1362); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1361);
					identityOptions();
					}
					}
					setState(1364); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (CACHE - 8)) | (1L << (CYCLE - 8)) | (1L << (INCREMENT - 8)) | (1L << (MAXVALUE - 8)) | (1L << (MINVALUE - 8)) | (1L << (NOCACHE - 8)) | (1L << (NOCYCLE - 8)) | (1L << (NOMAXVALUE - 8)) | (1L << (NOMINVALUE - 8)) | (1L << (NOORDER - 8)))) != 0) || _la==ORDER || _la==START );
				}
			}

			setState(1369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1368);
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

	public static class IdentityOptionsContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(OracleStatementParser.START, 0); }
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode NUMBER() { return getToken(OracleStatementParser.NUMBER, 0); }
		public TerminalNode LIMIT() { return getToken(OracleStatementParser.LIMIT, 0); }
		public TerminalNode VALUE() { return getToken(OracleStatementParser.VALUE, 0); }
		public TerminalNode INCREMENT() { return getToken(OracleStatementParser.INCREMENT, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode MAXVALUE() { return getToken(OracleStatementParser.MAXVALUE, 0); }
		public TerminalNode NOMAXVALUE() { return getToken(OracleStatementParser.NOMAXVALUE, 0); }
		public TerminalNode MINVALUE() { return getToken(OracleStatementParser.MINVALUE, 0); }
		public TerminalNode NOMINVALUE() { return getToken(OracleStatementParser.NOMINVALUE, 0); }
		public TerminalNode CYCLE() { return getToken(OracleStatementParser.CYCLE, 0); }
		public TerminalNode NOCYCLE() { return getToken(OracleStatementParser.NOCYCLE, 0); }
		public TerminalNode CACHE() { return getToken(OracleStatementParser.CACHE, 0); }
		public TerminalNode NOCACHE() { return getToken(OracleStatementParser.NOCACHE, 0); }
		public TerminalNode ORDER() { return getToken(OracleStatementParser.ORDER, 0); }
		public TerminalNode NOORDER() { return getToken(OracleStatementParser.NOORDER, 0); }
		public IdentityOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityOptions; }
	}

	public final IdentityOptionsContext identityOptions() throws RecognitionException {
		IdentityOptionsContext _localctx = new IdentityOptionsContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_identityOptions);
		try {
			setState(1394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START:
				enterOuterAlt(_localctx, 1);
				{
				setState(1371);
				match(START);
				setState(1372);
				match(WITH);
				setState(1376);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(1373);
					match(NUMBER);
					}
					break;
				case LIMIT:
					{
					setState(1374);
					match(LIMIT);
					setState(1375);
					match(VALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case INCREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1378);
				match(INCREMENT);
				setState(1379);
				match(BY);
				setState(1380);
				match(NUMBER);
				}
				break;
			case MAXVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1381);
				match(MAXVALUE);
				setState(1382);
				match(NUMBER);
				}
				break;
			case NOMAXVALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1383);
				match(NOMAXVALUE);
				}
				break;
			case MINVALUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1384);
				match(MINVALUE);
				setState(1385);
				match(NUMBER);
				}
				break;
			case NOMINVALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1386);
				match(NOMINVALUE);
				}
				break;
			case CYCLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1387);
				match(CYCLE);
				}
				break;
			case NOCYCLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1388);
				match(NOCYCLE);
				}
				break;
			case CACHE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1389);
				match(CACHE);
				setState(1390);
				match(NUMBER);
				}
				break;
			case NOCACHE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1391);
				match(NOCACHE);
				}
				break;
			case ORDER:
				enterOuterAlt(_localctx, 11);
				{
				setState(1392);
				match(ORDER);
				}
				break;
			case NOORDER:
				enterOuterAlt(_localctx, 12);
				{
				setState(1393);
				match(NOORDER);
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

	public static class VirtualColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(OracleStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(OracleStatementParser.ALWAYS, 0); }
		public TerminalNode VIRTUAL() { return getToken(OracleStatementParser.VIRTUAL, 0); }
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public VirtualColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualColumnDefinition; }
	}

	public final VirtualColumnDefinitionContext virtualColumnDefinition() throws RecognitionException {
		VirtualColumnDefinitionContext _localctx = new VirtualColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_virtualColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			columnName();
			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE) | (1L << INTERVAL) | (1L << NATIONAL))) != 0) || _la==ID) {
				{
				setState(1397);
				dataType();
				}
			}

			setState(1402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GENERATED) {
				{
				setState(1400);
				match(GENERATED);
				setState(1401);
				match(ALWAYS);
				}
			}

			setState(1404);
			match(AS);
			setState(1405);
			match(LP_);
			setState(1406);
			expr(0);
			setState(1407);
			match(RP_);
			setState(1409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(1408);
				match(VIRTUAL);
				}
			}

			setState(1414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (KEY - 183)) | (1L << (NOT - 183)) | (1L << (NULL - 183)) | (1L << (PRIMARY - 183)) | (1L << (CHECK - 183)) | (1L << (CONSTRAINT - 183)) | (1L << (REFERENCES - 183)))) != 0) || _la==UNIQUE) {
				{
				{
				setState(1411);
				inlineConstraint();
				}
				}
				setState(1416);
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

	public static class InlineConstraintContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(OracleStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public InlineConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineConstraint; }
	}

	public final InlineConstraintContext inlineConstraint() throws RecognitionException {
		InlineConstraintContext _localctx = new InlineConstraintContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_inlineConstraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1417);
				match(CONSTRAINT);
				setState(1418);
				constraintName();
				}
			}

			setState(1433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NULL:
				{
				setState(1422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1421);
					match(NOT);
					}
				}

				setState(1424);
				match(NULL);
				}
				break;
			case UNIQUE:
				{
				setState(1425);
				match(UNIQUE);
				}
				break;
			case KEY:
			case PRIMARY:
				{
				setState(1426);
				primaryKey();
				}
				break;
			case REFERENCES:
				{
				setState(1427);
				referencesClause();
				}
				break;
			case CHECK:
				{
				setState(1428);
				match(CHECK);
				setState(1429);
				match(LP_);
				setState(1430);
				expr(0);
				setState(1431);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1435);
					constraintState();
					}
					} 
				}
				setState(1440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferencesClauseContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(OracleStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public ReferencesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencesClause; }
	}

	public final ReferencesClauseContext referencesClause() throws RecognitionException {
		ReferencesClauseContext _localctx = new ReferencesClauseContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_referencesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(REFERENCES);
			setState(1442);
			tableName();
			setState(1444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1443);
				columnList();
				}
			}

			setState(1453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1446);
				match(ON);
				setState(1447);
				match(DELETE);
				setState(1451);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASCADE:
					{
					setState(1448);
					match(CASCADE);
					}
					break;
				case SET:
					{
					setState(1449);
					match(SET);
					setState(1450);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ConstraintStateContext extends ParserRuleContext {
		public NotDeferrableContext notDeferrable() {
			return getRuleContext(NotDeferrableContext.class,0);
		}
		public InitiallyClauseContext initiallyClause() {
			return getRuleContext(InitiallyClauseContext.class,0);
		}
		public TerminalNode RELY() { return getToken(OracleStatementParser.RELY, 0); }
		public TerminalNode NORELY() { return getToken(OracleStatementParser.NORELY, 0); }
		public UsingIndexClauseContext usingIndexClause() {
			return getRuleContext(UsingIndexClauseContext.class,0);
		}
		public TerminalNode ENABLE() { return getToken(OracleStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(OracleStatementParser.DISABLE, 0); }
		public TerminalNode VALIDATE() { return getToken(OracleStatementParser.VALIDATE, 0); }
		public TerminalNode NOVALIDATE() { return getToken(OracleStatementParser.NOVALIDATE, 0); }
		public ExceptionsClauseContext exceptionsClause() {
			return getRuleContext(ExceptionsClauseContext.class,0);
		}
		public ConstraintStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintState; }
	}

	public final ConstraintStateContext constraintState() throws RecognitionException {
		ConstraintStateContext _localctx = new ConstraintStateContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_constraintState);
		try {
			setState(1465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFERRABLE:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				notDeferrable();
				}
				break;
			case INITIALLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1456);
				initiallyClause();
				}
				break;
			case RELY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1457);
				match(RELY);
				}
				break;
			case NORELY:
				enterOuterAlt(_localctx, 4);
				{
				setState(1458);
				match(NORELY);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 5);
				{
				setState(1459);
				usingIndexClause();
				}
				break;
			case ENABLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1460);
				match(ENABLE);
				}
				break;
			case DISABLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1461);
				match(DISABLE);
				}
				break;
			case VALIDATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1462);
				match(VALIDATE);
				}
				break;
			case NOVALIDATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1463);
				match(NOVALIDATE);
				}
				break;
			case EXCEPTIONS:
				enterOuterAlt(_localctx, 10);
				{
				setState(1464);
				exceptionsClause();
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

	public static class NotDeferrableContext extends ParserRuleContext {
		public TerminalNode DEFERRABLE() { return getToken(OracleStatementParser.DEFERRABLE, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public NotDeferrableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notDeferrable; }
	}

	public final NotDeferrableContext notDeferrable() throws RecognitionException {
		NotDeferrableContext _localctx = new NotDeferrableContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_notDeferrable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1467);
				match(NOT);
				}
			}

			setState(1470);
			match(DEFERRABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitiallyClauseContext extends ParserRuleContext {
		public TerminalNode INITIALLY() { return getToken(OracleStatementParser.INITIALLY, 0); }
		public TerminalNode IMMEDIATE() { return getToken(OracleStatementParser.IMMEDIATE, 0); }
		public TerminalNode DEFERRED() { return getToken(OracleStatementParser.DEFERRED, 0); }
		public InitiallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initiallyClause; }
	}

	public final InitiallyClauseContext initiallyClause() throws RecognitionException {
		InitiallyClauseContext _localctx = new InitiallyClauseContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_initiallyClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			match(INITIALLY);
			setState(1473);
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
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionsClauseContext extends ParserRuleContext {
		public TerminalNode EXCEPTIONS() { return getToken(OracleStatementParser.EXCEPTIONS, 0); }
		public TerminalNode INTO() { return getToken(OracleStatementParser.INTO, 0); }
		public ExceptionsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionsClause; }
	}

	public final ExceptionsClauseContext exceptionsClause() throws RecognitionException {
		ExceptionsClauseContext _localctx = new ExceptionsClauseContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_exceptionsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			match(EXCEPTIONS);
			setState(1476);
			match(INTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingIndexClauseContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public UsingIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingIndexClause; }
	}

	public final UsingIndexClauseContext usingIndexClause() throws RecognitionException {
		UsingIndexClauseContext _localctx = new UsingIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_usingIndexClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			match(USING);
			setState(1479);
			match(INDEX);
			setState(1485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case STRING:
				{
				setState(1480);
				indexName();
				}
				break;
			case LP_:
				{
				{
				setState(1481);
				match(LP_);
				setState(1482);
				createIndex();
				setState(1483);
				match(RP_);
				}
				}
				break;
			case EOF:
			case DEFERRABLE:
			case EXCEPTIONS:
			case INITIALLY:
			case MODIFY:
			case NORELY:
			case NOVALIDATE:
			case RELY:
			case USING:
			case VALIDATE:
			case RP_:
			case COMMA:
			case SEMI_:
			case KEY:
			case NOT:
			case NULL:
			case PRIMARY:
			case SET:
			case ADD:
			case CASCADE:
			case CHECK:
			case COLUMN:
			case CONSTRAINT:
			case DISABLE:
			case DROP:
			case ENABLE:
			case FOREIGN:
			case REFERENCES:
			case UNIQUE:
				break;
			default:
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

	public static class InlineRefConstraintContext extends ParserRuleContext {
		public TerminalNode SCOPE() { return getToken(OracleStatementParser.SCOPE, 0); }
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode ROWID() { return getToken(OracleStatementParser.ROWID, 0); }
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public InlineRefConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineRefConstraint; }
	}

	public final InlineRefConstraintContext inlineRefConstraint() throws RecognitionException {
		InlineRefConstraintContext _localctx = new InlineRefConstraintContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_inlineRefConstraint);
		int _la;
		try {
			setState(1503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1487);
				match(SCOPE);
				setState(1488);
				match(IS);
				setState(1489);
				tableName();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1490);
				match(WITH);
				setState(1491);
				match(ROWID);
				}
				break;
			case CONSTRAINT:
			case REFERENCES:
				enterOuterAlt(_localctx, 3);
				{
				setState(1494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1492);
					match(CONSTRAINT);
					setState(1493);
					constraintName();
					}
				}

				setState(1496);
				referencesClause();
				setState(1500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFERRABLE) | (1L << EXCEPTIONS) | (1L << INITIALLY))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NORELY - 67)) | (1L << (NOVALIDATE - 67)) | (1L << (RELY - 67)) | (1L << (USING - 67)) | (1L << (VALIDATE - 67)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (NOT - 187)) | (1L << (DISABLE - 187)) | (1L << (ENABLE - 187)))) != 0)) {
					{
					{
					setState(1497);
					constraintState();
					}
					}
					setState(1502);
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

	public static class OutOfLineConstraintContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(OracleStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(OracleStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public OutOfLineConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outOfLineConstraint; }
	}

	public final OutOfLineConstraintContext outOfLineConstraint() throws RecognitionException {
		OutOfLineConstraintContext _localctx = new OutOfLineConstraintContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_outOfLineConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1505);
				match(CONSTRAINT);
				setState(1506);
				constraintName();
				}
			}

			setState(1524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE:
				{
				setState(1509);
				match(UNIQUE);
				setState(1510);
				columnList();
				}
				break;
			case KEY:
			case PRIMARY:
				{
				setState(1511);
				primaryKey();
				setState(1512);
				columnList();
				}
				break;
			case FOREIGN:
				{
				setState(1514);
				match(FOREIGN);
				setState(1515);
				match(KEY);
				setState(1516);
				columnList();
				setState(1517);
				referencesClause();
				}
				break;
			case CHECK:
				{
				setState(1519);
				match(CHECK);
				setState(1520);
				match(LP_);
				setState(1521);
				expr(0);
				setState(1522);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFERRABLE) | (1L << EXCEPTIONS) | (1L << INITIALLY))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NORELY - 67)) | (1L << (NOVALIDATE - 67)) | (1L << (RELY - 67)) | (1L << (USING - 67)) | (1L << (VALIDATE - 67)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (NOT - 187)) | (1L << (DISABLE - 187)) | (1L << (ENABLE - 187)))) != 0)) {
				{
				{
				setState(1526);
				constraintState();
				}
				}
				setState(1531);
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

	public static class OutOfLineRefConstraintContext extends ParserRuleContext {
		public TerminalNode SCOPE() { return getToken(OracleStatementParser.SCOPE, 0); }
		public TerminalNode FOR() { return getToken(OracleStatementParser.FOR, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public LobItemContext lobItem() {
			return getRuleContext(LobItemContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode REF() { return getToken(OracleStatementParser.REF, 0); }
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode ROWID() { return getToken(OracleStatementParser.ROWID, 0); }
		public TerminalNode FOREIGN() { return getToken(OracleStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public LobItemListContext lobItemList() {
			return getRuleContext(LobItemListContext.class,0);
		}
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public OutOfLineRefConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outOfLineRefConstraint; }
	}

	public final OutOfLineRefConstraintContext outOfLineRefConstraint() throws RecognitionException {
		OutOfLineRefConstraintContext _localctx = new OutOfLineRefConstraintContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_outOfLineRefConstraint);
		int _la;
		try {
			setState(1561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1532);
				match(SCOPE);
				setState(1533);
				match(FOR);
				setState(1534);
				match(LP_);
				setState(1535);
				lobItem();
				setState(1536);
				match(RP_);
				setState(1537);
				match(IS);
				setState(1538);
				tableName();
				}
				break;
			case REF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1540);
				match(REF);
				setState(1541);
				match(LP_);
				setState(1542);
				lobItem();
				setState(1543);
				match(RP_);
				setState(1544);
				match(WITH);
				setState(1545);
				match(ROWID);
				}
				break;
			case CONSTRAINT:
			case FOREIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1547);
					match(CONSTRAINT);
					setState(1548);
					constraintName();
					}
				}

				setState(1551);
				match(FOREIGN);
				setState(1552);
				match(KEY);
				setState(1553);
				lobItemList();
				setState(1554);
				referencesClause();
				setState(1558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFERRABLE) | (1L << EXCEPTIONS) | (1L << INITIALLY))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NORELY - 67)) | (1L << (NOVALIDATE - 67)) | (1L << (RELY - 67)) | (1L << (USING - 67)) | (1L << (VALIDATE - 67)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (NOT - 187)) | (1L << (DISABLE - 187)) | (1L << (ENABLE - 187)))) != 0)) {
					{
					{
					setState(1555);
					constraintState();
					}
					}
					setState(1560);
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

	public static class EncryptionSpecContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(OracleStatementParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(OracleStatementParser.STRING, i);
		}
		public TerminalNode IDENTIFIED() { return getToken(OracleStatementParser.IDENTIFIED, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode SALT() { return getToken(OracleStatementParser.SALT, 0); }
		public TerminalNode NO() { return getToken(OracleStatementParser.NO, 0); }
		public EncryptionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encryptionSpec; }
	}

	public final EncryptionSpecContext encryptionSpec() throws RecognitionException {
		EncryptionSpecContext _localctx = new EncryptionSpecContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_encryptionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1563);
				match(USING);
				setState(1564);
				match(STRING);
				}
			}

			setState(1570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIED) {
				{
				setState(1567);
				match(IDENTIFIED);
				setState(1568);
				match(BY);
				setState(1569);
				match(STRING);
				}
			}

			setState(1573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(1572);
				match(STRING);
				}
			}

			setState(1579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SALT || _la==NO) {
				{
				setState(1576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1575);
					match(NO);
					}
				}

				setState(1578);
				match(SALT);
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

	public static class ObjectPropertiesContext extends ParserRuleContext {
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public ObjectPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperties; }
	}

	public final ObjectPropertiesContext objectProperties() throws RecognitionException {
		ObjectPropertiesContext _localctx = new ObjectPropertiesContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_objectProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			objectProperty();
			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1582);
				match(COMMA);
				setState(1583);
				objectProperty();
				}
				}
				setState(1588);
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

	public static class ObjectPropertyContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public InlineRefConstraintContext inlineRefConstraint() {
			return getRuleContext(InlineRefConstraintContext.class,0);
		}
		public OutOfLineConstraintContext outOfLineConstraint() {
			return getRuleContext(OutOfLineConstraintContext.class,0);
		}
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_objectProperty);
		int _la;
		try {
			setState(1610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1589);
					columnName();
					}
					break;
				case 2:
					{
					setState(1590);
					attributeName();
					}
					break;
				}
				setState(1595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1593);
					match(DEFAULT);
					setState(1594);
					expr(0);
					}
				}

				setState(1606);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1600);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (KEY - 183)) | (1L << (NOT - 183)) | (1L << (NULL - 183)) | (1L << (PRIMARY - 183)) | (1L << (CHECK - 183)) | (1L << (CONSTRAINT - 183)) | (1L << (REFERENCES - 183)))) != 0) || _la==UNIQUE) {
						{
						{
						setState(1597);
						inlineConstraint();
						}
						}
						setState(1602);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1604);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SCOPE || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (WITH - 205)) | (1L << (CONSTRAINT - 205)) | (1L << (REFERENCES - 205)))) != 0)) {
						{
						setState(1603);
						inlineRefConstraint();
						}
					}

					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1608);
				outOfLineConstraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1609);
				outOfLineRefConstraint();
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

	public static class ColumnPropertiesContext extends ParserRuleContext {
		public List<ColumnPropertyContext> columnProperty() {
			return getRuleContexts(ColumnPropertyContext.class);
		}
		public ColumnPropertyContext columnProperty(int i) {
			return getRuleContext(ColumnPropertyContext.class,i);
		}
		public ColumnPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProperties; }
	}

	public final ColumnPropertiesContext columnProperties() throws RecognitionException {
		ColumnPropertiesContext _localctx = new ColumnPropertiesContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_columnProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1612);
				columnProperty();
				}
				}
				setState(1615); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLUMN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnPropertyContext extends ParserRuleContext {
		public ObjectTypeColPropertiesContext objectTypeColProperties() {
			return getRuleContext(ObjectTypeColPropertiesContext.class,0);
		}
		public ColumnPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProperty; }
	}

	public final ColumnPropertyContext columnProperty() throws RecognitionException {
		ColumnPropertyContext _localctx = new ColumnPropertyContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_columnProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			objectTypeColProperties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectTypeColPropertiesContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SubstitutableColumnClauseContext substitutableColumnClause() {
			return getRuleContext(SubstitutableColumnClauseContext.class,0);
		}
		public ObjectTypeColPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectTypeColProperties; }
	}

	public final ObjectTypeColPropertiesContext objectTypeColProperties() throws RecognitionException {
		ObjectTypeColPropertiesContext _localctx = new ObjectTypeColPropertiesContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_objectTypeColProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			match(COLUMN);
			setState(1620);
			columnName();
			setState(1621);
			substitutableColumnClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubstitutableColumnClauseContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TerminalNode OF() { return getToken(OracleStatementParser.OF, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ELEMENT() { return getToken(OracleStatementParser.ELEMENT, 0); }
		public TerminalNode TYPE() { return getToken(OracleStatementParser.TYPE, 0); }
		public TerminalNode ONLY() { return getToken(OracleStatementParser.ONLY, 0); }
		public TerminalNode SUBSTITUTABLE() { return getToken(OracleStatementParser.SUBSTITUTABLE, 0); }
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode LEVELS() { return getToken(OracleStatementParser.LEVELS, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public SubstitutableColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substitutableColumnClause; }
	}

	public final SubstitutableColumnClauseContext substitutableColumnClause() throws RecognitionException {
		SubstitutableColumnClauseContext _localctx = new SubstitutableColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_substitutableColumnClause);
		int _la;
		try {
			setState(1645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELEMENT:
			case IS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELEMENT) {
					{
					setState(1623);
					match(ELEMENT);
					}
				}

				setState(1626);
				match(IS);
				setState(1627);
				match(OF);
				setState(1629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(1628);
					match(TYPE);
					}
				}

				setState(1631);
				match(LP_);
				setState(1633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ONLY) {
					{
					setState(1632);
					match(ONLY);
					}
				}

				setState(1635);
				typeName();
				setState(1636);
				match(RP_);
				}
				break;
			case SUBSTITUTABLE:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1638);
					match(NOT);
					}
				}

				setState(1641);
				match(SUBSTITUTABLE);
				setState(1642);
				match(AT);
				setState(1643);
				match(ALL);
				setState(1644);
				match(LEVELS);
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

	public static class UnionSelectContext extends ParserRuleContext {
		public List<SelectExpressionContext> selectExpression() {
			return getRuleContexts(SelectExpressionContext.class);
		}
		public SelectExpressionContext selectExpression(int i) {
			return getRuleContext(SelectExpressionContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(OracleStatementParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(OracleStatementParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(OracleStatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(OracleStatementParser.ALL, i);
		}
		public UnionSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionSelect; }
	}

	public final UnionSelectContext unionSelect() throws RecognitionException {
		UnionSelectContext _localctx = new UnionSelectContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_unionSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			selectExpression();
			setState(1655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(1648);
				match(UNION);
				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(1649);
					match(ALL);
					}
				}

				setState(1652);
				selectExpression();
				}
				}
				setState(1657);
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

	public static class SelectExpressionContext extends ParserRuleContext {
		public SelectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpression; }
	}

	public final SelectExpressionContext selectExpression() throws RecognitionException {
		SelectExpressionContext _localctx = new SelectExpressionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_selectExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
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
		enterRule(_localctx, 280, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			match(FROM);
			setState(1661);
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
		public TerminalNode WHERE() { return getToken(OracleStatementParser.WHERE, 0); }
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
		enterRule(_localctx, 282, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			match(WHERE);
			setState(1664);
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
		public TerminalNode GROUP() { return getToken(OracleStatementParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode ROLLUP() { return getToken(OracleStatementParser.ROLLUP, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			match(GROUP);
			setState(1667);
			match(BY);
			setState(1668);
			orderByItem();
			setState(1673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1669);
				match(COMMA);
				setState(1670);
				orderByItem();
				}
				}
				setState(1675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1676);
				match(WITH);
				setState(1677);
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
		public TerminalNode HAVING() { return getToken(OracleStatementParser.HAVING, 0); }
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
		enterRule(_localctx, 286, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			match(HAVING);
			setState(1681);
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
		public TerminalNode LIMIT() { return getToken(OracleStatementParser.LIMIT, 0); }
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
		enterRule(_localctx, 288, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			match(LIMIT);
			setState(1684);
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
		public TerminalNode PARTITION() { return getToken(OracleStatementParser.PARTITION, 0); }
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
		enterRule(_localctx, 290, RULE_partitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
			match(PARTITION);
			setState(1687);
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
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public SelectExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExprs; }
	}

	public final SelectExprsContext selectExprs() throws RecognitionException {
		SelectExprsContext _localctx = new SelectExprsContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_selectExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK:
				{
				setState(1689);
				asterisk();
				}
				break;
			case EOF:
			case COMMA:
				{
				setState(1690);
				selectExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1693);
				match(COMMA);
				setState(1694);
				selectExpr();
				}
				}
				setState(1699);
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
		public TerminalNode ASTERISK() { return getToken(OracleStatementParser.ASTERISK, 0); }
		public AsteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asterisk; }
	}

	public final AsteriskContext asterisk() throws RecognitionException {
		AsteriskContext _localctx = new AsteriskContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_asterisk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
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

	public static class SelectExprContext extends ParserRuleContext {
		public SelectExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpr; }
	}

	public final SelectExprContext selectExpr() throws RecognitionException {
		SelectExprContext _localctx = new SelectExprContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_selectExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
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
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_tableReferences);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterTablePropertiesContext alterTableProperties() {
			return getRuleContext(AlterTablePropertiesContext.class,0);
		}
		public ColumnClausesContext columnClauses() {
			return getRuleContext(ColumnClausesContext.class,0);
		}
		public ConstraintClausesContext constraintClauses() {
			return getRuleContext(ConstraintClausesContext.class,0);
		}
		public AlterExternalTableContext alterExternalTable() {
			return getRuleContext(AlterExternalTableContext.class,0);
		}
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
			setState(1706);
			match(ALTER);
			setState(1707);
			match(TABLE);
			setState(1708);
			tableName();
			setState(1713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1709);
				alterTableProperties();
				}
				break;
			case 2:
				{
				setState(1710);
				columnClauses();
				}
				break;
			case 3:
				{
				setState(1711);
				constraintClauses();
				}
				break;
			case 4:
				{
				setState(1712);
				alterExternalTable();
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

	public static class AlterTablePropertiesContext extends ParserRuleContext {
		public RenameTableContext renameTable() {
			return getRuleContext(RenameTableContext.class,0);
		}
		public TerminalNode REKEY() { return getToken(OracleStatementParser.REKEY, 0); }
		public EncryptionSpecContext encryptionSpec() {
			return getRuleContext(EncryptionSpecContext.class,0);
		}
		public AlterTablePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableProperties; }
	}

	public final AlterTablePropertiesContext alterTableProperties() throws RecognitionException {
		AlterTablePropertiesContext _localctx = new AlterTablePropertiesContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_alterTableProperties);
		try {
			setState(1718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1715);
				renameTable();
				}
				break;
			case REKEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1716);
				match(REKEY);
				setState(1717);
				encryptionSpec();
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

	public static class RenameTableContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
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
		enterRule(_localctx, 304, RULE_renameTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
			match(RENAME);
			setState(1721);
			match(TO);
			setState(1722);
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

	public static class ColumnClausesContext extends ParserRuleContext {
		public List<OpColumnClauseContext> opColumnClause() {
			return getRuleContexts(OpColumnClauseContext.class);
		}
		public OpColumnClauseContext opColumnClause(int i) {
			return getRuleContext(OpColumnClauseContext.class,i);
		}
		public RenameColumnContext renameColumn() {
			return getRuleContext(RenameColumnContext.class,0);
		}
		public ColumnClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnClauses; }
	}

	public final ColumnClausesContext columnClauses() throws RecognitionException {
		ColumnClausesContext _localctx = new ColumnClausesContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_columnClauses);
		int _la;
		try {
			setState(1730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIFY:
			case SET:
			case ADD:
			case DROP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1725); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1724);
					opColumnClause();
					}
					}
					setState(1727); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MODIFY || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (SET - 197)) | (1L << (ADD - 197)) | (1L << (DROP - 197)))) != 0) );
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1729);
				renameColumn();
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

	public static class OpColumnClauseContext extends ParserRuleContext {
		public AddColumnContext addColumn() {
			return getRuleContext(AddColumnContext.class,0);
		}
		public ModifyColumnContext modifyColumn() {
			return getRuleContext(ModifyColumnContext.class,0);
		}
		public DropColumnClauseContext dropColumnClause() {
			return getRuleContext(DropColumnClauseContext.class,0);
		}
		public OpColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opColumnClause; }
	}

	public final OpColumnClauseContext opColumnClause() throws RecognitionException {
		OpColumnClauseContext _localctx = new OpColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_opColumnClause);
		try {
			setState(1735);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1732);
				addColumn();
				}
				break;
			case MODIFY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1733);
				modifyColumn();
				}
				break;
			case SET:
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1734);
				dropColumnClause();
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

	public static class AddColumnContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(OracleStatementParser.ADD, 0); }
		public ColumnOrVirtualDefinitionsContext columnOrVirtualDefinitions() {
			return getRuleContext(ColumnOrVirtualDefinitionsContext.class,0);
		}
		public ColumnPropertiesContext columnProperties() {
			return getRuleContext(ColumnPropertiesContext.class,0);
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
			setState(1737);
			match(ADD);
			setState(1738);
			columnOrVirtualDefinitions();
			setState(1740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1739);
				columnProperties();
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

	public static class ColumnOrVirtualDefinitionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ColumnOrVirtualDefinitionContext> columnOrVirtualDefinition() {
			return getRuleContexts(ColumnOrVirtualDefinitionContext.class);
		}
		public ColumnOrVirtualDefinitionContext columnOrVirtualDefinition(int i) {
			return getRuleContext(ColumnOrVirtualDefinitionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public ColumnOrVirtualDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrVirtualDefinitions; }
	}

	public final ColumnOrVirtualDefinitionsContext columnOrVirtualDefinitions() throws RecognitionException {
		ColumnOrVirtualDefinitionsContext _localctx = new ColumnOrVirtualDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_columnOrVirtualDefinitions);
		int _la;
		try {
			setState(1754);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1742);
				match(LP_);
				setState(1743);
				columnOrVirtualDefinition();
				setState(1748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1744);
					match(COMMA);
					setState(1745);
					columnOrVirtualDefinition();
					}
					}
					setState(1750);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1751);
				match(RP_);
				}
				break;
			case ID:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1753);
				columnOrVirtualDefinition();
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

	public static class ColumnOrVirtualDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public VirtualColumnDefinitionContext virtualColumnDefinition() {
			return getRuleContext(VirtualColumnDefinitionContext.class,0);
		}
		public ColumnOrVirtualDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrVirtualDefinition; }
	}

	public final ColumnOrVirtualDefinitionContext columnOrVirtualDefinition() throws RecognitionException {
		ColumnOrVirtualDefinitionContext _localctx = new ColumnOrVirtualDefinitionContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_columnOrVirtualDefinition);
		try {
			setState(1758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1756);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1757);
				virtualColumnDefinition();
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

	public static class ModifyColumnContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(OracleStatementParser.MODIFY, 0); }
		public List<ModifyColPropertiesContext> modifyColProperties() {
			return getRuleContexts(ModifyColPropertiesContext.class);
		}
		public ModifyColPropertiesContext modifyColProperties(int i) {
			return getRuleContext(ModifyColPropertiesContext.class,i);
		}
		public ModifyColSubstitutableContext modifyColSubstitutable() {
			return getRuleContext(ModifyColSubstitutableContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ModifyColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumn; }
	}

	public final ModifyColumnContext modifyColumn() throws RecognitionException {
		ModifyColumnContext _localctx = new ModifyColumnContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_modifyColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			match(MODIFY);
			setState(1776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
			case ID:
			case STRING:
				{
				setState(1762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1761);
					match(LP_);
					}
				}

				setState(1764);
				modifyColProperties();
				setState(1769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1765);
					match(COMMA);
					setState(1766);
					modifyColProperties();
					}
					}
					setState(1771);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RP_) {
					{
					setState(1772);
					match(RP_);
					}
				}

				}
				break;
			case COLUMN:
				{
				setState(1775);
				modifyColSubstitutable();
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

	public static class ModifyColPropertiesContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENCRYPT() { return getToken(OracleStatementParser.ENCRYPT, 0); }
		public EncryptionSpecContext encryptionSpec() {
			return getRuleContext(EncryptionSpecContext.class,0);
		}
		public TerminalNode DECRYPT() { return getToken(OracleStatementParser.DECRYPT, 0); }
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public ModifyColPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColProperties; }
	}

	public final ModifyColPropertiesContext modifyColProperties() throws RecognitionException {
		ModifyColPropertiesContext _localctx = new ModifyColPropertiesContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_modifyColProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			columnName();
			setState(1780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE) | (1L << INTERVAL) | (1L << NATIONAL))) != 0) || _la==ID) {
				{
				setState(1779);
				dataType();
				}
			}

			setState(1784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1782);
				match(DEFAULT);
				setState(1783);
				expr(0);
				}
			}

			setState(1789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENCRYPT:
				{
				setState(1786);
				match(ENCRYPT);
				setState(1787);
				encryptionSpec();
				}
				break;
			case DECRYPT:
				{
				setState(1788);
				match(DECRYPT);
				}
				break;
			case EOF:
			case MODIFY:
			case RP_:
			case COMMA:
			case SEMI_:
			case KEY:
			case NOT:
			case NULL:
			case PRIMARY:
			case SET:
			case ADD:
			case CHECK:
			case CONSTRAINT:
			case DROP:
			case REFERENCES:
			case UNIQUE:
				break;
			default:
				break;
			}
			setState(1794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (KEY - 183)) | (1L << (NOT - 183)) | (1L << (NULL - 183)) | (1L << (PRIMARY - 183)) | (1L << (CHECK - 183)) | (1L << (CONSTRAINT - 183)) | (1L << (REFERENCES - 183)))) != 0) || _la==UNIQUE) {
				{
				{
				setState(1791);
				inlineConstraint();
				}
				}
				setState(1796);
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

	public static class ModifyColSubstitutableContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode SUBSTITUTABLE() { return getToken(OracleStatementParser.SUBSTITUTABLE, 0); }
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode LEVELS() { return getToken(OracleStatementParser.LEVELS, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode FORCE() { return getToken(OracleStatementParser.FORCE, 0); }
		public ModifyColSubstitutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColSubstitutable; }
	}

	public final ModifyColSubstitutableContext modifyColSubstitutable() throws RecognitionException {
		ModifyColSubstitutableContext _localctx = new ModifyColSubstitutableContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_modifyColSubstitutable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			match(COLUMN);
			setState(1798);
			columnName();
			setState(1800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1799);
				match(NOT);
				}
			}

			setState(1802);
			match(SUBSTITUTABLE);
			setState(1803);
			match(AT);
			setState(1804);
			match(ALL);
			setState(1805);
			match(LEVELS);
			setState(1807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORCE) {
				{
				setState(1806);
				match(FORCE);
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

	public static class DropColumnClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode UNUSED() { return getToken(OracleStatementParser.UNUSED, 0); }
		public ColumnOrColumnListContext columnOrColumnList() {
			return getRuleContext(ColumnOrColumnListContext.class,0);
		}
		public List<CascadeOrInvalidateContext> cascadeOrInvalidate() {
			return getRuleContexts(CascadeOrInvalidateContext.class);
		}
		public CascadeOrInvalidateContext cascadeOrInvalidate(int i) {
			return getRuleContext(CascadeOrInvalidateContext.class,i);
		}
		public DropColumnContext dropColumn() {
			return getRuleContext(DropColumnContext.class,0);
		}
		public DropColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnClause; }
	}

	public final DropColumnClauseContext dropColumnClause() throws RecognitionException {
		DropColumnClauseContext _localctx = new DropColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_dropColumnClause);
		int _la;
		try {
			setState(1819);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1809);
				match(SET);
				setState(1810);
				match(UNUSED);
				setState(1811);
				columnOrColumnList();
				setState(1815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INVALIDATE || _la==CASCADE) {
					{
					{
					setState(1812);
					cascadeOrInvalidate();
					}
					}
					setState(1817);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1818);
				dropColumn();
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

	public static class DropColumnContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public ColumnOrColumnListContext columnOrColumnList() {
			return getRuleContext(ColumnOrColumnListContext.class,0);
		}
		public List<CascadeOrInvalidateContext> cascadeOrInvalidate() {
			return getRuleContexts(CascadeOrInvalidateContext.class);
		}
		public CascadeOrInvalidateContext cascadeOrInvalidate(int i) {
			return getRuleContext(CascadeOrInvalidateContext.class,i);
		}
		public CheckpointNumberContext checkpointNumber() {
			return getRuleContext(CheckpointNumberContext.class,0);
		}
		public DropColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumn; }
	}

	public final DropColumnContext dropColumn() throws RecognitionException {
		DropColumnContext _localctx = new DropColumnContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_dropColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1821);
			match(DROP);
			setState(1822);
			columnOrColumnList();
			setState(1826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INVALIDATE || _la==CASCADE) {
				{
				{
				setState(1823);
				cascadeOrInvalidate();
				}
				}
				setState(1828);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHECKPOINT) {
				{
				setState(1829);
				checkpointNumber();
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

	public static class ColumnOrColumnListContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public ColumnOrColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrColumnList; }
	}

	public final ColumnOrColumnListContext columnOrColumnList() throws RecognitionException {
		ColumnOrColumnListContext _localctx = new ColumnOrColumnListContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_columnOrColumnList);
		int _la;
		try {
			setState(1845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLUMN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1832);
				match(COLUMN);
				setState(1833);
				columnName();
				}
				break;
			case LP_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1834);
				match(LP_);
				setState(1835);
				columnName();
				setState(1840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1836);
					match(COMMA);
					setState(1837);
					columnName();
					}
					}
					setState(1842);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1843);
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

	public static class CascadeOrInvalidateContext extends ParserRuleContext {
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(OracleStatementParser.CONSTRAINTS, 0); }
		public TerminalNode INVALIDATE() { return getToken(OracleStatementParser.INVALIDATE, 0); }
		public CascadeOrInvalidateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cascadeOrInvalidate; }
	}

	public final CascadeOrInvalidateContext cascadeOrInvalidate() throws RecognitionException {
		CascadeOrInvalidateContext _localctx = new CascadeOrInvalidateContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_cascadeOrInvalidate);
		try {
			setState(1850);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASCADE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1847);
				match(CASCADE);
				setState(1848);
				match(CONSTRAINTS);
				}
				break;
			case INVALIDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1849);
				match(INVALIDATE);
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

	public static class CheckpointNumberContext extends ParserRuleContext {
		public TerminalNode CHECKPOINT() { return getToken(OracleStatementParser.CHECKPOINT, 0); }
		public TerminalNode NUMBER() { return getToken(OracleStatementParser.NUMBER, 0); }
		public CheckpointNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkpointNumber; }
	}

	public final CheckpointNumberContext checkpointNumber() throws RecognitionException {
		CheckpointNumberContext _localctx = new CheckpointNumberContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_checkpointNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			match(CHECKPOINT);
			setState(1853);
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

	public static class RenameColumnContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public RenameColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameColumn; }
	}

	public final RenameColumnContext renameColumn() throws RecognitionException {
		RenameColumnContext _localctx = new RenameColumnContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_renameColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1855);
			match(RENAME);
			setState(1856);
			match(COLUMN);
			setState(1857);
			columnName();
			setState(1858);
			match(TO);
			setState(1859);
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

	public static class ConstraintClausesContext extends ParserRuleContext {
		public AddConstraintContext addConstraint() {
			return getRuleContext(AddConstraintContext.class,0);
		}
		public ModifyConstraintClauseContext modifyConstraintClause() {
			return getRuleContext(ModifyConstraintClauseContext.class,0);
		}
		public RenameConstraintClauseContext renameConstraintClause() {
			return getRuleContext(RenameConstraintClauseContext.class,0);
		}
		public List<DropConstraintClauseContext> dropConstraintClause() {
			return getRuleContexts(DropConstraintClauseContext.class);
		}
		public DropConstraintClauseContext dropConstraintClause(int i) {
			return getRuleContext(DropConstraintClauseContext.class,i);
		}
		public ConstraintClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintClauses; }
	}

	public final ConstraintClausesContext constraintClauses() throws RecognitionException {
		ConstraintClausesContext _localctx = new ConstraintClausesContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_constraintClauses);
		int _la;
		try {
			setState(1869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1861);
				addConstraint();
				}
				break;
			case MODIFY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1862);
				modifyConstraintClause();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(1863);
				renameConstraintClause();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 4);
				{
				setState(1865); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1864);
					dropConstraintClause();
					}
					}
					setState(1867); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DROP );
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

	public static class AddConstraintContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(OracleStatementParser.ADD, 0); }
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public List<OutOfLineConstraintContext> outOfLineConstraint() {
			return getRuleContexts(OutOfLineConstraintContext.class);
		}
		public OutOfLineConstraintContext outOfLineConstraint(int i) {
			return getRuleContext(OutOfLineConstraintContext.class,i);
		}
		public AddConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraint; }
	}

	public final AddConstraintContext addConstraint() throws RecognitionException {
		AddConstraintContext _localctx = new AddConstraintContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_addConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1871);
			match(ADD);
			setState(1878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1873); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1872);
					outOfLineConstraint();
					}
					}
					setState(1875); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (KEY - 183)) | (1L << (PRIMARY - 183)) | (1L << (CHECK - 183)) | (1L << (CONSTRAINT - 183)) | (1L << (FOREIGN - 183)))) != 0) || _la==UNIQUE );
				}
				break;
			case 2:
				{
				setState(1877);
				outOfLineRefConstraint();
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

	public static class ModifyConstraintClauseContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(OracleStatementParser.MODIFY, 0); }
		public ConstraintOptionContext constraintOption() {
			return getRuleContext(ConstraintOptionContext.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public ModifyConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyConstraintClause; }
	}

	public final ModifyConstraintClauseContext modifyConstraintClause() throws RecognitionException {
		ModifyConstraintClauseContext _localctx = new ModifyConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_modifyConstraintClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1880);
			match(MODIFY);
			setState(1881);
			constraintOption();
			setState(1883); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1882);
				constraintState();
				}
				}
				setState(1885); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFERRABLE) | (1L << EXCEPTIONS) | (1L << INITIALLY))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NORELY - 67)) | (1L << (NOVALIDATE - 67)) | (1L << (RELY - 67)) | (1L << (USING - 67)) | (1L << (VALIDATE - 67)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (NOT - 187)) | (1L << (DISABLE - 187)) | (1L << (ENABLE - 187)))) != 0) );
			setState(1888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE) {
				{
				setState(1887);
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

	public static class ConstraintWithNameContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public ConstraintWithNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintWithName; }
	}

	public final ConstraintWithNameContext constraintWithName() throws RecognitionException {
		ConstraintWithNameContext _localctx = new ConstraintWithNameContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_constraintWithName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1890);
			match(CONSTRAINT);
			setState(1891);
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

	public static class ConstraintOptionContext extends ParserRuleContext {
		public ConstraintWithNameContext constraintWithName() {
			return getRuleContext(ConstraintWithNameContext.class,0);
		}
		public ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() {
			return getRuleContext(ConstraintPrimaryOrUniqueContext.class,0);
		}
		public ConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintOption; }
	}

	public final ConstraintOptionContext constraintOption() throws RecognitionException {
		ConstraintOptionContext _localctx = new ConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_constraintOption);
		try {
			setState(1895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1893);
				constraintWithName();
				}
				break;
			case KEY:
			case PRIMARY:
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1894);
				constraintPrimaryOrUnique();
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

	public static class ConstraintPrimaryOrUniqueContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public ConstraintPrimaryOrUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintPrimaryOrUnique; }
	}

	public final ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() throws RecognitionException {
		ConstraintPrimaryOrUniqueContext _localctx = new ConstraintPrimaryOrUniqueContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_constraintPrimaryOrUnique);
		try {
			setState(1900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1897);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1898);
				match(UNIQUE);
				setState(1899);
				columnList();
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

	public static class RenameConstraintClauseContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public ConstraintWithNameContext constraintWithName() {
			return getRuleContext(ConstraintWithNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public RenameConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameConstraintClause; }
	}

	public final RenameConstraintClauseContext renameConstraintClause() throws RecognitionException {
		RenameConstraintClauseContext _localctx = new RenameConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_renameConstraintClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1902);
			match(RENAME);
			setState(1903);
			constraintWithName();
			setState(1904);
			match(TO);
			setState(1905);
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

	public static class DropConstraintClauseContext extends ParserRuleContext {
		public List<TerminalNode> DROP() { return getTokens(OracleStatementParser.DROP); }
		public TerminalNode DROP(int i) {
			return getToken(OracleStatementParser.DROP, i);
		}
		public ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() {
			return getRuleContext(ConstraintPrimaryOrUniqueContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public DropConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintClause; }
	}

	public final DropConstraintClauseContext dropConstraintClause() throws RecognitionException {
		DropConstraintClauseContext _localctx = new DropConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_dropConstraintClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			match(DROP);
			setState(1921);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
			case UNIQUE:
				{
				setState(1908);
				constraintPrimaryOrUnique();
				setState(1910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE) {
					{
					setState(1909);
					match(CASCADE);
					}
				}

				setState(1914);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1912);
					_la = _input.LA(1);
					if ( !(_la==KEEP || _la==DROP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1913);
					match(INDEX);
					}
					break;
				}
				}
				break;
			case CONSTRAINT:
				{
				{
				setState(1916);
				match(CONSTRAINT);
				setState(1917);
				constraintName();
				setState(1919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE) {
					{
					setState(1918);
					match(CASCADE);
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

	public static class AlterExternalTableContext extends ParserRuleContext {
		public List<AddColumnContext> addColumn() {
			return getRuleContexts(AddColumnContext.class);
		}
		public AddColumnContext addColumn(int i) {
			return getRuleContext(AddColumnContext.class,i);
		}
		public List<ModifyColumnContext> modifyColumn() {
			return getRuleContexts(ModifyColumnContext.class);
		}
		public ModifyColumnContext modifyColumn(int i) {
			return getRuleContext(ModifyColumnContext.class,i);
		}
		public List<DropColumnContext> dropColumn() {
			return getRuleContexts(DropColumnContext.class);
		}
		public DropColumnContext dropColumn(int i) {
			return getRuleContext(DropColumnContext.class,i);
		}
		public AlterExternalTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterExternalTable; }
	}

	public final AlterExternalTableContext alterExternalTable() throws RecognitionException {
		AlterExternalTableContext _localctx = new AlterExternalTableContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_alterExternalTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1926); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1926);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(1923);
					addColumn();
					}
					break;
				case MODIFY:
					{
					setState(1924);
					modifyColumn();
					}
					break;
				case DROP:
					{
					setState(1925);
					dropColumn();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1928); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MODIFY || _la==ADD || _la==DROP );
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1930);
			match(DROP);
			setState(1931);
			match(TABLE);
			setState(1932);
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

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(OracleStatementParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
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
		enterRule(_localctx, 354, RULE_truncateTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1934);
			match(TRUNCATE);
			setState(1935);
			match(TABLE);
			setState(1936);
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
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(OracleStatementParser.TRANSACTION, 0); }
		public TerminalNode READ() { return getToken(OracleStatementParser.READ, 0); }
		public TerminalNode ISOLATION() { return getToken(OracleStatementParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(OracleStatementParser.LEVEL, 0); }
		public TerminalNode USE() { return getToken(OracleStatementParser.USE, 0); }
		public TerminalNode ROLLBACK() { return getToken(OracleStatementParser.ROLLBACK, 0); }
		public TerminalNode SEGMENT() { return getToken(OracleStatementParser.SEGMENT, 0); }
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public TerminalNode ONLY() { return getToken(OracleStatementParser.ONLY, 0); }
		public TerminalNode WRITE() { return getToken(OracleStatementParser.WRITE, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(OracleStatementParser.SERIALIZABLE, 0); }
		public TerminalNode COMMITTED() { return getToken(OracleStatementParser.COMMITTED, 0); }
		public TerminalNode NAME() { return getToken(OracleStatementParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(OracleStatementParser.STRING, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_setTransaction);
		int _la;
		try {
			setState(1957);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1938);
				match(SET);
				setState(1939);
				match(TRANSACTION);
				setState(1953);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case READ:
					{
					setState(1940);
					match(READ);
					setState(1941);
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
				case ISOLATION:
					{
					setState(1942);
					match(ISOLATION);
					setState(1943);
					match(LEVEL);
					setState(1947);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SERIALIZABLE:
						{
						setState(1944);
						match(SERIALIZABLE);
						}
						break;
					case READ:
						{
						setState(1945);
						match(READ);
						setState(1946);
						match(COMMITTED);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case USE:
					{
					setState(1949);
					match(USE);
					setState(1950);
					match(ROLLBACK);
					setState(1951);
					match(SEGMENT);
					setState(1952);
					match(ID);
					}
					break;
				case EOF:
				case SEMI_:
					break;
				default:
					break;
				}
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1955);
				match(NAME);
				setState(1956);
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

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode WORK() { return getToken(OracleStatementParser.WORK, 0); }
		public TerminalNode FORCE() { return getToken(OracleStatementParser.FORCE, 0); }
		public TerminalNode STRING() { return getToken(OracleStatementParser.STRING, 0); }
		public TerminalNode COMMENT() { return getToken(OracleStatementParser.COMMENT, 0); }
		public TerminalNode WRITE() { return getToken(OracleStatementParser.WRITE, 0); }
		public TerminalNode COMMA() { return getToken(OracleStatementParser.COMMA, 0); }
		public TerminalNode NUMBER() { return getToken(OracleStatementParser.NUMBER, 0); }
		public TerminalNode WAIT() { return getToken(OracleStatementParser.WAIT, 0); }
		public TerminalNode NOWAIT() { return getToken(OracleStatementParser.NOWAIT, 0); }
		public TerminalNode IMMEDIATE() { return getToken(OracleStatementParser.IMMEDIATE, 0); }
		public TerminalNode BATCH() { return getToken(OracleStatementParser.BATCH, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_commit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			match(COMMIT);
			setState(1961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORK) {
				{
				setState(1960);
				match(WORK);
				}
			}

			setState(1982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1963);
					match(COMMENT);
					setState(1964);
					match(STRING);
					}
				}

				}
				break;
			case 2:
				{
				setState(1974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WRITE) {
					{
					setState(1967);
					match(WRITE);
					setState(1969);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOWAIT || _la==WAIT) {
						{
						setState(1968);
						_la = _input.LA(1);
						if ( !(_la==NOWAIT || _la==WAIT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1972);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BATCH || _la==IMMEDIATE) {
						{
						setState(1971);
						_la = _input.LA(1);
						if ( !(_la==BATCH || _la==IMMEDIATE) ) {
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

				}
				break;
			case 3:
				{
				setState(1976);
				match(FORCE);
				setState(1977);
				match(STRING);
				setState(1980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1978);
					match(COMMA);
					setState(1979);
					match(NUMBER);
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
		public TerminalNode ROLLBACK() { return getToken(OracleStatementParser.ROLLBACK, 0); }
		public TerminalNode WORK() { return getToken(OracleStatementParser.WORK, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public TerminalNode FORCE() { return getToken(OracleStatementParser.FORCE, 0); }
		public TerminalNode STRING() { return getToken(OracleStatementParser.STRING, 0); }
		public TerminalNode SAVEPOINT() { return getToken(OracleStatementParser.SAVEPOINT, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_rollback);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1984);
			match(ROLLBACK);
			setState(1986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORK) {
				{
				setState(1985);
				match(WORK);
				}
			}

			setState(1995);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TO:
				{
				setState(1988);
				match(TO);
				setState(1990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SAVEPOINT) {
					{
					setState(1989);
					match(SAVEPOINT);
					}
				}

				setState(1992);
				match(ID);
				}
				break;
			case FORCE:
				{
				setState(1993);
				match(FORCE);
				setState(1994);
				match(STRING);
				}
				break;
			case EOF:
			case SEMI_:
				break;
			default:
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
		public TerminalNode SAVEPOINT() { return getToken(OracleStatementParser.SAVEPOINT, 0); }
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_savepoint);
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

	public static class GrantContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(OracleStatementParser.GRANT, 0); }
		public GrantRolesToProgramsContext grantRolesToPrograms() {
			return getRuleContext(GrantRolesToProgramsContext.class,0);
		}
		public GrantSystemPrivilegesContext grantSystemPrivileges() {
			return getRuleContext(GrantSystemPrivilegesContext.class,0);
		}
		public GrantObjectPrivilegeClauseContext grantObjectPrivilegeClause() {
			return getRuleContext(GrantObjectPrivilegeClauseContext.class,0);
		}
		public TerminalNode CONTAINER() { return getToken(OracleStatementParser.CONTAINER, 0); }
		public TerminalNode EQ_() { return getToken(OracleStatementParser.EQ_, 0); }
		public TerminalNode CURRENT() { return getToken(OracleStatementParser.CURRENT, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_grant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			match(GRANT);
			setState(2011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(2003);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(2001);
					grantSystemPrivileges();
					}
					break;
				case 2:
					{
					setState(2002);
					grantObjectPrivilegeClause();
					}
					break;
				}
				setState(2008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTAINER) {
					{
					setState(2005);
					match(CONTAINER);
					setState(2006);
					match(EQ_);
					setState(2007);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==CURRENT) ) {
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
			case 2:
				{
				setState(2010);
				grantRolesToPrograms();
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

	public static class GrantSystemPrivilegesContext extends ParserRuleContext {
		public SystemObjectsContext systemObjects() {
			return getRuleContext(SystemObjectsContext.class,0);
		}
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public GranteesContext grantees() {
			return getRuleContext(GranteesContext.class,0);
		}
		public GranteeIdentifiedByContext granteeIdentifiedBy() {
			return getRuleContext(GranteeIdentifiedByContext.class,0);
		}
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(OracleStatementParser.OPTION, 0); }
		public TerminalNode ADMIN() { return getToken(OracleStatementParser.ADMIN, 0); }
		public TerminalNode DELEGATE() { return getToken(OracleStatementParser.DELEGATE, 0); }
		public GrantSystemPrivilegesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantSystemPrivileges; }
	}

	public final GrantSystemPrivilegesContext grantSystemPrivileges() throws RecognitionException {
		GrantSystemPrivilegesContext _localctx = new GrantSystemPrivilegesContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_grantSystemPrivileges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2013);
			systemObjects();
			setState(2014);
			match(TO);
			setState(2017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(2015);
				grantees();
				}
				break;
			case 2:
				{
				setState(2016);
				granteeIdentifiedBy();
				}
				break;
			}
			setState(2022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2019);
				match(WITH);
				setState(2020);
				_la = _input.LA(1);
				if ( !(_la==ADMIN || _la==DELEGATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2021);
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

	public static class SystemObjectsContext extends ParserRuleContext {
		public List<SystemObjectContext> systemObject() {
			return getRuleContexts(SystemObjectContext.class);
		}
		public SystemObjectContext systemObject(int i) {
			return getRuleContext(SystemObjectContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public SystemObjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemObjects; }
	}

	public final SystemObjectsContext systemObjects() throws RecognitionException {
		SystemObjectsContext _localctx = new SystemObjectsContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_systemObjects);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024);
			systemObject();
			setState(2029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2025);
				match(COMMA);
				setState(2026);
				systemObject();
				}
				}
				setState(2031);
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

	public static class SystemObjectContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public RoleNameContext roleName() {
			return getRuleContext(RoleNameContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(OracleStatementParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(OracleStatementParser.ID, i);
		}
		public SystemObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemObject; }
	}

	public final SystemObjectContext systemObject() throws RecognitionException {
		SystemObjectContext _localctx = new SystemObjectContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_systemObject);
		try {
			int _alt;
			setState(2041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2032);
				match(ALL);
				setState(2033);
				match(PRIVILEGES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2034);
				roleName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2038);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(2035);
						match(ID);
						}
						} 
					}
					setState(2040);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
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

	public static class GranteesContext extends ParserRuleContext {
		public List<GranteeContext> grantee() {
			return getRuleContexts(GranteeContext.class);
		}
		public GranteeContext grantee(int i) {
			return getRuleContext(GranteeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public GranteesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantees; }
	}

	public final GranteesContext grantees() throws RecognitionException {
		GranteesContext _localctx = new GranteesContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_grantees);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2043);
			grantee();
			setState(2048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2044);
				match(COMMA);
				setState(2045);
				grantee();
				}
				}
				setState(2050);
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

	public static class GranteeContext extends ParserRuleContext {
		public UserNameContext userName() {
			return getRuleContext(UserNameContext.class,0);
		}
		public RoleNameContext roleName() {
			return getRuleContext(RoleNameContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(OracleStatementParser.PUBLIC, 0); }
		public GranteeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantee; }
	}

	public final GranteeContext grantee() throws RecognitionException {
		GranteeContext _localctx = new GranteeContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_grantee);
		try {
			setState(2054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2051);
				userName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2052);
				roleName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2053);
				match(PUBLIC);
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

	public static class GranteeIdentifiedByContext extends ParserRuleContext {
		public UserNamesContext userNames() {
			return getRuleContext(UserNamesContext.class,0);
		}
		public TerminalNode IDENTIFIED() { return getToken(OracleStatementParser.IDENTIFIED, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public List<TerminalNode> STRING() { return getTokens(OracleStatementParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(OracleStatementParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public GranteeIdentifiedByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_granteeIdentifiedBy; }
	}

	public final GranteeIdentifiedByContext granteeIdentifiedBy() throws RecognitionException {
		GranteeIdentifiedByContext _localctx = new GranteeIdentifiedByContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_granteeIdentifiedBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2056);
			userNames();
			setState(2057);
			match(IDENTIFIED);
			setState(2058);
			match(BY);
			setState(2059);
			match(STRING);
			setState(2064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2060);
				match(COMMA);
				setState(2061);
				match(STRING);
				}
				}
				setState(2066);
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

	public static class GrantObjectPrivilegeClauseContext extends ParserRuleContext {
		public List<GrantObjectPrivilegeContext> grantObjectPrivilege() {
			return getRuleContexts(GrantObjectPrivilegeContext.class);
		}
		public GrantObjectPrivilegeContext grantObjectPrivilege(int i) {
			return getRuleContext(GrantObjectPrivilegeContext.class,i);
		}
		public OnObjectClauseContext onObjectClause() {
			return getRuleContext(OnObjectClauseContext.class,0);
		}
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public GranteesContext grantees() {
			return getRuleContext(GranteesContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public List<TerminalNode> WITH() { return getTokens(OracleStatementParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(OracleStatementParser.WITH, i);
		}
		public TerminalNode HIERARCHY() { return getToken(OracleStatementParser.HIERARCHY, 0); }
		public List<TerminalNode> OPTION() { return getTokens(OracleStatementParser.OPTION); }
		public TerminalNode OPTION(int i) {
			return getToken(OracleStatementParser.OPTION, i);
		}
		public TerminalNode GRANT() { return getToken(OracleStatementParser.GRANT, 0); }
		public GrantObjectPrivilegeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantObjectPrivilegeClause; }
	}

	public final GrantObjectPrivilegeClauseContext grantObjectPrivilegeClause() throws RecognitionException {
		GrantObjectPrivilegeClauseContext _localctx = new GrantObjectPrivilegeClauseContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_grantObjectPrivilegeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067);
			grantObjectPrivilege();
			setState(2072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2068);
				match(COMMA);
				setState(2069);
				grantObjectPrivilege();
				}
				}
				setState(2074);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2075);
			onObjectClause();
			setState(2076);
			match(TO);
			setState(2077);
			grantees();
			setState(2081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(2078);
				match(WITH);
				setState(2079);
				match(HIERARCHY);
				setState(2080);
				match(OPTION);
				}
				break;
			}
			setState(2086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2083);
				match(WITH);
				setState(2084);
				match(GRANT);
				setState(2085);
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

	public static class GrantObjectPrivilegeContext extends ParserRuleContext {
		public ObjectPrivilegeContext objectPrivilege() {
			return getRuleContext(ObjectPrivilegeContext.class,0);
		}
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public GrantObjectPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantObjectPrivilege; }
	}

	public final GrantObjectPrivilegeContext grantObjectPrivilege() throws RecognitionException {
		GrantObjectPrivilegeContext _localctx = new GrantObjectPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_grantObjectPrivilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2088);
			objectPrivilege();
			setState(2090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2089);
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

	public static class ObjectPrivilegeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(OracleStatementParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(OracleStatementParser.ID, i);
		}
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public ObjectPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPrivilege; }
	}

	public final ObjectPrivilegeContext objectPrivilege() throws RecognitionException {
		ObjectPrivilegeContext _localctx = new ObjectPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_objectPrivilege);
		int _la;
		try {
			int _alt;
			setState(2102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
			case COMMA:
			case ON:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2095);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(2092);
						match(ID);
						}
						} 
					}
					setState(2097);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
				}
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2098);
				match(ALL);
				setState(2100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(2099);
					match(PRIVILEGES);
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

	public static class OnObjectClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public List<UserNameContext> userName() {
			return getRuleContexts(UserNameContext.class);
		}
		public UserNameContext userName(int i) {
			return getRuleContext(UserNameContext.class,i);
		}
		public TerminalNode DIRECTORY() { return getToken(OracleStatementParser.DIRECTORY, 0); }
		public TerminalNode EDITION() { return getToken(OracleStatementParser.EDITION, 0); }
		public TerminalNode MINING() { return getToken(OracleStatementParser.MINING, 0); }
		public TerminalNode MODEL() { return getToken(OracleStatementParser.MODEL, 0); }
		public TerminalNode JAVA() { return getToken(OracleStatementParser.JAVA, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode TRANSLATION() { return getToken(OracleStatementParser.TRANSLATION, 0); }
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public TerminalNode SOURCE() { return getToken(OracleStatementParser.SOURCE, 0); }
		public TerminalNode RESOURCE() { return getToken(OracleStatementParser.RESOURCE, 0); }
		public OnObjectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onObjectClause; }
	}

	public final OnObjectClauseContext onObjectClause() throws RecognitionException {
		OnObjectClauseContext _localctx = new OnObjectClauseContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_onObjectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			match(ON);
			setState(2127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case STRING:
				{
				setState(2105);
				tableName();
				}
				break;
			case USER:
				{
				setState(2106);
				match(USER);
				setState(2107);
				userName();
				setState(2112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2108);
					match(COMMA);
					setState(2109);
					userName();
					}
					}
					setState(2114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DIRECTORY:
			case EDITION:
			case JAVA:
			case MINING:
			case SQL:
				{
				setState(2124);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIRECTORY:
					{
					setState(2115);
					match(DIRECTORY);
					}
					break;
				case EDITION:
					{
					setState(2116);
					match(EDITION);
					}
					break;
				case MINING:
					{
					setState(2117);
					match(MINING);
					setState(2118);
					match(MODEL);
					}
					break;
				case JAVA:
					{
					setState(2119);
					match(JAVA);
					setState(2120);
					_la = _input.LA(1);
					if ( !(_la==RESOURCE || _la==SOURCE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case SQL:
					{
					setState(2121);
					match(SQL);
					setState(2122);
					match(TRANSLATION);
					setState(2123);
					match(PROFILE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2126);
				tableName();
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

	public static class GrantRolesToProgramsContext extends ParserRuleContext {
		public RoleNamesContext roleNames() {
			return getRuleContext(RoleNamesContext.class,0);
		}
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public ProgramUnitsContext programUnits() {
			return getRuleContext(ProgramUnitsContext.class,0);
		}
		public GrantRolesToProgramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantRolesToPrograms; }
	}

	public final GrantRolesToProgramsContext grantRolesToPrograms() throws RecognitionException {
		GrantRolesToProgramsContext _localctx = new GrantRolesToProgramsContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_grantRolesToPrograms);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2129);
			roleNames();
			setState(2130);
			match(TO);
			setState(2131);
			programUnits();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramUnitsContext extends ParserRuleContext {
		public List<ProgramUnitContext> programUnit() {
			return getRuleContexts(ProgramUnitContext.class);
		}
		public ProgramUnitContext programUnit(int i) {
			return getRuleContext(ProgramUnitContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public ProgramUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programUnits; }
	}

	public final ProgramUnitsContext programUnits() throws RecognitionException {
		ProgramUnitsContext _localctx = new ProgramUnitsContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_programUnits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2133);
			programUnit();
			setState(2138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2134);
				match(COMMA);
				setState(2135);
				programUnit();
				}
				}
				setState(2140);
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

	public static class ProgramUnitContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(OracleStatementParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(OracleStatementParser.PROCEDURE, 0); }
		public TerminalNode PACKAGE() { return getToken(OracleStatementParser.PACKAGE, 0); }
		public ProgramUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programUnit; }
	}

	public final ProgramUnitContext programUnit() throws RecognitionException {
		ProgramUnitContext _localctx = new ProgramUnitContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_programUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2141);
			_la = _input.LA(1);
			if ( !(_la==PACKAGE || _la==PROCEDURE || _la==FUNCTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2142);
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

	public static class RevokeContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(OracleStatementParser.REVOKE, 0); }
		public RevokeRolesFromProgramsContext revokeRolesFromPrograms() {
			return getRuleContext(RevokeRolesFromProgramsContext.class,0);
		}
		public RevokeSystemPrivilegesContext revokeSystemPrivileges() {
			return getRuleContext(RevokeSystemPrivilegesContext.class,0);
		}
		public RevokeObjectPrivilegesContext revokeObjectPrivileges() {
			return getRuleContext(RevokeObjectPrivilegesContext.class,0);
		}
		public TerminalNode CONTAINER() { return getToken(OracleStatementParser.CONTAINER, 0); }
		public TerminalNode EQ_() { return getToken(OracleStatementParser.EQ_, 0); }
		public TerminalNode CURRENT() { return getToken(OracleStatementParser.CURRENT, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_revoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
			match(REVOKE);
			setState(2155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(2147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(2145);
					revokeSystemPrivileges();
					}
					break;
				case 2:
					{
					setState(2146);
					revokeObjectPrivileges();
					}
					break;
				}
				setState(2152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTAINER) {
					{
					setState(2149);
					match(CONTAINER);
					setState(2150);
					match(EQ_);
					setState(2151);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==CURRENT) ) {
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
			case 2:
				{
				setState(2154);
				revokeRolesFromPrograms();
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

	public static class RevokeSystemPrivilegesContext extends ParserRuleContext {
		public SystemObjectsContext systemObjects() {
			return getRuleContext(SystemObjectsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public RevokeSystemPrivilegesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revokeSystemPrivileges; }
	}

	public final RevokeSystemPrivilegesContext revokeSystemPrivileges() throws RecognitionException {
		RevokeSystemPrivilegesContext _localctx = new RevokeSystemPrivilegesContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_revokeSystemPrivileges);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			systemObjects();
			setState(2158);
			match(FROM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevokeObjectPrivilegesContext extends ParserRuleContext {
		public List<ObjectPrivilegeContext> objectPrivilege() {
			return getRuleContexts(ObjectPrivilegeContext.class);
		}
		public ObjectPrivilegeContext objectPrivilege(int i) {
			return getRuleContext(ObjectPrivilegeContext.class,i);
		}
		public OnObjectClauseContext onObjectClause() {
			return getRuleContext(OnObjectClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public GranteesContext grantees() {
			return getRuleContext(GranteesContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleStatementParser.COMMA, i);
		}
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(OracleStatementParser.CONSTRAINTS, 0); }
		public TerminalNode FORCE() { return getToken(OracleStatementParser.FORCE, 0); }
		public RevokeObjectPrivilegesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revokeObjectPrivileges; }
	}

	public final RevokeObjectPrivilegesContext revokeObjectPrivileges() throws RecognitionException {
		RevokeObjectPrivilegesContext _localctx = new RevokeObjectPrivilegesContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_revokeObjectPrivileges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2160);
			objectPrivilege();
			setState(2165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2161);
				match(COMMA);
				setState(2162);
				objectPrivilege();
				}
				}
				setState(2167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2168);
			onObjectClause();
			setState(2169);
			match(FROM);
			setState(2170);
			grantees();
			setState(2174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASCADE:
				{
				setState(2171);
				match(CASCADE);
				setState(2172);
				match(CONSTRAINTS);
				}
				break;
			case FORCE:
				{
				setState(2173);
				match(FORCE);
				}
				break;
			case EOF:
			case CONTAINER:
			case SEMI_:
				break;
			default:
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

	public static class RevokeRolesFromProgramsContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public ProgramUnitsContext programUnits() {
			return getRuleContext(ProgramUnitsContext.class,0);
		}
		public RoleNamesContext roleNames() {
			return getRuleContext(RoleNamesContext.class,0);
		}
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public RevokeRolesFromProgramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revokeRolesFromPrograms; }
	}

	public final RevokeRolesFromProgramsContext revokeRolesFromPrograms() throws RecognitionException {
		RevokeRolesFromProgramsContext _localctx = new RevokeRolesFromProgramsContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_revokeRolesFromPrograms);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case STRING:
				{
				setState(2176);
				roleNames();
				}
				break;
			case ALL:
				{
				setState(2177);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2180);
			match(FROM);
			setState(2181);
			programUnits();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public UserNameContext userName() {
			return getRuleContext(UserNameContext.class,0);
		}
		public TerminalNode IDENTIFIED() { return getToken(OracleStatementParser.IDENTIFIED, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public List<TerminalNode> ID() { return getTokens(OracleStatementParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(OracleStatementParser.ID, i);
		}
		public TerminalNode EXTERNALLY() { return getToken(OracleStatementParser.EXTERNALLY, 0); }
		public TerminalNode GLOBALLY() { return getToken(OracleStatementParser.GLOBALLY, 0); }
		public List<TerminalNode> DEFAULT() { return getTokens(OracleStatementParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(OracleStatementParser.DEFAULT, i);
		}
		public List<TerminalNode> TABLESPACE() { return getTokens(OracleStatementParser.TABLESPACE); }
		public TerminalNode TABLESPACE(int i) {
			return getToken(OracleStatementParser.TABLESPACE, i);
		}
		public List<TerminalNode> TEMPORARY() { return getTokens(OracleStatementParser.TEMPORARY); }
		public TerminalNode TEMPORARY(int i) {
			return getToken(OracleStatementParser.TEMPORARY, i);
		}
		public List<TerminalNode> PROFILE() { return getTokens(OracleStatementParser.PROFILE); }
		public TerminalNode PROFILE(int i) {
			return getToken(OracleStatementParser.PROFILE, i);
		}
		public List<TerminalNode> PASSWORD() { return getTokens(OracleStatementParser.PASSWORD); }
		public TerminalNode PASSWORD(int i) {
			return getToken(OracleStatementParser.PASSWORD, i);
		}
		public List<TerminalNode> EXPIRE() { return getTokens(OracleStatementParser.EXPIRE); }
		public TerminalNode EXPIRE(int i) {
			return getToken(OracleStatementParser.EXPIRE, i);
		}
		public List<TerminalNode> ACCOUNT() { return getTokens(OracleStatementParser.ACCOUNT); }
		public TerminalNode ACCOUNT(int i) {
			return getToken(OracleStatementParser.ACCOUNT, i);
		}
		public List<TerminalNode> ENABLE() { return getTokens(OracleStatementParser.ENABLE); }
		public TerminalNode ENABLE(int i) {
			return getToken(OracleStatementParser.ENABLE, i);
		}
		public List<TerminalNode> EDITIONS() { return getTokens(OracleStatementParser.EDITIONS); }
		public TerminalNode EDITIONS(int i) {
			return getToken(OracleStatementParser.EDITIONS, i);
		}
		public List<TerminalNode> CONTAINER() { return getTokens(OracleStatementParser.CONTAINER); }
		public TerminalNode CONTAINER(int i) {
			return getToken(OracleStatementParser.CONTAINER, i);
		}
		public List<TerminalNode> EQ_() { return getTokens(OracleStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(OracleStatementParser.EQ_, i);
		}
		public List<TerminalNode> LOCK() { return getTokens(OracleStatementParser.LOCK); }
		public TerminalNode LOCK(int i) {
			return getToken(OracleStatementParser.LOCK, i);
		}
		public List<TerminalNode> UNLOCK() { return getTokens(OracleStatementParser.UNLOCK); }
		public TerminalNode UNLOCK(int i) {
			return getToken(OracleStatementParser.UNLOCK, i);
		}
		public List<TerminalNode> CURRENT() { return getTokens(OracleStatementParser.CURRENT); }
		public TerminalNode CURRENT(int i) {
			return getToken(OracleStatementParser.CURRENT, i);
		}
		public List<TerminalNode> ALL() { return getTokens(OracleStatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(OracleStatementParser.ALL, i);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public TerminalNode STRING() { return getToken(OracleStatementParser.STRING, 0); }
		public List<TerminalNode> QUOTA() { return getTokens(OracleStatementParser.QUOTA); }
		public TerminalNode QUOTA(int i) {
			return getToken(OracleStatementParser.QUOTA, i);
		}
		public List<TerminalNode> ON() { return getTokens(OracleStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(OracleStatementParser.ON, i);
		}
		public List<SizeClauseContext> sizeClause() {
			return getRuleContexts(SizeClauseContext.class);
		}
		public SizeClauseContext sizeClause(int i) {
			return getRuleContext(SizeClauseContext.class,i);
		}
		public List<TerminalNode> UNLIMITED() { return getTokens(OracleStatementParser.UNLIMITED); }
		public TerminalNode UNLIMITED(int i) {
			return getToken(OracleStatementParser.UNLIMITED, i);
		}
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_createUser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2183);
			match(CREATE);
			setState(2184);
			match(USER);
			setState(2185);
			userName();
			setState(2186);
			match(IDENTIFIED);
			setState(2194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BY:
				{
				setState(2187);
				match(BY);
				setState(2188);
				match(ID);
				}
				break;
			case EXTERNALLY:
			case GLOBALLY:
				{
				setState(2189);
				_la = _input.LA(1);
				if ( !(_la==EXTERNALLY || _la==GLOBALLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(2190);
					match(AS);
					setState(2191);
					match(STRING);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACCOUNT || _la==CONTAINER || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (PROFILE - 77)) | (1L << (QUOTA - 77)) | (1L << (TEMPORARY - 77)))) != 0) || ((((_la - 220)) & ~0x3f) == 0 && ((1L << (_la - 220)) & ((1L << (DEFAULT - 220)) | (1L << (ENABLE - 220)) | (1L << (PASSWORD - 220)))) != 0)) {
				{
				setState(2220);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFAULT:
					{
					setState(2196);
					match(DEFAULT);
					setState(2197);
					match(TABLESPACE);
					setState(2198);
					match(ID);
					}
					break;
				case TEMPORARY:
					{
					setState(2199);
					match(TEMPORARY);
					setState(2200);
					match(TABLESPACE);
					setState(2201);
					match(ID);
					}
					break;
				case QUOTA:
					{
					{
					setState(2202);
					match(QUOTA);
					setState(2205);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NUMBER:
						{
						setState(2203);
						sizeClause();
						}
						break;
					case UNLIMITED:
						{
						setState(2204);
						match(UNLIMITED);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2207);
					match(ON);
					setState(2208);
					match(ID);
					}
					}
					break;
				case PROFILE:
					{
					setState(2209);
					match(PROFILE);
					setState(2210);
					match(ID);
					}
					break;
				case PASSWORD:
					{
					setState(2211);
					match(PASSWORD);
					setState(2212);
					match(EXPIRE);
					}
					break;
				case ACCOUNT:
					{
					setState(2213);
					match(ACCOUNT);
					setState(2214);
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
					break;
				case ENABLE:
					{
					setState(2215);
					match(ENABLE);
					setState(2216);
					match(EDITIONS);
					}
					break;
				case CONTAINER:
					{
					setState(2217);
					match(CONTAINER);
					setState(2218);
					match(EQ_);
					setState(2219);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==CURRENT) ) {
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
				setState(2224);
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

	public static class SizeClauseContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(OracleStatementParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public SizeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeClause; }
	}

	public final SizeClauseContext sizeClause() throws RecognitionException {
		SizeClauseContext _localctx = new SizeClauseContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_sizeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2225);
			match(NUMBER);
			setState(2227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(2226);
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
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public UserNameContext userName() {
			return getRuleContext(UserNameContext.class,0);
		}
		public UserNamesContext userNames() {
			return getRuleContext(UserNamesContext.class,0);
		}
		public ProxyClauseContext proxyClause() {
			return getRuleContext(ProxyClauseContext.class,0);
		}
		public List<TerminalNode> IDENTIFIED() { return getTokens(OracleStatementParser.IDENTIFIED); }
		public TerminalNode IDENTIFIED(int i) {
			return getToken(OracleStatementParser.IDENTIFIED, i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(OracleStatementParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(OracleStatementParser.DEFAULT, i);
		}
		public List<TerminalNode> TABLESPACE() { return getTokens(OracleStatementParser.TABLESPACE); }
		public TerminalNode TABLESPACE(int i) {
			return getToken(OracleStatementParser.TABLESPACE, i);
		}
		public List<TerminalNode> ID() { return getTokens(OracleStatementParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(OracleStatementParser.ID, i);
		}
		public List<TerminalNode> TEMPORARY() { return getTokens(OracleStatementParser.TEMPORARY); }
		public TerminalNode TEMPORARY(int i) {
			return getToken(OracleStatementParser.TEMPORARY, i);
		}
		public List<TerminalNode> QUOTA() { return getTokens(OracleStatementParser.QUOTA); }
		public TerminalNode QUOTA(int i) {
			return getToken(OracleStatementParser.QUOTA, i);
		}
		public List<TerminalNode> ON() { return getTokens(OracleStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(OracleStatementParser.ON, i);
		}
		public List<TerminalNode> PROFILE() { return getTokens(OracleStatementParser.PROFILE); }
		public TerminalNode PROFILE(int i) {
			return getToken(OracleStatementParser.PROFILE, i);
		}
		public List<TerminalNode> PASSWORD() { return getTokens(OracleStatementParser.PASSWORD); }
		public TerminalNode PASSWORD(int i) {
			return getToken(OracleStatementParser.PASSWORD, i);
		}
		public List<TerminalNode> EXPIRE() { return getTokens(OracleStatementParser.EXPIRE); }
		public TerminalNode EXPIRE(int i) {
			return getToken(OracleStatementParser.EXPIRE, i);
		}
		public List<TerminalNode> ACCOUNT() { return getTokens(OracleStatementParser.ACCOUNT); }
		public TerminalNode ACCOUNT(int i) {
			return getToken(OracleStatementParser.ACCOUNT, i);
		}
		public List<TerminalNode> ENABLE() { return getTokens(OracleStatementParser.ENABLE); }
		public TerminalNode ENABLE(int i) {
			return getToken(OracleStatementParser.ENABLE, i);
		}
		public List<TerminalNode> EDITIONS() { return getTokens(OracleStatementParser.EDITIONS); }
		public TerminalNode EDITIONS(int i) {
			return getToken(OracleStatementParser.EDITIONS, i);
		}
		public List<TerminalNode> CONTAINER() { return getTokens(OracleStatementParser.CONTAINER); }
		public TerminalNode CONTAINER(int i) {
			return getToken(OracleStatementParser.CONTAINER, i);
		}
		public List<TerminalNode> EQ_() { return getTokens(OracleStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(OracleStatementParser.EQ_, i);
		}
		public List<TerminalNode> ROLE() { return getTokens(OracleStatementParser.ROLE); }
		public TerminalNode ROLE(int i) {
			return getToken(OracleStatementParser.ROLE, i);
		}
		public List<TerminalNode> LOCK() { return getTokens(OracleStatementParser.LOCK); }
		public TerminalNode LOCK(int i) {
			return getToken(OracleStatementParser.LOCK, i);
		}
		public List<TerminalNode> UNLOCK() { return getTokens(OracleStatementParser.UNLOCK); }
		public TerminalNode UNLOCK(int i) {
			return getToken(OracleStatementParser.UNLOCK, i);
		}
		public List<TerminalNode> CURRENT() { return getTokens(OracleStatementParser.CURRENT); }
		public TerminalNode CURRENT(int i) {
			return getToken(OracleStatementParser.CURRENT, i);
		}
		public List<TerminalNode> ALL() { return getTokens(OracleStatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(OracleStatementParser.ALL, i);
		}
		public List<TerminalNode> BY() { return getTokens(OracleStatementParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(OracleStatementParser.BY, i);
		}
		public List<SizeClauseContext> sizeClause() {
			return getRuleContexts(SizeClauseContext.class);
		}
		public SizeClauseContext sizeClause(int i) {
			return getRuleContext(SizeClauseContext.class,i);
		}
		public List<TerminalNode> UNLIMITED() { return getTokens(OracleStatementParser.UNLIMITED); }
		public TerminalNode UNLIMITED(int i) {
			return getToken(OracleStatementParser.UNLIMITED, i);
		}
		public List<RoleNamesContext> roleNames() {
			return getRuleContexts(RoleNamesContext.class);
		}
		public RoleNamesContext roleNames(int i) {
			return getRuleContext(RoleNamesContext.class,i);
		}
		public List<TerminalNode> NONE() { return getTokens(OracleStatementParser.NONE); }
		public TerminalNode NONE(int i) {
			return getToken(OracleStatementParser.NONE, i);
		}
		public List<TerminalNode> EXTERNALLY() { return getTokens(OracleStatementParser.EXTERNALLY); }
		public TerminalNode EXTERNALLY(int i) {
			return getToken(OracleStatementParser.EXTERNALLY, i);
		}
		public List<TerminalNode> GLOBALLY() { return getTokens(OracleStatementParser.GLOBALLY); }
		public TerminalNode GLOBALLY(int i) {
			return getToken(OracleStatementParser.GLOBALLY, i);
		}
		public List<TerminalNode> FOR() { return getTokens(OracleStatementParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(OracleStatementParser.FOR, i);
		}
		public List<IdsContext> ids() {
			return getRuleContexts(IdsContext.class);
		}
		public IdsContext ids(int i) {
			return getRuleContext(IdsContext.class,i);
		}
		public List<TerminalNode> FORCE() { return getTokens(OracleStatementParser.FORCE); }
		public TerminalNode FORCE(int i) {
			return getToken(OracleStatementParser.FORCE, i);
		}
		public List<TerminalNode> REPLACE() { return getTokens(OracleStatementParser.REPLACE); }
		public TerminalNode REPLACE(int i) {
			return getToken(OracleStatementParser.REPLACE, i);
		}
		public List<TerminalNode> STRING() { return getTokens(OracleStatementParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(OracleStatementParser.STRING, i);
		}
		public List<TerminalNode> AS() { return getTokens(OracleStatementParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(OracleStatementParser.AS, i);
		}
		public List<TerminalNode> EXCEPT() { return getTokens(OracleStatementParser.EXCEPT); }
		public TerminalNode EXCEPT(int i) {
			return getToken(OracleStatementParser.EXCEPT, i);
		}
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_alterUser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2229);
			match(ALTER);
			setState(2230);
			match(USER);
			setState(2297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(2231);
				userName();
				setState(2291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCOUNT) | (1L << CONTAINER) | (1L << IDENTIFIED))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (PROFILE - 77)) | (1L << (QUOTA - 77)) | (1L << (TEMPORARY - 77)))) != 0) || ((((_la - 220)) & ~0x3f) == 0 && ((1L << (_la - 220)) & ((1L << (DEFAULT - 220)) | (1L << (ENABLE - 220)) | (1L << (PASSWORD - 220)) | (1L << (ID - 220)))) != 0)) {
					{
					setState(2289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
					case 1:
						{
						setState(2232);
						match(IDENTIFIED);
						setState(2244);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case BY:
							{
							setState(2233);
							match(BY);
							setState(2234);
							match(ID);
							setState(2237);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==REPLACE) {
								{
								setState(2235);
								match(REPLACE);
								setState(2236);
								match(STRING);
								}
							}

							}
							break;
						case EXTERNALLY:
						case GLOBALLY:
							{
							setState(2239);
							_la = _input.LA(1);
							if ( !(_la==EXTERNALLY || _la==GLOBALLY) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(2242);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==AS) {
								{
								setState(2240);
								match(AS);
								setState(2241);
								match(STRING);
								}
							}

							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 2:
						{
						setState(2246);
						match(DEFAULT);
						setState(2247);
						match(TABLESPACE);
						setState(2248);
						match(ID);
						}
						break;
					case 3:
						{
						setState(2249);
						match(TEMPORARY);
						setState(2250);
						match(TABLESPACE);
						setState(2251);
						match(ID);
						}
						break;
					case 4:
						{
						setState(2252);
						match(QUOTA);
						setState(2255);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case NUMBER:
							{
							setState(2253);
							sizeClause();
							}
							break;
						case UNLIMITED:
							{
							setState(2254);
							match(UNLIMITED);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2257);
						match(ON);
						setState(2258);
						match(ID);
						}
						break;
					case 5:
						{
						setState(2259);
						match(PROFILE);
						setState(2260);
						match(ID);
						}
						break;
					case 6:
						{
						setState(2261);
						match(PASSWORD);
						setState(2262);
						match(EXPIRE);
						}
						break;
					case 7:
						{
						setState(2263);
						match(ACCOUNT);
						setState(2264);
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
						break;
					case 8:
						{
						setState(2265);
						match(ENABLE);
						setState(2266);
						match(EDITIONS);
						setState(2269);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==FOR) {
							{
							setState(2267);
							match(FOR);
							setState(2268);
							ids();
							}
						}

						setState(2272);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==FORCE) {
							{
							setState(2271);
							match(FORCE);
							}
						}

						}
						break;
					case 9:
						{
						setState(2274);
						match(CONTAINER);
						setState(2275);
						match(EQ_);
						setState(2276);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==CURRENT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 10:
						{
						setState(2277);
						match(DEFAULT);
						setState(2278);
						match(ROLE);
						setState(2286);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ID:
						case STRING:
							{
							setState(2279);
							roleNames();
							}
							break;
						case ALL:
							{
							setState(2280);
							match(ALL);
							setState(2283);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==EXCEPT) {
								{
								setState(2281);
								match(EXCEPT);
								setState(2282);
								roleNames();
								}
							}

							}
							break;
						case NONE:
							{
							setState(2285);
							match(NONE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 11:
						{
						setState(2288);
						match(ID);
						}
						break;
					}
					}
					setState(2293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(2294);
				userNames();
				setState(2295);
				proxyClause();
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

	public static class ContainerDataClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode CONTAINER_DATA() { return getToken(OracleStatementParser.CONTAINER_DATA, 0); }
		public TerminalNode EQ_() { return getToken(OracleStatementParser.EQ_, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode ADD() { return getToken(OracleStatementParser.ADD, 0); }
		public TerminalNode REMOVE() { return getToken(OracleStatementParser.REMOVE, 0); }
		public TerminalNode FOR() { return getToken(OracleStatementParser.FOR, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public ContainerDataClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerDataClause; }
	}

	public final ContainerDataClauseContext containerDataClause() throws RecognitionException {
		ContainerDataClauseContext _localctx = new ContainerDataClauseContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_containerDataClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(2299);
				match(SET);
				setState(2300);
				match(CONTAINER_DATA);
				setState(2301);
				match(EQ_);
				setState(2305);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					setState(2302);
					match(ALL);
					}
					break;
				case DEFAULT:
					{
					setState(2303);
					match(DEFAULT);
					}
					break;
				case LP_:
					{
					setState(2304);
					idList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case REMOVE:
			case ADD:
				{
				setState(2307);
				_la = _input.LA(1);
				if ( !(_la==REMOVE || _la==ADD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2308);
				match(CONTAINER_DATA);
				setState(2309);
				match(EQ_);
				setState(2310);
				idList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(2313);
				match(FOR);
				setState(2314);
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

	public static class ProxyClauseContext extends ParserRuleContext {
		public TerminalNode CONNECT() { return getToken(OracleStatementParser.CONNECT, 0); }
		public TerminalNode THROUGH() { return getToken(OracleStatementParser.THROUGH, 0); }
		public TerminalNode GRANT() { return getToken(OracleStatementParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(OracleStatementParser.REVOKE, 0); }
		public TerminalNode ENTERPRISE() { return getToken(OracleStatementParser.ENTERPRISE, 0); }
		public TerminalNode USERS() { return getToken(OracleStatementParser.USERS, 0); }
		public UserNameContext userName() {
			return getRuleContext(UserNameContext.class,0);
		}
		public DbUserProxyClausesContext dbUserProxyClauses() {
			return getRuleContext(DbUserProxyClausesContext.class,0);
		}
		public ProxyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proxyClause; }
	}

	public final ProxyClauseContext proxyClause() throws RecognitionException {
		ProxyClauseContext _localctx = new ProxyClauseContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_proxyClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2317);
			_la = _input.LA(1);
			if ( !(_la==GRANT || _la==REVOKE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2318);
			match(CONNECT);
			setState(2319);
			match(THROUGH);
			setState(2326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERPRISE:
				{
				setState(2320);
				match(ENTERPRISE);
				setState(2321);
				match(USERS);
				}
				break;
			case ID:
			case STRING:
				{
				setState(2322);
				userName();
				setState(2324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(2323);
					dbUserProxyClauses();
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

	public static class DbUserProxyClausesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode AUTHENTICATION() { return getToken(OracleStatementParser.AUTHENTICATION, 0); }
		public TerminalNode REQUIRED() { return getToken(OracleStatementParser.REQUIRED, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public RoleNamesContext roleNames() {
			return getRuleContext(RoleNamesContext.class,0);
		}
		public TerminalNode NO() { return getToken(OracleStatementParser.NO, 0); }
		public TerminalNode ROLES() { return getToken(OracleStatementParser.ROLES, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode EXCEPT() { return getToken(OracleStatementParser.EXCEPT, 0); }
		public DbUserProxyClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbUserProxyClauses; }
	}

	public final DbUserProxyClausesContext dbUserProxyClauses() throws RecognitionException {
		DbUserProxyClausesContext _localctx = new DbUserProxyClausesContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_dbUserProxyClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2328);
				match(WITH);
				setState(2337);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ROLE:
					{
					setState(2329);
					match(ROLE);
					setState(2332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL) {
						{
						setState(2330);
						match(ALL);
						setState(2331);
						match(EXCEPT);
						}
					}

					setState(2334);
					roleNames();
					}
					break;
				case NO:
					{
					setState(2335);
					match(NO);
					setState(2336);
					match(ROLES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(2343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTHENTICATION) {
				{
				setState(2341);
				match(AUTHENTICATION);
				setState(2342);
				match(REQUIRED);
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

	public static class DropUserContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public UserNameContext userName() {
			return getRuleContext(UserNameContext.class,0);
		}
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_dropUser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2345);
			match(DROP);
			setState(2346);
			match(USER);
			setState(2347);
			userName();
			setState(2349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE) {
				{
				setState(2348);
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

	public static class CreateRoleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public RoleNameContext roleName() {
			return getRuleContext(RoleNameContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode IDENTIFIED() { return getToken(OracleStatementParser.IDENTIFIED, 0); }
		public TerminalNode CONTAINER() { return getToken(OracleStatementParser.CONTAINER, 0); }
		public TerminalNode EQ_() { return getToken(OracleStatementParser.EQ_, 0); }
		public TerminalNode CURRENT() { return getToken(OracleStatementParser.CURRENT, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode EXTERNALLY() { return getToken(OracleStatementParser.EXTERNALLY, 0); }
		public TerminalNode GLOBALLY() { return getToken(OracleStatementParser.GLOBALLY, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_createRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2351);
			match(CREATE);
			setState(2352);
			match(ROLE);
			setState(2353);
			roleName();
			setState(2365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(2354);
				match(NOT);
				setState(2355);
				match(IDENTIFIED);
				}
				break;
			case IDENTIFIED:
				{
				setState(2356);
				match(IDENTIFIED);
				setState(2363);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BY:
					{
					setState(2357);
					match(BY);
					setState(2358);
					match(ID);
					}
					break;
				case USING:
					{
					setState(2359);
					match(USING);
					setState(2360);
					tableName();
					}
					break;
				case EXTERNALLY:
					{
					setState(2361);
					match(EXTERNALLY);
					}
					break;
				case GLOBALLY:
					{
					setState(2362);
					match(GLOBALLY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case EOF:
			case CONTAINER:
			case SEMI_:
				break;
			default:
				break;
			}
			setState(2370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINER) {
				{
				setState(2367);
				match(CONTAINER);
				setState(2368);
				match(EQ_);
				setState(2369);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==CURRENT) ) {
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

	public static class AlterRoleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public RoleNameContext roleName() {
			return getRuleContext(RoleNameContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode IDENTIFIED() { return getToken(OracleStatementParser.IDENTIFIED, 0); }
		public TerminalNode CONTAINER() { return getToken(OracleStatementParser.CONTAINER, 0); }
		public TerminalNode EQ_() { return getToken(OracleStatementParser.EQ_, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode ID() { return getToken(OracleStatementParser.ID, 0); }
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode EXTERNALLY() { return getToken(OracleStatementParser.EXTERNALLY, 0); }
		public TerminalNode GLOBALLY() { return getToken(OracleStatementParser.GLOBALLY, 0); }
		public TerminalNode CURRENT() { return getToken(OracleStatementParser.CURRENT, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_alterRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2372);
			match(ALTER);
			setState(2373);
			match(ROLE);
			setState(2374);
			roleName();
			setState(2386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(2375);
				match(NOT);
				setState(2376);
				match(IDENTIFIED);
				}
				break;
			case IDENTIFIED:
				{
				setState(2377);
				match(IDENTIFIED);
				setState(2384);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BY:
					{
					setState(2378);
					match(BY);
					setState(2379);
					match(ID);
					}
					break;
				case USING:
					{
					setState(2380);
					match(USING);
					setState(2381);
					tableName();
					}
					break;
				case EXTERNALLY:
					{
					setState(2382);
					match(EXTERNALLY);
					}
					break;
				case GLOBALLY:
					{
					setState(2383);
					match(GLOBALLY);
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
			setState(2391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINER) {
				{
				setState(2388);
				match(CONTAINER);
				setState(2389);
				match(EQ_);
				setState(2390);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==CURRENT) ) {
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

	public static class DropRoleContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public RoleNameContext roleName() {
			return getRuleContext(RoleNameContext.class,0);
		}
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2393);
			match(DROP);
			setState(2394);
			match(ROLE);
			setState(2395);
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
		case 83:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 84:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 87:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 88:
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u01b8\u0960\4\2\t"+
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
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u01ba\n\2\3\2\5\2\u01bd\n\2"+
		"\3\3\3\3\3\3\7\3\u01c2\n\3\f\3\16\3\u01c5\13\3\3\3\5\3\u01c8\n\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u01db"+
		"\n\n\f\n\16\n\u01de\13\n\3\13\3\13\5\13\u01e2\n\13\3\f\3\f\3\f\7\f\u01e7"+
		"\n\f\f\f\16\f\u01ea\13\f\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u01f2\n\16\3\16"+
		"\3\16\3\16\5\16\u01f7\n\16\3\16\3\16\5\16\u01fb\n\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0204\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u020f\n\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0217\n"+
		"\20\3\20\3\20\5\20\u021b\n\20\5\20\u021d\n\20\3\21\3\21\5\21\u0221\n\21"+
		"\3\21\3\21\5\21\u0225\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u022e"+
		"\n\21\5\21\u0230\n\21\3\22\3\22\3\22\5\22\u0235\n\22\3\23\3\23\5\23\u0239"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u0240\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0247\n\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u024f\n\26\3\26\5"+
		"\26\u0252\n\26\3\26\3\26\3\27\3\27\6\27\u0258\n\27\r\27\16\27\u0259\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u026c\n\32\5\32\u026e\n\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u027c\n\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0283\n\34\3\34\3\34\3\34\3\34\5\34\u0289\n\34\3\34\3\34\5\34\u028d"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0294\n\35\3\35\3\35\3\35\3\35\7\35"+
		"\u029a\n\35\f\35\16\35\u029d\13\35\3\35\3\35\5\35\u02a1\n\35\3\35\5\35"+
		"\u02a4\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3"+
		"\66\3\67\3\67\38\38\39\39\3:\3:\3:\3:\5:\u02e4\n:\5:\u02e6\n:\3:\3:\3"+
		";\5;\u02eb\n;\3;\3;\3<\3<\3=\3=\3=\7=\u02f4\n=\f=\16=\u02f7\13=\3>\3>"+
		"\3>\3>\3?\3?\3?\7?\u0300\n?\f?\16?\u0303\13?\3?\3?\3?\3?\5?\u0309\n?\3"+
		"@\3@\5@\u030d\n@\3A\3A\3A\7A\u0312\nA\fA\16A\u0315\13A\3B\3B\3B\7B\u031a"+
		"\nB\fB\16B\u031d\13B\3C\3C\3C\7C\u0322\nC\fC\16C\u0325\13C\3D\3D\3D\3"+
		"D\3E\3E\3E\7E\u032e\nE\fE\16E\u0331\13E\3F\3F\3F\3F\3G\3G\3G\7G\u033a"+
		"\nG\fG\16G\u033d\13G\3H\3H\3H\3H\3I\3I\3I\7I\u0346\nI\fI\16I\u0349\13"+
		"I\3J\3J\3J\7J\u034e\nJ\fJ\16J\u0351\13J\3K\3K\3K\7K\u0356\nK\fK\16K\u0359"+
		"\13K\3L\3L\3L\3L\3M\3M\3M\7M\u0362\nM\fM\16M\u0365\13M\3N\3N\3N\7N\u036a"+
		"\nN\fN\16N\u036d\13N\3O\3O\3O\7O\u0372\nO\fO\16O\u0375\13O\3P\3P\3P\7"+
		"P\u037a\nP\fP\16P\u037d\13P\3Q\3Q\3Q\7Q\u0382\nQ\fQ\16Q\u0385\13Q\3R\3"+
		"R\3R\7R\u038a\nR\fR\16R\u038d\13R\3S\3S\3S\7S\u0392\nS\fS\16S\u0395\13"+
		"S\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u03a6\nU\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\7U\u03b7\nU\fU\16U\u03ba\13U\3V\3V"+
		"\3V\3V\3V\3V\5V\u03c2\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\7V\u03d1"+
		"\nV\fV\16V\u03d4\13V\3W\3W\3X\3X\5X\u03da\nX\3X\3X\3X\3X\3X\5X\u03e1\n"+
		"X\3X\3X\3X\3X\3X\7X\u03e8\nX\fX\16X\u03eb\13X\3X\3X\3X\3X\5X\u03f1\nX"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u03ff\nX\3X\3X\3X\3X\7X\u0405"+
		"\nX\fX\16X\u0408\13X\3X\3X\5X\u040c\nX\3X\3X\3X\3X\5X\u0412\nX\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u043e\nY\fY\16Y\u0441"+
		"\13Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\5Z\u045b\nZ\3Z\3Z\3Z\3Z\3Z\7Z\u0462\nZ\fZ\16Z\u0465\13Z\3[\3["+
		"\3[\5[\u046a\n[\3[\3[\5[\u046e\n[\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u0488\n`\3`\3`\3`\5`\u048d\n"+
		"`\3`\3`\5`\u0491\n`\5`\u0493\n`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3"+
		"f\3f\3f\7f\u04a4\nf\ff\16f\u04a7\13f\3g\3g\3g\5g\u04ac\ng\3g\5g\u04af"+
		"\ng\3h\3h\5h\u04b3\nh\3h\3h\3h\3h\3h\5h\u04ba\nh\3i\3i\5i\u04be\ni\3i"+
		"\3i\3i\3i\7i\u04c4\ni\fi\16i\u04c7\13i\3i\3i\3j\3j\5j\u04cd\nj\3k\3k\5"+
		"k\u04d1\nk\3l\3l\3l\3l\3m\3m\3m\3n\3n\3o\3o\3o\3o\3o\7o\u04e1\no\fo\16"+
		"o\u04e4\13o\3o\3o\3o\3o\3o\7o\u04eb\no\fo\16o\u04ee\13o\3o\3o\3o\3p\3"+
		"p\3p\3p\3p\3p\5p\u04f9\np\3q\3q\3q\3q\3r\3r\3r\5r\u0502\nr\3r\3r\3r\3"+
		"r\3s\3s\3s\3s\5s\u050c\ns\3s\3s\3s\3s\5s\u0512\ns\3s\3s\3t\3t\3t\7t\u0519"+
		"\nt\ft\16t\u051c\13t\3u\3u\3u\3u\5u\u0522\nu\3v\5v\u0525\nv\3v\3v\5v\u0529"+
		"\nv\3w\3w\3w\5w\u052e\nw\3w\3w\3w\5w\u0533\nw\3w\3w\5w\u0537\nw\3w\3w"+
		"\5w\u053b\nw\3w\6w\u053e\nw\rw\16w\u053f\3w\5w\u0543\nw\3x\3x\3x\3x\3"+
		"x\3x\5x\u054b\nx\5x\u054d\nx\3x\3x\3x\5x\u0552\nx\3x\6x\u0555\nx\rx\16"+
		"x\u0556\5x\u0559\nx\3x\5x\u055c\nx\3y\3y\3y\3y\3y\5y\u0563\ny\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\5y\u0575\ny\3z\3z\5z\u0579\n"+
		"z\3z\3z\5z\u057d\nz\3z\3z\3z\3z\3z\5z\u0584\nz\3z\7z\u0587\nz\fz\16z\u058a"+
		"\13z\3{\3{\5{\u058e\n{\3{\5{\u0591\n{\3{\3{\3{\3{\3{\3{\3{\3{\3{\5{\u059c"+
		"\n{\3{\7{\u059f\n{\f{\16{\u05a2\13{\3|\3|\3|\5|\u05a7\n|\3|\3|\3|\3|\3"+
		"|\5|\u05ae\n|\5|\u05b0\n|\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u05bc\n}\3"+
		"~\5~\u05bf\n~\3~\3~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u05d0\n\u0081"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u05d9"+
		"\n\u0082\3\u0082\3\u0082\7\u0082\u05dd\n\u0082\f\u0082\16\u0082\u05e0"+
		"\13\u0082\5\u0082\u05e2\n\u0082\3\u0083\3\u0083\5\u0083\u05e6\n\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u05f7\n\u0083"+
		"\3\u0083\7\u0083\u05fa\n\u0083\f\u0083\16\u0083\u05fd\13\u0083\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u0610"+
		"\n\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u0617\n\u0084"+
		"\f\u0084\16\u0084\u061a\13\u0084\5\u0084\u061c\n\u0084\3\u0085\3\u0085"+
		"\5\u0085\u0620\n\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0625\n\u0085\3"+
		"\u0085\5\u0085\u0628\n\u0085\3\u0085\5\u0085\u062b\n\u0085\3\u0085\5\u0085"+
		"\u062e\n\u0085\3\u0086\3\u0086\3\u0086\7\u0086\u0633\n\u0086\f\u0086\16"+
		"\u0086\u0636\13\u0086\3\u0087\3\u0087\5\u0087\u063a\n\u0087\3\u0087\3"+
		"\u0087\5\u0087\u063e\n\u0087\3\u0087\7\u0087\u0641\n\u0087\f\u0087\16"+
		"\u0087\u0644\13\u0087\3\u0087\5\u0087\u0647\n\u0087\5\u0087\u0649\n\u0087"+
		"\3\u0087\3\u0087\5\u0087\u064d\n\u0087\3\u0088\6\u0088\u0650\n\u0088\r"+
		"\u0088\16\u0088\u0651\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008b\5\u008b\u065b\n\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0660\n"+
		"\u008b\3\u008b\3\u008b\5\u008b\u0664\n\u008b\3\u008b\3\u008b\3\u008b\3"+
		"\u008b\5\u008b\u066a\n\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0670"+
		"\n\u008b\3\u008c\3\u008c\3\u008c\5\u008c\u0675\n\u008c\3\u008c\7\u008c"+
		"\u0678\n\u008c\f\u008c\16\u008c\u067b\13\u008c\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\7\u0090\u068a\n\u0090\f\u0090\16\u0090\u068d\13\u0090\3\u0090"+
		"\3\u0090\5\u0090\u0691\n\u0090\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092"+
		"\3\u0092\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\5\u0094\u069e\n\u0094"+
		"\3\u0094\3\u0094\7\u0094\u06a2\n\u0094\f\u0094\16\u0094\u06a5\13\u0094"+
		"\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u06b4\n\u0098\3\u0099\3\u0099"+
		"\3\u0099\5\u0099\u06b9\n\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b"+
		"\6\u009b\u06c0\n\u009b\r\u009b\16\u009b\u06c1\3\u009b\5\u009b\u06c5\n"+
		"\u009b\3\u009c\3\u009c\3\u009c\5\u009c\u06ca\n\u009c\3\u009d\3\u009d\3"+
		"\u009d\5\u009d\u06cf\n\u009d\3\u009e\3\u009e\3\u009e\3\u009e\7\u009e\u06d5"+
		"\n\u009e\f\u009e\16\u009e\u06d8\13\u009e\3\u009e\3\u009e\3\u009e\5\u009e"+
		"\u06dd\n\u009e\3\u009f\3\u009f\5\u009f\u06e1\n\u009f\3\u00a0\3\u00a0\5"+
		"\u00a0\u06e5\n\u00a0\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u06ea\n\u00a0\f\u00a0"+
		"\16\u00a0\u06ed\13\u00a0\3\u00a0\5\u00a0\u06f0\n\u00a0\3\u00a0\5\u00a0"+
		"\u06f3\n\u00a0\3\u00a1\3\u00a1\5\u00a1\u06f7\n\u00a1\3\u00a1\3\u00a1\5"+
		"\u00a1\u06fb\n\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u0700\n\u00a1\3\u00a1"+
		"\7\u00a1\u0703\n\u00a1\f\u00a1\16\u00a1\u0706\13\u00a1\3\u00a2\3\u00a2"+
		"\3\u00a2\5\u00a2\u070b\n\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\5\u00a2\u0712\n\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u0718\n"+
		"\u00a3\f\u00a3\16\u00a3\u071b\13\u00a3\3\u00a3\5\u00a3\u071e\n\u00a3\3"+
		"\u00a4\3\u00a4\3\u00a4\7\u00a4\u0723\n\u00a4\f\u00a4\16\u00a4\u0726\13"+
		"\u00a4\3\u00a4\5\u00a4\u0729\n\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a5\7\u00a5\u0731\n\u00a5\f\u00a5\16\u00a5\u0734\13\u00a5\3"+
		"\u00a5\3\u00a5\5\u00a5\u0738\n\u00a5\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u073d"+
		"\n\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\6\u00a9\u074c\n\u00a9\r\u00a9"+
		"\16\u00a9\u074d\5\u00a9\u0750\n\u00a9\3\u00aa\3\u00aa\6\u00aa\u0754\n"+
		"\u00aa\r\u00aa\16\u00aa\u0755\3\u00aa\5\u00aa\u0759\n\u00aa\3\u00ab\3"+
		"\u00ab\3\u00ab\6\u00ab\u075e\n\u00ab\r\u00ab\16\u00ab\u075f\3\u00ab\5"+
		"\u00ab\u0763\n\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\5\u00ad\u076a"+
		"\n\u00ad\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u076f\n\u00ae\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0779\n\u00b0"+
		"\3\u00b0\3\u00b0\5\u00b0\u077d\n\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0"+
		"\u0782\n\u00b0\5\u00b0\u0784\n\u00b0\3\u00b1\3\u00b1\3\u00b1\6\u00b1\u0789"+
		"\n\u00b1\r\u00b1\16\u00b1\u078a\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u079e\n\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\5\u00b4\u07a4\n\u00b4\3\u00b4\3\u00b4\5\u00b4\u07a8\n\u00b4\3"+
		"\u00b5\3\u00b5\5\u00b5\u07ac\n\u00b5\3\u00b5\3\u00b5\5\u00b5\u07b0\n\u00b5"+
		"\3\u00b5\3\u00b5\5\u00b5\u07b4\n\u00b5\3\u00b5\5\u00b5\u07b7\n\u00b5\5"+
		"\u00b5\u07b9\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u07bf\n\u00b5"+
		"\5\u00b5\u07c1\n\u00b5\3\u00b6\3\u00b6\5\u00b6\u07c5\n\u00b6\3\u00b6\3"+
		"\u00b6\5\u00b6\u07c9\n\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u07ce\n\u00b6"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u07d6\n\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u07db\n\u00b8\3\u00b8\5\u00b8\u07de\n"+
		"\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u07e4\n\u00b9\3\u00b9\3"+
		"\u00b9\3\u00b9\5\u00b9\u07e9\n\u00b9\3\u00ba\3\u00ba\3\u00ba\7\u00ba\u07ee"+
		"\n\u00ba\f\u00ba\16\u00ba\u07f1\13\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\7\u00bb\u07f7\n\u00bb\f\u00bb\16\u00bb\u07fa\13\u00bb\5\u00bb\u07fc\n"+
		"\u00bb\3\u00bc\3\u00bc\3\u00bc\7\u00bc\u0801\n\u00bc\f\u00bc\16\u00bc"+
		"\u0804\13\u00bc\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0809\n\u00bd\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\7\u00be\u0811\n\u00be\f\u00be"+
		"\16\u00be\u0814\13\u00be\3\u00bf\3\u00bf\3\u00bf\7\u00bf\u0819\n\u00bf"+
		"\f\u00bf\16\u00bf\u081c\13\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\5\u00bf\u0824\n\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0829\n"+
		"\u00bf\3\u00c0\3\u00c0\5\u00c0\u082d\n\u00c0\3\u00c1\7\u00c1\u0830\n\u00c1"+
		"\f\u00c1\16\u00c1\u0833\13\u00c1\3\u00c1\3\u00c1\5\u00c1\u0837\n\u00c1"+
		"\5\u00c1\u0839\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\7\u00c2\u0841\n\u00c2\f\u00c2\16\u00c2\u0844\13\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u084f"+
		"\n\u00c2\3\u00c2\5\u00c2\u0852\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u085b\n\u00c4\f\u00c4\16\u00c4\u085e"+
		"\13\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0866"+
		"\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u086b\n\u00c6\3\u00c6\5\u00c6"+
		"\u086e\n\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\7\u00c8"+
		"\u0876\n\u00c8\f\u00c8\16\u00c8\u0879\13\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0881\n\u00c8\3\u00c9\3\u00c9\5\u00c9"+
		"\u0885\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0893\n\u00ca\5\u00ca"+
		"\u0895\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\5\u00ca\u08a0\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\7\u00ca\u08af\n\u00ca\f\u00ca\16\u00ca\u08b2\13\u00ca\3\u00cb\3\u00cb"+
		"\5\u00cb\u08b6\n\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\5\u00cc\u08c0\n\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc"+
		"\u08c5\n\u00cc\5\u00cc\u08c7\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u08d2\n\u00cc\3\u00cc\3"+
		"\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\5\u00cc\u08e0\n\u00cc\3\u00cc\5\u00cc\u08e3\n\u00cc\3"+
		"\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\5\u00cc\u08ee\n\u00cc\3\u00cc\5\u00cc\u08f1\n\u00cc\3\u00cc\7\u00cc\u08f4"+
		"\n\u00cc\f\u00cc\16\u00cc\u08f7\13\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc"+
		"\u08fc\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd"+
		"\u0904\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u090a\n\u00cd\3"+
		"\u00cd\3\u00cd\5\u00cd\u090e\n\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3"+
		"\u00ce\3\u00ce\3\u00ce\5\u00ce\u0917\n\u00ce\5\u00ce\u0919\n\u00ce\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u091f\n\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\5\u00cf\u0924\n\u00cf\5\u00cf\u0926\n\u00cf\3\u00cf\3\u00cf\5\u00cf\u092a"+
		"\n\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0930\n\u00d0\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d1\5\u00d1\u093e\n\u00d1\5\u00d1\u0940\n\u00d1\3\u00d1\3"+
		"\u00d1\3\u00d1\5\u00d1\u0945\n\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3"+
		"\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2"+
		"\u0953\n\u00d2\5\u00d2\u0955\n\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u095a"+
		"\n\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\4\u07f8\u0831\6\u00a8"+
		"\u00aa\u00b0\u00b2\u00d4\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\2\27\4\2\u00a8\u00a8\u00ae\u00ae\4\2\u0100\u0100\u0103\u0103\6\2\u00b2"+
		"\u00b2\u00be\u00be\u00cb\u00cb\u00cd\u00cd\4\2\u00a5\u00a5\u00a7\u00a7"+
		"\3\2\u008f\u0095\4\2\u00ad\u00ad\u00c9\u00ca\4\2\t\t\u00fc\u00fc\4\2L"+
		"L\u00df\u00df\4\2\26\26++\4\2\62\62\u00e1\u00e1\4\2IIyy\4\2GGww\4\2\b"+
		"\b++\4\2\u00a5\u00a5\u00dc\u00dc\4\2\5\5\27\27\4\2YYbb\5\2JJNN\u00e5\u00e5"+
		"\4\2$$\'\'\4\2\65\65nn\4\2UU\u00d1\u00d1\4\2\u00e7\u00e7\u00f2\u00f2\2"+
		"\u0a36\2\u01b9\3\2\2\2\4\u01c7\3\2\2\2\6\u01c9\3\2\2\2\b\u01cb\3\2\2\2"+
		"\n\u01cd\3\2\2\2\f\u01cf\3\2\2\2\16\u01d1\3\2\2\2\20\u01d3\3\2\2\2\22"+
		"\u01d7\3\2\2\2\24\u01e1\3\2\2\2\26\u01e3\3\2\2\2\30\u01eb\3\2\2\2\32\u01fa"+
		"\3\2\2\2\34\u0203\3\2\2\2\36\u021c\3\2\2\2 \u022f\3\2\2\2\"\u0231\3\2"+
		"\2\2$\u0236\3\2\2\2&\u023f\3\2\2\2(\u0241\3\2\2\2*\u024b\3\2\2\2,\u0255"+
		"\3\2\2\2.\u025b\3\2\2\2\60\u0260\3\2\2\2\62\u0263\3\2\2\2\64\u026f\3\2"+
		"\2\2\66\u0272\3\2\2\28\u0293\3\2\2\2:\u02a5\3\2\2\2<\u02a9\3\2\2\2>\u02ab"+
		"\3\2\2\2@\u02ad\3\2\2\2B\u02af\3\2\2\2D\u02b1\3\2\2\2F\u02b3\3\2\2\2H"+
		"\u02b5\3\2\2\2J\u02b7\3\2\2\2L\u02b9\3\2\2\2N\u02bb\3\2\2\2P\u02bd\3\2"+
		"\2\2R\u02bf\3\2\2\2T\u02c1\3\2\2\2V\u02c3\3\2\2\2X\u02c5\3\2\2\2Z\u02c7"+
		"\3\2\2\2\\\u02c9\3\2\2\2^\u02cb\3\2\2\2`\u02cd\3\2\2\2b\u02cf\3\2\2\2"+
		"d\u02d1\3\2\2\2f\u02d3\3\2\2\2h\u02d5\3\2\2\2j\u02d7\3\2\2\2l\u02d9\3"+
		"\2\2\2n\u02db\3\2\2\2p\u02dd\3\2\2\2r\u02df\3\2\2\2t\u02ea\3\2\2\2v\u02ee"+
		"\3\2\2\2x\u02f0\3\2\2\2z\u02f8\3\2\2\2|\u0308\3\2\2\2~\u030c\3\2\2\2\u0080"+
		"\u030e\3\2\2\2\u0082\u0316\3\2\2\2\u0084\u031e\3\2\2\2\u0086\u0326\3\2"+
		"\2\2\u0088\u032a\3\2\2\2\u008a\u0332\3\2\2\2\u008c\u0336\3\2\2\2\u008e"+
		"\u033e\3\2\2\2\u0090\u0342\3\2\2\2\u0092\u034a\3\2\2\2\u0094\u0352\3\2"+
		"\2\2\u0096\u035a\3\2\2\2\u0098\u035e\3\2\2\2\u009a\u0366\3\2\2\2\u009c"+
		"\u036e\3\2\2\2\u009e\u0376\3\2\2\2\u00a0\u037e\3\2\2\2\u00a2\u0386\3\2"+
		"\2\2\u00a4\u038e\3\2\2\2\u00a6\u0396\3\2\2\2\u00a8\u03a5\3\2\2\2\u00aa"+
		"\u03bb\3\2\2\2\u00ac\u03d5\3\2\2\2\u00ae\u0411\3\2\2\2\u00b0\u0413\3\2"+
		"\2\2\u00b2\u045a\3\2\2\2\u00b4\u0466\3\2\2\2\u00b6\u0471\3\2\2\2\u00b8"+
		"\u0473\3\2\2\2\u00ba\u0475\3\2\2\2\u00bc\u0477\3\2\2\2\u00be\u0492\3\2"+
		"\2\2\u00c0\u0494\3\2\2\2\u00c2\u0496\3\2\2\2\u00c4\u0498\3\2\2\2\u00c6"+
		"\u049a\3\2\2\2\u00c8\u049c\3\2\2\2\u00ca\u049e\3\2\2\2\u00cc\u04ab\3\2"+
		"\2\2\u00ce\u04b0\3\2\2\2\u00d0\u04bb\3\2\2\2\u00d2\u04ca\3\2\2\2\u00d4"+
		"\u04d0\3\2\2\2\u00d6\u04d2\3\2\2\2\u00d8\u04d6\3\2\2\2\u00da\u04d9\3\2"+
		"\2\2\u00dc\u04db\3\2\2\2\u00de\u04f2\3\2\2\2\u00e0\u04fa\3\2\2\2\u00e2"+
		"\u04fe\3\2\2\2\u00e4\u050b\3\2\2\2\u00e6\u0515\3\2\2\2\u00e8\u0521\3\2"+
		"\2\2\u00ea\u0524\3\2\2\2\u00ec\u052a\3\2\2\2\u00ee\u0544\3\2\2\2\u00f0"+
		"\u0574\3\2\2\2\u00f2\u0576\3\2\2\2\u00f4\u058d\3\2\2\2\u00f6\u05a3\3\2"+
		"\2\2\u00f8\u05bb\3\2\2\2\u00fa\u05be\3\2\2\2\u00fc\u05c2\3\2\2\2\u00fe"+
		"\u05c5\3\2\2\2\u0100\u05c8\3\2\2\2\u0102\u05e1\3\2\2\2\u0104\u05e5\3\2"+
		"\2\2\u0106\u061b\3\2\2\2\u0108\u061f\3\2\2\2\u010a\u062f\3\2\2\2\u010c"+
		"\u064c\3\2\2\2\u010e\u064f\3\2\2\2\u0110\u0653\3\2\2\2\u0112\u0655\3\2"+
		"\2\2\u0114\u066f\3\2\2\2\u0116\u0671\3\2\2\2\u0118\u067c\3\2\2\2\u011a"+
		"\u067e\3\2\2\2\u011c\u0681\3\2\2\2\u011e\u0684\3\2\2\2\u0120\u0692\3\2"+
		"\2\2\u0122\u0695\3\2\2\2\u0124\u0698\3\2\2\2\u0126\u069d\3\2\2\2\u0128"+
		"\u06a6\3\2\2\2\u012a\u06a8\3\2\2\2\u012c\u06aa\3\2\2\2\u012e\u06ac\3\2"+
		"\2\2\u0130\u06b8\3\2\2\2\u0132\u06ba\3\2\2\2\u0134\u06c4\3\2\2\2\u0136"+
		"\u06c9\3\2\2\2\u0138\u06cb\3\2\2\2\u013a\u06dc\3\2\2\2\u013c\u06e0\3\2"+
		"\2\2\u013e\u06e2\3\2\2\2\u0140\u06f4\3\2\2\2\u0142\u0707\3\2\2\2\u0144"+
		"\u071d\3\2\2\2\u0146\u071f\3\2\2\2\u0148\u0737\3\2\2\2\u014a\u073c\3\2"+
		"\2\2\u014c\u073e\3\2\2\2\u014e\u0741\3\2\2\2\u0150\u074f\3\2\2\2\u0152"+
		"\u0751\3\2\2\2\u0154\u075a\3\2\2\2\u0156\u0764\3\2\2\2\u0158\u0769\3\2"+
		"\2\2\u015a\u076e\3\2\2\2\u015c\u0770\3\2\2\2\u015e\u0775\3\2\2\2\u0160"+
		"\u0788\3\2\2\2\u0162\u078c\3\2\2\2\u0164\u0790\3\2\2\2\u0166\u07a7\3\2"+
		"\2\2\u0168\u07a9\3\2\2\2\u016a\u07c2\3\2\2\2\u016c\u07cf\3\2\2\2\u016e"+
		"\u07d2\3\2\2\2\u0170\u07df\3\2\2\2\u0172\u07ea\3\2\2\2\u0174\u07fb\3\2"+
		"\2\2\u0176\u07fd\3\2\2\2\u0178\u0808\3\2\2\2\u017a\u080a\3\2\2\2\u017c"+
		"\u0815\3\2\2\2\u017e\u082a\3\2\2\2\u0180\u0838\3\2\2\2\u0182\u083a\3\2"+
		"\2\2\u0184\u0853\3\2\2\2\u0186\u0857\3\2\2\2\u0188\u085f\3\2\2\2\u018a"+
		"\u0862\3\2\2\2\u018c\u086f\3\2\2\2\u018e\u0872\3\2\2\2\u0190\u0884\3\2"+
		"\2\2\u0192\u0889\3\2\2\2\u0194\u08b3\3\2\2\2\u0196\u08b7\3\2\2\2\u0198"+
		"\u0909\3\2\2\2\u019a\u090f\3\2\2\2\u019c\u0925\3\2\2\2\u019e\u092b\3\2"+
		"\2\2\u01a0\u0931\3\2\2\2\u01a2\u0946\3\2\2\2\u01a4\u095b\3\2\2\2\u01a6"+
		"\u01ba\5\u00ceh\2\u01a7\u01ba\5\u00dep\2\u01a8\u01ba\5\u00e0q\2\u01a9"+
		"\u01ba\5\u00e2r\2\u01aa\u01ba\5\u012e\u0098\2\u01ab\u01ba\5\u0162\u00b2"+
		"\2\u01ac\u01ba\5\u0164\u00b3\2\u01ad\u01ba\5\u0168\u00b5\2\u01ae\u01ba"+
		"\5\u016a\u00b6\2\u01af\u01ba\5\u0166\u00b4\2\u01b0\u01ba\5\u016c\u00b7"+
		"\2\u01b1\u01ba\5\u016e\u00b8\2\u01b2\u01ba\5\u018a\u00c6\2\u01b3\u01ba"+
		"\5\u0192\u00ca\2\u01b4\u01ba\5\u0196\u00cc\2\u01b5\u01ba\5\u019e\u00d0"+
		"\2\u01b6\u01ba\5\u01a0\u00d1\2\u01b7\u01ba\5\u01a2\u00d2\2\u01b8\u01ba"+
		"\5\u01a4\u00d3\2\u01b9\u01a6\3\2\2\2\u01b9\u01a7\3\2\2\2\u01b9\u01a8\3"+
		"\2\2\2\u01b9\u01a9\3\2\2\2\u01b9\u01aa\3\2\2\2\u01b9\u01ab\3\2\2\2\u01b9"+
		"\u01ac\3\2\2\2\u01b9\u01ad\3\2\2\2\u01b9\u01ae\3\2\2\2\u01b9\u01af\3\2"+
		"\2\2\u01b9\u01b0\3\2\2\2\u01b9\u01b1\3\2\2\2\u01b9\u01b2\3\2\2\2\u01b9"+
		"\u01b3\3\2\2\2\u01b9\u01b4\3\2\2\2\u01b9\u01b5\3\2\2\2\u01b9\u01b6\3\2"+
		"\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb"+
		"\u01bd\7\u00a4\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\3\3\2"+
		"\2\2\u01be\u01c8\7\u0100\2\2\u01bf\u01c0\7\u0103\2\2\u01c0\u01c2\7\u008b"+
		"\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c8\7\u0103"+
		"\2\2\u01c7\u01be\3\2\2\2\u01c7\u01c3\3\2\2\2\u01c8\5\3\2\2\2\u01c9\u01ca"+
		"\5\4\3\2\u01ca\7\3\2\2\2\u01cb\u01cc\5\4\3\2\u01cc\t\3\2\2\2\u01cd\u01ce"+
		"\5\4\3\2\u01ce\13\3\2\2\2\u01cf\u01d0\5\4\3\2\u01d0\r\3\2\2\2\u01d1\u01d2"+
		"\7\u0100\2\2\u01d2\17\3\2\2\2\u01d3\u01d4\7\u0097\2\2\u01d4\u01d5\5\22"+
		"\n\2\u01d5\u01d6\7\u0098\2\2\u01d6\21\3\2\2\2\u01d7\u01dc\5\u00b2Z\2\u01d8"+
		"\u01d9\7\u009d\2\2\u01d9\u01db\5\u00b2Z\2\u01da\u01d8\3\2\2\2\u01db\u01de"+
		"\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\23\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01df\u01e2\5\f\7\2\u01e0\u01e2\5\b\5\2\u01e1\u01df\3\2"+
		"\2\2\u01e1\u01e0\3\2\2\2\u01e2\25\3\2\2\2\u01e3\u01e8\5\24\13\2\u01e4"+
		"\u01e5\7\u009d\2\2\u01e5\u01e7\5\24\13\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea"+
		"\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\27\3\2\2\2\u01ea"+
		"\u01e8\3\2\2\2\u01eb\u01ec\7\u0097\2\2\u01ec\u01ed\5\26\f\2\u01ed\u01ee"+
		"\7\u0098\2\2\u01ee\31\3\2\2\2\u01ef\u01f1\5\34\17\2\u01f0\u01f2\5r:\2"+
		"\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01fb\3\2\2\2\u01f3\u01fb"+
		"\5\36\20\2\u01f4\u01f6\5\34\17\2\u01f5\u01f7\5r:\2\u01f6\u01f5\3\2\2\2"+
		"\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\5 \21\2\u01f9\u01fb"+
		"\3\2\2\2\u01fa\u01ef\3\2\2\2\u01fa\u01f3\3\2\2\2\u01fa\u01f4\3\2\2\2\u01fb"+
		"\33\3\2\2\2\u01fc\u01fd\7\31\2\2\u01fd\u0204\7K\2\2\u01fe\u01ff\7.\2\2"+
		"\u01ff\u0204\7\u00ff\2\2\u0200\u0201\7.\2\2\u0201\u0204\7\u00dd\2\2\u0202"+
		"\u0204\7\u0100\2\2\u0203\u01fc\3\2\2\2\u0203\u01fe\3\2\2\2\u0203\u0200"+
		"\3\2\2\2\u0203\u0202\3\2\2\2\u0204\35\3\2\2\2\u0205\u0206\5\34\17\2\u0206"+
		"\u0207\7\u0097\2\2\u0207\u0208\7\u0104\2\2\u0208\u0209\7\u0100\2\2\u0209"+
		"\u020a\7\u0098\2\2\u020a\u021d\3\2\2\2\u020b\u020c\7=\2\2\u020c\u020e"+
		"\5\34\17\2\u020d\u020f\7u\2\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2"+
		"\u020f\u0210\3\2\2\2\u0210\u0211\7\u0097\2\2\u0211\u0212\7\u0104\2\2\u0212"+
		"\u0213\7\u0098\2\2\u0213\u021d\3\2\2\2\u0214\u0216\5\34\17\2\u0215\u0217"+
		"\7\u0097\2\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\3\2\2"+
		"\2\u0218\u021a\5\b\5\2\u0219\u021b\7\u0098\2\2\u021a\u0219\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u0205\3\2\2\2\u021c\u020b\3\2"+
		"\2\2\u021c\u0214\3\2\2\2\u021d\37\3\2\2\2\u021e\u0220\7\u00cf\2\2\u021f"+
		"\u0221\7\64\2\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\3"+
		"\2\2\2\u0222\u0223\7\u00c9\2\2\u0223\u0225\7z\2\2\u0224\u021e\3\2\2\2"+
		"\u0224\u0225\3\2\2\2\u0225\u0230\3\2\2\2\u0226\u0227\7\u00f9\2\2\u0227"+
		"\u0230\7;\2\2\u0228\u0229\7\u00f9\2\2\u0229\u022d\7_\2\2\u022a\u022b\7"+
		"\u0097\2\2\u022b\u022c\7\u0104\2\2\u022c\u022e\7\u0098\2\2\u022d\u022a"+
		"\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u0224\3\2\2\2\u022f"+
		"\u0226\3\2\2\2\u022f\u0228\3\2\2\2\u0230!\3\2\2\2\u0231\u0232\5$\23\2"+
		"\u0232\u0234\5\b\5\2\u0233\u0235\t\2\2\2\u0234\u0233\3\2\2\2\u0234\u0235"+
		"\3\2\2\2\u0235#\3\2\2\2\u0236\u0238\5\6\4\2\u0237\u0239\5H%\2\u0238\u0237"+
		"\3\2\2\2\u0238\u0239\3\2\2\2\u0239%\3\2\2\2\u023a\u0240\5(\25\2\u023b"+
		"\u0240\5*\26\2\u023c\u0240\5\66\34\2\u023d\u0240\58\35\2\u023e\u0240\5"+
		":\36\2\u023f\u023a\3\2\2\2\u023f\u023b\3\2\2\2\u023f\u023c\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240\'\3\2\2\2\u0241\u0242\7k\2\2"+
		"\u0242\u0243\7\u0097\2\2\u0243\u0244\5\u00a8U\2\u0244\u0246\7\u00d4\2"+
		"\2\u0245\u0247\7R\2\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248"+
		"\3\2\2\2\u0248\u0249\5\34\17\2\u0249\u024a\7\u0098\2\2\u024a)\3\2\2\2"+
		"\u024b\u024e\7\13\2\2\u024c\u024f\5,\27\2\u024d\u024f\5.\30\2\u024e\u024c"+
		"\3\2\2\2\u024e\u024d\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u0252\5\60\31\2"+
		"\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254"+
		"\7\37\2\2\u0254+\3\2\2\2\u0255\u0257\5\u00a8U\2\u0256\u0258\5.\30\2\u0257"+
		"\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2"+
		"\2\2\u025a-\3\2\2\2\u025b\u025c\7x\2\2\u025c\u025d\5\u00a8U\2\u025d\u025e"+
		"\7h\2\2\u025e\u025f\5\u00b2Z\2\u025f/\3\2\2\2\u0260\u0261\7\35\2\2\u0261"+
		"\u0262\5\u00a8U\2\u0262\61\3\2\2\2\u0263\u0264\5\u00a8U\2\u0264\u026d"+
		"\7\6\2\2\u0265\u026e\7\64\2\2\u0266\u0267\7\u00c9\2\2\u0267\u026b\7z\2"+
		"\2\u0268\u026c\7\u0103\2\2\u0269\u026c\7\23\2\2\u026a\u026c\5\u00a8U\2"+
		"\u026b\u0268\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026a\3\2\2\2\u026c\u026e"+
		"\3\2\2\2\u026d\u0265\3\2\2\2\u026d\u0266\3\2\2\2\u026e\63\3\2\2\2\u026f"+
		"\u0270\7M\2\2\u0270\u0271\5\u00a8U\2\u0271\65\3\2\2\2\u0272\u0273\7\u0097"+
		"\2\2\u0273\u0274\5\u00a8U\2\u0274\u0275\7\u0087\2\2\u0275\u0276\5\u00a8"+
		"U\2\u0276\u028c\7\u0098\2\2\u0277\u027b\7\u00dd\2\2\u0278\u0279\7\u0097"+
		"\2\2\u0279\u027a\7\u0104\2\2\u027a\u027c\7\u0098\2\2\u027b\u0278\3\2\2"+
		"\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\7\u00f9\2\2\u027e"+
		"\u0282\7_\2\2\u027f\u0280\7\u0097\2\2\u0280\u0281\7\u0104\2\2\u0281\u0283"+
		"\7\u0098\2\2\u0282\u027f\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u028d\3\2\2"+
		"\2\u0284\u0288\7\u00ff\2\2\u0285\u0286\7\u0097\2\2\u0286\u0287\7\u0104"+
		"\2\2\u0287\u0289\7\u0098\2\2\u0288\u0285\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028a\3\2\2\2\u028a\u028b\7\u00f9\2\2\u028b\u028d\7;\2\2\u028c\u0277"+
		"\3\2\2\2\u028c\u0284\3\2\2\2\u028d\67\3\2\2\2\u028e\u028f\7\u0097\2\2"+
		"\u028f\u0290\5\u00b2Z\2\u0290\u0291\7\u0098\2\2\u0291\u0294\3\2\2\2\u0292"+
		"\u0294\5(\25\2\u0293\u028e\3\2\2\2\u0293\u0292\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u02a3\7\u008b\2\2\u0296\u029b\5\f\7\2\u0297\u0298\7\u008b\2"+
		"\2\u0298\u029a\5\f\7\2\u0299\u0297\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299"+
		"\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02a0\3\2\2\2\u029d\u029b\3\2\2\2\u029e"+
		"\u029f\7\u008b\2\2\u029f\u02a1\5\u00b4[\2\u02a0\u029e\3\2\2\2\u02a0\u02a1"+
		"\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a4\5\u00b4[\2\u02a3\u0296\3\2\2"+
		"\2\u02a3\u02a2\3\2\2\2\u02a49\3\2\2\2\u02a5\u02a6\7>\2\2\u02a6\u02a7\5"+
		"\34\17\2\u02a7\u02a8\5\u00a6T\2\u02a8;\3\2\2\2\u02a9\u02aa\7\u0100\2\2"+
		"\u02aa=\3\2\2\2\u02ab\u02ac\7\u0100\2\2\u02ac?\3\2\2\2\u02ad\u02ae\7\u0100"+
		"\2\2\u02aeA\3\2\2\2\u02af\u02b0\7\u0100\2\2\u02b0C\3\2\2\2\u02b1\u02b2"+
		"\7\u0100\2\2\u02b2E\3\2\2\2\u02b3\u02b4\t\3\2\2\u02b4G\3\2\2\2\u02b5\u02b6"+
		"\7\u0100\2\2\u02b6I\3\2\2\2\u02b7\u02b8\7\u0100\2\2\u02b8K\3\2\2\2\u02b9"+
		"\u02ba\7\u0100\2\2\u02baM\3\2\2\2\u02bb\u02bc\7\u0100\2\2\u02bcO\3\2\2"+
		"\2\u02bd\u02be\7\u0100\2\2\u02beQ\3\2\2\2\u02bf\u02c0\7\u0100\2\2\u02c0"+
		"S\3\2\2\2\u02c1\u02c2\7\u0100\2\2\u02c2U\3\2\2\2\u02c3\u02c4\7\u0100\2"+
		"\2\u02c4W\3\2\2\2\u02c5\u02c6\7\u0100\2\2\u02c6Y\3\2\2\2\u02c7\u02c8\7"+
		"\u0100\2\2\u02c8[\3\2\2\2\u02c9\u02ca\7\u0100\2\2\u02ca]\3\2\2\2\u02cb"+
		"\u02cc\7\u0100\2\2\u02cc_\3\2\2\2\u02cd\u02ce\7\u0100\2\2\u02cea\3\2\2"+
		"\2\u02cf\u02d0\7\u0100\2\2\u02d0c\3\2\2\2\u02d1\u02d2\7\u0100\2\2\u02d2"+
		"e\3\2\2\2\u02d3\u02d4\t\3\2\2\u02d4g\3\2\2\2\u02d5\u02d6\7\u0100\2\2\u02d6"+
		"i\3\2\2\2\u02d7\u02d8\7\u0100\2\2\u02d8k\3\2\2\2\u02d9\u02da\7\u0100\2"+
		"\2\u02dam\3\2\2\2\u02db\u02dc\t\3\2\2\u02dco\3\2\2\2\u02dd\u02de\7\u0100"+
		"\2\2\u02deq\3\2\2\2\u02df\u02e5\7\u0097\2\2\u02e0\u02e3\7\u0104\2\2\u02e1"+
		"\u02e2\7\u009d\2\2\u02e2\u02e4\7\u0104\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4"+
		"\3\2\2\2\u02e4\u02e6\3\2\2\2\u02e5\u02e0\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02e8\7\u0098\2\2\u02e8s\3\2\2\2\u02e9\u02eb\7\u00c3"+
		"\2\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec"+
		"\u02ed\7\u00b9\2\2\u02edu\3\2\2\2\u02ee\u02ef\7\3\2\2\u02efw\3\2\2\2\u02f0"+
		"\u02f5\7\u0100\2\2\u02f1\u02f2\7\u009d\2\2\u02f2\u02f4\7\u0100\2\2\u02f3"+
		"\u02f1\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2"+
		"\2\2\u02f6y\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02f9\7\u0097\2\2\u02f9"+
		"\u02fa\5x=\2\u02fa\u02fb\7\u0098\2\2\u02fb{\3\2\2\2\u02fc\u0301\5~@\2"+
		"\u02fd\u02fe\7\u009d\2\2\u02fe\u0300\5~@\2\u02ff\u02fd\3\2\2\2\u0300\u0303"+
		"\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0309\3\2\2\2\u0303"+
		"\u0301\3\2\2\2\u0304\u0305\5~@\2\u0305\u0306\7\u00bf\2\2\u0306\u0307\5"+
		"~@\2\u0307\u0309\3\2\2\2\u0308\u02fc\3\2\2\2\u0308\u0304\3\2\2\2\u0309"+
		"}\3\2\2\2\u030a\u030d\5\u00c2b\2\u030b\u030d\5\u00c0a\2\u030c\u030a\3"+
		"\2\2\2\u030c\u030b\3\2\2\2\u030d\177\3\2\2\2\u030e\u0313\5<\37\2\u030f"+
		"\u0310\7\u009d\2\2\u0310\u0312\5<\37\2\u0311\u030f\3\2\2\2\u0312\u0315"+
		"\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0081\3\2\2\2\u0315"+
		"\u0313\3\2\2\2\u0316\u031b\5> \2\u0317\u0318\7\u009d\2\2\u0318\u031a\5"+
		"> \2\u0319\u0317\3\2\2\2\u031a\u031d\3\2\2\2\u031b\u0319\3\2\2\2\u031b"+
		"\u031c\3\2\2\2\u031c\u0083\3\2\2\2\u031d\u031b\3\2\2\2\u031e\u0323\5@"+
		"!\2\u031f\u0320\7\u009d\2\2\u0320\u0322\5@!\2\u0321\u031f\3\2\2\2\u0322"+
		"\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0085\3\2"+
		"\2\2\u0325\u0323\3\2\2\2\u0326\u0327\7\u0097\2\2\u0327\u0328\5\u0088E"+
		"\2\u0328\u0329\7\u0098\2\2\u0329\u0087\3\2\2\2\u032a\u032f\5\6\4\2\u032b"+
		"\u032c\7\u009d\2\2\u032c\u032e\5\6\4\2\u032d\u032b\3\2\2\2\u032e\u0331"+
		"\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0089\3\2\2\2\u0331"+
		"\u032f\3\2\2\2\u0332\u0333\7\u0097\2\2\u0333\u0334\5\u008cG\2\u0334\u0335"+
		"\7\u0098\2\2\u0335\u008b\3\2\2\2\u0336\u033b\5\b\5\2\u0337\u0338\7\u009d"+
		"\2\2\u0338\u033a\5\b\5\2\u0339\u0337\3\2\2\2\u033a\u033d\3\2\2\2\u033b"+
		"\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u008d\3\2\2\2\u033d\u033b\3\2"+
		"\2\2\u033e\u033f\7\u0097\2\2\u033f\u0340\5\u008cG\2\u0340\u0341\7\u0098"+
		"\2\2\u0341\u008f\3\2\2\2\u0342\u0347\5B\"\2\u0343\u0344\7\u009d\2\2\u0344"+
		"\u0346\5B\"\2\u0345\u0343\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0345\3\2"+
		"\2\2\u0347\u0348\3\2\2\2\u0348\u0091\3\2\2\2\u0349\u0347\3\2\2\2\u034a"+
		"\u034f\5D#\2\u034b\u034c\7\u009d\2\2\u034c\u034e\5D#\2\u034d\u034b\3\2"+
		"\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350"+
		"\u0093\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u0357\5\n\6\2\u0353\u0354\7\u009d"+
		"\2\2\u0354\u0356\5\n\6\2\u0355\u0353\3\2\2\2\u0356\u0359\3\2\2\2\u0357"+
		"\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0095\3\2\2\2\u0359\u0357\3\2"+
		"\2\2\u035a\u035b\7\u0097\2\2\u035b\u035c\5\u0094K\2\u035c\u035d\7\u0098"+
		"\2\2\u035d\u0097\3\2\2\2\u035e\u0363\5\34\17\2\u035f\u0360\7\u009d\2\2"+
		"\u0360\u0362\5\34\17\2\u0361\u035f\3\2\2\2\u0362\u0365\3\2\2\2\u0363\u0361"+
		"\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0099\3\2\2\2\u0365\u0363\3\2\2\2\u0366"+
		"\u036b\5P)\2\u0367\u0368\7\u009d\2\2\u0368\u036a\5P)\2\u0369\u0367\3\2"+
		"\2\2\u036a\u036d\3\2\2\2\u036b\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c"+
		"\u009b\3\2\2\2\u036d\u036b\3\2\2\2\u036e\u0373\5f\64\2\u036f\u0370\7\u009d"+
		"\2\2\u0370\u0372\5f\64\2\u0371\u036f\3\2\2\2\u0372\u0375\3\2\2\2\u0373"+
		"\u0371\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u009d\3\2\2\2\u0375\u0373\3\2"+
		"\2\2\u0376\u037b\5n8\2\u0377\u0378\7\u009d\2\2\u0378\u037a\5n8\2\u0379"+
		"\u0377\3\2\2\2\u037a\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2"+
		"\2\2\u037c\u009f\3\2\2\2\u037d\u037b\3\2\2\2\u037e\u0383\5p9\2\u037f\u0380"+
		"\7\u009d\2\2\u0380\u0382\5p9\2\u0381\u037f\3\2\2\2\u0382\u0385\3\2\2\2"+
		"\u0383\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u00a1\3\2\2\2\u0385\u0383"+
		"\3\2\2\2\u0386\u038b\5\u00b0Y\2\u0387\u0388\7\u009d\2\2\u0388\u038a\5"+
		"\u00b0Y\2\u0389\u0387\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u0389\3\2\2\2"+
		"\u038b\u038c\3\2\2\2\u038c\u00a3\3\2\2\2\u038d\u038b\3\2\2\2\u038e\u0393"+
		"\5\u00a8U\2\u038f\u0390\7\u009d\2\2\u0390\u0392\5\u00a8U\2\u0391\u038f"+
		"\3\2\2\2\u0392\u0395\3\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394"+
		"\u00a5\3\2\2\2\u0395\u0393\3\2\2\2\u0396\u0397\7\u0097\2\2\u0397\u0398"+
		"\5\u00a4S\2\u0398\u0399\7\u0098\2\2\u0399\u00a7\3\2\2\2\u039a\u039b\b"+
		"U\1\2\u039b\u039c\7\u0097\2\2\u039c\u039d\5\u00a8U\2\u039d\u039e\7\u0098"+
		"\2\2\u039e\u03a6\3\2\2\2\u039f\u03a0\7\u00bd\2\2\u03a0\u03a6\5\u00a8U"+
		"\b\u03a1\u03a2\7}\2\2\u03a2\u03a6\5\u00a8U\7\u03a3\u03a6\5\u00aaV\2\u03a4"+
		"\u03a6\5\64\33\2\u03a5\u039a\3\2\2\2\u03a5\u039f\3\2\2\2\u03a5\u03a1\3"+
		"\2\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a4\3\2\2\2\u03a6\u03b8\3\2\2\2\u03a7"+
		"\u03a8\f\f\2\2\u03a8\u03a9\7\u00a6\2\2\u03a9\u03b7\5\u00a8U\r\u03aa\u03ab"+
		"\f\13\2\2\u03ab\u03ac\7{\2\2\u03ac\u03b7\5\u00a8U\f\u03ad\u03ae\f\n\2"+
		"\2\u03ae\u03af\7\u00d0\2\2\u03af\u03b7\5\u00a8U\13\u03b0\u03b1\f\6\2\2"+
		"\u03b1\u03b2\7\u00c0\2\2\u03b2\u03b7\5\u00a8U\7\u03b3\u03b4\f\5\2\2\u03b4"+
		"\u03b5\7|\2\2\u03b5\u03b7\5\u00a8U\6\u03b6\u03a7\3\2\2\2\u03b6\u03aa\3"+
		"\2\2\2\u03b6\u03ad\3\2\2\2\u03b6\u03b0\3\2\2\2\u03b6\u03b3\3\2\2\2\u03b7"+
		"\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u00a9\3\2"+
		"\2\2\u03ba\u03b8\3\2\2\2\u03bb\u03bc\bV\1\2\u03bc\u03bd\5\u00aeX\2\u03bd"+
		"\u03d2\3\2\2\2\u03be\u03bf\f\7\2\2\u03bf\u03c1\7\u00b8\2\2\u03c0\u03c2"+
		"\7\u00bd\2\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2\2"+
		"\2\u03c3\u03d1\t\4\2\2\u03c4\u03c5\f\6\2\2\u03c5\u03c6\7\u008d\2\2\u03c6"+
		"\u03d1\5\u00aeX\2\u03c7\u03c8\f\5\2\2\u03c8\u03c9\5\u00acW\2\u03c9\u03ca"+
		"\5\u00aeX\2\u03ca\u03d1\3\2\2\2\u03cb\u03cc\f\4\2\2\u03cc\u03cd\5\u00ac"+
		"W\2\u03cd\u03ce\t\5\2\2\u03ce\u03cf\5\u00c6d\2\u03cf\u03d1\3\2\2\2\u03d0"+
		"\u03be\3\2\2\2\u03d0\u03c4\3\2\2\2\u03d0\u03c7\3\2\2\2\u03d0\u03cb\3\2"+
		"\2\2\u03d1\u03d4\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3"+
		"\u00ab\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03d6\t\6\2\2\u03d6\u00ad\3\2"+
		"\2\2\u03d7\u03d9\5\u00b0Y\2\u03d8\u03da\7\u00bd\2\2\u03d9\u03d8\3\2\2"+
		"\2\u03d9\u03da\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dc\7\u00b7\2\2\u03dc"+
		"\u03dd\5\u00c6d\2\u03dd\u0412\3\2\2\2\u03de\u03e0\5\u00b0Y\2\u03df\u03e1"+
		"\7\u00bd\2\2\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\3\2\2"+
		"\2\u03e2\u03e3\7\u00b7\2\2\u03e3\u03e4\7\u0097\2\2\u03e4\u03e9\5\u00b2"+
		"Z\2\u03e5\u03e6\7\u009d\2\2\u03e6\u03e8\5\u00b2Z\2\u03e7\u03e5\3\2\2\2"+
		"\u03e8\u03eb\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03ec"+
		"\3\2\2\2\u03eb\u03e9\3\2\2\2\u03ec\u03ed\7\u0098\2\2\u03ed\u0412\3\2\2"+
		"\2\u03ee\u03f0\5\u00b0Y\2\u03ef\u03f1\7\u00bd\2\2\u03f0\u03ef\3\2\2\2"+
		"\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\7\u00a9\2\2\u03f3"+
		"\u03f4\5\u00b2Z\2\u03f4\u03f5\7\u00a6\2\2\u03f5\u03f6\5\u00aeX\2\u03f6"+
		"\u0412\3\2\2\2\u03f7\u03f8\5\u00b0Y\2\u03f8\u03f9\7\u00c8\2\2\u03f9\u03fa"+
		"\7\u00ba\2\2\u03fa\u03fb\5\u00b2Z\2\u03fb\u0412\3\2\2\2\u03fc\u03fe\5"+
		"\u00b0Y\2\u03fd\u03ff\7\u00bd\2\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2"+
		"\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\7\u00ba\2\2\u0401\u0406\5\u00b2Z"+
		"\2\u0402\u0403\7\u00b0\2\2\u0403\u0405\5\u00b2Z\2\u0404\u0402\3\2\2\2"+
		"\u0405\u0408\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0412"+
		"\3\2\2\2\u0408\u0406\3\2\2\2\u0409\u040b\5\u00b0Y\2\u040a\u040c\7\u00bd"+
		"\2\2\u040b\u040a\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\3\2\2\2\u040d"+
		"\u040e\7\u00c4\2\2\u040e\u040f\5\u00b2Z\2\u040f\u0412\3\2\2\2\u0410\u0412"+
		"\5\u00b0Y\2\u0411\u03d7\3\2\2\2\u0411\u03de\3\2\2\2\u0411\u03ee\3\2\2"+
		"\2\u0411\u03f7\3\2\2\2\u0411\u03fc\3\2\2\2\u0411\u0409\3\2\2\2\u0411\u0410"+
		"\3\2\2\2\u0412\u00af\3\2\2\2\u0413\u0414\bY\1\2\u0414\u0415\5\u00b2Z\2"+
		"\u0415\u043f\3\2\2\2\u0416\u0417\f\20\2\2\u0417\u0418\7\177\2\2\u0418"+
		"\u043e\5\u00b0Y\21\u0419\u041a\f\17\2\2\u041a\u041b\7\u0080\2\2\u041b"+
		"\u043e\5\u00b0Y\20\u041c\u041d\f\16\2\2\u041d\u041e\7\u0081\2\2\u041e"+
		"\u043e\5\u00b0Y\17\u041f\u0420\f\r\2\2\u0420\u0421\7\u0082\2\2\u0421\u043e"+
		"\5\u00b0Y\16\u0422\u0423\f\f\2\2\u0423\u0424\7\u0086\2\2\u0424\u043e\5"+
		"\u00b0Y\r\u0425\u0426\f\13\2\2\u0426\u0427\7\u0087\2\2\u0427\u043e\5\u00b0"+
		"Y\f\u0428\u0429\f\n\2\2\u0429\u042a\7\u0088\2\2\u042a\u043e\5\u00b0Y\13"+
		"\u042b\u042c\f\t\2\2\u042c\u042d\7\u0089\2\2\u042d\u043e\5\u00b0Y\n\u042e"+
		"\u042f\f\b\2\2\u042f\u0430\7\u00bc\2\2\u0430\u043e\5\u00b0Y\t\u0431\u0432"+
		"\f\7\2\2\u0432\u0433\7\u0084\2\2\u0433\u043e\5\u00b0Y\b\u0434\u0435\f"+
		"\6\2\2\u0435\u0436\7\u0083\2\2\u0436\u043e\5\u00b0Y\7\u0437\u0438\f\5"+
		"\2\2\u0438\u0439\7\u0086\2\2\u0439\u043e\5\u00b8]\2\u043a\u043b\f\4\2"+
		"\2\u043b\u043c\7\u0087\2\2\u043c\u043e\5\u00b8]\2\u043d\u0416\3\2\2\2"+
		"\u043d\u0419\3\2\2\2\u043d\u041c\3\2\2\2\u043d\u041f\3\2\2\2\u043d\u0422"+
		"\3\2\2\2\u043d\u0425\3\2\2\2\u043d\u0428\3\2\2\2\u043d\u042b\3\2\2\2\u043d"+
		"\u042e\3\2\2\2\u043d\u0431\3\2\2\2\u043d\u0434\3\2\2\2\u043d\u0437\3\2"+
		"\2\2\u043d\u043a\3\2\2\2\u043e\u0441\3\2\2\2\u043f\u043d\3\2\2\2\u043f"+
		"\u0440\3\2\2\2\u0440\u00b1\3\2\2\2\u0441\u043f\3\2\2\2\u0442\u0443\bZ"+
		"\1\2\u0443\u045b\5\u00b4[\2\u0444\u045b\5\u00be`\2\u0445\u045b\5\b\5\2"+
		"\u0446\u045b\5\u00bc_\2\u0447\u0448\7\u0086\2\2\u0448\u045b\5\u00b2Z\16"+
		"\u0449\u044a\7\u0087\2\2\u044a\u045b\5\u00b2Z\r\u044b\u044c\7~\2\2\u044c"+
		"\u045b\5\u00b2Z\f\u044d\u044e\7}\2\2\u044e\u045b\5\u00b2Z\13\u044f\u0450"+
		"\7\u00aa\2\2\u0450\u045b\5\u00b2Z\n\u0451\u045b\5\u00a6T\2\u0452\u0453"+
		"\7\u00c6\2\2\u0453\u045b\5\u00a6T\2\u0454\u045b\5\u00c6d\2\u0455\u0456"+
		"\7\u00b1\2\2\u0456\u045b\5\u00c6d\2\u0457\u045b\5\u00ba^\2\u0458\u045b"+
		"\5\u00b8]\2\u0459\u045b\5&\24\2\u045a\u0442\3\2\2\2\u045a\u0444\3\2\2"+
		"\2\u045a\u0445\3\2\2\2\u045a\u0446\3\2\2\2\u045a\u0447\3\2\2\2\u045a\u0449"+
		"\3\2\2\2\u045a\u044b\3\2\2\2\u045a\u044d\3\2\2\2\u045a\u044f\3\2\2\2\u045a"+
		"\u0451\3\2\2\2\u045a\u0452\3\2\2\2\u045a\u0454\3\2\2\2\u045a\u0455\3\2"+
		"\2\2\u045a\u0457\3\2\2\2\u045a\u0458\3\2\2\2\u045a\u0459\3\2\2\2\u045b"+
		"\u0463\3\2\2\2\u045c\u045d\f\17\2\2\u045d\u045e\7{\2\2\u045e\u0462\5\u00b2"+
		"Z\20\u045f\u0460\f\21\2\2\u0460\u0462\5\u00c8e\2\u0461\u045c\3\2\2\2\u0461"+
		"\u045f\3\2\2\2\u0462\u0465\3\2\2\2\u0463\u0461\3\2\2\2\u0463\u0464\3\2"+
		"\2\2\u0464\u00b3\3\2\2\2\u0465\u0463\3\2\2\2\u0466\u0467\7\u0100\2\2\u0467"+
		"\u0469\7\u0097\2\2\u0468\u046a\5\u00b6\\\2\u0469\u0468\3\2\2\2\u0469\u046a"+
		"\3\2\2\2\u046a\u046d\3\2\2\2\u046b\u046e\5\u00a4S\2\u046c\u046e\7\u0088"+
		"\2\2\u046d\u046b\3\2\2\2\u046d\u046c\3\2\2\2\u046d\u046e\3\2\2\2\u046e"+
		"\u046f\3\2\2\2\u046f\u0470\7\u0098\2\2\u0470\u00b5\3\2\2\2\u0471\u0472"+
		"\7\u00af\2\2\u0472\u00b7\3\2\2\2\u0473\u0474\5v<\2\u0474\u00b9\3\2\2\2"+
		"\u0475\u0476\5v<\2\u0476\u00bb\3\2\2\2\u0477\u0478\5v<\2\u0478\u00bd\3"+
		"\2\2\2\u0479\u0493\5\u00c0a\2\u047a\u0493\5\u00c2b\2\u047b\u0493\7\u00cb"+
		"\2\2\u047c\u0493\7\u00b2\2\2\u047d\u0493\7\u00be\2\2\u047e\u047f\7\u0099"+
		"\2\2\u047f\u0480\7\u0100\2\2\u0480\u0481\7\u0103\2\2\u0481\u0493\7\u009a"+
		"\2\2\u0482\u0493\7\u0107\2\2\u0483\u0493\5\u00c4c\2\u0484\u0485\7\u0100"+
		"\2\2\u0485\u0487\7\u0103\2\2\u0486\u0488\5\u00c8e\2\u0487\u0486\3\2\2"+
		"\2\u0487\u0488\3\2\2\2\u0488\u0493\3\2\2\2\u0489\u048a\t\7\2\2\u048a\u0493"+
		"\7\u0103\2\2\u048b\u048d\7\u0100\2\2\u048c\u048b\3\2\2\2\u048c\u048d\3"+
		"\2\2\2\u048d\u048e\3\2\2\2\u048e\u0490\7\u00ab\2\2\u048f\u0491\5\u00c8"+
		"e\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0493\3\2\2\2\u0492"+
		"\u0479\3\2\2\2\u0492\u047a\3\2\2\2\u0492\u047b\3\2\2\2\u0492\u047c\3\2"+
		"\2\2\u0492\u047d\3\2\2\2\u0492\u047e\3\2\2\2\u0492\u0482\3\2\2\2\u0492"+
		"\u0483\3\2\2\2\u0492\u0484\3\2\2\2\u0492\u0489\3\2\2\2\u0492\u048c\3\2"+
		"\2\2\u0493\u00bf\3\2\2\2\u0494\u0495\7\u00a2\2\2\u0495\u00c1\3\2\2\2\u0496"+
		"\u0497\7\u0104\2\2\u0497\u00c3\3\2\2\2\u0498\u0499\7\u0103\2\2\u0499\u00c5"+
		"\3\2\2\2\u049a\u049b\5v<\2\u049b\u00c7\3\2\2\2\u049c\u049d\5v<\2\u049d"+
		"\u00c9\3\2\2\2\u049e\u049f\7\u00c1\2\2\u049f\u04a0\7\u00ac\2\2\u04a0\u04a5"+
		"\5\u00ccg\2\u04a1\u04a2\7\u009d\2\2\u04a2\u04a4\5\u00ccg\2\u04a3\u04a1"+
		"\3\2\2\2\u04a4\u04a7\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6"+
		"\u00cb\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a8\u04ac\5\b\5\2\u04a9\u04ac\5\u00c2"+
		"b\2\u04aa\u04ac\5\u00a8U\2\u04ab\u04a8\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ab"+
		"\u04aa\3\2\2\2\u04ac\u04ae\3\2\2\2\u04ad\u04af\t\2\2\2\u04ae\u04ad\3\2"+
		"\2\2\u04ae\u04af\3\2\2\2\u04af\u00cd\3\2\2\2\u04b0\u04b2\7\u00db\2\2\u04b1"+
		"\u04b3\t\b\2\2\u04b2\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\3\2"+
		"\2\2\u04b4\u04b5\7\u00e8\2\2\u04b5\u04b6\5\n\6\2\u04b6\u04b9\7\u00ec\2"+
		"\2\u04b7\u04ba\5\u00d0i\2\u04b8\u04ba\5\u00dco\2\u04b9\u04b7\3\2\2\2\u04b9"+
		"\u04b8\3\2\2\2\u04ba\u00cf\3\2\2\2\u04bb\u04bd\5\6\4\2\u04bc\u04be\5H"+
		"%\2\u04bd\u04bc\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf"+
		"\u04c0\7\u0097\2\2\u04c0\u04c5\5\u00d2j\2\u04c1\u04c2\7\u009d\2\2\u04c2"+
		"\u04c4\5\u00d2j\2\u04c3\u04c1\3\2\2\2\u04c4\u04c7\3\2\2\2\u04c5\u04c3"+
		"\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c8\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c8"+
		"\u04c9\7\u0098\2\2\u04c9\u00d1\3\2\2\2\u04ca\u04cc\5\u00d4k\2\u04cb\u04cd"+
		"\t\2\2\2\u04cc\u04cb\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u00d3\3\2\2\2\u04ce"+
		"\u04d1\5\b\5\2\u04cf\u04d1\5\u00a8U\2\u04d0\u04ce\3\2\2\2\u04d0\u04cf"+
		"\3\2\2\2\u04d1\u00d5\3\2\2\2\u04d2\u04d3\7\u0097\2\2\u04d3\u04d4\5\u00d8"+
		"m\2\u04d4\u04d5\7\u0098\2\2\u04d5\u00d7\3\2\2\2\u04d6\u04d7\7f\2\2\u04d7"+
		"\u04d8\5D#\2\u04d8\u00d9\3\2\2\2\u04d9\u04da\5\16\b\2\u04da\u00db\3\2"+
		"\2\2\u04db\u04dc\5\6\4\2\u04dc\u04dd\7\u0097\2\2\u04dd\u04e2\5\"\22\2"+
		"\u04de\u04df\7\u009d\2\2\u04df\u04e1\5\"\22\2\u04e0\u04de\3\2\2\2\u04e1"+
		"\u04e4\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e5\3\2"+
		"\2\2\u04e4\u04e2\3\2\2\2\u04e5\u04e6\7\u0098\2\2\u04e6\u04e7\7\u00b3\2"+
		"\2\u04e7\u04ec\5$\23\2\u04e8\u04e9\7\u009d\2\2\u04e9\u04eb\5$\23\2\u04ea"+
		"\u04e8\3\2\2\2\u04eb\u04ee\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2"+
		"\2\2\u04ed\u04ef\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ef\u04f0\7\u00ce\2\2\u04f0"+
		"\u04f1\5\u00a8U\2\u04f1\u00dd\3\2\2\2\u04f2\u04f3\7\u00d2\2\2\u04f3\u04f4"+
		"\7\u00e8\2\2\u04f4\u04f8\5\n\6\2\u04f5\u04f6\7V\2\2\u04f6\u04f7\7\u00f9"+
		"\2\2\u04f7\u04f9\5\n\6\2\u04f8\u04f5\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9"+
		"\u00df\3\2\2\2\u04fa\u04fb\7\u00e1\2\2\u04fb\u04fc\7\u00e8\2\2\u04fc\u04fd"+
		"\5\n\6\2\u04fd\u00e1\3\2\2\2\u04fe\u0501\7\u00db\2\2\u04ff\u0500\7&\2"+
		"\2\u0500\u0502\7g\2\2\u0501\u04ff\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0503"+
		"\3\2\2\2\u0503\u0504\7\u00f8\2\2\u0504\u0505\5\6\4\2\u0505\u0506\5\u00e4"+
		"s\2\u0506\u00e3\3\2\2\2\u0507\u0508\7\u0097\2\2\u0508\u0509\5\u00e6t\2"+
		"\u0509\u050a\7\u0098\2\2\u050a\u050c\3\2\2\2\u050b\u0507\3\2\2\2\u050b"+
		"\u050c\3\2\2\2\u050c\u0511\3\2\2\2\u050d\u050e\7\u00ec\2\2\u050e\u050f"+
		"\7\u00d8\2\2\u050f\u0510\t\t\2\2\u0510\u0512\7\u00f5\2\2\u0511\u050d\3"+
		"\2\2\2\u0511\u0512\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514\5\u00eav\2"+
		"\u0514\u00e5\3\2\2\2\u0515\u051a\5\u00e8u\2\u0516\u0517\7\u009d\2\2\u0517"+
		"\u0519\5\u00e8u\2\u0518\u0516\3\2\2\2\u0519\u051c\3\2\2\2\u051a\u0518"+
		"\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u00e7\3\2\2\2\u051c\u051a\3\2\2\2\u051d"+
		"\u0522\5\u00ecw\2\u051e\u0522\5\u00f2z\2\u051f\u0522\5\u0104\u0083\2\u0520"+
		"\u0522\5\u0106\u0084\2\u0521\u051d\3\2\2\2\u0521\u051e\3\2\2\2\u0521\u051f"+
		"\3\2\2\2\u0521\u0520\3\2\2\2\u0522\u00e9\3\2\2\2\u0523\u0525\5\u010e\u0088"+
		"\2\u0524\u0523\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0528\3\2\2\2\u0526\u0527"+
		"\7\u00d4\2\2\u0527\u0529\5\u0116\u008c\2\u0528\u0526\3\2\2\2\u0528\u0529"+
		"\3\2\2\2\u0529\u00eb\3\2\2\2\u052a\u052b\5\b\5\2\u052b\u052d\5\32\16\2"+
		"\u052c\u052e\7a\2\2\u052d\u052c\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u0536"+
		"\3\2\2\2\u052f\u0532\7\u00de\2\2\u0530\u0531\7\u00ec\2\2\u0531\u0533\7"+
		"\u00be\2\2\u0532\u0530\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534\3\2\2\2"+
		"\u0534\u0537\5\u00a8U\2\u0535\u0537\5\u00eex\2\u0536\u052f\3\2\2\2\u0536"+
		"\u0535\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u053a\3\2\2\2\u0538\u0539\7\36"+
		"\2\2\u0539\u053b\5\u0108\u0085\2\u053a\u0538\3\2\2\2\u053a\u053b\3\2\2"+
		"\2\u053b\u0542\3\2\2\2\u053c\u053e\5\u00f4{\2\u053d\u053c\3\2\2\2\u053e"+
		"\u053f\3\2\2\2\u053f\u053d\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0543\3\2"+
		"\2\2\u0541\u0543\5\u0102\u0082\2\u0542\u053d\3\2\2\2\u0542\u0541\3\2\2"+
		"\2\u0542\u0543\3\2\2\2\u0543\u00ed\3\2\2\2\u0544\u054c\7\u00e6\2\2\u0545"+
		"\u054d\7\u00d3\2\2\u0546\u0547\7\u00ac\2\2\u0547\u054a\7\u00de\2\2\u0548"+
		"\u0549\7\u00ec\2\2\u0549\u054b\7\u00be\2\2\u054a\u0548\3\2\2\2\u054a\u054b"+
		"\3\2\2\2\u054b\u054d\3\2\2\2\u054c\u0545\3\2\2\2\u054c\u0546\3\2\2\2\u054d"+
		"\u054e\3\2\2\2\u054e\u054f\7\u00d4\2\2\u054f\u0551\7*\2\2\u0550\u0552"+
		"\7\u0097\2\2\u0551\u0550\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0558\3\2\2"+
		"\2\u0553\u0555\5\u00f0y\2\u0554\u0553\3\2\2\2\u0555\u0556\3\2\2\2\u0556"+
		"\u0554\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0559\3\2\2\2\u0558\u0554\3\2"+
		"\2\2\u0558\u0559\3\2\2\2\u0559\u055b\3\2\2\2\u055a\u055c\7\u0098\2\2\u055b"+
		"\u055a\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u00ef\3\2\2\2\u055d\u055e\7\u00f7"+
		"\2\2\u055e\u0562\7\u00cf\2\2\u055f\u0563\7\u0104\2\2\u0560\u0561\7\u00bb"+
		"\2\2\u0561\u0563\7t\2\2\u0562\u055f\3\2\2\2\u0562\u0560\3\2\2\2\u0563"+
		"\u0575\3\2\2\2\u0564\u0565\7,\2\2\u0565\u0566\7\u00ac\2\2\u0566\u0575"+
		"\7\u0104\2\2\u0567\u0568\7\66\2\2\u0568\u0575\7\u0104\2\2\u0569\u0575"+
		"\7A\2\2\u056a\u056b\78\2\2\u056b\u0575\7\u0104\2\2\u056c\u0575\7B\2\2"+
		"\u056d\u0575\7\22\2\2\u056e\u0575\7@\2\2\u056f\u0570\7\n\2\2\u0570\u0575"+
		"\7\u0104\2\2\u0571\u0575\7?\2\2\u0572\u0575\7\u00c1\2\2\u0573\u0575\7"+
		"D\2\2\u0574\u055d\3\2\2\2\u0574\u0564\3\2\2\2\u0574\u0567\3\2\2\2\u0574"+
		"\u0569\3\2\2\2\u0574\u056a\3\2\2\2\u0574\u056c\3\2\2\2\u0574\u056d\3\2"+
		"\2\2\u0574\u056e\3\2\2\2\u0574\u056f\3\2\2\2\u0574\u0571\3\2\2\2\u0574"+
		"\u0572\3\2\2\2\u0574\u0573\3\2\2\2\u0575\u00f1\3\2\2\2\u0576\u0578\5\b"+
		"\5\2\u0577\u0579\5\32\16\2\u0578\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579"+
		"\u057c\3\2\2\2\u057a\u057b\7\u00e6\2\2\u057b\u057d\7\u00d3\2\2\u057c\u057a"+
		"\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u057f\7\u00d4\2"+
		"\2\u057f\u0580\7\u0097\2\2\u0580\u0581\5\u00a8U\2\u0581\u0583\7\u0098"+
		"\2\2\u0582\u0584\7v\2\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584"+
		"\u0588\3\2\2\2\u0585\u0587\5\u00f4{\2\u0586\u0585\3\2\2\2\u0587\u058a"+
		"\3\2\2\2\u0588\u0586\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u00f3\3\2\2\2\u058a"+
		"\u0588\3\2\2\2\u058b\u058c\7\u00da\2\2\u058c\u058e\5X-\2\u058d\u058b\3"+
		"\2\2\2\u058d\u058e\3\2\2\2\u058e\u059b\3\2\2\2\u058f\u0591\7\u00bd\2\2"+
		"\u0590\u058f\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u059c"+
		"\7\u00be\2\2\u0593\u059c\7\u00fc\2\2\u0594\u059c\5t;\2\u0595\u059c\5\u00f6"+
		"|\2\u0596\u0597\7\u00d6\2\2\u0597\u0598\7\u0097\2\2\u0598\u0599\5\u00a8"+
		"U\2\u0599\u059a\7\u0098\2\2\u059a\u059c\3\2\2\2\u059b\u0590\3\2\2\2\u059b"+
		"\u0593\3\2\2\2\u059b\u0594\3\2\2\2\u059b\u0595\3\2\2\2\u059b\u0596\3\2"+
		"\2\2\u059c\u05a0\3\2\2\2\u059d\u059f\5\u00f8}\2\u059e\u059d\3\2\2\2\u059f"+
		"\u05a2\3\2\2\2\u05a0\u059e\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u00f5\3\2"+
		"\2\2\u05a2\u05a0\3\2\2\2\u05a3\u05a4\7\u00f1\2\2\u05a4\u05a6\5\6\4\2\u05a5"+
		"\u05a7\5\u008eH\2\u05a6\u05a5\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05af"+
		"\3\2\2\2\u05a8\u05a9\7\u00ec\2\2\u05a9\u05ad\7\u00df\2\2\u05aa\u05ae\7"+
		"\u00d5\2\2\u05ab\u05ac\7\u00c7\2\2\u05ac\u05ae\7\u00be\2\2\u05ad\u05aa"+
		"\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ae\u05b0\3\2\2\2\u05af\u05a8\3\2\2\2\u05af"+
		"\u05b0\3\2\2\2\u05b0\u00f7\3\2\2\2\u05b1\u05bc\5\u00fa~\2\u05b2\u05bc"+
		"\5\u00fc\177\2\u05b3\u05bc\7T\2\2\u05b4\u05bc\7E\2\2\u05b5\u05bc\5\u0100"+
		"\u0081\2\u05b6\u05bc\7\u00e2\2\2\u05b7\u05bc\7\u00e0\2\2\u05b8\u05bc\7"+
		"s\2\2\u05b9\u05bc\7F\2\2\u05ba\u05bc\5\u00fe\u0080\2\u05bb\u05b1\3\2\2"+
		"\2\u05bb\u05b2\3\2\2\2\u05bb\u05b3\3\2\2\2\u05bb\u05b4\3\2\2\2\u05bb\u05b5"+
		"\3\2\2\2\u05bb\u05b6\3\2\2\2\u05bb\u05b7\3\2\2\2\u05bb\u05b8\3\2\2\2\u05bb"+
		"\u05b9\3\2\2\2\u05bb\u05ba\3\2\2\2\u05bc\u00f9\3\2\2\2\u05bd\u05bf\7\u00bd"+
		"\2\2\u05be\u05bd\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0"+
		"\u05c1\7\25\2\2\u05c1\u00fb\3\2\2\2\u05c2\u05c3\7-\2\2\u05c3\u05c4\t\n"+
		"\2\2\u05c4\u00fd\3\2\2\2\u05c5\u05c6\7\"\2\2\u05c6\u05c7\7/\2\2\u05c7"+
		"\u00ff\3\2\2\2\u05c8\u05c9\7r\2\2\u05c9\u05cf\7\u00e8\2\2\u05ca\u05d0"+
		"\5\n\6\2\u05cb\u05cc\7\u0097\2\2\u05cc\u05cd\5\u00ceh\2\u05cd\u05ce\7"+
		"\u0098\2\2\u05ce\u05d0\3\2\2\2\u05cf\u05ca\3\2\2\2\u05cf\u05cb\3\2\2\2"+
		"\u05cf\u05d0\3\2\2\2\u05d0\u0101\3\2\2\2\u05d1\u05d2\7^\2\2\u05d2\u05d3"+
		"\7\u00b8\2\2\u05d3\u05e2\5\6\4\2\u05d4\u05d5\7\u00cf\2\2\u05d5\u05e2\7"+
		"[\2\2\u05d6\u05d7\7\u00da\2\2\u05d7\u05d9\5X-\2\u05d8\u05d6\3\2\2\2\u05d8"+
		"\u05d9\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05de\5\u00f6|\2\u05db\u05dd"+
		"\5\u00f8}\2\u05dc\u05db\3\2\2\2\u05dd\u05e0\3\2\2\2\u05de\u05dc\3\2\2"+
		"\2\u05de\u05df\3\2\2\2\u05df\u05e2\3\2\2\2\u05e0\u05de\3\2\2\2\u05e1\u05d1"+
		"\3\2\2\2\u05e1\u05d4\3\2\2\2\u05e1\u05d8\3\2\2\2\u05e2\u0103\3\2\2\2\u05e3"+
		"\u05e4\7\u00da\2\2\u05e4\u05e6\5X-\2\u05e5\u05e3\3\2\2\2\u05e5\u05e6\3"+
		"\2\2\2\u05e6\u05f6\3\2\2\2\u05e7\u05e8\7\u00fc\2\2\u05e8\u05f7\5\u008e"+
		"H\2\u05e9\u05ea\5t;\2\u05ea\u05eb\5\u008eH\2\u05eb\u05f7\3\2\2\2\u05ec"+
		"\u05ed\7\u00e4\2\2\u05ed\u05ee\7\u00b9\2\2\u05ee\u05ef\5\u008eH\2\u05ef"+
		"\u05f0\5\u00f6|\2\u05f0\u05f7\3\2\2\2\u05f1\u05f2\7\u00d6\2\2\u05f2\u05f3"+
		"\7\u0097\2\2\u05f3\u05f4\5\u00a8U\2\u05f4\u05f5\7\u0098\2\2\u05f5\u05f7"+
		"\3\2\2\2\u05f6\u05e7\3\2\2\2\u05f6\u05e9\3\2\2\2\u05f6\u05ec\3\2\2\2\u05f6"+
		"\u05f1\3\2\2\2\u05f7\u05fb\3\2\2\2\u05f8\u05fa\5\u00f8}\2\u05f9\u05f8"+
		"\3\2\2\2\u05fa\u05fd\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc"+
		"\u0105\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fe\u05ff\7^\2\2\u05ff\u0600\7\u00e3"+
		"\2\2\u0600\u0601\7\u0097\2\2\u0601\u0602\5\24\13\2\u0602\u0603\7\u0098"+
		"\2\2\u0603\u0604\7\u00b8\2\2\u0604\u0605\5\6\4\2\u0605\u061c\3\2\2\2\u0606"+
		"\u0607\7R\2\2\u0607\u0608\7\u0097\2\2\u0608\u0609\5\24\13\2\u0609\u060a"+
		"\7\u0098\2\2\u060a\u060b\7\u00cf\2\2\u060b\u060c\7[\2\2\u060c\u061c\3"+
		"\2\2\2\u060d\u060e\7\u00da\2\2\u060e\u0610\5X-\2\u060f\u060d\3\2\2\2\u060f"+
		"\u0610\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0612\7\u00e4\2\2\u0612\u0613"+
		"\7\u00b9\2\2\u0613\u0614\5\30\r\2\u0614\u0618\5\u00f6|\2\u0615\u0617\5"+
		"\u00f8}\2\u0616\u0615\3\2\2\2\u0617\u061a\3\2\2\2\u0618\u0616\3\2\2\2"+
		"\u0618\u0619\3\2\2\2\u0619\u061c\3\2\2\2\u061a\u0618\3\2\2\2\u061b\u05fe"+
		"\3\2\2\2\u061b\u0606\3\2\2\2\u061b\u060f\3\2\2\2\u061c\u0107\3\2\2\2\u061d"+
		"\u061e\7r\2\2\u061e\u0620\7\u0103\2\2\u061f\u061d\3\2\2\2\u061f\u0620"+
		"\3\2\2\2\u0620\u0624\3\2\2\2\u0621\u0622\7)\2\2\u0622\u0623\7\u00ac\2"+
		"\2\u0623\u0625\7\u0103\2\2\u0624\u0621\3\2\2\2\u0624\u0625\3\2\2\2\u0625"+
		"\u0627\3\2\2\2\u0626\u0628\7\u0103\2\2\u0627\u0626\3\2\2\2\u0627\u0628"+
		"\3\2\2\2\u0628\u062d\3\2\2\2\u0629\u062b\7\u00eb\2\2\u062a\u0629\3\2\2"+
		"\2\u062a\u062b\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062e\7\\\2\2\u062d\u062a"+
		"\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u0109\3\2\2\2\u062f\u0634\5\u010c\u0087"+
		"\2\u0630\u0631\7\u009d\2\2\u0631\u0633\5\u010c\u0087\2\u0632\u0630\3\2"+
		"\2\2\u0633\u0636\3\2\2\2\u0634\u0632\3\2\2\2\u0634\u0635\3\2\2\2\u0635"+
		"\u010b\3\2\2\2\u0636\u0634\3\2\2\2\u0637\u063a\5\b\5\2\u0638\u063a\5\f"+
		"\7\2\u0639\u0637\3\2\2\2\u0639\u0638\3\2\2\2\u063a\u063d\3\2\2\2\u063b"+
		"\u063c\7\u00de\2\2\u063c\u063e\5\u00a8U\2\u063d\u063b\3\2\2\2\u063d\u063e"+
		"\3\2\2\2\u063e\u0648\3\2\2\2\u063f\u0641\5\u00f4{\2\u0640\u063f\3\2\2"+
		"\2\u0641\u0644\3\2\2\2\u0642\u0640\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0649"+
		"\3\2\2\2\u0644\u0642\3\2\2\2\u0645\u0647\5\u0102\u0082\2\u0646\u0645\3"+
		"\2\2\2\u0646\u0647\3\2\2\2\u0647\u0649\3\2\2\2\u0648\u0642\3\2\2\2\u0648"+
		"\u0646\3\2\2\2\u0649\u064d\3\2\2\2\u064a\u064d\5\u0104\u0083\2\u064b\u064d"+
		"\5\u0106\u0084\2\u064c\u0639\3\2\2\2\u064c\u064a\3\2\2\2\u064c\u064b\3"+
		"\2\2\2\u064d\u010d\3\2\2\2\u064e\u0650\5\u0110\u0089\2\u064f\u064e\3\2"+
		"\2\2\u0650\u0651\3\2\2\2\u0651\u064f\3\2\2\2\u0651\u0652\3\2\2\2\u0652"+
		"\u010f\3\2\2\2\u0653\u0654\5\u0112\u008a\2\u0654\u0111\3\2\2\2\u0655\u0656"+
		"\7\u00d7\2\2\u0656\u0657\5\b\5\2\u0657\u0658\5\u0114\u008b\2\u0658\u0113"+
		"\3\2\2\2\u0659\u065b\7\34\2\2\u065a\u0659\3\2\2\2\u065a\u065b\3\2\2\2"+
		"\u065b\u065c\3\2\2\2\u065c\u065d\7\u00b8\2\2\u065d\u065f\7H\2\2\u065e"+
		"\u0660\7l\2\2\u065f\u065e\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u0661\3\2"+
		"\2\2\u0661\u0663\7\u0097\2\2\u0662\u0664\7I\2\2\u0663\u0662\3\2\2\2\u0663"+
		"\u0664\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0666\5\34\17\2\u0666\u0667\7"+
		"\u0098\2\2\u0667\u0670\3\2\2\2\u0668\u066a\7\u00bd\2\2\u0669\u0668\3\2"+
		"\2\2\u0669\u066a\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u066c\7e\2\2\u066c"+
		"\u066d\7\6\2\2\u066d\u066e\7\u00a5\2\2\u066e\u0670\7\63\2\2\u066f\u065a"+
		"\3\2\2\2\u066f\u0669\3\2\2\2\u0670\u0115\3\2\2\2\u0671\u0679\5\u0118\u008d"+
		"\2\u0672\u0674\7\u00cc\2\2\u0673\u0675\7\u00a5\2\2\u0674\u0673\3\2\2\2"+
		"\u0674\u0675\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0678\5\u0118\u008d\2\u0677"+
		"\u0672\3\2\2\2\u0678\u067b\3\2\2\2\u0679\u0677\3\2\2\2\u0679\u067a\3\2"+
		"\2\2\u067a\u0117\3\2\2\2\u067b\u0679\3\2\2\2\u067c\u067d\3\2\2\2\u067d"+
		"\u0119\3\2\2\2\u067e\u067f\7\u00b3\2\2\u067f\u0680\5\u012c\u0097\2\u0680"+
		"\u011b\3\2\2\2\u0681\u0682\7\u00ce\2\2\u0682\u0683\5\u00a8U\2\u0683\u011d"+
		"\3\2\2\2\u0684\u0685\7\u00b4\2\2\u0685\u0686\7\u00ac\2\2\u0686\u068b\5"+
		"\u00ccg\2\u0687\u0688\7\u009d\2\2\u0688\u068a\5\u00ccg\2\u0689\u0687\3"+
		"\2\2\2\u068a\u068d\3\2\2\2\u068b\u0689\3\2\2\2\u068b\u068c\3\2\2\2\u068c"+
		"\u0690\3\2\2\2\u068d\u068b\3\2\2\2\u068e\u068f\7\u00cf\2\2\u068f\u0691"+
		"\7\u00c5\2\2\u0690\u068e\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u011f\3\2\2"+
		"\2\u0692\u0693\7\u00b5\2\2\u0693\u0694\5\u00a8U\2\u0694\u0121\3\2\2\2"+
		"\u0695\u0696\7\u00bb\2\2\u0696\u0697\5|?\2\u0697\u0123\3\2\2\2\u0698\u0699"+
		"\7\u00c2\2\2\u0699\u069a\5z>\2\u069a\u0125\3\2\2\2\u069b\u069e\5\u0128"+
		"\u0095\2\u069c\u069e\5\u012a\u0096\2\u069d\u069b\3\2\2\2\u069d\u069c\3"+
		"\2\2\2\u069e\u06a3\3\2\2\2\u069f\u06a0\7\u009d\2\2\u06a0\u06a2\5\u012a"+
		"\u0096\2\u06a1\u069f\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a3"+
		"\u06a4\3\2\2\2\u06a4\u0127\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a6\u06a7\7\u0088"+
		"\2\2\u06a7\u0129\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u012b\3\2\2\2\u06aa"+
		"\u06ab\3\2\2\2\u06ab\u012d\3\2\2\2\u06ac\u06ad\7\u00d2\2\2\u06ad\u06ae"+
		"\7\u00f8\2\2\u06ae\u06b3\5\6\4\2\u06af\u06b4\5\u0130\u0099\2\u06b0\u06b4"+
		"\5\u0134\u009b\2\u06b1\u06b4\5\u0150\u00a9\2\u06b2\u06b4\5\u0160\u00b1"+
		"\2\u06b3\u06af\3\2\2\2\u06b3\u06b0\3\2\2\2\u06b3\u06b1\3\2\2\2\u06b3\u06b2"+
		"\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u012f\3\2\2\2\u06b5\u06b9\5\u0132\u009a"+
		"\2\u06b6\u06b7\7S\2\2\u06b7\u06b9\5\u0108\u0085\2\u06b8\u06b5\3\2\2\2"+
		"\u06b8\u06b6\3\2\2\2\u06b9\u0131\3\2\2\2\u06ba\u06bb\7V\2\2\u06bb\u06bc"+
		"\7\u00f9\2\2\u06bc\u06bd\5\6\4\2\u06bd\u0133\3\2\2\2\u06be\u06c0\5\u0136"+
		"\u009c\2\u06bf\u06be\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06bf\3\2\2\2\u06c1"+
		"\u06c2\3\2\2\2\u06c2\u06c5\3\2\2\2\u06c3\u06c5\5\u014e\u00a8\2\u06c4\u06bf"+
		"\3\2\2\2\u06c4\u06c3\3\2\2\2\u06c5\u0135\3\2\2\2\u06c6\u06ca\5\u0138\u009d"+
		"\2\u06c7\u06ca\5\u013e\u00a0\2\u06c8\u06ca\5\u0144\u00a3\2\u06c9\u06c6"+
		"\3\2\2\2\u06c9\u06c7\3\2\2\2\u06c9\u06c8\3\2\2\2\u06ca\u0137\3\2\2\2\u06cb"+
		"\u06cc\7\u00d1\2\2\u06cc\u06ce\5\u013a\u009e\2\u06cd\u06cf\5\u010e\u0088"+
		"\2\u06ce\u06cd\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf\u0139\3\2\2\2\u06d0\u06d1"+
		"\7\u0097\2\2\u06d1\u06d6\5\u013c\u009f\2\u06d2\u06d3\7\u009d\2\2\u06d3"+
		"\u06d5\5\u013c\u009f\2\u06d4\u06d2\3\2\2\2\u06d5\u06d8\3\2\2\2\u06d6\u06d4"+
		"\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06d9\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d9"+
		"\u06da\7\u0098\2\2\u06da\u06dd\3\2\2\2\u06db\u06dd\5\u013c\u009f\2\u06dc"+
		"\u06d0\3\2\2\2\u06dc\u06db\3\2\2\2\u06dd\u013b\3\2\2\2\u06de\u06e1\5\u00ec"+
		"w\2\u06df\u06e1\5\u00f2z\2\u06e0\u06de\3\2\2\2\u06e0\u06df\3\2\2\2\u06e1"+
		"\u013d\3\2\2\2\u06e2\u06f2\7:\2\2\u06e3\u06e5\7\u0097\2\2\u06e4\u06e3"+
		"\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06eb\5\u0140\u00a1"+
		"\2\u06e7\u06e8\7\u009d\2\2\u06e8\u06ea\5\u0140\u00a1\2\u06e9\u06e7\3\2"+
		"\2\2\u06ea\u06ed\3\2\2\2\u06eb\u06e9\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec"+
		"\u06ef\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ee\u06f0\7\u0098\2\2\u06ef\u06ee"+
		"\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f3\3\2\2\2\u06f1\u06f3\5\u0142\u00a2"+
		"\2\u06f2\u06e4\3\2\2\2\u06f2\u06f1\3\2\2\2\u06f3\u013f\3\2\2\2\u06f4\u06f6"+
		"\5\b\5\2\u06f5\u06f7\5\32\16\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7\3\2\2\2"+
		"\u06f7\u06fa\3\2\2\2\u06f8\u06f9\7\u00de\2\2\u06f9\u06fb\5\u00a8U\2\u06fa"+
		"\u06f8\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06ff\3\2\2\2\u06fc\u06fd\7\36"+
		"\2\2\u06fd\u0700\5\u0108\u0085\2\u06fe\u0700\7\24\2\2\u06ff\u06fc\3\2"+
		"\2\2\u06ff\u06fe\3\2\2\2\u06ff\u0700\3\2\2\2\u0700\u0704\3\2\2\2\u0701"+
		"\u0703\5\u00f4{\2\u0702\u0701\3\2\2\2\u0703\u0706\3\2\2\2\u0704\u0702"+
		"\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0141\3\2\2\2\u0706\u0704\3\2\2\2\u0707"+
		"\u0708\7\u00d7\2\2\u0708\u070a\5\b\5\2\u0709\u070b\7\u00bd\2\2\u070a\u0709"+
		"\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u070d\7e\2\2\u070d"+
		"\u070e\7\6\2\2\u070e\u070f\7\u00a5\2\2\u070f\u0711\7\63\2\2\u0710\u0712"+
		"\7%\2\2\u0711\u0710\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0143\3\2\2\2\u0713"+
		"\u0714\7\u00c7\2\2\u0714\u0715\7o\2\2\u0715\u0719\5\u0148\u00a5\2\u0716"+
		"\u0718\5\u014a\u00a6\2\u0717\u0716\3\2\2\2\u0718\u071b\3\2\2\2\u0719\u0717"+
		"\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071e\3\2\2\2\u071b\u0719\3\2\2\2\u071c"+
		"\u071e\5\u0146\u00a4\2\u071d\u0713\3\2\2\2\u071d\u071c\3\2\2\2\u071e\u0145"+
		"\3\2\2\2\u071f\u0720\7\u00e1\2\2\u0720\u0724\5\u0148\u00a5\2\u0721\u0723"+
		"\5\u014a\u00a6\2\u0722\u0721\3\2\2\2\u0723\u0726\3\2\2\2\u0724\u0722\3"+
		"\2\2\2\u0724\u0725\3\2\2\2\u0725\u0728\3\2\2\2\u0726\u0724\3\2\2\2\u0727"+
		"\u0729\5\u014c\u00a7\2\u0728\u0727\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u0147"+
		"\3\2\2\2\u072a\u072b\7\u00d7\2\2\u072b\u0738\5\b\5\2\u072c\u072d\7\u0097"+
		"\2\2\u072d\u0732\5\b\5\2\u072e\u072f\7\u009d\2\2\u072f\u0731\5\b\5\2\u0730"+
		"\u072e\3\2\2\2\u0731\u0734\3\2\2\2\u0732\u0730\3\2\2\2\u0732\u0733\3\2"+
		"\2\2\u0733\u0735\3\2\2\2\u0734\u0732\3\2\2\2\u0735\u0736\7\u0098\2\2\u0736"+
		"\u0738\3\2\2\2\u0737\u072a\3\2\2\2\u0737\u072c\3\2\2\2\u0738\u0149\3\2"+
		"\2\2\u0739\u073a\7\u00d5\2\2\u073a\u073d\7\17\2\2\u073b\u073d\7\60\2\2"+
		"\u073c\u0739\3\2\2\2\u073c\u073b\3\2\2\2\u073d\u014b\3\2\2\2\u073e\u073f"+
		"\7\f\2\2\u073f\u0740\7\u0104\2\2\u0740\u014d\3\2\2\2\u0741\u0742\7V\2"+
		"\2\u0742\u0743\7\u00d7\2\2\u0743\u0744\5\b\5\2\u0744\u0745\7\u00f9\2\2"+
		"\u0745\u0746\5\b\5\2\u0746\u014f\3\2\2\2\u0747\u0750\5\u0152\u00aa\2\u0748"+
		"\u0750\5\u0154\u00ab\2\u0749\u0750\5\u015c\u00af\2\u074a\u074c\5\u015e"+
		"\u00b0\2\u074b\u074a\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u074b\3\2\2\2\u074d"+
		"\u074e\3\2\2\2\u074e\u0750\3\2\2\2\u074f\u0747\3\2\2\2\u074f\u0748\3\2"+
		"\2\2\u074f\u0749\3\2\2\2\u074f\u074b\3\2\2\2\u0750\u0151\3\2\2\2\u0751"+
		"\u0758\7\u00d1\2\2\u0752\u0754\5\u0104\u0083\2\u0753\u0752\3\2\2\2\u0754"+
		"\u0755\3\2\2\2\u0755\u0753\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0759\3\2"+
		"\2\2\u0757\u0759\5\u0106\u0084\2\u0758\u0753\3\2\2\2\u0758\u0757\3\2\2"+
		"\2\u0759\u0153\3\2\2\2\u075a\u075b\7:\2\2\u075b\u075d\5\u0158\u00ad\2"+
		"\u075c\u075e\5\u00f8}\2\u075d\u075c\3\2\2\2\u075e\u075f\3\2\2\2\u075f"+
		"\u075d\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0762\3\2\2\2\u0761\u0763\7\u00d5"+
		"\2\2\u0762\u0761\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0155\3\2\2\2\u0764"+
		"\u0765\7\u00da\2\2\u0765\u0766\5X-\2\u0766\u0157\3\2\2\2\u0767\u076a\5"+
		"\u0156\u00ac\2\u0768\u076a\5\u015a\u00ae\2\u0769\u0767\3\2\2\2\u0769\u0768"+
		"\3\2\2\2\u076a\u0159\3\2\2\2\u076b\u076f\5t;\2\u076c\u076d\7\u00fc\2\2"+
		"\u076d\u076f\5\u008eH\2\u076e\u076b\3\2\2\2\u076e\u076c\3\2\2\2\u076f"+
		"\u015b\3\2\2\2\u0770\u0771\7V\2\2\u0771\u0772\5\u0156\u00ac\2\u0772\u0773"+
		"\7\u00f9\2\2\u0773\u0774\5X-\2\u0774\u015d\3\2\2\2\u0775\u0783\7\u00e1"+
		"\2\2\u0776\u0778\5\u015a\u00ae\2\u0777\u0779\7\u00d5\2\2\u0778\u0777\3"+
		"\2\2\2\u0778\u0779\3\2\2\2\u0779\u077c\3\2\2\2\u077a\u077b\t\13\2\2\u077b"+
		"\u077d\7\u00e8\2\2\u077c\u077a\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u0784"+
		"\3\2\2\2\u077e\u077f\7\u00da\2\2\u077f\u0781\5X-\2\u0780\u0782\7\u00d5"+
		"\2\2\u0781\u0780\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u0784\3\2\2\2\u0783"+
		"\u0776\3\2\2\2\u0783\u077e\3\2\2\2\u0784\u015f\3\2\2\2\u0785\u0789\5\u0138"+
		"\u009d\2\u0786\u0789\5\u013e\u00a0\2\u0787\u0789\5\u0146\u00a4\2\u0788"+
		"\u0785\3\2\2\2\u0788\u0786\3\2\2\2\u0788\u0787\3\2\2\2\u0789\u078a\3\2"+
		"\2\2\u078a\u0788\3\2\2\2\u078a\u078b\3\2\2\2\u078b\u0161\3\2\2\2\u078c"+
		"\u078d\7\u00e1\2\2\u078d\u078e\7\u00f8\2\2\u078e\u078f\5\6\4\2\u078f\u0163"+
		"\3\2\2\2\u0790\u0791\7\u00fb\2\2\u0791\u0792\7\u00f8\2\2\u0792\u0793\5"+
		"\6\4\2\u0793\u0165\3\2\2\2\u0794\u0795\7\u00c7\2\2\u0795\u07a3\7\u00fa"+
		"\2\2\u0796\u0797\7\u00f0\2\2\u0797\u07a4\t\f\2\2\u0798\u0799\7\u00e9\2"+
		"\2\u0799\u079d\7\u00ea\2\2\u079a\u079e\7\u00f6\2\2\u079b\u079c\7\u00f0"+
		"\2\2\u079c\u079e\7\u00d9\2\2\u079d\u079a\3\2\2\2\u079d\u079b\3\2\2\2\u079e"+
		"\u07a4\3\2\2\2\u079f\u07a0\7p\2\2\u07a0\u07a1\7\u00f4\2\2\u07a1\u07a2"+
		"\7`\2\2\u07a2\u07a4\7\u0100\2\2\u07a3\u0796\3\2\2\2\u07a3\u0798\3\2\2"+
		"\2\u07a3\u079f\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a8\3\2\2\2\u07a5\u07a6"+
		"\7<\2\2\u07a6\u07a8\7\u0103\2\2\u07a7\u0794\3\2\2\2\u07a7\u07a5\3\2\2"+
		"\2\u07a8\u0167\3\2\2\2\u07a9\u07ab\7\u00d8\2\2\u07aa\u07ac\7\u00fe\2\2"+
		"\u07ab\u07aa\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07c0\3\2\2\2\u07ad\u07ae"+
		"\7\r\2\2\u07ae\u07b0\7\u0103\2\2\u07af\u07ad\3\2\2\2\u07af\u07b0\3\2\2"+
		"\2\u07b0\u07c1\3\2\2\2\u07b1\u07b3\7y\2\2\u07b2\u07b4\t\r\2\2\u07b3\u07b2"+
		"\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b6\3\2\2\2\u07b5\u07b7\t\16\2\2"+
		"\u07b6\u07b5\3\2\2\2\u07b6\u07b7\3\2\2\2\u07b7\u07b9\3\2\2\2\u07b8\u07b1"+
		"\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07c1\3\2\2\2\u07ba\u07bb\7%\2\2\u07bb"+
		"\u07be\7\u0103\2\2\u07bc\u07bd\7\u009d\2\2\u07bd\u07bf\7\u0104\2\2\u07be"+
		"\u07bc\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c1\3\2\2\2\u07c0\u07af\3\2"+
		"\2\2\u07c0\u07b8\3\2\2\2\u07c0\u07ba\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1"+
		"\u0169\3\2\2\2\u07c2\u07c4\7\u00f4\2\2\u07c3\u07c5\7\u00fe\2\2\u07c4\u07c3"+
		"\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07cd\3\2\2\2\u07c6\u07c8\7\u00f9\2"+
		"\2\u07c7\u07c9\7]\2\2\u07c8\u07c7\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07ca"+
		"\3\2\2\2\u07ca\u07ce\7\u0100\2\2\u07cb\u07cc\7%\2\2\u07cc\u07ce\7\u0103"+
		"\2\2\u07cd\u07c6\3\2\2\2\u07cd\u07cb\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce"+
		"\u016b\3\2\2\2\u07cf\u07d0\7]\2\2\u07d0\u07d1\7\u0100\2\2\u07d1\u016d"+
		"\3\2\2\2\u07d2\u07dd\7\u00e7\2\2\u07d3\u07d6\5\u0170\u00b9\2\u07d4\u07d6"+
		"\5\u017c\u00bf\2\u07d5\u07d3\3\2\2\2\u07d5\u07d4\3\2\2\2\u07d6\u07da\3"+
		"\2\2\2\u07d7\u07d8\7\20\2\2\u07d8\u07d9\7\u008f\2\2\u07d9\u07db\t\17\2"+
		"\2\u07da\u07d7\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u07de\3\2\2\2\u07dc\u07de"+
		"\5\u0184\u00c3\2\u07dd\u07d5\3\2\2\2\u07dd\u07dc\3\2\2\2\u07de\u016f\3"+
		"\2\2\2\u07df\u07e0\5\u0172\u00ba\2\u07e0\u07e3\7\u00f9\2\2\u07e1\u07e4"+
		"\5\u0176\u00bc\2\u07e2\u07e4\5\u017a\u00be\2\u07e3\u07e1\3\2\2\2\u07e3"+
		"\u07e2\3\2\2\2\u07e4\u07e8\3\2\2\2\u07e5\u07e6\7\u00cf\2\2\u07e6\u07e7"+
		"\t\20\2\2\u07e7\u07e9\7\u00ed\2\2\u07e8\u07e5\3\2\2\2\u07e8\u07e9\3\2"+
		"\2\2\u07e9\u0171\3\2\2\2\u07ea\u07ef\5\u0174\u00bb\2\u07eb\u07ec\7\u009d"+
		"\2\2\u07ec\u07ee\5\u0174\u00bb\2\u07ed\u07eb\3\2\2\2\u07ee\u07f1\3\2\2"+
		"\2\u07ef\u07ed\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u0173\3\2\2\2\u07f1\u07ef"+
		"\3\2\2\2\u07f2\u07f3\7\u00a5\2\2\u07f3\u07fc\7\u00ef\2\2\u07f4\u07fc\5"+
		"f\64\2\u07f5\u07f7\7\u0100\2\2\u07f6\u07f5\3\2\2\2\u07f7\u07fa\3\2\2\2"+
		"\u07f8\u07f9\3\2\2\2\u07f8\u07f6\3\2\2\2\u07f9\u07fc\3\2\2\2\u07fa\u07f8"+
		"\3\2\2\2\u07fb\u07f2\3\2\2\2\u07fb\u07f4\3\2\2\2\u07fb\u07f8\3\2\2\2\u07fc"+
		"\u0175\3\2\2\2\u07fd\u0802\5\u0178\u00bd\2\u07fe\u07ff\7\u009d\2\2\u07ff"+
		"\u0801\5\u0178\u00bd\2\u0800\u07fe\3\2\2\2\u0801\u0804\3\2\2\2\u0802\u0800"+
		"\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0177\3\2\2\2\u0804\u0802\3\2\2\2\u0805"+
		"\u0809\5n8\2\u0806\u0809\5f\64\2\u0807\u0809\7P\2\2\u0808\u0805\3\2\2"+
		"\2\u0808\u0806\3\2\2\2\u0808\u0807\3\2\2\2\u0809\u0179\3\2\2\2\u080a\u080b"+
		"\5\u009eP\2\u080b\u080c\7)\2\2\u080c\u080d\7\u00ac\2\2\u080d\u0812\7\u0103"+
		"\2\2\u080e\u080f\7\u009d\2\2\u080f\u0811\7\u0103\2\2\u0810\u080e\3\2\2"+
		"\2\u0811\u0814\3\2\2\2\u0812\u0810\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u017b"+
		"\3\2\2\2\u0814\u0812\3\2\2\2\u0815\u081a\5\u017e\u00c0\2\u0816\u0817\7"+
		"\u009d\2\2\u0817\u0819\5\u017e\u00c0\2\u0818\u0816\3\2\2\2\u0819\u081c"+
		"\3\2\2\2\u081a\u0818\3\2\2\2\u081a\u081b\3\2\2\2\u081b\u081d\3\2\2\2\u081c"+
		"\u081a\3\2\2\2\u081d\u081e\5\u0182\u00c2\2\u081e\u081f\7\u00f9\2\2\u081f"+
		"\u0823\5\u0176\u00bc\2\u0820\u0821\7\u00cf\2\2\u0821\u0822\7(\2\2\u0822"+
		"\u0824\7\u00ed\2\2\u0823\u0820\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0828"+
		"\3\2\2\2\u0825\u0826\7\u00cf\2\2\u0826\u0827\7\u00e7\2\2\u0827\u0829\7"+
		"\u00ed\2\2\u0828\u0825\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u017d\3\2\2\2"+
		"\u082a\u082c\5\u0180\u00c1\2\u082b\u082d\5\u008eH\2\u082c\u082b\3\2\2"+
		"\2\u082c\u082d\3\2\2\2\u082d\u017f\3\2\2\2\u082e\u0830\7\u0100\2\2\u082f"+
		"\u082e\3\2\2\2\u0830\u0833\3\2\2\2\u0831\u0832\3\2\2\2\u0831\u082f\3\2"+
		"\2\2\u0832\u0839\3\2\2\2\u0833\u0831\3\2\2\2\u0834\u0836\7\u00a5\2\2\u0835"+
		"\u0837\7\u00ef\2\2\u0836\u0835\3\2\2\2\u0836\u0837\3\2\2\2\u0837\u0839"+
		"\3\2\2\2\u0838\u0831\3\2\2\2\u0838\u0834\3\2\2\2\u0839\u0181\3\2\2\2\u083a"+
		"\u0851\7\u00ec\2\2\u083b\u0852\5\6\4\2\u083c\u083d\7\u00fd\2\2\u083d\u0842"+
		"\5n8\2\u083e\u083f\7\u009d\2\2\u083f\u0841\5n8\2\u0840\u083e\3\2\2\2\u0841"+
		"\u0844\3\2\2\2\u0842\u0840\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0852\3\2"+
		"\2\2\u0844\u0842\3\2\2\2\u0845\u084f\7\30\2\2\u0846\u084f\7\32\2\2\u0847"+
		"\u0848\7\67\2\2\u0848\u084f\79\2\2\u0849\u084a\7\61\2\2\u084a\u084f\t"+
		"\21\2\2\u084b\u084c\7c\2\2\u084c\u084d\7j\2\2\u084d\u084f\7O\2\2\u084e"+
		"\u0845\3\2\2\2\u084e\u0846\3\2\2\2\u084e\u0847\3\2\2\2\u084e\u0849\3\2"+
		"\2\2\u084e\u084b\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0852\5\6\4\2\u0851"+
		"\u083b\3\2\2\2\u0851\u083c\3\2\2\2\u0851\u084e\3\2\2\2\u0852\u0183\3\2"+
		"\2\2\u0853\u0854\5\u009cO\2\u0854\u0855\7\u00f9\2\2\u0855\u0856\5\u0186"+
		"\u00c4\2\u0856\u0185\3\2\2\2\u0857\u085c\5\u0188\u00c5\2\u0858\u0859\7"+
		"\u009d\2\2\u0859\u085b\5\u0188\u00c5\2\u085a\u0858\3\2\2\2\u085b\u085e"+
		"\3\2\2\2\u085c\u085a\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u0187\3\2\2\2\u085e"+
		"\u085c\3\2\2\2\u085f\u0860\t\22\2\2\u0860\u0861\5\6\4\2\u0861\u0189\3"+
		"\2\2\2\u0862\u086d\7\u00f2\2\2\u0863\u0866\5\u018c\u00c7\2\u0864\u0866"+
		"\5\u018e\u00c8\2\u0865\u0863\3\2\2\2\u0865\u0864\3\2\2\2\u0866\u086a\3"+
		"\2\2\2\u0867\u0868\7\20\2\2\u0868\u0869\7\u008f\2\2\u0869\u086b\t\17\2"+
		"\2\u086a\u0867\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u086e\3\2\2\2\u086c\u086e"+
		"\5\u0190\u00c9\2\u086d\u0865\3\2\2\2\u086d\u086c\3\2\2\2\u086e\u018b\3"+
		"\2\2\2\u086f\u0870\5\u0172\u00ba\2\u0870\u0871\7\u00b3\2\2\u0871\u018d"+
		"\3\2\2\2\u0872\u0877\5\u0180\u00c1\2\u0873\u0874\7\u009d\2\2\u0874\u0876"+
		"\5\u0180\u00c1\2\u0875\u0873\3\2\2\2\u0876\u0879\3\2\2\2\u0877\u0875\3"+
		"\2\2\2\u0877\u0878\3\2\2\2\u0878\u087a\3\2\2\2\u0879\u0877\3\2\2\2\u087a"+
		"\u087b\5\u0182\u00c2\2\u087b\u087c\7\u00b3\2\2\u087c\u0880\5\u0176\u00bc"+
		"\2\u087d\u087e\7\u00d5\2\2\u087e\u0881\7\17\2\2\u087f\u0881\7%\2\2\u0880"+
		"\u087d\3\2\2\2\u0880\u087f\3\2\2\2\u0880\u0881\3\2\2\2\u0881\u018f\3\2"+
		"\2\2\u0882\u0885\5\u009cO\2\u0883\u0885\7\u00a5\2\2\u0884\u0882\3\2\2"+
		"\2\u0884\u0883\3\2\2\2\u0885\u0886\3\2\2\2\u0886\u0887\7\u00b3\2\2\u0887"+
		"\u0888\5\u0186\u00c4\2\u0888\u0191\3\2\2\2\u0889\u088a\7\u00db\2\2\u088a"+
		"\u088b\7\u00fd\2\2\u088b\u088c\5n8\2\u088c\u0894\7)\2\2\u088d\u088e\7"+
		"\u00ac\2\2\u088e\u0895\7\u0100\2\2\u088f\u0892\t\23\2\2\u0890\u0891\7"+
		"\u00d4\2\2\u0891\u0893\7\u0103\2\2\u0892\u0890\3\2\2\2\u0892\u0893\3\2"+
		"\2\2\u0893\u0895\3\2\2\2\u0894\u088d\3\2\2\2\u0894\u088f\3\2\2\2\u0895"+
		"\u08b0\3\2\2\2\u0896\u0897\7\u00de\2\2\u0897\u0898\7f\2\2\u0898\u08af"+
		"\7\u0100\2\2\u0899\u089a\7g\2\2\u089a\u089b\7f\2\2\u089b\u08af\7\u0100"+
		"\2\2\u089c\u089f\7Q\2\2\u089d\u08a0\5\u0194\u00cb\2\u089e\u08a0\7m\2\2"+
		"\u089f\u089d\3\2\2\2\u089f\u089e\3\2\2\2\u08a0\u08a1\3\2\2\2\u08a1\u08a2"+
		"\7\u00ec\2\2\u08a2\u08af\7\u0100\2\2\u08a3\u08a4\7O\2\2\u08a4\u08af\7"+
		"\u0100\2\2\u08a5\u08a6\7\u00ee\2\2\u08a6\u08af\7#\2\2\u08a7\u08a8\7\4"+
		"\2\2\u08a8\u08af\t\24\2\2\u08a9\u08aa\7\u00e2\2\2\u08aa\u08af\7\33\2\2"+
		"\u08ab\u08ac\7\20\2\2\u08ac\u08ad\7\u008f\2\2\u08ad\u08af\t\17\2\2\u08ae"+
		"\u0896\3\2\2\2\u08ae\u0899\3\2\2\2\u08ae\u089c\3\2\2\2\u08ae\u08a3\3\2"+
		"\2\2\u08ae\u08a5\3\2\2\2\u08ae\u08a7\3\2\2\2\u08ae\u08a9\3\2\2\2\u08ae"+
		"\u08ab\3\2\2\2\u08af\u08b2\3\2\2\2\u08b0\u08ae\3\2\2\2\u08b0\u08b1\3\2"+
		"\2\2\u08b1\u0193\3\2\2\2\u08b2\u08b0\3\2\2\2\u08b3\u08b5\7\u0104\2\2\u08b4"+
		"\u08b6\7\u0100\2\2\u08b5\u08b4\3\2\2\2\u08b5\u08b6\3\2\2\2\u08b6\u0195"+
		"\3\2\2\2\u08b7\u08b8\7\u00d2\2\2\u08b8\u08fb\7\u00fd\2\2\u08b9\u08f5\5"+
		"n8\2\u08ba\u08c6\7)\2\2\u08bb\u08bc\7\u00ac\2\2\u08bc\u08bf\7\u0100\2"+
		"\2\u08bd\u08be\7W\2\2\u08be\u08c0\7\u0103\2\2\u08bf\u08bd\3\2\2\2\u08bf"+
		"\u08c0\3\2\2\2\u08c0\u08c7\3\2\2\2\u08c1\u08c4\t\23\2\2\u08c2\u08c3\7"+
		"\u00d4\2\2\u08c3\u08c5\7\u0103\2\2\u08c4\u08c2\3\2\2\2\u08c4\u08c5\3\2"+
		"\2\2\u08c5\u08c7\3\2\2\2\u08c6\u08bb\3\2\2\2\u08c6\u08c1\3\2\2\2\u08c7"+
		"\u08f4\3\2\2\2\u08c8\u08c9\7\u00de\2\2\u08c9\u08ca\7f\2\2\u08ca\u08f4"+
		"\7\u0100\2\2\u08cb\u08cc\7g\2\2\u08cc\u08cd\7f\2\2\u08cd\u08f4\7\u0100"+
		"\2\2\u08ce\u08d1\7Q\2\2\u08cf\u08d2\5\u0194\u00cb\2\u08d0\u08d2\7m\2\2"+
		"\u08d1\u08cf\3\2\2\2\u08d1\u08d0\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3\u08d4"+
		"\7\u00ec\2\2\u08d4\u08f4\7\u0100\2\2\u08d5\u08d6\7O\2\2\u08d6\u08f4\7"+
		"\u0100\2\2\u08d7\u08d8\7\u00ee\2\2\u08d8\u08f4\7#\2\2\u08d9\u08da\7\4"+
		"\2\2\u08da\u08f4\t\24\2\2\u08db\u08dc\7\u00e2\2\2\u08dc\u08df\7\33\2\2"+
		"\u08dd\u08de\7\u00e3\2\2\u08de\u08e0\5x=\2\u08df\u08dd\3\2\2\2\u08df\u08e0"+
		"\3\2\2\2\u08e0\u08e2\3\2\2\2\u08e1\u08e3\7%\2\2\u08e2\u08e1\3\2\2\2\u08e2"+
		"\u08e3\3\2\2\2\u08e3\u08f4\3\2\2\2\u08e4\u08e5\7\20\2\2\u08e5\u08e6\7"+
		"\u008f\2\2\u08e6\u08f4\t\17\2\2\u08e7\u08e8\7\u00de\2\2\u08e8\u08f0\7"+
		"\u00f3\2\2\u08e9\u08f1\5\u009cO\2\u08ea\u08ed\7\u00a5\2\2\u08eb\u08ec"+
		"\7!\2\2\u08ec\u08ee\5\u009cO\2\u08ed\u08eb\3\2\2\2\u08ed\u08ee\3\2\2\2"+
		"\u08ee\u08f1\3\2\2\2\u08ef\u08f1\7C\2\2\u08f0\u08e9\3\2\2\2\u08f0\u08ea"+
		"\3\2\2\2\u08f0\u08ef\3\2\2\2\u08f1\u08f4\3\2\2\2\u08f2\u08f4\7\u0100\2"+
		"\2\u08f3\u08ba\3\2\2\2\u08f3\u08c8\3\2\2\2\u08f3\u08cb\3\2\2\2\u08f3\u08ce"+
		"\3\2\2\2\u08f3\u08d5\3\2\2\2\u08f3\u08d7\3\2\2\2\u08f3\u08d9\3\2\2\2\u08f3"+
		"\u08db\3\2\2\2\u08f3\u08e4\3\2\2\2\u08f3\u08e7\3\2\2\2\u08f3\u08f2\3\2"+
		"\2\2\u08f4\u08f7\3\2\2\2\u08f5\u08f3\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6"+
		"\u08fc\3\2\2\2\u08f7\u08f5\3\2\2\2\u08f8\u08f9\5\u009eP\2\u08f9\u08fa"+
		"\5\u019a\u00ce\2\u08fa\u08fc\3\2\2\2\u08fb\u08b9\3\2\2\2\u08fb\u08f8\3"+
		"\2\2\2\u08fc\u0197\3\2\2\2\u08fd\u08fe\7\u00c7\2\2\u08fe\u08ff\7\21\2"+
		"\2\u08ff\u0903\7\u008f\2\2\u0900\u0904\7\u00a5\2\2\u0901\u0904\7\u00de"+
		"\2\2\u0902\u0904\5z>\2\u0903\u0900\3\2\2\2\u0903\u0901\3\2\2\2\u0903\u0902"+
		"\3\2\2\2\u0904\u090a\3\2\2\2\u0905\u0906\t\25\2\2\u0906\u0907\7\21\2\2"+
		"\u0907\u0908\7\u008f\2\2\u0908\u090a\5z>\2\u0909\u08fd\3\2\2\2\u0909\u0905"+
		"\3\2\2\2\u090a\u090d\3\2\2\2\u090b\u090c\7\u00e3\2\2\u090c\u090e\5\6\4"+
		"\2\u090d\u090b\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u0199\3\2\2\2\u090f\u0910"+
		"\t\26\2\2\u0910\u0911\7\16\2\2\u0911\u0918\7i\2\2\u0912\u0913\7 \2\2\u0913"+
		"\u0919\7q\2\2\u0914\u0916\5n8\2\u0915\u0917\5\u019c\u00cf\2\u0916\u0915"+
		"\3\2\2\2\u0916\u0917\3\2\2\2\u0917\u0919\3\2\2\2\u0918\u0912\3\2\2\2\u0918"+
		"\u0914\3\2\2\2\u0919\u019b\3\2\2\2\u091a\u0923\7\u00cf\2\2\u091b\u091e"+
		"\7\u00f3\2\2\u091c\u091d\7\u00a5\2\2\u091d\u091f\7!\2\2\u091e\u091c\3"+
		"\2\2\2\u091e\u091f\3\2\2\2\u091f\u0920\3\2\2\2\u0920\u0924\5\u009cO\2"+
		"\u0921\u0922\7\u00eb\2\2\u0922\u0924\7Z\2\2\u0923\u091b\3\2\2\2\u0923"+
		"\u0921\3\2\2\2\u0924\u0926\3\2\2\2\u0925\u091a\3\2\2\2\u0925\u0926\3\2"+
		"\2\2\u0926\u0929\3\2\2\2\u0927\u0928\7\7\2\2\u0928\u092a\7X\2\2\u0929"+
		"\u0927\3\2\2\2\u0929\u092a\3\2\2\2\u092a\u019d\3\2\2\2\u092b\u092c\7\u00e1"+
		"\2\2\u092c\u092d\7\u00fd\2\2\u092d\u092f\5n8\2\u092e\u0930\7\u00d5\2\2"+
		"\u092f\u092e\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u019f\3\2\2\2\u0931\u0932"+
		"\7\u00db\2\2\u0932\u0933\7\u00f3\2\2\u0933\u093f\5f\64\2\u0934\u0935\7"+
		"\u00bd\2\2\u0935\u0940\7)\2\2\u0936\u093d\7)\2\2\u0937\u0938\7\u00ac\2"+
		"\2\u0938\u093e\7\u0100\2\2\u0939\u093a\7r\2\2\u093a\u093e\5\6\4\2\u093b"+
		"\u093e\7$\2\2\u093c\u093e\7\'\2\2\u093d\u0937\3\2\2\2\u093d\u0939\3\2"+
		"\2\2\u093d\u093b\3\2\2\2\u093d\u093c\3\2\2\2\u093e\u0940\3\2\2\2\u093f"+
		"\u0934\3\2\2\2\u093f\u0936\3\2\2\2\u093f\u0940\3\2\2\2\u0940\u0944\3\2"+
		"\2\2\u0941\u0942\7\20\2\2\u0942\u0943\7\u008f\2\2\u0943\u0945\t\17\2\2"+
		"\u0944\u0941\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u01a1\3\2\2\2\u0946\u0947"+
		"\7\u00d2\2\2\u0947\u0948\7\u00f3\2\2\u0948\u0954\5f\64\2\u0949\u094a\7"+
		"\u00bd\2\2\u094a\u0955\7)\2\2\u094b\u0952\7)\2\2\u094c\u094d\7\u00ac\2"+
		"\2\u094d\u0953\7\u0100\2\2\u094e\u094f\7r\2\2\u094f\u0953\5\6\4\2\u0950"+
		"\u0953\7$\2\2\u0951\u0953\7\'\2\2\u0952\u094c\3\2\2\2\u0952\u094e\3\2"+
		"\2\2\u0952\u0950\3\2\2\2\u0952\u0951\3\2\2\2\u0953\u0955\3\2\2\2\u0954"+
		"\u0949\3\2\2\2\u0954\u094b\3\2\2\2\u0955\u0959\3\2\2\2\u0956\u0957\7\20"+
		"\2\2\u0957\u0958\7\u008f\2\2\u0958\u095a\t\17\2\2\u0959\u0956\3\2\2\2"+
		"\u0959\u095a\3\2\2\2\u095a\u01a3\3\2\2\2\u095b\u095c\7\u00e1\2\2\u095c"+
		"\u095d\7\u00f3\2\2\u095d\u095e\5f\64\2\u095e\u01a5\3\2\2\2\u0117\u01b9"+
		"\u01bc\u01c3\u01c7\u01dc\u01e1\u01e8\u01f1\u01f6\u01fa\u0203\u020e\u0216"+
		"\u021a\u021c\u0220\u0224\u022d\u022f\u0234\u0238\u023f\u0246\u024e\u0251"+
		"\u0259\u026b\u026d\u027b\u0282\u0288\u028c\u0293\u029b\u02a0\u02a3\u02e3"+
		"\u02e5\u02ea\u02f5\u0301\u0308\u030c\u0313\u031b\u0323\u032f\u033b\u0347"+
		"\u034f\u0357\u0363\u036b\u0373\u037b\u0383\u038b\u0393\u03a5\u03b6\u03b8"+
		"\u03c1\u03d0\u03d2\u03d9\u03e0\u03e9\u03f0\u03fe\u0406\u040b\u0411\u043d"+
		"\u043f\u045a\u0461\u0463\u0469\u046d\u0487\u048c\u0490\u0492\u04a5\u04ab"+
		"\u04ae\u04b2\u04b9\u04bd\u04c5\u04cc\u04d0\u04e2\u04ec\u04f8\u0501\u050b"+
		"\u0511\u051a\u0521\u0524\u0528\u052d\u0532\u0536\u053a\u053f\u0542\u054a"+
		"\u054c\u0551\u0556\u0558\u055b\u0562\u0574\u0578\u057c\u0583\u0588\u058d"+
		"\u0590\u059b\u05a0\u05a6\u05ad\u05af\u05bb\u05be\u05cf\u05d8\u05de\u05e1"+
		"\u05e5\u05f6\u05fb\u060f\u0618\u061b\u061f\u0624\u0627\u062a\u062d\u0634"+
		"\u0639\u063d\u0642\u0646\u0648\u064c\u0651\u065a\u065f\u0663\u0669\u066f"+
		"\u0674\u0679\u068b\u0690\u069d\u06a3\u06b3\u06b8\u06c1\u06c4\u06c9\u06ce"+
		"\u06d6\u06dc\u06e0\u06e4\u06eb\u06ef\u06f2\u06f6\u06fa\u06ff\u0704\u070a"+
		"\u0711\u0719\u071d\u0724\u0728\u0732\u0737\u073c\u074d\u074f\u0755\u0758"+
		"\u075f\u0762\u0769\u076e\u0778\u077c\u0781\u0783\u0788\u078a\u079d\u07a3"+
		"\u07a7\u07ab\u07af\u07b3\u07b6\u07b8\u07be\u07c0\u07c4\u07c8\u07cd\u07d5"+
		"\u07da\u07dd\u07e3\u07e8\u07ef\u07f8\u07fb\u0802\u0808\u0812\u081a\u0823"+
		"\u0828\u082c\u0831\u0836\u0838\u0842\u084e\u0851\u085c\u0865\u086a\u086d"+
		"\u0877\u0880\u0884\u0892\u0894\u089f\u08ae\u08b0\u08b5\u08bf\u08c4\u08c6"+
		"\u08d1\u08df\u08e2\u08ed\u08f0\u08f3\u08f5\u08fb\u0903\u0909\u090d\u0916"+
		"\u0918\u091e\u0923\u0925\u0929\u092f\u093d\u093f\u0944\u0952\u0954\u0959";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}