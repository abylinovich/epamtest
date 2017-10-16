package by.tc.task01.entity.appliance.refrigerator;

import by.tc.task01.entity.appliance.KitchenAppliance;

public class Refrigerator extends KitchenAppliance {

    private double freezerCapacity;
    private double overallCapacity;

    public Refrigerator(String producerName,
                        String modelName,
                        double price,
                        double powerConsumption,
                        double weight,
                        double height,
                        double width,
                        double freezerCapacity,
                        double overallCapacity) {
        super(producerName,
              modelName,
              price,
              powerConsumption,
              weight,
              height,
              width);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }

    public Refrigerator(double powerConsumption,
                        double weight,
                        double height,
                        double width,
                        double freezerCapacity,
                        double overallCapacity) {
        this("Unknown",
              "Unknown",
              0,
              powerConsumption,
              weight,
              height,
              width,
              freezerCapacity,
              overallCapacity);
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Refrigerator)) return false;

        Refrigerator that = (Refrigerator) o;

        if (Double.compare(that.freezerCapacity, freezerCapacity) != 0) return false;
        return Double.compare(that.overallCapacity, overallCapacity) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(freezerCapacity);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(overallCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Refrigerator : " + super.toString() +
                ", Freezer capacity = " + freezerCapacity +
                ", Overall capacity = " + overallCapacity +
                ". ";
    }

}
