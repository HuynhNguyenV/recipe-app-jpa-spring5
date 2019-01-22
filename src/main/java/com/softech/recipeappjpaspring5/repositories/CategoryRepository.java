package com.softech.recipeappjpaspring5.repositories;

import com.softech.recipeappjpaspring5.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
