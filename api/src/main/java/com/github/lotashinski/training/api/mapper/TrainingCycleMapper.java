package com.github.lotashinski.training.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

import com.github.lotashinski.training.api.dto.TrainingCycleDto;
import com.github.lotashinski.training.api.dto.TrainingCycleItemDto;
import com.github.lotashinski.training.api.dto.TrainingCycleSaveDto;
import com.github.lotashinski.training.api.entity.TrainingCycle;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, 
		uses = { TrainingStageMapper.class,	CompetitionMapper.class })
public interface TrainingCycleMapper {

	@Mapping(target = "stages", ignore = true)
	@Mapping(target = "competitions", ignore = true)
	TrainingCycleDto toDto(TrainingCycle source, @MappingTarget TrainingCycleDto target);

	TrainingCycleItemDto toDto(TrainingCycle source, @MappingTarget TrainingCycleItemDto target);

	@Mapping(target = "competitions", ignore = true)
	@Mapping(target = "trainingStages", ignore = true)
	TrainingCycle toEntity(TrainingCycleSaveDto source, @MappingTarget TrainingCycle target);

}

