package by.tc.task01.entity.appliance;

public abstract class KitchenAppliance extends ElectricalAppliance {

    private double weight;
    private double height;
    private double width;

    public KitchenAppliance(String producerName,
                            String modelName,
                            double price,
                            double powerConsumption,
                            double weight,
                            double height,
                            double width) {
        super(producerName,
              modelName,
              price,
              powerConsumption);
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KitchenAppliance)) return false;
        if (!super.equals(o)) return false;

        KitchenAppliance that = (KitchenAppliance) o;

        if (Double.compare(that.weight, weight) != 0) return false;
        if (Double.compare(that.height, height) != 0) return false;
        return Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", Weight = " + weight +
                ", Height = " + height +
                ", Width = " + width;
    }

}
