package edu.miu.e_mart.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

//This class is A CartItem which has a product and quantity of product

@Entity
public class CartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer itemId;

	// a CartItem has a product

	@OneToOne(cascade = CascadeType.PERSIST)
	private Product product;
//	@NotNull
	private int itemQuantity;


	public Integer getItemId() {
		return itemId;
	}

	// The no-args constructor

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
}
