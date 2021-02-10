package factory;

import models.Product;
import models.ProductByPrice;

import java.util.List;

public class ProductBase extends Base {

    @Override
    public Product createProduct(List<String> params) {

        double price = Double.parseDouble(params.get(params.size() - 1));
        return new ProductByPrice(price);
    }
}
