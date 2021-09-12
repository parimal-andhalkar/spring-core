package com.parimal.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.parimal.spring.lifecycle.pojo.Pepsi;
import com.parimal.spring.lifecycle.pojo.Samosa;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/parimal/spring/lifecycle/lifecycleconfig.xml");
		
		context.registerShutdownHook();
		
		Samosa samosa = context.getBean("samosa",Samosa.class);
		
		Pepsi pepsi = context.getBean("pepsi",Pepsi.class);
		
		
	//	System.out.println("Samosa :"+samosa);
	//	System.out.println("Pepsi :"+pepsi);
		
		
	}
}
