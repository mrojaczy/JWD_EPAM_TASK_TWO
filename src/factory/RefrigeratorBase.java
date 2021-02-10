package factory;

import models.Product;
import models.Refrigerator;

import java.util.List;

public class RefrigeratorBase extends Base {

    @Override
    public Product createProduct(List<String> params) {
        int powerConsumption = Integer.parseInt(params.get(0));
        int weight = Integer.parseInt(params.get(1));
        int freezerCapacity = Integer.parseInt(params.get(2));
        double overallCapacity = Double.parseDouble(params.get(3));
        int height = Integer.parseInt(params.get(4));
        int width = Integer.parseInt(params.get(5));
        double price = Double.parseDouble(params.get(6));;

        return new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height, width, price);
    }
}
