package edu.miu.cs545.assignment03.controller;


import edu.miu.cs545.assignment03.dto.CategoryDto;
import edu.miu.cs545.assignment03.server.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {


    private final CategoryService service;


    @GetMapping
    public List<CategoryDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public CategoryDto getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping()
    public void create(@RequestBody CategoryDto dto) {
        service.create(dto);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody CategoryDto dto, @PathVariable Long id) {
        service.update(dto, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }


}
