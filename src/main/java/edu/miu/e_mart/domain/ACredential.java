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

@Entity
public class ACredential {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int credentialId;

	// @NotNull(message = "{ }")
	private String userName;
	// @NotNull(message = "{ }")
	private String password;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<ARole> aroles = new ArrayList<>();

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

	public List<ARole> getAroles() {
		return aroles;
	}

	public void setAroles(List<ARole> aroles) {
		this.aroles = aroles;
	}

}
