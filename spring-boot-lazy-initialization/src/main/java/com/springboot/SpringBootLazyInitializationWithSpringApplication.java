package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.springboot.beans.Robot;

@SpringBootApplication
@PropertySource("classpath:app-config.properties")
public class SpringBootLazyInitializationWithSpringApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringBootLazyInitializationWithSpringApplication.class);
		application.setLazyInitialization(true);
		ApplicationContext context = application.run(args);
		Robot robot = context.getBean(Robot.class);
		robot.initialize();
	}

}
