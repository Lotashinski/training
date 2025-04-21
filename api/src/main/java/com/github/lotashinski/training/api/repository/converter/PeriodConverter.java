package com.github.lotashinski.training.api.repository.converter;

import com.github.lotashinski.training.api.entity.Period;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class PeriodConverter implements AttributeConverter<Period, Integer> {

	@Override
	public Integer convertToDatabaseColumn(Period attribute) {
		return attribute == null ? null : attribute.getAllDays();
	}

	@Override
	public Period convertToEntityAttribute(Integer dbData) {
		if (dbData == null) {
			return null;
		}
	
		
		return new Period(dbData);
	}

}
