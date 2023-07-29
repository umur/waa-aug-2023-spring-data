package com.example.Lab3.entity.test;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class ProductTest {

    @Id
    private int id;

    private String name;
    private int price,rating;

//    @OneToMany
//    private List<ReviewTest> reviewTest;
}
