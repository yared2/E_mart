package edu.miu.e_mart.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cartId;
    @OneToOne
    private Customer customer;
//    @OneToMany
//    private List<CartItem> listOfItems= new ArrayList<>();

    public Customer getCustomer() {
        return customer;
    }
    // constructor


    public ShoppingCart() {
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

//    public List<CartItem> getListOfItems() {
//        return listOfItems;
//    }
//
//    public void setItem(CartItem item) {
//        this.listOfItems.add(item);
//    }

    public Integer getCartId() {
        return cartId;
    }

}
