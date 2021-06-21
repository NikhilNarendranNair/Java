package com.bitmantics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("theTennisCoach")
public class tennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*
	 * @Autowired 
	 * public tennisCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */
	
	/*
	 * @Autowired 
	 * public void setFortuneService(FortuneService theFortuneService) {
	 * System.out.println("We are inside the setFortuneService Method");
	 * fortuneService = theFortuneService; }
	 */
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your back-hand Volley for 30 mins";
		
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
		
	}

}
