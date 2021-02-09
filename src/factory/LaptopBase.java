package factory;

import Models.Laptop;
import Models.Product;

import java.util.List;

public class LaptopBase extends Base {

    @Override
    public Product createProduct(List<String> params) {
        double batteryCapacity = Double.parseDouble(params.get(0));
        String OS = params.get(1);
        int memoryROM = Integer.parseInt(params.get(2));
        int systemMemory  = Integer.parseInt(params.get(3));
        double CPU = Double.parseDouble(params.get(4));
        int displayInches  = Integer.parseInt(params.get(5));

        return new Laptop(batteryCapacity, OS, memoryROM, systemMemory, CPU, displayInches);
    }
}
