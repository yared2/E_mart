package edu.miu.e_mart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.miu.e_mart.domain.ACredential;
import edu.miu.e_mart.domain.Product;

@Repository
public interface IProductRepository extends CrudRepository<Product, Integer>{

}
