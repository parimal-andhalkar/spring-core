package com.parimal.xmlconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.parimal.spring.lifecycle.pojo.Samosa;
import com.parimal.xmlconfiguration.pojo.Car;
import com.parimal.xmlconfiguration.pojo.Employee;
import com.parimal.xmlconfiguration.pojo.Machine;
import com.parimal.xmlconfiguration.pojo.Person;
import com.parimal.xmlconfiguration.pojo.Student;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/parimal/xmlconfiguration/config.xml");
        
        Student student = context.getBean("student",Student.class);
        
        //p-schema example
        Employee emp = context.getBean("emp",Employee.class);
        
        //Constructor injection
        Person person = context.getBean("person",Person.class);
        
        
        //Reference Type 
        Machine machine = context.getBean("machine",Machine.class);
        
        //Collection types
        Car car = context.getBean("car",Car.class);
        
        System.out.println("\n----------------------Setter injection--------------------------------------\n\n");
        System.out.println(student);
        
        System.out.println("\n----------------------P schema using settor--------------------------------------\n\n");
        
        System.out.println(emp);
        System.out.println("\n----------------------constructor injection--------------------------------------\n\n");
        
        System.out.println(person);
        System.out.println("\n----------------------Reference Type--------------------------------------\n\n");
        System.out.println(machine);
        
        System.out.println("\n----------------------Collection Type--------------------------------------\n\n");
        
        System.out.println("name "+ car.getName());
        System.out.println("colors "+ car.getColors());
        System.out.println("models "+ car.getModel());
        System.out.println("price "+ car.getPrices());
        
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(int i=0;i<beanDefinitionNames.length;i++)
        {
        	System.out.println(beanDefinitionNames);
        }
        
    }
}
