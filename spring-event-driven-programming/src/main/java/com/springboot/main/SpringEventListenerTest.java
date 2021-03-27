package com.springboot.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springboot.publisher.POSMachine;

public class SpringEventListenerTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.springboot.*");
		POSMachine posMachine = context.getBean(POSMachine.class);
		posMachine.withdrawAndSandNotification("98877834343", "1000");
	}

}
