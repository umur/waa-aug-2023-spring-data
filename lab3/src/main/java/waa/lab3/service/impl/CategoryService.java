package waa.lab3.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.lab3.domain.Address;
import waa.lab3.domain.Category;
import waa.lab3.dto.AddressDto;
import waa.lab3.dto.CategoryDto;
import waa.lab3.repository.ICategoryRepository;
import waa.lab3.service.ICategoryService;

import java.util.ArrayList;
import java.util.List;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<CategoryDto> getAll() {
        var entityList= categoryRepository.findAll();
        List<CategoryDto> dtoList = new ArrayList<>();
        entityList.forEach(entity->{
            var dto= modelMapper.map(entity,CategoryDto.class);
            dtoList.add(dto);
        });
        return dtoList;
    }

    @Override
    public CategoryDto getById(int id) {
        var entity=categoryRepository.findById(id);
        return modelMapper.map(entity,CategoryDto.class);
    }

    @Override
    public void deleteById(int id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public void save(CategoryDto categoryDto) {
        var entity= modelMapper.map(categoryDto, Category.class);
        categoryRepository.save(entity);
    }

    @Override
    public void update(int id, CategoryDto categoryDto) {
        Category entity= categoryRepository.findById(id).orElse(null);
        modelMapper.map(categoryDto,entity);
        assert entity != null;
        categoryRepository.save(entity);
    }
}
