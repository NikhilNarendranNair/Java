package com.bitmantics;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run atleast 5Kms";
	
	}

	@Override
	public String getFortune() {
		return "Go ahead : " + fortuneService.getFortune();
	}

}
