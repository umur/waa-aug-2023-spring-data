package com.lab3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int price;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @OneToMany
    @JoinColumn(name="product_id")
    private List<Review> reviews;

};