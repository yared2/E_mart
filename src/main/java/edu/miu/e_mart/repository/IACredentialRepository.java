package edu.miu.e_mart.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.miu.e_mart.domain.ACredential;

@Repository
public interface IACredentialRepository extends CrudRepository<ACredential, Integer>{
	 @Query(value="SELECT a FROM ACredential a WHERE a.userName = ?1") 
		 ACredential findByUserName(@Param("name") String userName );
}
