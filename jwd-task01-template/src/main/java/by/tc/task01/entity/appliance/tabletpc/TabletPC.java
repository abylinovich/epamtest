package by.tc.task01.entity.appliance.tabletpc;

import by.tc.task01.entity.appliance.NotebookAppliance;

public class TabletPC extends NotebookAppliance {

    private double flashMemoryCapacity;
    private String color;

    public TabletPC(String producerName,
                    String modelName,
                    double price,
                    double batteryCapacity,
                    double displayInches,
                    double memoryROM,
                    double flashMemoryCapacity,
                    String color) {
        super(producerName,
              modelName,
              price,
              batteryCapacity,
              displayInches,
              memoryROM);
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public TabletPC(double batteryCapacity,
                    double displayInches,
                    double memoryROM,
                    double flashMemoryCapacity,
                    String color) {
        this("Unknown",
             "Unknown",
             0,
             batteryCapacity,
             displayInches,
             memoryROM,
             flashMemoryCapacity,
             color);
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC)) return false;

        TabletPC tabletPC = (TabletPC) o;

        if (Double.compare(tabletPC.flashMemoryCapacity, flashMemoryCapacity) != 0) return false;
        return color.equals(tabletPC.color);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(flashMemoryCapacity);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "TabletPC : " + super.toString() +
                ", Flash Memory Capacity = " + flashMemoryCapacity +
                ", Color = '" + color + '\'' +
                ".";
    }

}