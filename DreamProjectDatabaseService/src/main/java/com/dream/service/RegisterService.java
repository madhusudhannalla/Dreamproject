package com.dream.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dream.beans.CustomerPersonalDetails;
import com.dream.beans.CustomerRegistration;
import com.dream.dto.CustomerLoginDTO;
import com.dream.dto.CustomerPersonalDetailsDTO;
import com.dream.dto.CustomerRegistrationDTO;
import com.dream.exception.InvalidDetailsException;
import com.dream.repo.CustomerPersonalDetailsRepo;
import com.dream.repo.UserRegistrationRepo;

@Service
public class RegisterService {

	
	@Autowired
	private UserRegistrationRepo repo;
	
	@Autowired
	private CustomerPersonalDetailsRepo personalDetailsRepo;
	

			public ResponseEntity<CustomerRegistration> storeUserDetails(CustomerRegistrationDTO customerRegistration) {
				
				CustomerRegistration reg=new CustomerRegistration();
				reg.setMail(customerRegistration.getMail());
				reg.setPassword(customerRegistration.getPassword());
				 CustomerRegistration save= repo.save(reg);
				 return new ResponseEntity<CustomerRegistration>(save,HttpStatus.OK);
			}


			public CustomerLoginDTO getLogin(CustomerLoginDTO logInDTO) {
				String mail = logInDTO.getMail();
				String password = logInDTO.getPassword();
				CustomerRegistration loginDetails= repo.findByMailAndPassword(mail,password);
				if(Objects.nonNull(loginDetails)) {
				
				CustomerLoginDTO customerLoginDTO=new CustomerLoginDTO();
				customerLoginDTO.setSuccessMsg("loged in successfully");
				customerLoginDTO.setSuccessCode("200");
					return customerLoginDTO;
					   
					}
				else if(Objects.isNull(loginDetails)) 
					    throw new InvalidDetailsException("404","Invalid credentials");
                       return null;  
					  
				
}


			public ResponseEntity<String> storeCustomerPersonalDetails(CustomerPersonalDetailsDTO customerPersonalDetails) {
               CustomerPersonalDetails details=new CustomerPersonalDetails();
               details.setCustomerName(customerPersonalDetails.getCustomerName());
               details.setCustomerAddress1(customerPersonalDetails.getCustomerAddress1());
               details.setCustomerAddress2(customerPersonalDetails.getCustomerAddress2());
				details.setCustomerParent(customerPersonalDetails.getCustomerParent());
				//details.setCustomerId(customerPersonalDetails.get);
				details.setCustomerMail(customerPersonalDetails.getCustomerMail());;
			                   personalDetailsRepo.save(details);
				
			                   return new ResponseEntity<String>(HttpStatus.OK);
				
			}
}

