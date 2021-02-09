package Models;

public class Oven implements Product {
    private final int powerConsumption;
    private final int weight;
    private final int capacity;
    private final int depth;
    private final double height;
    private final double width;

    public Oven(int powerConsumption, int weight, int capacity, int depth, double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
