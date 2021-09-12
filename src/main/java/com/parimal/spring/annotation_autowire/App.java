package com.parimal.spring.annotation_autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.parimal.spring.annotation_autowire.pojo.Animal;

public class App {
	
	public static void main(String[] args) {
	
/*		
	@Autowired annotation for autowiring is ised in 3 ways
	1.with property
	2.with setter method 
	3.with constructor (It is default, work without annotaion also)
	
	
	enable annotaion processing by <context:annotation-config />
	*/
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/parimal/spring/annotation_autowire/autowireconfig.xml");
	
			Animal animal = context.getBean("animal",Animal.class);
			
			System.out.println(animal);
}
	}
