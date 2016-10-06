package web.dto;

import java.io.Serializable;

public class DocumentDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2598931226386606564L;
	private String documentType;
	private String documentName;
	private String status;

	public DocumentDTO(String documentType, String documentName, String status) {
		super();
		this.documentType = documentType;
		this.documentName = documentName;
		this.status = status;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "DocumentDTO [documentType=" + documentType + ", documentName=" + documentName + ", status=" + status
				+ "]";
	}

}
