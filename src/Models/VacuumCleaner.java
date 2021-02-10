package models;

import java.text.MessageFormat;

public class VacuumCleaner implements Product {
    private final int powerConsumption;
    private final char filterType;
    private final String bagType;
    private final String wandType;
    private final int motorSpeedRegulation;
    private final int cleaningWidth;
    private final double price;

    public VacuumCleaner(int powerConsumption, char filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth, double price) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
        this.price = price;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public char getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return MessageFormat.format("[{0}, {1}, {2}, {3}, {4}, {5}, {6}]", getPowerConsumption(), getFilterType(), getBagType(), getWandType(), getMotorSpeedRegulation(), getCleaningWidth(), getPrice());
    }
}
