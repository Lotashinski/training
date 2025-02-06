package com.github.lotashinski.training.api.dto;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Data;

@Data
public class СompetitionDto {
	
	private UUID id;
	
	private String title;
	
	private LocalDate startAt;
	
	private LocalDate endAt;
	
}
