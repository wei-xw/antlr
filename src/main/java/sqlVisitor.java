// Generated from sql.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link sqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface sqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link sqlParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(sqlParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlStatement(sqlParser.DmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(sqlParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code union}
	 * labeled alternative in {@link sqlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(sqlParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code select}
	 * labeled alternative in {@link sqlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(sqlParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#unionQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionQuery(sqlParser.UnionQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#selectQueryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectQueryBlock(sqlParser.SelectQueryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#selectAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAction(sqlParser.SelectActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#insertClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertClause(sqlParser.InsertClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#columnlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnlist(sqlParser.ColumnlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(sqlParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#orderList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderList(sqlParser.OrderListContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#orderItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderItem(sqlParser.OrderItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#orderType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderType(sqlParser.OrderTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#allFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllFields(sqlParser.AllFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(sqlParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(sqlParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(sqlParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code top}
	 * labeled alternative in {@link sqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop(sqlParser.TopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code where}
	 * labeled alternative in {@link sqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(sqlParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(sqlParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(sqlParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#searchCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchCondition(sqlParser.SearchConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#searchItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchItem(sqlParser.SearchItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(sqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectjoin}
	 * labeled alternative in {@link sqlParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectjoin(sqlParser.SelectjoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleTable}
	 * labeled alternative in {@link sqlParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTable(sqlParser.SimpleTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subSelectQuery}
	 * labeled alternative in {@link sqlParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubSelectQuery(sqlParser.SubSelectQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#fieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldName(sqlParser.FieldNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase(sqlParser.DatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(sqlParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(sqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqlParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(sqlParser.OperatorContext ctx);
}