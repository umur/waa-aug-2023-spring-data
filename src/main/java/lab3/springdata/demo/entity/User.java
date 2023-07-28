package lab3.springdata.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    private long id;
   private String email;
   private String password;

   private String firstName;
   private String lastName;

   @OneToMany
    private List<Review> reviews;

   @OneToOne(mappedBy = "user")
    private Address address;

}
