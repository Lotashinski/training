package com.github.lotashinski.training.api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ExerciseVolumeSaveDto {
	
	@NotBlank
	private String title;
	
	@Min(1)
	private int trainingsCount;
	
	@Min(1)
	private long totalVolume;
	
	@NotBlank
	private String units;
	
}
