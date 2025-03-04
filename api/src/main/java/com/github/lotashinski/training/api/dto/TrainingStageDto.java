package com.github.lotashinski.training.api.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.github.lotashinski.training.api.entity.Period;

import lombok.Data;

@Data
public class TrainingStageDto {
	
	private UUID id;
	
	private Period period;
	
	private String title;
	
	private List<ExerciseVolumeDto> exerciseVolumes = new ArrayList<>();
	
	private List<TrainingObjectiveDto> objectives = new ArrayList<>();
	
}
