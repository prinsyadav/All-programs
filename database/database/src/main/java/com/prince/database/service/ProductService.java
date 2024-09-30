package com.prince.database.service;

import com.prince.database.model.Product;
import com.prince.database.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getProduct() {
        return productRepo.findAll();
    }

    public void addProduct(Product product) {
        productRepo.save(product);
    }

    public void deleteProductById(long id) {
        productRepo.deleteById((int) id);
    }

    public void updateProductById(long id, Product product) {
        productRepo.save(product);
    }
}
