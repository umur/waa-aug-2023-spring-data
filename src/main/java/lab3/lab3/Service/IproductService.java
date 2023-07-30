package lab3.lab3.Service;

import lab3.lab3.Model.Category;
import lab3.lab3.Model.Product;

import java.util.List;

public interface IproductService {
    public void save(Product product);
    public List<Product> GetAllProduct();
    public Product getProductById(int id);
    public void deleteProductById(int id);

    public void updatePeroduct(int id, Product product);



    public List<Product> getProductsByPriceGreaterThan(double price);
    public List<Product> getProductByCategoryAndPriceIsLessThan(int categoryId, double price) ;

    public List<Product> getProductsByNameIsContaining(String name);



}
