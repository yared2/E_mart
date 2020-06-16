package edu.miu.e_mart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import edu.miu.e_mart.domain.ACredential;
import edu.miu.e_mart.service.implementation.ACredentialServiceImp;




@Controller
public class LoginController {
	
	@Autowired
	private ACredentialServiceImp acredential;
	
	@RequestMapping(value= {"/login"}, method = RequestMethod.GET)
	public String getLoginPage(@ModelAttribute("credential") ACredential credential) {
		return "login/login";
	}

	@RequestMapping(value= {"/login"}, method = RequestMethod.POST)
	public String login(@ModelAttribute("credential") ACredential credential) {
		System.out.println(credential.getUserName());
		System.out.println(credential.getPassword());
		ACredential acredentiall =	acredential.getCredntialByUserName(credential.getUserName());
		System.out.println(acredentiall.getPassword());
		
		if(acredentiall.getPassword()!=credential.getPassword()) {
			return "login/login";
		}
		return "products";
	}


}




