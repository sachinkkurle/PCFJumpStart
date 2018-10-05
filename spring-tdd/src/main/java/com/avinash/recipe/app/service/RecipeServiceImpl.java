package com.avinash.recipe.app.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avinash.recipe.app.domain.Recipe;
import com.avinash.recipe.app.repositories.RecipeRepository;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
  private final  RecipeRepository recipeRepository;
  
  @Autowired
  public RecipeServiceImpl(final  RecipeRepository recipeRepository){
	  this.recipeRepository = recipeRepository;
  }
  
  
	@Override
	public Set<Recipe> setRecipe() {
		log.debug("inside the receipe class");
		// TODO Auto-generated method stub
		Set<Recipe> recipeSet = new HashSet<Recipe>();
		 recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
		return recipeSet;
	}

}
