package com.lab3.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Category {

    @Id
    private int id;
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "category")
    private List<Product> products;

};
