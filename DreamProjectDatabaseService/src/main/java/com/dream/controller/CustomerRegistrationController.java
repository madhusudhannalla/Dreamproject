package com.dream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dream.dto.CustomerLoginDTO;
import com.dream.dto.CustomerPersonalDetailsDTO;
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
	public CustomerLoginDTO CustomerLogin(@RequestBody CustomerLoginDTO logInDTO){
	//	CustomerLoginDTO customerLoginDTO=new CustomerLoginDTO();
		CustomerLoginDTO login = registerService.getLogin(logInDTO);
		System.out.println(login);
//		if(login.getMail().equalsIgnoreCase("login")) {
//			customerLoginDTO.setEmail(login.getMail());
//			customerLoginDTO.setPassword(login.getPassword());
			return login;
		//}
			
		//else
			//return login;
	}
	
	@PostMapping("/registerUserPersonalDetails")
	public ResponseEntity<String> customerPersonalDetails(@RequestBody CustomerPersonalDetailsDTO customerPersonalDetails) {

		ResponseEntity<String> storeUserDetails = registerService.storeCustomerPersonalDetails(customerPersonalDetails);

		return storeUserDetails;

	}
	
}
