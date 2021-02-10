package factory;

import models.Product;
import models.Tablet;

import java.util.List;

public class TabletBase extends Base {
    @Override
    public Product createProduct(List<String> params) {
        int batteryCapacity = Integer.parseInt(params.get(0));
        int displayInches = Integer.parseInt(params.get(1));
        int memoryROM = Integer.parseInt(params.get(2));
        int flashMemoryCapacity = Integer.parseInt(params.get(3));
        String color = params.get(4);
        double price = Double.parseDouble(params.get(5));

        return new Tablet(batteryCapacity, displayInches, memoryROM, flashMemoryCapacity, color, price);
    }
}
