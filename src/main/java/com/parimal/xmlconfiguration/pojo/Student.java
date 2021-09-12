package com.parimal.xmlconfiguration.pojo;

public class Student {
	
	private int rollno;
	private String fname;
	private String lname;
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		System.out.println("Setting firstname");
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		System.out.println("Setting Lastname");
		this.lname = lname;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", fname=" + fname + ", lname=" + lname + "]";
	}

	
}
