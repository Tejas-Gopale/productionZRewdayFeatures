package com.gtservice.production_ready_features.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

	private Long id;
	
	@NotNull
	@NotEmpty
	@NotBlank
	private String title;
	
	@NotBlank(message = "Description cannot be Blank and Empty")
	private String description;

	
}
