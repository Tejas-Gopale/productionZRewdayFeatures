package com.gtservice.production_ready_features.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long id;

   
    private String name;

   
    private String email;

    
    private Integer age;

   
    private String role; //ADMIN, USER

    
    private Double salary;

   
    private LocalDate dateOfJoining;

    private Boolean isActive;
}
