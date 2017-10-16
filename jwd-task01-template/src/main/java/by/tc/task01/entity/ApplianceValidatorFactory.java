package by.tc.task01.entity;

import by.tc.task01.entity.appliance.laptop.LaptopValidator;
import by.tc.task01.entity.appliance.oven.OvenValidator;
import by.tc.task01.entity.appliance.refrigerator.RefrigeratorValidator;
import by.tc.task01.entity.appliance.speakers.SpeakersValidator;
import by.tc.task01.entity.appliance.tabletpc.TabletPCValidator;
import by.tc.task01.entity.appliance.vacuumcleaner.VacuumCleanerValidator;

public class ApplianceValidatorFactory {

    public IValidator getValidator(String applianceType) {
        switch (applianceType) {
            case "Oven": return new OvenValidator();
            case "Refrigerator": return new RefrigeratorValidator();
            case "Laptop": return new LaptopValidator();
            case "TabletPC": return new TabletPCValidator();
            case "Speakers": return new SpeakersValidator();
            case "VacuumCleaner": return new VacuumCleanerValidator();
            default: return null;
        }
    }

}