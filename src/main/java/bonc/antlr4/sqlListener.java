// Generated from sql.g4 by ANTLR 4.7.1

package bonc.antlr4;
import bonc.antlr4.entity.*;
import java.util.HashSet;
import java.util.Set;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sqlParser}.
 */
public interface sqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sqlParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(sqlParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(sqlParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(sqlParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(sqlParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(sqlParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(sqlParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code union}
	 * labeled alternative in {@link sqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnion(sqlParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code union}
	 * labeled alternative in {@link sqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnion(sqlParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code select}
	 * labeled alternative in {@link sqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelect(sqlParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code select}
	 * labeled alternative in {@link sqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelect(sqlParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#unionQuery}.
	 * @param ctx the parse tree
	 */
	void enterUnionQuery(sqlParser.UnionQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#unionQuery}.
	 * @param ctx the parse tree
	 */
	void exitUnionQuery(sqlParser.UnionQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#selectQueryBlock}.
	 * @param ctx the parse tree
	 */
	void enterSelectQueryBlock(sqlParser.SelectQueryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#selectQueryBlock}.
	 * @param ctx the parse tree
	 */
	void exitSelectQueryBlock(sqlParser.SelectQueryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#selectAction}.
	 * @param ctx the parse tree
	 */
	void enterSelectAction(sqlParser.SelectActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#selectAction}.
	 * @param ctx the parse tree
	 */
	void exitSelectAction(sqlParser.SelectActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#selectQueryBlock1}.
	 * @param ctx the parse tree
	 */
	void enterSelectQueryBlock1(sqlParser.SelectQueryBlock1Context ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#selectQueryBlock1}.
	 * @param ctx the parse tree
	 */
	void exitSelectQueryBlock1(sqlParser.SelectQueryBlock1Context ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#selectAction1}.
	 * @param ctx the parse tree
	 */
	void enterSelectAction1(sqlParser.SelectAction1Context ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#selectAction1}.
	 * @param ctx the parse tree
	 */
	void exitSelectAction1(sqlParser.SelectAction1Context ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#insertClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertClause(sqlParser.InsertClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#insertClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertClause(sqlParser.InsertClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#columnlist}.
	 * @param ctx the parse tree
	 */
	void enterColumnlist(sqlParser.ColumnlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#columnlist}.
	 * @param ctx the parse tree
	 */
	void exitColumnlist(sqlParser.ColumnlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(sqlParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(sqlParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#orderList}.
	 * @param ctx the parse tree
	 */
	void enterOrderList(sqlParser.OrderListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#orderList}.
	 * @param ctx the parse tree
	 */
	void exitOrderList(sqlParser.OrderListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#orderItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderItem(sqlParser.OrderItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#orderItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderItem(sqlParser.OrderItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#orderType}.
	 * @param ctx the parse tree
	 */
	void enterOrderType(sqlParser.OrderTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#orderType}.
	 * @param ctx the parse tree
	 */
	void exitOrderType(sqlParser.OrderTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#allFields}.
	 * @param ctx the parse tree
	 */
	void enterAllFields(sqlParser.AllFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#allFields}.
	 * @param ctx the parse tree
	 */
	void exitAllFields(sqlParser.AllFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(sqlParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(sqlParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(sqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(sqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(sqlParser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(sqlParser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code top}
	 * labeled alternative in {@link sqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterTop(sqlParser.TopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code top}
	 * labeled alternative in {@link sqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitTop(sqlParser.TopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code where}
	 * labeled alternative in {@link sqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhere(sqlParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by the {@code where}
	 * labeled alternative in {@link sqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhere(sqlParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(sqlParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(sqlParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(sqlParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(sqlParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectjoin}
	 * labeled alternative in {@link sqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterSelectjoin(sqlParser.SelectjoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectjoin}
	 * labeled alternative in {@link sqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitSelectjoin(sqlParser.SelectjoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleTable}
	 * labeled alternative in {@link sqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTable(sqlParser.SimpleTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleTable}
	 * labeled alternative in {@link sqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTable(sqlParser.SimpleTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subSelectQuery}
	 * labeled alternative in {@link sqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterSubSelectQuery(sqlParser.SubSelectQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subSelectQuery}
	 * labeled alternative in {@link sqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitSubSelectQuery(sqlParser.SubSelectQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#database}.
	 * @param ctx the parse tree
	 */
	void enterDatabase(sqlParser.DatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#database}.
	 * @param ctx the parse tree
	 */
	void exitDatabase(sqlParser.DatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(sqlParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(sqlParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(sqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(sqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(sqlParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(sqlParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#fieldExpression}.
	 * @param ctx the parse tree
	 */
	void enterFieldExpression(sqlParser.FieldExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#fieldExpression}.
	 * @param ctx the parse tree
	 */
	void exitFieldExpression(sqlParser.FieldExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#methodExpression}.
	 * @param ctx the parse tree
	 */
	void enterMethodExpression(sqlParser.MethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#methodExpression}.
	 * @param ctx the parse tree
	 */
	void exitMethodExpression(sqlParser.MethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(sqlParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(sqlParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(sqlParser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(sqlParser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierField}
	 * labeled alternative in {@link sqlParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierField(sqlParser.IdentifierFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierField}
	 * labeled alternative in {@link sqlParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierField(sqlParser.IdentifierFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intField}
	 * labeled alternative in {@link sqlParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterIntField(sqlParser.IntFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intField}
	 * labeled alternative in {@link sqlParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitIntField(sqlParser.IntFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleField}
	 * labeled alternative in {@link sqlParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterDoubleField(sqlParser.DoubleFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleField}
	 * labeled alternative in {@link sqlParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitDoubleField(sqlParser.DoubleFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringField}
	 * labeled alternative in {@link sqlParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterStringField(sqlParser.StringFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringField}
	 * labeled alternative in {@link sqlParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitStringField(sqlParser.StringFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#aggmethod}.
	 * @param ctx the parse tree
	 */
	void enterAggmethod(sqlParser.AggmethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#aggmethod}.
	 * @param ctx the parse tree
	 */
	void exitAggmethod(sqlParser.AggmethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(sqlParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(sqlParser.OperatorContext ctx);
}