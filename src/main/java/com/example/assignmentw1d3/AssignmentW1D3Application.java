package com.example.assignmentw1d3;

import com.example.assignmentw1d3.entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AssignmentW1D3Application implements Runnable{

    public static void main(String[] args) {
        SpringApplication.run(AssignmentW1D3Application.class, args);

    }

    @Override
    public void run() {
//        List<Product> products = productRepo.findByCategoryName("Electronics");
    }
}
