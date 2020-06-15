package edu.miu.e_mart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.miu.e_mart.domain.ACredential;
import edu.miu.e_mart.domain.Review;

@Repository
public interface IReviewRepository extends CrudRepository<Review, Integer>{

}
