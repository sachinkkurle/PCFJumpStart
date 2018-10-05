package com.avinash.recipe.app.service;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.avinash.recipe.app.commands.RecipeCommand;
import com.avinash.recipe.app.converters.RecipeCommandToRecipe;
import com.avinash.recipe.app.converters.RecipeToRecipeCommand;
import com.avinash.recipe.app.domain.Recipe;
import com.avinash.recipe.app.exceptions.NotFoundException;
import com.avinash.recipe.app.repositories.RecipeRepository;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
  private final  RecipeRepository recipeRepository;
  private final RecipeCommandToRecipe recipeCommandToRecipe;
  private final RecipeToRecipeCommand recipeToRecipeCommand;

  
  @Autowired
  public RecipeServiceImpl(final  RecipeRepository recipeRepository,
		  final RecipeCommandToRecipe recipeCommandToRecipe,
		  final RecipeToRecipeCommand recipeToRecipeCommand ){
	  this.recipeRepository = recipeRepository;
	  this.recipeCommandToRecipe = recipeCommandToRecipe;
	  this.recipeToRecipeCommand = recipeToRecipeCommand;
	  
  }
  
  
	@Override
	public Set<Recipe> getRecipes() {
		log.debug("inside the receipe class");
		// TODO Auto-generated method stub
		Set<Recipe> recipeSet = new HashSet<Recipe>();
		 recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
		return recipeSet;
	}


	@Override
    public Recipe findById(Long l) {

        Optional<Recipe> recipeOptional = recipeRepository.findById(l);

        if (!recipeOptional.isPresent()) {
            throw new NotFoundException("Recipe Not Found!");
        }

        return recipeOptional.get();
    }


    @Override
    @Transactional
    public RecipeCommand saveRecipeCommand(RecipeCommand command) {
        Recipe detachedRecipe = recipeCommandToRecipe.convert(command);

        Recipe savedRecipe = recipeRepository.save(detachedRecipe);
        log.debug("Saved RecipeId:" + savedRecipe.getId());
        return recipeToRecipeCommand.convert(savedRecipe);
    }


	@Override
	@Transactional
    public RecipeCommand findCommandById(Long l) {
        return recipeToRecipeCommand.convert(findById(l));
    }
	
    @Override
    public void deleteById(Long idToDelete) {
        recipeRepository.deleteById(idToDelete);
    }


	 
}
