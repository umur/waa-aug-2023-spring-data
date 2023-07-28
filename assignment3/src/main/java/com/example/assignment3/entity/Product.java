package com.example.assignment3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Getter
@Setter
public class Product {
    @Id
    int id;

    String name;
    int price;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    List<Review> reviews;

    @Fetch(FetchMode.JOIN)
    @ManyToOne
    @JsonIgnore
    Category category;

}
