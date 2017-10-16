package by.tc.task01.entity.appliance.laptop;

import by.tc.task01.entity.appliance.NotebookAppliance;

public class Laptop extends NotebookAppliance {

    private String OS;
    private double CPU;
    private double systemMemory;

    public Laptop(String producerName,
                  String modelName,
                  double price,
                  double batteryCapacity,
                  double displayInches,
                  double memoryROM,
                  String OS,
                  double CPU,
                  double systemMemory) {
        super(producerName,
              modelName,
              price,
              batteryCapacity,
              displayInches,
              memoryROM);
        this.OS = OS;
        this.CPU = CPU;
        this.systemMemory = systemMemory;
    }

    public Laptop(double batteryCapacity,
                  double displayInches,
                  double memoryROM,
                  String OS,
                  double CPU,
                  double systemMemory) {
        this("Unknown",
             "Unknown",
             0,
             batteryCapacity,
             displayInches,
             memoryROM,
             OS,
             CPU,
             systemMemory);
    }

    public String getOS() {
        return OS;
    }

    public double getCPU() {
        return CPU;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;

        Laptop laptop = (Laptop) o;

        if (Double.compare(laptop.CPU, CPU) != 0) return false;
        if (Double.compare(laptop.systemMemory, systemMemory) != 0) return false;
        return OS.equals(laptop.OS);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = OS.hashCode();
        temp = Double.doubleToLongBits(CPU);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(systemMemory);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Laptop : " + super.toString() +
                ", OS = '" + OS + '\'' +
                ", CPU = " + CPU +
                ", System memory = " + systemMemory +
                ". ";
    }
}
