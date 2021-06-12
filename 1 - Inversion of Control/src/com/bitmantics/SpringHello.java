package com.bitmantics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHello {

	public static void main(String[] args) {
		
		//Load the Spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from Spring Container
		Coach theCoach = context.getBean("MyCoach",Coach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
		
	}

}
