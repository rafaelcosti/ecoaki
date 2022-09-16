package br.com.ecoaki.localizacoes;


public class EstadoDTO {

	public EstadoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EstadoDTO(Integer idEstado, String nomeEstado, boolean ativa, String cdEstado) {
		super();
		this.idEstado = idEstado;
		this.nomeEstado = nomeEstado;
		this.ativa = ativa;
		this.setCdEstado(cdEstado);
	}
	private Integer idEstado;
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
	private String nomeEstado;
	private boolean ativa;
	
	/**
	 * 
	 */
	private String cdEstado;
	
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
}
