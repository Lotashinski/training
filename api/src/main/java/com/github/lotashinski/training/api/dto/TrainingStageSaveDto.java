package com.github.lotashinski.training.api.dto;

import com.github.lotashinski.training.api.entity.Period;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TrainingStageSaveDto {
	
	@Valid
	private Period period;
	
	@NotBlank
	private String title;
	
}
