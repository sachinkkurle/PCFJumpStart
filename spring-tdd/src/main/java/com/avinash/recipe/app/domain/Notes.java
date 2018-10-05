package com.avinash.recipe.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import lombok.*;


@Entity
@Data
@EqualsAndHashCode(exclude ={"recipe"})
public class Notes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private Recipe recipe;
	@Lob
	private String recipeNotes;
	
}
