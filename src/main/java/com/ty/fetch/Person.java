package com.ty.fetch;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	int age;
	
	Person (@Value(value="19" )int age)
	{
		this.age=age;
	}
	
	void display()
	{
		System.out.println("age is : "+age);
	}
}
