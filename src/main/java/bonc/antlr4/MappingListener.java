
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

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.bonc.dataplatform.repository.mapping.vo.ETLCodeWidgetAttrView;
import com.bonc.dataplatform.repository.mapping.vo.ETLMappingProxyResource;
import com.bonc.dataplatform.repository.mapping.vo.ETLMappingView;
import com.bonc.dataplatform.repository.mapping.vo.ETLWidgetDepsView;
import com.bonc.dataplatform.repository.mapping.vo.ETLWidgetFieldView;
import com.bonc.dataplatform.repository.mapping.vo.ETLWidgetInstView;
import com.bonc.dataplatform.repository.mapping.vo.ETLWidgetMulJoinConditionsView;
import com.bonc.dataplatform.repository.mapping.vo.ETLWidgetUnionGroupView;
import com.bonc.dataplatform.repository.mapping.vo.ETLWidgetView;
import com.bonc.dataplatform.repository.workflow.vo.ETLCodeAttrValView;
import com.thoughtworks.xstream.XStream;

import bonc.antlr4.entity.VertexAddr;
import bonc.antlr4.service.SourceNodeService;
import bonc.antlr4.service.SourceQulifierNodeService;
import bonc.antlr4.sqlParser.GroupByClauseContext;
import bonc.antlr4.entity.Column;
import bonc.antlr4.entity.Count;
import net.sf.json.JSONObject;

//尽量对于每个节点只对其父节点和子节点进行操作，防止太复杂。
//对于语法规则有多个分支的情况，该规则对于外层的规则来说，不管什么分支，表现应一样
public class MappingListener extends sqlBaseListener {
	ETLMappingView etl = new ETLMappingView();
	List<ETLWidgetInstView> widgetInsts = new ArrayList<ETLWidgetInstView>();
	List<ETLWidgetDepsView> widgetDeps = new ArrayList<ETLWidgetDepsView>();
	List<VertexAddr> VertexAddrs = new ArrayList<VertexAddr>();
	Map<String, Count> nodeName = new HashMap<String, Count>();
	Map<String, String> joinType = new HashMap<String, String>();
	{
		nodeName.put("m3106", new Count());
		nodeName.put("m3102", new Count());
		nodeName.put("m3101", new Count());
		nodeName.put("m3105", new Count());
		nodeName.put("m3107", new Count());
		nodeName.put("m3122", new Count());
		nodeName.put("m3126", new Count());
		nodeName.put("m3111", new Count());
		joinType.put("inner", "1");
		joinType.put("left", "2");
		joinType.put("right", "3");
		joinType.put("full", "4");
		joinType.put("Inner Join And Replicated Join", "5");
		joinType.put("Inner Join And Skewed Join", "6");
		joinType.put("Inner Join And Merge Join", "7");
		joinType.put("Left Join And Replicated Join", "8");
	}
	String vertexId;
	int x = 300;
	int y = 200;
	int length = 150;
	int width = 200;
	boolean isExpand;
	{
		etl.setOid("f03427ae-53f2-472c-bc44-d2344c04396a");
		etl.setMappingName("join");
		etl.setExecuteType(0);
		ETLMappingProxyResource proxyResource = new ETLMappingProxyResource();
		proxyResource.setPort(0);
		etl.setProxyResource(proxyResource);
		etl.setMappingType(0);
		etl.setDirId("88084829");
		etl.setWidgetInsts(widgetInsts);
		etl.setWidgetDeps(widgetDeps);
	}

	public void exitProg(sqlParser.ProgContext ctx) {
		XStream xstream = new XStream();
		xstream.alias("VertexAddrs", List.class);
		xstream.alias("VertexAddr", VertexAddr.class);
		xstream.autodetectAnnotations(true);
		StringBuilder sb = new StringBuilder(
				"<?xml version=\"1.0\"?><VertexsAddr xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">");
		sb.append(xstream.toXML(VertexAddrs));
		sb.append("</VertexsAddr>");
		etl.setCoord(sb.toString().replace("\n", ""));
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
		List<String> colList = tableCols.get(ctx.insertClause().tableName().IDENTIFIER().getText());
		System.out.println("当前节点字段:");
		for (String tmp : colList) {
			Column col = new Column();
			col.setColumnName(tmp);
			ctx.columnList.add(col);
		}
		visitColumnList(ctx.columnList);
		e.setWidgetInstId(ctx.uuid);
		VertexAddrs.add(new VertexAddr(ctx.uuid, x += 100, y, length, width, false));
		e.setWidgetType("m3102");
		e.setInstancName(ctx.insertClause().tableName().IDENTIFIER().getText() + "_1");
		ETLWidgetView widget = new ETLWidgetView();
		e.setWidget(widget);
		widget.setOid("88406570");
		widget.setWidgetName(ctx.insertClause().tableName().IDENTIFIER().getText());
		widget.setWidgetType("m3102");
		widget.setModelId("m6");

		List<ETLCodeWidgetAttrView> widgetAttrs = new ArrayList<ETLCodeWidgetAttrView>();
		widget.setWidgetAttrs(widgetAttrs);
		ETLCodeWidgetAttrView eTLCodeWidgetAttrView = new ETLCodeWidgetAttrView("m3102", 34, "4", "3", "目标对象名称",
				ctx.insertClause().tableName().IDENTIFIER().getText(), null, 0, 34, "目标对象名称");
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
					255, 0, 95442, 3, 0, 0, null, null, null, null, null, null, 1);
			eTLWidgetFieldView.setSortType(0);
			widgetFields.add(eTLWidgetFieldView);
		}
		widget.setIsReusable(0);
		List<Column> tmpList = visitInsertClause(ctx.insertClause());
		if (tmpList != null) {
			ctx.columnList = tmpList;
		}
		widget.setOwner(ctx.insertClause().tableName().database().getText());// 不对哦
		if (ctx.columnList.size() != ctx.selectStatement().columnList.size()) {
			System.out.println(
					ctx.columnList.size() + " " + ctx.selectStatement().columnList.size() + "insert子句和select子句的字段数量不同");
			return;
		}
		for (int i = 0; i < ctx.selectStatement().columnList.size(); i++) {
			ETLWidgetDepsView eTLWidgetDepsView = new ETLWidgetDepsView(fromFieldUid,
					ctx.selectStatement().columnList.get(i).getColumnName(), ctx.uuid,
					ctx.columnList.get(i).getColumnName());
			widgetDeps.add(eTLWidgetDepsView);
		}
	}

	private void visitColumnList(List<Column> columnList) {
		System.out.println("字段：");
		for (Column column : columnList) {
			System.out.println(column.getColumnName());
		}
	}

	private void visitColumnList(Set<Column> columnSet) {
		System.out.println("字段：");
		for (Column column : columnSet) {
			System.out.println(column.getColumnName());
		}
	}

	public void exitUnion(sqlParser.UnionContext ctx) {
		ctx.columnList = ctx.unionQuery().columnList;
		ctx.uuid = ctx.unionQuery().uuid;
		if (ctx.orderByClause() != null) {
			visitOrderBy(ctx.orderByClause());
			System.out.println("上一节点uuid:" + ctx.uuid);
			visitColumnList(ctx.columnList);
			ctx.uuid = UUID.randomUUID().toString();
			System.out.println("当前节点uuid:" + ctx.uuid);
			visitColumnList(ctx.columnList);
		}
	}

	public void exitSelect(sqlParser.SelectContext ctx) {
		ctx.columnList = ctx.selectQueryBlock().columnList;
		ctx.uuid = ctx.selectQueryBlock().uuid;
	}

	private List<Column> visitInsertClause(sqlParser.InsertClauseContext insertClause) {
		// TODO Auto-generated method stub
		if (insertClause.columnlist() != null) {
			List<Column> columnList = new ArrayList<Column>();
			for (sqlParser.ColumnContext column : insertClause.columnlist().column()) {
				Column col = new Column(column.fieldExpression().fieldName().getText());
				columnList.add(col);
			}
			return columnList;
		} else
			return null;
	}

	public void exitUnionQuery(sqlParser.UnionQueryContext ctx) {
		List<Column> columnListMore = new ArrayList<Column>();
		List<sqlParser.SelectQueryBlock1Context> list = ctx.selectQueryBlock1();
		System.out.println("联合节点");
		ETLWidgetInstView e = new ETLWidgetInstView();
		widgetInsts.add(e);
		e.setWidgetType("m3122");
		int idex = nodeName.get("m3122").getI();
		e.setInstancName("联合转换" + idex);
		ETLWidgetView widget3122 = new ETLWidgetView();
		e.setWidget(widget3122);
		widget3122.setOid(e.getOid());
		widget3122.setWidgetName("联合转换" + idex);
		nodeName.get("m3122").setI(++idex);
		widget3122.setWidgetType("m3122");
		widget3122.setIsReusable(0);
		for (int i = 0; i < list.size(); i++) {
			ctx.columnList = list.get(i).columnList;
			ctx.uuid = list.get(i).uuid;
			System.out.println("第" + (i + 1) + "个前节点uuid:" + ctx.uuid);
			visitColumnList(ctx.columnList);
		}
		ctx.uuid = UUID.randomUUID().toString();
		System.out.println("当前节点uuid:" + ctx.uuid);
		VertexAddrs.add(new VertexAddr(ctx.uuid, x += 100, y, length, width, false));
		e.setOid(ctx.uuid);
		e.setWidgetInstId(ctx.uuid);
		widget3122.setOid(ctx.uuid);
		List<ETLWidgetFieldView> widgetFields = new ArrayList<ETLWidgetFieldView>();
		widget3122.setWidgetFields(widgetFields);
		List<ETLWidgetUnionGroupView> groups = new ArrayList<ETLWidgetUnionGroupView>();
		widget3122.setGroups(groups);

		// 当前字段列是第一个来源表的列。
		columnListMore = list.get(0).columnList;
		ETLWidgetFieldView eTLWidgetFieldView = null;
		eTLWidgetFieldView = new ETLWidgetFieldView("输出", "输出", 999, 0, 0, 0, 0, 0, null, null, null, "输出", null, null,
				999);
		eTLWidgetFieldView.setSortType(0);
		widgetFields.add(eTLWidgetFieldView);
		groups.add(new ETLWidgetUnionGroupView("输出", "输出"));
		for (Column col : columnListMore) {
			eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(), col.getColumnName(), 255, 0, 95442, 2, 0,
					0, null, null, null, "输出", null, null, 1);
			eTLWidgetFieldView.setSortType(0);
			widgetFields.add(eTLWidgetFieldView);
		}
		for (int j = 0; j < list.size(); j++) {
			eTLWidgetFieldView = new ETLWidgetFieldView("输入" + j + 1, "输入" + j + 1, 999, 0, 0, 1, 0, 0, null, null,
					"输入" + j + 1, null, null, null, 999);
			eTLWidgetFieldView.setSortType(0);
			widgetFields.add(eTLWidgetFieldView);
			groups.add(new ETLWidgetUnionGroupView("输入" + j + 1, "新增加的分组"));
			String fromUuid = list.get(j).uuid;
			List<Column> fromColList = list.get(j).columnList;
			for (int i = 0; i < columnListMore.size(); i++) {
				eTLWidgetFieldView = new ETLWidgetFieldView(columnListMore.get(i).getColumnName() + "#" + j + 1,
						columnListMore.get(i).getColumnName() + "#" + j + 1, 255, 0, 95442, 1, 0, 0, null, null,
						"输入" + j + 1, null, null, null, 1);
				eTLWidgetFieldView.setSortType(0);
				widgetFields.add(eTLWidgetFieldView);
				ETLWidgetDepsView eTLWidgetDepsView = new ETLWidgetDepsView(fromUuid,
						fromColList.get(i).getColumnName(), ctx.uuid,
						columnListMore.get(i).getColumnName() + "#" + j + 1);
				widgetDeps.add(eTLWidgetDepsView);
			}
		}
		ctx.columnList = columnListMore;
		visitColumnList(columnListMore);
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
			sqlParser.IdentifierFieldContext identifier = (sqlParser.IdentifierFieldContext) fieldExpression
					.fieldName();
			col.setColumnName(identifier.IDENTIFIER().getText());
			if (identifier.tableName() != null)
				col.setTableOrAlias(identifier.tableName().getText());
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

	public void exitSelectQueryBlock(sqlParser.SelectQueryBlockContext ctx) {
		ctx.uuid = ctx.fromClause().tableSource().uuid;
		List<Column> columnRealList = new ArrayList<Column>();
		List<Column> columnOutList = new ArrayList<Column>();
		Set<Column> columnSetUsed = new HashSet<Column>();// 当前select块需要的from字句的字段，作为表达式节点的端口（表达式节点的端口不允许重复），因此不支持SELECT
															// USER_ID PACKAGE_ID,PACKAGE_ID PACKAGE_ID FROM
															// WXWTEST.TEMP
		boolean isExpression = false, isGroupBy = false;
		sqlParser.SelectQueryBlockContext ctxChange = ctx;
		if (ctx.fromClause().tableSource() != null) {
			if (ctx.fromClause().tableSource() instanceof sqlParser.SelectjoinContext) {
				List<Column> columnList = ctx.fromClause().tableSource().columnList;
				ParseTreeWalker walker = new ParseTreeWalker();
				ChangeIdentifierField listen = new ChangeIdentifierField(columnList);
				walker.walk(listen, ctx);
				System.out.println(listen.toExp);
				sqlLexer lexer = new sqlLexer(new ANTLRInputStream(listen.toExp));
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				sqlParser parser = new sqlParser(tokens);
				ctxChange = parser.selectQueryBlock();
			}
			for (sqlParser.ColumnContext columnContext : ctxChange.selectClause().columnlist().column()) {
				Column col1 = new Column(), col2 = new Column();
				if (columnContext.fieldExpression().allFields() == null) {
					if (columnContext.fieldExpression().fieldName() == null || !(columnContext.fieldExpression()
							.fieldName() instanceof sqlParser.IdentifierFieldContext)) {
						columnSetUsed.addAll(visitFieldExpression(columnContext.fieldExpression()));
						isExpression = true;
						col2.setExp(columnContext.fieldExpression().getText());
						if (columnContext.alias() != null) { // 有别名的设置，没有的这里也没有什么好办法,暂时和columnName一样。
							col2.setAlias(columnContext.alias().getText());
						} else {
							col2.setAlias("");
						}
					} else {
						sqlParser.IdentifierFieldContext identifier = (sqlParser.IdentifierFieldContext) columnContext
								.fieldExpression().fieldName();
						col1.setColumnName(identifier.IDENTIFIER().getText());
						if (identifier.tableName() != null)
							col1.setTableOrAlias(identifier.tableName().getText());
						columnSetUsed.add(col1);
						col2.setExp(columnContext.fieldExpression().fieldName().getText());
						col2.setColumnName(col2.getExp());
						if (columnContext.alias() != null) { // 有别名的设置，没有的这里也没有什么好办法,暂时和columnName一样。
							col2.setAlias(columnContext.alias().getText());
							col2.setAggregate(columnContext.fieldExpression().isContainAggMethod);
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
		Set<Column> groupSet = null;
		if (ctx.selectAction() != null) {
			for (sqlParser.SelectActionContext selectAction : ctxChange.selectAction()) {
				for (Column col : visitWhere(selectAction.whereClause())) {
					if (!columnSetUsed.contains(col))
						columnSetUsed.add(col);
				}
				for (Column col : visitOrderBy(selectAction.orderByClause())) {
					if (!columnSetUsed.contains(col))
						columnSetUsed.add(col);
				}
				isGroupBy = (groupSet = visitGroupBy(selectAction.groupByClause())) != null;
			}
		}
		if (ctx.fromClause().tableSource() instanceof sqlParser.SelectjoinContext) {
			ctx.uuid = UUID.randomUUID().toString();
			List<Column> columnList = ctx.fromClause().tableSource().columnList;
			sqlParser.SelectjoinContext selectjoin = (sqlParser.SelectjoinContext) ctx.fromClause().tableSource();
			List<sqlParser.TableSourceContext> tablesList = selectjoin.tableSource();
			List<sqlParser.Join_typeContext> join_typeList = selectjoin.join_type();
			for (Column col : columnSetUsed) {
				if (col.getTableOrAlias().equals("")) {
					for (Column col1 : columnList) {
						if (col.getColumnName().equals(col1.getColumnName())) {
							col.setTableOrAlias(col1.getTableOrAlias());
							col.setColumnNamealias(col1.getColumnNamealias());
						}
					}
				}
			}
			ETLWidgetInstView e = new ETLWidgetInstView();
			e.setOid(ctx.uuid);
			e.setWidgetInstId(ctx.uuid);
			VertexAddrs.add(new VertexAddr(ctx.uuid, x += 100, y, length, width, false));
			Map<String, String> aliasUuid = new HashMap<String, String>();
			System.out.println("来源uuid：");
			for (sqlParser.TableSourceContext table : tablesList) {
				System.out.print(table.alias + "    ||    ");
				System.out.println(table.uuid);
				aliasUuid.put(table.alias, table.uuid);// 需要改
			}
			if (join_typeList.size() == 1) {
				System.out.println("连接节点");
				widgetInsts.add(e);
				e.setWidgetType("m3111");
				int idex = nodeName.get("m3111").getI();
				e.setInstancName("连接转换" + idex);
				ETLWidgetView widget3111 = new ETLWidgetView();
				e.setWidget(widget3111);
				widget3111.setOid(e.getOid());
				widget3111.setWidgetName("连接转换" + idex);
				nodeName.get("m3111").setI(++idex);
				widget3111.setWidgetType("m3111");
				widget3111.setIsReusable(0);
				widget3111.setOid(ctx.uuid);
				ParseTreeWalker walker = new ParseTreeWalker();
				BooleanExpChange listen = new BooleanExpChange(selectjoin.columnList);
				walker.walk(listen, selectjoin.booleanExpression(0));
				List<ETLCodeWidgetAttrView> widgetAttrs = new ArrayList<ETLCodeWidgetAttrView>();
				ETLCodeWidgetAttrView eTLCodeWidgetAttrView = new ETLCodeWidgetAttrView("m3111", 126, "2", "3", "连接条件",
						listen.toExp, null, 0, 126, "连接条件,由关联设置自动生成，无效手动填写。");
				eTLCodeWidgetAttrView.setAttrCode("3");
				eTLCodeWidgetAttrView.setBitflags("0");
				widgetAttrs.add(eTLCodeWidgetAttrView);
				List<ETLCodeAttrValView> attrValScope = new ArrayList<ETLCodeAttrValView>();
				attrValScope.add(new ETLCodeAttrValView("1", "Inner Join"));
				attrValScope.add(new ETLCodeAttrValView("2", "Left Join"));
				attrValScope.add(new ETLCodeAttrValView("3", "Right Join"));
				attrValScope.add(new ETLCodeAttrValView("4", "Full Join"));
				attrValScope.add(new ETLCodeAttrValView("5", "Inner Join And Replicated Join"));
				attrValScope.add(new ETLCodeAttrValView("6", "Inner Join And Skewed Join"));
				attrValScope.add(new ETLCodeAttrValView("7", "Inner Join And Merge Join"));
				attrValScope.add(new ETLCodeAttrValView("8", "Left Join And Replicated Join"));
				eTLCodeWidgetAttrView = new ETLCodeWidgetAttrView("m3111", 127, "6", "1", "连接类型",
						joinType.get(join_typeList.get(0).getText()), attrValScope, 0, 127, "连接类型,由关联设置自动生成，无效手动填写。");
				eTLCodeWidgetAttrView.setAttrCode("4");
				eTLCodeWidgetAttrView.setBitflags("0");
				widgetAttrs.add(eTLCodeWidgetAttrView);
				widget3111.setWidgetAttrs(widgetAttrs);
				List<ETLWidgetFieldView> widgetFields = new ArrayList<ETLWidgetFieldView>();
				e.getWidget().setWidgetFields(widgetFields);
				String tmp = tablesList.get(0).alias;
				ETLWidgetFieldView eTLWidgetFieldView = null;
				for (Column col : columnSetUsed) {
					if (tmp.equals(col.getTableOrAlias())) {
						eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnNamealias(), col.getColumnNamealias(),
								255, 0, 95442, 3, 0, 0, null, null, null, null, null, null, 1);
					} else {
						eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnNamealias(), col.getColumnNamealias(),
								255, 0, 95442, 35, 0, 0, null, null, null, null, null, null, 1);
					}
					eTLWidgetFieldView.setSortType(0);
					widgetFields.add(eTLWidgetFieldView);
					ETLWidgetDepsView eTLWidgetDepsView = new ETLWidgetDepsView(aliasUuid.get(col.getTableOrAlias()),
							col.getColumnName(), ctx.uuid, col.getColumnName());
					widgetDeps.add(eTLWidgetDepsView);
				}
			} else {
				System.out.println("多连接节点");
				widgetInsts.add(e);
				e.setWidgetType("m3126");
				int idex = nodeName.get("m3126").getI();
				e.setInstancName("多表连接转换" + idex);
				ETLWidgetView widget3126 = new ETLWidgetView();
				e.setWidget(widget3126);
				widget3126.setOid(e.getOid());
				widget3126.setWidgetName("多表连接转换" + idex);
				nodeName.get("m3126").setI(++idex);
				widget3126.setWidgetType("m3126");
				widget3126.setIsReusable(0);
				widget3126.setOid(ctx.uuid);
				List<ETLWidgetMulJoinConditionsView> conditions = new ArrayList<ETLWidgetMulJoinConditionsView>();
				widget3126.setConditions(conditions);
				for (int i = 0; i < join_typeList.size(); i++) {
					ParseTreeWalker walker = new ParseTreeWalker();
					BooleanExpChange listen = new BooleanExpChange(selectjoin.columnList);
					walker.walk(listen, selectjoin.booleanExpression(i));
					if (listen.tableSet.size() != 2) {
						System.out.println("join条件包含的字段需来源于关联的两个表");
						return;
					}
					String[] table = new String[listen.tableSet.size()];
					listen.tableSet.toArray(table);
					conditions.add(new ETLWidgetMulJoinConditionsView(aliasUuid.get(table[0]),
							join_typeList.get(i).getText() + " Join", aliasUuid.get(table[1]), listen.toExp));
				}
				List<ETLWidgetFieldView> widgetFields = new ArrayList<ETLWidgetFieldView>();
				e.getWidget().setWidgetFields(widgetFields);
				ETLWidgetFieldView eTLWidgetFieldView = null;
				for (Column col : columnSetUsed) {
					eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnNamealias(), col.getColumnNamealias(), 255,
							0, 95442, 3, 0, 0, null, null, null, null, null, col.getColumnName(), 1);
					eTLWidgetFieldView.setSortType(0);
					widgetFields.add(eTLWidgetFieldView);
					System.out.println(col.getTableOrAlias());
					System.out.println(aliasUuid.get(col.getTableOrAlias()));
					ETLWidgetDepsView eTLWidgetDepsView = new ETLWidgetDepsView(aliasUuid.get(col.getTableOrAlias()),
							col.getColumnName(), ctx.uuid, col.getColumnName());
					widgetDeps.add(eTLWidgetDepsView);
				}
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
		} else {
			String tableAlias = ctx.fromClause().tableSource().alias;
			for (Column col : columnSetUsed)
				col.setTableOrAlias(tableAlias);
			for (Column col : columnRealList)
				col.setTableOrAlias(tableAlias);
		}
		if (ctx.selectAction() != null) {
			for (sqlParser.SelectActionContext selectAction : ctx.selectAction()) {
				ETLWidgetInstView e = new ETLWidgetInstView();
				widgetInsts.add(e);
				// printGroupBy(selectAction.groupByClause());
				printWhere(selectAction.whereClause(), e);
				// printOrderBy(selectAction.orderByClause(),e);
				if (selectAction.groupByClause() == null) {
					System.out.println("上一个节点uuid： " + ctx.uuid);
					String fromFieldUid = ctx.uuid;
					visitColumnList(columnSetUsed);
					ctx.uuid = UUID.randomUUID().toString();
					System.out.println("当前节点uuid： " + ctx.uuid);
					VertexAddrs.add(new VertexAddr(ctx.uuid, x += 100, y, length, width, false));
					e.setOid(ctx.uuid);
					e.setWidgetInstId(ctx.uuid);
					e.getWidget().setOid(ctx.uuid);
					visitColumnList(columnSetUsed);
					List<ETLWidgetFieldView> widgetFields = new ArrayList<ETLWidgetFieldView>();
					e.getWidget().setWidgetFields(widgetFields);
					for (Column col : columnSetUsed) {
						ETLWidgetFieldView eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(),
								col.getColumnName(), 255, 0, 95442, 3, 0, 0, null, null, null, null, null,
								col.getColumnName(), 1);
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
		}
		if (isExpression && !isGroupBy) {
			System.out.println("表达式节点：");
			System.out.println("上一个节点uuid： " + ctx.uuid);
			ETLWidgetInstView e = new ETLWidgetInstView();
			widgetInsts.add(e);
			String fromFieldUid = ctx.uuid;
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
			e.setWidgetType("m3105");
			int idex = nodeName.get("m3105").getI();
			e.setInstancName("表达式转换" + idex);
			ETLWidgetView widget3105 = new ETLWidgetView();
			e.setWidget(widget3105);
			widget3105.setOid(e.getOid());
			widget3105.setWidgetName("表达式转换" + idex);
			nodeName.get("m3105").setI(++idex);
			widget3105.setWidgetType("m3105");
			widget3105.setIsReusable(0);
			System.out.println("当前节点的字段");
			List<ETLWidgetFieldView> widgetFields = new ArrayList<ETLWidgetFieldView>();
			e.getWidget().setWidgetFields(widgetFields);
			ctx.uuid = UUID.randomUUID().toString();
			for (Column col : columnSetUsed) {
				ETLWidgetFieldView eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(), col.getColumnName(),
						255, 0, 95442, 3, 0, 0, null, null, null, null, null, col.getExp(), 1);
				eTLWidgetFieldView.setSortType(0);
				widgetFields.add(eTLWidgetFieldView);
				ETLWidgetDepsView eTLWidgetDepsView = new ETLWidgetDepsView(fromFieldUid, col.getColumnName(), ctx.uuid,
						col.getColumnName());
				widgetDeps.add(eTLWidgetDepsView);
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
					ETLWidgetFieldView eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(),
							col.getColumnName(), 255, 0, 95442, 3, 0, 0, null, null, null, null, null, col.getExp(), 1);
					eTLWidgetFieldView.setSortType(0);
					widgetFields.add(eTLWidgetFieldView);
					System.out.println(tmp + " 表达式 " + col.getExp());
				}
			}
			ctx.columnList = columnOutList;
			System.out.println("当前节点uuid： " + ctx.uuid);
			VertexAddrs.add(new VertexAddr(ctx.uuid, x += 100, y, length, width, false));
			e.setOid(ctx.uuid);
			e.setWidgetInstId(ctx.uuid);
			e.getWidget().setOid(ctx.uuid);
			System.out.println();
		}
		if (isExpression && isGroupBy) {
			System.out.println("汇总节点：");
			System.out.println("上一个节点uuid： " + ctx.uuid);
			ETLWidgetInstView e = new ETLWidgetInstView();
			widgetInsts.add(e);
			String fromFieldUid = ctx.uuid;
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
			e.setWidgetType("m3107");
			int idex = nodeName.get("m3107").getI();
			e.setInstancName("汇总转换" + idex);
			ETLWidgetView widget3107 = new ETLWidgetView();
			e.setWidget(widget3107);
			widget3107.setOid(e.getOid());
			widget3107.setWidgetName("汇总转换" + idex);
			nodeName.get("m3107").setI(++idex);
			widget3107.setWidgetType("m3107");
			List<ETLCodeWidgetAttrView> widgetAttrs = new ArrayList<ETLCodeWidgetAttrView>();
			List<ETLCodeAttrValView> attrValScope = new ArrayList<ETLCodeAttrValView>();
			attrValScope.add(new ETLCodeAttrValView("0", "否"));
			attrValScope.add(new ETLCodeAttrValView("1", "是"));
			ETLCodeWidgetAttrView eTLCodeWidgetAttrView = new ETLCodeWidgetAttrView("m3107", 228, "6", "1", "是否按所有字段分组",
					"0", attrValScope, 0, 228, "是否按所有字段分组");
			eTLCodeWidgetAttrView.setAttrCode("7");
			eTLCodeWidgetAttrView.setBitflags("0");
			widgetAttrs.add(eTLCodeWidgetAttrView);
			widget3107.setWidgetAttrs(widgetAttrs);
			widget3107.setIsReusable(0);
			System.out.println("当前节点的字段");
			List<ETLWidgetFieldView> widgetFields = new ArrayList<ETLWidgetFieldView>();
			e.getWidget().setWidgetFields(widgetFields);
			ctx.uuid = UUID.randomUUID().toString();
			for (Column col : columnSetUsed) {
				int expType = groupSet.contains(col) ? 46 : 1;
				ETLWidgetFieldView eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(), col.getColumnName(),
						255, 0, 95442, 3, 0, 0, null, null, null, null, null, col.getExp(), expType);
				eTLWidgetFieldView.setSortType(0);
				widgetFields.add(eTLWidgetFieldView);
				ETLWidgetDepsView eTLWidgetDepsView = new ETLWidgetDepsView(fromFieldUid, col.getColumnName(), ctx.uuid,
						col.getColumnName());
				widgetDeps.add(eTLWidgetDepsView);
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
					ETLWidgetFieldView eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(),
							col.getColumnName(), 255, 0, 95442, 3, 0, 0, null, null, null, null, null, col.getExp(), 1);
					eTLWidgetFieldView.setSortType(0);
					widgetFields.add(eTLWidgetFieldView);
					System.out.println(tmp + " 表达式 " + col.getExp());
				}
			}
			ctx.columnList = columnOutList;
			VertexAddrs.add(new VertexAddr(ctx.uuid, x += 100, y, length, width, false));
			e.setOid(ctx.uuid);
			e.setWidgetInstId(ctx.uuid);
			e.getWidget().setOid(ctx.uuid);
			System.out.println("当前节点uuid： " + ctx.uuid);
			System.out.println();
		}
	}

	public void exitSelectQueryBlock1(sqlParser.SelectQueryBlock1Context ctx) {
		ctx.uuid = ctx.fromClause().tableSource().uuid;
		// 填节点的字段
		// 填当前节点的
		List<Column> columnRealList = new ArrayList<Column>();
		List<Column> columnOutList = new ArrayList<Column>();
		Set<Column> columnSetUsed = new HashSet<Column>();// 当前select块需要的from字句的字段，作为表达式节点的端口（表达式节点的端口不允许重复），因此不支持SELECT
															// USER_ID PACKAGE_ID,PACKAGE_ID PACKAGE_ID FROM
															// WXWTEST.TEMP
		boolean isExpression = false, isGroupBy = false;
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
							col2.setAggregate(columnContext.fieldExpression().isContainAggMethod);
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
		} else {

		}
		Set<Column> groupSet = null;
		if (ctx.selectAction1() != null) {
			for (sqlParser.SelectAction1Context selectAction : ctx.selectAction1()) {
				for (Column col : visitWhere(selectAction.whereClause())) {
					if (!columnSetUsed.contains(col))
						columnSetUsed.add(col);
				}
				isGroupBy = (groupSet = visitGroupBy(selectAction.groupByClause())) != null;
			}
			// 简单实现的，所以用了两个for循环，一个存字段，一个打印，之后是往xml对象里存，一个for就可以办到。
			for (sqlParser.SelectAction1Context selectAction : ctx.selectAction1()) {
				ETLWidgetInstView e = new ETLWidgetInstView();
				widgetInsts.add(e);
				// printGroupBy(selectAction.groupByClause());
				printWhere(selectAction.whereClause(), e);
				// printOrderBy(selectAction.orderByClause(),e);
				if (selectAction.groupByClause() == null) {
					System.out.println("上一个节点uuid： " + ctx.uuid);
					String fromFieldUid = ctx.uuid;
					visitColumnList(columnSetUsed);
					ctx.uuid = UUID.randomUUID().toString();
					System.out.println("当前节点uuid： " + ctx.uuid);
					VertexAddrs.add(new VertexAddr(ctx.uuid, x += 100, y, length, width, false));
					e.setOid(ctx.uuid);
					e.setWidgetInstId(ctx.uuid);
					e.getWidget().setOid(ctx.uuid);
					visitColumnList(columnSetUsed);
					List<ETLWidgetFieldView> widgetFields = new ArrayList<ETLWidgetFieldView>();
					e.getWidget().setWidgetFields(widgetFields);
					for (Column col : columnSetUsed) {
						ETLWidgetFieldView eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(),
								col.getColumnName(), 255, 0, 95442, 3, 0, 0, null, null, null, null, null,
								col.getColumnName(), 1);
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
		}
		if (isExpression && !isGroupBy) {
			System.out.println("表达式节点：");
			System.out.println("上一个节点uuid： " + ctx.uuid);
			ETLWidgetInstView e = new ETLWidgetInstView();
			widgetInsts.add(e);
			String fromFieldUid = ctx.uuid;
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
			e.setWidgetType("m3105");
			int idex = nodeName.get("m3105").getI();
			e.setInstancName("表达式转换" + idex);
			ETLWidgetView widget3105 = new ETLWidgetView();
			e.setWidget(widget3105);
			widget3105.setOid(e.getOid());
			widget3105.setWidgetName("表达式转换" + idex);
			nodeName.get("m3105").setI(++idex);
			widget3105.setWidgetType("m3105");
			widget3105.setIsReusable(0);
			System.out.println("当前节点的字段");
			List<ETLWidgetFieldView> widgetFields = new ArrayList<ETLWidgetFieldView>();
			e.getWidget().setWidgetFields(widgetFields);
			ctx.uuid = UUID.randomUUID().toString();
			for (Column col : columnSetUsed) {
				ETLWidgetFieldView eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(), col.getColumnName(),
						255, 0, 95442, 3, 0, 0, null, null, null, null, null, col.getExp(), 1);
				eTLWidgetFieldView.setSortType(0);
				widgetFields.add(eTLWidgetFieldView);
				ETLWidgetDepsView eTLWidgetDepsView = new ETLWidgetDepsView(fromFieldUid, col.getColumnName(), ctx.uuid,
						col.getColumnName());
				widgetDeps.add(eTLWidgetDepsView);
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
					ETLWidgetFieldView eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(),
							col.getColumnName(), 255, 0, 95442, 3, 0, 0, null, null, null, null, null, col.getExp(), 1);
					eTLWidgetFieldView.setSortType(0);
					widgetFields.add(eTLWidgetFieldView);
					System.out.println(tmp + " 表达式 " + col.getExp());
				}
			}
			ctx.columnList = columnOutList;
			System.out.println("当前节点uuid： " + ctx.uuid);
			VertexAddrs.add(new VertexAddr(ctx.uuid, x += 100, y, length, width, false));
			e.setOid(ctx.uuid);
			e.setWidgetInstId(ctx.uuid);
			e.getWidget().setOid(ctx.uuid);
			System.out.println();
		}
		if (isExpression && isGroupBy) {
			System.out.println("汇总节点：");
			System.out.println("上一个节点uuid： " + ctx.uuid);
			ETLWidgetInstView e = new ETLWidgetInstView();
			widgetInsts.add(e);
			String fromFieldUid = ctx.uuid;
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
			e.setWidgetType("m3107");
			int idex = nodeName.get("m3107").getI();
			e.setInstancName("汇总转换" + idex);
			ETLWidgetView widget3107 = new ETLWidgetView();
			e.setWidget(widget3107);
			widget3107.setOid(e.getOid());
			widget3107.setWidgetName("汇总转换" + idex);
			nodeName.get("m3107").setI(++idex);
			widget3107.setWidgetType("m3107");
			List<ETLCodeWidgetAttrView> widgetAttrs = new ArrayList<ETLCodeWidgetAttrView>();
			List<ETLCodeAttrValView> attrValScope = new ArrayList<ETLCodeAttrValView>();
			attrValScope.add(new ETLCodeAttrValView("0", "否"));
			attrValScope.add(new ETLCodeAttrValView("1", "是"));

			ETLCodeWidgetAttrView eTLCodeWidgetAttrView = new ETLCodeWidgetAttrView("m3107", 228, "6", "1", "是否按所有字段分组",
					"0", attrValScope, 0, 228, "是否按所有字段分组");
			eTLCodeWidgetAttrView.setAttrCode("7");
			eTLCodeWidgetAttrView.setBitflags("0");
			widgetAttrs.add(eTLCodeWidgetAttrView);
			widget3107.setWidgetAttrs(widgetAttrs);
			widget3107.setIsReusable(0);
			System.out.println("当前节点的字段");
			List<ETLWidgetFieldView> widgetFields = new ArrayList<ETLWidgetFieldView>();
			e.getWidget().setWidgetFields(widgetFields);
			ctx.uuid = UUID.randomUUID().toString();

			for (Column col : columnSetUsed) {
				int expType = groupSet.contains(col) ? 46 : 1;
				ETLWidgetFieldView eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(), col.getColumnName(),
						255, 0, 95442, 3, 0, 0, null, null, null, null, null, col.getExp(), expType);
				eTLWidgetFieldView.setSortType(0);
				widgetFields.add(eTLWidgetFieldView);
				ETLWidgetDepsView eTLWidgetDepsView = new ETLWidgetDepsView(fromFieldUid, col.getColumnName(), ctx.uuid,
						col.getColumnName());
				widgetDeps.add(eTLWidgetDepsView);
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
					ETLWidgetFieldView eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(),
							col.getColumnName(), 255, 0, 95442, 3, 0, 0, null, null, null, null, null, col.getExp(), 1);
					eTLWidgetFieldView.setSortType(0);
					widgetFields.add(eTLWidgetFieldView);
					System.out.println(tmp + " 表达式 " + col.getExp());
				}
			}
			ctx.columnList = columnOutList;
			VertexAddrs.add(new VertexAddr(ctx.uuid, x += 100, y, length, width, false));
			e.setOid(ctx.uuid);
			e.setWidgetInstId(ctx.uuid);
			e.getWidget().setOid(ctx.uuid);
			System.out.println("当前节点uuid： " + ctx.uuid);
			System.out.println();
		}
	}

	private Set<Column> visitGroupBy(GroupByClauseContext groupByClause) {
		// TODO Auto-generated method stub
		Set<Column> columnSet = new HashSet<Column>();
		if (groupByClause != null) {
			for (sqlParser.FieldNameContext field : groupByClause.fieldName()) {
				columnSet.add(new Column(field.getText()));
			}
			return columnSet;
		} else
			return null;

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

	private Set<Column> visitWhere(sqlParser.WhereClauseContext whereClause) {
		if (whereClause != null) {
			if (whereClause instanceof sqlParser.WhereContext) {
				sqlParser.WhereContext where = (sqlParser.WhereContext) whereClause;
				return visitBooleanExpression(where.booleanExpression());
			} else {
				// sqlParser.TopContext top = (sqlParser.TopContext) whereClause;
				return new HashSet<Column>();
			}
		}
		return new HashSet<Column>();
	}

	private void printWhere(sqlParser.WhereClauseContext whereClause, ETLWidgetInstView e) {
		if (whereClause != null) {
			if (whereClause instanceof sqlParser.WhereContext) {
				sqlParser.WhereContext where = (sqlParser.WhereContext) whereClause;
				System.out.println("筛选节点");
				System.out.println("筛选条件:" + where.booleanExpression().getText());
				e.setWidgetType("m3106");
				int idex = nodeName.get("m3106").getI();
				e.setInstancName("筛选器转换" + idex);
				ETLWidgetView widget3106 = new ETLWidgetView();
				e.setWidget(widget3106);
				widget3106.setOid(e.getOid());
				widget3106.setWidgetName("筛选器转换" + idex);
				nodeName.get("m3106").setI(++idex);
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

	public void exitSubSelectQuery(sqlParser.SubSelectQueryContext ctx) {
		ctx.uuid = ctx.selectStatement().uuid;
		ctx.alias = ctx.alias().getText();
		for (Column col : ctx.selectStatement().columnList) {
			col.setTableOrAlias(ctx.alias);
		}
		ctx.columnList = ctx.selectStatement().columnList;

	}

	public void exitSelectjoin(sqlParser.SelectjoinContext ctx) {
		Set<String> colSet = new HashSet<String>();
		String tmp = null;
		int i = 0;
		for (sqlParser.TableSourceContext table : ctx.tableSource()) {
			for (Column col : table.columnList) {
				i = 0;
				tmp = col.getColumnName();
				while (colSet.contains(tmp)) {
					tmp += "#" + (++i);
				}
				colSet.add(tmp);
				col.setColumnNamealias(tmp);
				ctx.columnList.add(col);// 获取join的表所有字段用于外层sql替换*,并且对于两个表的字段名若相同，ID=>ID#1
			}
		}
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
	List<String> colListWXW_ANTLR_A = Arrays.asList("ID", "NAME", "ADDRESS", "TEL", "E_MAIL");
	List<String> colListWXW_ANTLR_B = Arrays.asList("B_ID", "B_NAME", "B_ADDRESS", "B_TEL", "B_E_MAIL");
	Map<String, List<String>> tableCols = new HashMap<String, List<String>>();
	{
		tableCols.put("WXW_ANTLR_DIRECT_TEST", colListWXW_ANTLR_DIRECT_TEST);
		tableCols.put("WXW_ANTLR_TEST", colListWXW_ANTLR_TEST);
		tableCols.put("WXW_ANTLR_A", colListWXW_ANTLR_A);
		tableCols.put("WXW_ANTLR_B", colListWXW_ANTLR_B);
	}

	public void exitSimpleTable(sqlParser.SimpleTableContext ctx) {
		// ctx.columnAllList=getFrom元数据 //该表的所有字段
		List<String> colList = tableCols.get(ctx.tableName().IDENTIFIER().getText());
		ctx.tableName = ctx.tableName().getText();// 这里tablename包含database
		ctx.alias = ctx.tableName;
		if (ctx.alias() != null)
			ctx.alias = ctx.alias().getText();
		for (String tmp : colList) {
			Column col = new Column();
			col.setColumnName(tmp);
			col.setTableOrAlias(ctx.alias);
			ctx.columnList.add(col);
		}
		SourceNodeService s3101 = new SourceNodeService();
		SourceQulifierNodeService s3103 = new SourceQulifierNodeService();
		widgetInsts.add(s3101.geteTLWidgetInstView());
		widgetInsts.add(s3103.geteTLWidgetInstView());
		s3101.init();
		s3103.init();
		ctx.uuid = UUID.randomUUID().toString();
		s3101.setUuid(ctx.uuid);
		VertexAddrs.add(new VertexAddr(ctx.uuid, x, y, length, width, false));
		ctx.uuid = UUID.randomUUID().toString();
		s3103.setUuid(ctx.uuid);
		VertexAddrs.add(new VertexAddr(ctx.uuid, x, y += 100, length, width, false));
		System.out.println("源节点：");
		System.out.print(ctx.tableName);
		System.out.println(" 别名：" + ctx.alias);
		System.out.println("当前节点uuid： " + ctx.uuid);
		System.out.println(ctx.columnList.size() + "个字段");
		visitColumnList(ctx.columnList);
		s3101.column(ctx.columnList);
		System.out.println();
		s3101.setOwner(ctx.tableName().database().getText());// 不对哦
		s3103.setOwner(ctx.tableName().database().getText());
		s3103.setInstancName(ctx.tableName().IDENTIFIER().getText());
		s3103.column(s3101.getUuid(), ctx.columnList, widgetDeps);
		s3103.change();
	}

	public void exitFieldExpression(sqlParser.FieldExpressionContext ctx) {
		ctx.isContainAggMethod = isAggMethod;
	}

	private boolean isAggMethod;

	public void exitAggmethod(sqlParser.AggmethodContext ctx) {
		isAggMethod = true;
	}
}