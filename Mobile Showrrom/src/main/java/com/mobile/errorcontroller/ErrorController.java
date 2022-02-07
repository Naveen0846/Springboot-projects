package com.mobile.errorcontroller;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mobile.exception.ErrorException;

@ControllerAdvice
public class ErrorController extends ResponseEntityExceptionHandler{

	@ExceptionHandler(ErrorException.class)
	public ResponseEntity<String> handleErrorException(ErrorException errorException){
		return new ResponseEntity<String>("Mobile Name not found . Please Check",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException noSuchElementException){
		return new ResponseEntity<String>(" Requested Id Not Found, Please Check",HttpStatus.BAD_REQUEST);
	}
}