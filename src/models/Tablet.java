package models;

import java.text.MessageFormat;

public class Tablet implements Product {
    private final int batteryCapacity;
    private final int displayInches;
    private final int memoryROM;
    private final int flashMemoryCapacity;
    private final String color;
    private final double price;

    public Tablet(int batteryCapacity, int displayInches, int memoryROM, int flashMemoryCapacity, String color, double price) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
        this.price = price;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return MessageFormat.format("[{0}, {1}, {2}, {3}, {4}, {5}]", getBatteryCapacity(), getDisplayInches(), getMemoryROM(), getFlashMemoryCapacity(), getColor(), getPrice());
    }
}
