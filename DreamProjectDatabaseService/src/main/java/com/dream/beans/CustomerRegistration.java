package com.dream.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerRegistration {

	@Id
	@Column(name="mail")
	private String mail;
	
	@Column(name="password")
	private String password;
	
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "CustomerRegistration [mail=" + mail + ", password=" + password + "]";
	}
	
	
}
