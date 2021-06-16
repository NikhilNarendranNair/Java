package com.bitmantics;

import org.springframework.stereotype.Component;

@Component("theTennisCoach")
public class tennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice your back-hand Volley for 30 mins";
		
	}

}
