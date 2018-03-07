grammar sql;

@lexer::header {
package bonc.antlr4;
}
@parser::header{
package bonc.antlr4;
import bonc.antlr4.entity.*;
import java.util.HashSet;
import java.util.Set;

}
prog :dmlStatement SEMI
;
dmlStatement:insertStatement | selectStatement ;
insertStatement
locals[
String uuid;
public List<Column> columnList = new ArrayList<Column>();
]
:insertClause selectStatement 
;
selectStatement 
locals [
String uuid;//不知道为啥，第一个属性总会多一个public，而且最后一个会补一个分号，所以这里不加public，那里不加分号
public List<Column> columnList = new ArrayList<Column>()
]
:unionQuery orderByClause?                     #union
|selectQueryBlock                                             #select
;
unionQuery: selectQueryBlock1 (KW_UNION KW_ALL? selectQueryBlock1)+
;
selectQueryBlock 
locals [
String uuid;
public List<Column> columnList = new ArrayList<Column>();
public Set<Column> columnSet = new HashSet<Column>();
public void dd(){
}
]
: selectClause fromClause (selectAction)*
;
selectAction : whereClause
|groupByClause
|orderByClause 
;
selectQueryBlock1
locals [
String uuid;
public List<Column> columnList = new ArrayList<Column>();
public Set<Column> columnSet = new HashSet<Column>();
public void dd(){
}
]
: selectClause fromClause (selectAction1)*
;
selectAction1 : whereClause
|groupByClause
;
insertClause : KW_INSERT KW_INTO tableName 
|KW_INSERT KW_INTO tableName columnlist
;
columnlist : LPAREN column  (',' column)* RPAREN
|column  (',' column)*
;
column :  fieldExpression (KW_AS? alias)?
;
orderList:orderItem (','orderItem)*
;
orderItem:fieldExpression (orderType)?
;
orderType:KW_ASC|KW_DESC
;
allFields:STAR
;
selectClause : KW_SELECT  columnlist
;
fromClause : KW_FROM tableSource
;
join_type:KW_LEFT|KW_INNER|KW_RIGHT|KW_FULL
;
whereClause : KW_WHERE KW_ROWNUM operator INT    #top
|KW_WHERE booleanExpression                      #where
;
groupByClause : KW_GROUP KW_BY fieldName (','fieldName)*
;
orderByClause : KW_ORDER KW_BY orderList
;
tableSource 
locals[
String uuid;
public List<Column> columnList = new ArrayList<Column>();
public String tableName;
public String alias
]
: tableName alias?                                   #simpleTable            
|LPAREN selectStatement RPAREN alias                             #subSelectQuery
|tableSource (join_type KW_JOIN tableSource KW_ON booleanExpression)+  #selectjoin
;
database:IDENTIFIER
;
alias :  IDENTIFIER
;
tableName : IDENTIFIER
|database ('.' IDENTIFIER)*
;
//expression
booleanExpression:booleanExpression KW_AND booleanExpression
                |booleanExpression KW_OR booleanExpression
                |KW_NOT booleanExpression
		|fieldExpression operator fieldExpression
		|LPAREN booleanExpression RPAREN
                |fieldExpression  KW_IS (KW_NOT)? KW_NULL
                |fieldExpression KW_IN selectStatement
;
fieldExpression
locals[
boolean isContainAggMethod
]
:caseExpression
                |methodExpression
                |LPAREN fieldExpression RPAREN
                |fieldExpression (STAR|DIV|MOD)fieldExpression
                |fieldExpression (PLUS|MINUS)fieldExpression
                |MINUS fieldExpression
                |fieldName
		|allFields
;
methodExpression:aggmethod LPAREN fieldExpression RPAREN
                |IDENTIFIER (LPAREN fieldExpression(','fieldExpression)*RPAREN|LPAREN RPAREN)
;
caseExpression: KW_CASE (KW_WHEN booleanExpression KW_THEN fieldExpression)+ (elseClause)? KW_END
                | KW_CASE fieldExpression (KW_WHEN fieldExpression KW_THEN fieldExpression)+ (elseClause)? KW_END
;
elseClause:KW_ELSE fieldExpression;
fieldName : IDENTIFIER ('.' IDENTIFIER)*                 #identifierField
		|INT                                     #intField
		|DOUBLE                                  #doubleField
                |STRING                                  #StringField
;
aggmethod:KW_COUNT|KW_AVG|KW_MAX|KW_MIN|KW_SUM;
STAR : '*';
//KEYWORDS
//聚合函数
KW_MAX:('m'|'M')('a'|'A')('x'|'X');
KW_COUNT:('c'|'C')('o'|'O')('u'|'U')('n'|'N')('t'|'T');
KW_SUM:('s'|'S')('u'|'U')('m'|'M');
KW_AVG:('a'|'A')('v'|'V')('g'|'G');
KW_MIN:('m'|'M')('i'|'I')('n'|'N');
KW_BY:('b'|'B')('y'|'Y');
KW_FULL:('f'|'F')('u'|'U')('l'|'L')('l'|'L');
KW_DESC:('d'|'D')('e'|'E')('s'|'S')('c'|'C');
KW_ORDER:('o'|'O')('r'|'R')('d'|'D')('e'|'E')('r'|'R');
KW_INSERT:('i'|'I')('n'|'N')('s'|'S')('e'|'E')('r'|'R')('t'|'T');
KW_WHERE:('w'|'W')('h'|'H')('e'|'E')('r'|'R')('e'|'E');
KW_AS:('a'|'A')('s'|'S');
KW_ROWNUM:('r'|'R')('o'|'O')('w'|'W')('n'|'N')('u'|'U')('m'|'M');
KW_GROUP:('g'|'G')('r'|'R')('o'|'O')('u'|'U')('p'|'P');
KW_ASC:('a'|'A')('s'|'S')('c'|'C');
KW_RIGHT:('r'|'R')('i'|'I')('g'|'G')('h'|'H')('t'|'T');
KW_IN:('i'|'I')('n'|'N');
KW_NULL:('n'|'N')('u'|'U')('l'|'L')('l'|'L');
KW_IS:('i'|'I')('s'|'S');
KW_INTO:('i'|'I')('n'|'N')('t'|'T')('o'|'O');
KW_UNION:('u'|'U')('n'|'N')('i'|'I')('o'|'O')('n'|'N');
KW_FROM:('f'|'F')('r'|'R')('o'|'O')('m'|'M');
KW_SELECT:('s'|'S')('e'|'E')('l'|'L')('e'|'E')('c'|'C')('t'|'T');
KW_JOIN:('j'|'J')('o'|'O')('i'|'I')('n'|'N');
KW_ON:('o'|'O')('n'|'N');
KW_LEFT:('l'|'L')('e'|'E')('f'|'F')('t'|'T');
KW_ALL:('a'|'A')('l'|'L')('l'|'L');
KW_INNER:('i'|'I')('n'|'N')('n'|'N')('e'|'E')('r'|'R');
KW_CASE:('c'|'C') ('a'|'A') ('s'|'S') ('e'|'E');
KW_WHEN:('w'|'W') ('h'|'H') ('e'|'E') ('n'|'N');
KW_THEN:('t'|'T') ('h'|'H') ('e'|'E') ('n'|'N');
KW_ELSE:('e'|'E') ('l'|'L') ('s'|'S') ('e'|'E');
KW_END:('e'|'E') ('n'|'N') ('d'|'D');
KW_NOT:('n'|'N') ('o'|'O') ('t'|'T');
KW_AND:('a'|'A') ('n'|'N') ('d'|'D') ;
KW_OR:('o'|'O') ('r'|'R');
SEMI:';';
operator:'='|'>'|'<>'|'<'|'!=';
LPAREN:'(';
RPAREN:')';
PLUS:'+';      
MINUS:'-';      
DIV:'/';     
MOD:'%';
STRING : '\'' (~'\'')* '\'';
INT:'0'..'9'+ EXPONENT?;
DOUBLE:INT '.' INT EXPONENT?;
EXPONENT:('e'|'E') INT;
IDENTIFIER : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
WS :   ( ' ' | '\t' | '\r' | '\n' )+ { skip(); } ;
