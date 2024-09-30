package com.prince.database.controller;

import com.prince.database.model.Product;
import com.prince.database.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String home() {
        return "Welcome to the home page";
    }

    @GetMapping("/product")
    public List<Product> getProduct() {
        return productService.getProduct();
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProductById(@PathVariable long id) {
        productService.deleteProductById(id);
    }

    @PutMapping("/product/{id}")
    public void updateProductById(@PathVariable long id, @RequestBody Product product) {
        productService.updateProductById(id, product);
    }
}
