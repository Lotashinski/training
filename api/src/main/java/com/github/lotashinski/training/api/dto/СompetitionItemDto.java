package com.github.lotashinski.training.api.dto;

import java.time.Period;
import java.util.UUID;

import lombok.Data;

@Data
public class СompetitionItemDto {
	
	private UUID id;
	
	private String title;
	
	private Period period;
	
}
