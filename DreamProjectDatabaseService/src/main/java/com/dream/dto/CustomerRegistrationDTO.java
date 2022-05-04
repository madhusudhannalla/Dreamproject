package com.dream.dto;

import java.util.List;

import com.dream.beans.StoreAreas;

public class CustomerRegistrationDTO {

	
	private String mail;
	
	private String password;
	
	
	private List<StoreAreas> storeAreas;

	

	public List<StoreAreas> getStoreAreas() {
		return storeAreas;
	}

	public void setStoreAreas(List<StoreAreas> storeAreas) {
		this.storeAreas = storeAreas;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMail() {
		return mail;
	}

	public void setEmail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
