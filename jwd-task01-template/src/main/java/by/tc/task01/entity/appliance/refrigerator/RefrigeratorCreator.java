package by.tc.task01.entity.appliance.refrigerator;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.ICreator;

import java.util.List;

public class RefrigeratorCreator implements ICreator {

    private List<String> properties;
    private String producerName;
    private String modelName;
    private double price;
    private double powerConsumption;
    private double weight;
    private double height;
    private double width;
    private double freezerCapacity;
    private double overallCapacity;

    public RefrigeratorCreator(List<String> properties) {
        this.properties = properties;
    }

    @Override
    public Appliance create() {
        for(String property : properties) {
            String[] propertyNameAndValue = property.split("=");
            setProperty(propertyNameAndValue[0], propertyNameAndValue[1]);
        }
        return new Refrigerator(producerName,
                                modelName,
                                price,
                                powerConsumption,
                                weight,
                                height,
                                width,
                                freezerCapacity,
                                overallCapacity);
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
            case "WEIGHT": {
                weight = Double.parseDouble(value);
                break;
            }
            case "HEIGHT": {
                height = Double.parseDouble(value);
                break;
            }
            case "WIDTH": {
                width = Double.parseDouble(value);
                break;
            }
            case "FREEZER_CAPACITY": {
                freezerCapacity = Double.parseDouble(value);
                break;
            }
            case "OVERALL_CAPACITY": {
                overallCapacity = Double.parseDouble(value);
                break;
            }
        }
    }

}
