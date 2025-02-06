package com.github.lotashinski.training.api.dto;

import java.util.UUID;

import com.github.lotashinski.training.api.entity.Period;

import lombok.Data;

@Data
public class TrainingStageItemDto {
	
	private UUID id;
	
	private Period period;
	
	private String title;
	
}
