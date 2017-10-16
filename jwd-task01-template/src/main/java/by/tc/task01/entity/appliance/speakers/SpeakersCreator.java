package by.tc.task01.entity.appliance.speakers;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.ICreator;

import java.util.List;

public class SpeakersCreator implements ICreator {

    private List<String> properties;
    private String producerName;
    private String modelName;
    private double price;
    private double powerConsumption;
    private double numberOfSpeaker;
    private double cordLength;
    private String frequencyRange;

    public SpeakersCreator(List<String> properties) {
        this.properties = properties;
    }

    @Override
    public Appliance create() {
        for(String property : properties) {
            String[] propertyNameAndValue = property.split("=");
            setProperty(propertyNameAndValue[0], propertyNameAndValue[1]);
        }
        return new Speakers(producerName,
                            modelName,
                            price,
                            powerConsumption,
                            numberOfSpeaker,
                            cordLength,
                            frequencyRange);
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
            case "NUMBER_OF_SPEAKERS": {
                numberOfSpeaker = Double.parseDouble(value);
                break;
            }
            case "CORD_LENGTH": {
                cordLength = Double.parseDouble(value);
                break;
            }
            case "FREQUENCY_RANGE": {
                frequencyRange = (value != null) ? value : "Unknown";
                break;
            }
        }
    }

}
