package edu.miu.e_mart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.miu.e_mart.domain.ARole;
import edu.miu.e_mart.domain.Customer;

import edu.miu.e_mart.service.implementation.CustomerServiceImp;

@Controller
public class CustomerController {

	@Autowired
	CustomerServiceImp customerServiceImple;
	
	@RequestMapping(value = {"/Customer"}, method = RequestMethod.GET)
	public String customerForm(@ModelAttribute("newCustomer") Customer customer) {
		return "customerForm";
	}
	@RequestMapping(value = {"/addCustomer"}, method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("newCustomer") Customer customer) {

		
		System.out.println("hiii");
		
		

	customerServiceImple.addCustomer(customer);
		return "redirect:/login";
	}

//	@RequestMapping(value="/customer_products" ,method = RequestMethod.GET)
//public String anypage() {
//	return "customer_products";
//}
}
