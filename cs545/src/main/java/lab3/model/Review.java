package lab3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Review {
    @Id
    private int id;
    private String comment;

    @ManyToOne
    private MainUser user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
