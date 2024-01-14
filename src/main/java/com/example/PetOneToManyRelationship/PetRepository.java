package com.example.PetOneToManyRelationship;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pet4", path = "pet4")
public interface PetRepository extends JpaRepository<Pet4, Long>{

}
