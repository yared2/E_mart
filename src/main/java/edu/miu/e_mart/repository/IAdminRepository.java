package edu.miu.e_mart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IAdminRepository extends CrudRepository<Admin, Integer>{

}
