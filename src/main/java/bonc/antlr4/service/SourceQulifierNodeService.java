package bonc.antlr4.service;

import java.util.ArrayList;
import java.util.List;

import com.bonc.dataplatform.repository.mapping.vo.ETLCodeWidgetAttrView;

public class SourceQulifierNodeService extends AbstractNodeService {
	final static String nodeType = "m3103";
	private String instancName;
	private String owner;

	public void init() {
		eTLWidgetInstView.setWidgetType(nodeType);
		eTLWidgetInstView.setWidget(widget);
		widget.setModelId("m6");
		widget.setWidgetType(nodeType);
		widget.setIsReusable(0);
	}

	public void change() {
		widget.setOwner(owner);
		widget.setOid(uuid);
		eTLWidgetInstView.setInstancName(instancName + "_1");
		widget.setWidgetName(instancName);
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
		eTLCodeWidgetAttrView1.setAttrVal(instancName);
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
		eTLCodeWidgetAttrView2.setAttrVal(owner);
		eTLCodeWidgetAttrView2.setParentId(0);
		eTLCodeWidgetAttrView2.setOrd(12);
		eTLCodeWidgetAttrView2.setAttrComment("表的所属用户");
		eTLCodeWidgetAttrView2.setAttrCode("12");
		eTLCodeWidgetAttrView2.setBitflags("0");
		widgetAttrs.add(eTLCodeWidgetAttrView2);
		widget.setWidgetAttrs(widgetAttrs);
	}

	public String getInstancName() {
		return instancName;
	}

	public void setInstancName(String instancName) {
		this.instancName = instancName;

	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
