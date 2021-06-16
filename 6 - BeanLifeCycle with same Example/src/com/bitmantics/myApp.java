package com.bitmantics;

public class myApp {

	public static void main(String[] args) {
		
		//Coach theCoach = new BasketballCoach();
		Coach theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());
		
	}

}
