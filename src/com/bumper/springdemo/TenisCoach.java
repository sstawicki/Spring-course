package com.bumper.springdemo;

import org.springframework.stereotype.Component;

public class TenisCoach implements Coach {
	
private FortuneService fortuneService;
	
	public TenisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 10K";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
