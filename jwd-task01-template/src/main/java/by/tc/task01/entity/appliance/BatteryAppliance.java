package by.tc.task01.entity.appliance;

public abstract class BatteryAppliance extends Appliance {

    private double batteryCapacity;

    public BatteryAppliance(String producerName,
                            String modelName,
                            double price,
                            double batteryCapacity) {
        super(producerName, modelName, price);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BatteryAppliance)) return false;
        if (!super.equals(o)) return false;

        BatteryAppliance that = (BatteryAppliance) o;

        return Double.compare(that.batteryCapacity, batteryCapacity) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(batteryCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Battery capacity = " + batteryCapacity;
    }

}