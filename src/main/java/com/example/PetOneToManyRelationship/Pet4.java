package com.example.PetOneToManyRelationship;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Pet4 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Pet name can not be blank")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person1 person1;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person1 getPerson1() {
		return person1;
	}

	public void setPerson1(Person1 person1) {
		this.person1 = person1;
	}
	
	
}
