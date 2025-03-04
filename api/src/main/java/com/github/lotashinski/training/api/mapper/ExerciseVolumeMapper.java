package com.github.lotashinski.training.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

import com.github.lotashinski.training.api.dto.ExerciseVolumeDto;
import com.github.lotashinski.training.api.dto.ExerciseVolumeItemDto;
import com.github.lotashinski.training.api.dto.ExerciseVolumeSaveDto;
import com.github.lotashinski.training.api.entity.ExerciseVolume;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ExerciseVolumeMapper {

	ExerciseVolumeItemDto toDto(ExerciseVolume source, @MappingTarget ExerciseVolumeItemDto target);

	ExerciseVolumeDto toDto(ExerciseVolume source, @MappingTarget ExerciseVolumeDto target);

	ExerciseVolume toEntity(ExerciseVolumeSaveDto source, @MappingTarget ExerciseVolume target);

}
