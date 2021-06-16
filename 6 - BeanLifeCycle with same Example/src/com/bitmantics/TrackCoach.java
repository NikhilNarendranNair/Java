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
	
	public void initializationMethodTesting() {
		System.out.println("We are in the init method of Bean Life Cycle");
	}

	public void destroyMethodTesting() {
		System.out.println("We are in the destroy method of Bean Life Cycle");
	}
	@Override
	public String getFortune() {
		return "Go ahead : " + fortuneService.getFortune();
	}

}
