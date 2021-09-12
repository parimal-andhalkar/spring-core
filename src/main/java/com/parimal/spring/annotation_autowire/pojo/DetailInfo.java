package com.parimal.spring.annotation_autowire.pojo;

public class DetailInfo {

	int id;
	String name;
	String diet;
	
	
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
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	@Override
	public String toString() {
		return "DetailInfo [id=" + id + ", name=" + name + ", diet=" + diet + "]";
	}
	
	
	
}
