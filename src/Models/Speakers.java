package models;

import java.text.MessageFormat;

public class Speakers implements Product {
    private final int powerConsumption;
    private final int numberOfSpeakers;
    private final String frequencyRange;
    private final int cordLength;
    private final double price;

    public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength, double price) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
        this.price = price;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return MessageFormat.format("[{0}, {1}, {2}, {3}, {4}]", getPowerConsumption(), getNumberOfSpeakers(), getFrequencyRange(), getCordLength(), getPrice());
    }
}
