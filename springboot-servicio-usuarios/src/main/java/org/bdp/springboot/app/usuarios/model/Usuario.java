package org.bdp.springboot.app.usuarios.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true, length = 50)
	private String username;

	@Column(length = 100)
	private String password;

	@Column(length = 25)
	private String imei;

	@Column(name = "mac_address", length = 25)
	private String macAddress;

	@Column(name = "d_cod_tipo_plataforma", length = 5)
	private String codTipoPlat;

	@Column(name = "d_cod_estado_registro", length = 5)
	private String codEstReg;

	private String nombres;

	@Column(name = "primer_apellido", length = 200)
	private String primApe;

	@Column(name = "segundo_apellido", length = 200)
	private String segApe;

	@Column(name = "d_cod_genero", length = 5)
	private String codGenero;

	@Column(name = "d_cod_estado_civil", length = 5)
	private String codEstCiv;

	@Column(name = "d_cod_tipo_documento", length = 5)
	private String codTipDoc;

	@Column(name = "num_documento", length = 30)
	private String numDoc;

	@Column(name = "com_documento", length = 5)
	private String comDoc;

	@Column(name = "ext_documento", length = 5)
	private String extDoc;

	@Column(name = "correo_electronico", length = 150)
	private String email;

	@Column(length = 30)
	private String celular;

	@Column(length = 200)
	private String direccion;

	@Column(name = "coordenada_x", length = 150)
	private String coordX;

	@Column(name = "coordenada_y", length = 150)
	private String coordY;

	@Column(name = "fec_registro")
	private Timestamp fecReg;

	@Column(name = "fec_ult_ini_sesion")
	private Timestamp fecUltIniSes;

	@Column(name = "fec_ult_int_ini_sesion")
	private Timestamp fecUltIntIniSes;

	@Column(name = "num_int_sesion")
	private String numIntSes;

	private Boolean enabled;

//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "role_id"), uniqueConstraints = {
//			@UniqueConstraint(columnNames = { "usuario_id", "role_id" }) })
//	private List<Role> roles;

	// private Integer intentos;

	
	private static final long serialVersionUID = 4002221912401133094L;

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", password=" + password + ", imei=" + imei
				+ ", macAddress=" + macAddress + ", codTipoPlat=" + codTipoPlat + ", codEstReg=" + codEstReg
				+ ", nombres=" + nombres + ", primApe=" + primApe + ", segApe=" + segApe + ", codGenero=" + codGenero
				+ ", codEstCiv=" + codEstCiv + ", codTipDoc=" + codTipDoc + ", numDoc=" + numDoc + ", comDoc=" + comDoc
				+ ", extDoc=" + extDoc + ", email=" + email + ", celular=" + celular + ", direccion=" + direccion
				+ ", coordX=" + coordX + ", coordY=" + coordY + ", fecReg=" + fecReg + ", fecUltIniSes=" + fecUltIniSes
				+ ", fecUltIntIniSes=" + fecUltIntIniSes + ", numIntSes=" + numIntSes + ", enabled=" + enabled + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getCodTipoPlat() {
		return codTipoPlat;
	}

	public void setCodTipoPlat(String codTipoPlat) {
		this.codTipoPlat = codTipoPlat;
	}

	public String getCodEstReg() {
		return codEstReg;
	}

	public void setCodEstReg(String codEstReg) {
		this.codEstReg = codEstReg;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPrimApe() {
		return primApe;
	}

	public void setPrimApe(String primApe) {
		this.primApe = primApe;
	}

	public String getSegApe() {
		return segApe;
	}

	public void setSegApe(String segApe) {
		this.segApe = segApe;
	}

	public String getCodGenero() {
		return codGenero;
	}

	public void setCodGenero(String codGenero) {
		this.codGenero = codGenero;
	}

	public String getCodEstCiv() {
		return codEstCiv;
	}

	public void setCodEstCiv(String codEstCiv) {
		this.codEstCiv = codEstCiv;
	}

	public String getCodTipDoc() {
		return codTipDoc;
	}

	public void setCodTipDoc(String codTipDoc) {
		this.codTipDoc = codTipDoc;
	}

	public String getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}

	public String getComDoc() {
		return comDoc;
	}

	public void setComDoc(String comDoc) {
		this.comDoc = comDoc;
	}

	public String getExtDoc() {
		return extDoc;
	}

	public void setExtDoc(String extDoc) {
		this.extDoc = extDoc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCoordX() {
		return coordX;
	}

	public void setCoordX(String coordX) {
		this.coordX = coordX;
	}

	public String getCoordY() {
		return coordY;
	}

	public void setCoordY(String coordY) {
		this.coordY = coordY;
	}

	public Timestamp getFecReg() {
		return fecReg;
	}

	public void setFecReg(Timestamp fecReg) {
		this.fecReg = fecReg;
	}

	public Timestamp getFecUltIniSes() {
		return fecUltIniSes;
	}

	public void setFecUltIniSes(Timestamp fecUltIniSes) {
		this.fecUltIniSes = fecUltIniSes;
	}

	public Timestamp getFecUltIntIniSes() {
		return fecUltIntIniSes;
	}

	public void setFecUltIntIniSes(Timestamp fecUltIntIniSes) {
		this.fecUltIntIniSes = fecUltIntIniSes;
	}

	public String getNumIntSes() {
		return numIntSes;
	}

	public void setNumIntSes(String numIntSes) {
		this.numIntSes = numIntSes;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
