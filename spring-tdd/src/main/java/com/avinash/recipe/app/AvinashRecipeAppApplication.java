package com.avinash.recipe.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.avinash"})
@EntityScan("com.avinash.recipe")
public class AvinashRecipeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvinashRecipeAppApplication.class, args);
	}
}
