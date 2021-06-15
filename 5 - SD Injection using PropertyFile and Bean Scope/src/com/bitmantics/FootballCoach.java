package com.bitmantics;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;

	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("We are inside the setter method : setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("We are inside the setter method : setTeam");
		this.team = team;
	}

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
