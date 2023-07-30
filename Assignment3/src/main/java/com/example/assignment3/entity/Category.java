package com.example.assignment3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.example.assignment3.entity.Product;
import java.util.List;

@Getter
@Setter
@Entity

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;

}
