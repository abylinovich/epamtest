package by.tc.task01.entity;

import by.tc.task01.entity.appliance.laptop.LaptopCreator;
import by.tc.task01.entity.appliance.oven.OvenCreator;
import by.tc.task01.entity.appliance.refrigerator.RefrigeratorCreator;
import by.tc.task01.entity.appliance.speakers.SpeakersCreator;
import by.tc.task01.entity.appliance.tabletpc.TabletPCCreator;
import by.tc.task01.entity.appliance.vacuumcleaner.VacuumCleanerCreator;

import java.util.List;

public class ApplianceCreatorFactory {

    public ICreator getCreator(String title, List<String> properties) {
        switch(title) {
            case "Oven": return new OvenCreator(properties);
            case "Refrigerator": return new RefrigeratorCreator(properties);
            case "Laptop": return new LaptopCreator(properties);
            case "TabletPC": return new TabletPCCreator(properties);
            case "Speakers": return new SpeakersCreator(properties);
            case "VacuumCleaner": return new VacuumCleanerCreator(properties);
        }
        return null;
    }

}
