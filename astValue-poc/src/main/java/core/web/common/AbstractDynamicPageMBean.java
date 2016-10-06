package core.web.common;

import java.util.List;

public abstract class AbstractDynamicPageMBean {
	private List<ColumnModel> columnModel;

	public List<ColumnModel> getColumnModel() {
		return columnModel;
	}

	public void setColumnModel(List<ColumnModel> columnModel) {
		this.columnModel = columnModel;
	}
}
