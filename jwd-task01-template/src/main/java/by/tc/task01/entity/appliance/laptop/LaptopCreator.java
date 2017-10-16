package by.tc.task01.entity.appliance.laptop;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.ICreator;

import java.util.List;

public class LaptopCreator implements ICreator {

    private List<String> properties;
    private String producerName;
    private String modelName;
    private double price;
    private double batteryCapacity;
    private double displayInches;
    private double memoryROM;
    private String OS;
    private double CPU;
    private double systemMemory;

    public LaptopCreator(List<String> properties) {
        this.properties = properties;
    }

    @Override
    public Appliance create() {
        for(String property : properties) {
            String[] propertyNameAndValue = property.split("=");
            setProperty(propertyNameAndValue[0], propertyNameAndValue[1]);
        }
        return new Laptop(producerName,
                          modelName,
                          price,
                          batteryCapacity,
                          displayInches,
                          memoryROM,
                          OS,
                          CPU,
                          systemMemory);
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
            case "BATTERY_CAPACITY": {
                batteryCapacity = Double.parseDouble(value);
                break;
            }
            case "DISPLAY_INCHES": {
                displayInches = Double.parseDouble(value);
                break;
            }
            case "MEMORY_ROM": {
                memoryROM = Double.parseDouble(value);
                break;
            }
            case "OS": {
                OS = (value != null) ? value : "Unknown";
                break;
            }
            case "CPU": {
                CPU = Double.parseDouble(value);
                break;
            }
            case "SYSTEM_MEMORY": {
                systemMemory = Double.parseDouble(value);
                break;
            }
        }
    }

}