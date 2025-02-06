package com.github.lotashinski.training.api.dto;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Data;

@Data
public class TrainingStageItemDto {
	
	private UUID id;
	
	private UUID trainingCycle;
	
	private LocalDate startAt;
	
	private LocalDate endAt;
	
}
