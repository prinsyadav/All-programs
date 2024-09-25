package org.example.simplewebapp.controller;


import org.example.simplewebapp.model.Product;
import org.example.simplewebapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    // method to get all products
    @GetMapping ("/products")
    public Object getProducts(){
        return productService.getProducts();
    }

    // method to get product by id
    @GetMapping ("/products/{prodId}")
    public Object getProductById(@PathVariable int prodId){
        return productService.getProductById(prodId);
    }
    // method to create product
    @PostMapping ("/products")
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }

    // method to update product
    @PutMapping ("/products")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }

    // method to delete product
    @DeleteMapping ("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        productService.deleteProduct(prodId);
    }
}
