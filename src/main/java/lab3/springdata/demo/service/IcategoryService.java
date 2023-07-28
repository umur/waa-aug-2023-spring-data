package lab3.springdata.demo.service;

import lab3.springdata.demo.entity.Category;

import java.util.List;

public interface IcategoryService {
  public void save(Category category)  ;

  public Category getCategoryById(long id);
  public List<Category> getAll();

  public void deletCategory(long id);

  public void updateCategory(long id ,Category category);
}
