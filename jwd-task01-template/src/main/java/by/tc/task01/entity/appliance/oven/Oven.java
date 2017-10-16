package by.tc.task01.entity.appliance.oven;

import by.tc.task01.entity.appliance.KitchenAppliance;

public class Oven extends KitchenAppliance {

    private double capacity;
    private double depth;

    public Oven(String producerName,
                String modelName,
                double price,
                double powerConsumption,
                double weight,
                double height,
                double width,
                double capacity,
                double depth) {
        super(producerName,
              modelName,
              price,
              powerConsumption,
              weight,
              height,
              width);
        this.capacity = capacity;
        this.depth = depth;
    }

    public Oven(double powerConsumption,
                double weight,
                double height,
                double width,
                double capacity,
                double depth) {
        this("Unknown",
                "Unknown",
                0,
                powerConsumption,
                weight,
                height,
                width,
                capacity,
                depth);
    }

    public double getCapacity() {
        return capacity;
    }

    public double getDepth() {
        return depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oven)) return false;

        Oven oven = (Oven) o;

        if (Double.compare(oven.capacity, capacity) != 0) return false;
        return Double.compare(oven.depth, depth) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(capacity);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(depth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Oven : " + super.toString() +
                ", Capacity = " + capacity +
                ", Depth = " + depth +
                "." ;
    }

}
