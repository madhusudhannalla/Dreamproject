package com.dream.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.dream.ExceptionBeans.ErrorBean;
import com.dream.dto.CustomerLoginDTO;

@ControllerAdvice
public class MainExceptionClass {

	
//	@ExceptionHandler(value=InvalidDetailsException.class)
//	@ResponseStatus(value=HttpStatus.NOT_FOUND)
//	public ResponseEntity<String> notValidDetails(InvalidDetailsException msg){
//		return new ResponseEntity<String>(msg.getMessage(),HttpStatus.NOT_FOUND);
//		
//	}
	@ExceptionHandler(InvalidDetailsException.class)
	//@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	public CustomerLoginDTO handleFDBusinessException(InvalidDetailsException exception) {
		//logger.error(CLASS_NAME, BFLLoggerComponent.EXCEPTION_HANDLER, LOG_ERROR + exception.toString());
		ErrorBean errorBean=new ErrorBean();
		errorBean.setErrorCode(exception.getErrorCode());
		errorBean.setErrorMessage(exception.getMessage());
		CustomerLoginDTO customerLoginDTO = new CustomerLoginDTO();
		customerLoginDTO.setErrorBean(errorBean);
		return customerLoginDTO;
	}
}
