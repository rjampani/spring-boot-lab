package com.springboot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	@Autowired
	protected Chip chip;
	
	public void initializeRobot() {
		System.out.println("Robot has been initialized with: " + chip.chipId + " and with ramSize: " + chip.ramSize);
	}
}
