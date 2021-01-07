package org.bdp.springboot.app.usuarios.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cod_verificacion")
public class OTP {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "usuario_id")
	private Long usuId;

	@Column(name = "codigo_verificacion", length = 6)
	private String codVerif;

	@Column(name = "d_cod_tipo_cod_verif", length = 3)
	private String tipCodVerif;

	@Column(name = "disponible")
	private boolean disponible;

	@Column(name = "fec_registro")
	private Timestamp fecRegistro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUsuId() {
		return usuId;
	}

	public void setUsuId(Long usuId) {
		this.usuId = usuId;
	}

	public String getCodVerif() {
		return codVerif;
	}

	public void setCodVerif(String codVerif) {
		this.codVerif = codVerif;
	}

	public String getTipCodVerif() {
		return tipCodVerif;
	}

	public void setTipCodVerif(String tipCodVerif) {
		this.tipCodVerif = tipCodVerif;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Timestamp getFecRegistro() {
		return fecRegistro;
	}

	public void setFecRegistro(Timestamp fecRegistro) {
		this.fecRegistro = fecRegistro;
	}

	@Override
	public String toString() {
		return "OTP [id=" + id + ", usuId=" + usuId + ", codVerif=" + codVerif + ", tipCodVerif=" + tipCodVerif
				+ ", disponible=" + disponible + ", fecRegistro=" + fecRegistro + "]";
	}

}
