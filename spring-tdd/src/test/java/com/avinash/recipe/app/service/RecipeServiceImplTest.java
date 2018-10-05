package com.avinash.recipe.app.service;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.avinash.recipe.app.domain.Recipe;
import com.avinash.recipe.app.repositories.RecipeRepository;

public class RecipeServiceImplTest {

	RecipeServiceImpl recipeServiceImpl;
	@Mock
	RecipeRepository recipeRepository;

	@Before
	public void Setup() {
		MockitoAnnotations.initMocks(this);
		recipeServiceImpl = new RecipeServiceImpl(recipeRepository);

	}

	@Test
	public void getRecipes() {
		Recipe recipe = new Recipe();
		HashSet receipeData = new HashSet();
		receipeData.add(recipe);
		when(recipeServiceImpl.setRecipe()).thenReturn(receipeData);
         
		Set<Recipe> reciped = recipeServiceImpl.setRecipe();
		assertEquals(reciped.size(), 1);
		verify(recipeRepository, times(1)).findAll();
	}

}
