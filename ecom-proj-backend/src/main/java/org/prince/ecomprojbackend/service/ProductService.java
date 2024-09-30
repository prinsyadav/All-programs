package org.prince.ecomprojbackend.service;

import org.prince.ecomprojbackend.model.Product;
import org.prince.ecomprojbackend.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }


    public Product saveProduct(Product product) {
        return repo.save(product);
    }

//    public Product addProduct(Product product, MultipartFile imageFile) {
//        product.setImageName(imageFile.getOriginalFilename());
//        product.setImageType(imageFile.getContentType());
//        try {
//            product.setImageDate(imageFile.getBytes());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return repo.save(product);
//    }
}
