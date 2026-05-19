package com.example.product.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> list = new ArrayList<Product>();

    public List<Product> getAllProducts() {

        return list;
    }

    public Product getProductById(Long id) {

        for (Product p : list) {

            if (p.getId().equals(id)) {
                return p;
            }
        }

        return null;
    }

    public void addProduct(Product p) {

        list.add(p);
    }

    public void updateProduct(Product p) {

        removeProduct(p);
        list.add(p);
    }

    public void removeProduct(Product p) {

        list.remove(p);
    }

    public void addList(List<Product> listOfProducts) {

        list.addAll(listOfProducts);
    }
}
