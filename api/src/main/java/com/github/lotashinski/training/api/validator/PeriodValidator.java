package com.github.lotashinski.training.api.validator;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.github.lotashinski.training.api.entity.Period;

@Service
public class PeriodValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Period.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Period period = (Period) target;
		
		if (period.getStart() == null) {
			errors.rejectValue("period", "date start can not be null");
		}
		
		if (period.getEnd() == null) {
			errors.rejectValue("period", "date end can not be null");
		}
		
	}

}
