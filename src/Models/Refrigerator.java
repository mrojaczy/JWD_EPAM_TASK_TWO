package models;

import java.text.MessageFormat;

public class Refrigerator implements Product {
    private final int powerConsumption;
    private final int weight;
    private final int freezerCapacity;
    private final double overallCapacity;
    private final int height;
    private final int width;
    private final double price;

    public Refrigerator(int powerConsumption, int weight, int freezerCapacity, double overallCapacity, int height, int width, double price) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
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

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return MessageFormat.format("[{0}, {1}, {2}, {3}, {4}, {5}, {6}]", getPowerConsumption(), getWeight(), getFreezerCapacity(), getOverallCapacity(), getHeight(), getWidth(), getPrice());
    }
}
