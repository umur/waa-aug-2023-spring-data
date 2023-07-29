package miu.waa.lab3.controller;

import lombok.RequiredArgsConstructor;
import miu.waa.lab3.dto.ReviewDto;
import miu.waa.lab3.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/reviews")
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping
    public List<ReviewDto> getAll(){
        return reviewService.getAll();
    }

    @PostMapping
    public void create(@RequestBody ReviewDto addressDto){
        reviewService.create(addressDto);
    }

    @GetMapping("/{id}")
    public ReviewDto read(@PathVariable int id){
        return reviewService.read(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id,@RequestBody ReviewDto addressDto){
        reviewService.update(id, addressDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        reviewService.delete(id);
    }
}
