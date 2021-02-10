package db.processing;

import models.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SearchDb {
        public static Product getLowestPrice(List<Product> products) {
            List<Product> sorted =  products.stream().sorted(Comparator.comparingDouble(Product::getPrice)).collect(Collectors.toList());
            return sorted.get(0);
        }
}
