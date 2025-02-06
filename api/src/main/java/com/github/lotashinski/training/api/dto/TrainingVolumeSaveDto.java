package com.github.lotashinski.training.api.dto;

import java.util.UUID;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TrainingVolumeSaveDto {

	@NotNull
	private UUID trainingStage;
	
	@Min(1)
	@NotNull
	private Integer sessions;
	
	@Min(1)
	@NotNull
	private Long volume;
	
	private String units;
	
}
