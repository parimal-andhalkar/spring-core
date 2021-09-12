package com.parimal.spring.xml_autowire.pojo;

public class College {

	int id;
	String name;
	
	Department dept;

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

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	
	
}
