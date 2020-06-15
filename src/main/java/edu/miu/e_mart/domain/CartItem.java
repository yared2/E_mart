/*package edu.miu.e_mart.domain;

import javax.persistence.*;


*//**
 * This class is A CartItem which has a product and quantity of product
 *//*

@Entity
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer itemId;
    *//**
     * a CartItem has a product
     *//*
    @OneToOne
    private Product product;
    *//**
     * number of prduct
     *//*
    private int itemQuantity;

    public Integer getItemId() {
        return itemId;
    }

    *//**
     * The no-args constructor
     *//*
    public CartItem() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
} */
