package com.parimal.spring.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		//sterotype annotations are @Component, @Repository, @service, @Controller
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/parimal/spring/sterotype/sterotypeconfig.xml");
		
		Student student = context.getBean("s1",Student.class);
		
		System.out.println(student);
	}
}
