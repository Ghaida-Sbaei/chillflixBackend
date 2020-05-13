package com.capgemini.movieApp.repositories;

import com.capgemini.movieApp.models.Category;
import com.capgemini.movieApp.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByName(String name);
    Category findOneById(Long id);
}
