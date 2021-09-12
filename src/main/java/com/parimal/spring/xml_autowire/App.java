package com.parimal.spring.xml_autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.parimal.spring.xml_autowire.pojo.College;
import com.parimal.spring.xml_autowire.pojo.Devloper;
import com.parimal.spring.xml_autowire.pojo.Office;

public class App {
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/parimal/spring/xml_autowire/autowireconfig.xml");
	
	/*
 		In Spring, “Autowiring by Name” means, if the name of a bean is same as the name
  		of other bean property, auto wire it. 
  		For example, if a “Office” bean exposes an “address” property, Spring will find the “address” bean 
  		in current container and wire it automatically. And if no matching found, just do nothing.
	*/
	
			Office office = context.getBean("office",Office.class);
			System.out.println(office.getAddress());
			
	/*
			In Spring, “Autowiring by Type” means, if data type of a bean is compatible with the
			 data type of other bean property, auto wire it.

			 For example, a “College” bean exposes a property with data type of “Department” class, Spring will find the bean with same data type of
			 class “Department” and wire it automatically. And if no matching found, just do nothing.
		*/	
			
			College college = context.getBean("college",College.class);
			
			System.out.println(college.getDept());
			
			
		// autowire by constructor
			
			Devloper dev = context.getBean("dev",Devloper.class);
			System.out.println("Language :"+dev.getLanguage());
			System.out.println("Project :"+dev.getPrj());
			
	
	}

}
