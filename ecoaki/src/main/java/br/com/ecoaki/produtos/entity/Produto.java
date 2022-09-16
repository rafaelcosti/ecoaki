package br.com.ecoaki.produtos.entity;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_ECO_PRODUTO")
public class Produto {

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(Long idProduto, String nomeProduto, String descricaoProduto, boolean ativa,
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

	@Id
	@SequenceGenerator(name = "produto", sequenceName = "sq_t_produto", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
	@Column(name = "ID_PRODUTO")
	private Long idProduto;

	@Column(name = "NAME", columnDefinition = "VARCHAR(100)")
	private String nomeProduto;

	@Column(name = "DESCRICAO", columnDefinition = "VARCHAR(500)")
	private String descricaoProduto;

	@Column(name = "FL_ATIVA")
	private boolean ativa;

	@Column(name = "DT_INCLUSAO")
	private LocalDateTime dtInclusao;

	@Column(name = "DT_EXCLUSAO")
	private LocalDateTime dtExclusao;

	@Column(name = "DT_ALTERACAO")
	private LocalDateTime dtAlteracao;

	@Column(name = "NR_DIAS_EXPIRACAO")
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

	@Override
	public int hashCode() {
		return Objects.hash(ativa, descricaoProduto, diasExpiracao, dtAlteracao, dtExclusao, dtInclusao, idProduto,
				nomeProduto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return ativa == other.ativa && Objects.equals(descricaoProduto, other.descricaoProduto)
				&& diasExpiracao == other.diasExpiracao && Objects.equals(dtAlteracao, other.dtAlteracao)
				&& Objects.equals(dtExclusao, other.dtExclusao) && Objects.equals(dtInclusao, other.dtInclusao)
				&& Objects.equals(idProduto, other.idProduto) && Objects.equals(nomeProduto, other.nomeProduto);
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", descricaoProduto="
				+ descricaoProduto + ", ativa=" + ativa + ", dtInclusao=" + dtInclusao + ", dtExclusao=" + dtExclusao
				+ ", dtAlteracao=" + dtAlteracao + ", diasExpiracao=" + diasExpiracao + "]";
	}
}
