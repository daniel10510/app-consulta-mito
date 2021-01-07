package org.bdp.springboot.app.usuarios.model;

public class MsgOpe {
	private String codError;
	private String txtError;
	
	

	public MsgOpe(String codError, String txtError) {
		super();
		this.codError = codError;
		this.txtError = txtError;
	}

	public String getCodError() {
		return codError;
	}

	public void setCodError(String codError) {
		this.codError = codError;
	}

	public String getTxtError() {
		return txtError;
	}

	public void setTxtError(String txtError) {
		this.txtError = txtError;
	}

	@Override
	public String toString() {
		return "MsgOpe [codError=" + codError + ", txtError=" + txtError + "]";
	}
}
