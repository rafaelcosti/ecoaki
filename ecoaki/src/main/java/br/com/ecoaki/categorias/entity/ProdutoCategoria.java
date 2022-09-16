package br.com.ecoaki.categorias.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @author Rafael Costi
 *
 */
@Entity
@Table(name = "T_ECO_CATEGORIA")
public class ProdutoCategoria {
	/**
	 * 
	 */
	public ProdutoCategoria() {
		super();
	}

	/**
	 * 
	 * @param idCategoria
	 * @param nomeCategoria
	 */
	public ProdutoCategoria(Integer idCategoria, String nomeCategoria, boolean ativa) {
		super();
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
		this.setAtiva(ativa);
	}

	@Id
	@SequenceGenerator(name = "categoria", sequenceName = "sq_t_categoria", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoria")
	@Column(name = "ID_CATEGORIA")
	private Integer idCategoria;

	@Column(name = "NAME", columnDefinition = "VARCHAR(100)")
	private String nomeCategoria;

	/**
	 * @return the idCategoria
	 */
	public Integer getIdCategoria() {
		return idCategoria;
	}

	/**
	 * @param idCategoria the idCategoria to set
	 */
	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	/**
	 * @return the nomeCategoria
	 */
	public String getNomeCategoria() {
		return nomeCategoria;
	}

	/**
	 * @param nomeCategoria the nomeCategoria to set
	 */
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	/**
	 * 
	 */
	@Column(name = "FL_ATIVA")
	private boolean ativa;

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

	@Override
	public int hashCode() {
		return Objects.hash(idCategoria, nomeCategoria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoCategoria other = (ProdutoCategoria) obj;
		return Objects.equals(idCategoria, other.idCategoria) && Objects.equals(nomeCategoria, other.nomeCategoria);
	}

	@Override
	public String toString() {
		return "ProdutoCategoria [idCategoria=" + idCategoria + ", nomeCategoria=" + nomeCategoria + ", ativa=" + ativa + "]";
	}
}
