package com.gtservice.production_ready_features.auth;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<String>{

	@Override
	public Optional<String> getCurrentAuditor() {
		
		//getSecurity Context
		
		//get 	authentication
		
		//get the 	principal
		
		return Optional.of("Tejas Gopale");
	}

}
