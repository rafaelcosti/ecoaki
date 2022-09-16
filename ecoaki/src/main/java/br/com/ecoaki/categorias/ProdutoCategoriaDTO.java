package br.com.ecoaki.categorias;

public class ProdutoCategoriaDTO {

	public ProdutoCategoriaDTO() {
		super();
	}

	public ProdutoCategoriaDTO(Integer idCategoria, String nomeCategoria, boolean ativa) {
		super();
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
		this.setAtiva(ativa);
	}

	private Integer idCategoria;

	private String nomeCategoria;

	private boolean ativa;

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
}
