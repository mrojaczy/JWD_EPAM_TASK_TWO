package Models;

public class Laptop implements Product {
    private final double batteryCapacity;
    private final String OS;
    private final int memoryROM;
    private final int systemMemory;
    private final double CPU;
    private final int displayInches;

    public Laptop(double batteryCapacity, String OS, int memoryROM, int systemMemory, double CPU, int displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.OS = OS;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.CPU = CPU;
        this.displayInches = displayInches;
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
}
