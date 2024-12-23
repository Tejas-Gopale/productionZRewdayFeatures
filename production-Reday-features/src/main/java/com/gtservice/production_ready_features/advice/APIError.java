package com.gtservice.production_ready_features.advice;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class APIError {

	private LocalDate timeStamp;
	private String error;
	private HttpStatus statusCode;
	
	
	public APIError(String error, HttpStatus statusCode) {
		super();
		this.error = error;
		this.statusCode = statusCode;
	}


	public APIError() {
		super();
		this.timeStamp = LocalDate.now();
	}
	
	
}
