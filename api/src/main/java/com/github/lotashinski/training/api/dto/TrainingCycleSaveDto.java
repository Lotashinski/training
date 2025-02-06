package com.github.lotashinski.training.api.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TrainingCycleSaveDto {

	@NotNull
	private LocalDate startAt;
	
	@NotNull
	private LocalDate endAt;
	
}
