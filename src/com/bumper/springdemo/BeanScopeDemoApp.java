package com.bumper.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theCoachTwo = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == theCoachTwo);
		System.out.println("\n Pointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach" + theCoach);
		System.out.println("\nMemory location for theCoachTwo" + theCoachTwo + "\n");

		context.close();
	}

}
