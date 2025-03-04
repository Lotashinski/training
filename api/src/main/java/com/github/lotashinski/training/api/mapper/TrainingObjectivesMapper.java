package com.github.lotashinski.training.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

import com.github.lotashinski.training.api.dto.TrainingObjectiveDto;
import com.github.lotashinski.training.api.dto.TrainingObjectiveItemDto;
import com.github.lotashinski.training.api.dto.TrainingObjectiveSaveDto;
import com.github.lotashinski.training.api.entity.TrainingObjectives;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TrainingObjectivesMapper {

	TrainingObjectiveItemDto toDto(TrainingObjectives source, @MappingTarget TrainingObjectiveItemDto target);
	
	TrainingObjectiveDto toDto(TrainingObjectives source, @MappingTarget TrainingObjectiveDto target);
	
	TrainingObjectives toEntity(TrainingObjectiveSaveDto source, @MappingTarget TrainingObjectives target);
	
}
