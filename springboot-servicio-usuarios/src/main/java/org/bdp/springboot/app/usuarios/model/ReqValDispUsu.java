package org.bdp.springboot.app.usuarios.model;

public class ReqValDispUsu {
	private String usuario;
	private String imei;
	private String dirMac;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
		return "ReqValDispUsu [usuario=" + usuario + ", imei=" + imei + ", dirMac=" + dirMac + "]";
	}
}
