package bonc.antlr4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import bonc.antlr4.entity.Column;

//尽量对于每个节点只对其父节点和子节点进行操作，防止太复杂。
//对于语法规则有多个分支的情况，该规则对于外层的规则来说，不管什么分支，表现应一样
public class MappingListener extends sqlBaseListener {
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterProg(sqlParser.ProgContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitProg(sqlParser.ProgContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterDmlStatement(sqlParser.DmlStatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitDmlStatement(sqlParser.DmlStatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterInsertStatement(sqlParser.InsertStatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitInsertStatement(sqlParser.InsertStatementContext ctx) {
		System.out.println("目标节点");
		System.out.println("上一个节点uuid： " + ctx.selectStatement().uuid);
		System.out.println("当前节点字段:");
		visitInsertClause(ctx.insertClause());
		System.out.println("当前节点uuid： " + UUID.randomUUID());
		visitColumnList(ctx.selectStatement().columnList);
	}

	private void visitColumnList(List<Column> columnList) {
		// TODO Auto-generated method stub
		System.out.println("字段：");
		for (Column column : columnList) {
			System.out.println(column.getColumnName());
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterUnion(sqlParser.UnionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitUnion(sqlParser.UnionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterSelect(sqlParser.SelectContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitSelect(sqlParser.SelectContext ctx) {
		ctx.columnList = ctx.selectQueryBlock().columnList;
		ctx.uuid = ctx.selectQueryBlock().uuid;
	}

	private void visitInsertClause(sqlParser.InsertClauseContext insertClause) {
		// TODO Auto-generated method stub
		if (insertClause.columnlist() != null) {
			for (sqlParser.ColumnContext column : insertClause.columnlist().column()) {
				System.out.println(column.fieldExpression().fieldName().getText());
			}
		} else {
			System.out.println("sql中没有insert字句的字段，需要查询元数据");
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterUnionQuery(sqlParser.UnionQueryContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitUnionQuery(sqlParser.UnionQueryContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterSelectQueryBlock(sqlParser.SelectQueryBlockContext ctx) {
	}

	private Set<Column> visitFieldExpression(sqlParser.FieldExpressionContext fieldExpression) {
		Set<Column> hs = new HashSet<Column>();
		Column col = new Column();
		if (fieldExpression.caseExpression() != null)
			hs.addAll(visitCaseExpression(fieldExpression.caseExpression()));
		if (fieldExpression.methodExpression() != null)
			hs.addAll(visitMethodExpression(fieldExpression.methodExpression()));
		if(fieldExpression.fieldExpression()!=null) {
			for(sqlParser.FieldExpressionContext fieldExp :fieldExpression.fieldExpression())
				hs.addAll(visitFieldExpression(fieldExp));
		}
		if (fieldExpression.fieldName() != null&&fieldExpression.fieldName() instanceof sqlParser.IdentifierFieldContext) {
			col.setColumnName(fieldExpression.fieldName().getText());
			hs.add(col);
		}

		return hs;
	}

	private Set<Column> visitMethodExpression(sqlParser.MethodExpressionContext methodExpressionContext) {
		// TODO Auto-generated method stub
		Set<Column> hs = new HashSet<Column>();
		if(methodExpressionContext.fieldExpression()!=null) {
			for(sqlParser.FieldExpressionContext fieldExp :methodExpressionContext.fieldExpression())
				hs.addAll(visitFieldExpression(fieldExp));
		}
		return hs;
	}

	private Set<Column> visitCaseExpression(sqlParser.CaseExpressionContext caseExpressionContext) {
		// TODO Auto-generated method stub
		Set<Column> hs = new HashSet<Column>();
		if(caseExpressionContext.fieldExpression()!=null) {
			for(sqlParser.FieldExpressionContext fieldExp :caseExpressionContext.fieldExpression())
				hs.addAll(visitFieldExpression(fieldExp));
		}
		if(caseExpressionContext.booleanExpression()!=null) {
			for(sqlParser.BooleanExpressionContext booleanExp :caseExpressionContext.booleanExpression())
				hs.addAll(visitBooleanExpression(booleanExp));
		}
		return hs;
	}

	private Set<Column> visitBooleanExpression(sqlParser.BooleanExpressionContext booleanExpression) {
		Set<Column> hs = new HashSet<Column>();
		if(booleanExpression.fieldExpression()!=null) {
			for(sqlParser.FieldExpressionContext fieldExp :booleanExpression.fieldExpression())
				hs.addAll(visitFieldExpression(fieldExp));
		}
		if(booleanExpression.booleanExpression()!=null) {
			for(sqlParser.BooleanExpressionContext booleanExp :booleanExpression.booleanExpression())
				hs.addAll(visitBooleanExpression(booleanExp));
		}
		return hs;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitSelectQueryBlock(sqlParser.SelectQueryBlockContext ctx) {
		ctx.uuid = ctx.fromClause().tableSource().uuid;
		// 填节点的字段
		// 填当前节点的
		List<Column> columnRealList = new ArrayList<Column>();
		List<Column> columnListMore = new ArrayList<Column>();
		boolean isExpression = false;
		boolean isAlias = false;
		if (ctx.fromClause().tableSource() != null) {
			Column col = new Column();
			for (sqlParser.ColumnContext columnContext : ctx.selectClause().columnlist().column()) {
				if (columnContext.fieldExpression().allFields() == null) {
					if (columnContext.fieldExpression().fieldName() == null) {
						columnListMore.addAll(visitFieldExpression(columnContext.fieldExpression()));
						isExpression = true;
					} else {
						col.setColumnName(columnContext.fieldExpression().getText());
						if (columnContext.alias() != null) { // 有别名的设置，没有的这里也没有什么好办法,暂时和columnName一样。
							isAlias = true;// 有别名，用表达式节点体现，节点的端口是别名，表达式是字段名????
							col.setAlias(columnContext.alias().getText());
						} else {
							col.setAlias(columnContext.fieldExpression().getText());
						}
						columnListMore.add(col);
					}
					col.setColumnName(columnContext.fieldExpression().getText());
					if (columnContext.alias() != null) { // 有别名的设置，没有的这里也没有什么好办法,暂时和columnName一样。
						col.setAlias(columnContext.alias().getText());
					} else {
						col.setAlias(columnContext.fieldExpression().getText());
					}
					columnRealList.add(col);
				} else {
					// 两个list大小，以及加工映射，后面？的字段表达式为空，默认填字段
					// 此时columnRealList是select后面的column把*替换后的，column可以由表达式函数构成
					columnRealList.addAll(ctx.fromClause().tableSource().columnList);
					// columnListMore *替换后的，表达式函数中包含的字段set。
					columnListMore.addAll(ctx.fromClause().tableSource().columnList);
				}
			}
		}
		ctx.columnList = columnListMore;
		if (ctx.fromClause().tableSource() instanceof sqlParser.SelectjoinContext) {
			ctx.uuid = UUID.randomUUID().toString();
			sqlParser.SelectjoinContext selectjoin = (sqlParser.SelectjoinContext) ctx.fromClause().tableSource();
			List<sqlParser.TableSourceContext> tablesList = selectjoin.tableSource();
			List<sqlParser.Join_typeContext> join_typeList = selectjoin.join_type();
			if (join_typeList.size() == 1) {
				System.out.println("连接节点");
			} else {
				System.out.println("多连接节点");
			}
			System.out.println("来源uuid：");
			for (sqlParser.TableSourceContext table : tablesList) {
				System.out.print(table.alias + "    ||    ");
				System.out.println(table.uuid);
			}
			visitColumnList(columnListMore);
			System.out.println("当前节点uuid： " + ctx.uuid);
			for (int i = 0; i < join_typeList.size(); i++) {
				System.out.println("JOIN类型： " + join_typeList.get(i).getText() + " JOIN");
				System.out.print("表：");
				System.out.print(selectjoin.tableSource(i).alias + ",");
				System.out.println(selectjoin.tableSource(i + 1).alias);
				System.out.println("JOIN条件：" + selectjoin.booleanExpression(i).getText());
			}
			System.out.println();
		}

		if (ctx.selectAction() != null) {
			for (sqlParser.SelectActionContext selectAction : ctx.selectAction()) {
				for(Column col :visitWhere(selectAction.whereClause())) {
					if(!columnListMore.contains(col))
						columnListMore.add(col);
				}
				visitGroupBy(selectAction.groupByClause());
				visitOrderBy(selectAction.orderByClause());
				System.out.println("上一个节点uuid： " + ctx.uuid);
				visitColumnList(columnListMore);
				ctx.uuid = UUID.randomUUID().toString();
				System.out.println("当前节点uuid： " + ctx.uuid);
				visitColumnList(columnListMore);
				System.out.println();
			}
		}
		if (isExpression) {
			System.out.println("表达式节点：");
			System.out.println("上一个节点uuid： " + ctx.uuid);
			System.out.println("上一个节点的字段");
			for (Column col : columnListMore) {
				System.out.println(col.getColumnName() + " 别名 " + col.getAlias());
			}
			System.out.println("当前节点的字段");
			for (Column col : columnRealList) {
				System.out.println(col.getColumnName() + " 别名 " + col.getAlias());
			}
			ctx.uuid = UUID.randomUUID().toString();
			System.out.println("当前节点uuid： " + ctx.uuid);
		} else {
			// 对字段别名处理？？？
		}
	}

	private void visitOrderBy(sqlParser.OrderByClauseContext orderByClause) {
		// TODO Auto-generated method stub
		if (orderByClause != null) {
			System.out.println("排序节点");
			System.out.println("排序条件：" + orderByClause.orderList().getText());
			// for(orderByClause)
		}
	}

	private void visitGroupBy(sqlParser.GroupByClauseContext groupByClause) {
		// TODO Auto-generated method stub
		if (groupByClause != null) {
			System.out.println("汇总节点");
		}
	}

	private Set<Column> visitWhere(sqlParser.WhereClauseContext whereClause) {
		// TODO Auto-generated method stub
		if (whereClause != null) {
			if (whereClause instanceof sqlParser.WhereContext) {
				sqlParser.WhereContext where = (sqlParser.WhereContext) whereClause;
				System.out.println("筛选节点");
				System.out.println("筛选条件:" + where.booleanExpression().getText());
				return visitBooleanExpression(where.booleanExpression());
			} else {
				sqlParser.TopContext top = (sqlParser.TopContext) whereClause;
				System.out.println("top节点");
				System.out.println("数量:" + top.getText());
				return new HashSet<Column>();
			}
		}
		return new HashSet<Column>();
	}

	@Override
	public void enterSubSelectQuery(sqlParser.SubSelectQueryContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitSubSelectQuery(sqlParser.SubSelectQueryContext ctx) {
		ctx.columnList = ctx.selectStatement().columnList;
		ctx.uuid = ctx.selectStatement().uuid;
		ctx.alias = ctx.alias().getText();
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterSelectAction(sqlParser.SelectActionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitSelectAction(sqlParser.SelectActionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterInsertClause(sqlParser.InsertClauseContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitInsertClause(sqlParser.InsertClauseContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterColumnlist(sqlParser.ColumnlistContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitColumnlist(sqlParser.ColumnlistContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterColumn(sqlParser.ColumnContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitColumn(sqlParser.ColumnContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterOrderList(sqlParser.OrderListContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitOrderList(sqlParser.OrderListContext ctx) {
	}

	@Override
	public void enterOrderItem(sqlParser.OrderItemContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitOrderItem(sqlParser.OrderItemContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterOrderType(sqlParser.OrderTypeContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitOrderType(sqlParser.OrderTypeContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterAllFields(sqlParser.AllFieldsContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitAllFields(sqlParser.AllFieldsContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterSelectClause(sqlParser.SelectClauseContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 * SE
	 */
	@Override
	public void exitSelectClause(sqlParser.SelectClauseContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterFromClause(sqlParser.FromClauseContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitFromClause(sqlParser.FromClauseContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterSelectjoin(sqlParser.SelectjoinContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitSelectjoin(sqlParser.SelectjoinContext ctx) {
		for (sqlParser.TableSourceContext table : ctx.tableSource()) {
			ctx.columnList.addAll(table.columnList);// 获取join的表所有字段用于外层sql替换*
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterJoin_type(sqlParser.Join_typeContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitJoin_type(sqlParser.Join_typeContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterTop(sqlParser.TopContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitTop(sqlParser.TopContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterWhere(sqlParser.WhereContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitWhere(sqlParser.WhereContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterGroupByClause(sqlParser.GroupByClauseContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitGroupByClause(sqlParser.GroupByClauseContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterOrderByClause(sqlParser.OrderByClauseContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitOrderByClause(sqlParser.OrderByClauseContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterSimpleTable(sqlParser.SimpleTableContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitSimpleTable(sqlParser.SimpleTableContext ctx) {
		// ctx.columnAllList=getFrom元数据 //该表的所有字段
		ctx.uuid = UUID.randomUUID().toString();
		ctx.tableName = ctx.tableName().getText();
		if (ctx.alias() != null)
			ctx.alias = ctx.alias().getText();
		System.out.println("源节点：");
		System.out.print(ctx.tableName);
		System.out.println(" 别名：" + ctx.alias);
		System.out.println("当前节点uuid： " + ctx.uuid);
		System.out.println(ctx.columnList.size() + "个字段");
		System.out.println();
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterDatabase(sqlParser.DatabaseContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitDatabase(sqlParser.DatabaseContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterAlias(sqlParser.AliasContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitAlias(sqlParser.AliasContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterTableName(sqlParser.TableNameContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitTableName(sqlParser.TableNameContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterOperator(sqlParser.OperatorContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitOperator(sqlParser.OperatorContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void visitTerminal(TerminalNode node) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void visitErrorNode(ErrorNode node) {
	}

}