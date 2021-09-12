package com.parimal.spring.sterotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s1")
public class Student {

	@Value("10")
	int roll;
	
	@Value("ABC")
	String name;
	
	
	public int getRoll() {
		return roll;
	}


	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
	
	
}
