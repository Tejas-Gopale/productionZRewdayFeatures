package com.gtservice.production_ready_features.exceptions;

public class ResourceNotFoundException extends RuntimeException	{

	public ResourceNotFoundException(String message) {
		super(message);
	}
}