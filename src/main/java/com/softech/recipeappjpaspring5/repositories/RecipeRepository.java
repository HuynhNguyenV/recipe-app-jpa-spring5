package com.softech.recipeappjpaspring5.repositories;

import com.softech.recipeappjpaspring5.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
