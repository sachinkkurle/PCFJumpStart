package com.avinash.recipe.app.domain;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CategoryTest {
   
	 Category category;
	
	 @Before
	 public void setup()
	 {
		 category = new Category();
	 }
	 
	@Test
	public void test() {
	//	fail("Not yet implemented");
	}
	
	@Test
	public void getId()
	{
		category.setId(4L);
		assertEquals(Long.valueOf(4) , category.getId());
		
	}
	
	@Test
	public void getDescription()
	{}
	
	@Test
	public void getReceipes(){}

}


