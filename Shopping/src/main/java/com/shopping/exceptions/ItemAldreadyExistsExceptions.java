package com.shopping.exceptions;

public class ItemAldreadyExistsExceptions extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String code;
	private String message;
	
	
	public ItemAldreadyExistsExceptions() {
	}
	
	
	public ItemAldreadyExistsExceptions(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
}

