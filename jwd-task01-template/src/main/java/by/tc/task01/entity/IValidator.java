package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;

public interface IValidator {

    <E> boolean validate(Criteria<E> criteria);

}
