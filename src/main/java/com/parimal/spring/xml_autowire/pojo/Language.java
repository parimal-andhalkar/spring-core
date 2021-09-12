package com.parimal.spring.xml_autowire.pojo;

public class Language {
	
	private int id;
	private String name;
	
	
	@Override
	public String toString() {
		return "Language [id=" + id + ", name=" + name + "]";
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
	
	
	

}
