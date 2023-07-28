package waa.lab3.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import waa.lab3.domain.User;


@Setter
@Getter
public class ReviewDto {
    private int reviewId;
    private String comment;
}
