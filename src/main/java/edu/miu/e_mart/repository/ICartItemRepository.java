package edu.miu.e_mart.repository;

//import edu.miu.e_mart.domain.CartItem;
import org.springframework.data.repository.CrudRepository;

import edu.miu.e_mart.domain.CartItem;

public interface ICartItemRepository extends CrudRepository<CartItem,Integer> {
}
