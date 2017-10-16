package by.tc.task01.entity.appliance;

public abstract class ElectricalAppliance extends Appliance {

    private double powerConsumption;

    public ElectricalAppliance(String producerName,
                               String modelName,
                               double price,
                               double powerConsumption) {
        super(producerName,
              modelName,
              price);
        this.powerConsumption = powerConsumption;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElectricalAppliance)) return false;
        if (!super.equals(o)) return false;

        ElectricalAppliance that = (ElectricalAppliance) o;

        return Double.compare(that.powerConsumption, powerConsumption) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(powerConsumption);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Power consumption = " + powerConsumption;
    }

}