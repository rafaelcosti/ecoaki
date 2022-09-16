package br.com.ecoaki.localizacoes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_ECO_CIDADE")
public class Cidade {	
	
	
	public Cidade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cidade(Integer idCidade, String nomeCidade, boolean ativa) {
		super();
		this.idCidade = idCidade;
		this.nomeCidade = nomeCidade;
		this.ativa = ativa;
	}

	@Id
	@SequenceGenerator(name = "cidade", sequenceName = "sq_t_cidade", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cidade")
	@Column(name = "ID_CIDADE")
	private Integer idCidade;

	
	
	
	/**
	 * @return the idCidade
	 */
	public Integer getIdCidade() {
		return idCidade;
	}

	/**
	 * @param idCidade the idCidade to set
	 */
	public void setIdCidade(Integer idCidade) {
		this.idCidade = idCidade;
	}

	/**
	 * @return the nomeCidade
	 */
	public String getNomeCidade() {
		return nomeCidade;
	}

	/**
	 * @param nomeCidade the nomeCidade to set
	 */
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
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

	@Column(name = "NAME", columnDefinition = "VARCHAR(100)")
	private String nomeCidade;
	
	@Column(name = "FL_ATIVA")
	private boolean ativa;




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCidade == null) ? 0 : idCidade.hashCode());
		result = prime * result + ((nomeCidade == null) ? 0 : nomeCidade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (idCidade == null) {
			if (other.idCidade != null)
				return false;
		} else if (!idCidade.equals(other.idCidade))
			return false;
		if (nomeCidade == null) {
			if (other.nomeCidade != null)
				return false;
		} else if (!nomeCidade.equals(other.nomeCidade))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "cidade [idCidade=" + idCidade + ", nomeCidade=" + nomeCidade + ", ativa=" + ativa + "]";
	}

	

}
