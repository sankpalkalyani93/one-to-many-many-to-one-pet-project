package com.example.PetOneToManyRelationship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PetOneToManyRelationshipApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetOneToManyRelationshipApplication.class, args);
	}

}
