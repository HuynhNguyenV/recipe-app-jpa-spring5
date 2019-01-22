package com.softech.recipeappjpaspring5.repositories;

import com.softech.recipeappjpaspring5.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
