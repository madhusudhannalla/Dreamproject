package com.dream.exception;

public class InvalidDetailsException extends RuntimeException {
	/**
	 * 
	 */
	private final String errorCode;

	public InvalidDetailsException(String errorCode, String msg) {
		super(msg);
		this.errorCode = errorCode;

	}
	public String getErrorCode() {
		return errorCode;
	}

	@Override
	public String toString() {
		return "FDBusinessException [errorCode=" + errorCode + ", errorMessage=" + getMessage() + "]";
	}

}
