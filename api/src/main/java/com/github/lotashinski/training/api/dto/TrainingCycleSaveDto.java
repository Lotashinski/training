package com.github.lotashinski.training.api.dto;

import com.github.lotashinski.training.api.entity.Period;

import lombok.Data;

@Data
public class TrainingCycleSaveDto {

	private String title;
	
	private String description;
	
	private Period period;
	
}
