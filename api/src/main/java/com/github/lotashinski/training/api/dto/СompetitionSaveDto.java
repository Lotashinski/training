package com.github.lotashinski.training.api.dto;

import java.time.Period;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class СompetitionSaveDto {

	@NotBlank
	private String title;
	
	@Valid
	private Period period;
	
}
