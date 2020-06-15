package edu.miu.e_mart.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;
	
	private  String firstName;
	private String lastName;
	private  Payment payment;
	private  ACredential credential;
	private ARole  role;
	private Address address;
	
	
	
	public Customer(){
		
	}



	public Customer( String firstName, String lastName, Payment payment, ACredential credential,
			ARole role, Address address) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.payment = payment;
		this.credential = credential;
		this.role = role;
		this.address = address;
	}



	public Long getCustomerId() {
		return customerId;
	}



	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Payment getPayment() {
		return payment;
	}



	public void setPayment(Payment payment) {
		this.payment = payment;
	}



	public ACredential getCredential() {
		return credential;
	}



	public void setCredential(ACredential credential) {
		this.credential = credential;
	}



	public ARole getRole() {
		return role;
	}



	public void setRole(ARole role) {
		this.role = role;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}
	

}
