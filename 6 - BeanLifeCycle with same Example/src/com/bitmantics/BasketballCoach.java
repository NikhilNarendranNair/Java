package com.bitmantics;

public class BasketballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
		
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Bat for an hour daily";
		
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
	
	}
}
