package com.dream.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CustomerPersonalDetails {
	
	@Column
	@Id
	@GeneratedValue
	private int customerId;

	@Column
	private String customerName;
	
	@Column
	private String customerAddress1;
	
	@Column
	private String customerAddress2;
	
	@Column
	private Long customerMobile;
	
	@Column
	private String customerParent;

	
	@OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "customerMail")
	private CustomerRegistration customerMail;
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public CustomerRegistration getCustomerMail() {
		return customerMail;
	}

	public void setCustomerMail(CustomerRegistration customerMail) {
		this.customerMail = customerMail;
	}

	public String getCustomerAddress1() {
		return customerAddress1;
	}

	public void setCustomerAddress1(String customerAddress1) {
		this.customerAddress1 = customerAddress1;
	}

	public String getCustomerAddress2() {
		return customerAddress2;
	}

	public void setCustomerAddress2(String customerAddress2) {
		this.customerAddress2 = customerAddress2;
	}

	public Long getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(Long customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getCustomerParent() {
		return customerParent;
	}

	public void setCustomerParent(String customerParent) {
		this.customerParent = customerParent;
	}

	@Override
	public String toString() {
		return "CustomerPersonalDetails [customerId=" + customerId + ", customerName=" + customerName
				+ ", customerAddress1=" + customerAddress1 + ", customerAddress2=" + customerAddress2
				+ ", customerMobile=" + customerMobile + ", customerParent=" + customerParent + ", customerMail="
				+ customerMail + "]";
	}

	
	
	
}
