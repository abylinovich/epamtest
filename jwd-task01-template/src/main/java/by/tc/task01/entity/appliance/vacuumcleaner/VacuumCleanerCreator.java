package by.tc.task01.entity.appliance.vacuumcleaner;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.ICreator;

import java.util.List;

public class VacuumCleanerCreator implements ICreator {

    private List<String> properties;
    private String producerName;
    private String modelName;
    private double price;
    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleanerCreator(List<String> properties) {
        this.properties = properties;
    }

    @Override
    public Appliance create() {
        for(String property : properties) {
            String[] propertyNameAndValue = property.split("=");
            setProperty(propertyNameAndValue[0], propertyNameAndValue[1]);
        }
        return new VacuumCleaner(producerName,
                            modelName,
                            price,
                            powerConsumption,
                            filterType,
                            bagType,
                            wandType,
                            motorSpeedRegulation,
                            cleaningWidth);
    }

    private void setProperty(String property, String value) {
        switch (property) {
            case "PRODUCER_NAME": {
                producerName = (value != null) ? value : "Unknown";
                break;
            }
            case "MODEL_NAME": {
                modelName = (value != null) ? value : "Unknown";
                break;
            }
            case "PRICE": {
                price = Double.parseDouble(value);
                break;
            }
            case "POWER_CONSUMPTION": {
                powerConsumption = Double.parseDouble(value);
                break;
            }
            case "FILTER_TYPE": {
                filterType = (value != null) ? value : "Unknown";
                break;
            }
            case "BAG_TYPE": {
                bagType = (value != null) ? value : "Unknown";
                break;
            }
            case "WAND_TYPE": {
                wandType = (value != null) ? value : "Unknown";
                break;
            }
            case "MOTOR_SPEED_REGULATION": {
                motorSpeedRegulation = Double.parseDouble(value);
                break;
            }
            case "CLEANING_WIDTH": {
                cleaningWidth = Double.parseDouble(value);
                break;
            }
        }
    }

}
