package lab3.lab3.Model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Review {
    //id, comment
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    private String comment;
    @ManyToOne
    private User user;

    @ManyToOne(cascade = CascadeType.PERSIST)//, fetch = FetchType.EAGER)
    private Product product;


}
