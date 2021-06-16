package com.bitmantics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		Coach theCoach = context.getBean("MyCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getFortune());

		context.close();
	}

}
