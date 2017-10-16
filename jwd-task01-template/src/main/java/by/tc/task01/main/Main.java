package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.Speakers;
import static by.tc.task01.entity.criteria.SearchCriteria.Oven;
import static by.tc.task01.entity.criteria.SearchCriteria.Laptop;
import static by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;
import static by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;
import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.IApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		IApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////
		System.out.println("1 right criteria - should be appliance.");

		Criteria<Oven> criteriaOven = new Criteria<>();
		criteriaOven.setCriteriaType("Oven");
		criteriaOven.add(Oven.CAPACITY, 33);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		System.out.println("1 wrong criteria - should be null.");

		criteriaOven = new Criteria<>();
		criteriaOven.setCriteriaType("Oven");
		criteriaOven.add(Oven.POWER_CONSUMPTION, 1800);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		System.out.println("2 right criteria - should be appliance.");

		criteriaOven = new Criteria<>();
		criteriaOven.setCriteriaType("Oven");
		criteriaOven.add(Oven.HEIGHT, 40);
		criteriaOven.add(Oven.DEPTH, 60);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		////////////////////////////////////////
		System.out.println("2 wrong criteria - should be null.");

		criteriaOven = new Criteria<>();
		criteriaOven.setCriteriaType("Oven");
		criteriaOven.add(Oven.HEIGHT, "hello");
		criteriaOven.add(Oven.DEPTH, new Object());

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		System.out.println("3 right criteria - should be appliance.");
		
		Criteria<TabletPC> criteriaTabletPC = new Criteria<>();
		criteriaTabletPC.setCriteriaType("TabletPC");
		criteriaTabletPC.add(TabletPC.COLOR, "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);

		appliance = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////
		System.out.println("3 wrong criteria - should be null.");

		criteriaTabletPC = new Criteria<>();
		criteriaTabletPC.setCriteriaType("TabletPC");
		criteriaTabletPC.add(TabletPC.COLOR, "green");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 16);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);

		appliance = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////
		System.out.println("Full - Oven");

		criteriaOven = new Criteria<>();
		criteriaOven.setCriteriaType("Oven");
		criteriaOven.add(Oven.HEIGHT, 45.5);
		criteriaOven.add(Oven.DEPTH, 60);
		criteriaOven.add(Oven.POWER_CONSUMPTION, 1000);
		criteriaOven.add(Oven.CAPACITY,32);
		criteriaOven.add(Oven.WIDTH, 59.5);
		criteriaOven.add(Oven.WEIGHT, 10);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////
		System.out.println("Full - TabletPC");

		criteriaTabletPC = new Criteria<>();
		criteriaTabletPC.setCriteriaType("TabletPC");
		criteriaTabletPC.add(TabletPC.COLOR, "rED");
		criteriaTabletPC.add(TabletPC.BATTERY_CAPACITY, 4);
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 15);
		criteriaTabletPC.add(TabletPC.FLASH_MEMORY_CAPACITY,6);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);

		appliance = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////
		System.out.println("Full - Laptop");

		Criteria<Laptop> criteriaLaptop = new Criteria<>();
		criteriaLaptop.setCriteriaType("Laptop");
		criteriaLaptop.add(Laptop.OS, "wInDOwS");
		criteriaLaptop.add(Laptop.CPU, 3.2);
		criteriaLaptop.add(Laptop.DISPLAY_INCHES, 22);
		criteriaLaptop.add(Laptop.MEMORY_ROM,8000);
		criteriaLaptop.add(Laptop.SYSTEM_MEMORY, 1500);
		criteriaLaptop.add(Laptop.BATTERY_CAPACITY, 3);

		appliance = service.find(criteriaLaptop);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////
		System.out.println("Full - Refrigerator");

		Criteria<Refrigerator> criteriaRefrigerator = new Criteria<>();
		criteriaRefrigerator.setCriteriaType("Refrigerator");
		criteriaRefrigerator.add(Refrigerator.HEIGHT, 180);
		criteriaRefrigerator.add(Refrigerator.FREEZER_CAPACITY, 15);
		criteriaRefrigerator.add(Refrigerator.WEIGHT, 30);
		criteriaRefrigerator.add(Refrigerator.POWER_CONSUMPTION,200);
		criteriaRefrigerator.add(Refrigerator.OVERALL_CAPACITY, 300);
		criteriaRefrigerator.add(Refrigerator.WIDTH, 80);

		appliance = service.find(criteriaRefrigerator);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////
		System.out.println("Full - Speakers");

		Criteria<Speakers> criteriaSpeakers = new Criteria<>();
		criteriaSpeakers.setCriteriaType("Speakers");
		criteriaSpeakers.add(Speakers.NUMBER_OF_SPEAKERS, 2);
		criteriaSpeakers.add(Speakers.CORD_LENGTH, 2);
		criteriaSpeakers.add(Speakers.FREQUENCY_RANGE, "2-4");
		criteriaSpeakers.add(Speakers.POWER_CONSUMPTION,15);

		appliance = service.find(criteriaSpeakers);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////
		System.out.println("Full - VacuumCleaner");

		Criteria<VacuumCleaner> criteriaVacuumCleaner = new Criteria<>();
		criteriaVacuumCleaner.setCriteriaType("VacuumCleaner");
		criteriaVacuumCleaner.add(VacuumCleaner.MOTOR_SPEED_REGULATION, 2950);
		criteriaVacuumCleaner.add(VacuumCleaner.BAG_TYPE, "XX00");
		criteriaVacuumCleaner.add(VacuumCleaner.FILTER_TYPE, "C");
		criteriaVacuumCleaner.add(VacuumCleaner.WAND_TYPE,"all-in-one");
		criteriaVacuumCleaner.add(VacuumCleaner.CLEANING_WIDTH,30);
		criteriaVacuumCleaner.add(VacuumCleaner.POWER_CONSUMPTION,90);

		appliance = service.find(criteriaVacuumCleaner);

		PrintApplianceInfo.print(appliance);
	}

}