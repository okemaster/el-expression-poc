package web.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import core.web.common.AbstractDynamicPageMBean;
import core.web.common.ColumnModel;
import web.dto.DocumentDTO;

@ManagedBean(name = "AstValBean")
@SessionScoped
public class AstValBean extends AbstractDynamicPageMBean implements Serializable {

	private List<DocumentDTO> datas;

	public AstValBean() {
		loadColumnModel();
		loadData();
	}

	public void submit() {
		datas.forEach(e -> {
			System.out.println(e);
		});
	}

	private void loadColumnModel() {
		List<ColumnModel> columnModel = new ArrayList<>();
		columnModel.add(new ColumnModel("documentType", "Document Type", false));
		columnModel.add(new ColumnModel("documentName", "Document Name", true));
		columnModel.add(new ColumnModel("status", "Status", false));
		setColumnModel(columnModel);
	}

	private void loadData() {
		datas = new ArrayList<>();
		datas.add(new DocumentDTO("IN", "Invoice", "Active"));
		datas.add(new DocumentDTO("DN", "Debit Note", "Active"));
	}

	public List<DocumentDTO> getDatas() {
		return datas;
	}

	public void setDatas(List<DocumentDTO> datas) {
		this.datas = datas;
	}
}
