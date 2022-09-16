package br.com.ecoaki.localizacoes;



public class CidadeDTO {

	
	public CidadeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CidadeDTO(Integer idCidade, String nomeCidade, boolean ativa) {
		super();
		this.idCidade = idCidade;
		this.nomeCidade = nomeCidade;
		this.ativa = ativa;
	}
	private Integer idCidade;
	private String nomeCidade;	
	private boolean ativa;
	
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
	
}
