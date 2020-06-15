package edu.miu.e_mart.service.definition;

import edu.miu.e_mart.domain.ShoppingCart;

import java.util.List;

public interface IShoppingCartService {
    public ShoppingCart saveShoppingCart(ShoppingCart shoppingCart);
    public ShoppingCart findShoppingCartById(Integer id);
    public List<ShoppingCart> findAllShoppingCart();
    public void updateShoppingCartById(Integer id);
    public void deleteShoppingCartById(Integer id);

}
