package com.dream.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.dream.beans.CustomerRegistration;
import com.dream.dto.CustomerLoginDTO;
import com.dream.dto.CustomerRegistrationDTO;
import com.dream.exception.InvalidDetailsException;
import com.dream.repo.UserRegistrationRepo;

@Service
public class RegisterService {

	
	@Autowired
	private UserRegistrationRepo repo;
	

			public ResponseEntity<CustomerRegistration> storeUserDetails(CustomerRegistrationDTO customerRegistration) {
				
				CustomerRegistration reg=new CustomerRegistration();
				reg.setMail(customerRegistration.getMail());
				reg.setPassword(customerRegistration.getPassword());
				 CustomerRegistration save= repo.save(reg);
				 return new ResponseEntity<CustomerRegistration>(save,HttpStatus.OK);
			}


			public ResponseEntity<String> getLogin(CustomerLoginDTO logInDTO) {
				String mail = logInDTO.getMail();
				String password = logInDTO.getPassword();
				CustomerRegistration loginDetails= repo.findByMailAndPassword(mail,password);
				if(Objects.nonNull(loginDetails)) {
				if(loginDetails.getMail().equalsIgnoreCase(mail) && loginDetails.getPassword().equalsIgnoreCase(password)) 
					System.out.println("valid");
					return new ResponseEntity<String>(HttpStatus.OK);
					   
					}
				else if(Objects.isNull(loginDetails)) 
					    throw new InvalidDetailsException("Invalid credentials");
                       return null;  
					  
				
}
}

