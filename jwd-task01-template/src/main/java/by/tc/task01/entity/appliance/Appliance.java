package by.tc.task01.entity.appliance;

public abstract class Appliance {

    private String producerName;
    private String modelName;
    private double price;

    public Appliance(String producerName,
                     String modelName,
                     double price) {
        this.producerName = (producerName != null) ? producerName : "Unknown";
        this.modelName = (modelName != null) ? modelName : "Unknown";
        this.price = price;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getModelName() {
        return modelName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Appliance)) return false;

        Appliance appliance = (Appliance) o;

        if (Double.compare(appliance.price, price) != 0) return false;
        if (!producerName.equals(appliance.producerName)) return false;
        return modelName.equals(appliance.modelName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = producerName.hashCode();
        result = 31 * result + modelName.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Producer name = '" + producerName + '\'' +
                ", Model name = '" + modelName + '\'' +
                ", Price = " + price;
    }

}
