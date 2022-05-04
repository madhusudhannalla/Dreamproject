package com.dream.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dream.beans.CustomerPersonalDetails;
import com.dream.beans.StoreAreas;
import com.dream.dto.CustomerLoginDTO;
import com.dream.dto.CustomerPersonalDetailsDTO;
import com.dream.dto.CustomerRegistrationDTO;
import com.dream.repo.CustomerPersonalDetailsRepo;
import com.dream.service.RegisterService;

@RestController
public class CustomerRegistrationController {

	@Autowired
	private RegisterService registerService;
	
	@Autowired
	private CustomerPersonalDetailsRepo personalDetailsRepo;
	

	@PostMapping("/postUserDetails")
	public ResponseEntity<String> customerRegistration(@RequestBody CustomerRegistrationDTO customerRegistration) {

		registerService.storeUserDetails(customerRegistration);

		return new ResponseEntity<String>("stored", HttpStatus.OK);
	}

	@PostMapping("/login")
	public CustomerLoginDTO CustomerLogin(@RequestBody CustomerLoginDTO logInDTO) {
		// CustomerLoginDTO customerLoginDTO=new CustomerLoginDTO();
		CustomerLoginDTO login = registerService.getLogin(logInDTO);
		System.out.println(login);
//		if(login.getMail().equalsIgnoreCase("login")) {
//			customerLoginDTO.setEmail(login.getMail());
//			customerLoginDTO.setPassword(login.getPassword());
		return login;
		// }

		// else
		// return login;
	}

	@PostMapping("/registerUserPersonalDetails")
	public ResponseEntity<String> customerPersonalDetails(
			@RequestBody CustomerPersonalDetailsDTO customerPersonalDetails) {

		ResponseEntity<String> storeUserDetails = registerService.storeCustomerPersonalDetails(customerPersonalDetails);

		return storeUserDetails;

	}
	
	
	
	@PostMapping("/storeAreas")
	public ResponseEntity<?> storeAreas(@RequestBody StoreAreas storeAreas){
		registerService.storeAreas(storeAreas);
		return null;
	}
	
	

	@DeleteMapping("/delete/{id}")
	public String update(@PathVariable int id){
		
		
		personalDetailsRepo.deleteById(id);
		return "deleted";
	}
	

}
