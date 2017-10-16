package by.tc.task01.entity.appliance;

public abstract class NotebookAppliance extends BatteryAppliance {

    private double displayInches;
    private double memoryROM;

    public NotebookAppliance(String producerName,
                             String modelName,
                             double price,
                             double batteryCapacity,
                             double displayInches,
                             double memoryROM) {
        super(producerName,
              modelName,
              price,
              batteryCapacity);
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public double getMemoryROM() {
        return memoryROM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NotebookAppliance)) return false;
        if (!super.equals(o)) return false;

        NotebookAppliance that = (NotebookAppliance) o;

        if (Double.compare(that.displayInches, displayInches) != 0) return false;
        return Double.compare(that.memoryROM, memoryROM) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(displayInches);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(memoryROM);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Display inches = " + displayInches +
                ", Memory ROM = " + memoryROM;
    }

}