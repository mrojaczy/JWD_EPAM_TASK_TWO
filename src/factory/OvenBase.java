package factory;

import Models.Oven;
import Models.Product;

import java.util.List;

public class OvenBase extends Base {

    @Override
    public Product createProduct(List<String> params) {
        int powerConsumption = Integer.parseInt(params.get(0));
        int weight = Integer.parseInt(params.get(1));
        int capacity = Integer.parseInt(params.get(2));
        int depth = Integer.parseInt(params.get(3));
        double height = Double.parseDouble(params.get(4));
        double width = Double.parseDouble(params.get(5));

        return new Oven(powerConsumption, weight, capacity, depth, height, width);
    }
}
