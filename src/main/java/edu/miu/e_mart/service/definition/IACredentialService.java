package edu.miu.e_mart.service.definition;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.miu.e_mart.domain.ACredential;

public interface IACredentialService {
	public ACredential getCredntialByUserName(String name);
	

}
