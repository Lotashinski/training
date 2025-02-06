package com.github.lotashinski.training.api.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class ExerciseTypeItemDto {

	private UUID id;
	
	private UUID trainingStage;
	
	private String title;
	
}
