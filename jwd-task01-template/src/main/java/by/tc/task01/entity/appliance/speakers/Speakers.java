package by.tc.task01.entity.appliance.speakers;

import by.tc.task01.entity.appliance.ElectricalAppliance;

public class Speakers extends ElectricalAppliance {

    private double numberOfSpeaker;
    private double cordLength;
    private String frequencyRange;

    public Speakers(String producerName,
                    String modelName,
                    double price,
                    double powerConsumption,
                    double numberOfSpeaker,
                    double cordLength,
                    String frequencyRange) {
        super(producerName,
              modelName,
              price,
              powerConsumption);
        this.numberOfSpeaker = numberOfSpeaker;
        this.cordLength = cordLength;
        this.frequencyRange = frequencyRange;
    }

    public Speakers(double powerConsumption,
                    double numberOfSpeaker,
                    double cordLength,
                    String frequencyRange) {
        this("Unknown",
             "Unknown",
             0,
             powerConsumption,
             numberOfSpeaker,
             cordLength,
             frequencyRange);
    }

    public double getNumberOfSpeaker() {
        return numberOfSpeaker;
    }

    public double getCordLength() {
        return cordLength;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speakers)) return false;

        Speakers speakers = (Speakers) o;

        if (Double.compare(speakers.numberOfSpeaker, numberOfSpeaker) != 0) return false;
        if (Double.compare(speakers.cordLength, cordLength) != 0) return false;
        return frequencyRange.equals(speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(numberOfSpeaker);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cordLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + frequencyRange.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Speakers : " + super.toString() +
                ", Number of speaker = " + numberOfSpeaker +
                ", Cord length = " + cordLength +
                ", Frequency range = '" + frequencyRange + '\'';
    }

}
