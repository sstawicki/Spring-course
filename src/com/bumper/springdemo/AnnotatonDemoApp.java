package com.bumper.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotatonDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml"); 
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();

	}

}
