package com.github.lotashinski.training.api.service;

import java.util.List;
import java.util.UUID;

import com.github.lotashinski.training.api.dto.TrainingCycleItemDto;
import com.github.lotashinski.training.api.dto.TrainingCycleSaveDto;

public interface TrainingCycleService {
	
	List<? extends TrainingCycleItemDto> getAll();
	
	TrainingCycleItemDto findById(UUID id);
	
	TrainingCycleItemDto save(TrainingCycleSaveDto dto);
	
	TrainingCycleItemDto update(UUID id, TrainingCycleSaveDto dto);
	
	void delete(UUID id);
	
}
