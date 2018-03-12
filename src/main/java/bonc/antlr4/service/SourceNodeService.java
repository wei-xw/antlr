package bonc.antlr4.service;

import java.util.List;

import com.bonc.dataplatform.repository.mapping.vo.ETLWidgetFieldView;

import bonc.antlr4.entity.Column;

public class SourceNodeService extends AbstractNodeService{
	public void init() {
		eTLWidgetInstView.setWidgetType("m3101");
		eTLWidgetInstView.setInstancName("a22b7bcef62f464a95af68b38e462627_1");
		eTLWidgetInstView.setWidget(widget);
		widget.setOid("88406491");
		widget.setWidgetName("a22b7bcef62f464a95af68b38e462627");
		widget.setWidgetType("m3101");
		widget.setModelId("m6");
		widget.setWidgetFields(widgetFields);
		widget.setIsReusable(0);
	}
	public void column(List<Column> columnList) {
		for (Column col : columnList) {
			ETLWidgetFieldView eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(), col.getColumnName(),
					255, 0, 95442, 3, 0, 0, null, null, null, null, null, null, 1);
			eTLWidgetFieldView.setSortType(0);
			widgetFields.add(eTLWidgetFieldView);
		}
	}
	public void setOwner(String owner) {
		widget.setOwner(owner);
	}

}
