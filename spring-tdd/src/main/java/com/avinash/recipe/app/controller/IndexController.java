package com.avinash.recipe.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.avinash.recipe.app.bootstrap.RecipeBootstrap;
import com.avinash.recipe.app.domain.Category;
import com.avinash.recipe.app.domain.UnitOfMeasure;
import com.avinash.recipe.app.repositories.CategoryRepository;
import com.avinash.recipe.app.repositories.UnitOfMeasureRepository;
import com.avinash.recipe.app.service.RecipeService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j

public class IndexController {
	private final RecipeService recipeService;
	
	@Autowired
	public IndexController(final RecipeService recipeService){
		this.recipeService = recipeService;
	}
	
	
	@RequestMapping({ "", "/", "/index" })
	public String getIndexPage(Model model) {
		model.addAttribute("recipes", recipeService.setRecipe());
		log.debug("In index controller");
		return "index";
	}

}
