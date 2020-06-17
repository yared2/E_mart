package edu.miu.e_mart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.miu.e_mart.domain.ACredential;
import edu.miu.e_mart.service.definition.IACredentialService;


@Controller
public class LoginController {
	@Autowired
	private IACredentialService credentialService;

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String diplayLogin(@ModelAttribute("credential") ACredential credential) {
		return "login";
	}

	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public String login(@ModelAttribute("credential") ACredential credential) {

//		ACredential user_credential = credentialService.findACredentialByUsername(credential.getUsername());
//		if (user_credential.role.roleName.equals("admin")) {
//			
//			return "redirect:/admin/products/list";
//		}

		return "redirect:/customer/products/list"; 
	}

	@RequestMapping(value = { "/logout" }, method = RequestMethod.GET)
	public String logout(@ModelAttribute("credential") ACredential credential) {
		return "login";
	}

}
