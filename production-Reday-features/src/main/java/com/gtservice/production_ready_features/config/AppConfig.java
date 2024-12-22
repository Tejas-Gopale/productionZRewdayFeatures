package com.gtservice.production_ready_features.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

// model mapper is used to map the one object with the other 
@Configuration
public class AppConfig {
	
	@Bean
	ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
