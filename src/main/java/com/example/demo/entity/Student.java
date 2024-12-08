package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Student {
	private String name;
	@Id
	private String id;
	private String course;
	@JoinColumn(name = "fk_laptop")
	@OneToOne(cascade = CascadeType.ALL)
	private Laptop laptop;
	public Student(String name, String id, String course) {
		super();
		this.name = name;
		this.id = id;
		this.course = course;
	}

	
	
	
	
	
	
	
	
	
	
}
