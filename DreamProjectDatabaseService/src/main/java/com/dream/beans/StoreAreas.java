package com.dream.beans;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StoreAreas {

	@Column
	@Id
	@GeneratedValue
	private int areaId;
	
	@Column
	private String areaName;
	
	//@Column
	@ManyToOne(cascade=CascadeType.ALL)
	private CustomerRegistration mail;

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public CustomerRegistration getMail() {
		return mail;
	}

	public void setMail(CustomerRegistration mail) {
		this.mail = mail;
	}

	
	
	
	

	
	
	
	
}
