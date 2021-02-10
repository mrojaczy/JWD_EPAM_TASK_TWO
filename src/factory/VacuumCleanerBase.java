package factory;

import models.Product;
import models.VacuumCleaner;

import java.util.List;

public class VacuumCleanerBase extends Base {
    @Override
    public Product createProduct(List<String> params) {
        int powerConsumption = Integer.parseInt(params.get(0));
        char filterType = params.get(1).charAt(0);
        String bagType = params.get(2);
        String wandType = params.get(3);
        int motorSpeedRegulation = Integer.parseInt(params.get(4));
        int cleaningWidth = Integer.parseInt(params.get(5));
        double price = Double.parseDouble(params.get(6));

        return new VacuumCleaner(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth, price);
    }
}
