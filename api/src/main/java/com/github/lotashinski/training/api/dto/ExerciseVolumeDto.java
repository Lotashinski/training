package com.github.lotashinski.training.api.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class ExerciseVolumeDto {

	private UUID id;
	
	private String title;
	
	private int trainingsCount;
	
	private long totalVolume;
	
	private String units;
	
}
