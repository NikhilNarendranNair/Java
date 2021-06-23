package com.bitmantics;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String userEmail;

	@Value("${foo.name}")
	private String userName;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {

		return "Swim for 15 mins in butterfly style and your email id is :"+userEmail+" and your name is :"+userName;
		
	}

	@Override
	public String getFortune() {

		return fortuneService.getFortune();
		
	}

}
