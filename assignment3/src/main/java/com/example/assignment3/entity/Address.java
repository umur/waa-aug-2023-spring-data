package com.example.assignment3.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Getter
@Setter
public class Address {
    @Id
    int id;

    String Street;
    String city;
    int zip;

    @JoinColumn
    @OneToOne
//    @Fetch(FetchMode.JOIN)
            @JsonIgnore
    User user;
}
