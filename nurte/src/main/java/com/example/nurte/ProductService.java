package com.example.nurte;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service


public class ProductService {
    private List<models_product.Product> products = new ArrayList<>();
    private long ID = 0;

    //TODO Попробуй реализовать методы с базой H2

    {
        products.add(new models_product.Product(++ID,"PlayStation 5", "Simple description", 2344, "Krasnoyarsk", "tomas"));
        products.add(new models_product.Product(++ID,"Iphone 8", "Simple description", 24000, "Moscow", "artmcoder"));
    }

    public List<models_product.Product> listProducts() {
        return products; }

    public void saveProduct(models_product.Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Object getProductById(Long id) {
        for (models_product.Product product : products) {
            if (product.getId().equals(id))
                return product;
        }
        return null;
    }
}
