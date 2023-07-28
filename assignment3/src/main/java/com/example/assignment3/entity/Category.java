package com.example.assignment3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Getter
@Setter
public class Category {
    @Id
    int id;
    String name;


    @OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)
    @JsonBackReference
    List<Product> products;
}
