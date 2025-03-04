package com.github.lotashinski.training.api.service;

import java.util.List;
import java.util.UUID;

import com.github.lotashinski.training.api.dto.TrainingCycleDto;
import com.github.lotashinski.training.api.dto.TrainingCycleItemDto;
import com.github.lotashinski.training.api.dto.TrainingCycleSaveDto;

public interface TrainingCycleService {
	
	List<? extends TrainingCycleItemDto> getAll();
	
	TrainingCycleDto findById(UUID id);
	
	TrainingCycleDto save(TrainingCycleSaveDto dto);
	
	TrainingCycleDto update(UUID id, TrainingCycleSaveDto dto);
	
	void delete(UUID id);
	
}
