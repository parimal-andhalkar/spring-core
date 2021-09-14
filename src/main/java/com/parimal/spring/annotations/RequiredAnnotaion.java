package com.parimal.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredAnnotaion {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/parimal/spring/annotations/config.xml");
		
			Country country = context.getBean("CountryBean",Country.class);
			
			System.out.println(country.getCountryName());
			
			Capital capital = context.getBean("capital",Capital.class);
				
		    System.out.println(capital.getCapitalName());
	}

}
