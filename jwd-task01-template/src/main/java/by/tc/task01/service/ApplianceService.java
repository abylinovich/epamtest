package by.tc.task01.service;

import by.tc.task01.dao.IApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceService implements IApplianceService {

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		if (criteria.getCriteriaMap().isEmpty()) {
			return null;
		}

		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}

		DAOFactory factory = DAOFactory.getInstance();
		IApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		return applianceDAO.find(criteria);
	}

}