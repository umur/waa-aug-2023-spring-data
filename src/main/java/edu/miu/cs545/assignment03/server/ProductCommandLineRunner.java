package edu.miu.cs545.assignment03.server;

import edu.miu.cs545.assignment03.entity.*;
import edu.miu.cs545.assignment03.repository.*;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductCommandLineRunner implements CommandLineRunner {

    private final ModelMapper modelMapper;
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final AddressRepository addressRepository;
    private final ReviewRepository reviewRepository;

//    @Autowired
//    public ProductCommandLineRunner(ModelMapper modelMapper, CategoryRepository categoryRepository) {
//        this.modelMapper = modelMapper;
//        this.categoryRepository = categoryRepository;
//    }


    @Override
    public void run(String... args) throws Exception {

       //List<CategoryDto> categoriesDto = new ArrayList<>();
       Category category1 = new Category("Electronics");
       Category category2 = new Category("Clothing");
       Category category3 = new Category("Home & Kitchen");

//       categoriesDto.addAll(Arrays.asList(categoryDto1,categoryDto2,categoryDto3,categoryDto4));
//       List<Category> categories = new ArrayList<>();
//       categoriesDto.forEach(categoryDto -> {
//            Category category = modelMapper.map(categoryDto, Category.class);
//            categories.add(category);
//        });

        List<Product> products = new ArrayList<>();
        Product products1 = new Product("Smartphone", 599.99, category1);
        Product products2  = new Product("Laptop", 1099.99, category1);
        Product products3 = new Product("T-Shirt", 29.99, category2);
        Product products4 = new Product("Coffee Maker", 49.99, category3);

//        category1.addProduct(products1);
//        category1.addProduct(products2);
//        category2.addProduct(products3);
//        category3.addProduct(products4);

        User user1 = new User("jack@gmail.com", "123", "Jack", "jacks");
        User user2 = new User("john@gmail.com", "123", "John", "Johns");

        Address address1 = new Address("123 Main Street",52556,"Fairfield",user1);
        Address address2 = new Address("456 Elm Avenue",52557,"Fairfield",user2);

        Review review1 = new Review("Good product", products1,user1);
        Review review2 = new Review("ad service", products2,user2);


        categoryRepository.save(category1);
        categoryRepository.save(category2);
        categoryRepository.save(category3);

        productRepository.save(products1);
        productRepository.save(products2);
        productRepository.save(products3);
        productRepository.save(products4);


        userRepository.saveAll(Arrays.asList(user1,user2));
        addressRepository.saveAll(Arrays.asList(address1,address2));

        reviewRepository.saveAll(Arrays.asList(review1,review2));


//        Product product = new Product();
//        product.setName("ProductA");
//        product.setPrice(10.5);

        //repo.save(product);

    }
}
