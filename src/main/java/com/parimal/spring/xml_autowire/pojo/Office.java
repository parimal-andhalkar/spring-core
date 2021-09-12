package com.parimal.spring.xml_autowire.pojo;

public class Office {

	int id;
	String name;
	Address address;	
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Office [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
	
}
