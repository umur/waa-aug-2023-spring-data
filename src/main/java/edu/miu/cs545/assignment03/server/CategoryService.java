package edu.miu.cs545.assignment03.server;

import edu.miu.cs545.assignment03.dto.CategoryDto;
import edu.miu.cs545.assignment03.entity.Category;
import edu.miu.cs545.assignment03.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repo;
    private final ModelMapper mapper;

    public List<CategoryDto> getAll() {
        var entities = repo.findAll();
        List<CategoryDto> categoryDtoList = new ArrayList<>();
        entities.forEach(entity ->{
        //System.out.println(entity);
            CategoryDto dto = mapper.map(entity, CategoryDto.class);
            categoryDtoList.add(dto);
        });
        return categoryDtoList;

    }

    public CategoryDto getById(Long id){
        var entity = repo.findById(id);
        return mapper.map(entity, CategoryDto.class);
    }

    public void create(CategoryDto dto) {
        var entity = mapper.map(dto, Category.class);
        repo.save(entity);
    }

    public void update(CategoryDto dto, Long id) {
        var categoryOptional = repo.findById(id);
        if(categoryOptional.isPresent()){
            var entity = categoryOptional.get();
            entity.setName(dto.getName());
            repo.save(entity);
        }
    }

    public void delete(Long id) {
        var entityOptional = repo.findById(id);
        if(entityOptional.isPresent()){
           repo.deleteById(id);
        }
    }
}
