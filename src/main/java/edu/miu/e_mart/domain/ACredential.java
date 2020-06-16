package edu.miu.e_mart.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ACredential {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int credentialId;

	// @NotNull(message = "{ }")
	private String userName;
	// @NotNull(message = "{ }")
	private String password;

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

}
