package com.example.lab3.controller;

import com.example.lab3.dto.ReviewDto;
import com.example.lab3.entity.Review;
import com.example.lab3.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping
    public List<ReviewDto> getAll(){

        System.out.println("Test");
        return reviewService.getAll();
    }

    @GetMapping("/product/{id}")
    List<ReviewDto>getAllByProductId(@PathVariable int id){
        return reviewService.getAllByProductId(id);
    }
    @GetMapping("/{id}")
    public ReviewDto getById(@PathVariable int id){
        return reviewService.getById(id);
    }



    @PostMapping
    public void save(@RequestBody ReviewDto dto){
        reviewService.save(dto);
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable int id){
        reviewService.delete(id);
    }

}
