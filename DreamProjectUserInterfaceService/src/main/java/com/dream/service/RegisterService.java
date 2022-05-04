package com.dream.service;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dream.beans.CustomerRegistration;
import com.dream.beans.CustomerSignIn;

@Service
public class RegisterService {

	
	@Autowired
	private RestTemplate restTemplate;
	
	
	         public ResponseEntity<String> storeUserDetails(String mail,String password) {
	        	 CustomerRegistration registration=new CustomerRegistration();
	        	 registration.setMail(mail);
	        	 registration.setPassword(password);
	        	 HttpEntity<CustomerRegistration> requestEntity=new HttpEntity<CustomerRegistration>(registration);
	        	 
	        	String postForEntity = restTemplate.postForObject("http://localhost:8082/postUserDetails", requestEntity, String.class);
	        	 
	        	 return new ResponseEntity<String>(postForEntity,HttpStatus.OK);
	         }


			public ResponseEntity<String> getLogin(String mail, String password) {
                        CustomerSignIn customerSignIn=new CustomerSignIn();
                        customerSignIn.setMail(mail);
                        customerSignIn.setPassword(password);
                        HttpEntity<CustomerSignIn> entityRequest=new HttpEntity<>(customerSignIn);
				      ResponseEntity<String> login = restTemplate.exchange("http://localhost:8082/login",HttpMethod.POST, entityRequest,String.class);
			          return login;
			}
	
}
