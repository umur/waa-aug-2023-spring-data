package lab3.lab3.Service;

import lab3.lab3.Model.Category;

import java.util.List;

public interface IcategoryService {

    public void save(Category category);
    public Category getCategoryById(int id);
    public List<Category> getAll();
    public void deletCategory(int id);
public void deleteAll();


}
