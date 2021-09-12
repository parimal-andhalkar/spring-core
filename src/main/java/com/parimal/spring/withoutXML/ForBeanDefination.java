package com.parimal.spring.withoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.parimal.spring.withoutXML.BeanPojo.Company;
import com.parimal.spring.withoutXML.BeanPojo.Manager;

@Configuration
public class ForBeanDefination {

	
	
	@Bean
	public Manager getManager()
	{
		return new Manager();
	}
	
	@Bean("company")
	public Company getCompany() {
		
		return new Company(getManager());
	}
}
