package lab3.lab3.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Adress {
    //id, street, zip` and `city`
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private String zip;
    private String city;

//    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private User user;
}
