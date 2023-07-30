package lab3.lab3.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Data
@Entity
@Table(name = "main_users")
public class User {
    //`id, email, password, firstName, lastname`
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

private int id;
    @Column(unique = true)
private String email;
    @Column(unique = true)
private String password;
    @Column(name = "first", length = 20)
private String firstName;
private String lastName;


@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
private List<Review> reviewList;

// mappedBy = "user"
@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
@JoinColumn(name = "id_address")
private Adress adress;

}
