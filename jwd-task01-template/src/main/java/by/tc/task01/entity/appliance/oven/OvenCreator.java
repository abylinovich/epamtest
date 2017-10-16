package by.tc.task01.entity.appliance.oven;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.ICreator;

import java.util.List;

public class OvenCreator implements ICreator {

    private List<String> properties;
    private String producerName;
    private String modelName;
    private double price;
    private double powerConsumption;
    private double weight;
    private double height;
    private double width;
    private double capacity;
    private double depth;

    public OvenCreator(List<String> properties) {
        this.properties = properties;
    }

    @Override
    public Appliance create() {
        for(String property : properties) {
            String[] propertyNameAndValue = property.split("=");
            setProperty(propertyNameAndValue[0], propertyNameAndValue[1]);
        }
        return new Oven(producerName,
                        modelName,
                        price,
                        powerConsumption,
                        weight,
                        height,
                        width,
                        capacity,
                        depth);
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
            case "CAPACITY": {
                capacity = Double.parseDouble(value);
                break;
            }
            case "DEPTH": {
                depth = Double.parseDouble(value);
                break;
            }
        }
    }

}
