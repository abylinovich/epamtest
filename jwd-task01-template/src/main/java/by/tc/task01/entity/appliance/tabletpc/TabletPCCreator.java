package by.tc.task01.entity.appliance.tabletpc;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.ICreator;

import java.util.List;

public class TabletPCCreator implements ICreator {

    private List<String> properties;
    private String producerName;
    private String modelName;
    private double price;
    private double batteryCapacity;
    private double displayInches;
    private double memoryROM;
    private double flashMemoryCapacity;
    private String color;

    public TabletPCCreator(List<String> properties) {
        this.properties = properties;
    }

    @Override
    public Appliance create() {
        for(String property : properties) {
            String[] propertyNameAndValue = property.split("=");
            setProperty(propertyNameAndValue[0], propertyNameAndValue[1]);
        }
        return new TabletPC(producerName,
                            modelName,
                            price,
                            batteryCapacity,
                            displayInches,
                            memoryROM,
                            flashMemoryCapacity,
                            color);
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
            case "FLASH_MEMORY_CAPACITY": {
                flashMemoryCapacity = Double.parseDouble(value);
                break;
            }
            case "COLOR": {
                color = (value != null) ? value : "Unknown";
                break;
            }
        }
    }

}
