package com.bitmantics;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;

	public FootballCoach() {
		
	}
	
	public FootballCoach(FortuneService fortuneService) {
		super();
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
