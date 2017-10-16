package by.tc.task01.dao;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public interface IApplianceDAO {
	<E> Appliance find(Criteria<E> criteria);
}
