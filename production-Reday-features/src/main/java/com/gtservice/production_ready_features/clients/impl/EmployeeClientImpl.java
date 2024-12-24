package com.gtservice.production_ready_features.clients.impl;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.gtservice.production_ready_features.clients.EmployeeClients;
import com.gtservice.production_ready_features.dto.EmployeeDTO;

@Service
public class EmployeeClientImpl implements EmployeeClients{

	
	@Autowired
	private  RestClient  restClient;
	
	@Override
	public List<EmployeeDTO> getAllEmployees() {
	try {
		
		List<EmployeeDTO>	employeeDTOList = restClient.get()
				.uri("employees").retrieve().body(new ParameterizedTypeReference<>() {
				});
		
		return employeeDTOList;
		
	}catch (Exception e) {
		throw new RuntimeErrorException(e);
	}
	}

}
