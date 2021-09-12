package com.parimal.spring.withoutXML.pojo;

import org.springframework.stereotype.Component;

@Component("guard")
public class Guard {

	
	public String activity()
	{
		return "Guard is sleeping";
	}
}
