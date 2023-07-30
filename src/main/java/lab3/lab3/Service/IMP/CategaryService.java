package lab3.lab3.Service.IMP;

import lab3.lab3.Model.Category;
import lab3.lab3.Repository.CategoryRepo;
import lab3.lab3.Service.IcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategaryService implements IcategoryService {
    @Autowired
    private CategoryRepo categoryRepo;
    @Override
    public void save(Category category) {
        categoryRepo.save(category);

    }

    @Override
    public Category getCategoryById(int id) {
        return categoryRepo.findById(id).get();
    }

    @Override
    public List<Category> getAll() {
        return categoryRepo.findAll();
    }

    @Override
    public void deletCategory(int id) {
categoryRepo.deleteById(id);
    }

    @Override
    public void deleteAll() {
        categoryRepo.deleteAll();
    }


}
