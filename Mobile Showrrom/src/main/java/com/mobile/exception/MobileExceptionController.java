package com.mobile.exception;

import org.springframework.stereotype.Component;

@Component
public class MobileExceptionController extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String erroCode;
	private String errorMessage;
	
	public String getErroCode() {
		return erroCode;
	}
	public void setErroCode(String erroCode) {
		this.erroCode = erroCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public MobileExceptionController() {
		
	}
	
	public MobileExceptionController(String erroCode, String errorMessage) {
		super();
		this.erroCode = erroCode;
		this.errorMessage = errorMessage;
	}
	
	
}


