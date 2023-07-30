package lab3.lab3.Controller;

import lab3.lab3.Model.Review;
import lab3.lab3.Service.IreviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    private IreviewService ireviewService;


    @PostMapping
    public void save(@RequestBody Review review){
        ireviewService.save(review);
    }

    @GetMapping
    public List<Review> getAll(){
      return  ireviewService.getAll();
    }
    @GetMapping("/{id}")
    private Review getReviewById(@PathVariable int id){
        return ireviewService.getReviewById(id);
    }

@GetMapping("product/{productId}")
public List<Review> findReviewByProductId(int productId){
        return ireviewService.findByProductId(productId);

}

}
