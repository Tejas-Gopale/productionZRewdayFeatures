package com.gtservice.production_ready_features.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.gtservice.production_ready_features.auth.AuditorAwareImpl;

// model mapper is used to map the one object with the other 
@Configuration //@Cofiguration is used on the top of the class in which the extern configuration is used
@EnableJpaAuditing(auditorAwareRef = "getAuditorAwareImpl" ) // add this anotation to any configuration class to start the JPA Audating 
public class AppConfig {
	
	@Bean
	ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	//aduitor aware implementation for the benas
	@Bean
	AuditorAware<String> getAuditorAwareImpl() {
		return new AuditorAwareImpl();
	}

}
