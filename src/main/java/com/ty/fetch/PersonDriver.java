package com.ty.fetch;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonDriver
{
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(my_config.class);
		
		Person person = (Person) context.getBean("person");
		
		person.display();
	}

}
