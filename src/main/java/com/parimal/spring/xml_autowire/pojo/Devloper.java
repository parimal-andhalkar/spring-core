package com.parimal.spring.xml_autowire.pojo;

public class Devloper {

	Language language;
	Project project;
	
	public Devloper(Language l, Project p) {
		language = l;
		project = p;
	}



	@Override
	public String toString() {
		return "Devloper [language=" + language + ", prj=" + project + "]";
	}



	public Project getPrj() {
		return project;
	}



	public Language getLanguage() {
		return language;
	}
	
	
	

}
