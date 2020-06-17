package edu.miu.e_mart.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.e_mart.domain.ACredential;
import edu.miu.e_mart.domain.Customer;
import edu.miu.e_mart.repository.ICustomerRepository;
import edu.miu.e_mart.service.definition.ICustomerService;
@Service
public class CustomerServiceImp implements ICustomerService {
	
	@Autowired
	private ICustomerRepository icustomerRepository;

	@Override
	public void addCustomer(Customer customer) {
		icustomerRepository.save(customer);
		
	}

	public ACredential findByUserName(String name) {
		//icustomerRepository.f
		return null;
	}

}
