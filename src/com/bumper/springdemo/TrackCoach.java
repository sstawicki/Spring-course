package com.bumper.springdemo;

public class TrackCoach implements Coach {
	
private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	public void doMyStartupStuff() {
		System.out.println("TackCoach: inside method to startup");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("TackCoach: inside method to destroy");
	}

}
