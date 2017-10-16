package by.tc.task01.dao;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.ApplianceCreatorFactory;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ApplianceDAO implements IApplianceDAO {

	private static final String DATABASE_PATH = "appliances_db.txt";

	private ApplianceCreatorFactory applianceCreatorFactory = new ApplianceCreatorFactory();

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				getClass().getClassLoader().getResourceAsStream(DATABASE_PATH)))) {
			List<String> currentApplianceList = reader
					.lines()
					.filter(databaseRow -> databaseRow.startsWith(criteria.getCriteriaType()))
					.collect(Collectors.toList());
			currentApplianceList.replaceAll(string -> string.split(" : ", 2)[1]);
			for(String applianceProperties : currentApplianceList) {
				List<String> properties = Arrays.asList(applianceProperties.split(", "));
				if(checkMatches(properties, criteria)) {
					return applianceCreatorFactory.getCreator(criteria.getCriteriaType(), properties).create();
				}
			}
			return null;
		} catch (IOException e) {
			return null;
		}
	}

	private <E> boolean checkMatches(List<String> properties, Criteria<E> criteria) {
		Map<E, Object> criteriaMap = criteria.getCriteriaMap();
		for (Map.Entry<E, Object> entry : criteriaMap.entrySet())
		{
			String criteriaName = entry.getKey().toString();
			String criteriaValue = entry.getValue().toString();
			for(String property : properties) {
				List<String> nameAndValue = Arrays.asList(property.split("=", 2));
				String propertyName = nameAndValue.get(0);
				if(criteriaName.equalsIgnoreCase(propertyName)) {
					String propertyValue = nameAndValue.get(1);
					if(!criteriaValue.equalsIgnoreCase(propertyValue)) {
						return false;
					}
				}
			}
		}
		return true;
	}

}