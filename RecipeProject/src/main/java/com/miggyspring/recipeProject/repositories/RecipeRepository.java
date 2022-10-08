package com.miggyspring.recipeProject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.miggyspring.recipeProject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
