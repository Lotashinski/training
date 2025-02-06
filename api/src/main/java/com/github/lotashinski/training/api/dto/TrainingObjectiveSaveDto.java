package com.github.lotashinski.training.api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TrainingObjectiveSaveDto {
	
	@NotBlank
	private String description;
	
}
