package com.miggyspring.recipeProject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.miggyspring.recipeProject.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
