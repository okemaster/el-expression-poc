package core.web.common;

import java.io.Serializable;

public class ColumnModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fieldName;
	private String displayName;
	private boolean editable;

	public ColumnModel(String fieldName, String displayName, boolean editable) {
		super();
		this.fieldName = fieldName;
		this.displayName = displayName;
		this.editable = editable;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

}
