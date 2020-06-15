package edu.miu.e_mart.repository;

import org.springframework.data.repository.CrudRepository;

import edu.miu.e_mart.domain.ACredential;
import edu.miu.e_mart.domain.Admin;
import edu.miu.e_mart.domain.Customer;

public interface IAdminRepository extends CrudRepository<Admin, Integer>{

}
