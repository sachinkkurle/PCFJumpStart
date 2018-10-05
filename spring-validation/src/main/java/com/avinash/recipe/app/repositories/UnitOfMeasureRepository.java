package com.avinash.recipe.app.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.avinash.recipe.app.domain.*;

@Repository
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{
	Optional<UnitOfMeasure> findByDescription(String description);

}
