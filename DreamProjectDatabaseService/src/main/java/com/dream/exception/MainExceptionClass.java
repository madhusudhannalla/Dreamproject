package com.dream.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.dream.ExceptionBeans.ValidationBean;

@ControllerAdvice
public class MainExceptionClass {

	
	@ExceptionHandler(value=InvalidDetailsException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	public ResponseEntity<String> notValidDetails(InvalidDetailsException msg){
		return new ResponseEntity<String>(msg.getMessage(),HttpStatus.NOT_FOUND);
		
	}
}
