package factory;

import models.Product;

import java.util.List;

public abstract class Base {
    public abstract Product createProduct(List<String> params);
}
