package by.tc.task01.service;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.ApplianceValidatorFactory;
import by.tc.task01.entity.IValidator;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		ApplianceValidatorFactory factory = new ApplianceValidatorFactory();
		IValidator validator = factory.getValidator(criteria.getCriteriaType());
		return validator != null && validator.validate(criteria);
	}

}