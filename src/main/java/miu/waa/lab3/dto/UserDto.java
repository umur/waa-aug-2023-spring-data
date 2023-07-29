package miu.waa.lab3.dto;

import lombok.Getter;
import lombok.Setter;
import miu.waa.lab3.entity.Address;
import miu.waa.lab3.entity.Review;

import java.util.List;

@Getter
@Setter
public class UserDto {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private List<Review> reviews;
    private Address address;
}
