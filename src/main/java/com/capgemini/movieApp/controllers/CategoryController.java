package com.capgemini.movieApp.controllers;

import com.capgemini.movieApp.exceptions.NotFoundException;
import com.capgemini.movieApp.models.Category;
import com.capgemini.movieApp.models.Movie;
import com.capgemini.movieApp.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    @GetMapping("/{id}")
    public Category getCategory(@PathVariable Long id) {
        Category category = categoryRepository.findOneById(id);
        if(category== null) {
            throw new NotFoundException();
        }
        return category;
    }

    @GetMapping("/{id}/movies")
    public List<Movie> getMoviesCategory(@PathVariable Long id) {
        Category category = categoryRepository.findOneById(id);
        if(category== null) {
            throw new NotFoundException();
        }
        return category.getMovies();
    }



    @PostMapping
    public void addCategory(@RequestBody Category category){
        categoryRepository.save(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryRepository.deleteById(id);
    }
    @PutMapping
    public Category updateCategory (@RequestBody Category category) {
        if(category.getId() == null || categoryRepository.findOneById(category.getId()) == null) {
            throw new NotFoundException();
        }
        return categoryRepository.save(category);
    }
}
