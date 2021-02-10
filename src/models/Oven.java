package models;

import java.text.MessageFormat;

public class Oven implements Product {
    private final int powerConsumption;
    private final int weight;
    private final int capacity;
    private final int depth;
    private final double height;
    private final double width;
    private final double price;

    public Oven(int powerConsumption, int weight, int capacity, int depth, double height, double width, double price) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.price = price;
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

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return MessageFormat.format("[{0}, {1}, {2}, {3}, {4}, {5}, {6}]", getPowerConsumption(), getWeight(), getCapacity(), getDepth(), getHeight(), getWidth(), getPrice());
    }

}
