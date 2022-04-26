package com.dream.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dream.beans.CustomerRegistration;

@Repository
public interface UserRegistrationRepo extends JpaRepository<CustomerRegistration, String> {

	CustomerRegistration findByMailAndPassword(String mail,String password);

	
	
}
