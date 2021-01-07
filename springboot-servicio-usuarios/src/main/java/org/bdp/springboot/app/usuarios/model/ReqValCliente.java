package org.bdp.springboot.app.usuarios.model;

public class ReqValCliente {
	private String usuario;
	private String codVerif;
	private String imei;
	private String dirMac;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getCodVerif() {
		return codVerif;
	}
	public void setCodVerif(String codVerif) {
		this.codVerif = codVerif;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getDirMac() {
		return dirMac;
	}
	public void setDirMac(String dirMac) {
		this.dirMac = dirMac;
	}
	@Override
	public String toString() {
		return "ReqValCliente [usuario=" + usuario + ", codVerif=" + codVerif + ", imei=" + imei + ", dirMac=" + dirMac
				+ "]";
	}
}
