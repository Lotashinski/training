package com.github.lotashinski.training.api.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class ExerciseTypeDto {

	private UUID id;
	
	private UUID trainingStage;
	
	private String title;
	
}
