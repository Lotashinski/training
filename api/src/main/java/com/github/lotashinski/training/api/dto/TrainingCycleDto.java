package com.github.lotashinski.training.api.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class TrainingCycleDto {
	
	private UUID id;
	
	private LocalDate startAt;
	
	private LocalDate endAt;
	
	private List<? extends TrainingStageDto> stages = new ArrayList<>();
	                       
	private List<? extends СompetitionDto> competitions = new ArrayList<>();
	
}
