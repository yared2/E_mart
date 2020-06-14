package edu.miu.e_mart.repository;

import org.springframework.data.repository.CrudRepository;

import edu.miu.e_mart.domain.Customer;

public interface ICustomerRepository extends CrudRepository<Customer, Long>{

}
