package com.example.demo.model;

public class Service {

	private String name;
	private String Description;
	public Service() {
		super();
		//TODO Auto-generated constructor stub
	}
	public Service(String name, String description) {
		super();
		this.name = name;
		Description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
}
