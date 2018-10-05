package com.avinash.recipe.app.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;
import static  org.mockito.Matchers.*;
import com.avinash.recipe.app.service.RecipeService;
import com.avinash.recipe.app.domain.*;

public class IndexControllerTest {

	@Mock
	RecipeService receipeService;
	@Mock
	Model model;
	
	IndexController indexController;
	
	@Before
	public void Setup()
	{
		MockitoAnnotations.initMocks(this);
		
		indexController = new IndexController(receipeService);
		
		
	}
	
	
	@Test
	public void testMockMvc() throws Exception{
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
		mockMvc.perform(get("/"))
		.andExpect(status().isOk())
		.andExpect(view().name("index"));
		
	}
	
	@Test
	public void getIndexPage()
	{
		Set<Recipe> recipe1s = new HashSet<>();
		recipe1s.add(new Recipe());
		Recipe recupe =  new Recipe();
		recupe.setId(1L);
		recipe1s.add(recupe);
		
		when(receipeService.getRecipes()).thenReturn(recipe1s);
		
		
		ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);
		
		String viewName = indexController.getIndexPage(model);
		assertEquals("index",viewName);
		verify(receipeService, times(1)).getRecipes();
		verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());
		
		Set<Recipe> setInController = argumentCaptor.getValue();
		assertEquals(2,setInController.size());
		
		
	}

}
