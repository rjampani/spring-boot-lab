package com.springboot.banner;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

public class AppBanner implements Banner{

	@Override
	public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
		out.println("#################################################");
		out.println("@@@          SpringBoot Application           @@@");
		out.println("#################################################");
		out.println(environment.getProperty("application.title"));
		out.println(environment.getProperty("application.version"));
		out.println(environment.getProperty("spring-boot.version"));
		out.println(environment.getProperty("spring-boot.formatted-version"));
		out.println(environment.getProperty("project.version"));
	}

}
