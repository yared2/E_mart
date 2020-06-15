package edu.miu.e_mart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import edu.miu.e_mart.domain.ACredential;




@Controller
public class LoginController {
	@RequestMapping(value= {"/login"}, method = RequestMethod.GET)
	public String getLoginPage(@ModelAttribute("credential")ACredential credential) {
		return "login/login";
	}

	@RequestMapping(value= {"/login"}, method = RequestMethod.POST)
	public String login(@ModelAttribute("credential")ACredential credential) {
		return "products";
	}


}




