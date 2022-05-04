package com.dream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dream.service.RegisterService;

@RestController
public class CustomerRegistrationController {

	@Autowired
	private RegisterService registerService;

	@PostMapping("/registerUserDetails/{mail}/{password}")
	public ResponseEntity<String> customerRegistration(@PathVariable(name = "mail") String mail,
			@PathVariable(name = "password") String password) {

		ResponseEntity<String> storeUserDetails = registerService.storeUserDetails(mail, password);

		return storeUserDetails;

	}

	@GetMapping("customerLogin/{mail}/{password}")
	public ResponseEntity<String> CustomerLogin(@PathVariable(name = "mail") String mail,
			@PathVariable(name = "password") String password) {
		ResponseEntity<String> response = registerService.getLogin(mail, password);
		return response ;
	}
}
