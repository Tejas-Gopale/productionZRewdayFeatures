package com.gtservice.production_ready_features.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;


@MappedSuperclass //this annoation will add the filds which was inherated from all this class
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class) // Anotation for adding the Auditing on the entity step 1
@Audited
public class AuditableEntity {

//	Auditing Part 
	@CreatedDate
	private LocalDateTime creatDateTime;
	
	@LastModifiedDate
	private LocalDate updatedDate;
	
	@CreatedBy
	private String createdBy;
	
	@LastModifiedBy
	private String updatedBy;
}
