package com.gtservice.production_ready_features.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.gtservice.production_ready_features.exceptions.ResourceNotFoundException;

@RestControllerAdvice // annotation which handels the Exceptions
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<APIError> handelResourceNotFoundException(ResourceNotFoundException exception){
		
		APIError apiError = new APIError(exception.getMessage() , HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(apiError , HttpStatus.NOT_FOUND);
	}
}
