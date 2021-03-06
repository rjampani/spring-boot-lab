package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.beans.Robot;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		Robot robot = context.getBean(Robot.class);
		robot.initializeRobot();
	}
}
