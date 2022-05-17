package com.dream.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class CustomerRegistration {

	@Id
	@Column(name="mail")
	private String mail;
	
	@Column(name="password")
	private String password;
	
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="storeAreas")
//	private List<StoreAreas> storeAreas;
//	
	
	
//	public List<StoreAreas> getStoreAreas() {
//		return storeAreas;
//	}
//	public void setStoreAreas(List<StoreAreas> storeAreas) {
//		this.storeAreas = storeAreas;
//	}
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
		return "CustomerRegistration [mail=" + mail + ", password=" + password + ", storeAreas=" +  "]";
	}
	
	
}
