package com.bumper.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 15 minuts on breakfast";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
