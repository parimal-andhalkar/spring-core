package com.parimal.spring.withoutXML.BeanPojo;

public class Company {

	private Manager manager;

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Company(Manager manager) {
		
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Company [manager=" + manager + "]";
	}
	
	
	
}
