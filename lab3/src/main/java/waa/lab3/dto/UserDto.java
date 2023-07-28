package waa.lab3.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import waa.lab3.domain.Address;
import waa.lab3.domain.Review;

import java.util.List;


@Setter
@Getter
public class UserDto {
    private int userId;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    private List<Review> reviewList;
    @JsonIgnore
    private Address address;

}
