package com.dream.ExceptionBeans;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ErrorBean implements Serializable {
	private String errorCode;
	private String errorMessage;
    
	public ErrorBean() {
		super();
	}

	public ErrorBean(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "ErrorBean [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}

}