package models;

import java.text.MessageFormat;

public class ProductByPrice implements Product {

    private final double price;

    public ProductByPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return MessageFormat.format("price = {0}", getPrice());
    }
}
