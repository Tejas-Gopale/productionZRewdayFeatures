package com.gtservice.production_ready_features.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;

@Configuration
public class RestClientConfig {
	
	@Value("${employeeServce.base.url}")
	private  String BASE_URL; 

	@SuppressWarnings("deprecation")
	@Bean
	@Qualifier("employeeRestClient")
	RestClient getEmployeeServiceRestClient() {
	return	RestClient.builder()
			.baseUrl(BASE_URL)
			.defaultHeader(CONTENT_TYPE, APPLICATION_JSON_UTF8_VALUE)
			.build();
	}
}
