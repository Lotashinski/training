package com.github.lotashinski.training.api.dto;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TrainingObjectiveSaveDto {

	@NotNull
	private UUID trainingCycle;
	
	@NotBlank
	private String description;
	
}
