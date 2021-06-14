package com.bitmantics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FootballCoach theCoach = context.getBean("myFootballCoach",FootballCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getFortune());
		
		context.close();

	}

}
