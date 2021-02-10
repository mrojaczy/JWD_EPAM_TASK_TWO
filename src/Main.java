import factory.*;

import models.Product;

import db.processing.SearchDb;
import db.processing.ReadDb;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Base base;

    public static void main(String[] args) {
        /*
        * you can choose your own category
        */
        String category = "Oven"; // or "Laptop", or "All"
        configure(category);

        List<String> productsStringList = category.equals("All") ? ReadDb.getAll() : ReadDb.getAllByCategory(category);

        List<Product> productsList = createProductList(productsStringList);
        printAllProducts(productsList);

        double lowestPrice = SearchDb.getLowestPrice(productsList).getPrice();
        printLowestPrice(lowestPrice);
    }

    static void configure(String category) {
        switch (category) {
            case "Oven":
                base = new OvenBase();
                break;
            case "Laptop":
                base = new LaptopBase();
                break;
            case "Refrigerator":
                base = new RefrigeratorBase();
                break;
            case "VacuumCleaner":
                base = new VacuumCleanerBase();
                break;
            case "Tablet":
                base = new TabletBase();
                break;
            case "Speakers":
                base = new SpeakersBase();
                break;
            case "All":
                base = new ProductBase();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + category);
        }
    }

    static List<Product> createProductList(List<String> productsStringList) {
        List<Product> products = new ArrayList<>();
        for (String productString : productsStringList) {
            products.add(base.createProduct(ReadDb.parseProductString(productString)));
        }
        return products;
    }

    static void printAllProducts(List<Product> products) {
        System.out.println("All the products of several category:");
        products.forEach(x -> System.out.println(x.toString()));
        System.out.println();
    }

    static void printLowestPrice(double lowestPrice) {
        System.out.println(MessageFormat.format("The lowest price of the products is {0}", lowestPrice));
        System.out.println();
    }
}
