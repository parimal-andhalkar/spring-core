package com.parimal.xmlconfiguration.pojo;

public class Person {
	
	private int id;
	private String fname;
	private String lname;
	
	
	public Person(int id, String fname, String lname) {
		
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
	
	
	

}
