package com.github.lotashinski.training.api.dto;

import com.github.lotashinski.training.api.entity.Period;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data        
public class CompetitionSaveDto {

	@NotBlank
	private String title;
	
	@Valid
	private Period period;
	
}
