package com.bitmantics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach theCoach = context.getBean("MyCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("MyCoach", Coach.class);
		
		Coach TheCoach = context.getBean("MyCoachPrototype", Coach.class);
		
		Coach AlphaCoach = context.getBean("MyCoachPrototype", Coach.class);
		
		if(theCoach == alphaCoach) {
			System.out.println("Both objects are pointing to same memory location :"+ theCoach);
		}
		else {
			System.out.println("Wow, Eureka, they are not pointing to same memory location");
		}
		System.out.println("\n\n\nWe are now checking with bean scope = prototype \\n\\n\\n");
		if(TheCoach == AlphaCoach) {
			System.out.println("Both objects are pointing to same memory location :"+ theCoach);
		}
		else {
			System.out.println("Wow, Eureka, they are not pointing to same memory location");
		}
		context.close();
	}

}
