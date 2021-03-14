package com.springboot;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springboot.beans.Robot;

@Configuration
@ComponentScan(basePackages = {"com.springboot.*"})
@PropertySource("classpath:app-config.properties")
public class SpringBootLazyInitializationWithBuilderApi {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringBootLazyInitializationWithBuilderApi.class);
		builder.lazyInitialization(true);
		ApplicationContext context = builder.build().run(args);
		Robot robot = context.getBean(Robot.class);
		robot.initialize();
	}

}
