package org.bdp.springboot.app.usuarios.model;

public class ParamsMailCodVerif {
	private String codVerif;
	private String toMail;
	private String fromEmail;
	private String subjectEmail;

	public String getCodVerif() {
		return codVerif;
	}

	public void setCodVerif(String codVerif) {
		this.codVerif = codVerif;
	}

	public String getToMail() {
		return toMail;
	}

	public void setToMail(String toMail) {
		this.toMail = toMail;
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getSubjectEmail() {
		return subjectEmail;
	}

	public void setSubjectEmail(String subjectEmail) {
		this.subjectEmail = subjectEmail;
	}

	@Override
	public String toString() {
		return "ParamsMail [codVerif=" + codVerif + ", toMail=" + toMail + ", fromEmail=" + fromEmail
				+ ", subjectEmail=" + subjectEmail + "]";
	}
}
