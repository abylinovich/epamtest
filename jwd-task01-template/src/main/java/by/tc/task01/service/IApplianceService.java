package by.tc.task01.service;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public interface IApplianceService {
	
	<E> Appliance find(Criteria<E> criteria);
	
}
