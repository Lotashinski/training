package com.github.lotashinski.training.api.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class TrainingStageDto {
	
	private UUID id;
	
	private UUID trainingCycle;
	
	private LocalDate startAt;
	
	private LocalDate endAt;
	
	private List<? extends ExerciseTypeDto> exerciseTypes = new ArrayList<>();
	
	private List<? extends TrainingObjectiveDto> objectives = new ArrayList<>();
	
	private List<? extends TrainingVolumeDto> volumes = new ArrayList<>();
	
}
