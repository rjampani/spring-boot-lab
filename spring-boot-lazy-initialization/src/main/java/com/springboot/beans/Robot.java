package com.springboot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	@Autowired
	protected Chip chip;
	
	public Robot() {
		System.out.println("robot object created...");
	}
	
	public void initialize() {
		System.out.println("Robot has initialized with chipId: " + chip.chipId + " and ramSize: " + chip.ramSize);
	}
}
