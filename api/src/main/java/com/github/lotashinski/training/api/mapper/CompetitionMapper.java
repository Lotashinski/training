package com.github.lotashinski.training.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

import com.github.lotashinski.training.api.dto.CompetitionSaveDto;
import com.github.lotashinski.training.api.dto.СompetitionDto;
import com.github.lotashinski.training.api.dto.СompetitionItemDto;
import com.github.lotashinski.training.api.entity.Competition;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CompetitionMapper {

	СompetitionItemDto toDto(Competition source, @MappingTarget СompetitionItemDto target);

	СompetitionDto toDto(Competition source, @MappingTarget СompetitionDto target);

	@Mapping(target = "trainingCycle", ignore = true)
	Competition toEntity(CompetitionSaveDto source, @MappingTarget Competition target);

}
