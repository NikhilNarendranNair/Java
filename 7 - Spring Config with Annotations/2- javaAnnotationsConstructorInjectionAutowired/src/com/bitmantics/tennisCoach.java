package com.bitmantics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("theTennisCoach")
public class tennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public tennisCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your back-hand Volley for 30 mins";
		
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
		
	}

}
