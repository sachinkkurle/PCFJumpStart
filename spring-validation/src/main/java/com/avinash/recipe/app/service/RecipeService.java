package com.avinash.recipe.app.service;

import java.util.Set;

import com.avinash.recipe.app.commands.RecipeCommand;
import com.avinash.recipe.app.domain.Recipe;

public interface RecipeService {
	Set<Recipe> getRecipes();
    Recipe findById(Long l);
    
    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);
     void deleteById(Long idToDelete);

}
