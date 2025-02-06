package com.github.lotashinski.training.api.dto;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ExerciseTypeSaveDto {
	
	@NotNull
	private UUID trainingStage;
	
	@NotBlank
	private String title;
	
}
