package com.parimal.xmlconfiguration.pojo;

public class Employee {
	
	int empid;
	String fname;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fname=" + fname + "]";
	}

	
}
