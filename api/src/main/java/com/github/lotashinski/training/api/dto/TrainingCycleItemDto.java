package com.github.lotashinski.training.api.dto;

import java.time.LocalDate;
import java.util.UUID;

import com.github.lotashinski.training.api.entity.Period;

import lombok.Data;

@Data
public class TrainingCycleItemDto {
	
	private UUID id;
	
	private String title;
	
	private String description;
	
	private Period period;
	
}
