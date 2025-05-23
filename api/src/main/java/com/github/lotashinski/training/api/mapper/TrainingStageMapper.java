package com.github.lotashinski.training.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

import com.github.lotashinski.training.api.dto.TrainingStageDto;
import com.github.lotashinski.training.api.dto.TrainingStageItemDto;
import com.github.lotashinski.training.api.dto.TrainingStageSaveDto;
import com.github.lotashinski.training.api.entity.TrainingStage;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, 
		uses = { TrainingObjectivesMapper.class, ExerciseVolumeMapper.class })
public interface TrainingStageMapper {

	TrainingStageItemDto toDto(TrainingStage source, @MappingTarget TrainingStageItemDto target);
	
	@Mapping(target = "exerciseVolumes", ignore = true)
	TrainingStageDto toDto(TrainingStage source, @MappingTarget TrainingStageDto target);
	
	@Mapping(target = "volumes", ignore = true)
	@Mapping(target = "trainingCucle", ignore = true)
	@Mapping(target = "objectives", ignore = true)
	TrainingStage toEntity(TrainingStageSaveDto source, @MappingTarget TrainingStage target);
	
}
