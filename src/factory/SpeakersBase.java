package factory;

import models.Product;
import models.Speakers;

import java.util.List;

public class SpeakersBase extends Base {
    @Override
    public Product createProduct(List<String> params) {
        int powerConsumption = Integer.parseInt(params.get(0));
        int numberOfSpeakers = Integer.parseInt(params.get(1));
        String frequencyRange = params.get(2);
        int cordLength = Integer.parseInt(params.get(3));
        double price = Double.parseDouble(params.get(4));

        return new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength, price);
    }
}
