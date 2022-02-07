package org.onebank.exception;

public class PayIdNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public PayIdNotFoundException(String message) {
		super();
		this.message = message;
	}

}
