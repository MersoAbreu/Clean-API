package br.com.api.clean.java.service.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class CustumizedResponseEntityvExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> allExceptionsHandler(Exception exception, WebRequest request){
		return new ResponseEntity<Object>(
					new ExceptionResponse(exception.getMessage(), request.getDescription(false), LocalDateTime.now()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
}
