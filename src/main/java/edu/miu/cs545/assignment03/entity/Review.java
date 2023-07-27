package edu.miu.cs545.assignment03.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Review {
    @Id@GeneratedValue
    private Long id;
    private String comment;
    @ManyToOne
    private Product product;
    @ManyToOne
    private User user;

    public Review() {
    }

    public Review(String comment, Product product, User user) {
        this.comment = comment;
        this.product = product;
        this.user = user;
    }
}
