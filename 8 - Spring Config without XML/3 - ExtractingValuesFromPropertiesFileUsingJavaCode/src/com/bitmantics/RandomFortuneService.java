package com.bitmantics;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String data[]= { 
			"Hmmm....let's C, ohhh my, today is a bad day. But, don't give up",
			"Wonderful, you can strive today",
			"There won't be a better day than today"
	};
	
	private Random myrandom = new Random();
	
	@Override
	public String getFortune() {
		
		int index = myrandom.nextInt(data.length);
		return data[index];
		
	}

}
