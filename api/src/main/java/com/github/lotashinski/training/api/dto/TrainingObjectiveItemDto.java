package com.github.lotashinski.training.api.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class TrainingObjectiveItemDto {

	private UUID id;
	
	private UUID trainingCycle;
	
	private String description;
	
}
