package by.tc.task01.entity.appliance.vacuumcleaner;

import by.tc.task01.entity.appliance.ElectricalAppliance;

public class VacuumCleaner extends ElectricalAppliance {

    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner(String producerName,
                        String modelName,
                        double price,
                        double powerConsumption,
                        String filterType,
                        String bagType,
                        String wandType,
                        double motorSpeedRegulation,
                        double cleaningWidth) {
        super(producerName,
              modelName,
              price,
              powerConsumption);
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public VacuumCleaner(double powerConsumption,
                         String filterType,
                         String bagType,
                         String wandType,
                         double motorSpeedRegulation,
                         double cleaningWidth) {
        this("Unknown",
                "Unknown",
                0,
                powerConsumption,
                filterType,
                bagType,
                wandType,
                motorSpeedRegulation,
                cleaningWidth);
    }

    public String getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;

        VacuumCleaner that = (VacuumCleaner) o;

        if (Double.compare(that.motorSpeedRegulation, motorSpeedRegulation) != 0) return false;
        if (Double.compare(that.cleaningWidth, cleaningWidth) != 0) return false;
        if (!filterType.equals(that.filterType)) return false;
        if (!bagType.equals(that.bagType)) return false;
        return wandType.equals(that.wandType);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = filterType.hashCode();
        result = 31 * result + bagType.hashCode();
        result = 31 * result + wandType.hashCode();
        temp = Double.doubleToLongBits(motorSpeedRegulation);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cleaningWidth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "VacuumCleaner : " + super.toString() +
                ", Filter type = '" + filterType + '\'' +
                ", Bag type = '" + bagType + '\'' +
                ", Wand type = '" + wandType + '\'' +
                ", Motor speed regulation = " + motorSpeedRegulation +
                ", Cleaning width = " + cleaningWidth;
    }

}