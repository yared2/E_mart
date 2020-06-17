package edu.miu.e_mart.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.e_mart.domain.ACredential;
import edu.miu.e_mart.repository.IACredentialRepository;
import edu.miu.e_mart.service.definition.IACredentialService;

@Service
public class ACredentialServiceImp implements IACredentialService {
	@Autowired
	private CustomerServiceImp customerServiceImpl;

	@Override
	public ACredential getCredntialByUserName(String name) {
		return customerServiceImpl.findByUserName(name);
	}


}
