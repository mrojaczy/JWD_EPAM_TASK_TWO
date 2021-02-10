package models;

import java.text.MessageFormat;

public class Laptop implements Product {
    private final double batteryCapacity;
    private final String OS;
    private final int memoryROM;
    private final int systemMemory;
    private final double CPU;
    private final int displayInches;
    private final double price;

    public Laptop(double batteryCapacity, String OS, int memoryROM, int systemMemory, double CPU, int displayInches, double price) {
        this.batteryCapacity = batteryCapacity;
        this.OS = OS;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.CPU = CPU;
        this.displayInches = displayInches;
        this.price = price;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getOS() {
        return OS;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public double getCPU() {
        return CPU;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return MessageFormat.format("[{0}, {1}, {2}, {3}, {4}, {5}, {6}]", getBatteryCapacity(), getOS(), getMemoryROM(), getSystemMemory(), getCPU(), getDisplayInches(), getPrice());
    }
}
