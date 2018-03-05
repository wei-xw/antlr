
package bonc.antlr4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.bonc.dataplatform.repository.mapping.vo.ETLCodeWidgetAttrView;
import com.bonc.dataplatform.repository.mapping.vo.ETLMappingProxyResource;
import com.bonc.dataplatform.repository.mapping.vo.ETLMappingView;
import com.bonc.dataplatform.repository.mapping.vo.ETLWidgetDepsView;
import com.bonc.dataplatform.repository.mapping.vo.ETLWidgetFieldView;
import com.bonc.dataplatform.repository.mapping.vo.ETLWidgetInstView;
import com.bonc.dataplatform.repository.mapping.vo.ETLWidgetView;
import com.bonc.dataplatform.repository.workflow.vo.ETLCodeAttrValView;
import com.thoughtworks.xstream.XStream;

import bonc.antlr4.entity.VertexAddr;
import bonc.antlr4.entity.Column;
import net.sf.json.JSONObject;

//尽量对于每个节点只对其父节点和子节点进行操作，防止太复杂。
//对于语法规则有多个分支的情况，该规则对于外层的规则来说，不管什么分支，表现应一样
public class MappingListener extends sqlBaseListener {
	ETLMappingView etl = new ETLMappingView();
	List<ETLWidgetInstView> widgetInsts = new ArrayList<ETLWidgetInstView>();
	List<ETLWidgetDepsView> widgetDeps = new ArrayList<ETLWidgetDepsView>();
	List<VertexAddr> VertexAddrs = new ArrayList<VertexAddr>();
	String vertexId;
	int x = 100;
	int y = 100;
	int length = 150;
	int width = 200;
	boolean isExpand;
	{
		etl.setOid("f03427ae-53f2-472c-bc44-d2344c04396a");
		etl.setMappingName("wxwimport");
		etl.setExecuteType(0);
		ETLMappingProxyResource proxyResource = new ETLMappingProxyResource();
		proxyResource.setPort(0);
		etl.setProxyResource(proxyResource);
		etl.setMappingType(0);
		etl.setDirId("88084829");
		etl.setWidgetInsts(widgetInsts);
		etl.setWidgetDeps(widgetDeps);
	}

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
		XStream xstream = new XStream();
		xstream.alias("VertexAddrs", List.class);
		xstream.alias("VertexAddr", VertexAddr.class);
		xstream.autodetectAnnotations(true);
		StringBuilder sb = new StringBuilder(
				"<?xml version=\"1.0\"?><VertexsAddr xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">");
		sb.append(xstream.toXML(VertexAddrs));
		sb.append("</VertexsAddr>");
		etl.setCoord(sb.toString().replace("\n",""));
		JSONObject jObject = JSONObject.fromObject(etl);
		FileWriter fw = null;
		try {
			fw = new FileWriter("/home/wxw/result/a.json");
			fw.write(jObject.toString());
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		ETLWidgetInstView e = new ETLWidgetInstView();
		widgetInsts.add(e);
		System.out.println("目标节点");
		System.out.println("上一个节点uuid： " + ctx.selectStatement().uuid);
		String fromFieldUid = ctx.selectStatement().uuid;

		// visitInsertClause(ctx.insertClause());
		ctx.uuid = UUID.randomUUID().toString();
		visitColumnList(ctx.selectStatement().columnList);
		System.out.println("当前节点uuid： " + ctx.uuid);
		List<String> colList = (List<String>) tableCols.get(ctx.insertClause().tableName()
				.IDENTIFIER(ctx.insertClause().tableName().IDENTIFIER().size() - 1).getText());
		System.out.println("当前节点字段:");
		for (String tmp : colList) {
			Column col = new Column();
			col.setColumnName(tmp);
			ctx.columnList.add(col);
		}
		visitColumnList(ctx.columnList);
		e.setWidgetInstId(ctx.uuid);
		VertexAddrs.add(new VertexAddr(ctx.uuid, x += 50, y += 50, length, width, false));
		e.setWidgetType("m3102");
		e.setInstancName(ctx.insertClause().tableName()
				.IDENTIFIER(ctx.insertClause().tableName().IDENTIFIER().size() - 1).getText() + "_1");
		ETLWidgetView widget = new ETLWidgetView();
		e.setWidget(widget);
		widget.setOid("88406570");
		widget.setWidgetName(ctx.insertClause().tableName()
				.IDENTIFIER(ctx.insertClause().tableName().IDENTIFIER().size() - 1).getText());
		widget.setWidgetType("m3102");
		widget.setModelId("m6");

		List<ETLCodeWidgetAttrView> widgetAttrs = new ArrayList<ETLCodeWidgetAttrView>();
		widget.setWidgetAttrs(widgetAttrs);
		ETLCodeWidgetAttrView eTLCodeWidgetAttrView = new ETLCodeWidgetAttrView(
				"m3102", 34, "4", "3", "目标对象名称", ctx.insertClause().tableName()
						.IDENTIFIER(ctx.insertClause().tableName().IDENTIFIER().size() - 1).getText(),
				null, 0, 34, "目标对象名称");
		eTLCodeWidgetAttrView.setAttrCode("3");
		eTLCodeWidgetAttrView.setBitflags("0");
		widgetAttrs.add(eTLCodeWidgetAttrView);
		ETLCodeWidgetAttrView eTLCodeWidgetAttrView2 = new ETLCodeWidgetAttrView("m3102", 241, "3", "3", "表的所属用户",
				ctx.insertClause().tableName().database().getText(), null, 0, 35, "表的所属用户");
		eTLCodeWidgetAttrView2.setAttrCode("4");
		eTLCodeWidgetAttrView2.setBitflags("0");
		widgetAttrs.add(eTLCodeWidgetAttrView2);
		List<ETLCodeAttrValView> attrValScope = new ArrayList<ETLCodeAttrValView>();
		attrValScope.add(new ETLCodeAttrValView("1", "true"));
		attrValScope.add(new ETLCodeAttrValView("0", "false"));
		ETLCodeWidgetAttrView eTLCodeWidgetAttrView1 = new ETLCodeWidgetAttrView("m3102", 242, "3", "3", "是否统计成功条数",
				"0", attrValScope, 0, 35, "是否统计成功条数。可在当前映射上创建系统内置的变量 _DF_COUNT，然后在数据流节点上配置后期成功的变量映射关系，那么可在流程中获得该变量值。");
		eTLCodeWidgetAttrView1.setAttrCode("5");
		eTLCodeWidgetAttrView1.setBitflags("0");
		widgetAttrs.add(eTLCodeWidgetAttrView1);

		ETLCodeWidgetAttrView eTLCodeWidgetAttrView3 = new ETLCodeWidgetAttrView("m3102", 37, "3", "3", "数据处理前执行脚本",
				null, null, 0, 37, "数据入库前执行的SQL语句，多条语句用逗号分隔。用于避免脏数据，如删除目标表数据，或删除当前分区数据");
		eTLCodeWidgetAttrView3.setAttrCode("6");
		eTLCodeWidgetAttrView3.setBitflags("0");
		widgetAttrs.add(eTLCodeWidgetAttrView3);
		ETLCodeWidgetAttrView eTLCodeWidgetAttrView4 = new ETLCodeWidgetAttrView("m3102", 38, "3", "3", "数据处理后执行脚本",
				null, null, 0, 38, "数据入库后执行的SQL语句，多条语句用逗号分隔。可用于日志记录");
		eTLCodeWidgetAttrView4.setAttrCode("7");
		eTLCodeWidgetAttrView4.setBitflags("0");
		widgetAttrs.add(eTLCodeWidgetAttrView4);
		ETLCodeWidgetAttrView eTLCodeWidgetAttrView5 = new ETLCodeWidgetAttrView("m3102", 230, "3", "3", "分区", null,
				null, 0, 230, "要入库分区的分区值,例如 part_id='${v_part}',prov_id='${v_prov}'");
		eTLCodeWidgetAttrView5.setAttrCode("21");
		eTLCodeWidgetAttrView5.setBitflags("0");
		widgetAttrs.add(eTLCodeWidgetAttrView5);
		List<ETLWidgetFieldView> widgetFields = new ArrayList<ETLWidgetFieldView>();
		widget.setWidgetFields(widgetFields);
		for (Column col : ctx.columnList) {
			ETLWidgetFieldView eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(), col.getColumnName(),
					255, 0, 95442, 3, 0, 0, "", "", "", "", "", "", 1);
			eTLWidgetFieldView.setSortType(0);
			widgetFields.add(eTLWidgetFieldView);
		}
		widget.setIsReusable(0);
		widget.setOwner(ctx.insertClause().tableName().database().getText());// 不对哦
		for (int i = 0; i < ctx.selectStatement().columnList.size(); i++) {
			ETLWidgetDepsView eTLWidgetDepsView = new ETLWidgetDepsView(fromFieldUid,
					ctx.selectStatement().columnList.get(i).getColumnName(), ctx.uuid,
					ctx.columnList.get(i).getColumnName());
			widgetDeps.add(eTLWidgetDepsView);
		}
	}

	private void visitColumnList(List<Column> columnList) {
		// TODO Auto-generated method stub
		System.out.println("字段：");
		for (Column column : columnList) {
			System.out.println(column.getColumnName());
		}
	}

	private void visitColumnList(Set<Column> columnSet) {
		// TODO Auto-generated method stub
		System.out.println("字段：");
		for (Column column : columnSet) {
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
		if (fieldExpression.fieldExpression() != null) {
			for (sqlParser.FieldExpressionContext fieldExp : fieldExpression.fieldExpression())
				hs.addAll(visitFieldExpression(fieldExp));
		}
		if (fieldExpression.fieldName() != null
				&& fieldExpression.fieldName() instanceof sqlParser.IdentifierFieldContext) {
			col.setColumnName(fieldExpression.fieldName().getText());
			hs.add(col);
		}

		return hs;
	}

	private Set<Column> visitMethodExpression(sqlParser.MethodExpressionContext methodExpressionContext) {
		// TODO Auto-generated method stub
		Set<Column> hs = new HashSet<Column>();
		if (methodExpressionContext.fieldExpression() != null) {
			for (sqlParser.FieldExpressionContext fieldExp : methodExpressionContext.fieldExpression())
				hs.addAll(visitFieldExpression(fieldExp));
		}
		return hs;
	}

	private Set<Column> visitCaseExpression(sqlParser.CaseExpressionContext caseExpressionContext) {
		// TODO Auto-generated method stub
		Set<Column> hs = new HashSet<Column>();
		if (caseExpressionContext.fieldExpression() != null) {
			for (sqlParser.FieldExpressionContext fieldExp : caseExpressionContext.fieldExpression())
				hs.addAll(visitFieldExpression(fieldExp));
		}
		if (caseExpressionContext.booleanExpression() != null) {
			for (sqlParser.BooleanExpressionContext booleanExp : caseExpressionContext.booleanExpression())
				hs.addAll(visitBooleanExpression(booleanExp));
		}
		return hs;
	}

	private Set<Column> visitBooleanExpression(sqlParser.BooleanExpressionContext booleanExpression) {
		Set<Column> hs = new HashSet<Column>();
		if (booleanExpression.fieldExpression() != null) {
			for (sqlParser.FieldExpressionContext fieldExp : booleanExpression.fieldExpression())
				hs.addAll(visitFieldExpression(fieldExp));
		}
		if (booleanExpression.booleanExpression() != null) {
			for (sqlParser.BooleanExpressionContext booleanExp : booleanExpression.booleanExpression())
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
		List<Column> columnOutList = new ArrayList<Column>();
		Set<Column> columnSetUsed = new HashSet<Column>();// 当前select块需要的from字句的字段，作为表达式节点的端口（表达式节点的端口不允许重复），因此不支持SELECT
															// USER_ID PACKAGE_ID,PACKAGE_ID PACKAGE_ID FROM
															// WXWTEST.TEMP
		boolean isExpression = false;
		if (ctx.fromClause().tableSource() != null) {
			for (sqlParser.ColumnContext columnContext : ctx.selectClause().columnlist().column()) {
				Column col1 = new Column(), col2 = new Column();
				if (columnContext.fieldExpression().allFields() == null) {
					if (columnContext.fieldExpression().fieldName() == null) {
						columnSetUsed.addAll(visitFieldExpression(columnContext.fieldExpression()));
						isExpression = true;
						col2.setExp(columnContext.fieldExpression().getText());
						if (columnContext.alias() != null) { // 有别名的设置，没有的这里也没有什么好办法,暂时和columnName一样。
							col2.setAlias(columnContext.alias().getText());
						} else {
							col2.setAlias("");
						}
					} else {
						col1.setColumnName(columnContext.fieldExpression().getText());
						columnSetUsed.add(col1);
						col2.setExp(columnContext.fieldExpression().fieldName().getText());
						col2.setColumnName(col2.getExp());
						if (columnContext.alias() != null) { // 有别名的设置，没有的这里也没有什么好办法,暂时和columnName一样。
							col2.setAlias(columnContext.alias().getText());
							if (!columnContext.alias().getText().equals(col2.getExp()))
								isExpression = true;// columnContext的表达式和别名不相同，例如select b as a ...，则需要表达式节点进行取别名
						} else {
							col2.setAlias(col2.getExp());
						}
					}
					columnRealList.add(col2);
				} else {
					// 两个list大小，以及加工映射，后面？的字段表达式为空，默认填字段
					// 此时columnRealList是select后面的column把*替换后的，col可以由表达式函数、别名构成
					columnRealList.addAll(ctx.fromClause().tableSource().columnList);
					// columnListMore *替换后的，表达式函数中包含的字段set
					columnSetUsed.addAll(ctx.fromClause().tableSource().columnList);// 这里可以优化下，既然都*了，那么也不需要做这个循环中的其他事
				}
			}
		}
		ctx.columnList = columnRealList;// 对于list 注意=和addAll的区别
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
			visitColumnList(columnSetUsed);
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
				for (Column col : visitWhere(selectAction.whereClause())) {
					if (!columnSetUsed.contains(col))
						columnSetUsed.add(col);
				}
				for (Column col : visitOrderBy(selectAction.orderByClause())) {
					if (!columnSetUsed.contains(col))
						columnSetUsed.add(col);
				}
				// groupby还不知道该怎么做
				// visitGroupBy(selectAction.groupByClause());
			}
			// 简单实现的，所以用了两个for循环，一个存字段，一个打印，之后是往xml对象里存，一个for就可以办到。
			for (sqlParser.SelectActionContext selectAction : ctx.selectAction()) {
				// groupby还不知道该怎么做
				ETLWidgetInstView e = new ETLWidgetInstView();
				widgetInsts.add(e);
				printGroupBy(selectAction.groupByClause());
				printWhere(selectAction.whereClause(), e);
				// printOrderBy(selectAction.orderByClause(),e);
				System.out.println("上一个节点uuid： " + ctx.uuid);
				String fromFieldUid = ctx.uuid;
				visitColumnList(columnSetUsed);
				ctx.uuid = UUID.randomUUID().toString();
				System.out.println("当前节点uuid： " + ctx.uuid);
				VertexAddrs.add(new VertexAddr(ctx.uuid, x += 50, y += 50, length, width, false));
				e.setOid(ctx.uuid);
				e.setWidgetInstId(ctx.uuid);
				e.getWidget().setOid(ctx.uuid);
				visitColumnList(columnSetUsed);
				List<ETLWidgetFieldView> widgetFields = new ArrayList<ETLWidgetFieldView>();
				e.getWidget().setWidgetFields(widgetFields);
				for (Column col : columnSetUsed) {
					ETLWidgetFieldView eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(),
							col.getColumnName(), 255, 0, 95442, 3, 0, 0, "", "", "", "", "", col.getColumnName(), 1);
					eTLWidgetFieldView.setSortType(0);
					widgetFields.add(eTLWidgetFieldView);
					ETLWidgetDepsView eTLWidgetDepsView = new ETLWidgetDepsView(fromFieldUid, col.getColumnName(),
							ctx.uuid, col.getColumnName());
					widgetDeps.add(eTLWidgetDepsView);
				}
				e.getWidget().setIsReusable(0);
				System.out.println();
			}
		}
		if (isExpression) {
			System.out.println("表达式节点：");
			System.out.println("上一个节点uuid： " + ctx.uuid);
			System.out.println("上一个节点的字段");
			for (Column col : columnSetUsed) {
				col.setExp(col.getColumnName());
				System.out.println(col.getColumnName());
			}
			for (Column col : columnRealList) {
				if (col.getAlias() != "") {
					for (Column col1 : columnSetUsed) {
						if (col1.getColumnName().equals(col.getAlias())) {
							col1.setExp(col.getExp());
							col.setContained(true);
							columnOutList.add(col1);
						}
					}
				}
			}
			Set<String> colSet = new HashSet<String>();
			System.out.println("当前节点的字段");
			for (Column col : columnSetUsed) {
				System.out.println(col.getColumnName() + " 表达式 " + col.getExp());
				colSet.add(col.getColumnName());
			}
			String field = "NewField", tmp = "NewField1";
			int i = 1;
			for (Column col : columnRealList) {
				if (!col.isContained()) {
					if (col.getAlias() != "") {
						tmp = col.getAlias();
					} else
						while (colSet.contains(tmp)) {
							tmp = field + i;
							i++;
						}
					colSet.add(tmp);
					col.setColumnName(tmp);
					columnOutList.add(col);
					System.out.println(tmp + " 表达式 " + col.getExp());
				}
			}
			ctx.columnList = columnOutList;
			ctx.uuid = UUID.randomUUID().toString();
			System.out.println("当前节点uuid： " + ctx.uuid);
			System.out.println();
		}
	}

	private Set<Column> visitOrderBy(sqlParser.OrderByClauseContext orderByClause) {
		// TODO Auto-generated method stub
		Set<Column> hs = new HashSet<Column>();
		if (orderByClause != null) {
			for (sqlParser.OrderItemContext item : orderByClause.orderList().orderItem()) {
				hs.addAll(visitFieldExpression(item.fieldExpression()));
			}
		}
		return hs;
	}

	private void printOrderBy(sqlParser.OrderByClauseContext orderByClause) {
		// TODO Auto-generated method stub
		if (orderByClause != null) {
			System.out.println("排序节点");
			System.out.println("排序条件：");
			for (sqlParser.OrderItemContext item : orderByClause.orderList().orderItem()) {
				System.out.println(item.getText());
			}
		}
	}

	private void printGroupBy(sqlParser.GroupByClauseContext groupByClause) {
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
				return visitBooleanExpression(where.booleanExpression());
			} else {
				sqlParser.TopContext top = (sqlParser.TopContext) whereClause;
				return new HashSet<Column>();
			}
		}
		return new HashSet<Column>();
	}

	private void printWhere(sqlParser.WhereClauseContext whereClause, ETLWidgetInstView e) {
		// TODO Auto-generated method stub
		if (whereClause != null) {
			if (whereClause instanceof sqlParser.WhereContext) {
				sqlParser.WhereContext where = (sqlParser.WhereContext) whereClause;
				System.out.println("筛选节点");
				System.out.println("筛选条件:" + where.booleanExpression().getText());
				e.setWidgetType("m3106");
				e.setInstancName("筛选器转换1");
				ETLWidgetView widget3106 = new ETLWidgetView();
				e.setWidget(widget3106);
				widget3106.setOid(e.getOid());
				widget3106.setWidgetName("筛选器转换1");
				widget3106.setWidgetType("m3106");
				List<ETLCodeWidgetAttrView> widgetAttrs = new ArrayList<ETLCodeWidgetAttrView>();
				ETLCodeWidgetAttrView eTLCodeWidgetAttrView = new ETLCodeWidgetAttrView("m3106", 66, "2", "3", "过滤条件",
						where.booleanExpression().getText(), null, 0, 66, "筛选条件");
				eTLCodeWidgetAttrView.setAttrCode("1");
				eTLCodeWidgetAttrView.setBitflags("0");
				widgetAttrs.add(eTLCodeWidgetAttrView);
				widget3106.setWidgetAttrs(widgetAttrs);

			} else {
				sqlParser.TopContext top = (sqlParser.TopContext) whereClause;
				System.out.println("top节点");
				System.out.println("数量:" + top.getText());
			}
		}
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

	List<String> colListWXW_ANTLR_DIRECT_TEST = Arrays.asList("USER_ID", "PARTITION_ID", "BINDSALE_ATTR",
			"EXTRA_DEV_FEE", "MPFEE", "FEEITEM_CODE", "FOREGIFT", "FOREGIFT_CODE", "FOREGIFT_BACKMODE",
			"AGREEMENT_MONTHS", "END_MODE", "DEVICE_TYPE", "MOBILE_COST", "DEVICE_NAME", "DEVICE_BRAND", "IMEI",
			"LIST_BANK", "LIST_FEE", "LIST_CODE", "CREDIT_ORG", "CREDIT_TYPE", "CREDIT_CARD_NUM", "AGREEMENT",
			"PRODUCT_ID", "PACKAGE_ID", "STAFF_ID", "DEPART_ID", "START_DATE", "END_DATE", "REMARK", "ITEM_ID",
			"MONTH_ID", "DAY_ID");
	List<String> colListWXW_ANTLR_TEST = Arrays.asList("USER_ID", "PARTITION_ID", "BINDSALE_ATTR", "EXTRA_DEV_FEE",
			"MPFEE", "FEEITEM_CODE", "FOREGIFT", "FOREGIFT_CODE", "FOREGIFT_BACKMODE", "AGREEMENT_MONTHS", "END_MODE",
			"DEVICE_TYPE", "MOBILE_COST", "DEVICE_NAME", "DEVICE_BRAND", "IMEI", "LIST_BANK", "LIST_FEE", "LIST_CODE",
			"CREDIT_ORG", "CREDIT_TYPE", "CREDIT_CARD_NUM", "AGREEMENT", "PRODUCT_ID", "PACKAGE_ID", "STAFF_ID",
			"DEPART_ID", "START_DATE", "END_DATE", "REMARK", "ITEM_ID", "MONTH_ID", "DAY_ID");

	Map tableCols = new HashMap<String, List<String>>();
	{
		tableCols.put("WXW_ANTLR_DIRECT_TEST", colListWXW_ANTLR_DIRECT_TEST);
		tableCols.put("WXW_ANTLR_TEST", colListWXW_ANTLR_TEST);
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
		List<String> colList = (List<String>) tableCols
				.get(ctx.tableName().IDENTIFIER(ctx.tableName().IDENTIFIER().size() - 1).getText());
		for (String tmp : colList) {
			Column col = new Column();
			col.setColumnName(tmp);
			ctx.columnList.add(col);
		}
		ETLWidgetInstView e3101 = new ETLWidgetInstView(), e3103 = new ETLWidgetInstView();
		widgetInsts.add(e3101);
		widgetInsts.add(e3103);

		ctx.uuid = UUID.randomUUID().toString();
		e3101.setWidgetInstId(ctx.uuid);
		VertexAddrs.add(new VertexAddr(ctx.uuid, x += 50, y += 50, length, width, false));
		ctx.uuid = UUID.randomUUID().toString();
		e3103.setWidgetInstId(ctx.uuid);
		VertexAddrs.add(new VertexAddr(ctx.uuid, x += 50, y += 50, length, width, false));
		ctx.tableName = ctx.tableName().getText();
		if (ctx.alias() != null)
			ctx.alias = ctx.alias().getText();
		System.out.println("源节点：");
		System.out.print(ctx.tableName);
		System.out.println(" 别名：" + ctx.alias);
		System.out.println("当前节点uuid： " + ctx.uuid);
		System.out.println(ctx.columnList.size() + "个字段");
		visitColumnList(ctx.columnList);
		System.out.println();
		e3101.setWidgetType("m3101");
		e3101.setInstancName("a22b7bcef62f464a95af68b38e462627_1");
		ETLWidgetView widget3101 = new ETLWidgetView(), widget3103 = new ETLWidgetView();
		e3101.setWidget(widget3101);
		widget3101.setOid("88406491");
		widget3101.setWidgetName("a22b7bcef62f464a95af68b38e462627");
		widget3101.setWidgetType("m3101");
		widget3101.setModelId("m6");
		List<ETLWidgetFieldView> widgetFields = new ArrayList<ETLWidgetFieldView>();
		widget3101.setWidgetFields(widgetFields);
		for (Column col : ctx.columnList) {
			ETLWidgetFieldView eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(), col.getColumnName(),
					255, 0, 95442, 3, 0, 0, "", "", "", "", "", "", 1);
			eTLWidgetFieldView.setSortType(0);
			widgetFields.add(eTLWidgetFieldView);
		}
		widget3101.setIsReusable(0);
		widget3101.setOwner(ctx.tableName().database().getText());// 不对哦
		System.out.println(ctx.tableName().IDENTIFIER(0).getText());
		e3103.setWidgetType("m3103");
		e3103.setInstancName(ctx.tableName().IDENTIFIER(ctx.tableName().IDENTIFIER().size() - 1).getText() + "_1");
		e3103.setWidget(widget3103);
		widget3103.setOid(ctx.uuid);
		widget3103.setWidgetName(ctx.tableName().IDENTIFIER(ctx.tableName().IDENTIFIER().size() - 1).getText());
		widget3103.setWidgetType("m3103");
		widget3103.setModelId("m6");
		List<ETLCodeWidgetAttrView> widgetAttrs = new ArrayList<ETLCodeWidgetAttrView>();
		ETLCodeWidgetAttrView eTLCodeWidgetAttrView = new ETLCodeWidgetAttrView();
		eTLCodeWidgetAttrView.setObjectType("m3103");
		eTLCodeWidgetAttrView.setAttrId(51);
		eTLCodeWidgetAttrView.setAttrType("3");
		eTLCodeWidgetAttrView.setAttrName("预处理脚本");
		eTLCodeWidgetAttrView.setParentId(0);
		eTLCodeWidgetAttrView.setOrd(1);
		eTLCodeWidgetAttrView.setAttrComment(
				"可以设置合理的分区、索引、排序条件，有助于提高执行效率.例如 month_id='201611' 或者 limit 10 或者order by ID .源转换是hive表并且执行引擎为pig的情况不支持预处理脚本");
		eTLCodeWidgetAttrView.setAttrCode("1");
		eTLCodeWidgetAttrView.setBitflags("0");
		eTLCodeWidgetAttrView.setAttrDataType("3");
		widgetAttrs.add(eTLCodeWidgetAttrView);
		ETLCodeWidgetAttrView eTLCodeWidgetAttrView3 = new ETLCodeWidgetAttrView();
		eTLCodeWidgetAttrView3.setObjectType("m3103");
		eTLCodeWidgetAttrView3.setAttrId(226);
		eTLCodeWidgetAttrView3.setAttrType("3");
		eTLCodeWidgetAttrView3.setAttrDataType("3");
		eTLCodeWidgetAttrView3.setAttrName("分区");
		eTLCodeWidgetAttrView3.setParentId(0);
		eTLCodeWidgetAttrView3.setOrd(10);
		eTLCodeWidgetAttrView3.setAttrComment("源是kafka是可以通过此属性指定读取分区值，值要是数值类型");
		eTLCodeWidgetAttrView3.setAttrCode("10");
		eTLCodeWidgetAttrView3.setBitflags("0");
		widgetAttrs.add(eTLCodeWidgetAttrView3);
		ETLCodeWidgetAttrView eTLCodeWidgetAttrView1 = new ETLCodeWidgetAttrView();
		eTLCodeWidgetAttrView1.setObjectType("m3103");
		eTLCodeWidgetAttrView1.setAttrId(227);
		eTLCodeWidgetAttrView1.setAttrType("3");
		eTLCodeWidgetAttrView1.setAttrName("源对象名称");
		eTLCodeWidgetAttrView1
				.setAttrVal(ctx.tableName().IDENTIFIER(ctx.tableName().IDENTIFIER().size() - 1).getText());
		eTLCodeWidgetAttrView1.setParentId(0);
		eTLCodeWidgetAttrView1.setOrd(11);
		eTLCodeWidgetAttrView1.setAttrComment("若是文件，文件名称支持正则表达式");
		eTLCodeWidgetAttrView1.setAttrCode("11");
		eTLCodeWidgetAttrView1.setBitflags("0");
		eTLCodeWidgetAttrView1.setAttrDataType("3");
		widgetAttrs.add(eTLCodeWidgetAttrView1);
		ETLCodeWidgetAttrView eTLCodeWidgetAttrView2 = new ETLCodeWidgetAttrView();
		eTLCodeWidgetAttrView2.setObjectType("m3103");
		eTLCodeWidgetAttrView2.setAttrId(240);
		eTLCodeWidgetAttrView2.setAttrType("3");
		eTLCodeWidgetAttrView2.setAttrDataType("3");
		eTLCodeWidgetAttrView2.setAttrName("表的所属用户");
		eTLCodeWidgetAttrView2.setAttrVal(ctx.tableName().database().getText());
		eTLCodeWidgetAttrView2.setParentId(0);
		eTLCodeWidgetAttrView2.setOrd(12);
		eTLCodeWidgetAttrView2.setAttrComment("表的所属用户");
		eTLCodeWidgetAttrView2.setAttrCode("12");
		eTLCodeWidgetAttrView2.setBitflags("0");
		widgetAttrs.add(eTLCodeWidgetAttrView2);
		widget3103.setWidgetAttrs(widgetAttrs);
		List<ETLWidgetFieldView> widgetFields3103 = new ArrayList<ETLWidgetFieldView>();
		widget3103.setWidgetFields(widgetFields3103);
		for (Column col : ctx.columnList) {
			ETLWidgetFieldView eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(), col.getColumnName(),
					255, 0, 95442, 3, 0, 0, "", "", "", "", "", "", 1);
			eTLWidgetFieldView.setSortType(0);
			widgetFields3103.add(eTLWidgetFieldView);
			ETLWidgetDepsView eTLWidgetDepsView = new ETLWidgetDepsView(e3101.getWidgetInstId(), col.getColumnName(),
					e3103.getWidgetInstId(), col.getColumnName());
			widgetDeps.add(eTLWidgetDepsView);
		}
		widget3103.setIsReusable(0);
		widget3103.setOwner(ctx.tableName().database().getText());// 不对哦
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