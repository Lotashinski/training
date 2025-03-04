package com.github.lotashinski.training.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

import com.github.lotashinski.training.api.entity.Period;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PeriodMapper {
	
	Period update(Period source, @MappingTarget Period target);
	
}
