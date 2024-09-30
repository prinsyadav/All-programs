package org.example.simplewebapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.stereotype.Component;



@Getter
@Component
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prodId;
    @Column(name = "Description")
    private String prodDesc;
    private String prodName;
    private int price;
}
