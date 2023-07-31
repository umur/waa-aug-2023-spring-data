package miu.waa.lab3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Review {
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private int id;
    private String comment;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
}
