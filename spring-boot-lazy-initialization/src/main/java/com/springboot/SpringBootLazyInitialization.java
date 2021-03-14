package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.springboot.beans.Robot;

//@Configuration
//@ComponentScan(basePackages = {"com.springboot.*"})
@PropertySource("classpath:app-config.properties")
@SpringBootApplication
public class SpringBootLazyInitialization {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootLazyInitialization.class, args);
		Robot robot = context.getBean(Robot.class);
		robot.initialize();
	}

}
