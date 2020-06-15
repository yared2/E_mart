package edu.miu.e_mart.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;

	// @NotEmpty(message = "{validate.notEmpty}")
	private String street;

	// @NotEmpty(message = "{validate.notEmpty}")
	private String city;

	// @NotEmpty(message = "{validate.notEmpty}")
	// @Size(min=2,max=2,message = "{validate.size}")
	private String state;

//	@NotNull(message = "{validate.notNull}")
//	@Size(min=5,max=5,message = "{validate.size}")
	private Integer zipcode;

	public Address() {
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
