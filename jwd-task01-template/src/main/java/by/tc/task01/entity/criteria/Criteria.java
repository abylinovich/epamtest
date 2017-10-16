package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

	private Map<E, Object> criteria = new HashMap<>();
	private String criteriaType;

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
	
	public Map<E, Object> getCriteriaMap() {
		return criteria;
	}

	public String getCriteriaType() {
		return criteriaType;
	}

	public void setCriteriaType(String criteriaType) {
		this.criteriaType = criteriaType;
	}

}
