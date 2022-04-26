package com.dream.dto;

import com.dream.ExceptionBeans.ErrorBean;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CustomerLoginDTO {

	
private String successCode;
	
	private String successMsg;
	
	private ErrorBean errorBean;
	
	private String mail;
	
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

	public ErrorBean getErrorBean() {
		return errorBean;
	}

	public void setErrorBean(ErrorBean errorBean) {
		this.errorBean = errorBean;
	}

	public String getSuccessCode() {
		return successCode;
	}

	public void setSuccessCode(String successCode) {
		this.successCode = successCode;
	}

	public String getSuccessMsg() {
		return successMsg;
	}

	public void setSuccessMsg(String successMsg) {
		this.successMsg = successMsg;
	}

	@Override
	public String toString() {
		return "CustomerLoginDTO [successCode=" + successCode + ", successMsg=" + successMsg + ", errorBean="
				+ errorBean + ", mail=" + mail + ", password=" + password + "]";
	}

	
	
	
	
	
	
}
