package org.example.simplewebapp.service;

import lombok.Getter;
import org.example.simplewebapp.model.Product;
import org.example.simplewebapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    // method to get all products
    public List<Product> getProducts() {
        return repo.findAll();
    }

// list of products
//    @Getter
//    static List<Product> products = new ArrayList<>(Arrays.asList(
//        new Product("Laptop", 1000, 10),
//        new Product("Mobile", 500, 20),
//        new Product("Tablet", 300, 15),
//        new Product("Smart Watch", 200, 5)));

    // method to get product by ID
    public Product getProductById(int id) {
        return repo.findById(String.valueOf(id)).orElse(null);
    }

    // method to create product
    public void createProduct(Product product) {
        repo.save(product);
    }

    //method to update product
    public void updateProduct(Product product) {
        repo.save(product);
    }

    // method to delete product
    public void deleteProduct(int id) {
        repo.deleteById(String.valueOf(id));
    }
}
