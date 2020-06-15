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
	private String passWord;

	public ACredential() {
		super();
	}

	public ACredential(String userName, String passWord) {
		super();

		this.userName = userName;
		this.passWord = passWord;
	}

	public int getCredentialId() {
		return credentialId;
	}

	public void setCredentialId(int credentialId) {
		this.credentialId = credentialId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
