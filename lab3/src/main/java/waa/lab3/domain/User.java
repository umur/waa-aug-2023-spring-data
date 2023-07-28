package waa.lab3.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;

@Entity
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    @Cascade({CascadeType.PERSIST})
    private List<Review> reviewList;
    @OneToOne(mappedBy = "user")
    @Cascade({CascadeType.PERSIST})
    private Address address;

}
