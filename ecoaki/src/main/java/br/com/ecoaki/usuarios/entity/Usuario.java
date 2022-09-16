package br.com.ecoaki.usuarios.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_USUARIOS")
public class Usuario {
	
	@Id
	@SequenceGenerator(name = "usuarios", sequenceName = "sq_t_usuario", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuarios")
	@Column(name = "ID_USUARIO")
	private Integer idUsuarios;
	
	@Column(name = "NAME", columnDefinition = "VARCHAR(100)")
	private String name;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PASSWORD")
	private String password;
	/**
	 * 
	 * @param idUsuarios
	 * @param name
	 */
	public Usuario(Integer idUsuarios, String name, String email, String password) {
		super();
		this.idUsuarios = idUsuarios;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	/**
	 * 
	 */
	public Usuario() {
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
	@Override
	public int hashCode() {
		return Objects.hash(email, idUsuarios, name, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && Objects.equals(idUsuarios, other.idUsuarios)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password);
	}
	
	@Override
	public String toString() {
		return "usuario [idUsuarios=" + idUsuarios + ", name=" + name + ", email=" + email + ", password=" + password
				+ "]";
	}
	
}
