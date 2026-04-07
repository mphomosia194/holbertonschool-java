package demo;

import entities.Product;
import models.ProductModel;
import java.util.List;

public class AdminApp {

    public static void main(String[] args) {

        ProductModel model = new ProductModel();

        Product p = new Product();
        p.setName("TV");
        p.setPrice(300.0);
        p.setQuantity(100);
        p.setStatus(true);

        model.create(p);

        List<Product> list = model.findAll();
        System.out.println(list.size());
    }
}
