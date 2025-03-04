package com.github.lotashinski.training.api.dto;

import java.util.UUID;

import com.github.lotashinski.training.api.entity.Period;

import lombok.Data;

@Data
public class СompetitionItemDto {
	
	private UUID id;
	
	private String title;
	
	private Period period;
	
}
