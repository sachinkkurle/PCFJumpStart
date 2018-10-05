package com.avinash.recipe.app.service;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.avinash.recipe.app.domain.UnitOfMeasure;
import com.avinash.recipe.app.repositories.UnitOfMeasureRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasurementRespositoryIT {

	@Autowired
	UnitOfMeasureRepository unitOfMeasureRepository;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	@DirtiesContext
	public void findDescription() {
		Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");
		assertEquals("Teaspoon",unitOfMeasure.get().getDescription());
	}

	@Test
	public void findDescriptionCup() {
		Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Cup");
		assertEquals("Cup",unitOfMeasure.get().getDescription());
	}
}
