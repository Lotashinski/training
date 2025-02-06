package com.github.lotashinski.training.api.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class TrainingVolumeDto {

	private UUID id;
	
	private UUID trainingStage;
	
	private Integer sessions;
	
	private Long volume;
	
	private String units;
	
}
