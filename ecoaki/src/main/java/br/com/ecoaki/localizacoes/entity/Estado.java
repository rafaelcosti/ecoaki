package br.com.ecoaki.localizacoes.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_ECO_ESTADO")
public class Estado {

	public Estado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estado(Integer idEstado, String nomeEstado, boolean ativa, String cdEstado) {
		super();
		this.idEstado = idEstado;
		this.nomeEstado = nomeEstado;
		this.ativa = ativa;
		this.setCdEstado(cdEstado);
	}

	@Id
	@SequenceGenerator(name = "estado", sequenceName = "sq_t_estado", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado")
	@Column(name = "ID_ESTADO")
	private Integer idEstado;
	
	@Column(name = "NAME", columnDefinition = "VARCHAR(100)")
	private String nomeEstado;
	
	@Column(name = "FL_ATIVA")
	private boolean ativa;

	@Column(name = "CD_ESTADO", columnDefinition = "VARCHAR(2)")
	private String cdEstado;

	/**
	 * @return the idEstado
	 */
	public Integer getIdEstado() {
		return idEstado;
	}

	/**
	 * @param idEstado the idEstado to set
	 */
	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	/**
	 * @return the nomeEstado
	 */
	public String getNomeEstado() {
		return nomeEstado;
	}

	/**
	 * @param nomeEstado the nomeEstado to set
	 */
	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	/**
	 * @return the ativa
	 */
	public boolean isAtiva() {
		return ativa;
	}

	/**
	 * @param ativa the ativa to set
	 */
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	/**
	 * @return the cdEstado
	 */
	public String getCdEstado() {
		return cdEstado;
	}

	/**
	 * @param cdEstado the cdEstado to set
	 */
	public void setCdEstado(String cdEstado) {
		this.cdEstado = cdEstado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ativa, cdEstado, idEstado, nomeEstado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return ativa == other.ativa && Objects.equals(cdEstado, other.cdEstado)
				&& Objects.equals(idEstado, other.idEstado) && Objects.equals(nomeEstado, other.nomeEstado);
	}

	@Override
	public String toString() {
		return "Estado [idEstado=" + idEstado + ", nomeEstado=" + nomeEstado + ", ativa=" + ativa + ", cdEstado="
				+ cdEstado + "]";
	}
}
