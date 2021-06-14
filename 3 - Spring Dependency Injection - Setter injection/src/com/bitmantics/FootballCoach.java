package com.bitmantics;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;

	public FootballCoach() {
		System.out.println("We are inside the no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("We are inside the setter method : setFortuneService");
		this.fortuneService = fortuneService;
	}

 

	@Override
	public String getDailyWorkout() {
		return "Dribble for an hour";

	}

	@Override
	public String getFortune() {
		
		return "Go ahead : " + fortuneService.getFortune();
	}

}
