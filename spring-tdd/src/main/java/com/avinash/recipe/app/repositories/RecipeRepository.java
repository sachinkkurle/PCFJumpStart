package com.avinash.recipe.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.avinash.recipe.app.domain.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
