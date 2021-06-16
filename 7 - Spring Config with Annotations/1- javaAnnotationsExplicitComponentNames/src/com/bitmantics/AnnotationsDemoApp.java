package com.bitmantics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("theTennisCoach" , Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	
	}
}
