package com.github.lotashinski.training.api.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.github.lotashinski.training.api.entity.Period;

import lombok.Data;

@Data
public class TrainingCycleDto {
	
	private UUID id;
	
	private Period period;
	
	private String title;
	
	private String description;
	
	private List<TrainingStageDto> stages = new ArrayList<>();
	                       
	private List<СompetitionDto> competitions = new ArrayList<>();
	
}
