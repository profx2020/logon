package com.profx.fixservices.profx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.profx.fixservices.profx.model.User;

@RestController
public class LogonController {
	
	
	@GetMapping("/login")
	public String  getLogin(){
		System.out.print("login");
		return "login";
	}

}
