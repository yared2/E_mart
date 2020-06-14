package edu.miu.e_mart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.miu.e_mart.domain.Credential;

@Controller
public class LoginController {
	@RequestMapping(value= {"/login"}, method = RequestMethod.GET)
	public String getLoginPage(@ModelAttribute("credential")Credential credential) {
		return "login/login";
	}
	
	@RequestMapping(value= {"/login"}, method = RequestMethod.POST)
	public String login(@ModelAttribute("credential")Credential credential) {
		return "products";
	}

}
