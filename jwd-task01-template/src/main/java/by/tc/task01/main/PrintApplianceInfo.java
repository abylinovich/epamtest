package by.tc.task01.main;

import by.tc.task01.entity.appliance.Appliance;

public class PrintApplianceInfo {

	private static final String EXCUSE_MESSAGE = "No matches found. Please check input criteria";
	
	public static void print(Appliance appliance) {
		if(appliance != null) {
			System.out.println(appliance);
		} else {
			System.out.println(EXCUSE_MESSAGE);
		}
	}

}
