package com.micro.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	
	@GetMapping("/")
	public String getWelcomeMsg() {
		return "Welcome To Oauth2.0";
	}
	

}
