package com.teks.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//creates a object and manages it for student
public class Student {

	private int id;
	
	private String name;
	
	private String email;
	
	public Student() {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("email: "+email);
	}


	@Autowired //using the autowired annotation to connect to the Address object which is called Field dependency Injection 
	public void setAddress(Address address) {
		System.out.println("address: "+address);
		
	}	
	
}
