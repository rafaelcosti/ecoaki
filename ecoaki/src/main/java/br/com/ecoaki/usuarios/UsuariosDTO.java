package br.com.ecoaki.usuarios;

public class UsuariosDTO {
	private Integer idUsuarios;
	private String name;
	private String email;
	private String password;
	
	public UsuariosDTO(Integer idUsuarios, String name, String email, String password) {
		super();
		this.idUsuarios = idUsuarios;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	/**
	 * 
	 */
	public UsuariosDTO() {
		super();
	}
	/**
	 * @return the idUsuarios
	 */
	public Integer getIdUsuarios() {
		return idUsuarios;
	}
	/**
	 * @param idUsuarios the idUsuarios to set
	 */
	public void setIdUsuarios(Integer idUsuarios) {
		this.idUsuarios = idUsuarios;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
