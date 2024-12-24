package com.gtservice.production_ready_features;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gtservice.production_ready_features.clients.EmployeeClients;
import com.gtservice.production_ready_features.dto.EmployeeDTO;

@SpringBootTest
class ProductionRedayFeaturesApplicationTests {

	@Autowired
	private EmployeeClients employeeClients;
	
	@Test
	void getAllEmployees() {
		List<EmployeeDTO> employeeDTOList = employeeClients.getAllEmployees();
		System.out.println(employeeDTOList);
	}

}
