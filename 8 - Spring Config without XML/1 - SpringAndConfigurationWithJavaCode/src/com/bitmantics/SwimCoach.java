package com.bitmantics;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {

		return "Swim for 15 mins in butterfly style";
		
	}

	@Override
	public String getFortune() {

		return fortuneService.getFortune();
		
	}

}
