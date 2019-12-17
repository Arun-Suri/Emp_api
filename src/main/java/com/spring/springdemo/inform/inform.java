package com.spring.springdemo.inform;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.RestController;

@Entity
public class inform {
	@Id
	String id;
	String name;
	String description;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public inform() {
		
	}
	public inform(String id, String name, String description) {
		
		this.id = id;
		this.name = name;
		this.description = description;
	}
		
	

	}


