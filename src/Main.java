import Models.Product;
import db.processing.ReadDb;
import factory.Base;
import factory.LaptopBase;
import factory.OvenBase;

import java.util.ArrayList;
import java.util.List;

import static db.processing.ReadDb.parseProductString;

public class Main {

    private static Base base;

    public static void main(String[] args) {
        String category = "Oven";
        configure(category);

        var productsStringList = ReadDb.getAllByCategory(category);
        productsStringList.forEach(x -> System.out.println(parseProductString(x)));

        var productsList = createProductList(productsStringList);
        for (var product : productsList) {
            System.out.println(product);
        }
    }

    static void configure(String category) {
        switch (category) {
            case "Oven":
                base = new OvenBase();
                break;
            case "Laptop":
                base = new LaptopBase();
                break;
        }
    }

    static List<Product> createProductList(List<String> productsStringList) {
        List<Product> products = new ArrayList<>();
        for (String productString : productsStringList) {
            products.add(base.createProduct(parseProductString(productString)));
        }
        return products;
    }
}
