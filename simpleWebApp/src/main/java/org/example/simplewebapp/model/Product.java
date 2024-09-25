package org.example.simplewebapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import org.springframework.stereotype.Component;



@Getter
@Component
@Entity
@Table(name = "product")
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;
//    private int quantity;

    public Product() {
    }

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }
//        public String toString() {
//        return "Product{" +
//                "prodId=" + prodId +
//                ", prodName='" + prodName + '\'' +
//                ", price=" + price +
//                '}';
//


    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
