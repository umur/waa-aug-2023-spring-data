package com.example.assignmentw1d3.entity;

import jakarta.persistence.*;
import jdk.jfr.Frequency;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.engine.jdbc.batch.spi.Batch;

import java.util.List;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private String rating;
    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;
    @OneToMany(mappedBy = "product" ,cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<Review> review;

}
