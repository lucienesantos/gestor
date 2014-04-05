package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4172650939876865805L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String email;
	
	private String passworld;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassworld() {
		return passworld;
	}

	public void setPassworld(String passworld) {
		this.passworld = passworld;
	}

	public boolean emailValido() {
		return this.email.contains("@");
	}

	public boolean senhaValida() {
		return (this.passworld.length() >= 6);
	}
}
