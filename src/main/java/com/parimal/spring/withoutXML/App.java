package com.parimal.spring.withoutXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.parimal.spring.withoutXML.BeanPojo.Company;
import com.parimal.spring.withoutXML.BeanPojo.Manager;
import com.parimal.spring.withoutXML.pojo.Guard;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class, ForBeanDefination.class);

		Guard guard = context.getBean("guard", Guard.class);
		System.out.println(guard.activity());

		Manager manager = context.getBean("getManager", Manager.class);
		System.out.println(manager.name());
		
		Company company = context.getBean("company", Company.class);

		System.out.println(company.getManager().mangaerDepartMent());
	}
}
