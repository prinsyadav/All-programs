package org.example.simplewebapp.service;

import org.example.simplewebapp.model.Product;
import org.example.simplewebapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    // method to get all products
    public List<Product> getProducts() {
        return repo.findAll();
    }

    // method to get product by ID
    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(null);
    }

    // method to create product
    public Product createProduct(Product product) {
       return repo.save(product);
    }

    //method to update productById
    public void updateProductById(int prodId, Product product) {
        repo.save(product);
    }

    // method to delete product
    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
