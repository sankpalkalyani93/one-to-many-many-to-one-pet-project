package com.example.PetOneToManyRelationship;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Person1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Name can not be blank")
	private String name;

	@NotBlank(message = "City can not be blank")
	private String city;

	@OneToMany(mappedBy = "person1", cascade = CascadeType.ALL)
	private List<Pet4> pet4;
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Pet4> getPet4() {
		return pet4;
	}
	public void setPet4(List<Pet4> pet4) {
		this.pet4 = pet4;
	}
	
	
}
