package com.github.lotashinski.training.api.service.implementation;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.github.lotashinski.training.api.dto.TrainingCycleDto;
import com.github.lotashinski.training.api.dto.TrainingCycleItemDto;
import com.github.lotashinski.training.api.dto.TrainingCycleSaveDto;
import com.github.lotashinski.training.api.entity.TrainingCycle;
import com.github.lotashinski.training.api.exception.HttpResourceNotFound;
import com.github.lotashinski.training.api.mapper.TrainingCycleMapper;
import com.github.lotashinski.training.api.repository.TrainingCycleRepository;
import com.github.lotashinski.training.api.service.TrainingCycleService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class TrainingCycleServiceImpl implements TrainingCycleService {

	private final TrainingCycleRepository trainingCycleRepository;
	
	private final TrainingCycleMapper trainingCycleMapper;
	
	
	@Override
	public List<? extends TrainingCycleItemDto> getAll() {
		log.debug("Load all TrainingCycle");
		
		return trainingCycleRepository.findAll()
				.stream()
				.map(e -> trainingCycleMapper.toDto(e, new TrainingCycleItemDto()))
				.toList();
	}

	@Override
	public TrainingCycleDto findById(UUID id) {
		log.debug("Load TrainingCycle[{}]", id);
		
		return trainingCycleRepository
				.findById(id)
				.map(e -> trainingCycleMapper.toDto(e, new TrainingCycleDto()))
				.orElseThrow(() -> new HttpResourceNotFound(TrainingCycle.class, id));
	}

	@Override
	public TrainingCycleDto save(TrainingCycleSaveDto dto) {
		log.debug("Create TrainingCycle [{}]", dto);
		
		TrainingCycle entity = trainingCycleMapper.toEntity(dto, new TrainingCycle());
		trainingCycleRepository.save(entity);
		
		return trainingCycleMapper.toDto(entity, new TrainingCycleDto());
	}

	@Override
	public TrainingCycleDto update(UUID id, TrainingCycleSaveDto dto) {
		log.debug("Update TrainingCycle[{}] [{}]", id, dto);
		
		TrainingCycle entity = trainingCycleRepository.findById(id)
			.map(e -> trainingCycleMapper.toEntity(dto, e))
			.orElseThrow(() -> new HttpResourceNotFound(TrainingCycle.class, id));
		
		trainingCycleRepository.save(entity);
		
		return trainingCycleMapper.toDto(entity, new TrainingCycleDto());
	}

	@Override
	public void delete(UUID id) {
		log.debug("Delete TrainingCycle[{}]", id);
		
		TrainingCycle entity = trainingCycleRepository.findById(id)
			.orElseThrow(() -> new HttpResourceNotFound(TrainingCycle.class, id));
		
		trainingCycleRepository.delete(entity);		
	}

}
