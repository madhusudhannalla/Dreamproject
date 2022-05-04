package com.dream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dream.beans.CustomerRegistration;
import com.dream.dto.CustomerLoginDTO;
import com.dream.dto.CustomerRegistrationDTO;
import com.dream.service.RegisterService;

@RestController
public class CustomerRegistrationController {

	
	@Autowired
	private RegisterService registerService;
	
	@PostMapping("/postUserDetails")
	public ResponseEntity<String> customerRegistration(@RequestBody CustomerRegistrationDTO customerRegistration){
		
	    registerService.storeUserDetails(customerRegistration);
		
		return new ResponseEntity<String>("stored",HttpStatus.OK);
	}
	

	@PostMapping("/login")
	public ResponseEntity<String> CustomerLogin(@RequestBody CustomerLoginDTO logInDTO){
		
	    ResponseEntity<String> login = registerService.getLogin(logInDTO);
		System.out.println(login);
		return login;
	}
	
}
