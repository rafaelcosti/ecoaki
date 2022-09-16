package br.com.ecoaki.produtos;

import java.time.LocalDateTime;

public class ProdutoDTO {

	public ProdutoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProdutoDTO(Long idProduto, String nomeProduto, String descricaoProduto, boolean ativa,
			LocalDateTime dtInclusao, LocalDateTime dtExclusao, LocalDateTime dtAlteracao, int diasExpiracao) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoProduto;
		this.ativa = ativa;
		this.dtInclusao = dtInclusao;
		this.dtExclusao = dtExclusao;
		this.dtAlteracao = dtAlteracao;
		this.diasExpiracao = diasExpiracao;
	}

	private Long idProduto;
	private String nomeProduto;
	private String descricaoProduto;
	private boolean ativa;
	private LocalDateTime dtInclusao;
	private LocalDateTime dtExclusao;
	private LocalDateTime dtAlteracao;
	private int diasExpiracao;

	/**
	 * @return the idProduto
	 */
	public Long getIdProduto() {
		return idProduto;
	}

	/**
	 * @param idProduto the idProduto to set
	 */
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	/**
	 * @return the nomeProduto
	 */
	public String getNomeProduto() {
		return nomeProduto;
	}

	/**
	 * @param nomeProduto the nomeProduto to set
	 */
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	/**
	 * @return the descricaoProduto
	 */
	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	/**
	 * @param descricaoProduto the descricaoProduto to set
	 */
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
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
	 * @return the dtInclusao
	 */
	public LocalDateTime getDtInclusao() {
		return dtInclusao;
	}

	/**
	 * @param dtInclusao the dtInclusao to set
	 */
	public void setDtInclusao(LocalDateTime dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	/**
	 * @return the dtExclusao
	 */
	public LocalDateTime getDtExclusao() {
		return dtExclusao;
	}

	/**
	 * @param dtExclusao the dtExclusao to set
	 */
	public void setDtExclusao(LocalDateTime dtExclusao) {
		this.dtExclusao = dtExclusao;
	}

	/**
	 * @return the dtAlteracao
	 */
	public LocalDateTime getDtAlteracao() {
		return dtAlteracao;
	}

	/**
	 * @param dtAlteracao the dtAlteracao to set
	 */
	public void setDtAlteracao(LocalDateTime dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	/**
	 * @return the diasExpiracao
	 */
	public int getDiasExpiracao() {
		return diasExpiracao;
	}

	/**
	 * @param diasExpiracao the diasExpiracao to set
	 */
	public void setDiasExpiracao(int diasExpiracao) {
		this.diasExpiracao = diasExpiracao;
	}
}
