package com.github.lotashinski.training.api.dto;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Data;

@Data
public class TrainingCycleItemDto {
	
	private UUID id;
	
	private LocalDate startAt;
	
	private LocalDate endAt;
	
}
