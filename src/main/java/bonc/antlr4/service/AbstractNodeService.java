package bonc.antlr4.service;

import java.util.ArrayList;
import java.util.List;

import com.bonc.dataplatform.repository.mapping.vo.ETLWidgetDepsView;
import com.bonc.dataplatform.repository.mapping.vo.ETLWidgetFieldView;
import com.bonc.dataplatform.repository.mapping.vo.ETLWidgetInstView;
import com.bonc.dataplatform.repository.mapping.vo.ETLWidgetView;

import bonc.antlr4.entity.Column;

public abstract class AbstractNodeService {
	protected String uuid;
	protected ETLWidgetInstView eTLWidgetInstView = new ETLWidgetInstView();
	protected ETLWidgetView widget = new ETLWidgetView();
	protected List<ETLWidgetFieldView> widgetFields = new ArrayList<ETLWidgetFieldView>();
	{
		widget.setWidgetFields(widgetFields);
	}

	public abstract void init();

	public void column(String fromUUid, List<Column> columnList, List<ETLWidgetDepsView> widgetDeps) {
		for (Column col : columnList) {
			ETLWidgetFieldView eTLWidgetFieldView = new ETLWidgetFieldView(col.getColumnName(), col.getColumnName(),
					255, 0, 95442, 3, 0, 0, null, null, null, null, null, null, 1);
			eTLWidgetFieldView.setSortType(0);
			widgetFields.add(eTLWidgetFieldView);
			ETLWidgetDepsView eTLWidgetDepsView = new ETLWidgetDepsView(fromUUid, col.getColumnName(), uuid,
					col.getColumnName());
			widgetDeps.add(eTLWidgetDepsView);
		}

	}

	public ETLWidgetInstView geteTLWidgetInstView() {
		return eTLWidgetInstView;
	}

	public void seteTLWidgetInstView(ETLWidgetInstView eTLWidgetInstView) {
		this.eTLWidgetInstView = eTLWidgetInstView;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		eTLWidgetInstView.setWidgetInstId(uuid);
	}

}
