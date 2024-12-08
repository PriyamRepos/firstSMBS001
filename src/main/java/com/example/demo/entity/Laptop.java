package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class Laptop {

	@Id
	private String id;
	private String model;
	private String price;
	@OneToOne(mappedBy = "laptop")
	Student student;
	public Laptop(String id, String model, String price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
	}
	

	
}
