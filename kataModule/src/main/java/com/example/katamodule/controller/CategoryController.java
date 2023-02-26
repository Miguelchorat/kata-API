package com.example.katamodule.controller;

import com.example.katamodule.error.BeerNotFoundException;
import com.example.katamodule.error.CategoryNotFoundException;
import com.example.katamodule.error.StyleNotFoundException;
import com.example.katamodule.model.Category;
import com.example.katamodule.repos.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public List<Category> obtenerTodos() {
        List<Category> result = categoryRepository.findAll();
        if(result.isEmpty()){
            throw new CategoryNotFoundException();
        }
        return result;
    }

    @GetMapping("/category/{id}")
    public Category obtenerUno(@PathVariable Long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new CategoryNotFoundException(id));
    }
}
