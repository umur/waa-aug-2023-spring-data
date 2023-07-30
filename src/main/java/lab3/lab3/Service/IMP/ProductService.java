package lab3.lab3.Service.IMP;

import jakarta.transaction.Transactional;
import lab3.lab3.Model.Category;
import lab3.lab3.Model.Product;
import lab3.lab3.Repository.ProductRepo;
import lab3.lab3.Service.IproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IproductService {
    @Autowired
    private ProductRepo productRepo;


    @Override
    public void save(Product product) {
        System.out.println(product);
//        product.getReviewList().forEach(review->{
//          review.setProduct(product);
//        });
        productRepo.save(product);
    }

    @Override
    public List<Product> GetAllProduct() {
        return productRepo.findAll();
    }

    @Transactional
    @Override
    public Product getProductById(int id) {

        Product product= productRepo.findById(id).get();
        product.setId(23);
        return product;
    }

    @Override
    public void deleteProductById(int id) {
         productRepo.deleteById(id);
    }

    @Override
    public void updatePeroduct(int id, Product product) {
        Product productToUpdate = productRepo.findById(id).get();
        productToUpdate = product;
        productRepo.save(productToUpdate);
    }

    @Override
    public List<Product> getProductsByPriceGreaterThan(double price) {
     return productRepo.findProductsByPriceGreaterThan(price);

    }

    @Override
    public List<Product> getProductByCategoryAndPriceIsLessThan(int categoryId, double price) {
        return productRepo.findProductsByCategoryIdAndPriceLessThan( categoryId,  price);
    }

    @Override
    public List<Product> getProductsByNameIsContaining(String name) {
        return productRepo.findProductsByNameIsContaining(name);
    }


}
