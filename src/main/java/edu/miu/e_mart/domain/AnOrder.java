package edu.miu.e_mart.domain;

import edu.miu.e_mart.util.Util;

import javax.persistence.*;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Qualifier;

import java.time.LocalDate;

//@Entity
//@Qualifier("order1")
//public class Order {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer orderId;
//	
////	@OneToOne
////	private Customer customer;
//	
//	@OneToOne
//	private ShoppingCart shoppingCart;
//
//	private LocalDate orderDate;
//
//	public Order() {
//
//	}
//
//	public Customer getCustomer() {
//		return getCustomer();
//	}
//
////	public void setCustomer() {
////		this.customer = this.shoppingCart.getCustomer();
////	}
//
//	/**
//	 * @return the shopping cart of the current order
//	 */
//	public ShoppingCart getShoppingCart() {
//		return shoppingCart;
//	}
//
//	/**
//	 * this method will set the shopping cart from the session
//	 * 
//	 * @param request the request in order to get the shopping cart from the session
//	 */
//	public void setShoppingCart(HttpServletRequest request) {
//		this.shoppingCart = Util.getCartInSession(request);
////		this.customer = this.shoppingCart.getCustomer();
//
//	}
//
//	public int getOrderId() {
//		return orderId;
//	}
//
//	public LocalDate getOrderDate() {
//		return orderDate;
//	}
//
//	public void setOrderDate() {
//		LocalDate timeStamp = LocalDate.now();
//		this.orderDate = timeStamp;
//	}

//}
