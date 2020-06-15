package edu.miu.e_mart.service.implementation;

import edu.miu.e_mart.domain.ShoppingCart;
import edu.miu.e_mart.service.definition.IShoppingCartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements IShoppingCartService {
    @Override
    public ShoppingCart saveShoppingCart(ShoppingCart shoppingCart) {
        return null;
    }

    @Override
    public ShoppingCart findShoppingCartById(Integer id) {
        return null;
    }

    @Override
    public List<ShoppingCart> findAllShoppingCart() {
        return null;
    }

    @Override
    public void updateShoppingCartById(Integer id) {

    }

    @Override
    public void deleteShoppingCartById(Integer id) {

    }
}
