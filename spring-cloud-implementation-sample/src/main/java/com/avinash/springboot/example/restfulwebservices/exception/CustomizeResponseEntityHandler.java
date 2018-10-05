package com.avinash.springboot.example.restfulwebservices.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.avinash.springboot.example.restfulwebservices.user.UserNotFoundExecption;

@ControllerAdvice
@RestController
public class CustomizeResponseEntityHandler
extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, 
			WebRequest request) {
		ExceptionResponse execption = 
				new ExceptionResponse(new Date(), 
						ex.getMessage() , request.getDescription(false));
		
		return new ResponseEntity(execption,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserNotFoundExecption.class)
	public final ResponseEntity<Object> handleUsrNotFoundException(UserNotFoundExecption ex, 
			WebRequest request) {
		ExceptionResponse execption = 
				new ExceptionResponse(new Date(), 
						ex.getMessage() , request.getDescription(false));
		
		return new ResponseEntity(execption,HttpStatus.NOT_FOUND);
	}
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex,
			HttpHeaders headers, 
			HttpStatus status, WebRequest request) {

		ExceptionResponse execption = 
				new ExceptionResponse(new Date(), 
"Validation failed " ,
ex.getBindingResult().toString());
		
		return new ResponseEntity(execption,HttpStatus.BAD_REQUEST);
	}



}
