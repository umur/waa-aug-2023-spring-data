package miu.waa.lab3.dto;

import lombok.Getter;
import lombok.Setter;
import miu.waa.lab3.entity.Product;
import miu.waa.lab3.entity.User;

@Getter
@Setter
public class ReviewDto {
    private int id;
    private String comment;
    private Product product;
    private User user;
}
