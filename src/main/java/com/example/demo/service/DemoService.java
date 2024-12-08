package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Laptop;
import com.example.demo.entity.Student;
import com.example.demo.repository.DemoRepository;

@Service
public class DemoService {
    @Autowired
	DemoRepository repo;
	
	public String saveData() {
		
		Student s= new Student("Priyam", "1001", "Java FullStack");
		Laptop l= new Laptop("2002", "HP", "450$");
		s.setLaptop(l);
		Student save = repo.save(s);
		  if(save!=null)
			  return"STUDENT DATA AND LAPTOP DATA ARE SAVED SUCCESSFULLY!!!";
			  else
				  return "SOMETHING WENT WRONG!!!";
		
		
		
		
	}
	
	
}
