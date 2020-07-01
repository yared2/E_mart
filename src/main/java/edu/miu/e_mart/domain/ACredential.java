package edu.miu.e_mart.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class ACredential {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int credentialId;

	 @NotEmpty(message = "{validate.notEmpty}")
	private String userName;
	 
	 @NotEmpty(message = "{validate.notEmpty}")
	private String password;
	
	 private boolean enable;
	 
	 
	@OneToOne(cascade = CascadeType.ALL)
	private ARole aroles;

	public ACredential() {
		super();
	}

	public ACredential(String userName, String password) {
		super();

		this.userName = userName;
		this.password = password;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ARole getAroles() {
		return aroles;
	}

	public void setAroles(ARole aroles) {
		this.aroles = aroles;
	}



	
}
