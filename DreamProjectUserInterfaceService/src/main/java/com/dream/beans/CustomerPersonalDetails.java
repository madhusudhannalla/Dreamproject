package com.dream.beans;

public class CustomerPersonalDetails {

	private String customerName;
	
	private String customerAddress1;
	
	private String customerAddress2;
	
	private Long customerMobile;
	
	private String customerParent;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
		return "CustomerPersonalDetails [customerName=" + customerName + ", customerAddress1=" + customerAddress1
				+ ", customerAddress2=" + customerAddress2 + ", customerMobile=" + customerMobile + ", customerParent="
				+ customerParent + "]";
	}
	
	
	
	
}
