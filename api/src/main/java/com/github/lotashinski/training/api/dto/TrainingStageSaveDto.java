package com.github.lotashinski.training.api.dto;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TrainingStageSaveDto {

	@NotNull
    private UUID trainingCycle;
	
	@NotBlank
	private LocalDate startAt;
	
	@NotBlank
	private LocalDate endAt;
	
}
