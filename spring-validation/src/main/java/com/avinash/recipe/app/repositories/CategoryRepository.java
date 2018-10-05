package com.avinash.recipe.app.repositories;

import java.util.Optional;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.avinash.recipe.app.domain.*;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	
	
	Optional<Category> findByDescription(String description);

}
